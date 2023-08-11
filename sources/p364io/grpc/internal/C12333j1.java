package p364io.grpc.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p111h6.C8018q;
import p364io.grpc.C12159b;
import p364io.grpc.C12169g;
import p364io.grpc.C12546k;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12506z1;
import p458xd.C13783d0;

/* renamed from: io.grpc.internal.j1 */
/* compiled from: ManagedChannelServiceConfig */
final class C12333j1 {

    /* renamed from: a */
    private final C12335b f19560a;

    /* renamed from: b */
    private final Map<String, C12335b> f19561b;

    /* renamed from: c */
    private final Map<String, C12335b> f19562c;

    /* renamed from: d */
    private final C12506z1.C12520c0 f19563d;

    /* renamed from: e */
    private final Object f19564e;

    /* renamed from: f */
    private final Map<String, ?> f19565f;

    /* renamed from: io.grpc.internal.j1$b */
    /* compiled from: ManagedChannelServiceConfig */
    static final class C12335b {

        /* renamed from: g */
        static final C12159b.C12160a<C12335b> f19566g = C12159b.C12160a.m26541b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        final Long f19567a;

        /* renamed from: b */
        final Boolean f19568b;

        /* renamed from: c */
        final Integer f19569c;

        /* renamed from: d */
        final Integer f19570d;

        /* renamed from: e */
        final C12189a2 f19571e;

        /* renamed from: f */
        final C12431t0 f19572f;

        C12335b(Map<String, ?> map, boolean z, int i, int i2) {
            Map<String, ?> map2;
            C12189a2 a2Var;
            Map<String, ?> map3;
            boolean z2;
            this.f19567a = C12245e2.m26821w(map);
            this.f19568b = C12245e2.m26822x(map);
            Integer l = C12245e2.m26810l(map);
            this.f19569c = l;
            boolean z3 = true;
            if (l != null) {
                if (l.intValue() >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C8012n.m15751j(z2, "maxInboundMessageSize %s exceeds bounds", l);
            }
            Integer k = C12245e2.m26809k(map);
            this.f19570d = k;
            if (k != null) {
                C8012n.m15751j(k.intValue() < 0 ? false : z3, "maxOutboundMessageSize %s exceeds bounds", k);
            }
            C12431t0 t0Var = null;
            if (z) {
                map2 = C12245e2.m26816r(map);
            } else {
                map2 = null;
            }
            if (map2 == null) {
                a2Var = null;
            } else {
                a2Var = m27100b(map2, i);
            }
            this.f19571e = a2Var;
            if (z) {
                map3 = C12245e2.m26802d(map);
            } else {
                map3 = null;
            }
            this.f19572f = map3 != null ? m27099a(map3, i2) : t0Var;
        }

        /* renamed from: a */
        private static C12431t0 m27099a(Map<String, ?> map, int i) {
            boolean z;
            int intValue = ((Integer) C8012n.m15756o(C12245e2.m26806h(map), "maxAttempts cannot be empty")).intValue();
            boolean z2 = true;
            if (intValue >= 2) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15749h(z, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) C8012n.m15756o(C12245e2.m26801c(map), "hedgingDelay cannot be empty")).longValue();
            if (longValue < 0) {
                z2 = false;
            }
            C8012n.m15750i(z2, "hedgingDelay must not be negative: %s", longValue);
            return new C12431t0(min, longValue, C12245e2.m26814p(map));
        }

