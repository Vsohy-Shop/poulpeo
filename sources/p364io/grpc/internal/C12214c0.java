package p364io.grpc.internal;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.common.base.VerifyException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p111h6.C8016p;
import p111h6.C8020s;
import p111h6.C8023u;
import p364io.grpc.C12155a;
import p364io.grpc.C12167e;
import p364io.grpc.C12575p;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12259f2;
import p458xd.C13792f0;
import p458xd.C13794g0;
import p458xd.C13805j0;

/* renamed from: io.grpc.internal.c0 */
/* compiled from: DnsNameResolver */
public class C12214c0 extends C12575p {

    /* renamed from: A */
    private static final C12222g f19196A;

    /* renamed from: B */
    private static String f19197B;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Logger f19198s;

    /* renamed from: t */
    private static final Set<String> f19199t = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    /* renamed from: u */
    private static final String f19200u;

    /* renamed from: v */
    private static final String f19201v;

    /* renamed from: w */
    private static final String f19202w;

    /* renamed from: x */
    static boolean f19203x;

    /* renamed from: y */
    static boolean f19204y;

    /* renamed from: z */
    protected static boolean f19205z;

    /* renamed from: a */
    final C13794g0 f19206a;

    /* renamed from: b */
    private final Random f19207b = new Random();

    /* renamed from: c */
    protected volatile C12216b f19208c = C12218d.INSTANCE;

    /* renamed from: d */
    private final AtomicReference<C12221f> f19209d = new AtomicReference<>();

    /* renamed from: e */
    private final String f19210e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f19211f;

    /* renamed from: g */
    private final int f19212g;

    /* renamed from: h */
    private final C12259f2.C12263d<Executor> f19213h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f19214i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C13805j0 f19215j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C8016p f19216k;

    /* renamed from: l */
    protected boolean f19217l;

    /* renamed from: m */
    private boolean f19218m;

    /* renamed from: n */
    private Executor f19219n;

    /* renamed from: o */
    private final boolean f19220o;

    /* renamed from: p */
    private final C12575p.C12585h f19221p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f19222q;

    /* renamed from: r */
    private C12575p.C12581e f19223r;

    /* renamed from: io.grpc.internal.c0$b */
    /* compiled from: DnsNameResolver */
    public interface C12216b {
        /* renamed from: a */
        List<InetAddress> mo49759a(String str);
    }

    /* renamed from: io.grpc.internal.c0$c */
    /* compiled from: DnsNameResolver */
    protected static final class C12217c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12594t f19224a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<C12167e> f19225b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C12575p.C12579c f19226c;

        /* renamed from: d */
        public C12155a f19227d;

