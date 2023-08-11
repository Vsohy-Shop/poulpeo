package p139k3;

import p119i3.C8109b;
import p119i3.C8110c;
import p119i3.C8112e;
import p139k3.C8547n;

/* renamed from: k3.c */
/* compiled from: AutoValue_SendRequest */
final class C8527c extends C8547n {

    /* renamed from: a */
    private final C8549o f12170a;

    /* renamed from: b */
    private final String f12171b;

    /* renamed from: c */
    private final C8110c<?> f12172c;

    /* renamed from: d */
    private final C8112e<?, byte[]> f12173d;

    /* renamed from: e */
    private final C8109b f12174e;

    /* renamed from: k3.c$b */
    /* compiled from: AutoValue_SendRequest */
    static final class C8529b extends C8547n.C8548a {

        /* renamed from: a */
        private C8549o f12175a;

        /* renamed from: b */
        private String f12176b;

        /* renamed from: c */
        private C8110c<?> f12177c;

        /* renamed from: d */
        private C8112e<?, byte[]> f12178d;

        /* renamed from: e */
        private C8109b f12179e;

        C8529b() {
        }

        /* renamed from: a */
        public C8547n mo42574a() {
            String str = "";
            if (this.f12175a == null) {
                str = str + " transportContext";
            }
            if (this.f12176b == null) {
                str = str + " transportName";
            }
            if (this.f12177c == null) {
                str = str + " event";
            }
            if (this.f12178d == null) {
                str = str + " transformer";
            }
            if (this.f12179e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8527c(this.f12175a, this.f12176b, this.f12177c, this.f12178d, this.f12179e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C8547n.C8548a mo42575b(C8109b bVar) {
            if (bVar != null) {
                this.f12179e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C8547n.C8548a mo42576c(C8110c<?> cVar) {
            if (cVar != null) {
                this.f12177c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C8547n.C8548a mo42577d(C8112e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f12178d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: e */
        public C8547n.C8548a mo42578e(C8549o oVar) {
            if (oVar != null) {
                this.f12175a = oVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: f */
        public C8547n.C8548a mo42579f(String str) {
            if (str != null) {
                this.f12176b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    /* renamed from: b */
    public C8109b mo42566b() {
        return this.f12174e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8110c<?> mo42567c() {
        return this.f12172c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C8112e<?, byte[]> mo42568e() {
        return this.f12173d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8547n)) {
            return false;
        }
        C8547n nVar = (C8547n) obj;
        if (!this.f12170a.equals(nVar.mo42570f()) || !this.f12171b.equals(nVar.mo42571g()) || !this.f12172c.equals(nVar.mo42567c()) || !this.f12173d.equals(nVar.mo42568e()) || !this.f12174e.equals(nVar.mo42566b())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C8549o mo42570f() {
        return this.f12170a;
    }

    /* renamed from: g */
    public String mo42571g() {
        return this.f12171b;
    }

    public int hashCode() {
        return ((((((((this.f12170a.hashCode() ^ 1000003) * 1000003) ^ this.f12171b.hashCode()) * 1000003) ^ this.f12172c.hashCode()) * 1000003) ^ this.f12173d.hashCode()) * 1000003) ^ this.f12174e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f12170a + ", transportName=" + this.f12171b + ", event=" + this.f12172c + ", transformer=" + this.f12173d + ", encoding=" + this.f12174e + "}";
    }

    private C8527c(C8549o oVar, String str, C8110c<?> cVar, C8112e<?, byte[]> eVar, C8109b bVar) {
        this.f12170a = oVar;
        this.f12171b = str;
        this.f12172c = cVar;
        this.f12173d = eVar;
        this.f12174e = bVar;
    }
}
