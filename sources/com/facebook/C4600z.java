package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C4555l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p033b2.C2867m;
import p198q2.C9114a;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

/* renamed from: com.facebook.z */
/* compiled from: UserSettingsManager.kt */
public final class C4600z {

    /* renamed from: a */
    private static final String f4380a;

    /* renamed from: b */
    private static final AtomicBoolean f4381b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final AtomicBoolean f4382c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final C4601a f4383d = new C4601a(true, FacebookSdk.AUTO_INIT_ENABLED_PROPERTY);

    /* renamed from: e */
    private static final C4601a f4384e = new C4601a(true, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY);

    /* renamed from: f */
    private static final C4601a f4385f = new C4601a(true, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY);

    /* renamed from: g */
    private static final C4601a f4386g = new C4601a(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static final C4601a f4387h = new C4601a(true, FacebookSdk.MONITOR_ENABLED_PROPERTY);

    /* renamed from: i */
    private static SharedPreferences f4388i;

    /* renamed from: j */
    public static final C4600z f4389j = new C4600z();

    /* renamed from: com.facebook.z$a */
    /* compiled from: UserSettingsManager.kt */
    private static final class C4601a {

        /* renamed from: a */
        private Boolean f4390a;

        /* renamed from: b */
        private long f4391b;

        /* renamed from: c */
        private boolean f4392c;

        /* renamed from: d */
        private String f4393d;

        public C4601a(boolean z, String str) {
            C12775o.m28639i(str, "key");
            this.f4392c = z;
            this.f4393d = str;
        }

        /* renamed from: a */
        public final boolean mo31809a() {
            return this.f4392c;
        }

        /* renamed from: b */
        public final String mo31810b() {
            return this.f4393d;
        }

        /* renamed from: c */
        public final long mo31811c() {
            return this.f4391b;
        }

        /* renamed from: d */
        public final Boolean mo31812d() {
            return this.f4390a;
        }

        /* renamed from: e */
        public final boolean mo31813e() {
            Boolean bool = this.f4390a;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.f4392c;
        }

        /* renamed from: f */
        public final void mo31814f(long j) {
            this.f4391b = j;
        }

        /* renamed from: g */
        public final void mo31815g(Boolean bool) {
            this.f4390a = bool;
        }
    }

    /* renamed from: com.facebook.z$b */
    /* compiled from: UserSettingsManager.kt */
    static final class C4602b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f4394b;

        C4602b(long j) {
            this.f4394b = j;
        }

        public final void run() {
            C9177p o;
            String str;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C4600z zVar = C4600z.f4389j;
                        if (C4600z.m5840a(zVar).mo31813e() && (o = C9181q.m18810o(FacebookSdk.getApplicationId(), false)) != null && o.mo43454b()) {
                            C9114a e = C9114a.f13292h.mo43379e(FacebookSdk.getApplicationContext());
                            if (e == null || e.mo43375h() == null) {
                                str = null;
                            } else {
                                str = e.mo43375h();
                            }
                            if (str != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("advertiser_id", str);
                                bundle.putString("fields", "auto_event_setup_enabled");
                                C4555l v = C4555l.f4241t.mo31648v((C4509a) null, FacebookSdk.getApplicationId(), (C4555l.C4557b) null);
                                v.mo31618H(true);
                                v.mo31617G(bundle);
                                JSONObject c = v.mo31620i().mo31710c();
                                if (c != null) {
                                    C4600z.m5841b(zVar).mo31815g(Boolean.valueOf(c.optBoolean("auto_event_setup_enabled", false)));
                                    C4600z.m5841b(zVar).mo31814f(this.f4394b);
                                    C4600z.m5843d(zVar, C4600z.m5841b(zVar));
                                }
                            }
                        }
                        C4600z.m5842c(zVar).set(false);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String name = C4600z.class.getName();
        C12775o.m28638h(name, "UserSettingsManager::class.java.name");
        f4380a = name;
    }

    private C4600z() {
    }

    /* renamed from: a */
    public static final /* synthetic */ C4601a m5840a(C4600z zVar) {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f4385f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C4601a m5841b(C4600z zVar) {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f4386g;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicBoolean m5842c(C4600z zVar) {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f4382c;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m5843d(C4600z zVar, C4601a aVar) {
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                zVar.m5862w(aVar);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: e */
    public static final boolean m5844e() {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f4389j.m5850k();
            return f4385f.mo31813e();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m5845f() {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f4389j.m5850k();
            return f4383d.mo31813e();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m5846g() {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f4389j.m5850k();
            return f4384e.mo31813e();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: h */
    public static final boolean m5847h() {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f4389j.m5850k();
            return f4386g.mo31813e();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: i */
    public static final boolean m5848i() {
        Class<C4600z> cls = C4600z.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            f4389j.m5850k();
            return f4387h.mo31813e();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: j */
    private final void m5849j() {
        if (!C9925a.m20734d(this)) {
            try {
                C4601a aVar = f4386g;
                m5856q(aVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.mo31812d() == null || currentTimeMillis - aVar.mo31811c() >= 604800000) {
                    aVar.mo31815g((Boolean) null);
                    aVar.mo31814f(0);
                    if (f4382c.compareAndSet(false, true)) {
                        FacebookSdk.getExecutor().execute(new C4602b(currentTimeMillis));
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: k */
    private final void m5850k() {
        if (!C9925a.m20734d(this)) {
            try {
                if (FacebookSdk.isInitialized() && f4381b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    C12775o.m28638h(sharedPreferences, "FacebookSdk.getApplicati…GS, Context.MODE_PRIVATE)");
                    f4388i = sharedPreferences;
                    m5851l(f4384e, f4385f, f4383d);
                    m5849j();
                    m5855p();
                    m5854o();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: l */
    private final void m5851l(C4601a... aVarArr) {
        if (!C9925a.m20734d(this)) {
            try {
                for (C4601a aVar : aVarArr) {
                    if (aVar == f4386g) {
                        m5849j();
                    } else if (aVar.mo31812d() == null) {
                        m5856q(aVar);
                        if (aVar.mo31812d() == null) {
                            m5852m(aVar);
                        }
                    } else {
                        m5862w(aVar);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: m */
    private final void m5852m(C4601a aVar) {
        Bundle bundle;
        if (!C9925a.m20734d(this)) {
            try {
                m5861v();
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null) {
                    bundle = applicationInfo.metaData;
                } else {
                    bundle = null;
                }
                if (bundle != null && applicationInfo.metaData.containsKey(aVar.mo31810b())) {
                    aVar.mo31815g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.mo31810b(), aVar.mo31809a())));
                }
            } catch (PackageManager.NameNotFoundException e) {
                C9138d0.m18624Z(f4380a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: n */
    public static final void m5853n() {
        Bundle bundle;
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null) {
                    bundle = applicationInfo.metaData;
                } else {
                    bundle = null;
                }
                if (bundle != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                    C2867m mVar = new C2867m(applicationContext);
                    Bundle bundle2 = new Bundle();
                    if (!C9138d0.m18611M()) {
                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        Log.w(f4380a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    mVar.mo28389d("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: o */
    private final void m5854o() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle;
        int i7;
        if (!C9925a.m20734d(this)) {
            try {
                if (f4381b.get() && FacebookSdk.isInitialized()) {
                    Context applicationContext = FacebookSdk.getApplicationContext();
                    int i8 = 0;
                    if (f4383d.mo31813e()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i9 = (i << 0) | 0;
                    if (f4384e.mo31813e()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int i10 = i9 | (i2 << 1);
                    if (f4385f.mo31813e()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i10 | (i3 << 2);
                    if (f4387h.mo31813e()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i12 = i11 | (i4 << 3);
                    SharedPreferences sharedPreferences = f4388i;
                    if (sharedPreferences == null) {
                        C12775o.m28656z("userSettingPref");
                    }
                    int i13 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i13 != i12) {
                        SharedPreferences sharedPreferences2 = f4388i;
                        if (sharedPreferences2 == null) {
                            C12775o.m28656z("userSettingPref");
                        }
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i12).commit();
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null) {
                                bundle = applicationInfo.metaData;
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                String[] strArr = {FacebookSdk.AUTO_INIT_ENABLED_PROPERTY, FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY, FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY, FacebookSdk.MONITOR_ENABLED_PROPERTY};
                                boolean[] zArr = {true, true, true, true};
                                int i14 = 0;
                                i5 = 0;
                                i6 = 0;
                                while (i14 < 4) {
                                    try {
                                        if (applicationInfo.metaData.containsKey(strArr[i14])) {
                                            i7 = 1;
                                        } else {
                                            i7 = 0;
                                        }
                                        i6 |= i7 << i14;
                                        i5 |= (applicationInfo.metaData.getBoolean(strArr[i14], zArr[i14]) ? 1 : 0) << i14;
                                        i14++;
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        i8 = i5;
                                        i5 = i8;
                                        i8 = i6;
                                        C2867m mVar = new C2867m(applicationContext);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("usage", i8);
                                        bundle2.putInt("initial", i5);
                                        bundle2.putInt("previous", i13);
                                        bundle2.putInt("current", i12);
                                        mVar.mo28387b(bundle2);
                                    }
                                }
                                i8 = i6;
                                C2867m mVar2 = new C2867m(applicationContext);
                                Bundle bundle22 = new Bundle();
                                bundle22.putInt("usage", i8);
                                bundle22.putInt("initial", i5);
                                bundle22.putInt("previous", i13);
                                bundle22.putInt("current", i12);
                                mVar2.mo28387b(bundle22);
                            }
                            i5 = 0;
                            C2867m mVar22 = new C2867m(applicationContext);
                            Bundle bundle222 = new Bundle();
                            bundle222.putInt("usage", i8);
                            bundle222.putInt("initial", i5);
                            bundle222.putInt("previous", i13);
                            bundle222.putInt("current", i12);
                            mVar22.mo28387b(bundle222);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i6 = 0;
                            i5 = i8;
                            i8 = i6;
                            C2867m mVar222 = new C2867m(applicationContext);
                            Bundle bundle2222 = new Bundle();
                            bundle2222.putInt("usage", i8);
                            bundle2222.putInt("initial", i5);
                            bundle2222.putInt("previous", i13);
                            bundle2222.putInt("current", i12);
                            mVar222.mo28387b(bundle2222);
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: p */
    private final void m5855p() {
        Bundle bundle;
        if (!C9925a.m20734d(this)) {
            try {
                Context applicationContext = FacebookSdk.getApplicationContext();
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null) {
                    bundle = applicationInfo.metaData;
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    if (!applicationInfo.metaData.containsKey(FacebookSdk.AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY)) {
                        Log.w(f4380a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!applicationInfo.metaData.containsKey(FacebookSdk.ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY)) {
                        Log.w(f4380a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!m5844e()) {
                        Log.w(f4380a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: q */
    private final void m5856q(C4601a aVar) {
        boolean z;
        String str = "";
        if (!C9925a.m20734d(this)) {
            try {
                m5861v();
                SharedPreferences sharedPreferences = f4388i;
                if (sharedPreferences == null) {
                    C12775o.m28656z("userSettingPref");
                }
                String string = sharedPreferences.getString(aVar.mo31810b(), str);
                if (string != null) {
                    str = string;
                }
                C12775o.m28638h(str, "userSettingPref.getStrin…serSetting.key, \"\") ?: \"\"");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.mo31815g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.mo31814f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e) {
                C9138d0.m18624Z(f4380a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: r */
    public static final void m5857r(boolean z) {
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C4601a aVar = f4385f;
                aVar.mo31815g(Boolean.valueOf(z));
                aVar.mo31814f(System.currentTimeMillis());
                if (f4381b.get()) {
                    f4389j.m5862w(aVar);
                } else {
                    f4389j.m5850k();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: s */
    public static final void m5858s(boolean z) {
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C4601a aVar = f4383d;
                aVar.mo31815g(Boolean.valueOf(z));
                aVar.mo31814f(System.currentTimeMillis());
                if (f4381b.get()) {
                    f4389j.m5862w(aVar);
                } else {
                    f4389j.m5850k();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: t */
    public static final void m5859t(boolean z) {
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C4601a aVar = f4384e;
                aVar.mo31815g(Boolean.valueOf(z));
                aVar.mo31814f(System.currentTimeMillis());
                if (f4381b.get()) {
                    f4389j.m5862w(aVar);
                } else {
                    f4389j.m5850k();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: u */
    public static final void m5860u(boolean z) {
        Class<C4600z> cls = C4600z.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C4601a aVar = f4387h;
                aVar.mo31815g(Boolean.valueOf(z));
                aVar.mo31814f(System.currentTimeMillis());
                if (f4381b.get()) {
                    f4389j.m5862w(aVar);
                } else {
                    f4389j.m5850k();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: v */
    private final void m5861v() {
        if (!C9925a.m20734d(this)) {
            try {
                if (!f4381b.get()) {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: w */
    private final void m5862w(C4601a aVar) {
        if (!C9925a.m20734d(this)) {
            try {
                m5861v();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.mo31812d());
                jSONObject.put("last_timestamp", aVar.mo31811c());
                SharedPreferences sharedPreferences = f4388i;
                if (sharedPreferences == null) {
                    C12775o.m28656z("userSettingPref");
                }
                sharedPreferences.edit().putString(aVar.mo31810b(), jSONObject.toString()).commit();
                m5854o();
            } catch (Exception e) {
                C9138d0.m18624Z(f4380a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
