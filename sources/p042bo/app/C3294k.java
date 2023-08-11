package p042bo.app;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.k */
public final class C3294k implements C3223i2 {

    /* renamed from: b */
    private final Set<C3785x1> f1953b;

    /* renamed from: c */
    private final boolean f1954c;

    public C3294k(Set<? extends C3785x1> set) {
        C12775o.m28639i(set, "eventsList");
        this.f1953b = set;
        this.f1954c = set.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo29167a() {
        boolean z;
        Set<C3785x1> set = this.f1953b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (C3785x1 j : set) {
            if (j.mo29052j() == C3040c1.SESSION_START) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Set<C3785x1> mo29168b() {
        return this.f1953b;
    }

    /* renamed from: e */
    public boolean mo28586e() {
        return this.f1954c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3294k) && C12775o.m28634d(this.f1953b, ((C3294k) obj).f1953b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1953b.hashCode();
    }

    public String toString() {
        return "BrazeEventContainer(eventsList=" + this.f1953b + ')';
    }
}
