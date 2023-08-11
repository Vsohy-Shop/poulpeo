package p042bo.app;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
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

/* renamed from: bo.app.r4 */
public final class C3634r4 implements C3554p2 {

    /* renamed from: a */
    private final C3315k2 f2484a;

    /* renamed from: b */
    private final C3285j2 f2485b;

    /* renamed from: c */
    private final C3285j2 f2486c;

    /* renamed from: d */
    private final C3280j1 f2487d;

    /* renamed from: e */
    private final C3119e5 f2488e;

    /* renamed from: f */
    private final C2962a0 f2489f;

    /* renamed from: g */
    private final C3023b2 f2490g;

    /* renamed from: bo.app.r4$a */
    static final class C3635a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3635a f2491b = new C3635a();

        C3635a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    @C12739f(mo50609c = "com.braze.requests.RequestExecutor$execute$2", mo50610f = "RequestExecutor.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.r4$b */
    static final class C3636b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2492b;

        /* renamed from: c */
        final /* synthetic */ C3634r4 f2493c;

        /* renamed from: d */
        final /* synthetic */ C3042c2 f2494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3636b(C3634r4 r4Var, C3042c2 c2Var, C12074d<? super C3636b> dVar) {
            super(2, dVar);
            this.f2493c = r4Var;
            this.f2494d = c2Var;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3636b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3636b(this.f2493c, this.f2494d, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2492b == 0) {
                C11910n.m25701b(obj);
                this.f2493c.m3792a(this.f2494d);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.r4$c */
    static final class C3637c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3637c f2495b = new C3637c();

        C3637c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    public C3634r4(C3315k2 k2Var, C3285j2 j2Var, C3285j2 j2Var2, C3280j1 j1Var, C3119e5 e5Var, C2962a0 a0Var, C3023b2 b2Var) {
        C12775o.m28639i(k2Var, "httpConnector");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(j2Var2, "externalEventPublisher");
        C12775o.m28639i(j1Var, "feedStorageProvider");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(a0Var, "contentCardsStorageProvider");
        C12775o.m28639i(b2Var, "brazeManager");
        this.f2484a = k2Var;
        this.f2485b = j2Var;
        this.f2486c = j2Var2;
        this.f2487d = j1Var;
        this.f2488e = e5Var;
        this.f2489f = a0Var;
        this.f2490g = b2Var;
    }

    /* renamed from: b */
    public void mo29500b(C3502o2 o2Var) {
        C3042c2 c2Var;
        C3502o2 o2Var2 = o2Var;
        C12775o.m28639i(o2Var2, "request");
        if (o2Var2 instanceof C3042c2) {
            c2Var = (C3042c2) o2Var2;
        } else {
            c2Var = null;
        }
        if (c2Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3635a.f2491b, 6, (Object) null);
            return;
        }
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3636b(this, c2Var, (C12074d<? super C3636b>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public void mo29499a(C3502o2 o2Var) {
        C12775o.m28639i(o2Var, "request");
        C3042c2 c2Var = o2Var instanceof C3042c2 ? (C3042c2) o2Var : null;
        if (c2Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3637c.f2495b, 6, (Object) null);
        } else {
            m3792a(c2Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m3792a(C3042c2 c2Var) {
        new C3641s(c2Var, this.f2484a, this.f2485b, this.f2486c, this.f2487d, this.f2490g, this.f2488e, this.f2489f).mo29612c();
    }
}
