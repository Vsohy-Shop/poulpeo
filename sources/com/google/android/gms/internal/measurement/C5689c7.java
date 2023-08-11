package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5689c7<T> implements C5655a7<T> {

    /* renamed from: b */
    volatile C5655a7<T> f6823b;

    /* renamed from: c */
    volatile boolean f6824c;

    /* renamed from: d */
    T f6825d;

    C5689c7(C5655a7<T> a7Var) {
        a7Var.getClass();
        this.f6823b = a7Var;
    }

    public final String toString() {
        Object obj = this.f6823b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f6825d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f6824c) {
            synchronized (this) {
                if (!this.f6824c) {
                    C5655a7<T> a7Var = this.f6823b;
                    a7Var.getClass();
                    T zza = a7Var.zza();
                    this.f6825d = zza;
                    this.f6824c = true;
                    this.f6823b = null;
                    return zza;
                }
            }
        }
        return this.f6825d;
    }
}
