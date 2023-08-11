package com.google.firebase.installations;

import p144k8.C8591d;
import p276x5.C10406g;

/* renamed from: com.google.firebase.installations.e */
/* compiled from: GetIdListener */
class C6948e implements C6951g {

    /* renamed from: a */
    final C10406g<String> f9222a;

    public C6948e(C10406g<String> gVar) {
        this.f9222a = gVar;
    }

    /* renamed from: a */
    public boolean mo39838a(C8591d dVar) {
        if (!dVar.mo42672l() && !dVar.mo42671k() && !dVar.mo42669i()) {
            return false;
        }
        this.f9222a.mo45100e(dVar.mo42648d());
        return true;
    }

    /* renamed from: b */
    public boolean mo39839b(Exception exc) {
        return false;
    }
}
