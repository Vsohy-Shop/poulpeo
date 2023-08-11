package p464yd;

import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.internal.http.StatusLine;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.p406ws.RealWebSocket;
import okio.C13121c;
import okio.C13127d;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13179y0;
import okio.C13181z0;
import p111h6.C8003j;
import p111h6.C8012n;
import p111h6.C8016p;
import p111h6.C8019r;
import p306ae.C10867a;
import p306ae.C10868b;
import p306ae.C10870c;
import p306ae.C10871d;
import p306ae.C10872e;
import p306ae.C10876g;
import p306ae.C10883i;
import p306ae.C10884j;
import p335ee.C11891c;
import p364io.grpc.C12155a;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12168f;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.StatusException;
import p364io.grpc.internal.C12223c1;
import p364io.grpc.internal.C12236d2;
import p364io.grpc.internal.C12259f2;
import p364io.grpc.internal.C12324i2;
import p364io.grpc.internal.C12341k1;
import p364io.grpc.internal.C12379o2;
import p364io.grpc.internal.C12399q0;
import p364io.grpc.internal.C12402r;
import p364io.grpc.internal.C12404r0;
import p364io.grpc.internal.C12447v;
import p364io.grpc.internal.C12448v0;
import p364io.grpc.internal.C12454w0;
import p458xd.C13783d0;
import p458xd.C13798h0;
import p458xd.C13829u;
import p458xd.C13832v;
import p458xd.C13841z;
import p464yd.C13880b;
import p464yd.C13893g;
import p464yd.C13904i;
import p470zd.C14087b;

/* renamed from: yd.h */
/* compiled from: OkHttpClientTransport */
class C13896h implements C12447v, C13880b.C13881a {

    /* renamed from: W */
    private static final Map<C10867a, C12594t> f22713W = m32039Q();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final Logger f22714X = Logger.getLogger(C13896h.class.getName());

