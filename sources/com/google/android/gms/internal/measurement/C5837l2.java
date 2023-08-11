package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5837l2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Long f7041f;

    /* renamed from: g */
    final /* synthetic */ String f7042g;

    /* renamed from: h */
    final /* synthetic */ String f7043h;

    /* renamed from: i */
    final /* synthetic */ Bundle f7044i;

    /* renamed from: j */
    final /* synthetic */ boolean f7045j;

    /* renamed from: k */
    final /* synthetic */ boolean f7046k;

    /* renamed from: l */
    final /* synthetic */ C6061z2 f7047l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5837l2(C6061z2 z2Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(z2Var, true);
        this.f7047l = z2Var;
        this.f7041f = l;
        this.f7042g = str;
        this.f7043h = str2;
        this.f7044i = bundle;
        this.f7045j = z;
        this.f7046k = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        long j;
        Long l = this.f7041f;
        if (l == null) {
            j = this.f7144b;
        } else {
            j = l.longValue();
        }
        ((C5734f1) C9713p.m20275j(this.f7047l.f7513i)).logEvent(this.f7042g, this.f7043h, this.f7044i, this.f7045j, this.f7046k, j);
    }
}
