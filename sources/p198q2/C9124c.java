package p198q2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: q2.c */
/* compiled from: BundleJSONConverter.kt */
public final class C9124c {

    /* renamed from: a */
    private static final Map<Class<?>, C9132h> f13313a;

    /* renamed from: b */
    public static final C9124c f13314b = new C9124c();

    /* renamed from: q2.c$a */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9125a implements C9132h {
        C9125a() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: q2.c$b */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9126b implements C9132h {
        C9126b() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: q2.c$c */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9127c implements C9132h {
        C9127c() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: q2.c$d */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9128d implements C9132h {
        C9128d() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: q2.c$e */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9129e implements C9132h {
        C9129e() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: q2.c$f */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9130f implements C9132h {
        C9130f() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: q2.c$g */
    /* compiled from: BundleJSONConverter.kt */
    public static final class C9131g implements C9132h {
        C9131g() {
        }

        /* renamed from: a */
        public void mo43392a(Bundle bundle, String str, Object obj) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: q2.c$h */
    /* compiled from: BundleJSONConverter.kt */
    public interface C9132h {
        /* renamed from: a */
        void mo43392a(Bundle bundle, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        f13313a = hashMap;
        hashMap.put(Boolean.class, new C9125a());
        hashMap.put(Integer.class, new C9126b());
        hashMap.put(Long.class, new C9127c());
        hashMap.put(Double.class, new C9128d());
        hashMap.put(String.class, new C9129e());
        hashMap.put(String[].class, new C9130f());
        hashMap.put(JSONArray.class, new C9131g());
    }

    private C9124c() {
    }

    /* renamed from: a */
    public static final Bundle m18579a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m18579a((JSONObject) obj));
                } else {
                    C9132h hVar = f13313a.get(obj.getClass());
                    if (hVar != null) {
                        C12775o.m28638h(next, "key");
                        C12775o.m28638h(obj, "value");
                        hVar.mo43392a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }
}
