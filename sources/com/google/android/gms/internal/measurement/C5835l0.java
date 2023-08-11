package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5835l0 extends C6026x {
    /* renamed from: a */
    public final C5914q mo33643a(String str, C6015w4 w4Var, List<C5914q> list) {
        if (str == null || str.isEmpty() || !w4Var.mo34579h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C5914q d = w4Var.mo34575d(str);
        if (d instanceof C5800j) {
            return ((C5800j) d).mo33875a(w4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
