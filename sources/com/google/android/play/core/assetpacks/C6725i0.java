package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.i0 */
final class C6725i0 extends FilterInputStream {

    /* renamed from: b */
    private final C6774u1 f8668b = new C6774u1();

    /* renamed from: c */
    private byte[] f8669c = new byte[4096];

    /* renamed from: d */
    private long f8670d;

    /* renamed from: e */
    private boolean f8671e = false;

    /* renamed from: f */
    private boolean f8672f = false;

    C6725i0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private final int m11389a(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: c */
    private final boolean m11390c(int i) {
        int a = m11389a(this.f8669c, 0, i);
        if (a != i) {
            int i2 = i - a;
            if (m11389a(this.f8669c, a, i2) != i2) {
                this.f8668b.mo39369b(this.f8669c, 0, a);
                return false;
            }
        }
        this.f8668b.mo39369b(this.f8669c, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo39296A() {
        return this.f8672f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final long mo39297G() {
        return this.f8670d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6751o2 mo39298b() {
        byte[] bArr;
        if (this.f8670d > 0) {
            do {
                bArr = this.f8669c;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f8671e || this.f8672f) {
            return new C6751o2((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m11390c(30)) {
            this.f8671e = true;
            return this.f8668b.mo39370c();
        }
        C6751o2 c = this.f8668b.mo39370c();
        if (c.mo39345h()) {
            this.f8672f = true;
            return c;
        } else if (c.mo39341e() != 4294967295L) {
            int d = this.f8668b.mo39371d() - 30;
            long j = (long) d;
            int length = this.f8669c.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f8669c = Arrays.copyOf(this.f8669c, length);
            }
            if (!m11390c(d)) {
                this.f8671e = true;
                return this.f8668b.mo39370c();
            }
            C6751o2 c2 = this.f8668b.mo39370c();
            this.f8670d = c2.mo39341e();
            return c2;
        } else {
            throw new C6761r0("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo39299k() {
        return this.f8671e;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f8670d;
        if (j <= 0 || this.f8671e) {
            return -1;
        }
        int a = m11389a(bArr, i, (int) Math.min(j, (long) i2));
        this.f8670d -= (long) a;
        if (a != 0) {
            return a;
        }
        this.f8671e = true;
        return 0;
    }
}
