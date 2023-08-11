package p033b2;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.C4509a;
import com.facebook.C4579r;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import p033b2.C2849g;
import p118i2.C8086a;
import p138k2.C8508a;
import p198q2.C9138d0;
import p198q2.C9144e0;
import p198q2.C9166l;
import p198q2.C9173o;
import p198q2.C9181q;
import p198q2.C9188s;
import p198q2.C9194v;
import p251v2.C9925a;
import p336ef.C11921v;

/* renamed from: b2.h */
/* compiled from: AppEventsLoggerImpl.kt */
public final class C2852h {

    /* renamed from: c */
    private static final String f1219c;

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f1220d;

    /* renamed from: e */
    private static C2849g.C2851b f1221e = C2849g.C2851b.AUTO;

    /* renamed from: f */
    private static final Object f1222f = new Object();

    /* renamed from: g */
    private static String f1223g;

    /* renamed from: h */
    private static boolean f1224h;

    /* renamed from: i */
    private static String f1225i;

    /* renamed from: j */
    public static final C2853a f1226j = new C2853a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f1227a;

    /* renamed from: b */
    private C2828a f1228b;

    /* renamed from: b2.h$a */
    /* compiled from: AppEventsLoggerImpl.kt */
    public static final class C2853a {

        /* renamed from: b2.h$a$a */
        /* compiled from: AppEventsLoggerImpl.kt */
        public static final class C2854a implements C9188s.C9189a {
            C2854a() {
            }

            /* renamed from: a */
            public void mo28376a(String str) {
                C2852h.f1226j.mo28375p(str);
            }
        }

        /* renamed from: b2.h$a$b */
        /* compiled from: AppEventsLoggerImpl.kt */
        static final class C2855b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Context f1229b;

            /* renamed from: c */
            final /* synthetic */ C2852h f1230c;

            C2855b(Context context, C2852h hVar) {
                this.f1229b = context;
                this.f1230c = hVar;
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            Bundle bundle = new Bundle();
                            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                            int i = 0;
                            for (int i2 = 0; i2 < 11; i2++) {
                                String str = strArr[i2];
                                String str2 = strArr2[i2];
                                try {
                                    Class.forName(str);
                                    bundle.putInt(str2, 1);
                                    i |= 1 << i2;
                                } catch (ClassNotFoundException unused) {
                                }
                            }
                            SharedPreferences sharedPreferences = this.f1229b.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                                this.f1230c.mo28362o("fb_sdk_initialize", (Double) null, bundle);
                            }
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        /* renamed from: b2.h$a$c */
        /* compiled from: AppEventsLoggerImpl.kt */
        static final class C2856c implements Runnable {

            /* renamed from: b */
            public static final C2856c f1231b = new C2856c();

