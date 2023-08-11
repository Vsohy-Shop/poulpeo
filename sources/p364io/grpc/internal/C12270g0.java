package p364io.grpc.internal;

import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12402r;
import p458xd.C13783d0;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.g0 */
/* compiled from: FailingClientTransport */
class C12270g0 implements C12422s {

    /* renamed from: a */
    final C12594t f19330a;

    /* renamed from: b */
    private final C12402r.C12403a f19331b;

    C12270g0(C12594t tVar, C12402r.C12403a aVar) {
        C8012n.m15746e(!tVar.mo50308p(), "error must not be OK");
        this.f19330a = tVar;
        this.f19331b = aVar;
    }

    /* renamed from: d */
    public C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
        return new C12257f0(this.f19330a, this.f19331b, cVarArr);
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
