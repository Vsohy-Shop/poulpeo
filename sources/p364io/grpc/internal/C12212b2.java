package p364io.grpc.internal;

import java.util.Map;
import p111h6.C8012n;
import p364io.grpc.C12575p;
import p364io.grpc.C12594t;

/* renamed from: io.grpc.internal.b2 */
/* compiled from: ScParser */
public final class C12212b2 extends C12575p.C12585h {

    /* renamed from: a */
    private final boolean f19192a;

    /* renamed from: b */
    private final int f19193b;

    /* renamed from: c */
    private final int f19194c;

    /* renamed from: d */
    private final C12325j f19195d;

    public C12212b2(boolean z, int i, int i2, C12325j jVar) {
        this.f19192a = z;
        this.f19193b = i;
        this.f19194c = i2;
        this.f19195d = (C12325j) C8012n.m15756o(jVar, "autoLoadBalancerFactory");
    }

    /* renamed from: a */
    public C12575p.C12579c mo49746a(Map<String, ?> map) {
        Object obj;
        try {
            C12575p.C12579c f = this.f19195d.mo49950f(map);
            if (f == null) {
                obj = null;
            } else if (f.mo50278d() != null) {
                return C12575p.C12579c.m27877b(f.mo50278d());
            } else {
                obj = f.mo50277c();
            }
            return C12575p.C12579c.m27876a(C12333j1.m27093b(map, this.f19192a, this.f19193b, this.f19194c, obj));
        } catch (RuntimeException e) {
            return C12575p.C12579c.m27877b(C12594t.f20185h.mo50310r("failed to parse service config").mo50309q(e));
        }
    }
}
