package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.oc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5065oc extends C5099qc {

    /* renamed from: d */
    private final byte[] f5444d;

    /* renamed from: e */
    private final int f5445e;

    /* renamed from: f */
    private int f5446f;

    C5065oc(byte[] bArr, int i, int i2) {
        super((C5082pc) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f5444d = bArr;
                this.f5446f = 0;
                this.f5445e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: E */
    public final void mo32926E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f5444d, this.f5446f, i2);
            this.f5446f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo32927F(String str) {
        int i = this.f5446f;
        try {
            int a = C5099qc.m7393a(str.length() * 3);
            int a2 = C5099qc.m7393a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f5446f = i2;
                int b = C5255zf.m7729b(str, this.f5444d, i2, this.f5445e - i2);
                this.f5446f = i;
                mo32942u((b - i) - a2);
                this.f5446f = b;
                return;
            }
            mo32942u(C5255zf.m7730c(str));
            byte[] bArr = this.f5444d;
            int i3 = this.f5446f;
            this.f5446f = C5255zf.m7729b(str, bArr, i3, this.f5445e - i3);
        } catch (C5238yf e) {
            this.f5446f = i;
            mo32974e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzpx(e2);
        }
    }

    /* renamed from: g */
    public final int mo32928g() {
        return this.f5445e - this.f5446f;
    }

    /* renamed from: h */
    public final void mo32929h(byte b) {
        try {
            byte[] bArr = this.f5444d;
            int i = this.f5446f;
            this.f5446f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo32930i(int i, boolean z) {
        mo32942u(i << 3);
        mo32929h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo32931j(int i, C4980jc jcVar) {
        mo32942u((i << 3) | 2);
        mo32942u(jcVar.mo32730j());
        jcVar.mo32812s(this);
    }

    /* renamed from: k */
    public final void mo32932k(int i, int i2) {
        mo32942u((i << 3) | 5);
        mo32933l(i2);
    }

    /* renamed from: l */
    public final void mo32933l(int i) {
        try {
            byte[] bArr = this.f5444d;
            int i2 = this.f5446f;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f5446f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo32934m(int i, long j) {
        mo32942u((i << 3) | 1);
        mo32935n(j);
    }

    /* renamed from: n */
    public final void mo32935n(long j) {
        try {
            byte[] bArr = this.f5444d;
            int i = this.f5446f;
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
            this.f5446f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo32936o(int i, int i2) {
        mo32942u(i << 3);
        mo32937p(i2);
    }

    /* renamed from: p */
    public final void mo32937p(int i) {
        if (i >= 0) {
            mo32942u(i);
        } else {
            mo32944w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo32938q(byte[] bArr, int i, int i2) {
        mo32926E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo32939r(int i, String str) {
        mo32942u((i << 3) | 2);
        mo32927F(str);
    }

    /* renamed from: s */
    public final void mo32940s(int i, int i2) {
        mo32942u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo32941t(int i, int i2) {
        mo32942u(i << 3);
        mo32942u(i2);
    }

    /* renamed from: u */
    public final void mo32942u(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f5444d;
            int i2 = this.f5446f;
            this.f5446f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f5444d;
            int i3 = this.f5446f;
            this.f5446f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo32943v(int i, long j) {
        mo32942u(i << 3);
        mo32944w(j);
    }

    /* renamed from: w */
    public final void mo32944w(long j) {
        if (!C5099qc.f5487c || this.f5445e - this.f5446f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f5444d;
                int i = this.f5446f;
                this.f5446f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f5444d;
                int i2 = this.f5446f;
                this.f5446f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzpx(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5446f), Integer.valueOf(this.f5445e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f5444d;
                int i3 = this.f5446f;
                this.f5446f = i3 + 1;
                C5187vf.m7593s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f5444d;
            int i4 = this.f5446f;
            this.f5446f = i4 + 1;
            C5187vf.m7593s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
