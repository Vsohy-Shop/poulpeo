package p451wc;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: wc.c */
/* compiled from: OpenDataManager */
public class C13693c {

    /* renamed from: b */
    private static Map<C13692b, Object> f22060b = new HashMap();

    /* renamed from: a */
    private Map<C13692b, Object> f22061a = new HashMap();

    /* renamed from: a */
    private JSONObject m31356a(JSONObject jSONObject, String[] strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(str, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    throw new Exception("Can't create a new openData node " + str, e);
                }
            } else {
                try {
                    jSONObject = jSONObject.getJSONObject(str);
                } catch (JSONException e2) {
                    throw new Exception("Can't retrieve JSONObject openData node " + str + " => ", e2);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static void m31357c(C13692b bVar, String str) {
        if (bVar == null) {
            C13633n.m31149e(C13693c.class, "Can't add null static key to opendata");
        } else if (TextUtils.isEmpty(str)) {
            m31358f(bVar);
        } else {
            f22060b.put(bVar, str);
        }
    }

    /* renamed from: f */
    public static void m31358f(C13692b bVar) {
        if (bVar == null) {
            C13633n.m31149e(C13693c.class, "Can't remove null static key from opendata");
        } else {
            f22060b.remove(bVar);
        }
    }

    /* renamed from: b */
    public void mo53358b(C13692b bVar, String str) {
        if (bVar == null) {
            C13633n.m31149e(this, "Can't add null key to opendata");
        } else if (TextUtils.isEmpty(str)) {
            mo53360e(bVar);
        } else {
            this.f22061a.put(bVar, str);
        }
    }

    /* renamed from: d */
    public final String mo53359d() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f22060b);
        hashMap.putAll(this.f22061a);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            C13692b bVar = (C13692b) entry.getKey();
            try {
                m31356a(jSONObject, bVar.mo53356b()).put(bVar.mo53355a(), entry.getValue());
            } catch (Exception e) {
                C13633n.m31150f(C13693c.class, "Impossible to add \"" + bVar.toString() + "\" opendata field", e);
            }
        }
        this.f22061a.clear();
        return jSONObject.toString();
    }

    /* renamed from: e */
    public final void mo53360e(C13692b bVar) {
        if (bVar == null) {
            C13633n.m31149e(this, "Can't remove null key from opendata");
        } else {
            this.f22061a.remove(bVar);
        }
    }
}
