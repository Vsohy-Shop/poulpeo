package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.i5 */
public final class C3236i5 {

    /* renamed from: a */
    private final C3208h5 f1839a;

    public C3236i5(C3208h5 h5Var) {
        C12775o.m28639i(h5Var, "session");
        this.f1839a = h5Var;
        if (!(!h5Var.mo29011y())) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
        }
    }

    /* renamed from: a */
    public final C3208h5 mo29037a() {
        return this.f1839a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3236i5) && C12775o.m28634d(this.f1839a, ((C3236i5) obj).f1839a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1839a.hashCode();
    }

    public String toString() {
        return "SessionCreatedEvent(session=" + this.f1839a + ')';
    }
}
