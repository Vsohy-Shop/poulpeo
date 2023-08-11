package p042bo.app;

import com.appboy.events.FeedUpdatedEvent;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p031b0.C2803a;
import p031b0.C2807d;
import p031b0.C2814i;
import p057d0.C7208a;
import p069e0.C7358a;
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
import p466yf.C14041v0;
import p466yf.C14054y1;

/* renamed from: bo.app.s */
public final class C3641s {

    /* renamed from: j */
    public static final C3642a f2498j = new C3642a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f2499k = C8266c.m16405n(C3641s.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3042c2 f2500a;

    /* renamed from: b */
    private final C3315k2 f2501b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3285j2 f2502c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3285j2 f2503d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3280j1 f2504e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3023b2 f2505f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3119e5 f2506g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2962a0 f2507h;

    /* renamed from: i */
    private final Map<String, String> f2508i;

    /* renamed from: bo.app.s$a */
    public static final class C3642a {

        /* renamed from: bo.app.s$a$a */
        static final class C3643a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Object f2509b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3643a(Object obj) {
                super(0);
                this.f2509b = obj;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Encountered exception while parsing server response for ", this.f2509b);
            }
        }

        public /* synthetic */ C3642a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3642a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m3822a(Object obj, C13074a<C11921v> aVar) {
            try {
                aVar.invoke();
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, obj, C8266c.C8267a.f11649e, e, false, new C3643a(obj), 4, (Object) null);
            }
        }
    }

    /* renamed from: bo.app.s$b */
    static final class C3644b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3753v4 f2510b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3644b(C3753v4 v4Var) {
            super(0);
            this.f2510b = v4Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not parse request parameters for POST request to " + this.f2510b + ", cancelling request.";
        }
    }

    /* renamed from: bo.app.s$c */
    static final class C3645c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Exception f2511b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3645c(Exception exc) {
            super(0);
            this.f2511b = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Experienced network communication exception processing API response. Sending network error event. ", this.f2511b.getMessage());
        }
    }

    /* renamed from: bo.app.s$d */
    static final class C3646d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3646d f2512b = new C3646d();

        C3646d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception processing API response. Failing task.";
        }
    }

    /* renamed from: bo.app.s$e */
    static final class C3647e extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2513b;

        /* renamed from: c */
        final /* synthetic */ C3820z f2514c;

        /* renamed from: d */
        final /* synthetic */ String f2515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3647e(C3641s sVar, C3820z zVar, String str) {
            super(0);
            this.f2513b = sVar;
            this.f2514c = zVar;
            this.f2515d = str;
        }

        /* renamed from: a */
        public final void mo29617a() {
            C2807d a = this.f2513b.f2507h.mo28520a(this.f2514c, this.f2515d);
            if (a != null) {
                this.f2513b.f2503d.mo29152a(a, C2807d.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29617a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$f */
    static final class C3648f extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2516b;

        /* renamed from: c */
        final /* synthetic */ JSONArray f2517c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3648f(C3641s sVar, JSONArray jSONArray) {
            super(0);
            this.f2516b = sVar;
            this.f2517c = jSONArray;
        }

        /* renamed from: a */
        public final void mo29618a() {
            this.f2516b.f2502c.mo29152a(new C3140f1(this.f2517c), C3140f1.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29618a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$g */
    static final class C3649g extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2518b;

        /* renamed from: c */
        final /* synthetic */ JSONArray f2519c;

        /* renamed from: d */
        final /* synthetic */ String f2520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3649g(C3641s sVar, JSONArray jSONArray, String str) {
            super(0);
            this.f2518b = sVar;
            this.f2519c = jSONArray;
            this.f2520d = str;
        }

        /* renamed from: a */
        public final void mo29619a() {
            FeedUpdatedEvent a = this.f2518b.f2504e.mo29142a(this.f2519c, this.f2520d);
            if (a != null) {
                this.f2518b.f2503d.mo29152a(a, FeedUpdatedEvent.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29619a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$h */
    static final class C3650h extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2521b;

        /* renamed from: c */
        final /* synthetic */ List<C7208a> f2522c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3650h(C3641s sVar, List<C7208a> list) {
            super(0);
            this.f2521b = sVar;
            this.f2522c = list;
        }

        /* renamed from: a */
        public final void mo29620a() {
            this.f2521b.f2502c.mo29152a(new C3583q1(this.f2522c), C3583q1.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29620a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$i */
    static final class C3651i extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2523b;

        /* renamed from: c */
        final /* synthetic */ C3046c5 f2524c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3651i(C3641s sVar, C3046c5 c5Var) {
            super(0);
            this.f2523b = sVar;
            this.f2524c = c5Var;
        }

        /* renamed from: a */
        public final void mo29621a() {
            this.f2523b.f2506g.mo28861b(this.f2524c);
            this.f2523b.f2502c.mo29152a(new C3099d5(this.f2524c), C3099d5.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29621a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$j */
    static final class C3652j extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2525b;

        /* renamed from: c */
        final /* synthetic */ C7358a f2526c;

        /* renamed from: d */
        final /* synthetic */ String f2527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3652j(C3641s sVar, C7358a aVar, String str) {
            super(0);
            this.f2525b = sVar;
            this.f2526c = aVar;
            this.f2527d = str;
        }

        /* renamed from: a */
        public final void mo29622a() {
            if (this.f2525b.f2500a instanceof C3771w5) {
                this.f2526c.mo40948M(((C3771w5) this.f2525b.f2500a).mo29771u());
                this.f2525b.f2502c.mo29152a(new C3163g3(((C3771w5) this.f2525b.f2500a).mo29772v(), ((C3771w5) this.f2525b.f2500a).mo29773w(), this.f2526c, this.f2527d), C3163g3.class);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29622a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$k */
    static final class C3653k extends C12777p implements C13074a<C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2528b;

        /* renamed from: c */
        final /* synthetic */ List<C3024b3> f2529c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3653k(C3641s sVar, List<? extends C3024b3> list) {
            super(0);
            this.f2528b = sVar;
            this.f2529c = list;
        }

        /* renamed from: a */
        public final void mo29623a() {
            this.f2528b.f2502c.mo29152a(new C3639r6(this.f2529c), C3639r6.class);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo29623a();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$l */
    static final class C3654l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2530b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3654l(String str) {
            super(0);
            this.f2530b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Processing server response payload for user with id: ", this.f2530b);
        }
    }

    /* renamed from: bo.app.s$m */
    static final class C3655m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3584q2 f2531b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3655m(C3584q2 q2Var) {
            super(0);
            this.f2531b = q2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Received server error from request: ", this.f2531b.mo28922a());
        }
    }

    /* renamed from: bo.app.s$n */
    static final class C3656n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3641s f2532b;

        /* renamed from: c */
        final /* synthetic */ int f2533c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3656n(C3641s sVar, int i) {
            super(0);
            this.f2532b = sVar;
            this.f2533c = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Retrying request: " + this.f2532b.f2500a + " after delay of " + this.f2533c + " ms";
        }
    }

    @C12739f(mo50609c = "com.braze.requests.BrazeRequestTask$processResponseError$3", mo50610f = "BrazeRequestTask.kt", mo50611l = {162}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.s$o */
    static final class C3657o extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2534b;

        /* renamed from: c */
        final /* synthetic */ int f2535c;

        /* renamed from: d */
        final /* synthetic */ C3641s f2536d;

        /* renamed from: bo.app.s$o$a */
        static final class C3658a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C3641s f2537b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3658a(C3641s sVar) {
                super(0);
                this.f2537b = sVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Adding retried request to dispatch: ", this.f2537b.f2500a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3657o(int i, C3641s sVar, C12074d<? super C3657o> dVar) {
            super(2, dVar);
            this.f2535c = i;
            this.f2536d = sVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3657o) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3657o(this.f2535c, this.f2536d, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f2534b;
            if (i == 0) {
                C11910n.m25701b(obj);
                this.f2534b = 1;
                if (C14041v0.m32563a((long) this.f2535c, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8266c.m16397f(C8266c.f11641a, C3641s.f2499k, C8266c.C8267a.f11650f, (Throwable) null, false, new C3658a(this.f2536d), 12, (Object) null);
            this.f2536d.f2505f.mo28635a(this.f2536d.f2500a);
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.s$p */
    static final class C3659p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3659p f2538b = new C3659p();

        C3659p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Api response was null, failing task.";
        }
    }

    public C3641s(C3042c2 c2Var, C3315k2 k2Var, C3285j2 j2Var, C3285j2 j2Var2, C3280j1 j1Var, C3023b2 b2Var, C3119e5 e5Var, C2962a0 a0Var) {
        C12775o.m28639i(c2Var, "request");
        C12775o.m28639i(k2Var, "httpConnector");
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C12775o.m28639i(j1Var, "feedStorageProvider");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(e5Var, "serverConfigStorage");
        C12775o.m28639i(a0Var, "contentCardsStorage");
        this.f2500a = c2Var;
        this.f2501b = k2Var;
        this.f2502c = j2Var;
        this.f2503d = j2Var2;
        this.f2504e = j1Var;
        this.f2505f = b2Var;
        this.f2506g = e5Var;
        this.f2507h = a0Var;
        Map<String, String> a = C3669s4.m3853a();
        this.f2508i = a;
        c2Var.mo28617a(a);
    }

    /* renamed from: b */
    public final C3084d mo29610b() {
        try {
            C3753v4 h = this.f2500a.mo29439h();
            JSONObject l = this.f2500a.mo28608l();
            if (l != null) {
                return new C3084d(this.f2501b.mo29194a(h, this.f2508i, l), this.f2500a, this.f2505f);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3644b(h), 6, (Object) null);
            return null;
        } catch (Exception e) {
            if (e instanceof C3633r3) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3645c(e), 4, (Object) null);
                this.f2502c.mo29152a(new C3701t4(this.f2500a), C3701t4.class);
                this.f2503d.mo29152a(new C2803a(e, this.f2500a), C2803a.class);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3646d.f2512b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo29612c() {
        C3084d b = mo29610b();
        Class<C3544p0> cls = C3544p0.class;
        if (b != null) {
            mo29608a(b);
            this.f2502c.mo29152a(new C3729u4(this.f2500a), C3729u4.class);
            if (b.mo28796b() instanceof C3789x4) {
                this.f2502c.mo29152a(new C3544p0(this.f2500a), cls);
            } else {
                this.f2502c.mo29152a(new C3604r0(this.f2500a), C3604r0.class);
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3659p.f2538b, 6, (Object) null);
            C3668s3 s3Var = new C3668s3("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", this.f2500a);
            this.f2500a.mo29436a(this.f2502c, this.f2503d, (C3584q2) s3Var);
            this.f2502c.mo29152a(new C3544p0(this.f2500a), cls);
            mo29609a((C3584q2) s3Var);
        }
        this.f2500a.mo29438b(this.f2502c);
    }

    /* renamed from: a */
    public final void mo29608a(C3084d dVar) {
        C12775o.m28639i(dVar, "apiResponse");
        if (dVar.mo28796b() == null) {
            this.f2500a.mo28604a(this.f2502c, this.f2503d, dVar);
        } else {
            mo29609a(dVar.mo28796b());
            this.f2500a.mo29436a(this.f2502c, this.f2503d, dVar.mo28796b());
        }
        mo29611b(dVar);
    }

    /* renamed from: a */
    public final void mo29609a(C3584q2 q2Var) {
        C3584q2 q2Var2 = q2Var;
        C12775o.m28639i(q2Var2, "responseError");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3655m(q2Var2), 6, (Object) null);
        this.f2502c.mo29152a(new C3165g5(q2Var2), C3165g5.class);
        if (this.f2500a.mo29437a(q2Var2)) {
            int a = this.f2500a.mo29440m().mo28811a();
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3656n(this, a), 7, (Object) null);
            C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3657o(a, this, (C12074d<? super C3657o>) null), 3, (Object) null);
            return;
        }
        C3042c2 c2Var = this.f2500a;
        if (c2Var instanceof C3771w5) {
            C3285j2 j2Var = this.f2503d;
            String d = ((C3771w5) c2Var).mo29772v().mo28842d();
            C12775o.m28638h(d, "request.triggerEvent.triggerEventType");
            j2Var.mo29152a(new C2814i(d), C2814i.class);
        }
    }

    /* renamed from: b */
    public final void mo29611b(C3084d dVar) {
        C12775o.m28639i(dVar, "apiResponse");
        String a = this.f2505f.mo28631a();
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3654l(a), 6, (Object) null);
        m3808a(dVar.mo28798d(), a);
        m3804a(dVar.mo28795a(), a);
        m3803a(dVar.mo28802h());
        m3810b((List<? extends C3024b3>) dVar.mo28804j());
        m3806a(dVar.mo28799e());
        m3807a(dVar.mo28797c());
        m3805a(dVar.mo28803i(), a);
    }

    /* renamed from: a */
    private final void m3808a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            f2498j.m3822a(jSONArray, new C3649g(this, jSONArray, str));
        }
    }

    /* renamed from: a */
    private final void m3804a(C3820z zVar, String str) {
        if (zVar != null) {
            f2498j.m3822a(zVar, new C3647e(this, zVar, str));
        }
    }

    /* renamed from: a */
    private final void m3803a(C3046c5 c5Var) {
        if (c5Var != null) {
            f2498j.m3822a(c5Var, new C3651i(this, c5Var));
        }
    }

    /* renamed from: a */
    private final void m3806a(List<C7208a> list) {
        if (list != null) {
            f2498j.m3822a(list, new C3650h(this, list));
        }
    }

    /* renamed from: a */
    private final void m3807a(JSONArray jSONArray) {
        if (jSONArray != null) {
            f2498j.m3822a(jSONArray, new C3648f(this, jSONArray));
        }
    }

    /* renamed from: b */
    private final void m3810b(List<? extends C3024b3> list) {
        if (list != null) {
            f2498j.m3822a(list, new C3653k(this, list));
        }
    }

    /* renamed from: a */
    private final void m3805a(C7358a aVar, String str) {
        if (aVar != null) {
            f2498j.m3822a(aVar, new C3652j(this, aVar, str));
        }
    }
}
