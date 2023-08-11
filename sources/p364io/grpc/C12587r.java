package p364io.grpc;

import androidx.core.p004os.EnvironmentCompat;
import com.google.common.collect.C6823m;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p364io.grpc.C12575p;
import p364io.grpc.C12591s;
import p364io.grpc.internal.C12234d0;

/* renamed from: io.grpc.r */
/* compiled from: NameResolverRegistry */
public final class C12587r {

    /* renamed from: e */
    private static final Logger f20173e = Logger.getLogger(C12587r.class.getName());

    /* renamed from: f */
    private static C12587r f20174f;

    /* renamed from: a */
    private final C12575p.C12580d f20175a = new C12589b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f20176b = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: c */
    private final LinkedHashSet<C12586q> f20177c = new LinkedHashSet<>();

    /* renamed from: d */
    private C6823m<String, C12586q> f20178d = C6823m.m11651j();

    /* renamed from: io.grpc.r$b */
    /* compiled from: NameResolverRegistry */
    private final class C12589b extends C12575p.C12580d {
        private C12589b() {
        }

        /* renamed from: a */
        public String mo49791a() {
            String a;
            synchronized (C12587r.this) {
                a = C12587r.this.f20176b;
            }
            return a;
        }

        /* renamed from: b */
        public C12575p mo49792b(URI uri, C12575p.C12577b bVar) {
            C12586q qVar = C12587r.this.mo50295f().get(uri.getScheme());
            if (qVar == null) {
                return null;
            }
            return qVar.mo49792b(uri, bVar);
        }
    }

    /* renamed from: io.grpc.r$c */
    /* compiled from: NameResolverRegistry */
    private static final class C12590c implements C12591s.C12593b<C12586q> {
        private C12590c() {
        }

        /* renamed from: c */
        public int mo49598b(C12586q qVar) {
            return qVar.mo49794e();
        }

        /* renamed from: d */
        public boolean mo49597a(C12586q qVar) {
            return qVar.mo49793d();
        }
    }

    /* renamed from: b */
    private synchronized void m27900b(C12586q qVar) {
        C8012n.m15746e(qVar.mo49793d(), "isAvailable() returned false");
        this.f20177c.add(qVar);
    }

    /* renamed from: d */
    public static synchronized C12587r m27901d() {
        C12587r rVar;
        synchronized (C12587r.class) {
            if (f20174f == null) {
                List<T> e = C12591s.m27916e(C12586q.class, m27902e(), C12586q.class.getClassLoader(), new C12590c());
                if (e.isEmpty()) {
                    f20173e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f20174f = new C12587r();
                for (T t : e) {
                    Logger logger = f20173e;
                    logger.fine("Service loader found " + t);
                    if (t.mo49793d()) {
                        f20174f.m27900b(t);
                    }
                }
                f20174f.m27903g();
            }
            rVar = f20174f;
        }
        return rVar;
    }

    /* renamed from: e */
    static List<Class<?>> m27902e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C12234d0.class);
        } catch (ClassNotFoundException e) {
            f20173e.log(Level.FINE, "Unable to find DNS NameResolver", e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private synchronized void m27903g() {
        HashMap hashMap = new HashMap();
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        Iterator<C12586q> it = this.f20177c.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            C12586q next = it.next();
            String c = next.mo50293c();
            C12586q qVar = (C12586q) hashMap.get(c);
            if (qVar == null || qVar.mo49794e() < next.mo49794e()) {
                hashMap.put(c, next);
            }
            if (i < next.mo49794e()) {
                int e = next.mo49794e();
                i = e;
                str = next.mo50293c();
            }
        }
        this.f20178d = C6823m.m11650b(hashMap);
        this.f20176b = str;
    }

    /* renamed from: c */
    public C12575p.C12580d mo50294c() {
        return this.f20175a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized Map<String, C12586q> mo50295f() {
        return this.f20178d;
    }
}
