package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5718e2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ String f6867f;

    /* renamed from: g */
    final /* synthetic */ String f6868g;

    /* renamed from: h */
    final /* synthetic */ boolean f6869h;

    /* renamed from: i */
    final /* synthetic */ C5666b1 f6870i;

    /* renamed from: j */
    final /* synthetic */ C6061z2 f6871j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5718e2(C6061z2 z2Var, String str, String str2, boolean z, C5666b1 b1Var) {
        super(z2Var, true);
        this.f6871j = z2Var;
        this.f6867f = str;
        this.f6868g = str2;
        this.f6869h = z;
        this.f6870i = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f6871j.f7513i)).getUserProperties(this.f6867f, this.f6868g, this.f6869h, this.f6870i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33645b() {
        this.f6870i.mo33691r((Bundle) null);
    }
}
