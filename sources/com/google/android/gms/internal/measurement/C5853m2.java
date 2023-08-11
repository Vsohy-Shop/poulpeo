package com.google.android.gms.internal.measurement;

import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5853m2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ String f7062f;

    /* renamed from: g */
    final /* synthetic */ String f7063g;

    /* renamed from: h */
    final /* synthetic */ Object f7064h;

    /* renamed from: i */
    final /* synthetic */ boolean f7065i;

    /* renamed from: j */
    final /* synthetic */ C6061z2 f7066j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5853m2(C6061z2 z2Var, String str, String str2, Object obj, boolean z) {
        super(z2Var, true);
        this.f7066j = z2Var;
        this.f7062f = str;
        this.f7063g = str2;
        this.f7064h = obj;
        this.f7065i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7066j.f7513i)).setUserProperty(this.f7062f, this.f7063g, C2890b.m2297b3(this.f7064h), this.f7065i, this.f7144b);
    }
}
