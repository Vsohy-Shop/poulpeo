package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5956s9 {
    C5956s9() {
    }

    /* renamed from: a */
    public static final int m9887a(int i, Object obj, Object obj2) {
        C5940r9 r9Var = (C5940r9) obj;
        C5924q9 q9Var = (C5924q9) obj2;
        if (r9Var.isEmpty()) {
            return 0;
        }
        Iterator it = r9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m9888b(Object obj, Object obj2) {
        C5940r9 r9Var = (C5940r9) obj;
        C5940r9 r9Var2 = (C5940r9) obj2;
        if (!r9Var2.isEmpty()) {
            if (!r9Var.mo34326f()) {
                r9Var = r9Var.mo34320b();
            }
            r9Var.mo34323e(r9Var2);
        }
        return r9Var;
    }
}
