package com.google.protobuf;

import com.google.protobuf.C7061b0;
import com.google.protobuf.C7160q1;
import com.google.protobuf.C7174t;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.t0 */
/* compiled from: MessageSetSchema */
final class C7177t0<T> implements C7076e1<T> {

    /* renamed from: a */
    private final C7149p0 f9761a;

    /* renamed from: b */
    private final C7127k1<?, ?> f9762b;

    /* renamed from: c */
    private final boolean f9763c;

    /* renamed from: d */
    private final C7148p<?> f9764d;

    private C7177t0(C7127k1<?, ?> k1Var, C7148p<?> pVar, C7149p0 p0Var) {
        this.f9762b = k1Var;
        this.f9763c = pVar.mo40619e(p0Var);
        this.f9764d = pVar;
        this.f9761a = p0Var;
    }

    /* renamed from: j */
    private <UT, UB> int m13834j(C7127k1<UT, UB> k1Var, T t) {
        return k1Var.mo40515i(k1Var.mo40513g(t));
    }

    /* renamed from: k */
    private <UT, UB, ET extends C7174t.C7176b<ET>> void m13835k(C7127k1<UT, UB> k1Var, C7148p<ET> pVar, T t, C7071d1 d1Var, C7139o oVar) {
        UB f = k1Var.mo40512f(t);
        C7174t<ET> d = pVar.mo40618d(t);
        do {
            try {
                if (d1Var.mo40227A() == Integer.MAX_VALUE) {
                    k1Var.mo40521o(t, f);
                    return;
                }
            } finally {
                k1Var.mo40521o(t, f);
            }
        } while (m13837m(d1Var, oVar, pVar, d, k1Var, f));
    }

    /* renamed from: l */
    static <T> C7177t0<T> m13836l(C7127k1<?, ?> k1Var, C7148p<?> pVar, C7149p0 p0Var) {
        return new C7177t0<>(k1Var, pVar, p0Var);
    }

    /* renamed from: m */
    private <UT, UB, ET extends C7174t.C7176b<ET>> boolean m13837m(C7071d1 d1Var, C7139o oVar, C7148p<ET> pVar, C7174t<ET> tVar, C7127k1<UT, UB> k1Var, UB ub) {
        int tag = d1Var.getTag();
        if (tag == C7160q1.f9695a) {
            Object obj = null;
            int i = 0;
            C7086h hVar = null;
            while (d1Var.mo40227A() != Integer.MAX_VALUE) {
                int tag2 = d1Var.getTag();
                if (tag2 == C7160q1.f9697c) {
                    i = d1Var.mo40257o();
                    obj = pVar.mo40616b(oVar, this.f9761a, i);
                } else if (tag2 == C7160q1.f9698d) {
                    if (obj != null) {
                        pVar.mo40622h(d1Var, obj, oVar, tVar);
                    } else {
                        hVar = d1Var.mo40232F();
                    }
                } else if (!d1Var.mo40235I()) {
                    break;
                }
            }
            if (d1Var.getTag() == C7160q1.f9696b) {
                if (hVar != null) {
                    if (obj != null) {
                        pVar.mo40623i(hVar, obj, oVar, tVar);
                    } else {
                        k1Var.mo40510d(ub, i, hVar);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.m12752b();
        } else if (C7160q1.m13681b(tag) != 2) {
            return d1Var.mo40235I();
        } else {
            Object b = pVar.mo40616b(oVar, this.f9761a, C7160q1.m13680a(tag));
            if (b == null) {
                return k1Var.mo40519m(ub, d1Var);
            }
            pVar.mo40622h(d1Var, b, oVar, tVar);
            return true;
        }
    }

    /* renamed from: n */
    private <UT, UB> void m13838n(C7127k1<UT, UB> k1Var, T t, C7170r1 r1Var) {
        k1Var.mo40525s(k1Var.mo40513g(t), r1Var);
    }

    /* renamed from: a */
    public void mo40274a(T t, T t2) {
        C7085g1.m13002G(this.f9762b, t, t2);
        if (this.f9763c) {
            C7085g1.m13000E(this.f9764d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo40275b(T t, C7170r1 r1Var) {
        Iterator<Map.Entry<?, Object>> s = this.f9764d.mo40617c(t).mo40652s();
        while (s.hasNext()) {
            Map.Entry next = s.next();
            C7174t.C7176b bVar = (C7174t.C7176b) next.getKey();
            if (bVar.mo40658Z() != C7160q1.C7167c.MESSAGE || bVar.mo40661z() || bVar.mo40659c0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C7061b0.C7063b) {
                r1Var.mo40477e(bVar.mo40660y(), ((C7061b0.C7063b) next).mo40177a().mo40208e());
            } else {
                r1Var.mo40477e(bVar.mo40660y(), next.getValue());
            }
        }
        m13838n(this.f9762b, t, r1Var);
    }

    /* renamed from: c */
    public void mo40276c(T t) {
        this.f9762b.mo40516j(t);
        this.f9764d.mo40620f(t);
    }

    /* renamed from: d */
    public final boolean mo40277d(T t) {
        return this.f9764d.mo40617c(t).mo40651p();
    }

    /* renamed from: e */
    public void mo40278e(T t, C7071d1 d1Var, C7139o oVar) {
        m13835k(this.f9762b, this.f9764d, t, d1Var, oVar);
    }

    /* renamed from: f */
    public boolean mo40279f(T t, T t2) {
        if (!this.f9762b.mo40513g(t).equals(this.f9762b.mo40513g(t2))) {
            return false;
        }
        if (this.f9763c) {
            return this.f9764d.mo40617c(t).equals(this.f9764d.mo40617c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public int mo40280g(T t) {
        int j = m13834j(this.f9762b, t) + 0;
        if (this.f9763c) {
            return j + this.f9764d.mo40617c(t).mo40647j();
        }
        return j;
    }

    /* renamed from: h */
    public T mo40281h() {
        return this.f9761a.mo40628h().mo40630Q();
    }

    /* renamed from: i */
    public int mo40282i(T t) {
        int hashCode = this.f9762b.mo40513g(t).hashCode();
        if (this.f9763c) {
            return (hashCode * 53) + this.f9764d.mo40617c(t).hashCode();
        }
        return hashCode;
    }
}
