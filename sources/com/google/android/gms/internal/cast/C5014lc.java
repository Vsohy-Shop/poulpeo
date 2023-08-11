package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.lc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5014lc extends C5048nc {

    /* renamed from: b */
    private final byte[] f5344b;

    /* renamed from: c */
    private int f5345c;

    /* renamed from: d */
    private int f5346d;

    /* renamed from: e */
    private int f5347e = Integer.MAX_VALUE;

    /* synthetic */ C5014lc(byte[] bArr, int i, int i2, boolean z, C4997kc kcVar) {
        super((C5031mc) null);
        this.f5344b = bArr;
        this.f5345c = 0;
    }

    /* renamed from: a */
    public final int mo32879a(int i) {
        int i2 = this.f5347e;
        this.f5347e = 0;
        int i3 = this.f5345c + this.f5346d;
        this.f5345c = i3;
        if (i3 > 0) {
            this.f5346d = i3;
            this.f5345c = i3 - i3;
        } else {
            this.f5346d = 0;
        }
        return i2;
    }
}
