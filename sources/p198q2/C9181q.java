package p198q2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.core.C0344a;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p071e2.C7453e;
import p118i2.C8096d;
import p118i2.C8098e;
import p198q2.C9160h;
import p198q2.C9177p;
import p251v2.C9925a;

/* renamed from: q2.q */
/* compiled from: FetchedAppSettingsManager.kt */
public final class C9181q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f13475a;

    /* renamed from: b */
    private static final List<String> f13476b = C12726w.m28527n("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C9177p> f13477c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicReference<C9182a> f13478d = new AtomicReference<>(C9182a.NOT_LOADED);

    /* renamed from: e */
    private static final ConcurrentLinkedQueue<C9183b> f13479e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f13480f;

    /* renamed from: g */
    private static JSONArray f13481g;

    /* renamed from: h */
    public static final C9181q f13482h = new C9181q();

    /* renamed from: q2.q$a */
    /* compiled from: FetchedAppSettingsManager.kt */
    public enum C9182a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: q2.q$b */
    /* compiled from: FetchedAppSettingsManager.kt */
    public interface C9183b {
        /* renamed from: a */
        void mo28379a(C9177p pVar);

        /* renamed from: d */
        void mo28380d();
    }

    /* renamed from: q2.q$c */
    /* compiled from: FetchedAppSettingsManager.kt */
    static final class C9184c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f13488b;

        /* renamed from: c */
        final /* synthetic */ String f13489c;

        /* renamed from: d */
        final /* synthetic */ String f13490d;

        C9184c(Context context, String str, String str2) {
            this.f13488b = context;
            this.f13489c = str;
            this.f13490d = str2;
        }

        public final void run() {
            SharedPreferences sharedPreferences;
            C9177p pVar;
            C9182a aVar;
            JSONObject jSONObject;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        try {
                            sharedPreferences = this.f13488b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                            pVar = null;
                            String string = sharedPreferences.getString(this.f13489c, (String) null);
                            if (!C9138d0.m18618T(string)) {
                                if (string != null) {
                                    jSONObject = new JSONObject(string);
                                    if (jSONObject != null) {
                                        pVar = C9181q.f13482h.mo43468l(this.f13490d, jSONObject);
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                        } catch (JSONException e) {
                            C9138d0.m18624Z("FacebookSDK", e);
                            jSONObject = null;
                        } catch (Throwable th) {
                            C9925a.m20732b(th, this);
                            return;
                        }
                        C9181q qVar = C9181q.f13482h;
                        JSONObject a = qVar.m18805i(this.f13490d);
                        if (a != null) {
                            qVar.mo43468l(this.f13490d, a);
                            sharedPreferences.edit().putString(this.f13489c, a.toString()).apply();
                        }
                        if (pVar != null) {
                            String h = pVar.mo43460h();
                            if (!C9181q.f13480f && h != null && h.length() > 0) {
                                C9181q.f13480f = true;
                                Log.w(C9181q.f13475a, h);
                            }
                        }
                        C9173o.m18777m(this.f13490d, true);
                        C8096d.m15930d();
                        AtomicReference c = C9181q.f13478d;
                        if (C9181q.f13477c.containsKey(this.f13490d)) {
                            aVar = C9182a.SUCCESS;
                        } else {
                            aVar = C9182a.ERROR;
                        }
                        c.set(aVar);
                        qVar.m18809n();
                    }
                } catch (Throwable th2) {
                    C9925a.m20732b(th2, this);
                }
            }
        }
    }

    /* renamed from: q2.q$d */
    /* compiled from: FetchedAppSettingsManager.kt */
    static final class C9185d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C9183b f13491b;

        C9185d(C9183b bVar) {
            this.f13491b = bVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        this.f13491b.mo28380d();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: q2.q$e */
    /* compiled from: FetchedAppSettingsManager.kt */
    static final class C9186e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C9183b f13492b;

        /* renamed from: c */
        final /* synthetic */ C9177p f13493c;

        C9186e(C9183b bVar, C9177p pVar) {
            this.f13492b = bVar;
            this.f13493c = pVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        this.f13492b.mo28379a(this.f13493c);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String simpleName = C9181q.class.getSimpleName();
        C12775o.m28638h(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        f13475a = simpleName;
    }

    private C9181q() {
    }

    /* renamed from: h */
    public static final void m18804h(C9183b bVar) {
        C12775o.m28639i(bVar, "callback");
        f13479e.add(bVar);
        m18807k();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final JSONObject m18805i(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f13476b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        C4555l v = C4555l.f4241t.mo31648v((C4509a) null, str, (C4555l.C4557b) null);
        v.mo31614D(true);
        v.mo31618H(true);
        v.mo31617G(bundle);
        JSONObject d = v.mo31620i().mo31711d();
        if (d != null) {
            return d;
        }
        return new JSONObject();
    }

    /* renamed from: j */
    public static final C9177p m18806j(String str) {
        if (str != null) {
            return f13477c.get(str);
        }
        return null;
    }

    /* renamed from: k */
    public static final void m18807k() {
        boolean z;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (C9138d0.m18618T(applicationId)) {
            f13478d.set(C9182a.ERROR);
            f13482h.m18809n();
        } else if (f13477c.containsKey(applicationId)) {
            f13478d.set(C9182a.SUCCESS);
            f13482h.m18809n();
        } else {
            AtomicReference<C9182a> atomicReference = f13478d;
            C9182a aVar = C9182a.NOT_LOADED;
            C9182a aVar2 = C9182a.LOADING;
            if (C0344a.m496a(atomicReference, aVar, aVar2) || C0344a.m496a(atomicReference, C9182a.ERROR, aVar2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                f13482h.m18809n();
                return;
            }
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            FacebookSdk.getExecutor().execute(new C9184c(applicationContext, format, applicationId));
        }
    }

    /* renamed from: m */
    private final Map<String, Map<String, C9177p.C9179b>> m18808m(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null)) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                C9177p.C9179b.C9180a aVar = C9177p.C9179b.f13470e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                C12775o.m28638h(optJSONObject, "dialogConfigData.optJSONObject(i)");
                C9177p.C9179b a = aVar.mo43467a(optJSONObject);
                if (a != null) {
                    String a2 = a.mo43465a();
                    Map map = (Map) hashMap.get(a2);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a2, map);
                    }
                    map.put(a.mo43466b(), a);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m18809n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicReference<q2.q$a> r0 = f13478d     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005f }
            q2.q$a r0 = (p198q2.C9181q.C9182a) r0     // Catch:{ all -> 0x005f }
            q2.q$a r1 = p198q2.C9181q.C9182a.NOT_LOADED     // Catch:{ all -> 0x005f }
            if (r1 == r0) goto L_0x005d
            q2.q$a r1 = p198q2.C9181q.C9182a.LOADING     // Catch:{ all -> 0x005f }
            if (r1 != r0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            java.lang.String r1 = com.facebook.FacebookSdk.getApplicationId()     // Catch:{ all -> 0x005f }
            java.util.Map<java.lang.String, q2.p> r2 = f13477c     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x005f }
            q2.p r1 = (p198q2.C9177p) r1     // Catch:{ all -> 0x005f }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x005f }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x005f }
            r2.<init>(r3)     // Catch:{ all -> 0x005f }
            q2.q$a r3 = p198q2.C9181q.C9182a.ERROR     // Catch:{ all -> 0x005f }
            if (r3 != r0) goto L_0x0044
        L_0x002b:
            java.util.concurrent.ConcurrentLinkedQueue<q2.q$b> r0 = f13479e     // Catch:{ all -> 0x005f }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r1 != 0) goto L_0x0042
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x005f }
            q2.q$b r0 = (p198q2.C9181q.C9183b) r0     // Catch:{ all -> 0x005f }
            q2.q$d r1 = new q2.q$d     // Catch:{ all -> 0x005f }
            r1.<init>(r0)     // Catch:{ all -> 0x005f }
            r2.post(r1)     // Catch:{ all -> 0x005f }
            goto L_0x002b
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            java.util.concurrent.ConcurrentLinkedQueue<q2.q$b> r0 = f13479e     // Catch:{ all -> 0x005f }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            if (r3 != 0) goto L_0x005b
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x005f }
            q2.q$b r0 = (p198q2.C9181q.C9183b) r0     // Catch:{ all -> 0x005f }
            q2.q$e r3 = new q2.q$e     // Catch:{ all -> 0x005f }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x005f }
            r2.post(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0044
        L_0x005b:
            monitor-exit(r4)
            return
        L_0x005d:
            monitor-exit(r4)
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p198q2.C9181q.m18809n():void");
    }

    /* renamed from: o */
    public static final C9177p m18810o(String str, boolean z) {
        C12775o.m28639i(str, "applicationId");
        if (!z) {
            Map<String, C9177p> map = f13477c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C9181q qVar = f13482h;
        JSONObject i = qVar.m18805i(str);
        if (i == null) {
            return null;
        }
        C9177p l = qVar.mo43468l(str, i);
        if (C12775o.m28634d(str, FacebookSdk.getApplicationId())) {
            f13478d.set(C9182a.SUCCESS);
            qVar.m18809n();
        }
        return l;
    }

    /* renamed from: l */
    public final C9177p mo43468l(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        JSONObject jSONObject2 = jSONObject;
        C12775o.m28639i(str, "applicationId");
        C12775o.m28639i(jSONObject2, "settingsJSON");
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        C9160h.C9161a aVar = C9160h.f13389h;
        C9160h a = aVar.mo43441a(optJSONArray);
        if (a == null) {
            a = aVar.mo43442b();
        }
        C9160h hVar = a;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        if ((optInt & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((optInt & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((optInt & 32) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((optInt & 256) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((optInt & 16384) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f13481g = optJSONArray2;
        if (optJSONArray2 != null && C9191t.m18822b()) {
            if (optJSONArray2 != null) {
                str2 = optJSONArray2.toString();
            } else {
                str2 = null;
            }
            C7453e.m14596c(str2);
        }
        boolean optBoolean = jSONObject2.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject2.optString("gdpv4_nux_content", "");
        String str3 = optString;
        C12775o.m28638h(optString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject2.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject2.optInt("app_events_session_timeout", C8098e.m15936a());
        EnumSet<C9119a0> a2 = C9119a0.f13307h.mo43388a(jSONObject2.optLong("seamless_login"));
        Map<String, Map<String, C9177p.C9179b>> m = m18808m(jSONObject2.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject2.optString("smart_login_bookmark_icon_url");
        C12775o.m28638h(optString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject2.optString("smart_login_menu_icon_url");
        String str4 = optString3;
        C9177p pVar = r3;
        C12775o.m28638h(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject2.optString("sdk_update_message");
        C12775o.m28638h(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C9177p pVar2 = new C9177p(optBoolean, str3, optBoolean2, optInt2, a2, m, z, hVar, optString2, str4, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject2.optString("aam_rules"), jSONObject2.optString("suggested_events_setting"), jSONObject2.optString("restrictive_data_filter_params"));
        C9177p pVar3 = pVar;
        f13477c.put(str, pVar3);
        return pVar3;
    }
}
