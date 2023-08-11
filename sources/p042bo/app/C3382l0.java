package p042bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.core.content.p003pm.PackageInfoCompat;
import com.braze.configuration.C4218b;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3274j0;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.l0 */
public final class C3382l0 implements C3141f2 {

    /* renamed from: g */
    public static final C3383a f2088g = new C3383a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private Context f2089a;

    /* renamed from: b */
    private final C4218b f2090b;

    /* renamed from: c */
    private final C3162g2 f2091c;

    /* renamed from: d */
    private final C3295k0 f2092d;

    /* renamed from: e */
    private final String f2093e;

    /* renamed from: f */
    public final SharedPreferences f2094f;

    /* renamed from: bo.app.l0$a */
    public static final class C3383a {
        public /* synthetic */ C3383a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo29300a(Context context, boolean z) {
            int i;
            int i2;
            C12775o.m28639i(context, "context");
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    Rect a = windowManager.getCurrentWindowMetrics().getBounds();
                    C12775o.m28638h(a, "windowManager.currentWindowMetrics.bounds");
                    i2 = a.width();
                    i = a.height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    int i3 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    i2 = i3;
                    i = i4;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append('x');
                    sb.append(i2);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append('x');
                sb2.append(i);
                return sb2.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }

        private C3383a() {
        }

        /* renamed from: a */
        public final String mo29301a(Locale locale) {
            C12775o.m28639i(locale, "locale");
            String locale2 = locale.toString();
            C12775o.m28638h(locale2, "locale.toString()");
            return locale2;
        }
    }

    /* renamed from: bo.app.l0$b */
    static final class C3384b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3384b f2095b = new C3384b();

        C3384b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to read notifications enabled state from NotificationManagerCompat.";
        }
    }

    /* renamed from: bo.app.l0$c */
    static final class C3385c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3385c f2096b = new C3385c();

        C3385c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "App version code could not be read. Returning null";
        }
    }

    /* renamed from: bo.app.l0$d */
    static final class C3386d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3386d f2097b = new C3386d();

        C3386d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to collect background restriction information from Activity Manager";
        }
    }

    /* renamed from: bo.app.l0$e */
    static final class C3387e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2098b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3387e(String str) {
            super(0);
            this.f2098b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to inspect package [" + this.f2098b + ']';
        }
    }

    /* renamed from: bo.app.l0$f */
    static final class C3388f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3388f f2099b = new C3388f();

        C3388f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while reading the phone carrier name.";
        }
    }

    public C3382l0(Context context, C4218b bVar, C3162g2 g2Var, C3295k0 k0Var) {
        String str;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "configurationProvider");
        C12775o.m28639i(g2Var, "deviceIdProvider");
        C12775o.m28639i(k0Var, "deviceCache");
        this.f2089a = context;
        this.f2090b = bVar;
        this.f2091c = g2Var;
        this.f2092d = k0Var;
        PackageInfo g = m3331g();
        if (g == null) {
            str = null;
        } else {
            str = g.versionName;
        }
        this.f2093e = str;
        SharedPreferences sharedPreferences = this.f2089a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f2094f = sharedPreferences;
    }

    /* renamed from: g */
    private final PackageInfo m3331g() {
        String packageName = this.f2089a.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return this.f2089a.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0));
            }
            return this.f2089a.getPackageManager().getPackageInfo(packageName, 0);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3387e(packageName), 4, (Object) null);
            ApplicationInfo applicationInfo = this.f2089a.getApplicationInfo();
            if (Build.VERSION.SDK_INT >= 33) {
                return this.f2089a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0));
            }
            return this.f2089a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
        }
    }

    /* renamed from: i */
    private final boolean m3332i() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f2089a.getSystemService("activity");
            if (systemService != null) {
                return ((ActivityManager) systemService).isBackgroundRestricted();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3386d.f2097b, 4, (Object) null);
            return false;
        }
    }

    /* renamed from: j */
    private final boolean m3333j() {
        if (this.f2089a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final String m3334k() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: l */
    private final String m3335l() {
        try {
            Object systemService = this.f2089a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (systemService != null) {
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3388f.f2099b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: m */
    private final Locale m3336m() {
        Locale locale = Locale.getDefault();
        C12775o.m28638h(locale, "getDefault()");
        return locale;
    }

    /* renamed from: n */
    private final TimeZone m3337n() {
        TimeZone timeZone = TimeZone.getDefault();
        C12775o.m28638h(timeZone, "getDefault()");
        return timeZone;
    }

    /* renamed from: a */
    public String mo28904a() {
        long j;
        PackageInfo g = m3331g();
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = g.getLongVersionCode();
            } else {
                j = PackageInfoCompat.getLongVersionCode(g);
            }
            return j + ".0.0.0";
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3385c.f2096b, 7, (Object) null);
        return null;
    }

    /* renamed from: b */
    public C3274j0 mo28907b() {
        this.f2092d.mo29172a(mo29296d());
        return (C3274j0) this.f2092d.mo28509a();
    }

    /* renamed from: c */
    public String mo28908c() {
        return this.f2093e;
    }

    /* renamed from: d */
    public C3274j0 mo29296d() {
        C3274j0.C3275a e = new C3274j0.C3275a(this.f2090b).mo29127a(m3334k()).mo29130b(m3335l()).mo29134e(Build.MODEL);
        C3383a aVar = f2088g;
        return e.mo29133d(aVar.mo29301a(m3336m())).mo29136g(m3337n().getID()).mo29135f(aVar.mo29300a(this.f2089a, m3333j())).mo29131c(Boolean.valueOf(mo29298f())).mo29129b(Boolean.valueOf(m3332i())).mo29132c(mo29297e()).mo29126a(mo29299h()).mo29128a();
    }

    /* renamed from: e */
    public final String mo29297e() {
        return this.f2094f.getString("google_ad_id", (String) null);
    }

    /* renamed from: f */
    public final boolean mo29298f() {
        Object systemService = this.f2089a.getSystemService("notification");
        if (systemService != null) {
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public String getDeviceId() {
        return this.f2091c.getDeviceId();
    }

    /* renamed from: h */
    public final Boolean mo29299h() {
        if (!this.f2094f.contains("ad_tracking_enabled")) {
            return null;
        }
        return Boolean.valueOf(this.f2094f.getBoolean("ad_tracking_enabled", true));
    }

    /* renamed from: a */
    public void mo28905a(String str) {
        C12775o.m28639i(str, "googleAdvertisingId");
        this.f2094f.edit().putString("google_ad_id", str).apply();
    }

    /* renamed from: a */
    public void mo28906a(boolean z) {
        this.f2094f.edit().putBoolean("ad_tracking_enabled", !z).apply();
    }
}
