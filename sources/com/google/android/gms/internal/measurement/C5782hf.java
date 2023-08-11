package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.hf */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5782hf extends C5800j {

    /* renamed from: d */
    private final C6066z7 f6997d;

    /* renamed from: e */
    final Map<String, C5800j> f6998e = new HashMap();

    public C5782hf(C6066z7 z7Var) {
        super("require");
        this.f6997d = z7Var;
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        C5914q qVar;
        String str;
        C6032x5.m10247h("require", 1, list);
        String b = w4Var.mo34573b(list.get(0)).mo33956b();
        if (this.f6998e.containsKey(b)) {
            return this.f6998e.get(b);
        }
        C6066z7 z7Var = this.f6997d;
        if (z7Var.f7515a.containsKey(b)) {
            try {
                qVar = (C5914q) z7Var.f7515a.get(b).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(b);
                if (valueOf.length() != 0) {
                    str = "Failed to create API implementation: ".concat(valueOf);
                } else {
                    str = new String("Failed to create API implementation: ");
                }
                throw new IllegalStateException(str);
            }
        } else {
            qVar = C5914q.f7289O;
        }
        if (qVar instanceof C5800j) {
            this.f6998e.put(b, (C5800j) qVar);
        }
        return qVar;
    }
}
