package p031b0;

import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p042bo.app.C3024b3;
import p042bo.app.C3766w2;
import p069e0.C7358a;
import p126j0.C8278g;

/* renamed from: b0.h */
public final class C2813h {

    /* renamed from: a */
    private final C3766w2 f1117a;

    /* renamed from: b */
    private final C3024b3 f1118b;

    /* renamed from: c */
    private final C7358a f1119c;

    /* renamed from: d */
    private final String f1120d;

    public C2813h(C3766w2 w2Var, C3024b3 b3Var, C7358a aVar, String str) {
        C12775o.m28639i(w2Var, "triggerEvent");
        C12775o.m28639i(b3Var, "triggerAction");
        C12775o.m28639i(aVar, "inAppMessage");
        this.f1117a = w2Var;
        this.f1118b = b3Var;
        this.f1119c = aVar;
        this.f1120d = str;
    }

    /* renamed from: a */
    public final C7358a mo28294a() {
        return this.f1119c;
    }

    /* renamed from: b */
    public final C3024b3 mo28295b() {
        return this.f1118b;
    }

    /* renamed from: c */
    public final C3766w2 mo28296c() {
        return this.f1117a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2813h)) {
            return false;
        }
        C2813h hVar = (C2813h) obj;
        if (C12775o.m28634d(this.f1117a, hVar.f1117a) && C12775o.m28634d(this.f1118b, hVar.f1118b) && C12775o.m28634d(this.f1119c, hVar.f1119c) && C12775o.m28634d(this.f1120d, hVar.f1120d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f1117a.hashCode() * 31) + this.f1118b.hashCode()) * 31) + this.f1119c.hashCode()) * 31;
        String str = this.f1120d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C8278g.m16456j((JSONObject) this.f1119c.forJsonPut());
    }
}
