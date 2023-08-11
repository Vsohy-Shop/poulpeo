package p107h2;

import com.facebook.FacebookSdk;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p128j2.C8343d;
import p198q2.C9173o;
import p251v2.C9925a;

/* renamed from: h2.a */
/* compiled from: IntegrityManager.kt */
public final class C7903a {

    /* renamed from: a */
    private static boolean f11054a;

    /* renamed from: b */
    private static boolean f11055b;

    /* renamed from: c */
    public static final C7903a f11056c = new C7903a();

    private C7903a() {
    }

    /* renamed from: a */
    public static final void m15518a() {
        Class<C7903a> cls = C7903a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f11054a = true;
                f11055b = C9173o.m18772f("FBSDKFeatureIntegritySample", FacebookSdk.getApplicationId(), false);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private final String m15519b(String str) {
        String str2;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String[] o = C8343d.m16574o(C8343d.C8344a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (o == null || (str2 = o[0]) == null) {
                return "none";
            }
            return str2;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public static final void m15520c(Map<String, String> map) {
        Class<C7903a> cls = C7903a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(map, "parameters");
                if (f11054a && !map.isEmpty()) {
                    try {
                        List<String> B0 = C12686e0.m28205B0(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : B0) {
                            String str2 = map.get(str);
                            if (str2 != null) {
                                String str3 = str2;
                                C7903a aVar = f11056c;
                                if (aVar.m15521d(str) || aVar.m15521d(str3)) {
                                    map.remove(str);
                                    if (!f11055b) {
                                        str3 = "";
                                    }
                                    jSONObject.put(str, str3);
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        if (jSONObject.length() != 0) {
                            String jSONObject2 = jSONObject.toString();
                            C12775o.m28638h(jSONObject2, "restrictiveParamJson.toString()");
                            map.put("_onDeviceParams", jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private final boolean m15521d(String str) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            return !C12775o.m28634d("none", m15519b(str));
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }
}
