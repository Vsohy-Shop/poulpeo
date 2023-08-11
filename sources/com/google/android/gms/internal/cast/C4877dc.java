package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.dc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4877dc extends C4929gc {

    /* renamed from: g */
    private final int f5191g;

    C4877dc(byte[] bArr, int i, int i2) {
        super(bArr);
        C4980jc.m7090u(0, i2, bArr.length);
        this.f5191g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final int mo32727B() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo32728b(int i) {
        int i2 = this.f5191g;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f5234f[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte mo32729d(int i) {
        return this.f5234f[i];
    }

    /* renamed from: j */
    public final int mo32730j() {
        return this.f5191g;
    }
}