    /* renamed from: Y */
    private static final C13893g[] f22715Y = new C13893g[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final SocketFactory f22716A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public SSLSocketFactory f22717B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public HostnameVerifier f22718C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Socket f22719D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f22720E = 0;

    /* renamed from: F */
    private final Deque<C13893g> f22721F = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C14087b f22722G;

    /* renamed from: H */
    private C10870c f22723H;

    /* renamed from: I */
    private ScheduledExecutorService f22724I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C12223c1 f22725J;

    /* renamed from: K */
    private boolean f22726K;

    /* renamed from: L */
    private long f22727L;

    /* renamed from: M */
    private long f22728M;

    /* renamed from: N */
    private boolean f22729N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final Runnable f22730O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final int f22731P;

    /* renamed from: Q */
    private final boolean f22732Q;

    /* renamed from: R */
    private final C12379o2 f22733R;

    /* renamed from: S */
    private final C12454w0<C13893g> f22734S = new C13897a();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C13832v.C13834b f22735T;

    /* renamed from: U */
    final C13829u f22736U;

    /* renamed from: V */
    Runnable f22737V;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InetSocketAddress f22738a;

    /* renamed from: b */
    private final String f22739b;

    /* renamed from: c */
    private final String f22740c;

    /* renamed from: d */
    private final Random f22741d = new Random();

    /* renamed from: e */
    private final C8019r<C8016p> f22742e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f22743f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12341k1.C12342a f22744g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10868b f22745h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C13904i f22746i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C13880b f22747j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C13914p f22748k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f22749l = new Object();

    /* renamed from: m */
    private final C13841z f22750m;

    /* renamed from: n */
    private int f22751n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Map<Integer, C13893g> f22752o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Executor f22753p;

    /* renamed from: q */
    private final C12236d2 f22754q;

    /* renamed from: r */
    private final int f22755r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f22756s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C13903f f22757t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C12155a f22758u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C12594t f22759v;

    /* renamed from: w */
    private boolean f22760w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C12448v0 f22761x;

    /* renamed from: y */
    private boolean f22762y;

    /* renamed from: z */
    private boolean f22763z;

    /* renamed from: yd.h$a */
    /* compiled from: OkHttpClientTransport */
    class C13897a extends C12454w0<C13893g> {
        C13897a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo49866b() {
            C13896h.this.f22744g.mo49863d(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo49867c() {
            C13896h.this.f22744g.mo49863d(false);
        }
    }

    /* renamed from: yd.h$b */
    /* compiled from: OkHttpClientTransport */
    class C13898b implements C12379o2.C12382c {
        C13898b() {
        }
    }

    /* renamed from: yd.h$c */
    /* compiled from: OkHttpClientTransport */
    class C13899c implements Runnable {
        C13899c() {
        }

        public void run() {
            Runnable runnable = C13896h.this.f22737V;
            if (runnable != null) {
                runnable.run();
            }
            C13896h hVar = C13896h.this;
            C13903f unused = hVar.f22757t = new C13903f(hVar.f22745h, C13896h.this.f22746i);
            C13896h.this.f22753p.execute(C13896h.this.f22757t);
            synchronized (C13896h.this.f22749l) {
                int unused2 = C13896h.this.f22720E = Integer.MAX_VALUE;
                boolean unused3 = C13896h.this.m32057n0();
            }
            C13896h.this.getClass();
            throw null;
        }
    }

    /* renamed from: yd.h$e */
    /* compiled from: OkHttpClientTransport */
    class C13902e implements Runnable {
        C13902e() {
        }

        public void run() {
            C13896h.this.f22753p.execute(C13896h.this.f22757t);
            synchronized (C13896h.this.f22749l) {
                int unused = C13896h.this.f22720E = Integer.MAX_VALUE;
                boolean unused2 = C13896h.this.m32057n0();
            }
        }
    }

    /* renamed from: yd.h$f */
    /* compiled from: OkHttpClientTransport */
    class C13903f implements C10868b.C10869a, Runnable {

        /* renamed from: b */
        private final C13904i f22773b;

        /* renamed from: c */
        C10868b f22774c;

        /* renamed from: d */
        boolean f22775d;

        C13903f(C13896h hVar, C10868b bVar) {
            this(bVar, new C13904i(Level.FINE, (Class<?>) C13896h.class));
        }

        /* renamed from: a */
        private int m32095a(List<C10871d> list) {
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                C10871d dVar = list.get(i);
                j += (long) (dVar.f16689a.mo52590H() + 32 + dVar.f16690b.mo52590H());
            }
            return (int) Math.min(j, 2147483647L);
        }

        public void data(boolean z, int i, C13130e eVar, int i2) {
            this.f22773b.mo53623b(C13904i.C13905a.INBOUND, i, eVar.mo52524f(), i2, z);
            C13893g a0 = C13896h.this.mo53611a0(i);
            if (a0 != null) {
                long j = (long) i2;
                eVar.mo52533m0(j);
                C13121c cVar = new C13121c();
                cVar.write(eVar.mo52524f(), j);
                C11891c.m25675c("OkHttpClientTransport$ClientFrameHandler.data", a0.mo49676x().mo53602f0());
                synchronized (C13896h.this.f22749l) {
                    a0.mo49676x().mo53603g0(cVar, z);
                }
            } else if (C13896h.this.mo53613e0(i)) {
                synchronized (C13896h.this.f22749l) {
                    C13896h.this.f22747j.mo45840i(i, C10867a.INVALID_STREAM);
                }
                eVar.skip((long) i2);
            } else {
                C13896h hVar = C13896h.this;
                C10867a aVar = C10867a.PROTOCOL_ERROR;
                hVar.m32047h0(aVar, "Received data for unknown stream: " + i);
                return;
            }
            C13896h.m32024B(C13896h.this, i2);
            if (((float) C13896h.this.f22756s) >= ((float) C13896h.this.f22743f) * 0.5f) {
                synchronized (C13896h.this.f22749l) {
                    C13896h.this.f22747j.windowUpdate(0, (long) C13896h.this.f22756s);
                }
                int unused = C13896h.this.f22756s = 0;
            }
        }

        /* renamed from: i */
        public void mo45826i(int i, C10867a aVar) {
            boolean z;
            C12402r.C12403a aVar2;
            this.f22773b.mo53629h(C13904i.C13905a.INBOUND, i, aVar);
            C12594t f = C13896h.m32064r0(aVar).mo50303f("Rst Stream");
            if (f.mo50306n() == C12594t.C12596b.CANCELLED || f.mo50306n() == C12594t.C12596b.DEADLINE_EXCEEDED) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            synchronized (C13896h.this.f22749l) {
                C13893g gVar = (C13893g) C13896h.this.f22752o.get(Integer.valueOf(i));
                if (gVar != null) {
                    C11891c.m25675c("OkHttpClientTransport$ClientFrameHandler.rstStream", gVar.mo49676x().mo53602f0());
                    C13896h hVar = C13896h.this;
                    if (aVar == C10867a.REFUSED_STREAM) {
                        aVar2 = C12402r.C12403a.REFUSED;
                    } else {
                        aVar2 = C12402r.C12403a.PROCESSED;
                    }
                    hVar.mo53606U(i, f, aVar2, z2, (C10867a) null, (C12564o) null);
                }
            }
        }

        /* renamed from: j */
        public void mo45827j(boolean z, boolean z2, int i, int i2, List<C10871d> list, C10872e eVar) {
            C12594t tVar;
            int a;
            String str;
            this.f22773b.mo53625d(C13904i.C13905a.INBOUND, i, list, z2);
            boolean z3 = true;
            if (C13896h.this.f22731P == Integer.MAX_VALUE || (a = m32095a(list)) <= C13896h.this.f22731P) {
                tVar = null;
            } else {
                C12594t tVar2 = C12594t.f20192o;
                Object[] objArr = new Object[3];
                if (z2) {
                    str = "trailer";
                } else {
                    str = "header";
                }
                objArr[0] = str;
                objArr[1] = Integer.valueOf(C13896h.this.f22731P);
                objArr[2] = Integer.valueOf(a);
                tVar = tVar2.mo50310r(String.format("Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (C13896h.this.f22749l) {
                C13893g gVar = (C13893g) C13896h.this.f22752o.get(Integer.valueOf(i));
                if (gVar == null) {
                    if (C13896h.this.mo53613e0(i)) {
                        C13896h.this.f22747j.mo45840i(i, C10867a.INVALID_STREAM);
                    }
                } else if (tVar == null) {
                    C11891c.m25675c("OkHttpClientTransport$ClientFrameHandler.headers", gVar.mo49676x().mo53602f0());
                    gVar.mo49676x().mo53604h0(list, z2);
                } else {
                    if (!z2) {
                        C13896h.this.f22747j.mo45840i(i, C10867a.CANCEL);
                    }
                    gVar.mo49676x().mo49693N(tVar, false, new C12564o());
                }
                z3 = false;
            }
            if (z3) {
                C13896h.this.m32047h0(C10867a.PROTOCOL_ERROR, "Received header for unknown stream: " + i);
            }
        }

        /* renamed from: k */
        public void mo45828k(boolean z, C10883i iVar) {
            boolean z2;
            this.f22773b.mo53630i(C13904i.C13905a.INBOUND, iVar);
            synchronized (C13896h.this.f22749l) {
                if (C13910l.m32133b(iVar, 4)) {
                    int unused = C13896h.this.f22720E = C13910l.m32132a(iVar, 4);
                }
                if (C13910l.m32133b(iVar, 7)) {
                    z2 = C13896h.this.f22748k.mo53640e(C13910l.m32132a(iVar, 7));
                } else {
                    z2 = false;
                }
                if (this.f22775d) {
                    C13896h.this.f22744g.mo49861b();
                    this.f22775d = false;
                }
                C13896h.this.f22747j.mo45835S(iVar);
                if (z2) {
                    C13896h.this.f22748k.mo53642h();
                }
                boolean unused2 = C13896h.this.m32057n0();
            }
        }

        /* renamed from: l */
        public void mo45829l(int i, C10867a aVar, C13133f fVar) {
            this.f22773b.mo53624c(C13904i.C13905a.INBOUND, i, aVar, fVar);
            if (aVar == C10867a.ENHANCE_YOUR_CALM) {
                String N = fVar.mo52595N();
                C13896h.f22714X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[]{this, N}));
                if ("too_many_pings".equals(N)) {
                    C13896h.this.f22730O.run();
                }
            }
            C12594t f = C12404r0.C12414i.m27359e((long) aVar.f16679b).mo50303f("Received Goaway");
            if (fVar.mo52590H() > 0) {
                f = f.mo50303f(fVar.mo52595N());
            }
            C13896h.this.m32055m0(i, (C10867a) null, f);
        }

        public void ping(boolean z, int i, int i2) {
            C12448v0 v0Var;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f22773b.mo53626e(C13904i.C13905a.INBOUND, j);
            if (!z) {
                synchronized (C13896h.this.f22749l) {
                    C13896h.this.f22747j.ping(true, i, i2);
                }
                return;
            }
            synchronized (C13896h.this.f22749l) {
                v0Var = null;
                if (C13896h.this.f22761x == null) {
                    C13896h.f22714X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (C13896h.this.f22761x.mo50109h() == j) {
                    C12448v0 F = C13896h.this.f22761x;
                    C12448v0 unused = C13896h.this.f22761x = null;
                    v0Var = F;
                } else {
                    C13896h.f22714X.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(C13896h.this.f22761x.mo50109h()), Long.valueOf(j)}));
                }
            }
            if (v0Var != null) {
                v0Var.mo50107d();
            }
        }

        public void pushPromise(int i, int i2, List<C10871d> list) {
            this.f22773b.mo53628g(C13904i.C13905a.INBOUND, i, i2, list);
            synchronized (C13896h.this.f22749l) {
                C13896h.this.f22747j.mo45840i(i, C10867a.PROTOCOL_ERROR);
            }
        }

        public void run() {
            String str;
            C12594t v;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f22774c.mo45823T(this)) {
                try {
                    if (C13896h.this.f22725J != null) {
                        C13896h.this.f22725J.mo49765l();
                    }
                } catch (Throwable th) {
                    try {
                        C13896h.this.m32055m0(0, C10867a.PROTOCOL_ERROR, C12594t.f20197t.mo50310r("error in frame handler").mo50309q(th));
                    } finally {
                        try {
                            this.f22774c.close();
                        } catch (IOException e) {
                            str = "Exception closing frame reader";
                            C13896h.f22714X.log(Level.INFO, str, e);
                        }
                        C13896h.this.f22744g.mo49862c();
                        Thread.currentThread().setName(name);
                    }
                }
            }
            synchronized (C13896h.this.f22749l) {
                v = C13896h.this.f22759v;
            }
            if (v == null) {
                v = C12594t.f20198u.mo50310r("End of stream or IOException");
            }
            C13896h.this.m32055m0(0, C10867a.INTERNAL_ERROR, v);
            try {
                this.f22774c.close();
            } catch (IOException e2) {
                e = e2;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
            if (r9 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
            r9 = r7.f22776e;
            r10 = p306ae.C10867a.PROTOCOL_ERROR;
            p464yd.C13896h.m32071y(r9, r10, "Received window_update for unknown stream: " + r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void windowUpdate(int r8, long r9) {
            /*
                r7 = this;
                yd.i r0 = r7.f22773b
                yd.i$a r1 = p464yd.C13904i.C13905a.INBOUND
                r0.mo53632k(r1, r8, r9)
                r0 = 0
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L_0x002c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L_0x0019
                yd.h r8 = p464yd.C13896h.this
                ae.a r10 = p306ae.C10867a.PROTOCOL_ERROR
                r8.m32047h0(r10, r9)
                goto L_0x002b
            L_0x0019:
                yd.h r0 = p464yd.C13896h.this
                io.grpc.t r10 = p364io.grpc.C12594t.f20197t
                io.grpc.t r2 = r10.mo50310r(r9)
                io.grpc.internal.r$a r3 = p364io.grpc.internal.C12402r.C12403a.PROCESSED
                r4 = 0
                ae.a r5 = p306ae.C10867a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.mo53606U(r1, r2, r3, r4, r5, r6)
            L_0x002b:
                return
            L_0x002c:
                yd.h r0 = p464yd.C13896h.this
                java.lang.Object r0 = r0.f22749l
                monitor-enter(r0)
                if (r8 != 0) goto L_0x0042
                yd.h r8 = p464yd.C13896h.this     // Catch:{ all -> 0x0086 }
                yd.p r8 = r8.f22748k     // Catch:{ all -> 0x0086 }
                r1 = 0
                int r9 = (int) r9     // Catch:{ all -> 0x0086 }
                r8.mo53641g(r1, r9)     // Catch:{ all -> 0x0086 }
                monitor-exit(r0)     // Catch:{ all -> 0x0086 }
                return
            L_0x0042:
                yd.h r1 = p464yd.C13896h.this     // Catch:{ all -> 0x0086 }
                java.util.Map r1 = r1.f22752o     // Catch:{ all -> 0x0086 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0086 }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0086 }
                yd.g r1 = (p464yd.C13893g) r1     // Catch:{ all -> 0x0086 }
                if (r1 == 0) goto L_0x005f
                yd.h r2 = p464yd.C13896h.this     // Catch:{ all -> 0x0086 }
                yd.p r2 = r2.f22748k     // Catch:{ all -> 0x0086 }
                int r9 = (int) r9     // Catch:{ all -> 0x0086 }
                r2.mo53641g(r1, r9)     // Catch:{ all -> 0x0086 }
                goto L_0x0069
            L_0x005f:
                yd.h r9 = p464yd.C13896h.this     // Catch:{ all -> 0x0086 }
                boolean r9 = r9.mo53613e0(r8)     // Catch:{ all -> 0x0086 }
                if (r9 != 0) goto L_0x0069
                r9 = 1
                goto L_0x006a
            L_0x0069:
                r9 = 0
            L_0x006a:
                monitor-exit(r0)     // Catch:{ all -> 0x0086 }
                if (r9 == 0) goto L_0x0085
                yd.h r9 = p464yd.C13896h.this
                ae.a r10 = p306ae.C10867a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r9.m32047h0(r10, r8)
            L_0x0085:
                return
            L_0x0086:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0086 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p464yd.C13896h.C13903f.windowUpdate(int, long):void");
        }

        C13903f(C10868b bVar, C13904i iVar) {
            this.f22775d = true;
            this.f22774c = bVar;
            this.f22773b = iVar;
        }

        public void ackSettings() {
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }
    }

    C13896h(InetSocketAddress inetSocketAddress, String str, String str2, C12155a aVar, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14087b bVar, int i, int i2, C13829u uVar, Runnable runnable, int i3, C12379o2 o2Var, boolean z) {
        Executor executor2 = executor;
        InetSocketAddress inetSocketAddress2 = inetSocketAddress;
        this.f22738a = (InetSocketAddress) C8012n.m15756o(inetSocketAddress, "address");
        this.f22739b = str;
        this.f22755r = i;
        this.f22743f = i2;
        this.f22753p = (Executor) C8012n.m15756o(executor, "executor");
        this.f22754q = new C12236d2(executor);
        this.f22751n = 3;
        this.f22716A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f22717B = sSLSocketFactory;
        this.f22718C = hostnameVerifier;
        C14087b bVar2 = bVar;
        this.f22722G = (C14087b) C8012n.m15756o(bVar, "connectionSpec");
        this.f22742e = C12404r0.f19762u;
        String str3 = str2;
        this.f22740c = C12404r0.m27328g("okhttp", str2);
        this.f22736U = uVar;
        this.f22730O = (Runnable) C8012n.m15756o(runnable, "tooManyPingsRunnable");
        this.f22731P = i3;
        this.f22733R = (C12379o2) C8012n.m15755n(o2Var);
        this.f22750m = C13841z.m31797a(getClass(), inetSocketAddress.toString());
        C12155a aVar2 = aVar;
        this.f22758u = C12155a.m26513c().mo49614d(C12399q0.f19729b, aVar).mo49612a();
        this.f22732Q = z;
        m32043b0();
    }

    /* renamed from: B */
    static /* synthetic */ int m32024B(C13896h hVar, int i) {
        int i2 = hVar.f22756s + i;
        hVar.f22756s = i2;
        return i2;
    }

    /* renamed from: Q */
    private static Map<C10867a, C12594t> m32039Q() {
        EnumMap enumMap = new EnumMap(C10867a.class);
        C10867a aVar = C10867a.NO_ERROR;
        C12594t tVar = C12594t.f20197t;
        enumMap.put(aVar, tVar.mo50310r("No error: A GRPC status of OK should have been sent"));
        enumMap.put(C10867a.PROTOCOL_ERROR, tVar.mo50310r("Protocol error"));
        enumMap.put(C10867a.INTERNAL_ERROR, tVar.mo50310r("Internal error"));
        enumMap.put(C10867a.FLOW_CONTROL_ERROR, tVar.mo50310r("Flow control error"));
        enumMap.put(C10867a.STREAM_CLOSED, tVar.mo50310r("Stream closed"));
        enumMap.put(C10867a.FRAME_TOO_LARGE, tVar.mo50310r("Frame too large"));
        enumMap.put(C10867a.REFUSED_STREAM, C12594t.f20198u.mo50310r("Refused stream"));
        enumMap.put(C10867a.CANCEL, C12594t.f20184g.mo50310r("Cancelled"));
        enumMap.put(C10867a.COMPRESSION_ERROR, tVar.mo50310r("Compression error"));
        enumMap.put(C10867a.CONNECT_ERROR, tVar.mo50310r("Connect error"));
        enumMap.put(C10867a.ENHANCE_YOUR_CALM, C12594t.f20192o.mo50310r("Enhance your calm"));
        enumMap.put(C10867a.INADEQUATE_SECURITY, C12594t.f20190m.mo50310r("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: R */
    private Request m32040R(InetSocketAddress inetSocketAddress, String str, String str2) {
        HttpUrl build = new HttpUrl.Builder().scheme("https").host(inetSocketAddress.getHostName()).port(inetSocketAddress.getPort()).build();
        Request.Builder url = new Request.Builder().url(build);
        Request.Builder header = url.header("Host", build.host() + ":" + build.port()).header("User-Agent", this.f22740c);
        if (!(str == null || str2 == null)) {
            header.header("Proxy-Authorization", Credentials.basic(str, str2));
        }
        return header.build();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public Socket m32041S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket;
        try {
            if (inetSocketAddress2.getAddress() != null) {
                socket = this.f22716A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                socket = this.f22716A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            socket.setTcpNoDelay(true);
            C13179y0 m = C13145j0.m29748m(socket);
            C13127d c = C13145j0.m29738c(C13145j0.m29744i(socket));
            Request R = m32040R(inetSocketAddress, str, str2);
            HttpUrl httpUrl = R.httpUrl();
            c.mo52486F(String.format("CONNECT %s:%d HTTP/1.1", new Object[]{httpUrl.host(), Integer.valueOf(httpUrl.port())})).mo52486F("\r\n");
            int size = R.headers().size();
            for (int i = 0; i < size; i++) {
                c.mo52486F(R.headers().name(i)).mo52486F(": ").mo52486F(R.headers().value(i)).mo52486F("\r\n");
            }
            c.mo52486F("\r\n");
            c.flush();
            StatusLine parse = StatusLine.parse(m32049i0(m));
            while (!m32049i0(m).equals("")) {
            }
            int i2 = parse.code;
            if (i2 >= 200 && i2 < 300) {
                return socket;
            }
            C13121c cVar = new C13121c();
            try {
                socket.shutdownOutput();
                m.read(cVar, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            } catch (IOException e) {
                cVar.mo52486F("Unable to read body: " + e.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw C12594t.f20198u.mo50310r(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", new Object[]{Integer.valueOf(parse.code), parse.message, cVar.mo52482B0()})).mo50299c();
        } catch (IOException e2) {
            throw C12594t.f20198u.mo50310r("Failed trying to connect with proxy").mo50309q(e2).mo50299c();
        }
    }

    /* renamed from: Z */
    private Throwable m32042Z() {
        synchronized (this.f22749l) {
            C12594t tVar = this.f22759v;
            if (tVar != null) {
                StatusException c = tVar.mo50299c();
                return c;
            }
            StatusException c2 = C12594t.f20198u.mo50310r("Connection closed").mo50299c();
            return c2;
        }
    }

    /* renamed from: b0 */
    private void m32043b0() {
        synchronized (this.f22749l) {
            this.f22733R.mo50028g(new C13898b());
        }
    }

    /* renamed from: c0 */
    private boolean m32044c0() {
        if (this.f22738a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private void m32045f0(C13893g gVar) {
        if (this.f22763z && this.f22721F.isEmpty() && this.f22752o.isEmpty()) {
            this.f22763z = false;
            C12223c1 c1Var = this.f22725J;
            if (c1Var != null) {
                c1Var.mo49767n();
            }
        }
        if (gVar.mo49675w()) {
            this.f22734S.mo50116e(gVar, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m32047h0(C10867a aVar, String str) {
        m32055m0(0, aVar, m32064r0(aVar).mo50303f(str));
    }

    /* renamed from: i0 */
    private static String m32049i0(C13179y0 y0Var) {
        C13121c cVar = new C13121c();
        while (y0Var.read(cVar, 1) != -1) {
            if (cVar.mo52530j0(cVar.size() - 1) == 10) {
                return cVar.mo52507U();
            }
        }
        throw new EOFException("\\n not found: " + cVar.mo52498M().mo52609l());
    }

    /* renamed from: l0 */
    private void m32053l0(C13893g gVar) {
        if (!this.f22763z) {
            this.f22763z = true;
            C12223c1 c1Var = this.f22725J;
            if (c1Var != null) {
                c1Var.mo49766m();
            }
        }
        if (gVar.mo49675w()) {
            this.f22734S.mo50116e(gVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m32055m0(int i, C10867a aVar, C12594t tVar) {
        synchronized (this.f22749l) {
            if (this.f22759v == null) {
                this.f22759v = tVar;
                this.f22744g.mo49860a(tVar);
            }
            if (aVar != null && !this.f22760w) {
                this.f22760w = true;
                this.f22747j.mo45834C(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, C13893g>> it = this.f22752o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (((Integer) next.getKey()).intValue() > i) {
                    it.remove();
                    ((C13893g) next.getValue()).mo49676x().mo49692M(tVar, C12402r.C12403a.REFUSED, false, new C12564o());
                    m32045f0((C13893g) next.getValue());
                }
            }
            for (C13893g next2 : this.f22721F) {
                next2.mo49676x().mo49692M(tVar, C12402r.C12403a.REFUSED, true, new C12564o());
                m32045f0(next2);
            }
            this.f22721F.clear();
            m32061p0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public boolean m32057n0() {
        boolean z = false;
        while (!this.f22721F.isEmpty() && this.f22752o.size() < this.f22720E) {
            m32059o0(this.f22721F.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: o0 */
    private void m32059o0(C13893g gVar) {
        boolean z;
        if (gVar.mo53596O() == -1) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "StreamId already assigned");
        this.f22752o.put(Integer.valueOf(this.f22751n), gVar);
        m32053l0(gVar);
        gVar.mo49676x().mo53601d0(this.f22751n);
        if (!(gVar.mo53595N() == C13783d0.C13787d.UNARY || gVar.mo53595N() == C13783d0.C13787d.SERVER_STREAMING) || gVar.mo53599R()) {
            this.f22747j.flush();
        }
        int i = this.f22751n;
        if (i >= 2147483645) {
            this.f22751n = Integer.MAX_VALUE;
            m32055m0(Integer.MAX_VALUE, C10867a.NO_ERROR, C12594t.f20198u.mo50310r("Stream ids exhausted"));
            return;
        }
        this.f22751n = i + 2;
    }

    /* renamed from: p0 */
    private void m32061p0() {
        if (this.f22759v != null && this.f22752o.isEmpty() && this.f22721F.isEmpty() && !this.f22762y) {
            this.f22762y = true;
            C12223c1 c1Var = this.f22725J;
            if (c1Var != null) {
                c1Var.mo49769p();
                this.f22724I = (ScheduledExecutorService) C12259f2.m26842f(C12404r0.f19761t, this.f22724I);
            }
            C12448v0 v0Var = this.f22761x;
            if (v0Var != null) {
                v0Var.mo50108f(m32042Z());
                this.f22761x = null;
            }
            if (!this.f22760w) {
                this.f22760w = true;
                this.f22747j.mo45834C(0, C10867a.NO_ERROR, new byte[0]);
            }
            this.f22747j.close();
        }
    }

    /* renamed from: r0 */
    static C12594t m32064r0(C10867a aVar) {
        C12594t tVar = f22713W.get(aVar);
        if (tVar != null) {
            return tVar;
        }
        C12594t tVar2 = C12594t.f20185h;
        return tVar2.mo50310r("Unknown http2 error code: " + aVar.f16679b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo53605T(boolean z, long j, long j2, boolean z2) {
        this.f22726K = z;
        this.f22727L = j;
        this.f22728M = j2;
        this.f22729N = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo53606U(int i, C12594t tVar, C12402r.C12403a aVar, boolean z, C10867a aVar2, C12564o oVar) {
        synchronized (this.f22749l) {
            C13893g remove = this.f22752o.remove(Integer.valueOf(i));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f22747j.mo45840i(i, C10867a.CANCEL);
                }
                if (tVar != null) {
                    C13893g.C13895b Q = remove.mo49676x();
                    if (oVar == null) {
                        oVar = new C12564o();
                    }
                    Q.mo49692M(tVar, aVar, z, oVar);
                }
                if (!m32057n0()) {
                    m32061p0();
                    m32045f0(remove);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C13893g[] mo53607V() {
        C13893g[] gVarArr;
        synchronized (this.f22749l) {
            gVarArr = (C13893g[]) this.f22752o.values().toArray(f22715Y);
        }
        return gVarArr;
    }

    /* renamed from: W */
    public C12155a mo53608W() {
        return this.f22758u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public String mo53609X() {
        URI b = C12404r0.m27323b(this.f22739b);
        if (b.getHost() != null) {
            return b.getHost();
        }
        return this.f22739b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public int mo53610Y() {
        URI b = C12404r0.m27323b(this.f22739b);
        if (b.getPort() != -1) {
            return b.getPort();
        }
        return this.f22738a.getPort();
    }

    /* renamed from: a */
    public void mo53586a(Throwable th) {
        C8012n.m15756o(th, "failureCause");
        m32055m0(0, C10867a.INTERNAL_ERROR, C12594t.f20198u.mo50309q(th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C13893g mo53611a0(int i) {
        C13893g gVar;
        synchronized (this.f22749l) {
            gVar = this.f22752o.get(Integer.valueOf(i));
        }
        return gVar;
    }

    /* renamed from: b */
    public void mo49697b(C12594t tVar) {
        synchronized (this.f22749l) {
            if (this.f22759v == null) {
                this.f22759v = tVar;
                this.f22744g.mo49860a(tVar);
                m32061p0();
            }
        }
    }

    /* renamed from: c */
    public void mo49698c(C12594t tVar) {
        mo49697b(tVar);
        synchronized (this.f22749l) {
            Iterator<Map.Entry<Integer, C13893g>> it = this.f22752o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                it.remove();
                ((C13893g) next.getValue()).mo49676x().mo49693N(tVar, false, new C12564o());
                m32045f0((C13893g) next.getValue());
            }
            for (C13893g next2 : this.f22721F) {
                next2.mo49676x().mo49693N(tVar, true, new C12564o());
                m32045f0(next2);
            }
            this.f22721F.clear();
            m32061p0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean mo53612d0() {
        if (this.f22717B == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public Runnable mo49700e(C12341k1.C12342a aVar) {
        this.f22744g = (C12341k1.C12342a) C8012n.m15756o(aVar, "listener");
        if (this.f22726K) {
            this.f22724I = (ScheduledExecutorService) C12259f2.m26841d(C12404r0.f19761t);
            C12223c1 c1Var = new C12223c1(new C12223c1.C12226c(this), this.f22724I, this.f22727L, this.f22728M, this.f22729N);
            this.f22725J = c1Var;
            c1Var.mo49768o();
        }
        if (m32044c0()) {
            synchronized (this.f22749l) {
                C13880b bVar = new C13880b(this, this.f22723H, this.f22746i);
                this.f22747j = bVar;
                this.f22748k = new C13914p(this, bVar);
            }
            this.f22754q.execute(new C13899c());
            return null;
        }
        C13875a R = C13875a.m31943R(this.f22754q, this);
        C10876g gVar = new C10876g();
        C10870c newWriter = gVar.newWriter(C13145j0.m29738c(R), true);
        synchronized (this.f22749l) {
            C13880b bVar2 = new C13880b(this, newWriter);
            this.f22747j = bVar2;
            this.f22748k = new C13914p(this, bVar2);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f22754q.execute(new C13900d(countDownLatch, R, gVar));
        try {
            mo53616k0();
            countDownLatch.countDown();
            this.f22754q.execute(new C13902e());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public boolean mo53613e0(int i) {
        boolean z;
        synchronized (this.f22749l) {
            if (i < this.f22751n) {
                z = true;
                if ((i & 1) == 1) {
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return this.f22750m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.mo50106a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49978g(p364io.grpc.internal.C12422s.C12423a r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f22749l
            monitor-enter(r0)
            yd.b r1 = r8.f22747j     // Catch:{ all -> 0x0054 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            goto L_0x000c
        L_0x000b:
            r1 = r3
        L_0x000c:
            p111h6.C8012n.m15761t(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r8.f22762y     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x001c
            java.lang.Throwable r1 = r8.m32042Z()     // Catch:{ all -> 0x0054 }
            p364io.grpc.internal.C12448v0.m27479g(r9, r10, r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x001c:
            io.grpc.internal.v0 r1 = r8.f22761x     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0024
            r4 = 0
            r2 = r3
            goto L_0x0042
        L_0x0024:
            java.util.Random r1 = r8.f22741d     // Catch:{ all -> 0x0054 }
            long r4 = r1.nextLong()     // Catch:{ all -> 0x0054 }
            h6.r<h6.p> r1 = r8.f22742e     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0054 }
            h6.p r1 = (p111h6.C8016p) r1     // Catch:{ all -> 0x0054 }
            r1.mo41849g()     // Catch:{ all -> 0x0054 }
            io.grpc.internal.v0 r6 = new io.grpc.internal.v0     // Catch:{ all -> 0x0054 }
            r6.<init>(r4, r1)     // Catch:{ all -> 0x0054 }
            r8.f22761x = r6     // Catch:{ all -> 0x0054 }
            io.grpc.internal.o2 r1 = r8.f22733R     // Catch:{ all -> 0x0054 }
            r1.mo50023b()     // Catch:{ all -> 0x0054 }
            r1 = r6
        L_0x0042:
            if (r2 == 0) goto L_0x004f
            yd.b r2 = r8.f22747j     // Catch:{ all -> 0x0054 }
            r6 = 32
            long r6 = r4 >>> r6
            int r6 = (int) r6     // Catch:{ all -> 0x0054 }
            int r4 = (int) r4     // Catch:{ all -> 0x0054 }
            r2.ping(r3, r6, r4)     // Catch:{ all -> 0x0054 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r1.mo50106a(r9, r10)
            return
        L_0x0054:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p464yd.C13896h.mo49978g(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* renamed from: g0 */
    public C13893g mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
        Object obj;
        C12564o oVar2 = oVar;
        C8012n.m15756o(d0Var, "method");
        C8012n.m15756o(oVar2, "headers");
        C12324i2 h = C12324i2.m27052h(cVarArr, mo53608W(), oVar2);
        Object obj2 = this.f22749l;
        synchronized (obj2) {
            try {
                obj = obj2;
                C13893g gVar = new C13893g(d0Var, oVar, this.f22747j, this, this.f22748k, this.f22749l, this.f22755r, this.f22743f, this.f22739b, this.f22740c, h, this.f22733R, bVar, this.f22732Q);
                return gVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo53615j0(C13893g gVar) {
        this.f22721F.remove(gVar);
        m32045f0(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo53616k0() {
        synchronized (this.f22749l) {
            this.f22747j.connectionPreface();
            C10883i iVar = new C10883i();
            C13910l.m32134c(iVar, 7, this.f22743f);
            this.f22747j.mo45838f0(iVar);
            int i = this.f22743f;
            if (i > 65535) {
                this.f22747j.windowUpdate(0, (long) (i - 65535));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo53617q0(C13893g gVar) {
        if (this.f22759v != null) {
            gVar.mo49676x().mo49692M(this.f22759v, C12402r.C12403a.REFUSED, true, new C12564o());
        } else if (this.f22752o.size() >= this.f22720E) {
            this.f22721F.add(gVar);
            m32053l0(gVar);
        } else {
            m32059o0(gVar);
        }
    }

    public String toString() {
        return C8003j.m15723c(this).mo41839c("logId", this.f22750m.mo53522d()).mo41840d("address", this.f22738a).toString();
    }

    /* renamed from: yd.h$d */
    /* compiled from: OkHttpClientTransport */
    class C13900d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f22767b;

        /* renamed from: c */
        final /* synthetic */ C13875a f22768c;

        /* renamed from: d */
        final /* synthetic */ C10884j f22769d;

        C13900d(CountDownLatch countDownLatch, C13875a aVar, C10884j jVar) {
            this.f22767b = countDownLatch;
            this.f22768c = aVar;
            this.f22769d = jVar;
        }

        public void run() {
            C13896h hVar;
            C13903f fVar;
            Socket k;
            SSLSocket sSLSocket;
            SSLSession sSLSession;
            C13798h0 h0Var;
            try {
                this.f22767b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            C13130e d = C13145j0.m29739d(new C13901a());
            try {
                C13896h hVar2 = C13896h.this;
                C13829u uVar = hVar2.f22736U;
                if (uVar == null) {
                    k = hVar2.f22716A.createSocket(C13896h.this.f22738a.getAddress(), C13896h.this.f22738a.getPort());
                } else if (uVar.mo53497b() instanceof InetSocketAddress) {
                    C13896h hVar3 = C13896h.this;
                    k = hVar3.m32041S(hVar3.f22736U.mo53498c(), (InetSocketAddress) C13896h.this.f22736U.mo53497b(), C13896h.this.f22736U.mo53499d(), C13896h.this.f22736U.mo53496a());
                } else {
                    C12594t tVar = C12594t.f20197t;
                    throw tVar.mo50310r("Unsupported SocketAddress implementation " + C13896h.this.f22736U.mo53497b().getClass()).mo50299c();
                }
                Socket socket = k;
                if (C13896h.this.f22717B != null) {
                    SSLSocket b = C13911m.m32136b(C13896h.this.f22717B, C13896h.this.f22718C, socket, C13896h.this.mo53609X(), C13896h.this.mo53610Y(), C13896h.this.f22722G);
                    sSLSession = b.getSession();
                    sSLSocket = b;
                } else {
                    sSLSession = null;
                    sSLSocket = socket;
                }
                sSLSocket.setTcpNoDelay(true);
                C13130e d2 = C13145j0.m29739d(C13145j0.m29748m(sSLSocket));
                this.f22768c.mo53581Q(C13145j0.m29744i(sSLSocket), sSLSocket);
                C13896h hVar4 = C13896h.this;
                C12155a.C12157b d3 = hVar4.f22758u.mo49608d().mo49614d(C12168f.f19077a, sSLSocket.getRemoteSocketAddress()).mo49614d(C12168f.f19078b, sSLSocket.getLocalSocketAddress()).mo49614d(C12168f.f19079c, sSLSession);
                C12155a.C12158c<C13798h0> cVar = C12399q0.f19728a;
                if (sSLSession == null) {
                    h0Var = C13798h0.NONE;
                } else {
                    h0Var = C13798h0.PRIVACY_AND_INTEGRITY;
                }
                C12155a unused2 = hVar4.f22758u = d3.mo49614d(cVar, h0Var).mo49612a();
                C13896h hVar5 = C13896h.this;
                C13903f unused3 = hVar5.f22757t = new C13903f(hVar5, this.f22769d.newReader(d2, true));
                synchronized (C13896h.this.f22749l) {
                    Socket unused4 = C13896h.this.f22719D = (Socket) C8012n.m15756o(sSLSocket, "socket");
                    if (sSLSession != null) {
                        C13832v.C13834b unused5 = C13896h.this.f22735T = new C13832v.C13834b(new C13832v.C13835c(sSLSession));
                    }
                }
                return;
            } catch (StatusException e) {
                C13896h.this.m32055m0(0, C10867a.INTERNAL_ERROR, e.mo49601a());
                hVar = C13896h.this;
                fVar = new C13903f(hVar, this.f22769d.newReader(d, true));
            } catch (Exception e2) {
                C13896h.this.mo53586a(e2);
                hVar = C13896h.this;
                fVar = new C13903f(hVar, this.f22769d.newReader(d, true));
            } catch (Throwable th) {
                C13896h hVar6 = C13896h.this;
                C13903f unused6 = hVar6.f22757t = new C13903f(hVar6, this.f22769d.newReader(d, true));
                throw th;
            }
            C13903f unused7 = hVar.f22757t = fVar;
        }

        /* renamed from: yd.h$d$a */
        /* compiled from: OkHttpClientTransport */
        class C13901a implements C13179y0 {
            C13901a() {
            }

            public long read(C13121c cVar, long j) {
                return -1;
            }

            public C13181z0 timeout() {
                return C13181z0.NONE;
            }

            public void close() {
            }
        }
    }
}
