package p042bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.configuration.C4218b;
import com.google.android.gms.location.LocationServices;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7208a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8287i;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: bo.app.l */
public final class C3351l implements C3830z1 {

    /* renamed from: n */
    public static final C3352a f2044n = new C3352a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3023b2 f2045a;

    /* renamed from: b */
    private final C4218b f2046b;

    /* renamed from: c */
    private final C3119e5 f2047c;

    /* renamed from: d */
    private final Context f2048d;

    /* renamed from: e */
    private final ReentrantLock f2049e = new ReentrantLock();

    /* renamed from: f */
    public final SharedPreferences f2050f;

    /* renamed from: g */
    public final List<C7208a> f2051g;

    /* renamed from: h */
    public final PendingIntent f2052h;

    /* renamed from: i */
    public final PendingIntent f2053i;

    /* renamed from: j */
    public C3404m f2054j;

    /* renamed from: k */
    public C2993a2 f2055k;

    /* renamed from: l */
    public boolean f2056l;

    /* renamed from: m */
    public int f2057m;

    /* renamed from: bo.app.l$a */
    public static final class C3352a {
        public /* synthetic */ C3352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo29265a(String str) {
            C12775o.m28639i(str, "apiKey");
            return C12775o.m28647q("com.appboy.managers.geofences.storage.", str);
        }

        private C3352a() {
        }

        /* renamed from: a */
        public final boolean mo29266a(C4218b bVar) {
            C12775o.m28639i(bVar, "configurationProvider");
            return bVar.isGeofencesEnabled();
        }
    }

    /* renamed from: bo.app.l$a0 */
    static final class C3353a0 extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3353a0 f2058b = new C3353a0();

