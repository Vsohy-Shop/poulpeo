package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C6029x2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Activity f7467f;

    /* renamed from: g */
    final /* synthetic */ C6045y2 f7468g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6029x2(C6045y2 y2Var, Activity activity) {
        super(y2Var.f7476b, true);
        this.f7468g = y2Var;
        this.f7467f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7468g.f7476b.f7513i)).onActivityDestroyed(C2890b.m2297b3(this.f7467f), this.f7145c);
    }
}
