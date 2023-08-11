package p042bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p270x.C10156b;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bo.app.h0 */
public final class C3174h0 {

    /* renamed from: n */
    public static final C3180c f1741n = new C3180c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1742a;

    /* renamed from: b */
    private final C3157g0 f1743b;

    /* renamed from: c */
    private BroadcastReceiver f1744c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f1745d;

    /* renamed from: e */
    private final C3091d1 f1746e = new C3091d1((int) TimeUnit.MINUTES.toMillis(5), 0, 2, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3439m5 f1747f = C3439m5.NO_SESSION;

    /* renamed from: g */
    private long f1748g = -1;

    /* renamed from: h */
    private volatile boolean f1749h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ConnectivityManager f1750i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3700t3 f1751j;

    /* renamed from: k */
    private C14054y1 f1752k;

    /* renamed from: l */
    private int f1753l;

    /* renamed from: m */
    private boolean f1754m;

    /* renamed from: bo.app.h0$a */
    public static final class C3175a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        final /* synthetic */ C3174h0 f1755a;

        C3175a(C3174h0 h0Var) {
            this.f1755a = h0Var;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C12775o.m28639i(network, "network");
            C12775o.m28639i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            this.f1755a.m2961a(networkCapabilities);
        }

        public void onLost(Network network) {
            C12775o.m28639i(network, "network");
            super.onLost(network);
            Network activeNetwork = this.f1755a.f1750i.getActiveNetwork();
            C3174h0 h0Var = this.f1755a;
            h0Var.m2961a(h0Var.f1750i.getNetworkCapabilities(activeNetwork));
        }
    }

    /* renamed from: bo.app.h0$b */
    public static final class C3176b extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C3174h0 f1756a;

        /* renamed from: b */
        final /* synthetic */ C3285j2 f1757b;

        @C12739f(mo50609c = "com.braze.dispatch.DataSyncPolicyProvider$2$onReceive$1", mo50610f = "DataSyncPolicyProvider.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: bo.app.h0$b$a */
        static final class C3177a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: b */
            int f1758b;

            /* renamed from: c */
            private /* synthetic */ Object f1759c;

            /* renamed from: d */
            final /* synthetic */ C3174h0 f1760d;

            /* renamed from: e */
            final /* synthetic */ Intent f1761e;

            /* renamed from: f */
            final /* synthetic */ C3285j2 f1762f;

            /* renamed from: g */
            final /* synthetic */ BroadcastReceiver.PendingResult f1763g;

            /* renamed from: bo.app.h0$b$a$a */
            static final class C3178a extends C12777p implements C13074a<String> {

                /* renamed from: b */
                public static final C3178a f1764b = new C3178a();

                C3178a() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Retrieving connectivity event data in background";
                }
            }

            /* renamed from: bo.app.h0$b$a$b */
            static final class C3179b extends C12777p implements C13074a<String> {

                /* renamed from: b */
                public static final C3179b f1765b = new C3179b();

                C3179b() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3177a(C3174h0 h0Var, Intent intent, C3285j2 j2Var, BroadcastReceiver.PendingResult pendingResult, C12074d<? super C3177a> dVar) {
                super(2, dVar);
                this.f1760d = h0Var;
                this.f1761e = intent;
                this.f1762f = j2Var;
                this.f1763g = pendingResult;
            }

