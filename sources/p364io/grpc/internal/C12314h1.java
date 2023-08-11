package p364io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p111h6.C8012n;
import p364io.grpc.C12563n;
import p364io.grpc.C12575p;
import p364io.grpc.C12587r;
import p364io.grpc.internal.C12242e0;
import p458xd.C13773a;
import p458xd.C13779c;
import p458xd.C13780c0;
import p458xd.C13791f;
import p458xd.C13794g0;
import p458xd.C13811l;
import p458xd.C13824r;
import p458xd.C13832v;

/* renamed from: io.grpc.internal.h1 */
/* compiled from: ManagedChannelImplBuilder */
public final class C12314h1 extends C12563n<C12314h1> {

    /* renamed from: G */
    private static final Logger f19498G = Logger.getLogger(C12314h1.class.getName());

    /* renamed from: H */
    static final long f19499H = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: I */
    static final long f19500I = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: J */
    private static final C12396p1<? extends Executor> f19501J = C12309g2.m27009c(C12404r0.f19760s);

    /* renamed from: K */
    private static final C13824r f19502K = C13824r.m31754c();

    /* renamed from: L */
    private static final C13811l f19503L = C13811l.m31718a();

    /* renamed from: A */
    private boolean f19504A;

    /* renamed from: B */
    private boolean f19505B;

    /* renamed from: C */
    private boolean f19506C;

    /* renamed from: D */
    private boolean f19507D;

    /* renamed from: E */
    private final C12317c f19508E;

    /* renamed from: F */
    private final C12316b f19509F;

    /* renamed from: a */
    C12396p1<? extends Executor> f19510a;

    /* renamed from: b */
    C12396p1<? extends Executor> f19511b;

    /* renamed from: c */
    private final List<C13791f> f19512c;

    /* renamed from: d */
    final C12587r f19513d;

    /* renamed from: e */
    C12575p.C12580d f19514e;

    /* renamed from: f */
    final String f19515f;

    /* renamed from: g */
    final C13773a f19516g;

    /* renamed from: h */
    private final SocketAddress f19517h;

    /* renamed from: i */
    String f19518i;

    /* renamed from: j */
    String f19519j;

    /* renamed from: k */
    String f19520k;

    /* renamed from: l */
    boolean f19521l;

    /* renamed from: m */
    C13824r f19522m;

    /* renamed from: n */
    C13811l f19523n;

    /* renamed from: o */
    long f19524o;

    /* renamed from: p */
    int f19525p;

    /* renamed from: q */
    int f19526q;

    /* renamed from: r */
    long f19527r;

    /* renamed from: s */
    long f19528s;

    /* renamed from: t */
    boolean f19529t;

    /* renamed from: u */
    C13832v f19530u;

    /* renamed from: v */
    int f19531v;

    /* renamed from: w */
    Map<String, ?> f19532w;

    /* renamed from: x */
    boolean f19533x;

    /* renamed from: y */
    C13794g0 f19534y;

    /* renamed from: z */
    private boolean f19535z;

    /* renamed from: io.grpc.internal.h1$b */
    /* compiled from: ManagedChannelImplBuilder */
    public interface C12316b {
        /* renamed from: a */
        int mo49931a();
    }

    /* renamed from: io.grpc.internal.h1$c */
    /* compiled from: ManagedChannelImplBuilder */
    public interface C12317c {
        /* renamed from: a */
        C12429t mo49932a();
    }

    /* renamed from: io.grpc.internal.h1$d */
    /* compiled from: ManagedChannelImplBuilder */
    private static final class C12318d implements C12316b {
        private C12318d() {
        }

        /* renamed from: a */
        public int mo49931a() {
            return 443;
        }
    }

    public C12314h1(String str, C12317c cVar, C12316b bVar) {
        this(str, (C13779c) null, (C13773a) null, cVar, bVar);
    }

