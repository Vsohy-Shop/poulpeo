package p364io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p329de.C11813b;
import p364io.grpc.C12591s;
import p364io.grpc.internal.C12428s1;

/* renamed from: io.grpc.m */
/* compiled from: LoadBalancerRegistry */
public final class C12561m {

    /* renamed from: c */
    private static final Logger f20129c = Logger.getLogger(C12561m.class.getName());

    /* renamed from: d */
    private static C12561m f20130d;

    /* renamed from: e */
    private static final Iterable<Class<?>> f20131e = m27795c();

    /* renamed from: a */
    private final LinkedHashSet<C12559l> f20132a = new LinkedHashSet<>();

    /* renamed from: b */
    private final LinkedHashMap<String, C12559l> f20133b = new LinkedHashMap<>();

    /* renamed from: io.grpc.m$a */
    /* compiled from: LoadBalancerRegistry */
    private static final class C12562a implements C12591s.C12593b<C12559l> {
        C12562a() {
        }

        /* renamed from: c */
        public int mo49598b(C12559l lVar) {
            return lVar.mo48970c();
        }

        /* renamed from: d */
        public boolean mo49597a(C12559l lVar) {
            return lVar.mo48971d();
        }
    }

    /* renamed from: a */
    private synchronized void m27793a(C12559l lVar) {
        C8012n.m15746e(lVar.mo48971d(), "isAvailable() returned false");
        this.f20132a.add(lVar);
    }

    /* renamed from: b */
    public static synchronized C12561m m27794b() {
        C12561m mVar;
        synchronized (C12561m.class) {
            if (f20130d == null) {
                List<Class<?>> e = C12591s.m27916e(C12559l.class, f20131e, C12559l.class.getClassLoader(), new C12562a());
                f20130d = new C12561m();
                Iterator<Class<?>> it = e.iterator();
                while (it.hasNext()) {
                    C12559l lVar = (C12559l) it.next();
                    Logger logger = f20129c;
                    logger.fine("Service loader found " + lVar);
                    if (lVar.mo48971d()) {
                        f20130d.m27793a(lVar);
                    }
                }
                f20130d.m27796e();
            }
            mVar = f20130d;
        }
        return mVar;
    }

    /* renamed from: c */
    static List<Class<?>> m27795c() {
        ArrayList arrayList = new ArrayList();
        Class<C12428s1> cls = C12428s1.class;
        try {
            int i = C12428s1.f19827b;
            arrayList.add(cls);
        } catch (ClassNotFoundException e) {
            f20129c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", e);
        }
        Class<C11813b> cls2 = C11813b.class;
        try {
            int i2 = C11813b.f18459b;
            arrayList.add(cls2);
        } catch (ClassNotFoundException e2) {
            f20129c.log(Level.FINE, "Unable to find round-robin LoadBalancer", e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private synchronized void m27796e() {
        this.f20133b.clear();
        Iterator<C12559l> it = this.f20132a.iterator();
        while (it.hasNext()) {
            C12559l next = it.next();
            String b = next.mo48969b();
            C12559l lVar = this.f20133b.get(b);
            if (lVar == null || lVar.mo48970c() < next.mo48970c()) {
                this.f20133b.put(b, next);
            }
        }
    }

    /* renamed from: d */
    public synchronized C12559l mo50237d(String str) {
        return this.f20133b.get(C8012n.m15756o(str, "policy"));
    }
}
