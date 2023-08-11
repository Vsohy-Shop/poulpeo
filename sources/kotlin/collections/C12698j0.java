package kotlin.collections;

import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.j0 */
/* compiled from: IndexedValue.kt */
public final class C12698j0<T> {

    /* renamed from: a */
    private final int f20371a;

    /* renamed from: b */
    private final T f20372b;

    public C12698j0(int i, T t) {
        this.f20371a = i;
        this.f20372b = t;
    }

    /* renamed from: a */
    public final int mo50561a() {
        return this.f20371a;
    }

    /* renamed from: b */
    public final T mo50562b() {
        return this.f20372b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12698j0)) {
            return false;
        }
        C12698j0 j0Var = (C12698j0) obj;
        if (this.f20371a == j0Var.f20371a && C12775o.m28634d(this.f20372b, j0Var.f20372b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.f20371a * 31;
        T t = this.f20372b;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f20371a + ", value=" + this.f20372b + ')';
    }
}
