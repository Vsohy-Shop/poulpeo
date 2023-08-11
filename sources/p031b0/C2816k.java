package p031b0;

import kotlin.jvm.internal.C12775o;

/* renamed from: b0.k */
public final class C2816k {

    /* renamed from: a */
    private final String f1122a;

    /* renamed from: b */
    private final C2817a f1123b;

    /* renamed from: b0.k$a */
    public enum C2817a {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public C2816k(String str, C2817a aVar) {
        C12775o.m28639i(str, "sessionId");
        C12775o.m28639i(aVar, "eventType");
        this.f1122a = str;
        this.f1123b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2816k)) {
            return false;
        }
        C2816k kVar = (C2816k) obj;
        if (C12775o.m28634d(this.f1122a, kVar.f1122a) && this.f1123b == kVar.f1123b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1122a.hashCode() * 31) + this.f1123b.hashCode();
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.f1122a + "', eventType='" + this.f1123b + "'}'";
    }
}
