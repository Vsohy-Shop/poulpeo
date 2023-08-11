package com.google.android.gms.internal.gtm;

import p231t4.C9713p;
import p286y4.C10671e;

/* renamed from: com.google.android.gms.internal.gtm.p1 */
final class C5487p1 {

    /* renamed from: a */
    private final C10671e f6229a;

    /* renamed from: b */
    private long f6230b;

    public C5487p1(C10671e eVar) {
        C9713p.m20275j(eVar);
        this.f6229a = eVar;
    }

    /* renamed from: a */
    public final void mo33442a() {
        this.f6230b = 0;
    }

    /* renamed from: b */
    public final void mo33443b() {
        this.f6230b = this.f6229a.mo33548b();
    }

    /* renamed from: c */
    public final boolean mo33444c(long j) {
        if (this.f6230b != 0 && this.f6229a.mo33548b() - this.f6230b <= j) {
            return false;
        }
        return true;
    }

    public C5487p1(C10671e eVar, long j) {
        C9713p.m20275j(eVar);
        this.f6229a = eVar;
        this.f6230b = j;
    }
}
