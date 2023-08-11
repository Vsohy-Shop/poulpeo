package p364io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p364io.grpc.C12591s;
import p464yd.C13892f;

/* renamed from: io.grpc.ManagedChannelRegistry */
public final class ManagedChannelRegistry {

    /* renamed from: c */
    private static final Logger f19036c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* renamed from: d */
    private static ManagedChannelRegistry f19037d;

    /* renamed from: a */
    private final LinkedHashSet<ManagedChannelProvider> f19038a = new LinkedHashSet<>();

    /* renamed from: b */
    private List<ManagedChannelProvider> f19039b = Collections.emptyList();

    /* renamed from: io.grpc.ManagedChannelRegistry$ProviderNotFoundException */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;
    }

    /* renamed from: io.grpc.ManagedChannelRegistry$a */
    class C12153a implements Comparator<ManagedChannelProvider> {
        C12153a() {
        }

        /* renamed from: a */
        public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.mo49592c() - managedChannelProvider2.mo49592c();
        }
    }

    /* renamed from: io.grpc.ManagedChannelRegistry$b */
    private static final class C12154b implements C12591s.C12593b<ManagedChannelProvider> {
        private C12154b() {
        }

        /* synthetic */ C12154b(C12153a aVar) {
            this();
        }

        /* renamed from: c */
        public int mo49598b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo49592c();
        }

        /* renamed from: d */
        public boolean mo49597a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo49591b();
        }
    }

    /* renamed from: a */
    private synchronized void m26497a(ManagedChannelProvider managedChannelProvider) {
        C8012n.m15746e(managedChannelProvider.mo49591b(), "isAvailable() returned false");
        this.f19038a.add(managedChannelProvider);
    }

    /* renamed from: b */
    public static synchronized ManagedChannelRegistry m26498b() {
        ManagedChannelRegistry managedChannelRegistry;
        synchronized (ManagedChannelRegistry.class) {
            if (f19037d == null) {
                List<T> e = C12591s.m27916e(ManagedChannelProvider.class, m26499c(), ManagedChannelProvider.class.getClassLoader(), new C12154b((C12153a) null));
                f19037d = new ManagedChannelRegistry();
                for (T t : e) {
                    Logger logger = f19036c;
                    logger.fine("Service loader found " + t);
                    if (t.mo49591b()) {
                        f19037d.m26497a(t);
                    }
                }
                f19037d.m26500f();
            }
            managedChannelRegistry = f19037d;
        }
        return managedChannelRegistry;
    }

    /* renamed from: c */
    static List<Class<?>> m26499c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C13892f.class);
        } catch (ClassNotFoundException e) {
            f19036c.log(Level.FINE, "Unable to find OkHttpChannelProvider", e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            f19036c.log(Level.FINE, "Unable to find NettyChannelProvider", e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    private synchronized void m26500f() {
        ArrayList arrayList = new ArrayList(this.f19038a);
        Collections.sort(arrayList, Collections.reverseOrder(new C12153a()));
        this.f19039b = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ManagedChannelProvider mo49593d() {
        List<ManagedChannelProvider> e = mo49594e();
        if (e.isEmpty()) {
            return null;
        }
        return e.get(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized List<ManagedChannelProvider> mo49594e() {
        return this.f19039b;
    }
}
