package p464yd;

import androidx.core.location.LocationRequestCompat;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p111h6.C8012n;
import p364io.grpc.C12563n;
import p364io.grpc.internal.C12190b;
import p364io.grpc.internal.C12259f2;
import p364io.grpc.internal.C12310h;
import p364io.grpc.internal.C12314h1;
import p364io.grpc.internal.C12379o2;
import p364io.grpc.internal.C12404r0;
import p364io.grpc.internal.C12429t;
import p364io.grpc.internal.C12447v;
import p458xd.C13781d;
import p458xd.C13812l0;
import p470zd.C14086a;
import p470zd.C14087b;
import p470zd.C14093f;
import p470zd.C14103h;

/* renamed from: yd.e */
/* compiled from: OkHttpChannelBuilder */
public final class C13884e extends C12190b<C13884e> {

    /* renamed from: r */
    private static final Logger f22636r = Logger.getLogger(C13884e.class.getName());

    /* renamed from: s */
    static final C14087b f22637s = new C14087b.C14089b(C14087b.f23111f).mo53854g(C14086a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, C14086a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, C14086a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C14086a.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, C14086a.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, C14086a.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).mo53857j(C14103h.TLS_1_2).mo53855h(true).mo53852e();

    /* renamed from: t */
    private static final long f22638t = TimeUnit.DAYS.toNanos(1000);
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C12259f2.C12263d<Executor> f22639u = new C13885a();

    /* renamed from: v */
    private static final EnumSet<C13812l0> f22640v = EnumSet.of(C13812l0.MTLS, C13812l0.CUSTOM_MANAGERS);

    /* renamed from: a */
    private final C12314h1 f22641a;

    /* renamed from: b */
    private C12379o2.C12381b f22642b = C12379o2.m27239a();

    /* renamed from: c */
    private Executor f22643c;

    /* renamed from: d */
    private ScheduledExecutorService f22644d;

    /* renamed from: e */
    private SocketFactory f22645e;

    /* renamed from: f */
    private SSLSocketFactory f22646f;

    /* renamed from: g */
    private final boolean f22647g;

    /* renamed from: h */
    private HostnameVerifier f22648h;

    /* renamed from: i */
    private C14087b f22649i = f22637s;

    /* renamed from: j */
    private C13887c f22650j = C13887c.TLS;

    /* renamed from: k */
    private long f22651k = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: l */
    private long f22652l = C12404r0.f19753l;

    /* renamed from: m */
    private int f22653m = 65535;

    /* renamed from: n */
    private boolean f22654n;

    /* renamed from: o */
    private int f22655o = 4194304;

    /* renamed from: p */
    private int f22656p = Integer.MAX_VALUE;

    /* renamed from: q */
    private final boolean f22657q = false;

    /* renamed from: yd.e$a */
    /* compiled from: OkHttpChannelBuilder */
    class C13885a implements C12259f2.C12263d<Executor> {
        C13885a() {
        }

        /* renamed from: c */
        public void mo49831b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor mo49830a() {
            return Executors.newCachedThreadPool(C12404r0.m27330i("grpc-okhttp-%d", true));
        }
    }

    /* renamed from: yd.e$b */
    /* compiled from: OkHttpChannelBuilder */
    static /* synthetic */ class C13886b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22658a;

