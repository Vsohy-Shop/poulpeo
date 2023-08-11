package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import p058d1.C7218e;

/* renamed from: com.bumptech.glide.load.engine.p */
/* compiled from: Jobs */
final class C4425p {

    /* renamed from: a */
    private final Map<C7218e, C4414k<?>> f3946a = new HashMap();

    /* renamed from: b */
    private final Map<C7218e, C4414k<?>> f3947b = new HashMap();

    C4425p() {
    }

    /* renamed from: b */
    private Map<C7218e, C4414k<?>> m5280b(boolean z) {
        if (z) {
            return this.f3947b;
        }
        return this.f3946a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4414k<?> mo31374a(C7218e eVar, boolean z) {
        return m5280b(z).get(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31375c(C7218e eVar, C4414k<?> kVar) {
        m5280b(kVar.mo31347p()).put(eVar, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo31376d(C7218e eVar, C4414k<?> kVar) {
        Map<C7218e, C4414k<?>> b = m5280b(kVar.mo31347p());
        if (kVar.equals(b.get(eVar))) {
            b.remove(eVar);
        }
    }
}