        C3353a0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    /* renamed from: bo.app.l$b */
    static final class C3354b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ boolean f2059b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3354b(boolean z) {
            super(0);
            this.f2059b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled server config value " + this.f2059b + " received.";
        }
    }

    /* renamed from: bo.app.l$b0 */
    static final class C3355b0 extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3355b0 f2060b = new C3355b0();

        C3355b0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting locally stored geofences.";
        }
    }

    /* renamed from: bo.app.l$c */
    static final class C3356c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3351l f2061b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3356c(C3351l lVar) {
            super(0);
            this.f2061b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled status newly set to " + this.f2061b.f2056l + " during server config update.";
        }
    }

    /* renamed from: bo.app.l$c0 */
    static final class C3357c0 extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3357c0 f2062b = new C3357c0();

        C3357c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not un-registering geofences.";
        }
    }

    /* renamed from: bo.app.l$d */
    static final class C3358d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ boolean f2063b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3358d(boolean z) {
            super(0);
            this.f2063b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled status " + this.f2063b + " unchanged during server config update.";
        }
    }

    /* renamed from: bo.app.l$d0 */
    static final class C3359d0 extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3359d0 f2064b = new C3359d0();

        C3359d0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Tearing down all geofences.";
        }
    }

    /* renamed from: bo.app.l$e */
    static final class C3360e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3351l f2065b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3360e(C3351l lVar) {
            super(0);
            this.f2065b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Max number to register newly set to " + this.f2065b.f2057m + " via server config.";
        }
    }

    /* renamed from: bo.app.l$f */
    static final class C3361f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3361f f2066b = new C3361f();

        C3361f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request to set up geofences received.";
        }
    }

    /* renamed from: bo.app.l$g */
    static final class C3362g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3362g f2067b = new C3362g();

        C3362g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Geofences on initialization due to configuration.";
        }
    }

    /* renamed from: bo.app.l$h */
    static final class C3363h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3363h f2068b = new C3363h();

        C3363h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$i */
    static final class C3364i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3364i f2069b = new C3364i();

        C3364i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Fine grained location permissions not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$j */
    static final class C3365j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3365j f2070b = new C3365j();

        C3365j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Background location access permission not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$k */
    static final class C3366k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3366k f2071b = new C3366k();

        C3366k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services not available. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$l */
    static final class C3367l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3367l f2072b = new C3367l();

        C3367l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services Location API not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$m */
    static final class C3368m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3368m f2073b = new C3368m();

        C3368m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    /* renamed from: bo.app.l$n */
    static final class C3369n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3369n f2074b = new C3369n();

        C3369n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request was successful, storing last updated time.";
        }
    }

    /* renamed from: bo.app.l$o */
    static final class C3370o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3370o f2075b = new C3370o();

        C3370o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    /* renamed from: bo.app.l$p */
    static final class C3371p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3371p f2076b = new C3371p();

        C3371p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not posting geofence report.";
        }
    }

    /* renamed from: bo.app.l$q */
    static final class C3372q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2077b;

        /* renamed from: c */
        final /* synthetic */ C3501o1 f2078c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3372q(String str, C3501o1 o1Var) {
            super(0);
            this.f2077b = str;
            this.f2078c = o1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to record geofence " + this.f2077b + " transition with transition type " + this.f2078c + '.';
        }
    }

    /* renamed from: bo.app.l$r */
    static final class C3373r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3373r f2079b = new C3373r();

        C3373r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    /* renamed from: bo.app.l$s */
    static final class C3374s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ List<C7208a> f2080b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3374s(List<C7208a> list) {
            super(0);
            this.f2080b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Received new geofence list of size: ", Integer.valueOf(this.f2080b.size()));
        }
    }

    /* renamed from: bo.app.l$t */
    static final class C3375t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3351l f2081b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3375t(C3351l lVar) {
            super(0);
            this.f2081b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Reached maximum number of new geofences: ", Integer.valueOf(this.f2081b.f2057m));
        }
    }

    /* renamed from: bo.app.l$u */
    static final class C3376u extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C7208a f2082b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3376u(C7208a aVar) {
            super(0);
            this.f2082b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding new geofence to local storage: ", this.f2082b);
        }
    }

    /* renamed from: bo.app.l$v */
    static final class C3377v extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3351l f2083b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3377v(C3351l lVar) {
            super(0);
            this.f2083b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Added " + this.f2083b.f2051g.size() + " new geofences to local storage.";
        }
    }

    /* renamed from: bo.app.l$w */
    static final class C3378w extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3378w f2084b = new C3378w();

        C3378w() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* renamed from: bo.app.l$x */
    static final class C3379x extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3379x f2085b = new C3379x();

        C3379x() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* renamed from: bo.app.l$y */
    static final class C3380y extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3380y f2086b = new C3380y();

        C3380y() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    /* renamed from: bo.app.l$z */
    static final class C3381z extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3381z f2087b = new C3381z();

        C3381z() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    public C3351l(Context context, String str, C3023b2 b2Var, C4218b bVar, C3119e5 e5Var, C3285j2 j2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "apiKey");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(bVar, "configurationProvider");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(j2Var, "internalIEventMessenger");
        this.f2045a = b2Var;
        this.f2046b = bVar;
        this.f2047c = e5Var;
        boolean z = true;
        mo29264c(true);
        this.f2048d = context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(f2044n.mo29265a(str), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f2050f = sharedPreferences;
        this.f2051g = C12686e0.m28207D0(C3545p1.m3624a(sharedPreferences));
        this.f2052h = C3545p1.m3627b(context);
        this.f2053i = C3545p1.m3623a(context);
        this.f2054j = new C3404m(context, str, e5Var, j2Var);
        this.f2056l = (!C3545p1.m3625a(e5Var) || !mo29257a(context)) ? false : z;
        this.f2057m = C3545p1.m3626b(e5Var);
    }

    /* renamed from: a */
    public final C3023b2 mo29249a() {
        return this.f2045a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29259b() {
        /*
            r9 = this;
            j0.c r8 = p126j0.C8266c.f11641a
            bo.app.l$f r5 = p042bo.app.C3351l.C3361f.f2066b
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r1 = r9
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
            bo.app.e5 r0 = r9.f2047c
            boolean r0 = p042bo.app.C3545p1.m3625a((p042bo.app.C3119e5) r0)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            android.content.Context r0 = r9.f2048d
            java.lang.String r2 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28638h(r0, r2)
            boolean r0 = r9.mo29257a((android.content.Context) r0)
            if (r0 == 0) goto L_0x0026
            r0 = r1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r9.f2056l = r0
            com.braze.configuration.b r0 = r9.f2046b
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L_0x0035
            r9.mo29262b((boolean) r1)
            goto L_0x0041
        L_0x0035:
            bo.app.l$g r5 = p042bo.app.C3351l.C3362g.f2067b
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r1 = r9
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3351l.mo29259b():void");
    }

    /* renamed from: c */
    public final void mo29264c(boolean z) {
        if (!this.f2056l) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3380y.f2086b, 7, (Object) null);
        } else if (z) {
            ReentrantLock reentrantLock = this.f2049e;
            reentrantLock.lock();
            try {
                mo29255a(this.f2051g, this.f2052h);
                C11921v vVar = C11921v.f18618a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo29257a(Context context) {
        C12775o.m28639i(context, "context");
        if (!f2044n.mo29266a(this.f2046b)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3363h.f2068b, 7, (Object) null);
            return false;
        } else if (!C8287i.m16471b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3364i.f2069b, 6, (Object) null);
            return false;
        } else if (Build.VERSION.SDK_INT >= 29 && !C8287i.m16471b(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3365j.f2070b, 6, (Object) null);
            return false;
        } else if (!C3662s1.m3844a(context)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3366k.f2071b, 7, (Object) null);
            return false;
        } else {
            try {
                Class.forName("com.google.android.gms.location.LocationServices", false, C3351l.class.getClassLoader());
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3368m.f2073b, 7, (Object) null);
                return true;
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3367l.f2072b, 7, (Object) null);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo29260b(PendingIntent pendingIntent) {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3381z.f2087b, 7, (Object) null);
        if (pendingIntent != null) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3353a0.f2058b, 7, (Object) null);
            LocationServices.getGeofencingClient(this.f2048d).removeGeofences(pendingIntent);
        }
        ReentrantLock reentrantLock = this.f2049e;
        reentrantLock.lock();
        try {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3355b0.f2060b, 7, (Object) null);
            this.f2050f.edit().clear().apply();
            this.f2051g.clear();
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public void mo29263c() {
        if (!this.f2056l) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3357c0.f2062b, 7, (Object) null);
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3359d0.f2064b, 7, (Object) null);
        mo29260b(this.f2052h);
    }

    /* renamed from: a */
    public final boolean mo29258a(String str, C3501o1 o1Var) {
        C12775o.m28639i(str, "geofenceId");
        C12775o.m28639i(o1Var, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.f2049e;
        reentrantLock.lock();
        try {
            C7208a a = mo29250a(str);
            if (a != null) {
                if (o1Var == C3501o1.ENTER) {
                    return a.mo40765v();
                }
                if (o1Var == C3501o1.EXIT) {
                    boolean w = a.mo40766w();
                    reentrantLock.unlock();
                    return w;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r9.f2054j.mo29323a(p126j0.C8273e.m16436i(), r1, r11) == true) goto L_0x005e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29261b(java.lang.String r10, p042bo.app.C3501o1 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "geofenceId"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "transitionType"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            boolean r0 = r9.f2056l
            if (r0 != 0) goto L_0x001d
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11651g
            bo.app.l$p r6 = p042bo.app.C3351l.C3371p.f2076b
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r9
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x001d:
            bo.app.j$a r0 = p042bo.app.C3240j.f1842h
            java.lang.String r1 = r11.toString()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "US"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C12775o.m28638h(r1, r2)
            bo.app.x1 r0 = r0.mo29079c(r10, r1)
            if (r0 != 0) goto L_0x003b
            r0 = 0
            goto L_0x0069
        L_0x003b:
            boolean r1 = r9.mo29258a((java.lang.String) r10, (p042bo.app.C3501o1) r11)
            if (r1 == 0) goto L_0x0048
            bo.app.b2 r1 = r9.mo29249a()
            r1.mo28641a((p042bo.app.C3785x1) r0)
        L_0x0048:
            d0.a r1 = r9.mo29250a((java.lang.String) r10)
            if (r1 != 0) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            bo.app.m r2 = r9.f2054j
            long r3 = p126j0.C8273e.m16436i()
            boolean r1 = r2.mo29323a(r3, r1, r11)
            r2 = 1
            if (r1 != r2) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0067
            bo.app.b2 r1 = r9.mo29249a()
            r1.mo28643b((p042bo.app.C3785x1) r0)
        L_0x0067:
            ef.v r0 = p336ef.C11921v.f18618a
        L_0x0069:
            if (r0 != 0) goto L_0x007c
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e
            bo.app.l$q r6 = new bo.app.l$q
            r6.<init>(r10, r11)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r9
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3351l.mo29261b(java.lang.String, bo.app.o1):void");
    }

    /* renamed from: a */
    public final C7208a mo29250a(String str) {
        T t;
        C12775o.m28639i(str, "geofenceId");
        ReentrantLock reentrantLock = this.f2049e;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f2051g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C12775o.m28634d(((C7208a) t).getId(), str)) {
                    break;
                }
            }
            return (C7208a) t;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void mo29252a(C2993a2 a2Var) {
        C12775o.m28639i(a2Var, "location");
        if (!this.f2056l) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3378w.f2084b, 7, (Object) null);
            return;
        }
        this.f2055k = a2Var;
        if (a2Var != null) {
            mo29249a().mo28633a(a2Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29253a(p042bo.app.C3046c5 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "serverConfig"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            boolean r0 = r13.mo28744h()
            j0.c r9 = p126j0.C8266c.f11641a
            bo.app.l$b r6 = new bo.app.l$b
            r6.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 7
            r8 = 0
            r1 = r9
            r2 = r12
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L_0x002d
            android.content.Context r0 = r12.f2048d
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            boolean r0 = r12.mo29257a((android.content.Context) r0)
            if (r0 == 0) goto L_0x002d
            r0 = r10
            goto L_0x002e
        L_0x002d:
            r0 = r11
        L_0x002e:
            boolean r1 = r12.f2056l
            if (r0 == r1) goto L_0x005d
            r12.f2056l = r0
            j0.c$a r3 = p126j0.C8266c.C8267a.I
            bo.app.l$c r6 = new bo.app.l$c
            r6.<init>(r12)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r2 = r12
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r12.f2056l
            if (r0 == 0) goto L_0x0057
            r12.mo29264c(r11)
            com.braze.configuration.b r0 = r12.f2046b
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L_0x006c
            r12.mo29262b((boolean) r10)
            goto L_0x006c
        L_0x0057:
            android.app.PendingIntent r0 = r12.f2052h
            r12.mo29260b((android.app.PendingIntent) r0)
            goto L_0x006c
        L_0x005d:
            bo.app.l$d r6 = new bo.app.l$d
            r6.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 7
            r8 = 0
            r1 = r9
            r2 = r12
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x006c:
            int r0 = r13.mo28746j()
            if (r0 < 0) goto L_0x0084
            r12.f2057m = r0
            j0.c$a r3 = p126j0.C8266c.C8267a.I
            bo.app.l$e r6 = new bo.app.l$e
            r6.<init>(r12)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r2 = r12
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0084:
            bo.app.m r0 = r12.f2054j
            r0.mo29321a((p042bo.app.C3046c5) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3351l.mo29253a(bo.app.c5):void");
    }

    /* renamed from: b */
    public void mo29262b(boolean z) {
        if (!this.f2056l) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3379x.f2085b, 7, (Object) null);
        } else if (this.f2054j.mo29324a(z, C8273e.m16436i())) {
            mo29251a(this.f2053i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo29254a(List<C7208a> list) {
        C12775o.m28639i(list, "geofenceList");
        List<C7208a> D0 = C12686e0.m28207D0(list);
        if (!this.f2056l) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3373r.f2079b, 6, (Object) null);
            return;
        }
        if (this.f2055k != null) {
            for (C7208a aVar : D0) {
                C2993a2 a2Var = this.f2055k;
                if (a2Var != null) {
                    aVar.mo40762h0(C3394l3.m3360a(a2Var.getLatitude(), a2Var.getLongitude(), aVar.getLatitude(), aVar.getLongitude()));
                }
            }
            C12664a0.m28171z(D0);
        }
        ReentrantLock reentrantLock = this.f2049e;
        reentrantLock.lock();
        try {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3374s(D0), 7, (Object) null);
            SharedPreferences.Editor edit = this.f2050f.edit();
            edit.clear();
            this.f2051g.clear();
            Iterator it = D0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7208a aVar2 = (C7208a) it.next();
                if (i == this.f2057m) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3375t(this), 7, (Object) null);
                    break;
                }
                this.f2051g.add(aVar2);
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3376u(aVar2), 7, (Object) null);
                edit.putString(aVar2.getId(), aVar2.forJsonPut().toString());
                i++;
            }
            edit.apply();
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3377v(this), 7, (Object) null);
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            this.f2054j.mo29322a(D0);
            mo29264c(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo29256a(boolean z) {
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3369n.f2074b, 7, (Object) null);
            this.f2054j.mo29320a(C8273e.m16436i());
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3370o.f2075b, 7, (Object) null);
    }

    /* renamed from: a */
    public final void mo29251a(PendingIntent pendingIntent) {
        C12775o.m28639i(pendingIntent, "geofenceRequestIntent");
        Context context = this.f2048d;
        C12775o.m28638h(context, "applicationContext");
        C3605r1.m3740a(context, pendingIntent, (C3830z1) this);
    }

    /* renamed from: a */
    public final void mo29255a(List<C7208a> list, PendingIntent pendingIntent) {
        C12775o.m28639i(list, "geofenceList");
        C12775o.m28639i(pendingIntent, "geofenceRequestIntent");
        Context context = this.f2048d;
        C12775o.m28638h(context, "applicationContext");
        C3605r1.m3749b(context, list, pendingIntent);
    }
}
