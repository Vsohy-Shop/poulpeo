package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5818k0 extends C6026x {
    protected C5818k0() {
        this.f7464a.add(C5867n0.ADD);
        this.f7464a.add(C5867n0.DIVIDE);
        this.f7464a.add(C5867n0.MODULUS);
        this.f7464a.add(C5867n0.MULTIPLY);
        this.f7464a.add(C5867n0.NEGATE);
        this.f7464a.add(C5867n0.POST_DECREMENT);
        this.f7464a.add(C5867n0.POST_INCREMENT);
        this.f7464a.add(C5867n0.PRE_DECREMENT);
        this.f7464a.add(C5867n0.PRE_INCREMENT);
        this.f7464a.add(C5867n0.SUBTRACT);
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        String str2;
        C5867n0 n0Var = C5867n0.ADD;
        int ordinal = C6032x5.m10244e(str).ordinal();
        if (ordinal == 0) {
            C6032x5.m10247h(C5867n0.ADD.name(), 2, list);
            C5914q b = w4Var.mo34573b(list.get(0));
            C5914q b2 = w4Var.mo34573b(list.get(1));
            if (!(b instanceof C5850m) && !(b instanceof C5978u) && !(b2 instanceof C5850m) && !(b2 instanceof C5978u)) {
                return new C5783i(Double.valueOf(b.mo33971y().doubleValue() + b2.mo33971y().doubleValue()));
            }
            String valueOf = String.valueOf(b.mo33956b());
            String valueOf2 = String.valueOf(b2.mo33956b());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            return new C5978u(str2);
        } else if (ordinal == 21) {
            C6032x5.m10247h(C5867n0.DIVIDE.name(), 2, list);
            return new C5783i(Double.valueOf(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue() / w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()));
        } else if (ordinal == 59) {
            C6032x5.m10247h(C5867n0.SUBTRACT.name(), 2, list);
            return new C5783i(Double.valueOf(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue() + new C5783i(Double.valueOf(-w4Var.mo34573b(list.get(1)).mo33971y().doubleValue())).mo33971y().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C6032x5.m10247h(str, 2, list);
            C5914q b3 = w4Var.mo34573b(list.get(0));
            w4Var.mo34573b(list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C6032x5.m10247h(str, 1, list);
            return w4Var.mo34573b(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C6032x5.m10247h(C5867n0.MODULUS.name(), 2, list);
                    return new C5783i(Double.valueOf(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue() % w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()));
                case 45:
                    C6032x5.m10247h(C5867n0.MULTIPLY.name(), 2, list);
                    return new C5783i(Double.valueOf(w4Var.mo34573b(list.get(0)).mo33971y().doubleValue() * w4Var.mo34573b(list.get(1)).mo33971y().doubleValue()));
                case 46:
                    C6032x5.m10247h(C5867n0.NEGATE.name(), 1, list);
                    return new C5783i(Double.valueOf(-w4Var.mo34573b(list.get(0)).mo33971y().doubleValue()));
                default:
                    return super.mo34597b(str);
            }
        }
    }
}
