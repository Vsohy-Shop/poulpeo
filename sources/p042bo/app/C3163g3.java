package p042bo.app;

import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p069e0.C7358a;
import p126j0.C8278g;

/* renamed from: bo.app.g3 */
public final class C3163g3 {

    /* renamed from: a */
    private final C3766w2 f1722a;

    /* renamed from: b */
    private final C3024b3 f1723b;

    /* renamed from: c */
    private final C7358a f1724c;

    /* renamed from: d */
    private final String f1725d;

    public C3163g3(C3766w2 w2Var, C3024b3 b3Var, C7358a aVar, String str) {
        C12775o.m28639i(w2Var, "triggerEvent");
        C12775o.m28639i(b3Var, "triggeredAction");
        C12775o.m28639i(aVar, "inAppMessage");
        this.f1722a = w2Var;
        this.f1723b = b3Var;
        this.f1724c = aVar;
        this.f1725d = str;
    }

    /* renamed from: a */
    public final C3766w2 mo28932a() {
        return this.f1722a;
    }

    /* renamed from: b */
    public final C3024b3 mo28933b() {
        return this.f1723b;
    }

    /* renamed from: c */
    public final C7358a mo28934c() {
        return this.f1724c;
    }

    /* renamed from: d */
    public final String mo28935d() {
        return this.f1725d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3163g3)) {
            return false;
        }
        C3163g3 g3Var = (C3163g3) obj;
        if (C12775o.m28634d(this.f1722a, g3Var.f1722a) && C12775o.m28634d(this.f1723b, g3Var.f1723b) && C12775o.m28634d(this.f1724c, g3Var.f1724c) && C12775o.m28634d(this.f1725d, g3Var.f1725d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f1722a.hashCode() * 31) + this.f1723b.hashCode()) * 31) + this.f1724c.hashCode()) * 31;
        String str = this.f1725d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C13745o.m31511f("\n             " + C8278g.m16456j((JSONObject) this.f1724c.forJsonPut()) + "\n             Triggered Action Id: " + this.f1723b.getId() + "\n             Trigger Event: " + this.f1722a + "\n             User Id: " + this.f1725d + "\n        ");
    }
}
