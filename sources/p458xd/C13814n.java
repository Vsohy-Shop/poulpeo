package p458xd;

import p111h6.C8012n;
import p364io.grpc.C12594t;

/* renamed from: xd.n */
/* compiled from: ConnectivityStateInfo */
public final class C13814n {

    /* renamed from: a */
    private final C13813m f22277a;

    /* renamed from: b */
    private final C12594t f22278b;

    private C13814n(C13813m mVar, C12594t tVar) {
        this.f22277a = (C13813m) C8012n.m15756o(mVar, "state is null");
        this.f22278b = (C12594t) C8012n.m15756o(tVar, "status is null");
    }

    /* renamed from: a */
    public static C13814n m31720a(C13813m mVar) {
        boolean z;
        if (mVar != C13813m.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15746e(z, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C13814n(mVar, C12594t.f20183f);
    }

    /* renamed from: b */
    public static C13814n m31721b(C12594t tVar) {
        C8012n.m15746e(!tVar.mo50308p(), "The error status must not be OK");
        return new C13814n(C13813m.TRANSIENT_FAILURE, tVar);
    }

    /* renamed from: c */
    public C13813m mo53469c() {
        return this.f22277a;
    }

    /* renamed from: d */
    public C12594t mo53470d() {
        return this.f22278b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13814n)) {
            return false;
        }
        C13814n nVar = (C13814n) obj;
        if (!this.f22277a.equals(nVar.f22277a) || !this.f22278b.equals(nVar.f22278b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f22277a.hashCode() ^ this.f22278b.hashCode();
    }

    public String toString() {
        if (this.f22278b.mo50308p()) {
            return this.f22277a.toString();
        }
        return this.f22277a + "(" + this.f22278b + ")";
    }
}
