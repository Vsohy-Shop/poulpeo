package p148l2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: l2.a */
/* compiled from: RestrictiveDataManager.kt */
public final class C8653a {

    /* renamed from: a */
    private static boolean f12369a;

    /* renamed from: b */
    private static final String f12370b = C8653a.class.getCanonicalName();

    /* renamed from: c */
    private static final List<C8654a> f12371c = new ArrayList();

    /* renamed from: d */
    private static final Set<String> f12372d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final C8653a f12373e = new C8653a();

    /* renamed from: l2.a$a */
    /* compiled from: RestrictiveDataManager.kt */
    public static final class C8654a {

        /* renamed from: a */
        private String f12374a;

        /* renamed from: b */
        private Map<String, String> f12375b;

        public C8654a(String str, Map<String, String> map) {
            C12775o.m28639i(str, "eventName");
            C12775o.m28639i(map, "restrictiveParams");
            this.f12374a = str;
            this.f12375b = map;
        }

        /* renamed from: a */
        public final String mo42726a() {
            return this.f12374a;
        }

        /* renamed from: b */
        public final Map<String, String> mo42727b() {
            return this.f12375b;
        }

        /* renamed from: c */
        public final void mo42728c(Map<String, String> map) {
            C12775o.m28639i(map, "<set-?>");
            this.f12375b = map;
        }
    }

    private C8653a() {
    }

    /* renamed from: a */
    public static final void m17392a() {
        Class<C8653a> cls = C8653a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f12369a = true;
                f12373e.m17394c();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private final String m17393b(String str, String str2) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            for (C8654a aVar : new ArrayList(f12371c)) {
                if (aVar != null) {
                    if (C12775o.m28634d(str, aVar.mo42726a())) {
                        for (String next : aVar.mo42727b().keySet()) {
                            if (C12775o.m28634d(str2, next)) {
                                return aVar.mo42727b().get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w(f12370b, "getMatchedRuleType failed", e);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
        return null;
    }

    /* renamed from: c */
    private final void m17394c() {
        String g;
        if (!C9925a.m20734d(this)) {
            try {
                boolean z = false;
                C9177p o = C9181q.m18810o(FacebookSdk.getApplicationId(), false);
                if (o != null && (g = o.mo43459g()) != null) {
                    if (g.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        JSONObject jSONObject = new JSONObject(g);
                        f12371c.clear();
                        f12372d.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C12775o.m28638h(next, "key");
                                C8654a aVar = new C8654a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.mo42728c(C9138d0.m18647l(optJSONObject));
                                    f12371c.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f12372d.add(aVar.mo42726a());
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: d */
    private final boolean m17395d(String str) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            return f12372d.contains(str);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: e */
    public static final String m17396e(String str) {
        Class<C8653a> cls = C8653a.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "eventName");
            if (!f12369a || !f12373e.m17395d(str)) {
                return str;
            }
            return "_removed_";
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m17397f(Map<String, String> map, String str) {
        Class<C8653a> cls = C8653a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(map, "parameters");
                C12775o.m28639i(str, "eventName");
                if (f12369a) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String b = f12373e.m17393b(str, str2);
                        if (b != null) {
                            hashMap.put(str2, b);
                            map.remove(str2);
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
