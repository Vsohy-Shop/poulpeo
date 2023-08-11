package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6058z extends C6026x {
    public C6058z() {
        this.f7464a.add(C5867n0.EQUALS);
        this.f7464a.add(C5867n0.GREATER_THAN);
        this.f7464a.add(C5867n0.GREATER_THAN_EQUALS);
        this.f7464a.add(C5867n0.IDENTITY_EQUALS);
        this.f7464a.add(C5867n0.IDENTITY_NOT_EQUALS);
        this.f7464a.add(C5867n0.LESS_THAN);
        this.f7464a.add(C5867n0.LESS_THAN_EQUALS);
        this.f7464a.add(C5867n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m10328c(C5914q qVar, C5914q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C5994v) || (qVar instanceof C5882o)) {
                return true;
            }
            if (qVar instanceof C5783i) {
                if (Double.isNaN(qVar.mo33971y().doubleValue()) || Double.isNaN(qVar2.mo33971y().doubleValue()) || qVar.mo33971y().doubleValue() != qVar2.mo33971y().doubleValue()) {
                    return false;
                }
                return true;
            } else if (qVar instanceof C5978u) {
                return qVar.mo33956b().equals(qVar2.mo33956b());
            } else {
                if (qVar instanceof C5749g) {
                    return qVar.mo33958d().equals(qVar2.mo33958d());
                }
                if (qVar == qVar2) {
                    return true;
                }
                return false;
            }
        } else if (((qVar instanceof C5994v) || (qVar instanceof C5882o)) && ((qVar2 instanceof C5994v) || (qVar2 instanceof C5882o))) {
            return true;
        } else {
            boolean z = qVar instanceof C5783i;
            if (z && (qVar2 instanceof C5978u)) {
                return m10328c(qVar, new C5783i(qVar2.mo33971y()));
            }
            boolean z2 = qVar instanceof C5978u;
            if (z2 && (qVar2 instanceof C5783i)) {
                return m10328c(new C5783i(qVar.mo33971y()), qVar2);
            }
            if (qVar instanceof C5749g) {
                return m10328c(new C5783i(qVar.mo33971y()), qVar2);
            }
            if (qVar2 instanceof C5749g) {
                return m10328c(qVar, new C5783i(qVar2.mo33971y()));
            }
            if ((z2 || z) && (qVar2 instanceof C5850m)) {
                return m10328c(qVar, new C5978u(qVar2.mo33956b()));
            }
            if (!(qVar instanceof C5850m) || (!(qVar2 instanceof C5978u) && !(qVar2 instanceof C5783i))) {
                return false;
            }
            return m10328c(new C5978u(qVar.mo33956b()), qVar2);
        }
    }

    /* renamed from: d */
    private static boolean m10329d(C5914q qVar, C5914q qVar2) {
        int i;
        if (qVar instanceof C5850m) {
            qVar = new C5978u(qVar.mo33956b());
        }
        if (qVar2 instanceof C5850m) {
            qVar2 = new C5978u(qVar2.mo33956b());
        }
        if (!(qVar instanceof C5978u) || !(qVar2 instanceof C5978u)) {
            double doubleValue = qVar.mo33971y().doubleValue();
            double doubleValue2 = qVar2.mo33971y().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || ((i == 0 && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0))) {
                return false;
            }
            return true;
        } else if (qVar.mo33956b().compareTo(qVar2.mo33956b()) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m10330e(C5914q qVar, C5914q qVar2) {
        if (qVar instanceof C5850m) {
            qVar = new C5978u(qVar.mo33956b());
        }
        if (qVar2 instanceof C5850m) {
            qVar2 = new C5978u(qVar2.mo33956b());
        }
        if (((!(qVar instanceof C5978u) || !(qVar2 instanceof C5978u)) && (Double.isNaN(qVar.mo33971y().doubleValue()) || Double.isNaN(qVar2.mo33971y().doubleValue()))) || m10329d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        boolean z;
        boolean c;
        C6032x5.m10247h(C6032x5.m10244e(str).name(), 2, list);
        C5914q b = w4Var.mo34573b(list.get(0));
        C5914q b2 = w4Var.mo34573b(list.get(1));
        int ordinal = C6032x5.m10244e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m10328c(b, b2);
            } else if (ordinal == 42) {
                z = m10329d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m10329d(b2, b);
                        break;
                    case 38:
                        z = m10330e(b2, b);
                        break;
                    case 39:
                        z = C6032x5.m10251l(b, b2);
                        break;
                    case 40:
                        c = C6032x5.m10251l(b, b2);
                        break;
                    default:
                        return super.mo34597b(str);
                }
            } else {
                z = m10330e(b, b2);
            }
            z = !c;
        } else {
            z = m10328c(b, b2);
        }
        if (z) {
            return C5914q.f7294T;
        }
        return C5914q.f7295U;
    }
}
