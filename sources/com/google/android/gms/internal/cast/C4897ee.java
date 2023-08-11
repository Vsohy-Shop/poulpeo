package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.ee */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C4897ee {
    C4897ee() {
    }

    /* renamed from: a */
    public static final int m6956a(int i, Object obj, Object obj2) {
        C4879de deVar = (C4879de) obj;
        C4861ce ceVar = (C4861ce) obj2;
        if (deVar.isEmpty()) {
            return 0;
        }
        Iterator it = deVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