        /* renamed from: b */
        static final /* synthetic */ int[] f22659b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                yd.e$c[] r0 = p464yd.C13884e.C13887c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22659b = r0
                r1 = 1
                yd.e$c r2 = p464yd.C13884e.C13887c.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f22659b     // Catch:{ NoSuchFieldError -> 0x001d }
                yd.e$c r3 = p464yd.C13884e.C13887c.TLS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                yd.d[] r2 = p464yd.C13883d.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f22658a = r2
                yd.d r3 = p464yd.C13883d.TLS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f22658a     // Catch:{ NoSuchFieldError -> 0x0038 }
                yd.d r2 = p464yd.C13883d.PLAINTEXT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p464yd.C13884e.C13886b.<clinit>():void");
        }
    }

    /* renamed from: yd.e$c */
    /* compiled from: OkHttpChannelBuilder */
    private enum C13887c {
        TLS,
        PLAINTEXT
    }

    /* renamed from: yd.e$d */
    /* compiled from: OkHttpChannelBuilder */
    private final class C13888d implements C12314h1.C12316b {
        private C13888d() {
        }

        /* renamed from: a */
        public int mo49931a() {
            return C13884e.this.mo53589h();
        }

        /* synthetic */ C13888d(C13884e eVar, C13885a aVar) {
            this();
        }
    }

    /* renamed from: yd.e$e */
    /* compiled from: OkHttpChannelBuilder */
    private final class C13889e implements C12314h1.C12317c {
        private C13889e() {
        }

        /* renamed from: a */
        public C12429t mo49932a() {
            return C13884e.this.mo53587e();
        }

        /* synthetic */ C13889e(C13884e eVar, C13885a aVar) {
            this();
        }
    }

    /* renamed from: yd.e$f */
    /* compiled from: OkHttpChannelBuilder */
    static final class C13890f implements C12429t {

        /* renamed from: b */
        private final Executor f22665b;

        /* renamed from: c */
        private final boolean f22666c;

        /* renamed from: d */
        private final boolean f22667d;

        /* renamed from: e */
        private final C12379o2.C12381b f22668e;

        /* renamed from: f */
        private final SocketFactory f22669f;

        /* renamed from: g */
        private final SSLSocketFactory f22670g;

        /* renamed from: h */
        private final HostnameVerifier f22671h;

        /* renamed from: i */
        private final C14087b f22672i;

        /* renamed from: j */
        private final int f22673j;

        /* renamed from: k */
        private final boolean f22674k;

        /* renamed from: l */
        private final long f22675l;

        /* renamed from: m */
        private final C12310h f22676m;

        /* renamed from: n */
        private final long f22677n;

        /* renamed from: o */
        private final int f22678o;

        /* renamed from: p */
        private final boolean f22679p;

        /* renamed from: q */
        private final int f22680q;

        /* renamed from: r */
        private final ScheduledExecutorService f22681r;

        /* renamed from: s */
        private final boolean f22682s;

        /* renamed from: t */
        private boolean f22683t;

        /* renamed from: yd.e$f$a */
        /* compiled from: OkHttpChannelBuilder */
        class C13891a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12310h.C12312b f22684b;

            C13891a(C12310h.C12312b bVar) {
                this.f22684b = bVar;
            }

            public void run() {
                this.f22684b.mo49925a();
            }
        }

        /* synthetic */ C13890f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14087b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C12379o2.C12381b bVar2, boolean z3, C13885a aVar) {
            this(executor, scheduledExecutorService, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i, z, j, j2, i2, z2, i3, bVar2, z3);
        }

        public void close() {
            if (!this.f22683t) {
                this.f22683t = true;
                if (this.f22667d) {
                    C12259f2.m26842f(C12404r0.f19761t, this.f22681r);
                }
                if (this.f22666c) {
                    C12259f2.m26842f(C13884e.f22639u, this.f22665b);
                }
            }
        }

        /* renamed from: i0 */
        public ScheduledExecutorService mo49981i0() {
            return this.f22681r;
        }

        /* renamed from: r */
        public C12447v mo49982r(SocketAddress socketAddress, C12429t.C12430a aVar, C13781d dVar) {
            if (!this.f22683t) {
                C12310h.C12312b d = this.f22676m.mo49924d();
                C13891a aVar2 = r2;
                C13891a aVar3 = new C13891a(d);
                C12310h.C12312b bVar = d;
                C13896h hVar = new C13896h((InetSocketAddress) socketAddress, aVar.mo50072a(), aVar.mo50075d(), aVar.mo50073b(), this.f22665b, this.f22669f, this.f22670g, this.f22671h, this.f22672i, this.f22673j, this.f22678o, aVar.mo50074c(), aVar2, this.f22680q, this.f22668e.mo50029a(), this.f22682s);
                if (this.f22674k) {
                    hVar.mo53605T(true, bVar.mo49926b(), this.f22677n, this.f22679p);
                }
                return hVar;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        private C13890f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14087b bVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C12379o2.C12381b bVar2, boolean z3) {
            Executor executor2 = executor;
            long j3 = j;
            boolean z4 = true;
            boolean z5 = scheduledExecutorService == null;
            this.f22667d = z5;
            this.f22681r = z5 ? (ScheduledExecutorService) C12259f2.m26841d(C12404r0.f19761t) : scheduledExecutorService;
            this.f22669f = socketFactory;
            this.f22670g = sSLSocketFactory;
            this.f22671h = hostnameVerifier;
            this.f22672i = bVar;
            this.f22673j = i;
            this.f22674k = z;
            this.f22675l = j3;
            this.f22676m = new C12310h("keepalive time nanos", j3);
            this.f22677n = j2;
            this.f22678o = i2;
            this.f22679p = z2;
            this.f22680q = i3;
            this.f22682s = z3;
            z4 = executor2 != null ? false : z4;
            this.f22666c = z4;
            this.f22668e = (C12379o2.C12381b) C8012n.m15756o(bVar2, "transportTracerFactory");
            if (z4) {
                this.f22665b = (Executor) C12259f2.m26841d(C13884e.f22639u);
            } else {
                this.f22665b = executor2;
            }
        }
    }

    private C13884e(String str) {
        this.f22641a = new C12314h1(str, new C13889e(this, (C13885a) null), new C13888d(this, (C13885a) null));
        this.f22647g = false;
    }

    /* renamed from: g */
    public static C13884e m31961g(String str) {
        return new C13884e(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C12563n<?> mo49714c() {
        return this.f22641a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C12429t mo53587e() {
        boolean z;
        if (this.f22651k != LocationRequestCompat.PASSIVE_INTERVAL) {
            z = true;
        } else {
            z = false;
        }
        C13890f fVar = r2;
        C13890f fVar2 = new C13890f(this.f22643c, this.f22644d, this.f22645e, mo53588f(), this.f22648h, this.f22649i, this.f22655o, z, this.f22651k, this.f22652l, this.f22653m, this.f22654n, this.f22656p, this.f22642b, false, (C13885a) null);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public SSLSocketFactory mo53588f() {
        int i = C13886b.f22659b[this.f22650j.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            try {
                if (this.f22646f == null) {
                    this.f22646f = SSLContext.getInstance("Default", C14093f.m32715e().mo53868g()).getSocketFactory();
                }
                return this.f22646f;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            throw new RuntimeException("Unknown negotiation type: " + this.f22650j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo53589h() {
        int i = C13886b.f22659b[this.f22650j.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i == 2) {
            return 443;
        }
        throw new AssertionError(this.f22650j + " not handled");
    }
}
