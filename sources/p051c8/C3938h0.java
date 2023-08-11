package p051c8;

import com.google.android.gms.tasks.Task;
import p089f8.C7611a;
import p101g8.C7796a;
import p101g8.C7817i;
import p101g8.C7826m;
import p223s7.C9567t;
import p268w8.C10134a;
import p276x5.C10406g;
import p341fe.C11945b;
import p341fe.C11953j;
import p341fe.C11957n;
import p341fe.C11962r;

/* renamed from: c8.h0 */
/* compiled from: DisplayCallbacksImpl */
public class C3938h0 implements C9567t {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static boolean f3038k;

    /* renamed from: a */
    private final C4019w0 f3039a;

    /* renamed from: b */
    private final C7611a f3040b;

    /* renamed from: c */
    private final C3977o3 f3041c;

    /* renamed from: d */
    private final C3967m3 f3042d;

    /* renamed from: e */
    private final C3953k f3043e;

    /* renamed from: f */
    private final C7826m f3044f;

    /* renamed from: g */
    private final C3986q2 f3045g;

    /* renamed from: h */
    private final C3968n f3046h;

    /* renamed from: i */
    private final C7817i f3047i;

    /* renamed from: j */
    private final String f3048j;

    C3938h0(C4019w0 w0Var, C7611a aVar, C3977o3 o3Var, C3967m3 m3Var, C3953k kVar, C7826m mVar, C3986q2 q2Var, C3968n nVar, C7817i iVar, String str) {
        this.f3039a = w0Var;
        this.f3040b = aVar;
        this.f3041c = o3Var;
        this.f3042d = m3Var;
        this.f3043e = kVar;
        this.f3044f = mVar;
        this.f3045g = q2Var;
        this.f3046h = nVar;
        this.f3047i = iVar;
        this.f3048j = str;
        f3038k = false;
    }

    /* renamed from: A */
    private void m4463A(String str) {
        m4464B(str, (C11953j<String>) null);
    }

    /* renamed from: B */
    private void m4464B(String str, C11953j<String> jVar) {
        if (jVar != null) {
            C3961l2.m4602a(String.format("Not recording: %s. Reason: %s", new Object[]{str, jVar}));
        } else if (this.f3047i.mo41514a().mo41485c()) {
            C3961l2.m4602a(String.format("Not recording: %s. Reason: Message is test message", new Object[]{str}));
        } else if (!this.f3046h.mo29995b()) {
            C3961l2.m4602a(String.format("Not recording: %s. Reason: Data collection is disabled", new Object[]{str}));
        } else {
            C3961l2.m4602a(String.format("Not recording: %s", new Object[]{str}));
        }
    }

    /* renamed from: C */
    private Task<Void> m4465C(C11945b bVar) {
        if (!f3038k) {
            mo29974d();
        }
        return m4468F(bVar.mo49187q(), this.f3041c.mo29998a());
    }

    /* renamed from: D */
    private Task<Void> m4466D(C7796a aVar) {
        C3961l2.m4602a("Attempting to record: message click to metrics logger");
        return m4465C(C11945b.m25806j(new C4026y(this, aVar)));
    }

    /* renamed from: E */
    private C11945b m4467E() {
        String a = this.f3047i.mo41514a().mo41483a();
        C3961l2.m4602a("Attempting to record message impression in impression store for id: " + a);
        C11945b g = this.f3039a.mo30041r((C10134a) C10134a.m21330M().mo44731B(this.f3040b.mo41355a()).mo44732z(a).build()).mo49181h(new C3923e0()).mo49180g(new C3928f0());
        if (C3945i2.m4514Q(this.f3048j)) {
            return this.f3042d.mo29993m(this.f3044f).mo49181h(new C3933g0()).mo49180g(new C4018w()).mo49182l().mo49178c(g);
        }
        return g;
    }

    /* renamed from: F */
    private static <T> Task<T> m4468F(C11953j<T> jVar, C11962r rVar) {
        C10406g gVar = new C10406g();
        jVar.mo49224f(new C3904b0(gVar)).mo49239x(C11953j.m25867l(new C3911c0(gVar))).mo49233r(new C3918d0(gVar)).mo49237v(rVar).mo49234s();
        return gVar.mo45096a();
    }

    /* renamed from: G */
    private boolean m4469G() {
        return this.f3046h.mo29995b();
    }

    /* renamed from: H */
    private C11945b m4470H() {
        return C11945b.m25806j(new C4022x());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m4482p(C9567t.C9569b bVar) {
        this.f3045g.mo30007u(this.f3047i, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m4483q() {
        this.f3045g.mo30005s(this.f3047i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m4484r(C7796a aVar) {
        this.f3045g.mo30006t(this.f3047i, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ C11957n m4489w(C10406g gVar, Throwable th) {
        if (th instanceof Exception) {
            gVar.mo45097b((Exception) th);
        } else {
            gVar.mo45097b(new RuntimeException(th));
        }
        return C11953j.m25866g();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m4491y(C9567t.C9568a aVar) {
        this.f3045g.mo30004q(this.f3047i, aVar);
    }

    /* renamed from: a */
    public Task<Void> mo29971a(C7796a aVar) {
        if (!m4469G()) {
            m4463A("message click to metrics logger");
            return new C10406g().mo45096a();
        } else if (aVar.mo41446b() == null) {
            return mo29972b(C9567t.C9568a.CLICK);
        } else {
            return m4466D(aVar);
        }
    }

    /* renamed from: b */
    public Task<Void> mo29972b(C9567t.C9568a aVar) {
        if (m4469G()) {
            C3961l2.m4602a("Attempting to record: " + "message dismissal to metrics logger");
            return m4465C(C11945b.m25806j(new C4014v(this, aVar)));
        }
        m4463A("message dismissal to metrics logger");
        return new C10406g().mo45096a();
    }

    /* renamed from: c */
    public Task<Void> mo29973c(C9567t.C9569b bVar) {
        if (m4469G()) {
            C3961l2.m4602a("Attempting to record: " + "render error to metrics logger");
            return m4468F(m4467E().mo49178c(C11945b.m25806j(new C4032z(this, bVar))).mo49178c(m4470H()).mo49187q(), this.f3041c.mo29998a());
        }
        m4463A("render error to metrics logger");
        return new C10406g().mo45096a();
    }

    /* renamed from: d */
    public Task<Void> mo29974d() {
        if (!m4469G() || f3038k) {
            m4463A("message impression to metrics logger");
            return new C10406g().mo45096a();
        }
        C3961l2.m4602a("Attempting to record: " + "message impression to metrics logger");
        return m4468F(m4467E().mo49178c(C11945b.m25806j(new C3899a0(this))).mo49178c(m4470H()).mo49187q(), this.f3041c.mo29998a());
    }
}
