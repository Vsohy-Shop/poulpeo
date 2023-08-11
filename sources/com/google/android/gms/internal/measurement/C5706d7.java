package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5706d7<T> implements Serializable, C5655a7 {

    /* renamed from: b */
    final T f6847b;

    C5706d7(T t) {
        this.f6847b = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5706d7)) {
            return false;
        }
        T t = this.f6847b;
        T t2 = ((C5706d7) obj).f6847b;
        if (t == t2 || t.equals(t2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6847b});
    }

    public final String toString() {
        String obj = this.f6847b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final T zza() {
        return this.f6847b;
    }
}
