package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.net.ProtocolException;
import okio.C13121c;
import okio.C13175w0;
import okio.C13181z0;

public final class RetryableSink implements C13175w0 {
    private boolean closed;
    private final C13121c content;
    private final int limit;

    public RetryableSink(int i) {
        this.content = new C13121c();
        this.limit = i;
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            if (this.content.size() < ((long) this.limit)) {
                throw new ProtocolException("content-length promised " + this.limit + " bytes, but received " + this.content.size());
            }
        }
    }

    public long contentLength() {
        return this.content.size();
    }

    public C13181z0 timeout() {
        return C13181z0.NONE;
    }

    public void write(C13121c cVar, long j) {
        if (!this.closed) {
            Util.checkOffsetAndCount(cVar.size(), 0, j);
            if (this.limit == -1 || this.content.size() <= ((long) this.limit) - j) {
                this.content.write(cVar, j);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.limit + " bytes");
        }
        throw new IllegalStateException("closed");
    }

    public void writeToSocket(C13175w0 w0Var) {
        C13121c cVar = new C13121c();
        C13121c cVar2 = this.content;
        cVar2.mo52512Y(cVar, 0, cVar2.size());
        w0Var.write(cVar, cVar.size());
    }

    public RetryableSink() {
        this(-1);
    }

    public void flush() {
    }
}
