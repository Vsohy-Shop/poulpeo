package com.google.android.gms.internal.measurement;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.gf */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5765gf extends C5800j {

    /* renamed from: d */
    private final C5833kf f6968d;

    public C5765gf(C5833kf kfVar) {
        super("internal.registerCallback");
        this.f6968d = kfVar;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        int i;
        C6032x5.m10247h(this.f7017b, 3, list);
        String b = w4Var.mo34573b(list.get(0)).mo33956b();
        C5914q b2 = w4Var.mo34573b(list.get(1));
        if (b2 instanceof C5898p) {
            C5914q b3 = w4Var.mo34573b(list.get(2));
            if (b3 instanceof C5866n) {
                C5866n nVar = (C5866n) b3;
                if (nVar.mo33962j(JSONAPIResourceIdSerializer.FIELD_TYPE)) {
                    String b4 = nVar.mo33964q(JSONAPIResourceIdSerializer.FIELD_TYPE).mo33956b();
                    if (nVar.mo33962j("priority")) {
                        i = C6032x5.m10241b(nVar.mo33964q("priority").mo33971y().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.f6968d.mo34146a(b, i, (C5898p) b2, b4);
                    return C5914q.f7289O;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
