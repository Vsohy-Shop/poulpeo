package p051c8;

import p089f8.C7611a;
import p101g8.C7826m;
import p341fe.C11945b;
import p341fe.C11947d;
import p341fe.C11953j;
import p341fe.C11958o;
import p341fe.C11965s;

/* renamed from: c8.m3 */
/* compiled from: RateLimiterClient */
public class C3967m3 {

    /* renamed from: d */
    private static final C3914c3 f3111d = C3914c3.m4447K();

    /* renamed from: a */
    private final C4013u2 f3112a;

    /* renamed from: b */
    private final C7611a f3113b;

    /* renamed from: c */
    private C11953j<C3914c3> f3114c = C11953j.m25866g();

    C3967m3(C4013u2 u2Var, C7611a aVar) {
        this.f3112a = u2Var;
        this.f3113b = aVar;
    }

    /* renamed from: j */
    private void m4620j() {
        this.f3114c = C11953j.m25866g();
    }

    /* renamed from: k */
    private C11953j<C3914c3> m4621k() {
        return this.f3114c.mo49239x(this.f3112a.mo30035e(C3914c3.m4452S()).mo49224f(new C3926e3(this))).mo49223e(new C3931f3(this));
    }

    /* renamed from: l */
    private static C3907b3 m4622l(C3907b3 b3Var) {
        return (C3907b3) C3907b3.m4430T(b3Var).mo29955z().mo29954C(b3Var.mo29951R() + 1).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m4628t(C3914c3 c3Var) {
        this.f3114c = C11953j.m25868n(c3Var);
    }

    /* renamed from: o */
    private boolean m4624o(C3907b3 b3Var, C7826m mVar) {
        if (this.f3113b.mo41355a() - b3Var.mo29950P() > mVar.mo41455d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m4625q(Throwable th) {
        m4620j();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ boolean m4626r(C7826m mVar, C3907b3 b3Var) {
        return !m4624o(b3Var, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ C3914c3 m4627s(C3914c3 c3Var, C7826m mVar, C3907b3 b3Var) {
        return (C3914c3) C3914c3.m4451R(c3Var).mo29962z(mVar.mo41454c(), m4622l(b3Var)).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C11947d m4629u(C3914c3 c3Var) {
        return this.f3112a.mo30036f(c3Var).mo49180g(new C3962l3(this, c3Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ C11947d m4630v(C7826m mVar, C3914c3 c3Var) {
        return C11958o.m25900q(c3Var.mo29961L(mVar.mo41454c(), m4633y())).mo49252i(new C3947i3(this, mVar)).mo49260t(C11958o.m25900q(m4633y())).mo49259r(new C3952j3(c3Var, mVar)).mo49257n(new C3957k3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ C3907b3 m4631w(C7826m mVar, C3914c3 c3Var) {
        return c3Var.mo29961L(mVar.mo41454c(), m4633y());
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ boolean m4632x(C7826m mVar, C3907b3 b3Var) {
        if (m4624o(b3Var, mVar) || b3Var.mo29951R() < mVar.mo41453b()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private C3907b3 m4633y() {
        return (C3907b3) C3907b3.m4429S().mo29954C(0).mo29953B(this.f3113b.mo41355a()).build();
    }

    /* renamed from: m */
    public C11945b mo29993m(C7826m mVar) {
        return m4621k().mo49222c(f3111d).mo49227j(new C3921d3(this, mVar));
    }

    /* renamed from: p */
    public C11965s<Boolean> mo29994p(C7826m mVar) {
        return m4621k().mo49239x(C11953j.m25868n(C3914c3.m4447K())).mo49230o(new C3936g3(this, mVar)).mo49225h(new C3941h3(this, mVar)).mo49229m();
    }
}
