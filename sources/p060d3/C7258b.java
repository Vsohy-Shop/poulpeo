package p060d3;

import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p072e3.C7462e;
import p072e3.C7467g;
import p072e3.C7471i;
import p251v2.C9925a;

/* renamed from: d3.b */
/* compiled from: OpenGraphJSONUtility */
public final class C7258b {

    /* renamed from: d3.b$a */
    /* compiled from: OpenGraphJSONUtility */
    public interface C7259a {
        /* renamed from: a */
        JSONObject mo40830a(C7471i iVar);
    }

    private C7258b() {
    }

    /* renamed from: a */
    private static JSONArray m14080a(List list, C7259a aVar) {
        Class<C7258b> cls = C7258b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object d : list) {
                jSONArray.put(m14083d(d, aVar));
            }
            return jSONArray;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m14081b(C7462e eVar, C7259a aVar) {
        Class<C7258b> cls = C7258b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : eVar.mo41174d()) {
                jSONObject.put(next, m14083d(eVar.mo41171a(next), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private static JSONObject m14082c(C7467g gVar, C7259a aVar) {
        Class<C7258b> cls = C7258b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : gVar.mo41174d()) {
                jSONObject.put(next, m14083d(gVar.mo41171a(next), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static Object m14083d(@Nullable Object obj, C7259a aVar) {
        Class<C7258b> cls = C7258b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        if (obj == null) {
            try {
                return JSONObject.NULL;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
                return null;
            }
        } else {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof C7471i) {
                        if (aVar != null) {
                            return aVar.mo40830a((C7471i) obj);
                        }
                        return null;
                    } else if (obj instanceof C7467g) {
                        return m14082c((C7467g) obj, aVar);
                    } else {
                        if (obj instanceof List) {
                            return m14080a((List) obj, aVar);
                        }
                        throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                    }
                }
            }
            return obj;
        }
    }
}
