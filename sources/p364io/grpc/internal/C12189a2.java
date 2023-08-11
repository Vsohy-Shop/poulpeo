package p364io.grpc.internal;

import com.google.common.collect.C6826n;
import java.util.Set;
import p111h6.C8003j;
import p111h6.C8007k;
import p364io.grpc.C12594t;

/* renamed from: io.grpc.internal.a2 */
/* compiled from: RetryPolicy */
final class C12189a2 {

    /* renamed from: a */
    final int f19140a;

    /* renamed from: b */
    final long f19141b;

    /* renamed from: c */
    final long f19142c;

    /* renamed from: d */
    final double f19143d;

    /* renamed from: e */
    final Long f19144e;

    /* renamed from: f */
    final Set<C12594t.C12596b> f19145f;

    C12189a2(int i, long j, long j2, double d, Long l, Set<C12594t.C12596b> set) {
        this.f19140a = i;
        this.f19141b = j;
        this.f19142c = j2;
        this.f19143d = d;
        this.f19144e = l;
        this.f19145f = C6826n.m11673v(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12189a2)) {
            return false;
        }
        C12189a2 a2Var = (C12189a2) obj;
        if (this.f19140a == a2Var.f19140a && this.f19141b == a2Var.f19141b && this.f19142c == a2Var.f19142c && Double.compare(this.f19143d, a2Var.f19143d) == 0 && C8007k.m15735a(this.f19144e, a2Var.f19144e) && C8007k.m15735a(this.f19145f, a2Var.f19145f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C8007k.m15736b(Integer.valueOf(this.f19140a), Long.valueOf(this.f19141b), Long.valueOf(this.f19142c), Double.valueOf(this.f19143d), this.f19144e, this.f19145f);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41838b("maxAttempts", this.f19140a).mo41839c("initialBackoffNanos", this.f19141b).mo41839c("maxBackoffNanos", this.f19142c).mo41837a("backoffMultiplier", this.f19143d).mo41840d("perAttemptRecvTimeoutNanos", this.f19144e).mo41840d("retryableStatusCodes", this.f19145f).toString();
    }
}
