package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5667b2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ C5666b1 f6783f;

    /* renamed from: g */
    final /* synthetic */ C6061z2 f6784g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5667b2(C6061z2 z2Var, C5666b1 b1Var) {
        super(z2Var, true);
        this.f6784g = z2Var;
        this.f6783f = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f6784g.f7513i)).generateEventId(this.f6783f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33645b() {
        this.f6783f.mo33691r((Bundle) null);
    }
}
