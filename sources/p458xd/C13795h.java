package p458xd;

import java.util.Arrays;
import java.util.List;
import p111h6.C8012n;
import p364io.grpc.C12159b;
import p364io.grpc.C12564o;
import p458xd.C13788e;

/* renamed from: xd.h */
/* compiled from: ClientInterceptors */
public class C13795h {

    /* renamed from: a */
    private static final C13788e<Object, Object> f22237a = new C13796a();

    /* renamed from: xd.h$b */
    /* compiled from: ClientInterceptors */
    private static class C13797b extends C13777b {

        /* renamed from: a */
        private final C13777b f22238a;

        /* renamed from: b */
        private final C13791f f22239b;

        /* synthetic */ C13797b(C13777b bVar, C13791f fVar, C13793g gVar) {
            this(bVar, fVar);
        }

        /* renamed from: a */
        public String mo49840a() {
            return this.f22238a.mo49840a();
        }

        /* renamed from: h */
        public <ReqT, RespT> C13788e<ReqT, RespT> mo49841h(C13783d0<ReqT, RespT> d0Var, C12159b bVar) {
            return this.f22239b.mo46137a(d0Var, bVar, this.f22238a);
        }

        private C13797b(C13777b bVar, C13791f fVar) {
            this.f22238a = bVar;
            this.f22239b = (C13791f) C8012n.m15756o(fVar, "interceptor");
        }
    }

    /* renamed from: a */
    public static C13777b m31682a(C13777b bVar, List<? extends C13791f> list) {
        C8012n.m15756o(bVar, "channel");
        for (C13791f bVar2 : list) {
            bVar = new C13797b(bVar, bVar2, (C13793g) null);
        }
        return bVar;
    }

    /* renamed from: b */
    public static C13777b m31683b(C13777b bVar, C13791f... fVarArr) {
        return m31682a(bVar, Arrays.asList(fVarArr));
    }

    /* renamed from: xd.h$a */
    /* compiled from: ClientInterceptors */
    class C13796a extends C13788e<Object, Object> {
        C13796a() {
        }

        /* renamed from: b */
        public void mo49849b() {
        }

        /* renamed from: c */
        public void mo49850c(int i) {
        }

        /* renamed from: d */
        public void mo49851d(Object obj) {
        }

        /* renamed from: a */
        public void mo49848a(String str, Throwable th) {
        }

        /* renamed from: e */
        public void mo46138e(C13788e.C13789a<Object> aVar, C12564o oVar) {
        }
    }
}
