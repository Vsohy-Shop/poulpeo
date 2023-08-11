package p198q2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p208r2.C9368a;
import p208r2.C9369b;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: q2.o */
/* compiled from: FetchedAppGateKeepersManager.kt */
public final class C9173o {

    /* renamed from: a */
    private static final String f13439a = C12764h0.m28586b(C9173o.class).mo50651a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f13440b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final ConcurrentLinkedQueue<C9174a> f13441c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private static final Map<String, JSONObject> f13442d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Long f13443e;

    /* renamed from: f */
    private static C9369b f13444f;

    /* renamed from: g */
    public static final C9173o f13445g = new C9173o();

    /* renamed from: q2.o$a */
    /* compiled from: FetchedAppGateKeepersManager.kt */
    public interface C9174a {
        /* renamed from: a */
        void mo43448a();
    }

    /* renamed from: q2.o$b */
    /* compiled from: FetchedAppGateKeepersManager.kt */
    static final class C9175b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13446b;

        /* renamed from: c */
        final /* synthetic */ Context f13447c;

        /* renamed from: d */
        final /* synthetic */ String f13448d;

        C9175b(String str, Context context, String str2) {
            this.f13446b = str;
            this.f13447c = context;
            this.f13448d = str2;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C9173o oVar = C9173o.f13445g;
                        JSONObject a = oVar.m18771e(this.f13446b);
                        if (a.length() != 0) {
                            C9173o.m18775k(this.f13446b, a);
                            this.f13447c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f13448d, a.toString()).apply();
                            C9173o.f13443e = Long.valueOf(System.currentTimeMillis());
                        }
                        oVar.m18776l();
                        C9173o.f13440b.set(false);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: q2.o$c */
    /* compiled from: FetchedAppGateKeepersManager.kt */
    static final class C9176c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C9174a f13449b;

        C9176c(C9174a aVar) {
            this.f13449b = aVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        this.f13449b.mo43448a();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C9173o() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final JSONObject m18771e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", SystemMediaRouteProvider.PACKAGE_NAME);
        bundle.putString("sdk_version", FacebookSdk.getSdkVersion());
        bundle.putString("fields", "gatekeepers");
        C4555l.C4558c cVar = C4555l.f4241t;
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        C4555l v = cVar.mo31648v((C4509a) null, format, (C4555l.C4557b) null);
        v.mo31618H(true);
        v.mo31617G(bundle);
        JSONObject d = v.mo31620i().mo31711d();
        if (d != null) {
            return d;
        }
        return new JSONObject();
    }

    /* renamed from: f */
    public static final boolean m18772f(String str, String str2, boolean z) {
        Boolean bool;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        Map<String, Boolean> g = f13445g.mo43449g(str2);
        if (g.containsKey(str) && (bool = g.get(str)) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    /* renamed from: h */
    private final boolean m18773h(Long l) {
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final synchronized void m18774j(C9174a aVar) {
        synchronized (C9173o.class) {
            if (aVar != null) {
                f13441c.add(aVar);
            }
            String applicationId = FacebookSdk.getApplicationId();
            C9173o oVar = f13445g;
            if (!oVar.m18773h(f13443e) || !f13442d.containsKey(applicationId)) {
                Context applicationContext = FacebookSdk.getApplicationContext();
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                if (applicationContext != null) {
                    JSONObject jSONObject = null;
                    String string = applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, (String) null);
                    if (!C9138d0.m18618T(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            C9138d0.m18624Z("FacebookSDK", e);
                        }
                        if (jSONObject != null) {
                            m18775k(applicationId, jSONObject);
                        }
                    }
                    Executor executor = FacebookSdk.getExecutor();
                    if (executor == null) {
                        return;
                    }
                    if (f13440b.compareAndSet(false, true)) {
                        executor.execute(new C9175b(applicationId, applicationContext, format));
                        return;
                    }
                    return;
                }
                return;
            }
            oVar.m18776l();
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: k */
    public static final synchronized JSONObject m18775k(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        synchronized (C9173o.class) {
            C12775o.m28639i(str, "applicationId");
            jSONObject2 = f13442d.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                } catch (JSONException e) {
                    C9138d0.m18624Z("FacebookSDK", e);
                }
            }
            f13442d.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m18776l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<C9174a> concurrentLinkedQueue = f13441c;
            if (!concurrentLinkedQueue.isEmpty()) {
                C9174a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new C9176c(poll));
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public static final JSONObject m18777m(String str, boolean z) {
        C12775o.m28639i(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = f13442d;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                return new JSONObject();
            }
        }
        JSONObject e = f13445g.m18771e(str);
        Context applicationContext = FacebookSdk.getApplicationContext();
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, e.toString()).apply();
        return m18775k(str, e);
    }

    /* renamed from: g */
    public final Map<String, Boolean> mo43449g(String str) {
        List<C9368a> list;
        mo43450i();
        if (str != null) {
            Map<String, JSONObject> map = f13442d;
            if (map.containsKey(str)) {
                C9369b bVar = f13444f;
                if (bVar != null) {
                    list = bVar.mo43797a(str);
                } else {
                    list = null;
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C9368a aVar : list) {
                        hashMap.put(aVar.mo43792a(), Boolean.valueOf(aVar.mo43793b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C12775o.m28638h(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C9369b bVar2 = f13444f;
                if (bVar2 == null) {
                    bVar2 = new C9369b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new C9368a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.mo43798b(str, arrayList);
                f13444f = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    /* renamed from: i */
    public final void mo43450i() {
        m18774j((C9174a) null);
    }
}
