package com.google.android.gms.measurement.internal;

import p231t4.C9713p;
import p286y4.C10671e;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6299t8 {

    /* renamed from: a */
    private final C10671e f8251a;

    /* renamed from: b */
    private long f8252b;

    public C6299t8(C10671e eVar) {
        C9713p.m20275j(eVar);
        this.f8251a = eVar;
    }

    /* renamed from: a */
    public final void mo35305a() {
        this.f8252b = 0;
    }

    /* renamed from: b */
    public final void mo35306b() {
        this.f8252b = this.f8251a.mo33548b();
    }

    /* renamed from: c */
    public final boolean mo35307c(long j) {
        if (this.f8252b != 0 && this.f8251a.mo33548b() - this.f8252b < 3600000) {
            return false;
        }
        return true;
    }
}
