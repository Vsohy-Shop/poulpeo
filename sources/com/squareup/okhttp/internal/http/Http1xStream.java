package com.squareup.okhttp.internal.http;

import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.p325io.RealConnection;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13145j0;
import okio.C13153n;
import okio.C13175w0;
import okio.C13179y0;
import okio.C13181z0;

public final class Http1xStream implements HttpStream {
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private HttpEngine httpEngine;
    /* access modifiers changed from: private */
    public final C13127d sink;
    /* access modifiers changed from: private */
    public final C13130e source;
    /* access modifiers changed from: private */
    public int state = 0;
    /* access modifiers changed from: private */
    public final StreamAllocation streamAllocation;

    private abstract class AbstractSource implements C13179y0 {
        protected boolean closed;
        protected final C13153n timeout;

        private AbstractSource() {
            this.timeout = new C13153n(Http1xStream.this.source.timeout());
        }

        public abstract /* synthetic */ void close();

        /* access modifiers changed from: protected */
        public final void endOfInput() {
            if (Http1xStream.this.state == 5) {
                Http1xStream.this.detachTimeout(this.timeout);
                int unused = Http1xStream.this.state = 6;
                if (Http1xStream.this.streamAllocation != null) {
                    Http1xStream.this.streamAllocation.streamFinished(Http1xStream.this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + Http1xStream.this.state);
        }

        public abstract /* synthetic */ long read(C13121c cVar, long j);

        public C13181z0 timeout() {
            return this.timeout;
        }

        /* access modifiers changed from: protected */
        public final void unexpectedEndOfInput() {
            if (Http1xStream.this.state != 6) {
                int unused = Http1xStream.this.state = 6;
                if (Http1xStream.this.streamAllocation != null) {
                    Http1xStream.this.streamAllocation.noNewStreams();
                    Http1xStream.this.streamAllocation.streamFinished(Http1xStream.this);
                }
            }
        }
    }

    private final class ChunkedSink implements C13175w0 {
        private boolean closed;
        private final C13153n timeout;

        private ChunkedSink() {
            this.timeout = new C13153n(Http1xStream.this.sink.timeout());
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                Http1xStream.this.sink.mo52486F("0\r\n\r\n");
                Http1xStream.this.detachTimeout(this.timeout);
                int unused = Http1xStream.this.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                Http1xStream.this.sink.flush();
            }
        }

        public C13181z0 timeout() {
            return this.timeout;
        }

        public void write(C13121c cVar, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1xStream.this.sink.mo52496L(j);
                Http1xStream.this.sink.mo52486F("\r\n");
                Http1xStream.this.sink.write(cVar, j);
                Http1xStream.this.sink.mo52486F("\r\n");
            }
        }
    }

    private class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        private final HttpEngine httpEngine;

        ChunkedSource(HttpEngine httpEngine2) {
            super();
            this.httpEngine = httpEngine2;
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                Http1xStream.this.source.mo52507U();
            }
            try {
                this.bytesRemainingInChunk = Http1xStream.this.source.mo52539q0();
                String trim = Http1xStream.this.source.mo52507U().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + AbstractDebugRequestMapper.QUOTE);
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    this.httpEngine.receiveHeaders(Http1xStream.this.readHeaders());
                    endOfInput();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    unexpectedEndOfInput();
                }
                this.closed = true;
            }
        }

        public long read(C13121c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = Http1xStream.this.source.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    private final class FixedLengthSink implements C13175w0 {
        private long bytesRemaining;
        private boolean closed;
        private final C13153n timeout;

        public void close() {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1xStream.this.detachTimeout(this.timeout);
                    int unused = Http1xStream.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.closed) {
                Http1xStream.this.sink.flush();
            }
        }

        public C13181z0 timeout() {
            return this.timeout;
        }

        public void write(C13121c cVar, long j) {
            if (!this.closed) {
                Util.checkOffsetAndCount(cVar.size(), 0, j);
                if (j <= this.bytesRemaining) {
                    Http1xStream.this.sink.write(cVar, j);
                    this.bytesRemaining -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        private FixedLengthSink(long j) {
            this.timeout = new C13153n(Http1xStream.this.sink.timeout());
            this.bytesRemaining = j;
        }
    }

    private class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                endOfInput();
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    unexpectedEndOfInput();
                }
                this.closed = true;
            }
        }

        public long read(C13121c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.bytesRemaining == 0) {
                return -1;
            } else {
                long read = Http1xStream.this.source.read(cVar, Math.min(this.bytesRemaining, j));
                if (read != -1) {
                    long j2 = this.bytesRemaining - read;
                    this.bytesRemaining = j2;
                    if (j2 == 0) {
                        endOfInput();
                    }
                    return read;
                }
                unexpectedEndOfInput();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    private class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        private UnknownLengthSource() {
            super();
        }

        public void close() {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    unexpectedEndOfInput();
                }
                this.closed = true;
            }
        }

        public long read(C13121c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = Http1xStream.this.source.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput();
                return -1;
            }
        }
    }

    public Http1xStream(StreamAllocation streamAllocation2, C13130e eVar, C13127d dVar) {
        this.streamAllocation = streamAllocation2;
        this.source = eVar;
        this.sink = dVar;
    }

    /* access modifiers changed from: private */
    public void detachTimeout(C13153n nVar) {
        C13181z0 a = nVar.mo52667a();
        nVar.mo52668b(C13181z0.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private C13179y0 getTransferStream(Response response) {
        if (!HttpEngine.hasBody(response)) {
            return newFixedLengthSource(0);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(this.httpEngine);
        }
        long contentLength = OkHeaders.contentLength(response);
        if (contentLength != -1) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public C13175w0 createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    public C13175w0 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public C13179y0 newChunkedSource(HttpEngine httpEngine2) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpEngine2);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public C13175w0 newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public C13179y0 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public C13179y0 newUnknownLengthSource() {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public ResponseBody openResponseBody(Response response) {
        return new RealResponseBody(response.headers(), C13145j0.m29739d(getTransferStream(response)));
    }

    public Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String U = this.source.mo52507U();
            if (U.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, U);
        }
    }

    public Response.Builder readResponse() {
        StatusLine parse;
        Response.Builder headers;
        int i = this.state;
        if (i == 1 || i == 3) {
            do {
                try {
                    parse = StatusLine.parse(this.source.mo52507U());
                    headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                } catch (EOFException e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (parse.code == 100);
            this.state = 4;
            return headers;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public Response.Builder readResponseHeaders() {
        return readResponse();
    }

    public void setHttpEngine(HttpEngine httpEngine2) {
        this.httpEngine = httpEngine2;
    }

    public void writeRequest(Headers headers, String str) {
        if (this.state == 0) {
            this.sink.mo52486F(str).mo52486F("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.mo52486F(headers.name(i)).mo52486F(": ").mo52486F(headers.value(i)).mo52486F("\r\n");
            }
            this.sink.mo52486F("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public void writeRequestBody(RetryableSink retryableSink) {
        if (this.state == 1) {
            this.state = 3;
            retryableSink.writeToSocket(this.sink);
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public void writeRequestHeaders(Request request) {
        this.httpEngine.writingRequestHeaders();
        writeRequest(request.headers(), RequestLine.get(request, this.httpEngine.getConnection().getRoute().getProxy().type()));
    }
}
