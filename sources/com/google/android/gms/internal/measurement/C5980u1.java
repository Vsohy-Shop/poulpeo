package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5980u1 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Activity f7406f;

    /* renamed from: g */
    final /* synthetic */ String f7407g;

    /* renamed from: h */
    final /* synthetic */ String f7408h;

    /* renamed from: i */
    final /* synthetic */ C6061z2 f7409i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5980u1(C6061z2 z2Var, Activity activity, String str, String str2) {
        super(z2Var, true);
        this.f7409i = z2Var;
        this.f7406f = activity;
        this.f7407g = str;
        this.f7408h = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7409i.f7513i)).setCurrentScreen(C2890b.m2297b3(this.f7406f), this.f7407g, this.f7408h, this.f7144b);
    }
}