        /* renamed from: b */
        private static C12189a2 m27100b(Map<String, ?> map, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            int intValue = ((Integer) C8012n.m15756o(C12245e2.m26807i(map), "maxAttempts cannot be empty")).intValue();
            boolean z6 = true;
            if (intValue >= 2) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15749h(z, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) C8012n.m15756o(C12245e2.m26803e(map), "initialBackoff cannot be empty")).longValue();
            if (longValue > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8012n.m15750i(z2, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) C8012n.m15756o(C12245e2.m26808j(map), "maxBackoff cannot be empty")).longValue();
            if (longValue2 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C8012n.m15750i(z3, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) C8012n.m15756o(C12245e2.m26799a(map), "backoffMultiplier cannot be empty")).doubleValue();
            if (doubleValue > 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            C8012n.m15751j(z4, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q = C12245e2.m26815q(map);
            if (q == null || q.longValue() >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            C8012n.m15751j(z5, "perAttemptRecvTimeout cannot be negative: %s", q);
            Set<C12594t.C12596b> s = C12245e2.m26817s(map);
            if (q == null && s.isEmpty()) {
                z6 = false;
            }
            C8012n.m15746e(z6, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C12189a2(min, longValue, longValue2, doubleValue, q, s);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12335b)) {
                return false;
            }
            C12335b bVar = (C12335b) obj;
            if (!C8007k.m15735a(this.f19567a, bVar.f19567a) || !C8007k.m15735a(this.f19568b, bVar.f19568b) || !C8007k.m15735a(this.f19569c, bVar.f19569c) || !C8007k.m15735a(this.f19570d, bVar.f19570d) || !C8007k.m15735a(this.f19571e, bVar.f19571e) || !C8007k.m15735a(this.f19572f, bVar.f19572f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f19567a, this.f19568b, this.f19569c, this.f19570d, this.f19571e, this.f19572f);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("timeoutNanos", this.f19567a).mo41840d("waitForReady", this.f19568b).mo41840d("maxInboundMessageSize", this.f19569c).mo41840d("maxOutboundMessageSize", this.f19570d).mo41840d("retryPolicy", this.f19571e).mo41840d("hedgingPolicy", this.f19572f).toString();
        }
    }

    /* renamed from: io.grpc.internal.j1$c */
    /* compiled from: ManagedChannelServiceConfig */
    static final class C12336c extends C12169g {

        /* renamed from: b */
        final C12333j1 f19573b;

        /* renamed from: a */
        public C12169g.C12171b mo49654a(C12546k.C12553f fVar) {
            return C12169g.C12171b.m26558d().mo49659b(this.f19573b).mo49658a();
        }

        private C12336c(C12333j1 j1Var) {
            this.f19573b = j1Var;
        }
    }

    C12333j1(C12335b bVar, Map<String, C12335b> map, Map<String, C12335b> map2, C12506z1.C12520c0 c0Var, Object obj, Map<String, ?> map3) {
        Map<String, ?> map4;
        this.f19560a = bVar;
        this.f19561b = Collections.unmodifiableMap(new HashMap(map));
        this.f19562c = Collections.unmodifiableMap(new HashMap(map2));
        this.f19563d = c0Var;
        this.f19564e = obj;
        if (map3 != null) {
            map4 = Collections.unmodifiableMap(new HashMap(map3));
        } else {
            map4 = null;
        }
        this.f19565f = map4;
    }

    /* renamed from: a */
    static C12333j1 m27092a() {
        return new C12333j1((C12335b) null, new HashMap(), new HashMap(), (C12506z1.C12520c0) null, (Object) null, (Map<String, ?>) null);
    }

    /* renamed from: b */
    static C12333j1 m27093b(Map<String, ?> map, boolean z, int i, int i2, Object obj) {
        C12506z1.C12520c0 c0Var;
        boolean z2 = z;
        if (z2) {
            c0Var = C12245e2.m26820v(map);
        } else {
            c0Var = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b = C12245e2.m26800b(map);
        List<Map<String, ?>> m = C12245e2.m26811m(map);
        if (m == null) {
            return new C12333j1((C12335b) null, hashMap, hashMap2, c0Var, obj, b);
        }
        C12335b bVar = null;
        for (Map next : m) {
            C12335b bVar2 = new C12335b(next, z2, i, i2);
            List<Map<String, ?>> o = C12245e2.m26813o(next);
            if (o != null && !o.isEmpty()) {
                for (Map next2 : o) {
                    String t = C12245e2.m26818t(next2);
                    String n = C12245e2.m26812n(next2);
                    boolean z3 = true;
                    if (C8018q.m15777b(t)) {
                        C8012n.m15751j(C8018q.m15777b(n), "missing service name for method %s", n);
                        if (bVar != null) {
                            z3 = false;
                        }
                        C8012n.m15751j(z3, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else {
                        Map<String, ?> map2 = map;
                        if (C8018q.m15777b(n)) {
                            C8012n.m15751j(!hashMap2.containsKey(t), "Duplicate service %s", t);
                            hashMap2.put(t, bVar2);
                        } else {
                            String b2 = C13783d0.m31649b(t, n);
                            C8012n.m15751j(!hashMap.containsKey(b2), "Duplicate method name %s", b2);
                            hashMap.put(b2, bVar2);
                        }
                    }
                }
            }
            Map<String, ?> map3 = map;
        }
        return new C12333j1(bVar, hashMap, hashMap2, c0Var, obj, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12169g mo49966c() {
        if (!this.f19562c.isEmpty() || !this.f19561b.isEmpty() || this.f19560a != null) {
            return new C12336c();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, ?> mo49967d() {
        return this.f19565f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Object mo49968e() {
        return this.f19564e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12333j1.class != obj.getClass()) {
            return false;
        }
        C12333j1 j1Var = (C12333j1) obj;
        if (!C8007k.m15735a(this.f19560a, j1Var.f19560a) || !C8007k.m15735a(this.f19561b, j1Var.f19561b) || !C8007k.m15735a(this.f19562c, j1Var.f19562c) || !C8007k.m15735a(this.f19563d, j1Var.f19563d) || !C8007k.m15735a(this.f19564e, j1Var.f19564e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12335b mo49970f(C13783d0<?, ?> d0Var) {
        C12335b bVar = this.f19561b.get(d0Var.mo53437c());
        if (bVar == null) {
            bVar = this.f19562c.get(d0Var.mo53438d());
        }
        if (bVar == null) {
            return this.f19560a;
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C12506z1.C12520c0 mo49971g() {
        return this.f19563d;
    }

    public int hashCode() {
        return C8007k.m15736b(this.f19560a, this.f19561b, this.f19562c, this.f19563d, this.f19564e);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("defaultMethodConfig", this.f19560a).mo41840d("serviceMethodMap", this.f19561b).mo41840d("serviceMap", this.f19562c).mo41840d("retryThrottling", this.f19563d).mo41840d("loadBalancingConfig", this.f19564e).toString();
    }
}
