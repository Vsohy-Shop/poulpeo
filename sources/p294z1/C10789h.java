package p294z1;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: z1.h */
/* compiled from: MarkEnforcingInputStream */
public class C10789h extends FilterInputStream {

    /* renamed from: b */
    private int f16506b = Integer.MIN_VALUE;

    public C10789h(@NonNull InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m22942a(long j) {
        int i = this.f16506b;
        if (i == 0) {
            return -1;
        }
        if (i == Integer.MIN_VALUE || j <= ((long) i)) {
            return j;
        }
        return (long) i;
    }

    /* renamed from: b */
    private void m22943b(long j) {
        int i = this.f16506b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f16506b = (int) (((long) i) - j);
        }
    }

    public int available() {
        int i = this.f16506b;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f16506b = i;
    }

    public int read() {
        if (m22942a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m22943b(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f16506b = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long a = m22942a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m22943b(skip);
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int a = (int) m22942a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m22943b((long) read);
        return read;
    }
}
