package p318ce;

import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12564o;
import p458xd.C13777b;
import p458xd.C13783d0;
import p458xd.C13788e;
import p458xd.C13791f;
import p458xd.C13827t;

/* renamed from: ce.d */
/* compiled from: MetadataUtils */
public final class C11054d {

    /* renamed from: ce.d$a */
    /* compiled from: MetadataUtils */
    private static final class C11055a implements C13791f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12564o f17140a;

        /* renamed from: ce.d$a$a */
        /* compiled from: MetadataUtils */
        private final class C11056a<ReqT, RespT> extends C13827t.C13828a<ReqT, RespT> {
            C11056a(C13788e<ReqT, RespT> eVar) {
                super(eVar);
            }

            /* renamed from: e */
            public void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
                oVar.mo50243k(C11055a.this.f17140a);
                super.mo46138e(aVar, oVar);
            }
        }

        C11055a(C12564o oVar) {
            this.f17140a = (C12564o) C8012n.m15756o(oVar, "extraHeaders");
        }

        /* renamed from: a */
        public <ReqT, RespT> C13788e<ReqT, RespT> mo46137a(C13783d0<ReqT, RespT> d0Var, C12159b bVar, C13777b bVar2) {
            return new C11056a(bVar2.mo49841h(d0Var, bVar));
        }
    }

    /* renamed from: a */
    public static C13791f m23846a(C12564o oVar) {
        return new C11055a(oVar);
    }
}
