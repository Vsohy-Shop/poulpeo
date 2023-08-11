package com.google.common.collect;

import java.io.Serializable;
import p111h6.C7999f;
import p111h6.C8007k;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.c */
/* compiled from: ByFunctionOrdering */
final class C6806c<F, T> extends C6875v<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final C7999f<F, ? extends T> f8924b;

    /* renamed from: c */
    final C6875v<T> f8925c;

    C6806c(C7999f<F, ? extends T> fVar, C6875v<T> vVar) {
        this.f8924b = (C7999f) C8012n.m15755n(fVar);
        this.f8925c = (C6875v) C8012n.m15755n(vVar);
    }

    public int compare(F f, F f2) {
        return this.f8925c.compare(this.f8924b.apply(f), this.f8924b.apply(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6806c)) {
            return false;
        }
        C6806c cVar = (C6806c) obj;
        if (!this.f8924b.equals(cVar.f8924b) || !this.f8925c.equals(cVar.f8925c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8007k.m15736b(this.f8924b, this.f8925c);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f8925c);
        String valueOf2 = String.valueOf(this.f8924b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
