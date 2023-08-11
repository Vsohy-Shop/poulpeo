package com.google.android.gms.internal.measurement;

import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5996v1 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ Boolean f7421f;

    /* renamed from: g */
    final /* synthetic */ C6061z2 f7422g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5996v1(C6061z2 z2Var, Boolean bool) {
        super(z2Var, true);
        this.f7422g = z2Var;
        this.f7421f = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        if (this.f7421f != null) {
            ((C5734f1) C9713p.m20275j(this.f7422g.f7513i)).setMeasurementEnabled(this.f7421f.booleanValue(), this.f7144b);
        } else {
            ((C5734f1) C9713p.m20275j(this.f7422g.f7513i)).clearMeasurementEnabled(this.f7144b);
        }
    }
}
