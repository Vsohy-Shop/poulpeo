package p051c8;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Objects;
import p089f8.C7611a;
import p101g8.C7817i;
import p101g8.C7821k;
import p101g8.C7826m;
import p101g8.C7831o;
import p124i8.C8213d;
import p223s7.C9543h;
import p257v8.C10050c;
import p268w8.C10137b;
import p268w8.C10146e;
import p341fe.C11949f;
import p341fe.C11953j;
import p341fe.C11954k;
import p341fe.C11965s;
import p376ke.C12657a;
import p386lg.C12859a;

/* renamed from: c8.i2 */
/* compiled from: InAppMessageStreamManager */
public class C3945i2 {

    /* renamed from: a */
    private final C12657a<String> f3054a;

    /* renamed from: b */
    private final C12657a<String> f3055b;

    /* renamed from: c */
    private final C3953k f3056c;

    /* renamed from: d */
    private final C7611a f3057d;

    /* renamed from: e */
    private final C3917d f3058e;

    /* renamed from: f */
    private final C3977o3 f3059f;

    /* renamed from: g */
    private final C4019w0 f3060g;

    /* renamed from: h */
    private final C3967m3 f3061h;

    /* renamed from: i */
    private final C7826m f3062i;

    /* renamed from: j */
    private final C3909c f3063j;

    /* renamed from: k */
    private final C3995r3 f3064k;

    /* renamed from: l */
    private final C3903b f3065l;

    /* renamed from: m */
    private final C8213d f3066m;

    /* renamed from: n */
    private final C3968n f3067n;

