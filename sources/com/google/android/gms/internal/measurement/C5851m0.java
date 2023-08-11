package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5851m0 extends C6026x {
    protected C5851m0() {
        this.f7464a.add(C5867n0.ASSIGN);
        this.f7464a.add(C5867n0.CONST);
        this.f7464a.add(C5867n0.CREATE_ARRAY);
        this.f7464a.add(C5867n0.CREATE_OBJECT);
        this.f7464a.add(C5867n0.EXPRESSION_LIST);
        this.f7464a.add(C5867n0.f7089J);
        this.f7464a.add(C5867n0.GET_INDEX);
        this.f7464a.add(C5867n0.GET_PROPERTY);
        this.f7464a.add(C5867n0.NULL);
        this.f7464a.add(C5867n0.SET_PROPERTY);
        this.f7464a.add(C5867n0.TYPEOF);
        this.f7464a.add(C5867n0.UNDEFINED);
        this.f7464a.add(C5867n0.VAR);
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        String str2;
        C5867n0 n0Var = C5867n0.ADD;
        int ordinal = C6032x5.m10244e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C6032x5.m10247h(C5867n0.ASSIGN.name(), 2, list);
            C5914q b = w4Var.mo34573b(list.get(0));
            if (!(b instanceof C5978u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (w4Var.mo34579h(b.mo33956b())) {
                C5914q b2 = w4Var.mo34573b(list.get(1));
                w4Var.mo34578g(b.mo33956b(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo33956b()}));
            }
        } else if (ordinal == 14) {
            C6032x5.m10248i(C5867n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C5914q b3 = w4Var.mo34573b(list.get(i2));
                    if (b3 instanceof C5978u) {
                        w4Var.mo34577f(b3.mo33956b(), w4Var.mo34573b(list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C5914q.f7289O;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C6032x5.m10248i(C5867n0.EXPRESSION_LIST.name(), 1, list);
            C5914q qVar = C5914q.f7289O;
            while (i < list.size()) {
                qVar = w4Var.mo34573b(list.get(i));
                if (!(qVar instanceof C5766h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C6032x5.m10247h(C5867n0.f7089J.name(), 1, list);
            C5914q b4 = w4Var.mo34573b(list.get(0));
            if (b4 instanceof C5978u) {
                return w4Var.mo34575d(b4.mo33956b());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C6032x5.m10247h(C5867n0.NULL.name(), 0, list);
            return C5914q.f7290P;
        } else if (ordinal == 58) {
            C6032x5.m10247h(C5867n0.SET_PROPERTY.name(), 3, list);
            C5914q b5 = w4Var.mo34573b(list.get(0));
            C5914q b6 = w4Var.mo34573b(list.get(1));
            C5914q b7 = w4Var.mo34573b(list.get(2));
            if (b5 == C5914q.f7289O || b5 == C5914q.f7290P) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo33956b(), b5.mo33956b()}));
            }
            if ((b5 instanceof C5732f) && (b6 instanceof C5783i)) {
                ((C5732f) b5).mo33954I(b6.mo33971y().intValue(), b7);
            } else if (b5 instanceof C5850m) {
                ((C5850m) b5).mo33963k(b6.mo33956b(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C6032x5.m10247h(C5867n0.GET_PROPERTY.name(), 2, list);
                    C5914q b8 = w4Var.mo34573b(list.get(0));
                    C5914q b9 = w4Var.mo34573b(list.get(1));
                    if ((b8 instanceof C5732f) && C6032x5.m10250k(b9)) {
                        return ((C5732f) b8).mo33969u(b9.mo33971y().intValue());
                    }
                    if (b8 instanceof C5850m) {
                        return ((C5850m) b8).mo33964q(b9.mo33956b());
                    }
                    if (b8 instanceof C5978u) {
                        if ("length".equals(b9.mo33956b())) {
                            return new C5783i(Double.valueOf((double) b8.mo33956b().length()));
                        }
                        if (C6032x5.m10250k(b9) && b9.mo33971y().doubleValue() < ((double) b8.mo33956b().length())) {
                            return new C5978u(String.valueOf(b8.mo33956b().charAt(b9.mo33971y().intValue())));
                        }
                    }
                    return C5914q.f7289O;
                }
                switch (ordinal) {
                    case 62:
                        C6032x5.m10247h(C5867n0.TYPEOF.name(), 1, list);
                        C5914q b10 = w4Var.mo34573b(list.get(0));
                        if (b10 instanceof C5994v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C5749g) {
                            str2 = TypedValues.Custom.S_BOOLEAN;
                        } else if (b10 instanceof C5783i) {
                            str2 = "number";
                        } else if (b10 instanceof C5978u) {
                            str2 = TypedValues.Custom.S_STRING;
                        } else if (b10 instanceof C5898p) {
                            str2 = "function";
                        } else if ((b10 instanceof C5930r) || (b10 instanceof C5766h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C5978u(str2);
                    case 63:
                        C6032x5.m10247h(C5867n0.UNDEFINED.name(), 0, list);
                        return C5914q.f7289O;
                    case 64:
                        C6032x5.m10248i(C5867n0.VAR.name(), 1, list);
                        for (C5914q b11 : list) {
                            C5914q b12 = w4Var.mo34573b(b11);
                            if (b12 instanceof C5978u) {
                                w4Var.mo34576e(b12.mo33956b(), C5914q.f7289O);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b12.getClass().getCanonicalName()}));
                            }
                        }
                        return C5914q.f7289O;
                    default:
                        return super.mo34597b(str);
                }
            } else if (list.isEmpty()) {
                return new C5866n();
            } else {
                if (list.size() % 2 == 0) {
                    C5866n nVar = new C5866n();
                    while (i < list.size() - 1) {
                        C5914q b13 = w4Var.mo34573b(list.get(i));
                        C5914q b14 = w4Var.mo34573b(list.get(i + 1));
                        if ((b13 instanceof C5766h) || (b14 instanceof C5766h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo33963k(b13.mo33956b(), b14);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C5732f();
        } else {
            C5732f fVar = new C5732f();
            for (C5914q b15 : list) {
                C5914q b16 = w4Var.mo34573b(b15);
                if (!(b16 instanceof C5766h)) {
                    fVar.mo33954I(i, b16);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
