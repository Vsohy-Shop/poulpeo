package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.u5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5984u5 extends C5921q6 {

    /* renamed from: a */
    private final Context f7411a;

    /* renamed from: b */
    private final C5655a7<C6033x6<C5756g6>> f7412b;

    C5984u5(Context context, C5655a7<C6033x6<C5756g6>> a7Var) {
        if (context != null) {
            this.f7411a = context;
            this.f7412b = a7Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo34287a() {
        return this.f7411a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5655a7<C6033x6<C5756g6>> mo34288b() {
        return this.f7412b;
    }

    public final boolean equals(Object obj) {
        C5655a7<C6033x6<C5756g6>> a7Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5921q6) {
            C5921q6 q6Var = (C5921q6) obj;
            if (!this.f7411a.equals(q6Var.mo34287a()) || ((a7Var = this.f7412b) != null ? !a7Var.equals(q6Var.mo34288b()) : q6Var.mo34288b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f7411a.hashCode() ^ 1000003) * 1000003;
        C5655a7<C6033x6<C5756g6>> a7Var = this.f7412b;
        if (a7Var == null) {
            i = 0;
        } else {
            i = a7Var.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f7411a.toString();
        String valueOf = String.valueOf(this.f7412b);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
