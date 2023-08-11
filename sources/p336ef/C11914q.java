package p336ef;

import java.io.Serializable;
import kotlin.jvm.internal.C12775o;

/* renamed from: ef.q */
/* compiled from: Tuples.kt */
public final class C11914q<A, B, C> implements Serializable {

    /* renamed from: b */
    private final A f18610b;

    /* renamed from: c */
    private final B f18611c;

    /* renamed from: d */
    private final C f18612d;

    public C11914q(A a, B b, C c) {
        this.f18610b = a;
        this.f18611c = b;
        this.f18612d = c;
    }

    /* renamed from: a */
    public final A mo49123a() {
        return this.f18610b;
    }

    /* renamed from: b */
    public final B mo49124b() {
        return this.f18611c;
    }

    /* renamed from: c */
    public final C mo49125c() {
        return this.f18612d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11914q)) {
            return false;
        }
        C11914q qVar = (C11914q) obj;
        if (C12775o.m28634d(this.f18610b, qVar.f18610b) && C12775o.m28634d(this.f18611c, qVar.f18611c) && C12775o.m28634d(this.f18612d, qVar.f18612d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        A a = this.f18610b;
        int i3 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.hashCode();
        }
        int i4 = i * 31;
        B b = this.f18611c;
        if (b == null) {
            i2 = 0;
        } else {
            i2 = b.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        C c = this.f18612d;
        if (c != null) {
            i3 = c.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        return '(' + this.f18610b + ", " + this.f18611c + ", " + this.f18612d + ')';
    }
}
