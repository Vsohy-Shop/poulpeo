package p042bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.s0 */
public final class C3660s0 implements C3554p2 {

    /* renamed from: a */
    private final C3285j2 f2539a;

    /* renamed from: b */
    private boolean f2540b;

    /* renamed from: c */
    private final List<C3042c2> f2541c = new ArrayList();

    /* renamed from: bo.app.s0$a */
    static final class C3661a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3661a f2542b = new C3661a();

        C3661a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Short circuiting execution of network request and immediately marking it as succeeded.";
        }
    }

    public C3660s0(C3285j2 j2Var, boolean z) {
        C12775o.m28639i(j2Var, "internalEventPublisher");
        this.f2539a = j2Var;
        this.f2540b = z;
    }

    /* renamed from: c */
    private final void m3840c(C3502o2 o2Var) {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3661a.f2542b, 3, (Object) null);
        C3285j2 j2Var = this.f2539a;
        o2Var.mo28604a(j2Var, j2Var, (C3084d) null);
        o2Var.mo29438b(this.f2539a);
        if (o2Var instanceof C3042c2) {
            this.f2539a.mo29152a(new C3604r0((C3042c2) o2Var), C3604r0.class);
        }
    }

    /* renamed from: a */
    public void mo29499a(C3502o2 o2Var) {
        C12775o.m28639i(o2Var, "request");
        m3840c(o2Var);
    }

    /* renamed from: b */
    public void mo29500b(C3502o2 o2Var) {
        C12775o.m28639i(o2Var, "request");
        m3840c(o2Var);
    }
}
