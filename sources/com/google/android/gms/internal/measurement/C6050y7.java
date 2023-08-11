package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C6050y7 extends C5656a8 {

    /* renamed from: b */
    private final byte[] f7485b;

    /* renamed from: c */
    private int f7486c;

    /* renamed from: d */
    private int f7487d;

    /* renamed from: e */
    private int f7488e = Integer.MAX_VALUE;

    /* synthetic */ C6050y7(byte[] bArr, int i, int i2, boolean z, C6034x7 x7Var) {
        super((C6034x7) null);
        this.f7485b = bArr;
        this.f7486c = 0;
    }

    /* renamed from: c */
    public final int mo34639c(int i) {
        int i2 = this.f7488e;
        this.f7488e = 0;
        int i3 = this.f7486c + this.f7487d;
        this.f7486c = i3;
        if (i3 > 0) {
            this.f7487d = i3;
            this.f7486c = 0;
        } else {
            this.f7487d = 0;
        }
        return i2;
    }
}
