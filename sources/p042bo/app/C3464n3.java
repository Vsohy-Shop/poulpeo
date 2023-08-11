package p042bo.app;

import java.util.List;
import org.json.JSONArray;
import p126j0.C8266c;

/* renamed from: bo.app.n3 */
public abstract class C3464n3 implements C3116e2 {

    /* renamed from: c */
    private static final String f2236c = C8266c.m16405n(C3464n3.class);

    /* renamed from: b */
    protected final List<C3116e2> f2237b;

    protected C3464n3(List<C3116e2> list) {
        this.f2237b = list;
    }

    /* renamed from: e */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3116e2 forJsonPut : this.f2237b) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
        } catch (Exception e) {
            C8266c.m16404m(f2236c, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
