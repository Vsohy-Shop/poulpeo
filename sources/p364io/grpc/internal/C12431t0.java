package p364io.grpc.internal;

import com.google.common.collect.C6826n;
import java.util.Set;
import p111h6.C8003j;
import p111h6.C8007k;
import p364io.grpc.C12594t;

/* renamed from: io.grpc.internal.t0 */
/* compiled from: HedgingPolicy */
final class C12431t0 {

    /* renamed from: a */
    final int f19832a;

    /* renamed from: b */
    final long f19833b;

    /* renamed from: c */
    final Set<C12594t.C12596b> f19834c;

    C12431t0(int i, long j, Set<C12594t.C12596b> set) {
        this.f19832a = i;
        this.f19833b = j;
        this.f19834c = C6826n.m11673v(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12431t0.class != obj.getClass()) {
            return false;
        }
        C12431t0 t0Var = (C12431t0) obj;
        if (this.f19832a == t0Var.f19832a && this.f19833b == t0Var.f19833b && C8007k.m15735a(this.f19834c, t0Var.f19834c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8007k.m15736b(Integer.valueOf(this.f19832a), Long.valueOf(this.f19833b), this.f19834c);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41838b("maxAttempts", this.f19832a).mo41839c("hedgingDelayNanos", this.f19833b).mo41840d("nonFatalStatusCodes", this.f19834c).toString();
    }
}
