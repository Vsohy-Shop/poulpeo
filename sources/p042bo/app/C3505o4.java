package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.o4 */
public final class C3505o4 {

    /* renamed from: a */
    private final C3557p4 f2296a;

    /* renamed from: b */
    private final String f2297b;

    public C3505o4(C3557p4 p4Var, String str) {
        C12775o.m28639i(p4Var, "pathType");
        C12775o.m28639i(str, "remoteUrl");
        this.f2296a = p4Var;
        this.f2297b = str;
    }

    /* renamed from: a */
    public final C3557p4 mo29447a() {
        return this.f2296a;
    }

    /* renamed from: b */
    public final String mo29448b() {
        return this.f2297b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3505o4)) {
            return false;
        }
        C3505o4 o4Var = (C3505o4) obj;
        if (this.f2296a == o4Var.f2296a && C12775o.m28634d(this.f2297b, o4Var.f2297b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2296a.hashCode() * 31) + this.f2297b.hashCode();
    }

    public String toString() {
        return "RemotePath(pathType=" + this.f2296a + ", remoteUrl=" + this.f2297b + ')';
    }
}
