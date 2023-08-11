package p095g2;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p118i2.C8096d;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.e */
/* compiled from: InAppPurchaseLoggerManager.kt */
public final class C7761e {

    /* renamed from: a */
    private static SharedPreferences f10770a;

    /* renamed from: b */
    private static final Set<String> f10771b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private static final Map<String, Long> f10772c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final C7761e f10773d = new C7761e();

    private C7761e() {
    }

    /* renamed from: d */
    public static final boolean m15123d() {
        Class<C7761e> cls = C7761e.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f10773d.m15126g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f10770a;
            if (sharedPreferences == null) {
                C12775o.m28656z("sharedPreferences");
            }
            long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0);
            if (j != 0 && currentTimeMillis - j < ((long) 86400)) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f10770a;
            if (sharedPreferences2 == null) {
                C12775o.m28656z("sharedPreferences");
            }
            sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m15124e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        Class<C7761e> cls = C7761e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(map, "purchaseDetailsMap");
                C12775o.m28639i(map2, "skuDetailsMap");
                C7761e eVar = f10773d;
                eVar.m15126g();
                eVar.m15125f(eVar.mo41409c(eVar.mo41407a(map), map2));
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: f */
    private final void m15125f(Map<String, String> map) {
        if (!C9925a.m20734d(this)) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    if (!(str == null || str2 == null)) {
                        C8096d.m15932f(str, str2, false);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: g */
    private final void m15126g() {
        if (!C9925a.m20734d(this)) {
            try {
                SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                    sharedPreferences.edit().clear().apply();
                    sharedPreferences2.edit().clear().apply();
                }
                SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                C12775o.m28638h(sharedPreferences3, "getApplicationContext().…RE, Context.MODE_PRIVATE)");
                f10770a = sharedPreferences3;
                Set<String> set = f10771b;
                if (sharedPreferences3 == null) {
                    C12775o.m28656z("sharedPreferences");
                }
                Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                set.addAll(stringSet);
                for (String t0 : set) {
                    List t02 = C13755w.m31594t0(t0, new String[]{";"}, false, 2, 2, (Object) null);
                    f10772c.put(t02.get(0), Long.valueOf(Long.parseLong((String) t02.get(1))));
                }
                mo41408b();
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: a */
    public final Map<String, JSONObject> mo41407a(Map<String, JSONObject> map) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : C12716r0.m28427r(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f10772c.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set<String> set = f10771b;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f10770a;
            if (sharedPreferences == null) {
                C12775o.m28656z("sharedPreferences");
            }
            sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f10771b).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: b */
    public final void mo41408b() {
        if (!C9925a.m20734d(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f10770a;
                if (sharedPreferences == null) {
                    C12775o.m28656z("sharedPreferences");
                }
                long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                if (j == 0) {
                    SharedPreferences sharedPreferences2 = f10770a;
                    if (sharedPreferences2 == null) {
                        C12775o.m28656z("sharedPreferences");
                    }
                    sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else if (currentTimeMillis - j > ((long) 604800)) {
                    for (Map.Entry entry : C12716r0.m28427r(f10772c).entrySet()) {
                        String str = (String) entry.getKey();
                        long longValue = ((Number) entry.getValue()).longValue();
                        if (currentTimeMillis - longValue > ((long) 86400)) {
                            Set<String> set = f10771b;
                            set.remove(str + ';' + longValue);
                            f10772c.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences3 = f10770a;
                    if (sharedPreferences3 == null) {
                        C12775o.m28656z("sharedPreferences");
                    }
                    sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f10771b).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public final Map<String, String> mo41409c(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(map, "purchaseDetailsMap");
            C12775o.m28639i(map2, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                JSONObject jSONObject = (JSONObject) next.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get((String) next.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= ((long) 86400)) {
                            if (jSONObject2 != null) {
                                String jSONObject3 = jSONObject.toString();
                                C12775o.m28638h(jSONObject3, "purchaseDetail.toString()");
                                String jSONObject4 = jSONObject2.toString();
                                C12775o.m28638h(jSONObject4, "skuDetail.toString()");
                                linkedHashMap.put(jSONObject3, jSONObject4);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
