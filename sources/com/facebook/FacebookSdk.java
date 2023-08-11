package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C4555l;
import com.facebook.C4580s;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033b2.C2849g;
import p033b2.C2857i;
import p118i2.C8086a;
import p118i2.C8094c;
import p138k2.C8508a;
import p198q2.C9114a;
import p198q2.C9138d0;
import p198q2.C9144e0;
import p198q2.C9166l;
import p198q2.C9192u;
import p198q2.C9212z;
import p218s2.C9455e;
import p251v2.C9925a;
import p336ef.C11921v;

/* compiled from: FacebookSdk.kt */
public final class FacebookSdk {
    public static final String ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    public static final String AUTO_INIT_ENABLED_PROPERTY = "com.facebook.sdk.AutoInitEnabled";
    public static final String AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY = "com.facebook.sdk.AutoLogAppEventsEnabled";
    public static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized. Call FacebookSdk.setCallbackRequestCodeOffset inside your Application.onCreate method";
    public static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CALLBACK_OFFSET_PROPERTY = "com.facebook.sdk.CallbackOffset";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    public static final String CODELESS_DEBUG_LOG_ENABLED_PROPERTY = "com.facebook.sdk.CodelessDebugLogEnabled";
    public static final String DATA_PROCESSING_OPTIONS_PREFERENCES = "com.facebook.sdk.DataProcessingOptions";
    public static final String DATA_PROCESSION_OPTIONS = "data_processing_options";
    public static final String DATA_PROCESSION_OPTIONS_COUNTRY = "data_processing_options_country";
    public static final String DATA_PROCESSION_OPTIONS_STATE = "data_processing_options_state";
    private static final int DEFAULT_CALLBACK_REQUEST_CODE_OFFSET = 64206;
    public static final String FACEBOOK_COM = "facebook.com";
    public static final String FB_GG = "fb.gg";
    public static final String GAMING = "gaming";
    public static final String INSTAGRAM = "instagram";
    public static final String INSTAGRAM_COM = "instagram.com";
    public static final FacebookSdk INSTANCE = new FacebookSdk();
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    public static final String MONITOR_ENABLED_PROPERTY = "com.facebook.sdk.MonitorEnabled";
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static final String TAG = FacebookSdk.class.getCanonicalName();
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    /* access modifiers changed from: private */
    public static Context applicationContext;
    /* access modifiers changed from: private */
    public static volatile String applicationId;
    private static volatile String applicationName;
    public static boolean bypassAppSwitch;
    private static C9192u<File> cacheDir;
    private static int callbackRequestCodeOffset = DEFAULT_CALLBACK_REQUEST_CODE_OFFSET;
    private static volatile Boolean codelessDebugLogEnabled;
    private static Executor executor;
    private static volatile String facebookDomain = FACEBOOK_COM;
    private static String graphApiVersion = C9212z.m18908a();
    private static C4496a graphRequestCreator = C4498c.f4103a;
    public static boolean hasCustomTabsPrefetching;
    public static boolean ignoreAppSwitchToLoggedOut;
    private static volatile String instagramDomain = INSTAGRAM_COM;
    private static volatile boolean isDebugEnabledField;
    private static boolean isFullyInitialized;
    private static boolean isLegacyTokenUpgradeSupported;
    private static final HashSet<C4579r> loggingBehaviors = C12731y0.m28552f(C4579r.DEVELOPER_ERRORS);
    private static AtomicLong onProgressThreshold = new AtomicLong(65536);
    private static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    @VisibleForTesting
    /* renamed from: com.facebook.FacebookSdk$a */
    /* compiled from: FacebookSdk.kt */
    public interface C4496a {
        /* renamed from: a */
        C4555l mo31480a(C4509a aVar, String str, JSONObject jSONObject, C4555l.C4557b bVar);
    }

    /* renamed from: com.facebook.FacebookSdk$b */
    /* compiled from: FacebookSdk.kt */
    public interface C4497b {
        /* renamed from: a */
        void mo31481a();
    }

