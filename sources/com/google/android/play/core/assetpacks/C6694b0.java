package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.b0 */
final class C6694b0 extends InputStream {

    /* renamed from: b */
    private final InputStream f8570b;

    /* renamed from: c */
    private long f8571c;

    C6694b0(InputStream inputStream, long j) {
        this.f8570b = inputStream;
        this.f8571c = j;
    }

    public final void close() {
        super.close();
        this.f8570b.close();
        this.f8571c = 0;
    }

    public final int read() {
        long j = this.f8571c;
        if (j <= 0) {
            return -1;
        }
        this.f8571c = j - 1;
        return this.f8570b.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f8571c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f8570b.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f8571c -= (long) read;
        }
        return read;
    }
}