    /* renamed from: a */
    public C13780c0 mo49713a() {
        return new C12322i1(new C12271g1(this, this.f19508E.mo49932a(), new C12242e0.C12243a(), C12309g2.m27009c(C12404r0.f19760s), C12404r0.f19762u, mo49930d(), C12356l2.f19618a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo49929c() {
        return this.f19509F.mo49931a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p458xd.C13791f> mo49930d() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<xd.f> r1 = r11.f19512c
            r0.<init>(r1)
            boolean r1 = r11.f19535z
            java.lang.String r2 = "getClientInterceptor"
            r3 = 0
            r4 = 0
            java.lang.String r5 = "Unable to apply census stats"
            if (r1 == 0) goto L_0x0072
            java.lang.String r1 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r7[r4] = r8     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r9 = 1
            r7[r9] = r8     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r10 = 2
            r7[r10] = r8     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r7)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            boolean r7 = r11.f19504A     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r6[r4] = r7     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            boolean r7 = r11.f19505B     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r6[r9] = r7     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            boolean r7 = r11.f19506C     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            r6[r10] = r7     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            java.lang.Object r1 = r1.invoke(r3, r6)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            xd.f r1 = (p458xd.C13791f) r1     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x005b, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0049 }
            goto L_0x006d
        L_0x0049:
            r1 = move-exception
            java.util.logging.Logger r6 = f19498G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L_0x006c
        L_0x0052:
            r1 = move-exception
            java.util.logging.Logger r6 = f19498G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L_0x006c
        L_0x005b:
            r1 = move-exception
            java.util.logging.Logger r6 = f19498G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
            goto L_0x006c
        L_0x0064:
            r1 = move-exception
            java.util.logging.Logger r6 = f19498G
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r5, r1)
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r0.add(r4, r1)
        L_0x0072:
            boolean r1 = r11.f19507D
            if (r1 == 0) goto L_0x00b4
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r6)     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            xd.f r1 = (p458xd.C13791f) r1     // Catch:{ ClassNotFoundException -> 0x00a7, NoSuchMethodException -> 0x009e, IllegalAccessException -> 0x0095, InvocationTargetException -> 0x008c }
            r3 = r1
            goto L_0x00af
        L_0x008c:
            r1 = move-exception
            java.util.logging.Logger r2 = f19498G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto L_0x00af
        L_0x0095:
            r1 = move-exception
            java.util.logging.Logger r2 = f19498G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto L_0x00af
        L_0x009e:
            r1 = move-exception
            java.util.logging.Logger r2 = f19498G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
            goto L_0x00af
        L_0x00a7:
            r1 = move-exception
            java.util.logging.Logger r2 = f19498G
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r2.log(r6, r5, r1)
        L_0x00af:
            if (r3 == 0) goto L_0x00b4
            r0.add(r4, r3)
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12314h1.mo49930d():java.util.List");
    }

    public C12314h1(String str, C13779c cVar, C13773a aVar, C12317c cVar2, C12316b bVar) {
        C12396p1<? extends Executor> p1Var = f19501J;
        this.f19510a = p1Var;
        this.f19511b = p1Var;
        this.f19512c = new ArrayList();
        C12587r d = C12587r.m27901d();
        this.f19513d = d;
        this.f19514e = d.mo50294c();
        this.f19520k = "pick_first";
        this.f19522m = f19502K;
        this.f19523n = f19503L;
        this.f19524o = f19499H;
        this.f19525p = 5;
        this.f19526q = 5;
        this.f19527r = 16777216;
        this.f19528s = 1048576;
        this.f19529t = true;
        this.f19530u = C13832v.m31783g();
        this.f19533x = true;
        this.f19535z = true;
        this.f19504A = true;
        this.f19505B = true;
        this.f19506C = false;
        this.f19507D = true;
        this.f19515f = (String) C8012n.m15756o(str, TypedValues.AttributesType.S_TARGET);
        this.f19516g = aVar;
        this.f19508E = (C12317c) C8012n.m15756o(cVar2, "clientTransportFactoryBuilder");
        this.f19517h = null;
        if (bVar != null) {
            this.f19509F = bVar;
        } else {
            this.f19509F = new C12318d();
        }
    }
}
