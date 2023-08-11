package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5938r7 extends C5986u7 {

    /* renamed from: g */
    private final int f7321g;

    C5938r7(byte[] bArr, int i, int i2) {
        super(bArr);
        C6018w7.m10203u(0, i2, bArr.length);
        this.f7321g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo34316F() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo34317b(int i) {
        int i2 = this.f7321g;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f7413f[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final byte mo34318d(int i) {
        return this.f7413f[i];
    }

    /* renamed from: j */
    public final int mo34319j() {
        return this.f7321g;
    }
}
