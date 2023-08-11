package p031b0;

import kotlin.jvm.internal.C12775o;
import p042bo.app.C3789x4;

/* renamed from: b0.c */
public final class C2806c {

    /* renamed from: a */
    private final C3789x4 f1109a;

    public C2806c(C3789x4 x4Var) {
        C12775o.m28639i(x4Var, "sdkAuthError");
        this.f1109a = x4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2806c) && C12775o.m28634d(this.f1109a, ((C2806c) obj).f1109a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1109a.hashCode();
    }

    public String toString() {
        return this.f1109a.toString();
    }
}
