package p129j3;

import android.util.SparseArray;

/* renamed from: j3.p */
/* compiled from: QosTier */
public enum C8394p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private static final SparseArray<C8394p> f11943i = null;

    /* renamed from: b */
    private final int f11945b;

    static {
        C8394p pVar;
        C8394p pVar2;
        C8394p pVar3;
        C8394p pVar4;
        C8394p pVar5;
        C8394p pVar6;
        SparseArray<C8394p> sparseArray = new SparseArray<>();
        f11943i = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private C8394p(int i) {
        this.f11945b = i;
    }
}
