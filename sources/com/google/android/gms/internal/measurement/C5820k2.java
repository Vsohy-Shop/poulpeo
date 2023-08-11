package com.google.android.gms.internal.measurement;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5820k2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ C5901p2 f7031f;

    /* renamed from: g */
    final /* synthetic */ C6061z2 f7032g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5820k2(C6061z2 z2Var, C5901p2 p2Var) {
        super(z2Var, true);
        this.f7032g = z2Var;
        this.f7031f = p2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7032g.f7513i)).registerOnMeasurementEventListener(this.f7031f);
    }
}
