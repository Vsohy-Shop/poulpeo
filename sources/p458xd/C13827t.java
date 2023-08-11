package p458xd;

import p364io.grpc.C12564o;
import p458xd.C13788e;

/* renamed from: xd.t */
/* compiled from: ForwardingClientCall */
public abstract class C13827t<ReqT, RespT> extends C13790e0<ReqT, RespT> {

    /* renamed from: xd.t$a */
    /* compiled from: ForwardingClientCall */
    public static abstract class C13828a<ReqT, RespT> extends C13827t<ReqT, RespT> {

        /* renamed from: a */
        private final C13788e<ReqT, RespT> f22296a;

        protected C13828a(C13788e<ReqT, RespT> eVar) {
            this.f22296a = eVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo49848a(String str, Throwable th) {
            C13827t.super.mo49848a(str, th);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo49849b() {
            C13827t.super.mo49849b();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo49850c(int i) {
            C13827t.super.mo49850c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C13788e<ReqT, RespT> mo49857f() {
            return this.f22296a;
        }

        public /* bridge */ /* synthetic */ String toString() {
            return C13827t.super.toString();
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo49848a(String str, Throwable th) {
        super.mo49848a(str, th);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo49849b() {
        super.mo49849b();
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo49850c(int i) {
        super.mo49850c(i);
    }

    /* renamed from: d */
    public void mo49851d(ReqT reqt) {
        mo49857f().mo49851d(reqt);
    }

    /* renamed from: e */
    public void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
        mo49857f().mo46138e(aVar, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C13788e<ReqT, RespT> mo49857f();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
