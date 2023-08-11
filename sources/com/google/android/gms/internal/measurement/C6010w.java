package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6010w extends C6026x {
    public C6010w() {
        this.f7464a.add(C5867n0.BITWISE_AND);
        this.f7464a.add(C5867n0.BITWISE_LEFT_SHIFT);
        this.f7464a.add(C5867n0.BITWISE_NOT);
        this.f7464a.add(C5867n0.BITWISE_OR);
        this.f7464a.add(C5867n0.BITWISE_RIGHT_SHIFT);
        this.f7464a.add(C5867n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f7464a.add(C5867n0.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        C5867n0 n0Var = C5867n0.ADD;
        switch (C6032x5.m10244e(str).ordinal()) {
            case 4:
                C6032x5.m10247h(C5867n0.BITWISE_AND.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) & C6032x5.m10241b(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()))));
            case 5:
                C6032x5.m10247h(C5867n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) << ((int) (C6032x5.m10243d(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()) & 31)))));
            case 6:
                C6032x5.m10247h(C5867n0.BITWISE_NOT.name(), 1, list);
                return new C5783i(Double.valueOf((double) (~C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()))));
            case 7:
                C6032x5.m10247h(C5867n0.BITWISE_OR.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) | C6032x5.m10241b(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()))));
            case 8:
                C6032x5.m10247h(C5867n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) >> ((int) (C6032x5.m10243d(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()) & 31)))));
            case 9:
                C6032x5.m10247h(C5867n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10243d(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) >>> ((int) (C6032x5.m10243d(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()) & 31)))));
            case 10:
                C6032x5.m10247h(C5867n0.BITWISE_XOR.name(), 2, list);
                return new C5783i(Double.valueOf((double) (C6032x5.m10241b(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()) ^ C6032x5.m10241b(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()))));
            default:
                return super.mo34597b(str);
        }
    }
}