    /* renamed from: c8.i2$a */
    /* compiled from: InAppMessageStreamManager */
    static /* synthetic */ class C3946a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3068a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                s7.d0$b[] r0 = p223s7.C9528d0.C9530b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3068a = r0
                s7.d0$b r1 = p223s7.C9528d0.C9530b.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3068a     // Catch:{ NoSuchFieldError -> 0x001d }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.IMAGE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3068a     // Catch:{ NoSuchFieldError -> 0x0028 }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3068a     // Catch:{ NoSuchFieldError -> 0x0033 }
                s7.d0$b r1 = p223s7.C9528d0.C9530b.CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p051c8.C3945i2.C3946a.<clinit>():void");
        }
    }

    public C3945i2(C12657a<String> aVar, C12657a<String> aVar2, C3953k kVar, C7611a aVar3, C3917d dVar, C3909c cVar, C3977o3 o3Var, C4019w0 w0Var, C3967m3 m3Var, C7826m mVar, C3995r3 r3Var, C8213d dVar2, C3968n nVar, C3903b bVar) {
        this.f3054a = aVar;
        this.f3055b = aVar2;
        this.f3056c = kVar;
        this.f3057d = aVar3;
        this.f3058e = dVar;
        this.f3063j = cVar;
        this.f3059f = o3Var;
        this.f3060g = w0Var;
        this.f3061h = m3Var;
        this.f3062i = mVar;
        this.f3064k = r3Var;
        this.f3067n = nVar;
        this.f3066m = dVar2;
        this.f3065l = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static boolean m4499A0(C3956k2 k2Var) {
        if (TextUtils.isEmpty(k2Var.mo29964b()) || TextUtils.isEmpty(k2Var.mo29965c().mo39821b())) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    /* renamed from: H */
    static C10146e m4506H() {
        return (C10146e) C10146e.m21380N().mo44744z(1).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static int m4507I(C10050c cVar, C10050c cVar2) {
        if (cVar.mo44630M() && !cVar2.mo44630M()) {
            return -1;
        }
        if (!cVar2.mo44630M() || cVar.mo44630M()) {
            return Integer.compare(cVar.mo44632P().mo44017K(), cVar2.mo44632P().mo44017K());
        }
        return 1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4508J(java.lang.String r4, p257v8.C10050c r5) {
        /*
            boolean r0 = m4514Q(r4)
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r5.mo44630M()
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.mo44633R()
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r5.next()
            s7.h r0 = (p223s7.C9543h) r0
            boolean r3 = m4512O(r0, r4)
            if (r3 != 0) goto L_0x002f
            boolean r0 = m4511N(r0, r4)
            if (r0 == 0) goto L_0x0016
        L_0x002f:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r4 = "The event %s is contained in the list of triggers"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            p051c8.C3961l2.m4602a(r4)
            return r1
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p051c8.C3945i2.m4508J(java.lang.String, v8.c):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public C11953j<C10050c> m4519V(String str, C10050c cVar) {
        if (cVar.mo44630M() || !m4514Q(str)) {
            return C11953j.m25868n(cVar);
        }
        return this.f3061h.mo29994p(this.f3062i).mo49271f(new C3934g1()).mo49273i(C11965s.m25925h(Boolean.FALSE)).mo49272g(new C3939h1()).mo49230o(new C3944i1(cVar));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [le.e, le.e<v8.c, fe.j<v8.c>>] */
    /* JADX WARNING: type inference failed for: r5v0, types: [le.e, le.e<v8.c, fe.j<v8.c>>] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p341fe.C11953j<p101g8.C7831o> m4521X(java.lang.String r2, p384le.C12854e<p257v8.C10050c, p341fe.C11953j<p257v8.C10050c>> r3, p384le.C12854e<p257v8.C10050c, p341fe.C11953j<p257v8.C10050c>> r4, p384le.C12854e<p257v8.C10050c, p341fe.C11953j<p257v8.C10050c>> r5, p268w8.C10146e r6) {
        /*
            r1 = this;
            java.util.List r6 = r6.mo44743M()
            fe.f r6 = p341fe.C11949f.m25830s(r6)
            c8.c1 r0 = new c8.c1
            r0.<init>(r1)
            fe.f r6 = r6.mo49207j(r0)
            c8.d1 r0 = new c8.d1
            r0.<init>(r2)
            fe.f r6 = r6.mo49207j(r0)
            fe.f r3 = r6.mo49213p(r3)
            fe.f r3 = r3.mo49213p(r4)
            fe.f r3 = r3.mo49213p(r5)
            c8.e1 r4 = new c8.e1
            r4.<init>()
            fe.f r3 = r3.mo49196E(r4)
            fe.j r3 = r3.mo49208k()
            c8.f1 r4 = new c8.f1
            r4.<init>(r1, r2)
            fe.j r2 = r3.mo49226i(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p051c8.C3945i2.m4521X(java.lang.String, le.e, le.e, le.e, w8.e):fe.j");
    }

    /* renamed from: N */
    private static boolean m4511N(C9543h hVar, String str) {
        return hVar.mo44033J().mo44011K().equals(str);
    }

    /* renamed from: O */
    private static boolean m4512O(C9543h hVar, String str) {
        return hVar.mo44034K().toString().equals(str);
    }

    /* renamed from: P */
    private static boolean m4513P(C7611a aVar, C10050c cVar) {
        long j;
        long j2;
        if (cVar.mo44631N().equals(C10050c.C10053c.VANILLA_PAYLOAD)) {
            j2 = cVar.mo44634S().mo44638M();
            j = cVar.mo44634S().mo44635J();
        } else if (!cVar.mo44631N().equals(C10050c.C10053c.EXPERIMENTAL_PAYLOAD)) {
            return false;
        } else {
            j2 = cVar.mo44629L().mo44625M();
            j = cVar.mo44629L().mo44622J();
        }
        long a = aVar.mo41355a();
        if (a <= j2 || a >= j) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m4514Q(String str) {
        return str.equals("ON_FOREGROUND");
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ C11953j m4518U(C10050c cVar) {
        if (cVar.mo44630M()) {
            return C11953j.m25868n(cVar);
        }
        return this.f3060g.mo30040l(cVar).mo49270e(new C4016v1()).mo49273i(C11965s.m25925h(Boolean.FALSE)).mo49271f(new C4020w1(cVar)).mo49272g(new C4024x1()).mo49230o(new C4028y1(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ C11953j m4520W(C10050c cVar) {
        int i = C3946a.f3068a[cVar.mo44627J().mo44015N().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C11953j.m25868n(cVar);
        }
        C3961l2.m4602a("Filtering non-displayable message");
        return C11953j.m25866g();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ C10146e m4523Z(C10137b bVar, C3956k2 k2Var) {
        return this.f3058e.mo29963c(k2Var, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m4527b0(C10146e eVar) {
        this.f3060g.mo30038h(eVar).mo49185o();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ C11953j m4533e0(C11953j jVar, C10137b bVar) {
        if (!this.f3067n.mo29995b()) {
            C3961l2.m4604c("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return C11953j.m25868n(m4506H());
        }
        C11953j f = jVar.mo49225h(new C3970n1()).mo49230o(new C3975o1(this, bVar)).mo49239x(C11953j.m25868n(m4506H())).mo49224f(new C3980p1()).mo49224f(new C3985q1(this));
        C3909c cVar = this.f3063j;
        Objects.requireNonNull(cVar);
        C11953j f2 = f.mo49224f(new C3992r1(cVar));
        C3995r3 r3Var = this.f3064k;
        Objects.requireNonNull(r3Var);
        return f2.mo49224f(new C4004s1(r3Var)).mo49223e(new C4008t1()).mo49232q(C11953j.m25866g());
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ C12859a m4535f0(String str) {
        C11953j<C10146e> q = this.f3056c.mo29979f().mo49224f(new C4012u1()).mo49223e(new C3906b2()).mo49232q(C11953j.m25866g());
        C3913c2 c2Var = new C3913c2(this);
        C3935g2 g2Var = new C3935g2(this, str, new C3920d2(this), new C3925e2(this, str), new C3930f2());
        C11953j q2 = this.f3060g.mo30039j().mo49223e(new C3940h2()).mo49222c(C10137b.m21341N()).mo49232q(C11953j.m25868n(C10137b.m21341N()));
        C3900a1 a1Var = new C3900a1(this, C11953j.m25863A(m4573y0(this.f3066m.getId()), m4573y0(this.f3066m.mo39832a(false)), new C4033z0()).mo49231p(this.f3059f.mo29998a()));
        if (m4571x0(str)) {
            C3961l2.m4604c(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", new Object[]{Boolean.valueOf(this.f3064k.mo30018b()), Boolean.valueOf(this.f3064k.mo30017a())}));
            return q2.mo49226i(a1Var).mo49226i(g2Var).mo49240y();
        }
        C3961l2.m4602a("Attempting to fetch campaigns using cache");
        return q.mo49239x(q2.mo49226i(a1Var).mo49224f(c2Var)).mo49226i(g2Var).mo49240y();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m4543j0(C10146e eVar) {
        this.f3056c.mo29980l(eVar).mo49180g(new C3955k1()).mo49181h(new C3960l1()).mo49184n(new C3965m1()).mo49185o();
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static /* synthetic */ boolean m4549m0(Boolean bool) {
        return !bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static /* synthetic */ boolean m4553o0(Boolean bool) {
        return !bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ boolean m4557q0(C10050c cVar) {
        if (this.f3064k.mo30018b() || m4513P(this.f3057d, cVar)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ void m4563t0(C11954k kVar, Object obj) {
        kVar.mo49242a(obj);
        kVar.mo49243b();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ void m4565u0(C11954k kVar, Exception exc) {
        kVar.onError(exc);
        kVar.mo49243b();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static /* synthetic */ void m4567v0(Task task, C11954k kVar) {
        task.mo35456g(new C4034z1(kVar));
        task.mo35454e(new C3901a2(kVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public static void m4569w0(C10050c cVar, Boolean bool) {
        if (cVar.mo44631N().equals(C10050c.C10053c.VANILLA_PAYLOAD)) {
            C3961l2.m4604c(String.format("Already impressed campaign %s ? : %s", new Object[]{cVar.mo44634S().mo44637L(), bool}));
        } else if (cVar.mo44631N().equals(C10050c.C10053c.EXPERIMENTAL_PAYLOAD)) {
            C3961l2.m4604c(String.format("Already impressed experiment %s ? : %s", new Object[]{cVar.mo44629L().mo44624L(), bool}));
        }
    }

    /* renamed from: x0 */
    private boolean m4571x0(String str) {
        if (this.f3064k.mo30017a()) {
            return m4514Q(str);
        }
        return this.f3064k.mo30018b();
    }

    /* renamed from: y0 */
    private static <T> C11953j<T> m4573y0(Task<T> task) {
        return C11953j.m25865b(new C3905b1(task));
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public C11953j<C7831o> m4561s0(C10050c cVar, String str) {
        String str2;
        String str3;
        if (cVar.mo44631N().equals(C10050c.C10053c.VANILLA_PAYLOAD)) {
            str3 = cVar.mo44634S().mo44636K();
            str2 = cVar.mo44634S().mo44637L();
        } else if (!cVar.mo44631N().equals(C10050c.C10053c.EXPERIMENTAL_PAYLOAD)) {
            return C11953j.m25866g();
        } else {
            str3 = cVar.mo44629L().mo44623K();
            str2 = cVar.mo44629L().mo44624L();
            if (!cVar.mo44630M()) {
                this.f3065l.mo29947c(cVar.mo44629L().mo44626P());
            }
        }
        C7817i c = C7821k.m15290c(cVar.mo44627J(), str3, str2, cVar.mo44630M(), cVar.mo44628K());
        if (c.mo41515c().equals(MessageType.UNSUPPORTED)) {
            return C11953j.m25866g();
        }
        return C11953j.m25868n(new C7831o(c, str));
    }

    /* renamed from: K */
    public C11949f<C7831o> mo29976K() {
        return C11949f.m25832v(this.f3054a, this.f3063j.mo29956d(), this.f3055b).mo49205g(new C4027y0()).mo49216w(this.f3059f.mo29998a()).mo49203c(new C3950j1(this)).mo49216w(this.f3059f.mo29999b());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ C10050c m4517T(C10050c cVar, Boolean bool) {
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ C10050c m4555p0(C10050c cVar, Boolean bool) {
        return cVar;
    }
}
