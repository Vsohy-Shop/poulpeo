package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.v0 */
final class C6777v0 {

    /* renamed from: a */
    private final Map<String, Double> f8886a = new HashMap();

    C6777v0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double mo39375a(String str, C6738l1 l1Var) {
        double d;
        d = (((double) ((C6749o0) l1Var).f8758g) + 1.0d) / ((double) ((C6749o0) l1Var).f8759h);
        this.f8886a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo39376b(String str) {
        this.f8886a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double mo39377c(String str) {
        Double d = this.f8886a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
