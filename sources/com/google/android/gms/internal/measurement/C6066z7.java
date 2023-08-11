package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6066z7 {

    /* renamed from: a */
    final Map<String, Callable<? extends C5800j>> f7515a = new HashMap();

    /* renamed from: a */
    public final void mo34687a(String str, Callable<? extends C5800j> callable) {
        this.f7515a.put(str, callable);
    }
}
