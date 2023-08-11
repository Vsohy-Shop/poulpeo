package p364io.grpc.internal;

import p111h6.C8012n;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12402r;

/* renamed from: io.grpc.internal.f0 */
/* compiled from: FailingClientStream */
public final class C12257f0 extends C12378o1 {

    /* renamed from: b */
    private boolean f19306b;

    /* renamed from: c */
    private final C12594t f19307c;

    /* renamed from: d */
    private final C12402r.C12403a f19308d;

    /* renamed from: e */
    private final C12161c[] f19309e;

    public C12257f0(C12594t tVar, C12161c[] cVarArr) {
        this(tVar, C12402r.C12403a.PROCESSED, cVarArr);
    }

    /* renamed from: h */
    public void mo49664h(C12460x0 x0Var) {
        x0Var.mo50128b(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, this.f19307c).mo50128b("progress", this.f19308d);
    }

    /* renamed from: j */
    public void mo49667j(C12402r rVar) {
        C8012n.m15762u(!this.f19306b, "already started");
        this.f19306b = true;
        for (C12161c i : this.f19309e) {
            i.mo50051i(this.f19307c);
        }
        rVar.mo49740d(this.f19307c, this.f19308d, new C12564o());
    }

    public C12257f0(C12594t tVar, C12402r.C12403a aVar, C12161c[] cVarArr) {
        C8012n.m15746e(!tVar.mo50308p(), "error must not be OK");
        this.f19307c = tVar;
        this.f19308d = aVar;
        this.f19309e = cVarArr;
    }
}
