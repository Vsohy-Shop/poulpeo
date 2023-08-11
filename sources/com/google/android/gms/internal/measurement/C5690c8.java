package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5690c8 extends C5707d8 {

    /* renamed from: d */
    private final byte[] f6826d;

    /* renamed from: e */
    private final int f6827e;

    /* renamed from: f */
    private int f6828f;

    C5690c8(byte[] bArr, int i, int i2) {
        super((C5673b8) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f6826d = bArr;
                this.f6828f = 0;
                this.f6827e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: E */
    public final void mo33754E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f6826d, this.f6828f, i2);
            this.f6828f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo33755F(String str) {
        int i = this.f6828f;
        try {
            int a = C5707d8.m8988a(str.length() * 3);
            int a2 = C5707d8.m8988a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f6828f = i2;
                int b = C5862mb.m9641b(str, this.f6826d, i2, this.f6827e - i2);
                this.f6828f = i;
                mo33770u((b - i) - a2);
                this.f6828f = b;
                return;
            }
            mo33770u(C5862mb.m9642c(str));
            byte[] bArr = this.f6826d;
            int i3 = this.f6828f;
            this.f6828f = C5862mb.m9641b(str, bArr, i3, this.f6827e - i3);
        } catch (C5846lb e) {
            this.f6828f = i;
            mo33837e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzjd(e2);
        }
    }

    /* renamed from: g */
    public final int mo33756g() {
        return this.f6827e - this.f6828f;
    }

    /* renamed from: h */
    public final void mo33757h(byte b) {
        try {
            byte[] bArr = this.f6826d;
            int i = this.f6828f;
            this.f6828f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo33758i(int i, boolean z) {
        mo33770u(i << 3);
        mo33757h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo33759j(int i, C6018w7 w7Var) {
        mo33770u((i << 3) | 2);
        mo33770u(w7Var.mo34319j());
        w7Var.mo34538s(this);
    }

    /* renamed from: k */
    public final void mo33760k(int i, int i2) {
        mo33770u((i << 3) | 5);
        mo33761l(i2);
    }

    /* renamed from: l */
    public final void mo33761l(int i) {
        try {
            byte[] bArr = this.f6826d;
            int i2 = this.f6828f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f6828f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo33762m(int i, long j) {
        mo33770u((i << 3) | 1);
        mo33763n(j);
    }

    /* renamed from: n */
    public final void mo33763n(long j) {
        try {
            byte[] bArr = this.f6826d;
            int i = this.f6828f;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f6828f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo33764o(int i, int i2) {
        mo33770u(i << 3);
        mo33765p(i2);
    }

    /* renamed from: p */
    public final void mo33765p(int i) {
        if (i >= 0) {
            mo33770u(i);
        } else {
            mo33772w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo33766q(byte[] bArr, int i, int i2) {
        mo33754E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo33767r(int i, String str) {
        mo33770u((i << 3) | 2);
        mo33755F(str);
    }

    /* renamed from: s */
    public final void mo33768s(int i, int i2) {
        mo33770u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo33769t(int i, int i2) {
        mo33770u(i << 3);
        mo33770u(i2);
    }

    /* renamed from: u */
    public final void mo33770u(int i) {
        if (C5707d8.f6849c) {
            int i2 = C5791i7.f7005a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f6826d;
            int i3 = this.f6828f;
            this.f6828f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f6826d;
            int i4 = this.f6828f;
            this.f6828f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo33771v(int i, long j) {
        mo33770u(i << 3);
        mo33772w(j);
    }

    /* renamed from: w */
    public final void mo33772w(long j) {
        if (!C5707d8.f6849c || this.f6827e - this.f6828f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f6826d;
                int i = this.f6828f;
                this.f6828f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f6826d;
                int i2 = this.f6828f;
                this.f6828f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6828f), Integer.valueOf(this.f6827e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f6826d;
                int i3 = this.f6828f;
                this.f6828f = i3 + 1;
                C5778hb.m9369s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f6826d;
            int i4 = this.f6828f;
            this.f6828f = i4 + 1;
            C5778hb.m9369s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
