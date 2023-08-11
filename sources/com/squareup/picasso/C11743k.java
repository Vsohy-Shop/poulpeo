package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.k */
/* compiled from: MarkableInputStream */
final class C11743k extends InputStream {

    /* renamed from: b */
    private final InputStream f18261b;

    /* renamed from: c */
    private long f18262c;

    /* renamed from: d */
    private long f18263d;

    /* renamed from: e */
    private long f18264e;

    /* renamed from: f */
    private long f18265f;

    /* renamed from: g */
    private boolean f18266g;

    /* renamed from: h */
    private int f18267h;

    C11743k(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: A */
    private void m25206A(long j, long j2) {
        while (j < j2) {
            long skip = this.f18261b.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    /* renamed from: k */
    private void m25207k(long j) {
        try {
            long j2 = this.f18263d;
            long j3 = this.f18262c;
            if (j2 >= j3 || j3 > this.f18264e) {
                this.f18263d = j3;
                this.f18261b.mark((int) (j - j3));
            } else {
                this.f18261b.reset();
                this.f18261b.mark((int) (j - this.f18263d));
                m25206A(this.f18263d, this.f18262c);
            }
            this.f18264e = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: a */
    public void mo48720a(boolean z) {
        this.f18266g = z;
    }

    public int available() {
        return this.f18261b.available();
    }

    /* renamed from: b */
    public void mo48722b(long j) {
        if (this.f18262c > this.f18264e || j < this.f18263d) {
            throw new IOException("Cannot reset");
        }
        this.f18261b.reset();
        m25206A(this.f18263d, j);
        this.f18262c = j;
    }

    /* renamed from: c */
    public long mo48723c(int i) {
        long j = this.f18262c + ((long) i);
        if (this.f18264e < j) {
            m25207k(j);
        }
        return this.f18262c;
    }

    public void close() {
        this.f18261b.close();
    }

    public void mark(int i) {
        this.f18265f = mo48723c(i);
    }

    public boolean markSupported() {
        return this.f18261b.markSupported();
    }

    public int read() {
        if (!this.f18266g) {
            long j = this.f18264e;
            if (this.f18262c + 1 > j) {
                m25207k(j + ((long) this.f18267h));
            }
        }
        int read = this.f18261b.read();
        if (read != -1) {
            this.f18262c++;
        }
        return read;
    }

    public void reset() {
        mo48722b(this.f18265f);
    }

    public long skip(long j) {
        if (!this.f18266g) {
            long j2 = this.f18262c;
            if (j2 + j > this.f18264e) {
                m25207k(j2 + j + ((long) this.f18267h));
            }
        }
        long skip = this.f18261b.skip(j);
        this.f18262c += skip;
        return skip;
    }

    C11743k(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private C11743k(InputStream inputStream, int i, int i2) {
        this.f18265f = -1;
        this.f18266g = true;
        this.f18267h = -1;
        this.f18261b = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
        this.f18267h = i2;
    }

    public int read(byte[] bArr) {
        if (!this.f18266g) {
            long j = this.f18262c;
            if (((long) bArr.length) + j > this.f18264e) {
                m25207k(j + ((long) bArr.length) + ((long) this.f18267h));
            }
        }
        int read = this.f18261b.read(bArr);
        if (read != -1) {
            this.f18262c += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f18266g) {
            long j = this.f18262c;
            long j2 = (long) i2;
            if (j + j2 > this.f18264e) {
                m25207k(j + j2 + ((long) this.f18267h));
            }
        }
        int read = this.f18261b.read(bArr, i, i2);
        if (read != -1) {
            this.f18262c += (long) read;
        }
        return read;
    }
}
