package p031b0;

import kotlin.jvm.internal.C12775o;

/* renamed from: b0.i */
public final class C2814i {

    /* renamed from: a */
    private final String f1121a;

    public C2814i(String str) {
        C12775o.m28639i(str, "sourceEventType");
        this.f1121a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2814i) && C12775o.m28634d(this.f1121a, ((C2814i) obj).f1121a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1121a.hashCode();
    }

    public String toString() {
        return "NoMatchingTriggerEvent(sourceEventType=" + this.f1121a + ')';
    }
}
