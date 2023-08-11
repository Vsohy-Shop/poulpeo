package okhttp3.internal.http1;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13153n;
import okio.C13175w0;
import okio.C13179y0;
import okio.C13181z0;

/* compiled from: Http1ExchangeCodec.kt */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    private final RealConnection connection;
    /* access modifiers changed from: private */
    public final HeadersReader headersReader;
    /* access modifiers changed from: private */
    public final C13127d sink;
    /* access modifiers changed from: private */
    public final C13130e source;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Headers trailers;

    /* compiled from: Http1ExchangeCodec.kt */
    private abstract class AbstractSource implements C13179y0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final C13153n timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new C13153n(http1ExchangeCodec.source.timeout());
        }

        public abstract /* synthetic */ void close();

        /* access modifiers changed from: protected */
        public final boolean getClosed() {
            return this.closed;
        }

        /* access modifiers changed from: protected */
        public final C13153n getTimeout() {
            return this.timeout;
        }

        public long read(C13121c cVar, long j) {
            C12775o.m28639i(cVar, "sink");
            try {
                return this.this$0.source.read(cVar, j);
            } catch (IOException e) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state != 6) {
                if (this.this$0.state == 5) {
                    this.this$0.detachTimeout(this.timeout);
                    this.this$0.state = 6;
                    return;
                }
                throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(this.this$0.state)));
            }
        }

        /* access modifiers changed from: protected */
        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public C13181z0 timeout() {
            return this.timeout;
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSink implements C13175w0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final C13153n timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new C13153n(http1ExchangeCodec.sink.timeout());
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                this.this$0.sink.mo52486F("0\r\n\r\n");
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                this.this$0.sink.flush();
            }
        }

        public C13181z0 timeout() {
            return this.timeout;
        }

        public void write(C13121c cVar, long j) {
            C12775o.m28639i(cVar, APIParams.SOURCE);
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                this.this$0.sink.mo52496L(j);
                this.this$0.sink.mo52486F("\r\n");
                this.this$0.sink.write(cVar, j);
                this.this$0.sink.mo52486F("\r\n");
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            C12775o.m28639i(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
        }

        private final void readChunkSize() {
            boolean z;
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.mo52507U();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.mo52539q0();
                String obj = C13755w.m31561N0(this.this$0.source.mo52507U()).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (obj.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || C13754v.m31525E(obj, ";", false, 2, (Object) null)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            OkHttpClient access$getClient$p = this.this$0.client;
                            C12775o.m28636f(access$getClient$p);
                            CookieJar cookieJar = access$getClient$p.cookieJar();
                            HttpUrl httpUrl = this.url;
                            Headers access$getTrailers$p = this.this$0.trailers;
                            C12775o.m28636f(access$getTrailers$p);
                            HttpHeaders.receiveHeaders(cookieJar, httpUrl, access$getTrailers$p);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C13121c cVar, long j) {
            boolean z;
            C12775o.m28639i(cVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C12775o.m28647q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
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
                long read = super.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long j) {
            super(http1ExchangeCodec);
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C13121c cVar, long j) {
            boolean z;
            C12775o.m28639i(cVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C12775o.m28647q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!getClosed()) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(cVar, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.bytesRemaining - read;
                    this.bytesRemaining = j3;
                    if (j3 == 0) {
                        responseBodyComplete();
                    }
                    return read;
                }
                this.this$0.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class KnownLengthSink implements C13175w0 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final C13153n timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
            this.timeout = new C13153n(http1ExchangeCodec.sink.timeout());
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 3;
            }
        }

        public void flush() {
            if (!this.closed) {
                this.this$0.sink.flush();
            }
        }

        public C13181z0 timeout() {
            return this.timeout;
        }

        public void write(C13121c cVar, long j) {
            C12775o.m28639i(cVar, APIParams.SOURCE);
            if (!this.closed) {
                Util.checkOffsetAndCount(cVar.size(), 0, j);
                this.this$0.sink.write(cVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            C12775o.m28639i(http1ExchangeCodec, "this$0");
            this.this$0 = http1ExchangeCodec;
        }

        public void close() {
            if (!getClosed()) {
                if (!this.inputExhausted) {
                    responseBodyComplete();
                }
                setClosed(true);
            }
        }

        public long read(C13121c cVar, long j) {
            boolean z;
            C12775o.m28639i(cVar, "sink");
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C12775o.m28647q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                responseBodyComplete();
                return -1;
            }
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, C13130e eVar, C13127d dVar) {
        C12775o.m28639i(realConnection, "connection");
        C12775o.m28639i(eVar, APIParams.SOURCE);
        C12775o.m28639i(dVar, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = eVar;
        this.sink = dVar;
        this.headersReader = new HeadersReader(eVar);
    }

    /* access modifiers changed from: private */
    public final void detachTimeout(C13153n nVar) {
        C13181z0 a = nVar.mo52667a();
        nVar.mo52668b(C13181z0.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return C13754v.m31530r("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final C13175w0 newChunkedSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink(this);
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    private final C13179y0 newChunkedSource(HttpUrl httpUrl) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    private final C13179y0 newFixedLengthSource(long j) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new FixedLengthSource(this, j);
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    private final C13175w0 newKnownLengthSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink(this);
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    private final C13179y0 newUnknownLengthSource() {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource(this);
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    public void cancel() {
        getConnection().cancel();
    }

    public C13175w0 createRequestBody(Request request, long j) {
        C12775o.m28639i(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (isChunked(request)) {
            return newChunkedSink();
        } else {
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public void flushRequest() {
        this.sink.flush();
    }

    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    public C13179y0 openResponseBodySource(Response response) {
        C12775o.m28639i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    public Response.Builder readResponseHeaders(boolean z) {
        boolean z2;
        int i = this.state;
        boolean z3 = false;
        if (i == 1 || i == 2 || i == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                int i2 = parse.code;
                if (i2 == 100) {
                    this.state = 3;
                    return headers;
                }
                if (102 <= i2 && i2 < 200) {
                    z3 = true;
                }
                if (z3) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                throw new IOException(C12775o.m28647q("unexpected end of stream on ", getConnection().route().address().url().redact()), e);
            }
        } else {
            throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
        }
    }

    public long reportedContentLength(Response response) {
        C12775o.m28639i(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0;
        }
        if (isChunked(response)) {
            return -1;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        C12775o.m28639i(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            C13179y0 newFixedLengthSource = newFixedLengthSource(headersContentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
        }
    }

    public Headers trailers() {
        boolean z;
        if (this.state == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        boolean z;
        C12775o.m28639i(headers, "headers");
        C12775o.m28639i(str, "requestLine");
        int i = this.state;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.sink.mo52486F(str).mo52486F("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.sink.mo52486F(headers.name(i2)).mo52486F(": ").mo52486F(headers.value(i2)).mo52486F("\r\n");
            }
            this.sink.mo52486F("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(C12775o.m28647q("state: ", Integer.valueOf(i)).toString());
    }

    public void writeRequestHeaders(Request request) {
        C12775o.m28639i(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        C12775o.m28638h(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return C13754v.m31530r("chunked", request.header("Transfer-Encoding"), true);
    }
}
