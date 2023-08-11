package p042bo.app;

import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;

/* renamed from: bo.app.f1 */
public final class C3140f1 {

    /* renamed from: a */
    private final JSONArray f1702a;

    public C3140f1(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "featureFlagsData");
        this.f1702a = jSONArray;
    }

    /* renamed from: a */
    public final JSONArray mo28900a() {
        return this.f1702a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3140f1) && C12775o.m28634d(this.f1702a, ((C3140f1) obj).f1702a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1702a.hashCode();
    }

    public String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f1702a + ')';
    }
}