            C2856c() {
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            HashSet<String> hashSet = new HashSet<>();
                            for (C2828a b : C2839e.m2184m()) {
                                hashSet.add(b.mo28327b());
                            }
                            for (String o : hashSet) {
                                C9181q.m18810o(o, true);
                            }
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        private C2853a() {
        }

        public /* synthetic */ C2853a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r3 = p033b2.C2852h.C2853a.C2856c.f1231b;
            r2 = p033b2.C2852h.m2203b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            if (r2 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            r2.scheduleAtFixedRate(r3, 0, (long) 86400, java.util.concurrent.TimeUnit.SECONDS);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m2223l() {
            /*
                r9 = this;
                java.lang.Object r0 = p033b2.C2852h.m2206e()
                monitor-enter(r0)
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = p033b2.C2852h.m2203b()     // Catch:{ all -> 0x0039 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)
                return
            L_0x000d:
                java.util.concurrent.ScheduledThreadPoolExecutor r1 = new java.util.concurrent.ScheduledThreadPoolExecutor     // Catch:{ all -> 0x0039 }
                r2 = 1
                r1.<init>(r2)     // Catch:{ all -> 0x0039 }
                p033b2.C2852h.m2210i(r1)     // Catch:{ all -> 0x0039 }
                ef.v r1 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)
                b2.h$a$c r3 = p033b2.C2852h.C2853a.C2856c.f1231b
                java.util.concurrent.ScheduledThreadPoolExecutor r2 = p033b2.C2852h.m2203b()
                if (r2 == 0) goto L_0x002d
                r4 = 0
                r0 = 86400(0x15180, float:1.21072E-40)
                long r6 = (long) r0
                java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
                r2.scheduleAtFixedRate(r3, r4, r6, r8)
                return
            L_0x002d:
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p033b2.C2852h.C2853a.m2223l():void");
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m2224m(C2834c cVar, C2828a aVar) {
            C2839e.m2179h(aVar, cVar);
            if (C9166l.m18760g(C9166l.C9168b.OnDevicePostInstallEventProcessing) && C8508a.m17054b()) {
                C8508a.m17055c(aVar.mo28327b(), cVar);
            }
            if (!cVar.mo28331c() && !C2852h.m2207f()) {
                if (C12775o.m28634d(cVar.mo28333f(), "fb_mobile_activate_app")) {
                    C2852h.m2208g(true);
                } else {
                    C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m2225n(String str) {
            C9194v.f13504f.mo43482c(C4579r.DEVELOPER_ERRORS, "AppEvents", str);
        }

        /* renamed from: d */
        public final void mo28366d(Application application, String str) {
            C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
            if (FacebookSdk.isInitialized()) {
                C2832b.m2152d();
                C2875p.m2278g();
                if (str == null) {
                    str = FacebookSdk.getApplicationId();
                }
                FacebookSdk.publishInstallAsync(application, str);
                C8086a.m15917x(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }

        /* renamed from: e */
        public final void mo28367e() {
            if (mo28370h() != C2849g.C2851b.EXPLICIT_ONLY) {
                C2839e.m2182k(C2864j.EAGER_FLUSHING_EVENT);
            }
        }

        /* renamed from: f */
        public final Executor mo28368f() {
            if (C2852h.m2203b() == null) {
                m2223l();
            }
            ScheduledThreadPoolExecutor b = C2852h.m2203b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: g */
        public final String mo28369g(Context context) {
            C12775o.m28639i(context, "context");
            if (C2852h.m2202a() == null) {
                synchronized (C2852h.m2206e()) {
                    if (C2852h.m2202a() == null) {
                        C2852h.m2209h(context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getString("anonymousAppDeviceGUID", (String) null));
                        if (C2852h.m2202a() == null) {
                            C2852h.m2209h("XZ" + UUID.randomUUID().toString());
                            context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putString("anonymousAppDeviceGUID", C2852h.m2202a()).apply();
                        }
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
            String a = C2852h.m2202a();
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: h */
        public final C2849g.C2851b mo28370h() {
            C2849g.C2851b c;
            synchronized (C2852h.m2206e()) {
                c = C2852h.m2204c();
            }
            return c;
        }

        /* renamed from: i */
        public final String mo28371i() {
            C9188s.m18818d(new C2854a());
            return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getString(Constants.INSTALL_REFERRER, (String) null);
        }

        /* renamed from: j */
        public final String mo28372j() {
            String d;
            synchronized (C2852h.m2206e()) {
                d = C2852h.m2205d();
            }
            return d;
        }

        /* renamed from: k */
        public final void mo28373k(Context context, String str) {
            C12775o.m28639i(context, "context");
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                C2852h hVar = new C2852h(context, str, (C4509a) null);
                ScheduledThreadPoolExecutor b = C2852h.m2203b();
                if (b != null) {
                    b.execute(new C2855b(context, hVar));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }

        /* renamed from: o */
        public final void mo28374o() {
            C2839e.m2186o();
        }

        /* renamed from: p */
        public final void mo28375p(String str) {
            SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
            if (str != null) {
                sharedPreferences.edit().putString(Constants.INSTALL_REFERRER, str).apply();
            }
        }
    }

    static {
        String canonicalName = C2852h.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        C12775o.m28638h(canonicalName, "AppEventsLoggerImpl::cla…ents.AppEventsLoggerImpl\"");
        f1219c = canonicalName;
    }

    public C2852h(String str, String str2, C4509a aVar) {
        C12775o.m28639i(str, "activityName");
        C9144e0.m18693l();
        this.f1227a = str;
        aVar = aVar == null ? C4509a.f4119q.mo31515e() : aVar;
        if (aVar == null || aVar.mo31502q() || (str2 != null && !C12775o.m28634d(str2, aVar.mo31488c()))) {
            str2 = str2 == null ? C9138d0.m18600B(FacebookSdk.getApplicationContext()) : str2;
            if (str2 != null) {
                this.f1228b = new C2828a((String) null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            this.f1228b = new C2828a(aVar);
        }
        f1226j.m2223l();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m2202a() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1223g;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m2203b() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1220d;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C2849g.C2851b m2204c() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1221e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m2205d() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1225i;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m2206e() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1222f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m2207f() {
        Class<C2852h> cls = C2852h.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            return f1224h;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m2208g(boolean z) {
        Class<C2852h> cls = C2852h.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1224h = z;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m2209h(String str) {
        Class<C2852h> cls = C2852h.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1223g = str;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m2210i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        Class<C2852h> cls = C2852h.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1220d = scheduledThreadPoolExecutor;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: j */
    public final void mo28357j() {
        if (!C9925a.m20734d(this)) {
            try {
                C2839e.m2182k(C2864j.EXPLICIT);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: k */
    public final void mo28358k(String str, double d, Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            try {
                mo28360m(str, Double.valueOf(d), bundle, false, C8086a.m15910q());
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: l */
    public final void mo28359l(String str, Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            try {
                mo28360m(str, (Double) null, bundle, false, C8086a.m15910q());
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: m */
    public final void mo28360m(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        boolean z2;
        if (!C9925a.m20734d(this) && str != null) {
            try {
                if (str.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (C9173o.m18772f("app_events_killswitch", FacebookSdk.getApplicationId(), false)) {
                        C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    f1226j.m2224m(new C2834c(this.f1227a, str, d, bundle, z, C8086a.m15912s(), uuid), this.f1228b);
                }
            } catch (JSONException e) {
                C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
            } catch (FacebookException e2) {
                C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: n */
    public final void mo28361n(String str, String str2) {
        if (!C9925a.m20734d(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                mo28359l(str, bundle);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: o */
    public final void mo28362o(String str, Double d, Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            try {
                mo28360m(str, d, bundle, true, C8086a.m15910q());
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: p */
    public final void mo28363p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            if (bigDecimal == null || currency == null) {
                C9138d0.m18626a0(f1219c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                    return;
                }
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            mo28360m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C8086a.m15910q());
        }
    }

    /* renamed from: q */
    public final void mo28364q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!C9925a.m20734d(this)) {
            if (bigDecimal == null) {
                try {
                    f1226j.m2225n("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            } else if (currency == null) {
                f1226j.m2225n("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                mo28360m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C8086a.m15910q());
                f1226j.mo28367e();
            }
        }
    }

    /* renamed from: r */
    public final void mo28365r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (!C9925a.m20734d(this)) {
            try {
                mo28364q(bigDecimal, currency, bundle, true);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public C2852h(Context context, String str, C4509a aVar) {
        this(C9138d0.m18657q(context), str, aVar);
    }
}
