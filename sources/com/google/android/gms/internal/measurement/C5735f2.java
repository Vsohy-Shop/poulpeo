package com.google.android.gms.internal.measurement;

import p036b5.C2890b;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C5735f2 extends C5869n2 {

    /* renamed from: f */
    final /* synthetic */ String f6934f;

    /* renamed from: g */
    final /* synthetic */ Object f6935g;

    /* renamed from: h */
    final /* synthetic */ C6061z2 f6936h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5735f2(C6061z2 z2Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(z2Var, false);
        this.f6936h = z2Var;
        this.f6934f = str;
        this.f6935g = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33644a() {
        ((C5734f1) C9713p.m20275j(this.f6936h.f7513i)).logHealthData(5, this.f6934f, C2890b.m2297b3(this.f6935g), C2890b.m2297b3(null), C2890b.m2297b3(null));
    }
}