            /* renamed from: a */
            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C3177a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                C3177a aVar = new C3177a(this.f1760d, this.f1761e, this.f1762f, this.f1763g, dVar);
                aVar.f1759c = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f1758b == 0) {
                    C11910n.m25701b(obj);
                    C13995l0 l0Var = (C13995l0) this.f1759c;
                    C8266c.m16396e(C8266c.f11641a, l0Var, C8266c.C8267a.f11650f, (Throwable) null, false, C3178a.f1764b, 6, (Object) null);
                    try {
                        C3174h0 h0Var = this.f1760d;
                        h0Var.f1751j = C3741v.m4007a(this.f1761e, h0Var.f1750i);
                        this.f1760d.mo28958c();
                    } catch (Exception e) {
                        Exception exc = e;
                        C8266c.m16396e(C8266c.f11641a, l0Var, C8266c.C8267a.f11649e, exc, false, C3179b.f1765b, 4, (Object) null);
                        this.f1760d.m2970a(this.f1762f, (Throwable) exc);
                    }
                    this.f1763g.finish();
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C3176b(C3174h0 h0Var, C3285j2 j2Var) {
            this.f1756a = h0Var;
            this.f1757b = j2Var;
        }

        public void onReceive(Context context, Intent intent) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intent, "intent");
            BroadcastReceiver.PendingResult goAsync = goAsync();
            C10606a aVar = C10606a.f16162b;
            C14054y1 unused = C13985j.m32422d(aVar, (C12079g) null, (C14004n0) null, new C3177a(this.f1756a, intent, this.f1757b, goAsync, (C12074d<? super C3177a>) null), 3, (Object) null);
        }
    }

    /* renamed from: bo.app.h0$c */
    public static final class C3180c {
        public /* synthetic */ C3180c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3180c() {
        }
    }

    /* renamed from: bo.app.h0$d */
    public /* synthetic */ class C3181d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1766a;

        static {
            int[] iArr = new int[C3700t3.values().length];
            iArr[C3700t3.NONE.ordinal()] = 1;
            iArr[C3700t3.BAD.ordinal()] = 2;
            iArr[C3700t3.GREAT.ordinal()] = 3;
            iArr[C3700t3.GOOD.ordinal()] = 4;
            f1766a = iArr;
        }
    }

    /* renamed from: bo.app.h0$e */
    static final class C3182e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3182e f1767b = new C3182e();

        C3182e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received network error event. Backing off.";
        }
    }

    /* renamed from: bo.app.h0$f */
    static final class C3183f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3174h0 f1768b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3183f(C3174h0 h0Var) {
            super(0);
            this.f1768b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Received successful request flush. Default flush interval reset to ", Long.valueOf(this.f1768b.mo28957b()));
        }
    }

    /* renamed from: bo.app.h0$g */
    static final class C3184g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f1769b;

        /* renamed from: c */
        final /* synthetic */ C3174h0 f1770c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3184g(long j, C3174h0 h0Var) {
            super(0);
            this.f1769b = j;
            this.f1770c = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Kicking off the Sync Job. initialDelaysMs: " + this.f1769b + ": currentIntervalMs " + this.f1770c.mo28957b() + " ms";
        }
    }

    @C12739f(mo50609c = "com.braze.dispatch.DataSyncPolicyProvider$kickoffSyncJob$2", mo50610f = "DataSyncPolicyProvider.kt", mo50611l = {169, 173}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.h0$h */
    static final class C3185h extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        long f1771b;

        /* renamed from: c */
        int f1772c;

        /* renamed from: d */
        private /* synthetic */ Object f1773d;

        /* renamed from: e */
        final /* synthetic */ C3174h0 f1774e;

        /* renamed from: f */
        final /* synthetic */ long f1775f;

        /* renamed from: bo.app.h0$h$a */
        static final class C3186a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3186a f1776b = new C3186a();

            C3186a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush from automatic sync policy";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3185h(C3174h0 h0Var, long j, C12074d<? super C3185h> dVar) {
            super(2, dVar);
            this.f1774e = h0Var;
            this.f1775f = j;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3185h) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C3185h hVar = new C3185h(this.f1774e, this.f1775f, dVar);
            hVar.f1773d = obj;
            return hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: yf.l0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r13.f1772c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                long r3 = r13.f1771b
                java.lang.Object r1 = r13.f1773d
                yf.l0 r1 = (p466yf.C13995l0) r1
                p336ef.C11910n.m25701b(r14)
                r14 = r13
            L_0x0018:
                r11 = r3
                goto L_0x006d
            L_0x001a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0022:
                long r3 = r13.f1771b
                java.lang.Object r1 = r13.f1773d
                yf.l0 r1 = (p466yf.C13995l0) r1
                p336ef.C11910n.m25701b(r14)
                goto L_0x004a
            L_0x002c:
                p336ef.C11910n.m25701b(r14)
                java.lang.Object r14 = r13.f1773d
                r1 = r14
                yf.l0 r1 = (p466yf.C13995l0) r1
                bo.app.h0 r14 = r13.f1774e
                long r4 = r14.mo28957b()
                long r6 = r13.f1775f
                r13.f1773d = r1
                r13.f1771b = r4
                r13.f1772c = r3
                java.lang.Object r14 = p466yf.C14041v0.m32563a(r6, r13)
                if (r14 != r0) goto L_0x0049
                return r0
            L_0x0049:
                r3 = r4
            L_0x004a:
                x.b$a r14 = p270x.C10156b.f15345m
                bo.app.h0 r5 = r13.f1774e
                android.content.Context r5 = r5.f1742a
                x.b r14 = r14.mo44811g(r5)
                r14.mo44795l0()
                r14 = r13
            L_0x005a:
                boolean r5 = p466yf.C13999m0.m32453g(r1)
                if (r5 == 0) goto L_0x008c
                r14.f1773d = r1
                r14.f1771b = r3
                r14.f1772c = r2
                java.lang.Object r5 = p466yf.C14041v0.m32563a(r3, r14)
                if (r5 != r0) goto L_0x0018
                return r0
            L_0x006d:
                j0.c r3 = p126j0.C8266c.f11641a
                j0.c$a r5 = p126j0.C8266c.C8267a.f11650f
                bo.app.h0$h$a r8 = p042bo.app.C3174h0.C3185h.C3186a.f1776b
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                r4 = r1
                p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)
                x.b$a r3 = p270x.C10156b.f15345m
                bo.app.h0 r4 = r14.f1774e
                android.content.Context r4 = r4.f1742a
                x.b r3 = r3.mo44811g(r4)
                r3.mo44795l0()
                r3 = r11
                goto L_0x005a
            L_0x008c:
                ef.v r14 = p336ef.C11921v.f18618a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3174h0.C3185h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: bo.app.h0$i */
    static final class C3187i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3174h0 f1777b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3187i(C3174h0 h0Var) {
            super(0);
            this.f1777b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval is " + this.f1777b.mo28957b() + " ms. Not scheduling a proceeding data flush.";
        }
    }

    /* renamed from: bo.app.h0$j */
    static final class C3188j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3188j f1778b = new C3188j();

        C3188j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log throwable.";
        }
    }

    /* renamed from: bo.app.h0$k */
    static final class C3189k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3174h0 f1779b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3189k(C3174h0 h0Var) {
            super(0);
            this.f1779b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "recalculateDispatchState called with session state: " + this.f1779b.f1747f + " lastNetworkLevel: " + this.f1779b.f1751j;
        }
    }

    /* renamed from: bo.app.h0$l */
    static final class C3190l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3174h0 f1780b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3190l(C3174h0 h0Var) {
            super(0);
            this.f1780b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Flush interval was too low (" + this.f1780b.mo28957b() + "), moving to minimum of 1000 ms";
        }
    }

    /* renamed from: bo.app.h0$m */
    static final class C3191m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3174h0 f1781b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3191m(C3174h0 h0Var) {
            super(0);
            this.f1781b = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("currentIntervalMs: ", Long.valueOf(this.f1781b.mo28957b()));
        }
    }

    /* renamed from: bo.app.h0$n */
    static final class C3192n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f1782b;

        /* renamed from: c */
        final /* synthetic */ C3174h0 f1783c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3192n(long j, C3174h0 h0Var) {
            super(0);
            this.f1782b = j;
            this.f1783c = h0Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval has changed from " + this.f1782b + " ms to " + this.f1783c.mo28957b() + " ms after connectivity state change to: " + this.f1783c.f1751j + " and session state: " + this.f1783c.f1747f;
        }
    }

    /* renamed from: bo.app.h0$o */
    static final class C3193o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f1784b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3193o(long j) {
            super(0);
            this.f1784b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting new sync runnable with delay " + this.f1784b + " ms";
        }
    }

    /* renamed from: bo.app.h0$p */
    static final class C3194p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3194p f1785b = new C3194p();

        C3194p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is already running. Ignoring request.";
        }
    }

    /* renamed from: bo.app.h0$q */
    static final class C3195q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3195q f1786b = new C3195q();

        C3195q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data sync started";
        }
    }

    /* renamed from: bo.app.h0$r */
    static final class C3196r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3196r f1787b = new C3196r();

        C3196r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is not running. Ignoring request.";
        }
    }

    /* renamed from: bo.app.h0$s */
    static final class C3197s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3197s f1788b = new C3197s();

        C3197s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Data sync stopped";
        }
    }

    /* renamed from: bo.app.h0$t */
    static final class C3198t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3198t f1789b = new C3198t();

        C3198t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to unregister Connectivity callback";
        }
    }

    public C3174h0(Context context, C3285j2 j2Var, C3157g0 g0Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(j2Var, "eventPublisher");
        C12775o.m28639i(g0Var, "dataSyncConfigurationProvider");
        this.f1742a = context;
        this.f1743b = g0Var;
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.f1750i = (ConnectivityManager) systemService;
            this.f1751j = C3700t3.NONE;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f1745d = new C3175a(this);
            } else {
                this.f1744c = new C3176b(this, j2Var);
            }
            mo28955a(j2Var);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: g */
    public final void mo28962g() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.f1750i;
                ConnectivityManager.NetworkCallback networkCallback = this.f1745d;
                if (networkCallback == null) {
                    C12775o.m28656z("connectivityNetworkCallback");
                    networkCallback = null;
                }
                connectivityManager.unregisterNetworkCallback(networkCallback);
                return;
            }
            this.f1742a.unregisterReceiver(this.f1744c);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3198t.f1789b, 4, (Object) null);
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo28960e() {
        if (this.f1749h) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3194p.f1785b, 7, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3195q.f1786b, 7, (Object) null);
        mo28959d();
        m2972b(this.f1748g);
        this.f1749h = true;
        return true;
    }

    /* renamed from: f */
    public final synchronized boolean mo28961f() {
        if (!this.f1749h) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3196r.f1787b, 7, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3197s.f1788b, 7, (Object) null);
        m2960a();
        mo28962g();
        this.f1749h = false;
        return true;
    }

    /* renamed from: b */
    public final long mo28957b() {
        return this.f1748g;
    }

    /* renamed from: c */
    public final void mo28958c() {
        long j;
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C3189k(this), 6, (Object) null);
        long j2 = this.f1748g;
        if (this.f1747f == C3439m5.NO_SESSION || this.f1754m || this.f1753l >= 50) {
            this.f1748g = -1;
        } else {
            int i = C3181d.f1766a[this.f1751j.ordinal()];
            if (i == 1) {
                j = -1;
            } else if (i == 2) {
                j = this.f1743b.mo28927a();
            } else if (i == 3) {
                j = this.f1743b.mo28929c();
            } else if (i == 4) {
                j = this.f1743b.mo28928b();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.f1748g = j;
            if (j != -1 && j < 1000) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3190l(this), 6, (Object) null);
                this.f1748g = 1000;
            }
        }
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C3191m(this), 6, (Object) null);
        if (j2 != this.f1748g) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3192n(j2, this), 7, (Object) null);
            m2972b(this.f1748g);
        }
    }

    /* renamed from: d */
    public final void mo28959d() {
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f1750i;
            ConnectivityManager.NetworkCallback networkCallback = this.f1745d;
            if (networkCallback == null) {
                C12775o.m28656z("connectivityNetworkCallback");
                networkCallback = null;
            }
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
            m2961a(this.f1750i.getNetworkCapabilities(this.f1750i.getActiveNetwork()));
            return;
        }
        this.f1742a.registerReceiver(this.f1744c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: b */
    private final void m2972b(long j) {
        m2960a();
        if (this.f1748g >= 1000) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3193o(j), 7, (Object) null);
            this.f1752k = m2959a(j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28956a(boolean z) {
        this.f1754m = z;
        mo28958c();
        if (z) {
            mo28961f();
        } else {
            mo28960e();
        }
    }

    /* renamed from: a */
    private final C14054y1 m2959a(long j) {
        long j2 = j;
        if (this.f1748g >= 1000) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3184g(j2, this), 6, (Object) null);
            return C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3185h(this, j2, (C12074d<? super C3185h>) null), 3, (Object) null);
        }
        C10156b.f15345m.mo44811g(this.f1742a).mo44795l0();
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3187i(this), 7, (Object) null);
        return null;
    }

    /* renamed from: a */
    private final void m2960a() {
        C14054y1 y1Var = this.f1752k;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f1752k = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2970a(C3285j2 j2Var, Throwable th) {
        try {
            j2Var.mo29152a(th, Throwable.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3188j.f1778b, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2961a(NetworkCapabilities networkCapabilities) {
        this.f1751j = C3741v.m4008a(networkCapabilities);
        mo28958c();
    }

    /* renamed from: a */
    public final void mo28955a(C3285j2 j2Var) {
        C12775o.m28639i(j2Var, "eventManager");
        j2Var.mo29153a(new C3798x6(this), C3399l5.class);
        j2Var.mo29153a(new C3818y6(this), C3466n5.class);
        j2Var.mo29153a(new C3838z6(this), C3701t4.class);
        j2Var.mo29153a(new C3004a7(this), C3729u4.class);
        j2Var.mo29153a(new C3033b7(this), C3165g5.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2965a(C3174h0 h0Var, C3399l5 l5Var) {
        C12775o.m28639i(h0Var, "this$0");
        C12775o.m28639i(l5Var, "it");
        h0Var.f1747f = C3439m5.OPEN_SESSION;
        h0Var.f1753l = 0;
        h0Var.mo28958c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2966a(C3174h0 h0Var, C3466n5 n5Var) {
        C12775o.m28639i(h0Var, "this$0");
        C12775o.m28639i(n5Var, "it");
        h0Var.f1747f = C3439m5.NO_SESSION;
        h0Var.mo28958c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2968a(C3174h0 h0Var, C3701t4 t4Var) {
        C12775o.m28639i(h0Var, "this$0");
        C12775o.m28639i(t4Var, "it");
        C8266c.m16396e(C8266c.f11641a, h0Var, (C8266c.C8267a) null, (Throwable) null, false, C3182e.f1767b, 7, (Object) null);
        long j = h0Var.f1748g;
        h0Var.m2972b(j + ((long) h0Var.f1746e.mo28812a((int) j)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2969a(C3174h0 h0Var, C3729u4 u4Var) {
        C12775o.m28639i(h0Var, "this$0");
        C12775o.m28639i(u4Var, "it");
        if (h0Var.f1746e.mo28813b()) {
            h0Var.f1746e.mo28814c();
            C8266c.m16396e(C8266c.f11641a, h0Var, (C8266c.C8267a) null, (Throwable) null, false, new C3183f(h0Var), 7, (Object) null);
            h0Var.m2972b(h0Var.f1748g);
        }
        h0Var.f1753l = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2963a(C3174h0 h0Var, C3165g5 g5Var) {
        C12775o.m28639i(h0Var, "this$0");
        C12775o.m28639i(g5Var, "$dstr$responseError");
        if (g5Var.mo28939a() instanceof C3789x4) {
            h0Var.f1753l++;
            h0Var.mo28958c();
        }
    }
}
