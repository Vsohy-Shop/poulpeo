package p364io.grpc;

import java.util.Map;
import p111h6.C8003j;
import p364io.grpc.C12546k;
import p364io.grpc.C12575p;

/* renamed from: io.grpc.l */
/* compiled from: LoadBalancerProvider */
public abstract class C12559l extends C12546k.C12550c {

    /* renamed from: a */
    private static final C12575p.C12579c f20128a = C12575p.C12579c.m27876a(new C12560a());

    /* renamed from: io.grpc.l$a */
    /* compiled from: LoadBalancerProvider */
    private static final class C12560a {
        C12560a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: b */
    public abstract String mo48969b();

    /* renamed from: c */
    public abstract int mo48970c();

    /* renamed from: d */
    public abstract boolean mo48971d();

    /* renamed from: e */
    public C12575p.C12579c mo48972e(Map<String, ?> map) {
        return f20128a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return C8003j.m15723c(this).mo41840d("policy", mo48969b()).mo41838b("priority", mo48970c()).mo41841e("available", mo48971d()).toString();
    }
}
