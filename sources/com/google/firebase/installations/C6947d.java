package com.google.firebase.installations;

import p144k8.C8591d;
import p276x5.C10406g;

/* renamed from: com.google.firebase.installations.d */
/* compiled from: GetAuthTokenListener */
class C6947d implements C6951g {

    /* renamed from: a */
    private final C6952h f9220a;

    /* renamed from: b */
    private final C10406g<C6949f> f9221b;

    public C6947d(C6952h hVar, C10406g<C6949f> gVar) {
        this.f9220a = hVar;
        this.f9221b = gVar;
    }

    /* renamed from: a */
    public boolean mo39838a(C8591d dVar) {
        if (!dVar.mo42671k() || this.f9220a.mo39843f(dVar)) {
            return false;
        }
        this.f9221b.mo45098c(C6949f.m12159a().mo39828b(dVar.mo42646b()).mo39830d(dVar.mo42647c()).mo39829c(dVar.mo42653h()).mo39827a());
        return true;
    }

    /* renamed from: b */
    public boolean mo39839b(Exception exc) {
        this.f9221b.mo45099d(exc);
        return true;
    }
}