    /* renamed from: com.facebook.FacebookSdk$c */
    /* compiled from: FacebookSdk.kt */
    static final class C4498c implements C4496a {

        /* renamed from: a */
        public static final C4498c f4103a = new C4498c();

        C4498c() {
        }

        /* renamed from: a */
        public final C4555l mo31480a(C4509a aVar, String str, JSONObject jSONObject, C4555l.C4557b bVar) {
            return C4555l.f4241t.mo31649w(aVar, str, jSONObject, bVar);
        }
    }

    /* renamed from: com.facebook.FacebookSdk$d */
    /* compiled from: FacebookSdk.kt */
    static final class C4499d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Context f4104b;

        /* renamed from: c */
        final /* synthetic */ String f4105c;

        C4499d(Context context, String str) {
            this.f4104b = context;
            this.f4105c = str;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        Context context = this.f4104b;
                        C12775o.m28638h(context, "applicationContext");
                        facebookSdk.publishInstallAndWaitForResponse(context, this.f4105c);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$e */
    /* compiled from: FacebookSdk.kt */
    static final class C4500e<V> implements Callable {

        /* renamed from: b */
        public static final C4500e f4106b = new C4500e();

        C4500e() {
        }

        /* renamed from: a */
        public final File call() {
            return FacebookSdk.access$getApplicationContext$p(FacebookSdk.INSTANCE).getCacheDir();
        }
    }

    /* renamed from: com.facebook.FacebookSdk$f */
    /* compiled from: FacebookSdk.kt */
    static final class C4501f implements C9166l.C9167a {

        /* renamed from: a */
        public static final C4501f f4107a = new C4501f();

        C4501f() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C9455e.m19573a();
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$g */
    /* compiled from: FacebookSdk.kt */
    static final class C4502g implements C9166l.C9167a {

        /* renamed from: a */
        public static final C4502g f4108a = new C4502g();

        C4502g() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C2857i.m2237a();
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$h */
    /* compiled from: FacebookSdk.kt */
    static final class C4503h implements C9166l.C9167a {

        /* renamed from: a */
        public static final C4503h f4109a = new C4503h();

        C4503h() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                FacebookSdk.hasCustomTabsPrefetching = true;
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$i */
    /* compiled from: FacebookSdk.kt */
    static final class C4504i implements C9166l.C9167a {

        /* renamed from: a */
        public static final C4504i f4110a = new C4504i();

        C4504i() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                FacebookSdk.ignoreAppSwitchToLoggedOut = true;
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$j */
    /* compiled from: FacebookSdk.kt */
    static final class C4505j implements C9166l.C9167a {

        /* renamed from: a */
        public static final C4505j f4111a = new C4505j();

        C4505j() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                FacebookSdk.bypassAppSwitch = true;
            }
        }
    }

    /* renamed from: com.facebook.FacebookSdk$k */
    /* compiled from: FacebookSdk.kt */
    static final class C4506k<V> implements Callable {
        C4506k(C4497b bVar) {
        }

        /* renamed from: a */
        public final Void call() {
            C4527d.f4139g.mo31543e().mo31540h();
            C4592u.f4353e.mo31790a().mo31788d();
            if (C4509a.f4119q.mo31517g()) {
                C4580s.C4582b bVar = C4580s.f4310j;
                if (bVar.mo31736b() == null) {
                    bVar.mo31735a();
                }
            }
            C2849g.C2850a aVar = C2849g.f1214c;
            aVar.mo28354e(FacebookSdk.getApplicationContext(), FacebookSdk.applicationId);
            C4600z.m5853n();
            Context applicationContext = FacebookSdk.getApplicationContext().getApplicationContext();
            C12775o.m28638h(applicationContext, "getApplicationContext().applicationContext");
            aVar.mo28355f(applicationContext).mo28348a();
            return null;
        }
    }

    private FacebookSdk() {
    }

    public static final /* synthetic */ Context access$getApplicationContext$p(FacebookSdk facebookSdk) {
        Context context = applicationContext;
        if (context == null) {
            C12775o.m28656z("applicationContext");
        }
        return context;
    }

    public static final void addLoggingBehavior(C4579r rVar) {
        C12775o.m28639i(rVar, "behavior");
        HashSet<C4579r> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.add(rVar);
            INSTANCE.updateGraphDebugBehavior();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public static final void clearLoggingBehaviors() {
        HashSet<C4579r> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.clear();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public static final void fullyInitialize() {
        isFullyInitialized = true;
    }

    public static final boolean getAdvertiserIDCollectionEnabled() {
        return C4600z.m5844e();
    }

    public static final Context getApplicationContext() {
        C9144e0.m18693l();
        Context context = applicationContext;
        if (context == null) {
            C12775o.m28656z("applicationContext");
        }
        return context;
    }

    public static final String getApplicationId() {
        C9144e0.m18693l();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String getApplicationName() {
        C9144e0.m18693l();
        return applicationName;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getApplicationSignature(android.content.Context r4) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            p198q2.C9144e0.m18693l()     // Catch:{ all -> 0x004b }
            if (r4 != 0) goto L_0x0010
            return r2
        L_0x0010:
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x004b }
            r3 = 64
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x004a }
            android.content.pm.Signature[] r1 = r4.signatures     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            int r1 = r1.length     // Catch:{ all -> 0x004b }
            r3 = 0
            if (r1 != 0) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = r3
        L_0x002b:
            if (r1 == 0) goto L_0x002e
            goto L_0x004a
        L_0x002e:
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{  }
            android.content.pm.Signature[] r4 = r4.signatures     // Catch:{ all -> 0x004b }
            r4 = r4[r3]     // Catch:{ all -> 0x004b }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x004b }
            r1.update(r4)     // Catch:{ all -> 0x004b }
            byte[] r4 = r1.digest()     // Catch:{ all -> 0x004b }
            r1 = 9
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r1)     // Catch:{ all -> 0x004b }
            return r4
        L_0x004a:
            return r2
        L_0x004b:
            r4 = move-exception
            p251v2.C9925a.m20732b(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.getApplicationSignature(android.content.Context):java.lang.String");
    }

    public static final boolean getAutoInitEnabled() {
        return C4600z.m5845f();
    }

    public static final boolean getAutoLogAppEventsEnabled() {
        return C4600z.m5846g();
    }

    public static final File getCacheDir() {
        C9144e0.m18693l();
        C9192u<File> uVar = cacheDir;
        if (uVar == null) {
            C12775o.m28656z("cacheDir");
        }
        return uVar.mo43472c();
    }

    public static final int getCallbackRequestCodeOffset() {
        C9144e0.m18693l();
        return callbackRequestCodeOffset;
    }

    public static final String getClientToken() {
        C9144e0.m18693l();
        return appClientToken;
    }

    public static final boolean getCodelessDebugLogEnabled() {
        C9144e0.m18693l();
        Boolean bool = codelessDebugLogEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean getCodelessSetupEnabled() {
        return C4600z.m5847h();
    }

    /* JADX INFO: finally extract failed */
    public static final Executor getExecutor() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String getFacebookDomain() {
        return facebookDomain;
    }

    public static final String getGraphApiVersion() {
        String str = TAG;
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        C9138d0.m18626a0(str, format);
        return graphApiVersion;
    }

    public static final String getGraphDomain() {
        String str;
        C4509a e = C4509a.f4119q.mo31515e();
        if (e != null) {
            str = e.mo31496i();
        } else {
            str = null;
        }
        return C9138d0.m18673y(str);
    }

    public static final String getInstagramDomain() {
        return instagramDomain;
    }

    public static final boolean getLimitEventAndDataUsage(Context context) {
        C12775o.m28639i(context, "context");
        C9144e0.m18693l();
        return context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).getBoolean("limitEventUsage", false);
    }

    public static final Set<C4579r> getLoggingBehaviors() {
        Set<C4579r> unmodifiableSet;
        HashSet<C4579r> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(hashSet));
            C12775o.m28638h(unmodifiableSet, "Collections.unmodifiable…ashSet(loggingBehaviors))");
        }
        return unmodifiableSet;
    }

    public static final boolean getMonitorEnabled() {
        return C4600z.m5848i();
    }

    public static final long getOnProgressThreshold() {
        C9144e0.m18693l();
        return onProgressThreshold.get();
    }

    public static final String getSdkVersion() {
        return "11.3.0";
    }

    public static final boolean isDebugEnabled() {
        return isDebugEnabledField;
    }

    public static final boolean isFacebookRequestCode(int i) {
        int i2 = callbackRequestCodeOffset;
        if (i < i2 || i >= i2 + 100) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final synchronized boolean isFullyInitialized() {
        boolean z;
        synchronized (FacebookSdk.class) {
            z = isFullyInitialized;
        }
        return z;
    }

    public static final boolean isInitialized() {
        return sdkInitialized.get();
    }

    public static final boolean isLegacyTokenUpgradeSupported() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean isLoggingBehaviorEnabled(C4579r rVar) {
        boolean z;
        C12775o.m28639i(rVar, "behavior");
        HashSet<C4579r> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            if (!isDebugEnabled() || !hashSet.contains(rVar)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public static final void loadDefaultsFromMetadata$facebook_core_release(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (applicationId == null) {
                        Object obj = applicationInfo.metaData.get(APPLICATION_ID_PROPERTY);
                        if (obj instanceof String) {
                            String str = (String) obj;
                            Locale locale = Locale.ROOT;
                            C12775o.m28638h(locale, "Locale.ROOT");
                            String lowerCase = str.toLowerCase(locale);
                            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (C13754v.m31525E(lowerCase, "fb", false, 2, (Object) null)) {
                                String substring = str.substring(2);
                                C12775o.m28638h(substring, "(this as java.lang.String).substring(startIndex)");
                                applicationId = substring;
                            } else {
                                applicationId = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (applicationName == null) {
                        applicationName = applicationInfo.metaData.getString(APPLICATION_NAME_PROPERTY);
                    }
                    if (appClientToken == null) {
                        appClientToken = applicationInfo.metaData.getString(CLIENT_TOKEN_PROPERTY);
                    }
                    if (callbackRequestCodeOffset == DEFAULT_CALLBACK_REQUEST_CODE_OFFSET) {
                        callbackRequestCodeOffset = applicationInfo.metaData.getInt(CALLBACK_OFFSET_PROPERTY, DEFAULT_CALLBACK_REQUEST_CODE_OFFSET);
                    }
                    if (codelessDebugLogEnabled == null) {
                        codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean(CODELESS_DEBUG_LOG_ENABLED_PROPERTY, false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public final void publishInstallAndWaitForResponse(Context context, String str) {
        if (!C9925a.m20734d(this)) {
            try {
                C9114a e = C9114a.f13292h.mo43379e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(ATTRIBUTION_PREFERENCES, 0);
                String str2 = str + "ping";
                long j = sharedPreferences.getLong(str2, 0);
                JSONObject a = C8094c.m15926a(C8094c.C8095a.MOBILE_INSTALL_EVENT, e, C2849g.f1214c.mo28351b(context), getLimitEventAndDataUsage(context), context);
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(PUBLISH_ACTIVITY_PATH, Arrays.copyOf(new Object[]{str}, 1));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                C4555l a2 = graphRequestCreator.mo31480a((C4509a) null, format, a, (C4555l.C4557b) null);
                if (j == 0 && a2.mo31620i().mo31709b() == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (JSONException e2) {
                throw new FacebookException("An error occurred while publishing install.", e2);
            } catch (Exception e3) {
                try {
                    C9138d0.m18624Z("Facebook-publish", e3);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public static final void publishInstallAsync(Context context, String str) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(context, "context");
                C12775o.m28639i(str, "applicationId");
                getExecutor().execute(new C4499d(context.getApplicationContext(), str));
                if (C9166l.m18760g(C9166l.C9168b.OnDeviceEventProcessing) && C8508a.m17054b()) {
                    C8508a.m17056d(str, ATTRIBUTION_PREFERENCES);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    public static final void removeLoggingBehavior(C4579r rVar) {
        C12775o.m28639i(rVar, "behavior");
        HashSet<C4579r> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            hashSet.remove(rVar);
        }
    }

    public static final synchronized void sdkInitialize(Context context, int i) {
        synchronized (FacebookSdk.class) {
            C12775o.m28639i(context, "applicationContext");
            sdkInitialize(context, i, (C4497b) null);
        }
    }

    public static final void setAdvertiserIDCollectionEnabled(boolean z) {
        C4600z.m5857r(z);
    }

    public static final void setApplicationId(String str) {
        C12775o.m28639i(str, "applicationId");
        C9144e0.m18688g(str, "applicationId");
        applicationId = str;
    }

    public static final void setApplicationName(String str) {
        applicationName = str;
    }

    public static final void setAutoInitEnabled(boolean z) {
        C4600z.m5858s(z);
        if (z) {
            fullyInitialize();
        }
    }

    public static final void setAutoLogAppEventsEnabled(boolean z) {
        C4600z.m5859t(z);
        if (z) {
            Context applicationContext2 = getApplicationContext();
            if (applicationContext2 != null) {
                C8086a.m15917x((Application) applicationContext2, getApplicationId());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
    }

    public static final void setCacheDir(File file) {
        C12775o.m28639i(file, "cacheDir");
        cacheDir = new C9192u<>(file);
    }

    public static final void setClientToken(String str) {
        appClientToken = str;
    }

    public static final void setCodelessDebugLogEnabled(boolean z) {
        codelessDebugLogEnabled = Boolean.valueOf(z);
    }

    public static final void setDataProcessingOptions(String[] strArr) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!C9925a.m20734d(cls)) {
            try {
                setDataProcessingOptions(strArr, 0, 0);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    public static final void setExecutor(Executor executor2) {
        C12775o.m28639i(executor2, "executor");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            executor = executor2;
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setFacebookDomain(String str) {
        C12775o.m28639i(str, "facebookDomain");
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = str;
    }

    public static final void setGraphApiVersion(String str) {
        C12775o.m28639i(str, "graphApiVersion");
        Log.w(TAG, "WARNING: Calling setGraphApiVersion from non-DEBUG code.");
        if (!C9138d0.m18618T(str) && (!C12775o.m28634d(graphApiVersion, str))) {
            graphApiVersion = str;
        }
    }

    @VisibleForTesting
    public static final void setGraphRequestCreator$facebook_core_release(C4496a aVar) {
        C12775o.m28639i(aVar, "graphRequestCreator");
        graphRequestCreator = aVar;
    }

    public static final void setIsDebugEnabled(boolean z) {
        isDebugEnabledField = z;
    }

    public static final void setLegacyTokenUpgradeSupported(boolean z) {
        isLegacyTokenUpgradeSupported = z;
    }

    public static final void setLimitEventAndDataUsage(Context context, boolean z) {
        C12775o.m28639i(context, "context");
        context.getSharedPreferences(APP_EVENT_PREFERENCES, 0).edit().putBoolean("limitEventUsage", z).apply();
    }

    public static final void setMonitorEnabled(boolean z) {
        C4600z.m5860u(z);
    }

    public static final void setOnProgressThreshold(long j) {
        onProgressThreshold.set(j);
    }

    private final void updateGraphDebugBehavior() {
        HashSet<C4579r> hashSet = loggingBehaviors;
        if (hashSet.contains(C4579r.GRAPH_API_DEBUG_INFO)) {
            C4579r rVar = C4579r.GRAPH_API_DEBUG_WARNING;
            if (!hashSet.contains(rVar)) {
                hashSet.add(rVar);
            }
        }
    }

    public static final synchronized void sdkInitialize(Context context, int i, C4497b bVar) {
        synchronized (FacebookSdk.class) {
            C12775o.m28639i(context, "applicationContext");
            if (sdkInitialized.get()) {
                if (i != callbackRequestCodeOffset) {
                    throw new FacebookException(CALLBACK_OFFSET_CHANGED_AFTER_INIT);
                }
            }
            if (i >= 0) {
                callbackRequestCodeOffset = i;
                sdkInitialize(context, bVar);
            } else {
                throw new FacebookException(CALLBACK_OFFSET_NEGATIVE);
            }
        }
    }

    public static final void setDataProcessingOptions(String[] strArr, int i, int i2) {
        Class<FacebookSdk> cls = FacebookSdk.class;
        if (!C9925a.m20734d(cls)) {
            if (strArr == null) {
                try {
                    strArr = new String[0];
                } catch (Throwable th) {
                    C9925a.m20732b(th, cls);
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DATA_PROCESSION_OPTIONS, new JSONArray(C12710p.m28405g0(strArr)));
                jSONObject.put(DATA_PROCESSION_OPTIONS_COUNTRY, i);
                jSONObject.put(DATA_PROCESSION_OPTIONS_STATE, i2);
                Context context = applicationContext;
                if (context == null) {
                    C12775o.m28656z("applicationContext");
                }
                context.getSharedPreferences(DATA_PROCESSING_OPTIONS_PREFERENCES, 0).edit().putString(DATA_PROCESSION_OPTIONS, jSONObject.toString()).apply();
            } catch (JSONException unused) {
            }
        }
    }

    public static final synchronized void sdkInitialize(Context context) {
        synchronized (FacebookSdk.class) {
            C12775o.m28639i(context, "applicationContext");
            sdkInitialize(context, (C4497b) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void sdkInitialize(android.content.Context r4, com.facebook.FacebookSdk.C4497b r5) {
        /*
            java.lang.Class<com.facebook.FacebookSdk> r0 = com.facebook.FacebookSdk.class
            monitor-enter(r0)
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28639i(r4, r1)     // Catch:{ all -> 0x00d8 }
            java.util.concurrent.atomic.AtomicBoolean r1 = sdkInitialized     // Catch:{ all -> 0x00d8 }
            boolean r2 = r1.get()     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x0017
            if (r5 == 0) goto L_0x0015
            r5.mo31481a()     // Catch:{ all -> 0x00d8 }
        L_0x0015:
            monitor-exit(r0)
            return
        L_0x0017:
            r2 = 0
            p198q2.C9144e0.m18686e(r4, r2)     // Catch:{ all -> 0x00d8 }
            p198q2.C9144e0.m18687f(r4, r2)     // Catch:{ all -> 0x00d8 }
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "applicationContext.applicationContext"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)     // Catch:{ all -> 0x00d8 }
            applicationContext = r2     // Catch:{ all -> 0x00d8 }
            b2.g$a r2 = p033b2.C2849g.f1214c     // Catch:{ all -> 0x00d8 }
            r2.mo28351b(r4)     // Catch:{ all -> 0x00d8 }
            android.content.Context r4 = applicationContext     // Catch:{ all -> 0x00d8 }
            if (r4 != 0) goto L_0x0037
            java.lang.String r2 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28656z(r2)     // Catch:{ all -> 0x00d8 }
        L_0x0037:
            loadDefaultsFromMetadata$facebook_core_release(r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = applicationId     // Catch:{ all -> 0x00d8 }
            boolean r4 = p198q2.C9138d0.m18618T(r4)     // Catch:{ all -> 0x00d8 }
            if (r4 != 0) goto L_0x00d0
            r4 = 1
            r1.set(r4)     // Catch:{ all -> 0x00d8 }
            boolean r4 = getAutoInitEnabled()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x004f
            fullyInitialize()     // Catch:{ all -> 0x00d8 }
        L_0x004f:
            android.content.Context r4 = applicationContext     // Catch:{ all -> 0x00d8 }
            if (r4 != 0) goto L_0x0058
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28656z(r1)     // Catch:{ all -> 0x00d8 }
        L_0x0058:
            boolean r4 = r4 instanceof android.app.Application     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x007d
            boolean r4 = com.facebook.C4600z.m5846g()     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x007d
            android.content.Context r4 = applicationContext     // Catch:{ all -> 0x00d8 }
            if (r4 != 0) goto L_0x006b
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28656z(r1)     // Catch:{ all -> 0x00d8 }
        L_0x006b:
            if (r4 == 0) goto L_0x0075
            android.app.Application r4 = (android.app.Application) r4     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = applicationId     // Catch:{ all -> 0x00d8 }
            p118i2.C8086a.m15917x(r4, r1)     // Catch:{ all -> 0x00d8 }
            goto L_0x007d
        L_0x0075:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "null cannot be cast to non-null type android.app.Application"
            r4.<init>(r5)     // Catch:{ all -> 0x00d8 }
            throw r4     // Catch:{ all -> 0x00d8 }
        L_0x007d:
            p198q2.C9181q.m18807k()     // Catch:{ all -> 0x00d8 }
            p198q2.C9196w.m18869z()     // Catch:{ all -> 0x00d8 }
            q2.b$a r4 = p198q2.C9121b.f13311d     // Catch:{ all -> 0x00d8 }
            android.content.Context r1 = applicationContext     // Catch:{ all -> 0x00d8 }
            if (r1 != 0) goto L_0x008e
            java.lang.String r2 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28656z(r2)     // Catch:{ all -> 0x00d8 }
        L_0x008e:
            r4.mo43391a(r1)     // Catch:{ all -> 0x00d8 }
            q2.u r4 = new q2.u     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$e r1 = com.facebook.FacebookSdk.C4500e.f4106b     // Catch:{ all -> 0x00d8 }
            r4.<init>(r1)     // Catch:{ all -> 0x00d8 }
            cacheDir = r4     // Catch:{ all -> 0x00d8 }
            q2.l$b r4 = p198q2.C9166l.C9168b.Instrument     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$f r1 = com.facebook.FacebookSdk.C4501f.f4107a     // Catch:{ all -> 0x00d8 }
            p198q2.C9166l.m18754a(r4, r1)     // Catch:{ all -> 0x00d8 }
            q2.l$b r4 = p198q2.C9166l.C9168b.AppEvents     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$g r1 = com.facebook.FacebookSdk.C4502g.f4108a     // Catch:{ all -> 0x00d8 }
            p198q2.C9166l.m18754a(r4, r1)     // Catch:{ all -> 0x00d8 }
            q2.l$b r4 = p198q2.C9166l.C9168b.ChromeCustomTabsPrefetching     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$h r1 = com.facebook.FacebookSdk.C4503h.f4109a     // Catch:{ all -> 0x00d8 }
            p198q2.C9166l.m18754a(r4, r1)     // Catch:{ all -> 0x00d8 }
            q2.l$b r4 = p198q2.C9166l.C9168b.IgnoreAppSwitchToLoggedOut     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$i r1 = com.facebook.FacebookSdk.C4504i.f4110a     // Catch:{ all -> 0x00d8 }
            p198q2.C9166l.m18754a(r4, r1)     // Catch:{ all -> 0x00d8 }
            q2.l$b r4 = p198q2.C9166l.C9168b.BypassAppSwitch     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$j r1 = com.facebook.FacebookSdk.C4505j.f4111a     // Catch:{ all -> 0x00d8 }
            p198q2.C9166l.m18754a(r4, r1)     // Catch:{ all -> 0x00d8 }
            java.util.concurrent.FutureTask r4 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x00d8 }
            com.facebook.FacebookSdk$k r1 = new com.facebook.FacebookSdk$k     // Catch:{ all -> 0x00d8 }
            r1.<init>(r5)     // Catch:{ all -> 0x00d8 }
            r4.<init>(r1)     // Catch:{ all -> 0x00d8 }
            java.util.concurrent.Executor r5 = getExecutor()     // Catch:{ all -> 0x00d8 }
            r5.execute(r4)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r0)
            return
        L_0x00d0:
            com.facebook.FacebookException r4 = new com.facebook.FacebookException     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r4.<init>((java.lang.String) r5)     // Catch:{ all -> 0x00d8 }
            throw r4     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.sdkInitialize(android.content.Context, com.facebook.FacebookSdk$b):void");
    }
}
