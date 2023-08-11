package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.d5 */
public final class C3099d5 {

    /* renamed from: a */
    private final C3046c5 f1636a;

    public C3099d5(C3046c5 c5Var) {
        C12775o.m28639i(c5Var, "serverConfig");
        this.f1636a = c5Var;
    }

    /* renamed from: a */
    public final C3046c5 mo28824a() {
        return this.f1636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3099d5) && C12775o.m28634d(this.f1636a, ((C3099d5) obj).f1636a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1636a.hashCode();
    }

    public String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f1636a + ')';
    }
}
