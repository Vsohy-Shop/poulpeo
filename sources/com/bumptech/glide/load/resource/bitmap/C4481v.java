package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p106h1.C7883b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
/* compiled from: RecyclableBufferedInputStream */
public class C4481v extends FilterInputStream {

    /* renamed from: b */
    private volatile byte[] f4060b;

    /* renamed from: c */
    private int f4061c;

    /* renamed from: d */
    private int f4062d;

    /* renamed from: e */
    private int f4063e;

    /* renamed from: f */
    private int f4064f;

    /* renamed from: g */
    private final C7883b f4065g;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C4482a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C4482a(String str) {
            super(str);
        }
    }

    public C4481v(@NonNull InputStream inputStream, @NonNull C7883b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: a */
    private int m5466a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f4063e;
        if (i2 == -1 || this.f4064f - i2 >= (i = this.f4062d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f4063e = -1;
                this.f4064f = 0;
                this.f4061c = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f4061c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f4065g.mo41595d(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f4060b = bArr2;
            this.f4065g.put(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f4064f - this.f4063e;
        this.f4064f = i3;
        this.f4063e = 0;
        this.f4061c = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f4064f;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f4061c = i4;
        return read2;
    }

    /* renamed from: k */
    private static IOException m5467k() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f4060b == null || inputStream == null) {
            throw m5467k();
        }
        return (this.f4061c - this.f4064f) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo31444b() {
        this.f4062d = this.f4060b.length;
    }

    /* renamed from: c */
    public synchronized void mo31445c() {
        if (this.f4060b != null) {
            this.f4065g.put(this.f4060b);
            this.f4060b = null;
        }
    }

    public void close() {
        if (this.f4060b != null) {
            this.f4065g.put(this.f4060b);
            this.f4060b = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f4062d = Math.max(this.f4062d, i);
        this.f4063e = this.f4064f;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f4060b     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f4064f     // Catch:{ all -> 0x003e }
            int r3 = r5.f4061c     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m5466a(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f4060b     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f4060b     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m5467k()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f4061c     // Catch:{ all -> 0x003e }
            int r2 = r5.f4064f     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f4064f = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m5467k()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C4481v.read():int");
    }

    public synchronized void reset() {
        if (this.f4060b != null) {
            int i = this.f4063e;
            if (-1 != i) {
                this.f4064f = i;
            } else {
                throw new C4482a("Mark has been invalidated, pos: " + this.f4064f + " markLimit: " + this.f4062d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f4060b;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f4061c;
                int i2 = this.f4064f;
                if (((long) (i - i2)) >= j) {
                    this.f4064f = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f4064f = i;
                if (this.f4063e == -1 || j > ((long) this.f4062d)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m5466a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f4061c;
                    int i4 = this.f4064f;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f4064f = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f4064f = i3;
                    return j3;
                }
            } else {
                throw m5467k();
            }
        } else {
            throw m5467k();
        }
    }

    @VisibleForTesting
    C4481v(@NonNull InputStream inputStream, @NonNull C7883b bVar, int i) {
        super(inputStream);
        this.f4063e = -1;
        this.f4065g = bVar;
        this.f4060b = (byte[]) bVar.mo41595d(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@androidx.annotation.NonNull byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f4060b     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f4064f     // Catch:{ all -> 0x0090 }
            int r3 = r6.f4061c     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f4064f     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f4064f = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f4063e     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.m5466a(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f4060b     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f4060b     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m5467k()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f4061c     // Catch:{ all -> 0x0090 }
            int r4 = r6.f4064f     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f4064f     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f4064f = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m5467k()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m5467k()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C4481v.read(byte[], int, int):int");
    }
}
