package p454wf;

import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;

/* renamed from: wf.f */
/* compiled from: Regex.kt */
public final class C13729f {

    /* renamed from: a */
    private final String f22170a;

    /* renamed from: b */
    private final C13528f f22171b;

    public C13729f(String str, C13528f fVar) {
        C12775o.m28639i(str, "value");
        C12775o.m28639i(fVar, "range");
        this.f22170a = str;
        this.f22171b = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13729f)) {
            return false;
        }
        C13729f fVar = (C13729f) obj;
        if (C12775o.m28634d(this.f22170a, fVar.f22170a) && C12775o.m28634d(this.f22171b, fVar.f22171b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f22170a.hashCode() * 31) + this.f22171b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f22170a + ", range=" + this.f22171b + ')';
    }
}