        private C12217c() {
        }
    }

    /* renamed from: io.grpc.internal.c0$d */
    /* compiled from: DnsNameResolver */
    private enum C12218d implements C12216b {
        INSTANCE;

        /* renamed from: a */
        public List<InetAddress> mo49759a(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* renamed from: io.grpc.internal.c0$e */
    /* compiled from: DnsNameResolver */
    private final class C12219e implements Runnable {

        /* renamed from: b */
        private final C12575p.C12581e f19230b;

        /* renamed from: io.grpc.internal.c0$e$a */
        /* compiled from: DnsNameResolver */
        class C12220a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ boolean f19232b;

            C12220a(boolean z) {
                this.f19232b = z;
            }

            public void run() {
                if (this.f19232b) {
                    C12214c0 c0Var = C12214c0.this;
                    c0Var.f19217l = true;
                    if (c0Var.f19214i > 0) {
                        C12214c0.this.f19216k.mo41848f().mo41849g();
                    }
                }
                boolean unused = C12214c0.this.f19222q = false;
            }
        }

        C12219e(C12575p.C12581e eVar) {
            this.f19230b = (C12575p.C12581e) C8012n.m15756o(eVar, "savedListener");
        }

        public void run() {
            C13805j0 f;
            C12220a aVar;
            Logger g = C12214c0.f19198s;
            Level level = Level.FINER;
            if (g.isLoggable(level)) {
                C12214c0.f19198s.finer("Attempting DNS resolution of " + C12214c0.this.f19211f);
            }
            boolean z = true;
            C12217c cVar = null;
            try {
                C12167e i = C12214c0.this.m26700n();
                C12575p.C12583g.C12584a d = C12575p.C12583g.m27887d();
                if (i != null) {
                    if (C12214c0.f19198s.isLoggable(level)) {
                        C12214c0.f19198s.finer("Using proxy address " + i);
                    }
                    d.mo50290b(Collections.singletonList(i));
                } else {
                    cVar = C12214c0.this.mo49757o(false);
                    if (cVar.f19224a != null) {
                        this.f19230b.mo49877a(cVar.f19224a);
                        if (cVar == null || cVar.f19224a != null) {
                            z = false;
                        }
                        C12214c0.this.f19215j.execute(new C12220a(z));
                        return;
                    }
                    if (cVar.f19225b != null) {
                        d.mo50290b(cVar.f19225b);
                    }
                    if (cVar.f19226c != null) {
                        d.mo50292d(cVar.f19226c);
                    }
                    C12155a aVar2 = cVar.f19227d;
                    if (aVar2 != null) {
                        d.mo50291c(aVar2);
                    }
                }
                this.f19230b.mo49878c(d.mo50289a());
                if (cVar == null || cVar.f19224a != null) {
                    z = false;
                }
                f = C12214c0.this.f19215j;
                aVar = new C12220a(z);
            } catch (IOException e) {
                this.f19230b.mo49877a(C12594t.f20198u.mo50310r("Unable to resolve host " + C12214c0.this.f19211f).mo50309q(e));
                if (cVar == null || cVar.f19224a != null) {
                    z = false;
                }
                f = C12214c0.this.f19215j;
                aVar = new C12220a(z);
            } catch (Throwable th) {
                if (cVar == null || cVar.f19224a != null) {
                    z = false;
                }
                C12214c0.this.f19215j.execute(new C12220a(z));
                throw th;
            }
            f.execute(aVar);
        }
    }

    /* renamed from: io.grpc.internal.c0$f */
    /* compiled from: DnsNameResolver */
    public interface C12221f {
        /* renamed from: a */
        List<String> mo49762a(String str);
    }

    /* renamed from: io.grpc.internal.c0$g */
    /* compiled from: DnsNameResolver */
    interface C12222g {
        /* renamed from: a */
        C12221f mo49763a();

        /* renamed from: b */
        Throwable mo49764b();
    }

    static {
        Class<C12214c0> cls = C12214c0.class;
        f19198s = Logger.getLogger(cls.getName());
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f19200u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f19201v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f19202w = property3;
        f19203x = Boolean.parseBoolean(property);
        f19204y = Boolean.parseBoolean(property2);
        f19205z = Boolean.parseBoolean(property3);
        f19196A = m26706v(cls.getClassLoader());
    }

    protected C12214c0(String str, String str2, C12575p.C12577b bVar, C12259f2.C12263d<Executor> dVar, C8016p pVar, boolean z) {
        boolean z2;
        C8012n.m15756o(bVar, "args");
        this.f19213h = dVar;
        URI create = URI.create("//" + ((String) C8012n.m15756o(str2, HintConstants.AUTOFILL_HINT_NAME)));
        boolean z3 = true;
        if (create.getHost() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C8012n.m15751j(z2, "Invalid DNS name: %s", str2);
        this.f19210e = (String) C8012n.m15757p(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f19211f = create.getHost();
        if (create.getPort() == -1) {
            this.f19212g = bVar.mo50263a();
        } else {
            this.f19212g = create.getPort();
        }
        this.f19206a = (C13794g0) C8012n.m15756o(bVar.mo50265c(), "proxyDetector");
        this.f19214i = m26704s(z);
        this.f19216k = (C8016p) C8012n.m15756o(pVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.f19215j = (C13805j0) C8012n.m15756o(bVar.mo50267e(), "syncContext");
        Executor b = bVar.mo50264b();
        this.f19219n = b;
        this.f19220o = b != null ? false : z3;
        this.f19221p = (C12575p.C12585h) C8012n.m15756o(bVar.mo50266d(), "serviceConfigParser");
    }

    /* renamed from: A */
    private List<C12167e> m26689A() {
        try {
            List<InetAddress> a = this.f19208c.mo49759a(this.f19211f);
            ArrayList arrayList = new ArrayList(a.size());
            for (InetAddress inetSocketAddress : a) {
                arrayList.add(new C12167e((SocketAddress) new InetSocketAddress(inetSocketAddress, this.f19212g)));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception e) {
            C8020s.m15785f(e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            if (e != null) {
                f19198s.log(Level.FINE, "Address resolution failure", e);
            }
            throw th;
        }
    }

    /* renamed from: B */
    private C12575p.C12579c m26690B() {
        List<String> emptyList = Collections.emptyList();
        C12221f u = mo49758u();
        if (u != null) {
            try {
                emptyList = u.mo49762a("_grpc_config." + this.f19211f);
            } catch (Exception e) {
                f19198s.log(Level.FINE, "ServiceConfig resolution failure", e);
            }
        }
        if (!emptyList.isEmpty()) {
            C12575p.C12579c x = m26708x(emptyList, this.f19207b, m26703r());
            if (x == null) {
                return null;
            }
            if (x.mo50278d() != null) {
                return C12575p.C12579c.m27877b(x.mo50278d());
            }
            return this.f19221p.mo49746a((Map) x.mo50277c());
        }
        f19198s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f19211f});
        return null;
    }

    /* renamed from: C */
    protected static boolean m26691C(boolean z, boolean z2, String str) {
        boolean z3;
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z4 = true;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '.') {
                if (charAt < '0' || charAt > '9') {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z4 &= z3;
            }
        }
        return true ^ z4;
    }

    /* renamed from: m */
    private boolean m26699m() {
        if (this.f19217l) {
            long j = this.f19214i;
            if (j == 0 || (j > 0 && this.f19216k.mo41847d(TimeUnit.NANOSECONDS) > this.f19214i)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public C12167e m26700n() {
        C13792f0 a = this.f19206a.mo50044a(InetSocketAddress.createUnresolved(this.f19211f, this.f19212g));
        if (a != null) {
            return new C12167e((SocketAddress) a);
        }
        return null;
    }

    /* renamed from: p */
    private static final List<String> m26701p(Map<String, ?> map) {
        return C12211b1.m26676g(map, "clientLanguage");
    }

    /* renamed from: q */
    private static final List<String> m26702q(Map<String, ?> map) {
        return C12211b1.m26676g(map, "clientHostname");
    }

    /* renamed from: r */
    private static String m26703r() {
        if (f19197B == null) {
            try {
                f19197B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f19197B;
    }

    /* renamed from: s */
    private static long m26704s(boolean z) {
        if (z) {
            return 0;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f19198s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        if (j > 0) {
            return TimeUnit.SECONDS.toNanos(j);
        }
        return j;
    }

    /* renamed from: t */
    private static final Double m26705t(Map<String, ?> map) {
        return C12211b1.m26677h(map, "percentage");
    }

    /* renamed from: v */
    static C12222g m26706v(ClassLoader classLoader) {
        try {
            try {
                try {
                    C12222g gVar = (C12222g) Class.forName("io.grpc.internal.z0", true, classLoader).asSubclass(C12222g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gVar.mo49764b() == null) {
                        return gVar;
                    }
                    f19198s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.mo49764b());
                    return null;
                } catch (Exception e) {
                    f19198s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", e);
                    return null;
                }
            } catch (Exception e2) {
                f19198s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", e2);
                return null;
            }
        } catch (ClassNotFoundException e3) {
            f19198s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", e3);
            return null;
        } catch (ClassCastException e4) {
            f19198s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", e4);
            return null;
        }
    }

    /* renamed from: w */
    static Map<String, ?> m26707w(Map<String, ?> map, Random random, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        for (Map.Entry next : map.entrySet()) {
            C8023u.m15789a(f19199t.contains(next.getKey()), "Bad key: %s", next);
        }
        List<String> p = m26701p(map);
        if (p != null && !p.isEmpty()) {
            Iterator<String> it = p.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            if (!z3) {
                return null;
            }
        }
        Double t = m26705t(map);
        if (t != null) {
            int intValue = t.intValue();
            if (intValue < 0 || intValue > 100) {
                z2 = false;
            } else {
                z2 = true;
            }
            C8023u.m15789a(z2, "Bad percentage: %s", t);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q = m26702q(map);
        if (q != null && !q.isEmpty()) {
            Iterator<String> it2 = q.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return null;
            }
        }
        Map<String, ?> j = C12211b1.m26679j(map, "serviceConfig");
        if (j != null) {
            return j;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", new Object[]{map, "serviceConfig"}));
    }

    /* renamed from: x */
    static C12575p.C12579c m26708x(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map w : m26709y(list)) {
                try {
                    map = m26707w(w, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e) {
                    return C12575p.C12579c.m27877b(C12594t.f20185h.mo50310r("failed to pick service config choice").mo50309q(e));
                }
            }
            if (map == null) {
                return null;
            }
            return C12575p.C12579c.m27876a(map);
        } catch (IOException | RuntimeException e2) {
            return C12575p.C12579c.m27877b(C12594t.f20185h.mo50310r("failed to parse TXT records").mo50309q(e2));
        }
    }

    /* renamed from: y */
    static List<Map<String, ?>> m26709y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!next.startsWith("grpc_config=")) {
                f19198s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{next});
            } else {
                Object a = C12187a1.m26634a(next.substring(12));
                if (a instanceof List) {
                    arrayList.addAll(C12211b1.m26670a((List) a));
                } else {
                    throw new ClassCastException("wrong type " + a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private void m26710z() {
        if (!this.f19222q && !this.f19218m && m26699m()) {
            this.f19222q = true;
            this.f19219n.execute(new C12219e(this.f19223r));
        }
    }

    /* renamed from: a */
    public String mo49753a() {
        return this.f19210e;
    }

    /* renamed from: b */
    public void mo49754b() {
        boolean z;
        if (this.f19223r != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "not started");
        m26710z();
    }

    /* renamed from: c */
    public void mo49755c() {
        if (!this.f19218m) {
            this.f19218m = true;
            Executor executor = this.f19219n;
            if (executor != null && this.f19220o) {
                this.f19219n = (Executor) C12259f2.m26842f(this.f19213h, executor);
            }
        }
    }

    /* renamed from: d */
    public void mo49756d(C12575p.C12581e eVar) {
        boolean z;
        if (this.f19223r == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "already started");
        if (this.f19220o) {
            this.f19219n = (Executor) C12259f2.m26841d(this.f19213h);
        }
        this.f19223r = (C12575p.C12581e) C8012n.m15756o(eVar, "listener");
        m26710z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C12217c mo49757o(boolean z) {
        C12217c cVar = new C12217c();
        try {
            List unused = cVar.f19225b = m26689A();
        } catch (Exception e) {
            if (!z) {
                C12594t tVar = C12594t.f20198u;
                C12594t unused2 = cVar.f19224a = tVar.mo50310r("Unable to resolve host " + this.f19211f).mo50309q(e);
                return cVar;
            }
        }
        if (f19205z) {
            C12575p.C12579c unused3 = cVar.f19226c = m26690B();
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C12221f mo49758u() {
        C12222g gVar;
        if (!m26691C(f19203x, f19204y, this.f19211f)) {
            return null;
        }
        C12221f fVar = this.f19209d.get();
        if (fVar != null || (gVar = f19196A) == null) {
            return fVar;
        }
        return gVar.mo49763a();
    }
}
