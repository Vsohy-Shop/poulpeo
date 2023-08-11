package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.ec */
public final class C5329ec {

    /* renamed from: a */
    private final Map<String, C5465nc> f5979a;

    /* renamed from: b */
    private final C5465nc f5980b;

    private C5329ec(Map<String, C5465nc> map, C5465nc ncVar) {
        this.f5979a = Collections.unmodifiableMap(map);
        this.f5980b = ncVar;
    }

    /* renamed from: a */
    public final Map<String, C5465nc> mo33194a() {
        return this.f5979a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5979a);
        String valueOf2 = String.valueOf(this.f5980b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32 + valueOf2.length());
        sb.append("Properties: ");
        sb.append(valueOf);
        sb.append(" pushAfterEvaluate: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
