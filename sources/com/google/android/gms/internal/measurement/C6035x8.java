package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x8 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6035x8 extends C5800j {

    /* renamed from: d */
    private final C5681c f7470d;

    public C6035x8(C5681c cVar) {
        super("internal.eventLogger");
        this.f7470d = cVar;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        Map map;
        C6032x5.m10247h(this.f7017b, 3, list);
        String b = w4Var.mo34573b(list.get(0)).mo33956b();
        long a = (long) C6032x5.m10240a(w4Var.mo34573b(list.get(1)).mo33971y().doubleValue());
        C5914q b2 = w4Var.mo34573b(list.get(2));
        if (b2 instanceof C5866n) {
            map = C6032x5.m10246g((C5866n) b2);
        } else {
            map = new HashMap();
        }
        this.f7470d.mo33728e(b, a, map);
        return C5914q.f7289O;
    }
}
