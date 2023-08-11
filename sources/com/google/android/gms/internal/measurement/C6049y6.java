package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6049y6 {
    /* renamed from: a */
    public static C5914q m10303a(C5920q5 q5Var) {
        if (q5Var == null) {
            return C5914q.f7289O;
        }
        int H = q5Var.mo34283H() - 1;
        if (H != 1) {
            if (H != 2) {
                if (H != 3) {
                    if (H == 4) {
                        List<C5920q5> B = q5Var.mo34278B();
                        ArrayList arrayList = new ArrayList();
                        for (C5920q5 a : B) {
                            arrayList.add(m10303a(a));
                        }
                        return new C5930r(q5Var.mo34285y(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (q5Var.mo34280D()) {
                    return new C5749g(Boolean.valueOf(q5Var.mo34279C()));
                } else {
                    return new C5749g((Boolean) null);
                }
            } else if (q5Var.mo34281E()) {
                return new C5783i(Double.valueOf(q5Var.mo34284w()));
            } else {
                return new C5783i((Double) null);
            }
        } else if (q5Var.mo34282F()) {
            return new C5978u(q5Var.mo34286z());
        } else {
            return C5914q.f7296V;
        }
    }

    /* renamed from: b */
    public static C5914q m10304b(Object obj) {
        if (obj == null) {
            return C5914q.f7290P;
        }
        if (obj instanceof String) {
            return new C5978u((String) obj);
        }
        if (obj instanceof Double) {
            return new C5783i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C5783i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C5783i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C5749g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C5866n nVar = new C5866n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C5914q b = m10304b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo33963k((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C5732f fVar = new C5732f();
            for (Object b2 : (List) obj) {
                fVar.mo33954I(fVar.mo33967t(), m10304b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
