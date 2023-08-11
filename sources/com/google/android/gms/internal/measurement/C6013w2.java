package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C6013w2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Activity f7443f;

    /* renamed from: g */
    final /* synthetic */ C5666b1 f7444g;

    /* renamed from: h */
    final /* synthetic */ C6045y2 f7445h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6013w2(C6045y2 y2Var, Activity activity, C5666b1 b1Var) {
        super(y2Var.f7476b, true);
        this.f7445h = y2Var;
        this.f7443f = activity;
        this.f7444g = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7445h.f7476b.f7513i)).onActivitySaveInstanceState(C2890b.m2297b3(this.f7443f), this.f7444g, this.f7145c);
    }
}
