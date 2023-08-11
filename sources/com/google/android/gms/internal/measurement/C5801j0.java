package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5801j0 extends C6026x {
    protected C5801j0() {
        this.f7464a.add(C5867n0.FOR_IN);
        this.f7464a.add(C5867n0.FOR_IN_CONST);
        this.f7464a.add(C5867n0.FOR_IN_LET);
        this.f7464a.add(C5867n0.FOR_LET);
        this.f7464a.add(C5867n0.FOR_OF);
        this.f7464a.add(C5867n0.FOR_OF_CONST);
        this.f7464a.add(C5867n0.FOR_OF_LET);
        this.f7464a.add(C5867n0.WHILE);
    }

    /* renamed from: c */
    private static C5914q m9426c(C5767h0 h0Var, Iterator<C5914q> it, C5914q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C5914q c = h0Var.mo33973a(it.next()).mo34574c((C5732f) qVar);
                if (c instanceof C5766h) {
                    C5766h hVar = (C5766h) c;
                    if ("break".equals(hVar.mo34065e())) {
                        return C5914q.f7289O;
                    }
                    if ("return".equals(hVar.mo34065e())) {
                        return hVar;
                    }
                }
            }
        }
        return C5914q.f7289O;
    }

    /* renamed from: d */
    private static C5914q m9427d(C5767h0 h0Var, C5914q qVar, C5914q qVar2) {
        return m9426c(h0Var, qVar.mo33972z(), qVar2);
    }

    /* renamed from: e */
    private static C5914q m9428e(C5767h0 h0Var, C5914q qVar, C5914q qVar2) {
        if (qVar instanceof Iterable) {
            return m9426c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        C5867n0 n0Var = C5867n0.ADD;
        int ordinal = C6032x5.m10244e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C6032x5.m10247h(C5867n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9427d(new C5784i0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C6032x5.m10247h(C5867n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9427d(new C5733f0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C6032x5.m10247h(C5867n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9427d(new C5750g0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C6032x5.m10247h(C5867n0.FOR_LET.name(), 4, list);
                    C5914q b = w4Var.mo34573b(list.get(0));
                    if (b instanceof C5732f) {
                        C5732f fVar = (C5732f) b;
                        C5914q qVar = list.get(1);
                        C5914q qVar2 = list.get(2);
                        C5914q b2 = w4Var.mo34573b(list.get(3));
                        C6015w4 a = w4Var.mo34572a();
                        for (int i = 0; i < fVar.mo33967t(); i++) {
                            String b3 = fVar.mo33969u(i).mo33956b();
                            a.mo34578g(b3, w4Var.mo34575d(b3));
                        }
                        while (w4Var.mo34573b(qVar).mo33958d().booleanValue()) {
                            C5914q c = w4Var.mo34574c((C5732f) b2);
                            if (c instanceof C5766h) {
                                C5766h hVar = (C5766h) c;
                                if ("break".equals(hVar.mo34065e())) {
                                    return C5914q.f7289O;
                                }
                                if ("return".equals(hVar.mo34065e())) {
                                    return hVar;
                                }
                            }
                            C6015w4 a2 = w4Var.mo34572a();
                            for (int i2 = 0; i2 < fVar.mo33967t(); i2++) {
                                String b4 = fVar.mo33969u(i2).mo33956b();
                                a2.mo34578g(b4, a.mo34575d(b4));
                            }
                            a2.mo34573b(qVar2);
                            a = a2;
                        }
                        return C5914q.f7289O;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C6032x5.m10247h(C5867n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9428e(new C5784i0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C6032x5.m10247h(C5867n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9428e(new C5733f0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C6032x5.m10247h(C5867n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C5978u) {
                        return m9428e(new C5750g0(w4Var, list.get(0).mo33956b()), w4Var.mo34573b(list.get(1)), w4Var.mo34573b(list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo34597b(str);
            }
        } else {
            C6032x5.m10247h(C5867n0.WHILE.name(), 4, list);
            C5914q qVar3 = list.get(0);
            C5914q qVar4 = list.get(1);
            C5914q b5 = w4Var.mo34573b(list.get(3));
            if (w4Var.mo34573b(list.get(2)).mo33958d().booleanValue()) {
                C5914q c2 = w4Var.mo34574c((C5732f) b5);
                if (c2 instanceof C5766h) {
                    C5766h hVar2 = (C5766h) c2;
                    if ("break".equals(hVar2.mo34065e())) {
                        return C5914q.f7289O;
                    }
                    if ("return".equals(hVar2.mo34065e())) {
                        return hVar2;
                    }
                }
            }
            while (w4Var.mo34573b(qVar3).mo33958d().booleanValue()) {
                C5914q c3 = w4Var.mo34574c((C5732f) b5);
                if (c3 instanceof C5766h) {
                    C5766h hVar3 = (C5766h) c3;
                    if ("break".equals(hVar3.mo34065e())) {
                        return C5914q.f7289O;
                    }
                    if ("return".equals(hVar3.mo34065e())) {
                        return hVar3;
                    }
                }
                w4Var.mo34573b(qVar4);
            }
            return C5914q.f7289O;
        }
    }
}
