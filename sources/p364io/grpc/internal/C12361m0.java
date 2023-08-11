package p364io.grpc.internal;

import p111h6.C8003j;
import p364io.grpc.C12159b;
import p458xd.C13780c0;
import p458xd.C13783d0;
import p458xd.C13788e;

/* renamed from: io.grpc.internal.m0 */
/* compiled from: ForwardingManagedChannel */
abstract class C12361m0 extends C13780c0 {

    /* renamed from: a */
    private final C13780c0 f19625a;

    C12361m0(C13780c0 c0Var) {
        this.f19625a = c0Var;
    }

    /* renamed from: a */
    public String mo49840a() {
        return this.f19625a.mo49840a();
    }

    /* renamed from: h */
    public <RequestT, ResponseT> C13788e<RequestT, ResponseT> mo49841h(C13783d0<RequestT, ResponseT> d0Var, C12159b bVar) {
        return this.f19625a.mo49841h(d0Var, bVar);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", this.f19625a).toString();
    }
}
