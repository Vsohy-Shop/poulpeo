package p364io.grpc.internal;

import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12575p;

/* renamed from: io.grpc.internal.n0 */
/* compiled from: ForwardingNameResolver */
abstract class C12370n0 extends C12575p {

    /* renamed from: a */
    private final C12575p f19648a;

    C12370n0(C12575p pVar) {
        C8012n.m15756o(pVar, "delegate can not be null");
        this.f19648a = pVar;
    }

    /* renamed from: b */
    public void mo49754b() {
        this.f19648a.mo49754b();
    }

    /* renamed from: c */
    public void mo49755c() {
        this.f19648a.mo49755c();
    }

    /* renamed from: d */
    public void mo49756d(C12575p.C12581e eVar) {
        this.f19648a.mo49756d(eVar);
    }

    @Deprecated
    /* renamed from: e */
    public void mo50004e(C12575p.C12582f fVar) {
        this.f19648a.mo50004e(fVar);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", this.f19648a).toString();
    }
}
