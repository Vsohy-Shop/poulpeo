package p336ef;

import java.io.Serializable;
import kotlin.jvm.internal.C12775o;

/* renamed from: ef.l */
/* compiled from: Tuples.kt */
public final class C11906l<A, B> implements Serializable {

    /* renamed from: b */
    private final A f18598b;

    /* renamed from: c */
    private final B f18599c;

    public C11906l(A a, B b) {
        this.f18598b = a;
        this.f18599c = b;
    }

    /* renamed from: a */
    public final A mo49109a() {
        return this.f18598b;
    }

    /* renamed from: b */
    public final B mo49110b() {
        return this.f18599c;
    }

    /* renamed from: c */
    public final A mo49111c() {
        return this.f18598b;
    }

    /* renamed from: d */
    public final B mo49112d() {
        return this.f18599c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11906l)) {
            return false;
        }
        C11906l lVar = (C11906l) obj;
        if (C12775o.m28634d(this.f18598b, lVar.f18598b) && C12775o.m28634d(this.f18599c, lVar.f18599c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        A a = this.f18598b;
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.hashCode();
        }
        int i3 = i * 31;
        B b = this.f18599c;
        if (b != null) {
            i2 = b.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return '(' + this.f18598b + ", " + this.f18599c + ')';
    }
}
