package p042bo.app;

import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.r6 */
public final class C3639r6 {

    /* renamed from: a */
    private final List<C3024b3> f2496a;

    public C3639r6(List<? extends C3024b3> list) {
        C12775o.m28639i(list, "triggeredActions");
        this.f2496a = list;
    }

    /* renamed from: a */
    public final List<C3024b3> mo29604a() {
        return this.f2496a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3639r6) && C12775o.m28634d(this.f2496a, ((C3639r6) obj).f2496a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2496a.hashCode();
    }

    public String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f2496a + ')';
    }
}
