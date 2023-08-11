package p042bo.app;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import p057d0.C7208a;

/* renamed from: bo.app.q1 */
public final class C3583q1 {

    /* renamed from: a */
    private final List<C7208a> f2421a;

    public C3583q1(List<C7208a> list) {
        C12775o.m28639i(list, "geofencesList");
        this.f2421a = list;
    }

    /* renamed from: a */
    public final List<C7208a> mo29539a() {
        return this.f2421a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3583q1) && C12775o.m28634d(this.f2421a, ((C3583q1) obj).f2421a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2421a.hashCode();
    }

    public String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f2421a + ')';
    }
}
