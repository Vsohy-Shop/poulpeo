package p364io.grpc.internal;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.common.base.VerifyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;
import p111h6.C8023u;
import p364io.grpc.C12559l;
import p364io.grpc.C12561m;
import p364io.grpc.C12575p;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12506z1;

/* renamed from: io.grpc.internal.e2 */
/* compiled from: ServiceConfigUtil */
public final class C12245e2 {

    /* renamed from: io.grpc.internal.e2$a */
    /* compiled from: ServiceConfigUtil */
    public static final class C12246a {

        /* renamed from: a */
        private final String f19286a;

        /* renamed from: b */
        private final Map<String, ?> f19287b;

        public C12246a(String str, Map<String, ?> map) {
            this.f19286a = (String) C8012n.m15756o(str, "policyName");
            this.f19287b = (Map) C8012n.m15756o(map, "rawConfigValue");
        }

        /* renamed from: a */
        public String mo49805a() {
            return this.f19286a;
        }

        /* renamed from: b */
        public Map<String, ?> mo49806b() {
            return this.f19287b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12246a)) {
                return false;
            }
            C12246a aVar = (C12246a) obj;
            if (!this.f19286a.equals(aVar.f19286a) || !this.f19287b.equals(aVar.f19287b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f19286a, this.f19287b);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("policyName", this.f19286a).mo41840d("rawConfigValue", this.f19287b).toString();
        }
    }

    /* renamed from: io.grpc.internal.e2$b */
    /* compiled from: ServiceConfigUtil */
    public static final class C12247b {

        /* renamed from: a */
        final C12559l f19288a;

        /* renamed from: b */
        final Object f19289b;

        public C12247b(C12559l lVar, Object obj) {
            this.f19288a = (C12559l) C8012n.m15756o(lVar, "provider");
            this.f19289b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12247b.class != obj.getClass()) {
                return false;
            }
            C12247b bVar = (C12247b) obj;
            if (!C8007k.m15735a(this.f19288a, bVar.f19288a) || !C8007k.m15735a(this.f19289b, bVar.f19289b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f19288a, this.f19289b);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("provider", this.f19288a).mo41840d("config", this.f19289b).toString();
        }
    }

    private C12245e2() {
    }

    /* renamed from: A */
    public static List<C12246a> m26798A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> z : list) {
            arrayList.add(m26824z(z));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static Double m26799a(Map<String, ?> map) {
        return C12211b1.m26677h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    public static Map<String, ?> m26800b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C12211b1.m26679j(map, "healthCheckConfig");
    }

    /* renamed from: c */
    static Long m26801c(Map<String, ?> map) {
        return C12211b1.m26681l(map, "hedgingDelay");
    }

    /* renamed from: d */
    static Map<String, ?> m26802d(Map<String, ?> map) {
        return C12211b1.m26679j(map, "hedgingPolicy");
    }

    /* renamed from: e */
    static Long m26803e(Map<String, ?> map) {
        return C12211b1.m26681l(map, "initialBackoff");
    }

    /* renamed from: f */
    private static Set<C12594t.C12596b> m26804f(Map<String, ?> map, String str) {
        List<?> e = C12211b1.m26674e(map, str);
        if (e == null) {
            return null;
        }
        return m26819u(e);
    }

    /* renamed from: g */
    public static List<Map<String, ?>> m26805g(Map<String, ?> map) {
        String k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C12211b1.m26675f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k = C12211b1.m26680k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    static Integer m26806h(Map<String, ?> map) {
        return C12211b1.m26678i(map, "maxAttempts");
    }

    /* renamed from: i */
    static Integer m26807i(Map<String, ?> map) {
        return C12211b1.m26678i(map, "maxAttempts");
    }

    /* renamed from: j */
    static Long m26808j(Map<String, ?> map) {
        return C12211b1.m26681l(map, "maxBackoff");
    }

    /* renamed from: k */
    static Integer m26809k(Map<String, ?> map) {
        return C12211b1.m26678i(map, "maxRequestMessageBytes");
    }

    /* renamed from: l */
    static Integer m26810l(Map<String, ?> map) {
        return C12211b1.m26678i(map, "maxResponseMessageBytes");
    }

    /* renamed from: m */
    static List<Map<String, ?>> m26811m(Map<String, ?> map) {
        return C12211b1.m26675f(map, "methodConfig");
    }

    /* renamed from: n */
    static String m26812n(Map<String, ?> map) {
        return C12211b1.m26680k(map, "method");
    }

    /* renamed from: o */
    static List<Map<String, ?>> m26813o(Map<String, ?> map) {
        return C12211b1.m26675f(map, HintConstants.AUTOFILL_HINT_NAME);
    }

    /* renamed from: p */
    static Set<C12594t.C12596b> m26814p(Map<String, ?> map) {
        Set<C12594t.C12596b> f = m26804f(map, "nonFatalStatusCodes");
        if (f == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C12594t.C12596b.class));
        }
        C8023u.m15789a(!f.contains(C12594t.C12596b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f;
    }

    /* renamed from: q */
    static Long m26815q(Map<String, ?> map) {
        return C12211b1.m26681l(map, "perAttemptRecvTimeout");
    }

    /* renamed from: r */
    static Map<String, ?> m26816r(Map<String, ?> map) {
        return C12211b1.m26679j(map, "retryPolicy");
    }

    /* renamed from: s */
    static Set<C12594t.C12596b> m26817s(Map<String, ?> map) {
        boolean z;
        Set<C12594t.C12596b> f = m26804f(map, "retryableStatusCodes");
        if (f != null) {
            z = true;
        } else {
            z = false;
        }
        C8023u.m15789a(z, "%s is required in retry policy", "retryableStatusCodes");
        C8023u.m15789a(true ^ f.contains(C12594t.C12596b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f;
    }

    /* renamed from: t */
    static String m26818t(Map<String, ?> map) {
        return C12211b1.m26680k(map, NotificationCompat.CATEGORY_SERVICE);
    }

    /* renamed from: u */
    private static Set<C12594t.C12596b> m26819u(List<?> list) {
        C12594t.C12596b bVar;
        boolean z;
        EnumSet<E> noneOf = EnumSet.noneOf(C12594t.C12596b.class);
        for (Object next : list) {
            if (next instanceof Double) {
                Double d = (Double) next;
                int intValue = d.intValue();
                boolean z2 = true;
                if (((double) intValue) == d.doubleValue()) {
                    z = true;
                } else {
                    z = false;
                }
                C8023u.m15789a(z, "Status code %s is not integral", next);
                bVar = C12594t.m27923i(intValue).mo50306n();
                if (bVar.mo50313c() != d.intValue()) {
                    z2 = false;
                }
                C8023u.m15789a(z2, "Status code %s is not valid", next);
            } else if (next instanceof String) {
                try {
                    bVar = C12594t.C12596b.valueOf((String) next);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException("Status code " + next + " is not valid", e);
                }
            } else {
                throw new VerifyException("Can not convert status code " + next + " to Status.Code, because its type is " + next.getClass());
            }
            noneOf.add(bVar);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* renamed from: v */
    static C12506z1.C12520c0 m26820v(Map<String, ?> map) {
        Map<String, ?> j;
        boolean z;
        if (map == null || (j = C12211b1.m26679j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = C12211b1.m26677h(j, "maxTokens").floatValue();
        float floatValue2 = C12211b1.m26677h(j, "tokenRatio").floatValue();
        boolean z2 = true;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z2 = false;
        }
        C8012n.m15762u(z2, "tokenRatio should be greater than zero");
        return new C12506z1.C12520c0(floatValue, floatValue2);
    }

    /* renamed from: w */
    static Long m26821w(Map<String, ?> map) {
        return C12211b1.m26681l(map, "timeout");
    }

    /* renamed from: x */
    static Boolean m26822x(Map<String, ?> map) {
        return C12211b1.m26673d(map, "waitForReady");
    }

    /* renamed from: y */
    public static C12575p.C12579c m26823y(List<C12246a> list, C12561m mVar) {
        ArrayList arrayList = new ArrayList();
        for (C12246a next : list) {
            String a = next.mo49805a();
            C12559l d = mVar.mo50237d(a);
            if (d == null) {
                arrayList.add(a);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(C12245e2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                C12575p.C12579c e = d.mo48972e(next.mo49806b());
                if (e.mo50278d() != null) {
                    return e;
                }
                return C12575p.C12579c.m27876a(new C12247b(d, e.mo50277c()));
            }
        }
        C12594t tVar = C12594t.f20185h;
        return C12575p.C12579c.m27877b(tVar.mo50310r("None of " + arrayList + " specified by Service Config are available."));
    }

    /* renamed from: z */
    public static C12246a m26824z(Map<String, ?> map) {
        if (map.size() == 1) {
            String str = (String) map.entrySet().iterator().next().getKey();
            return new C12246a(str, C12211b1.m26679j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
