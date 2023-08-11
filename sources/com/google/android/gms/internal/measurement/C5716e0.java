package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5716e0 extends C6026x {
    protected C5716e0() {
        this.f7464a.add(C5867n0.AND);
        this.f7464a.add(C5867n0.NOT);
        this.f7464a.add(C5867n0.OR);
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        C5867n0 n0Var = C5867n0.ADD;
        int ordinal = C6032x5.m10244e(str).ordinal();
        if (ordinal == 1) {
            C6032x5.m10247h(C5867n0.AND.name(), 2, list);
            C5914q b = w4Var.mo34573b(list.get(0));
            if (!b.mo33958d().booleanValue()) {
                return b;
            }
            return w4Var.mo34573b(list.get(1));
        } else if (ordinal == 47) {
            C6032x5.m10247h(C5867n0.NOT.name(), 1, list);
            return new C5749g(Boolean.valueOf(!w4Var.mo34573b(list.get(0)).mo33958d().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo34597b(str);
        } else {
            C6032x5.m10247h(C5867n0.OR.name(), 2, list);
            C5914q b2 = w4Var.mo34573b(list.get(0));
            if (b2.mo33958d().booleanValue()) {
                return b2;
            }
            return w4Var.mo34573b(list.get(1));
        }
    }
}
