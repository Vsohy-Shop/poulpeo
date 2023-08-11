package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5932r1 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ String f7314f;

    /* renamed from: g */
    final /* synthetic */ String f7315g;

    /* renamed from: h */
    final /* synthetic */ Bundle f7316h;

    /* renamed from: i */
    final /* synthetic */ C6061z2 f7317i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5932r1(C6061z2 z2Var, String str, String str2, Bundle bundle) {
        super(z2Var, true);
        this.f7317i = z2Var;
        this.f7314f = str;
        this.f7315g = str2;
        this.f7316h = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f7317i.f7513i)).clearConditionalUserProperty(this.f7314f, this.f7315g, this.f7316h);
    }
}
