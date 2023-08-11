package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final /* synthetic */ class C6275r6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6286s6 f8174b;

    /* renamed from: c */
    public final /* synthetic */ int f8175c;

    /* renamed from: d */
    public final /* synthetic */ Exception f8176d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f8177e;

    /* renamed from: f */
    public final /* synthetic */ Map f8178f;

    public /* synthetic */ C6275r6(C6286s6 s6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f8174b = s6Var;
        this.f8175c = i;
        this.f8176d = exc;
        this.f8177e = bArr;
        this.f8178f = map;
    }

    public final void run() {
        this.f8174b.mo35294a(this.f8175c, this.f8176d, this.f8177e, this.f8178f);
    }
}
