package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import p037b6.C2895b0;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.s0 */
final class C6765s0 {

    /* renamed from: j */
    private static final C2900e f8807j = new C2900e("ExtractorLooper");

    /* renamed from: a */
    private final C6730j1 f8808a;

    /* renamed from: b */
    private final C6753p0 f8809b;

    /* renamed from: c */
    private final C6743m2 f8810c;

    /* renamed from: d */
    private final C6782w1 f8811d;

    /* renamed from: e */
    private final C6691a2 f8812e;

    /* renamed from: f */
    private final C6715f2 f8813f;

    /* renamed from: g */
    private final C2895b0<C6697b3> f8814g;

    /* renamed from: h */
    private final C6742m1 f8815h;

    /* renamed from: i */
    private final AtomicBoolean f8816i = new AtomicBoolean(false);

    C6765s0(C6730j1 j1Var, C2895b0<C6697b3> b0Var, C6753p0 p0Var, C6743m2 m2Var, C6782w1 w1Var, C6691a2 a2Var, C6715f2 f2Var, C6742m1 m1Var) {
        this.f8808a = j1Var;
        this.f8814g = b0Var;
        this.f8809b = p0Var;
        this.f8810c = m2Var;
        this.f8811d = w1Var;
        this.f8812e = a2Var;
        this.f8813f = f2Var;
        this.f8815h = m1Var;
    }

    /* renamed from: b */
    private final void m11519b(int i, Exception exc) {
        try {
            this.f8808a.mo39329p(i);
            this.f8808a.mo39317c(i);
        } catch (C6761r0 unused) {
            f8807j.mo28423e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39360a() {
        C6738l1 l1Var;
        C2900e eVar = f8807j;
        eVar.mo28421c("Run extractor loop", new Object[0]);
        if (this.f8816i.compareAndSet(false, true)) {
            while (true) {
                try {
                    l1Var = this.f8815h.mo39333a();
                } catch (C6761r0 e) {
                    f8807j.mo28423e("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f8794b >= 0) {
                        this.f8814g.mo28418a().mo39274u(e.f8794b);
                        m11519b(e.f8794b, e);
                    }
                    l1Var = null;
                }
                if (l1Var != null) {
                    try {
                        if (l1Var instanceof C6749o0) {
                            this.f8809b.mo39349a((C6749o0) l1Var);
                        } else if (l1Var instanceof C6739l2) {
                            this.f8810c.mo39334a((C6739l2) l1Var);
                        } else if (l1Var instanceof C6778v1) {
                            this.f8811d.mo39378a((C6778v1) l1Var);
                        } else if (l1Var instanceof C6790y1) {
                            this.f8812e.mo39262a((C6790y1) l1Var);
                        } else if (l1Var instanceof C6711e2) {
                            this.f8813f.mo39286a((C6711e2) l1Var);
                        } else {
                            f8807j.mo28423e("Unknown task type: %s", l1Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f8807j.mo28423e("Error during extraction task: %s", e2.getMessage());
                        this.f8814g.mo28418a().mo39274u(l1Var.f8699a);
                        m11519b(l1Var.f8699a, e2);
                    }
                } else {
                    this.f8816i.set(false);
                    return;
                }
            }
        } else {
            eVar.mo28425g("runLoop already looping; return", new Object[0]);
        }
    }
}
