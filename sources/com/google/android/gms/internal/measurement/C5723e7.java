package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.e7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5723e7 {
    /* renamed from: a */
    public static <T> C5655a7<T> m9105a(C5655a7<T> a7Var) {
        if ((a7Var instanceof C5689c7) || (a7Var instanceof C5672b7)) {
            return a7Var;
        }
        if (a7Var instanceof Serializable) {
            return new C5672b7(a7Var);
        }
        return new C5689c7(a7Var);
    }

    /* renamed from: b */
    public static <T> C5655a7<T> m9106b(T t) {
        return new C5706d7(t);
    }
}
