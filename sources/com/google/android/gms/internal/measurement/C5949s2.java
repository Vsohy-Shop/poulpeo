package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.s2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5949s2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Activity f7344f;

    /* renamed from: g */
    final /* synthetic */ C6045y2 f7345g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5949s2(C6045y2 y2Var, Activity activity) {
        super(y2Var.f7476b, true);
        this.f7345g = y2Var;
        this.f7344f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7345g.f7476b.f7513i)).onActivityResumed(C2890b.m2297b3(this.f7344f), this.f7145c);
    }
}
