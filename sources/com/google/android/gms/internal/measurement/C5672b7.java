package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5672b7<T> implements Serializable, C5655a7 {

    /* renamed from: b */
    final C5655a7<T> f6785b;

    /* renamed from: c */
    volatile transient boolean f6786c;

    /* renamed from: d */
    transient T f6787d;

    C5672b7(C5655a7<T> a7Var) {
        a7Var.getClass();
        this.f6785b = a7Var;
    }

    public final String toString() {
        Object obj;
        if (this.f6786c) {
            String valueOf = String.valueOf(this.f6787d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f6785b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f6786c) {
            synchronized (this) {
                if (!this.f6786c) {
                    T zza = this.f6785b.zza();
                    this.f6787d = zza;
                    this.f6786c = true;
                    return zza;
                }
            }
        }
        return this.f6787d;
    }
}
