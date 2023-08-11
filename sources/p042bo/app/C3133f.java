package p042bo.app;

import androidx.core.app.NotificationCompat;
import com.braze.configuration.C4218b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3497o0;
import p126j0.C8266c;
import p281y.C10606a;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bo.app.f */
public final class C3133f implements C3203h2 {

    /* renamed from: i */
    public static final C3134a f1684i = new C3134a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f1685j = C8266c.m16405n(C3133f.class);

    /* renamed from: a */
    private final C4218b f1686a;

    /* renamed from: b */
    private final C3554p2 f1687b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3571q0 f1688c;

    /* renamed from: d */
    private final boolean f1689d;

    /* renamed from: e */
    private final ReentrantLock f1690e = new ReentrantLock();

    /* renamed from: f */
    private final C3660s0 f1691f;

    /* renamed from: g */
    private volatile boolean f1692g;

    /* renamed from: h */
    private volatile C14054y1 f1693h;

    /* renamed from: bo.app.f$a */
    public static final class C3134a {
        public /* synthetic */ C3134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3134a() {
        }
    }

    /* renamed from: bo.app.f$b */
    public /* synthetic */ class C3135b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1694a;

        static {
            int[] iArr = new int[C3497o0.C3500b.values().length];
            iArr[C3497o0.C3500b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            iArr[C3497o0.C3500b.ADD_BRAZE_EVENT.ordinal()] = 2;
            iArr[C3497o0.C3500b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            iArr[C3497o0.C3500b.ADD_REQUEST.ordinal()] = 4;
            f1694a = iArr;
        }
    }

    @C12739f(mo50609c = "com.braze.dispatch.AutomaticDispatchDecorator$kickoffDispatchJob$1", mo50610f = "AutomaticDispatchDecorator.kt", mo50611l = {128}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.f$c */
    static final class C3136c extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f1695b;

        /* renamed from: c */
        private /* synthetic */ Object f1696c;

        /* renamed from: d */
        final /* synthetic */ C3133f f1697d;

        /* renamed from: bo.app.f$c$a */
        static final class C3137a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Exception f1698b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3137a(Exception exc) {
                super(0);
                this.f1698b = exc;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Automatic thread interrupted! This is usually the result of calling changeUser(). [" + this.f1698b + ']';
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3136c(C3133f fVar, C12074d<? super C3136c> dVar) {
            super(2, dVar);
            this.f1697d = fVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3136c) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C3136c cVar = new C3136c(this.f1697d, dVar);
            cVar.f1696c = obj;
            return cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[SYNTHETIC, Splitter:B:14:0x0030] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r12.f1695b
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r12.f1696c
                yf.l0 r1 = (p466yf.C13995l0) r1
                p336ef.C11910n.m25701b(r13)     // Catch:{ Exception -> 0x0015 }
                r3 = r13
                r13 = r12
                goto L_0x0041
            L_0x0015:
                r13 = move-exception
                r7 = r13
                r13 = r12
                goto L_0x004b
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                p336ef.C11910n.m25701b(r13)
                java.lang.Object r13 = r12.f1696c
                yf.l0 r13 = (p466yf.C13995l0) r13
                r1 = r13
                r13 = r12
            L_0x002a:
                boolean r3 = p466yf.C13999m0.m32453g(r1)
                if (r3 == 0) goto L_0x0060
                bo.app.f r3 = r13.f1697d     // Catch:{ Exception -> 0x0049 }
                bo.app.q0 r3 = r3.f1688c     // Catch:{ Exception -> 0x0049 }
                r13.f1696c = r1     // Catch:{ Exception -> 0x0049 }
                r13.f1695b = r2     // Catch:{ Exception -> 0x0049 }
                java.lang.Object r3 = r3.mo29520a((p355hf.C12074d<? super p042bo.app.C3042c2>) r13)     // Catch:{ Exception -> 0x0049 }
                if (r3 != r0) goto L_0x0041
                return r0
            L_0x0041:
                bo.app.c2 r3 = (p042bo.app.C3042c2) r3     // Catch:{ Exception -> 0x0049 }
                bo.app.f r4 = r13.f1697d     // Catch:{ Exception -> 0x0049 }
                r4.m2889a((p042bo.app.C3042c2) r3)     // Catch:{ Exception -> 0x0049 }
                goto L_0x002a
            L_0x0049:
                r3 = move-exception
                r7 = r3
            L_0x004b:
                j0.c r4 = p126j0.C8266c.f11641a
                java.lang.String r5 = p042bo.app.C3133f.f1685j
                j0.c$a r6 = p126j0.C8266c.C8267a.f11650f
                bo.app.f$c$a r9 = new bo.app.f$c$a
                r9.<init>(r7)
                r8 = 0
                r10 = 8
                r11 = 0
                p126j0.C8266c.m16397f(r4, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x002a
            L_0x0060:
                ef.v r13 = p336ef.C11921v.f18618a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3133f.C3136c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: bo.app.f$d */
    static final class C3138d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3138d f1699b = new C3138d();

        C3138d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Automatic request execution start was previously requested, continuing without action.";
        }
    }

    public C3133f(C4218b bVar, C3285j2 j2Var, C3554p2 p2Var, C3571q0 q0Var, boolean z) {
        C12775o.m28639i(bVar, "appConfigurationProvider");
        C12775o.m28639i(j2Var, "internalIEventMessenger");
        C12775o.m28639i(p2Var, "requestExecutor");
        C12775o.m28639i(q0Var, "dispatchManager");
        this.f1686a = bVar;
        this.f1687b = p2Var;
        this.f1688c = q0Var;
        this.f1689d = z;
        this.f1691f = new C3660s0(j2Var, z);
        j2Var.mo29153a(new C3778w6(this, j2Var), C3497o0.class);
    }

    /* renamed from: c */
    private final C14054y1 m2895c() {
        return C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3136c(this, (C12074d<? super C3136c>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public final void mo28896d() {
        ReentrantLock reentrantLock = this.f1690e;
        reentrantLock.lock();
        try {
            if (this.f1692g) {
                C8266c.m16397f(C8266c.f11641a, f1685j, (C8266c.C8267a) null, (Throwable) null, false, C3138d.f1699b, 14, (Object) null);
                return;
            }
            this.f1693h = m2895c();
            this.f1692g = true;
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    private final C3216i0 m2892b() {
        return new C3216i0(this.f1686a.getBaseUrlForRequests(), (C2995a4) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public void mo28895b(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        this.f1688c.mo29525b(x1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m2891a(C3133f fVar, C3285j2 j2Var, C3497o0 o0Var) {
        C12775o.m28639i(fVar, "this$0");
        C12775o.m28639i(j2Var, "$internalIEventMessenger");
        C12775o.m28639i(o0Var, "$dstr$commandType$brazeEvent$sessionId$brazeRequest");
        C3497o0.C3500b a = o0Var.mo29423a();
        C3785x1 b = o0Var.mo29424b();
        C3289j5 c = o0Var.mo29425c();
        C3042c2 d = o0Var.mo29426d();
        int i = C3135b.f1694a[a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && d != null) {
                        fVar.mo28892a(j2Var, d);
                    }
                } else if (c != null) {
                    fVar.mo28893a(c);
                }
            } else if (b != null) {
                fVar.mo28894a(b);
            }
        } else if (b != null) {
            fVar.mo28895b(b);
        }
    }

    /* renamed from: b */
    private final void m2893b(C3042c2 c2Var) {
        if (c2Var.mo28606b() || this.f1689d) {
            this.f1691f.mo29499a(c2Var);
        } else {
            this.f1687b.mo29499a(c2Var);
        }
    }

    /* renamed from: a */
    public void mo28894a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        this.f1688c.mo28894a(x1Var);
    }

    /* renamed from: a */
    public void mo28892a(C3285j2 j2Var, C3042c2 c2Var) {
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(c2Var, "request");
        this.f1688c.mo29522a(j2Var, c2Var);
    }

    /* renamed from: a */
    public void mo28893a(C3289j5 j5Var) {
        C12775o.m28639i(j5Var, "sessionId");
        this.f1688c.mo29523a(j5Var);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo28891a(C3285j2 j2Var) {
        C12775o.m28639i(j2Var, "eventMessenger");
        ReentrantLock reentrantLock = this.f1690e;
        reentrantLock.lock();
        try {
            C14054y1 y1Var = this.f1693h;
            if (y1Var != null) {
                C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f1693h = null;
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            if (!this.f1688c.mo29526b()) {
                this.f1688c.mo29522a(j2Var, (C3042c2) m2892b());
            }
            C3042c2 d = this.f1688c.mo29528d();
            if (d != null) {
                m2893b(d);
            }
            j2Var.mo29151a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2889a(C3042c2 c2Var) {
        if (c2Var.mo28606b() || this.f1689d) {
            this.f1691f.mo29500b(c2Var);
        } else {
            this.f1687b.mo29500b(c2Var);
        }
    }
}
