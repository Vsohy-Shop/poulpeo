package p151l5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: l5.k */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8728k extends FilterInputStream {

    /* renamed from: b */
    private long f12557b;

    /* renamed from: c */
    private long f12558c = -1;

    C8728k(InputStream inputStream, long j) {
        super(inputStream);
        inputStream.getClass();
        this.f12557b = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f12557b);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f12558c = this.f12557b;
    }

    public final int read() {
        if (this.f12557b == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f12557b--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f12558c != -1) {
            this.in.reset();
            this.f12557b = this.f12558c;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f12557b));
        this.f12557b -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f12557b;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f12557b -= (long) read;
        }
        return read;
    }
}
