package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6015w4 {

    /* renamed from: a */
    public final C6015w4 f7446a;

    /* renamed from: b */
    final C6042y f7447b;

    /* renamed from: c */
    final Map<String, C5914q> f7448c = new HashMap();

    /* renamed from: d */
    final Map<String, Boolean> f7449d = new HashMap();

    public C6015w4(C6015w4 w4Var, C6042y yVar) {
        this.f7446a = w4Var;
        this.f7447b = yVar;
    }

    /* renamed from: a */
    public final C6015w4 mo34572a() {
        return new C6015w4(this, this.f7447b);
    }

    /* renamed from: b */
    public final C5914q mo34573b(C5914q qVar) {
        return this.f7447b.mo34616a(this, qVar);
    }

    /* renamed from: c */
    public final C5914q mo34574c(C5732f fVar) {
        C5914q qVar = C5914q.f7289O;
        Iterator<Integer> A = fVar.mo33949A();
        while (A.hasNext()) {
            qVar = this.f7447b.mo34616a(this, fVar.mo33969u(A.next().intValue()));
            if (qVar instanceof C5766h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C5914q mo34575d(String str) {
        if (this.f7448c.containsKey(str)) {
            return this.f7448c.get(str);
        }
        C6015w4 w4Var = this.f7446a;
        if (w4Var != null) {
            return w4Var.mo34575d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo34576e(String str, C5914q qVar) {
        if (!this.f7449d.containsKey(str)) {
            if (qVar == null) {
                this.f7448c.remove(str);
            } else {
                this.f7448c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo34577f(String str, C5914q qVar) {
        mo34576e(str, qVar);
        this.f7449d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo34578g(String str, C5914q qVar) {
        C6015w4 w4Var;
        if (!this.f7448c.containsKey(str) && (w4Var = this.f7446a) != null && w4Var.mo34579h(str)) {
            this.f7446a.mo34578g(str, qVar);
        } else if (!this.f7449d.containsKey(str)) {
            if (qVar == null) {
                this.f7448c.remove(str);
            } else {
                this.f7448c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo34579h(String str) {
        if (this.f7448c.containsKey(str)) {
            return true;
        }
        C6015w4 w4Var = this.f7446a;
        if (w4Var != null) {
            return w4Var.mo34579h(str);
        }
        return false;
    }
}
