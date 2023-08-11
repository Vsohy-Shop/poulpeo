package p042bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.appboy.Constants;
import com.appboy.enums.LocationProviderName;
import com.braze.configuration.C4218b;
import com.braze.receivers.BrazeActionReceiver;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8275f;
import p126j0.C8287i;
import p404of.C13074a;
import p466yf.C13933b1;
import p466yf.C14016p1;

/* renamed from: bo.app.o */
public final class C3481o implements C3393l2 {

    /* renamed from: f */
    public static final C3483b f2257f = new C3483b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final long f2258g = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    private final Context f2259a;

    /* renamed from: b */
    private final C3023b2 f2260b;

    /* renamed from: c */
    private final C4218b f2261c;

    /* renamed from: d */
    private final LocationManager f2262d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EnumSet<LocationProviderName> f2263e;

    /* renamed from: bo.app.o$a */
    static final class C3482a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3481o f2264b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3482a(C3481o oVar) {
            super(0);
            this.f2264b = oVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Using location providers: ", this.f2264b.f2263e);
        }
    }

    /* renamed from: bo.app.o$b */
    public static final class C3483b {

        /* renamed from: bo.app.o$b$a */
        static final class C3484a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ long f2265b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3484a(long j) {
                super(0);
                this.f2265b = j;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Last known GPS location is too old and will not be used. Age ms: ", Long.valueOf(this.f2265b));
            }
        }

        /* renamed from: bo.app.o$b$b */
        static final class C3485b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Location f2266b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3485b(Location location) {
                super(0);
                this.f2266b = location;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Using last known GPS location: ", this.f2266b);
            }
        }

        public /* synthetic */ C3483b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo29409a(LocationManager locationManager, EnumSet<LocationProviderName> enumSet, boolean z, boolean z2) {
            C12775o.m28639i(locationManager, "locationManager");
            C12775o.m28639i(enumSet, "allowedProviders");
            if (z && enumSet.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled("gps")) {
                return "gps";
            }
            if ((z2 || z) && enumSet.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled("network")) {
                return "network";
            }
            if (!z || !enumSet.contains(LocationProviderName.PASSIVE) || !locationManager.isProviderEnabled("passive")) {
                return null;
            }
            return "passive";
        }

        private C3483b() {
        }

        /* renamed from: a */
        public final Location mo29408a(LocationManager locationManager) {
            Location lastKnownLocation;
            LocationManager locationManager2 = locationManager;
            C12775o.m28639i(locationManager2, "locationManager");
            if (!locationManager2.isProviderEnabled("gps") || (lastKnownLocation = locationManager2.getLastKnownLocation("gps")) == null) {
                return null;
            }
            long h = C8273e.m16435h() - lastKnownLocation.getTime();
            if (h > C3481o.f2258g) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3484a(h), 6, (Object) null);
                return null;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3485b(lastKnownLocation), 7, (Object) null);
            return lastKnownLocation;
        }
    }

    /* renamed from: bo.app.o$c */
    static final class C3486c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3486c f2267b = new C3486c();

        C3486c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location collection enabled via sdk configuration.";
        }
    }

    /* renamed from: bo.app.o$d */
    static final class C3487d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3487d f2268b = new C3487d();

        C3487d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location collection disabled via sdk configuration.";
        }
    }

    /* renamed from: bo.app.o$e */
    static final class C3488e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3488e f2269b = new C3488e();

        C3488e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    /* renamed from: bo.app.o$f */
    static final class C3489f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3489f f2270b = new C3489f();

        C3489f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Location collection is disabled.";
        }
    }

    /* renamed from: bo.app.o$g */
    static final class C3490g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3490g f2271b = new C3490g();

        C3490g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Neither fine nor coarse location permissions found.";
        }
    }

    /* renamed from: bo.app.o$h */
    static final class C3491h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Location f2272b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3491h(Location location) {
            super(0);
            this.f2272b = location;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Setting user location to last known GPS location: ", this.f2272b);
        }
    }

    /* renamed from: bo.app.o$i */
    static final class C3492i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3492i f2273b = new C3492i();

        C3492i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not request single location update. Could not find suitable location provider.";
        }
    }

    /* renamed from: bo.app.o$j */
    static final class C3493j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2274b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3493j(String str) {
            super(0);
            this.f2274b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Requesting single location update with provider: ", this.f2274b);
        }
    }

    /* renamed from: bo.app.o$k */
    static final class C3494k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Location f2275b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3494k(Location location) {
            super(0);
            this.f2275b = location;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Location manager getCurrentLocation got location: ", this.f2275b);
        }
    }

    /* renamed from: bo.app.o$l */
    static final class C3495l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3495l f2276b = new C3495l();

        C3495l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to security exception from insufficient permissions.";
        }
    }

    /* renamed from: bo.app.o$m */
    static final class C3496m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3496m f2277b = new C3496m();

        C3496m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to exception.";
        }
    }

    public C3481o(Context context, C3023b2 b2Var, C4218b bVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(bVar, "appConfigurationProvider");
        this.f2259a = context;
        this.f2260b = b2Var;
        this.f2261c = bVar;
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            this.f2262d = (LocationManager) systemService;
            this.f2263e = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!bVar.getCustomLocationProviderNames().isEmpty()) {
                this.f2263e = bVar.getCustomLocationProviderNames();
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3482a(this), 6, (Object) null);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    /* renamed from: c */
    private final boolean m3509c() {
        if (this.f2261c.isLocationCollectionEnabled()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3486c.f2267b, 6, (Object) null);
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3487d.f2268b, 6, (Object) null);
        return false;
    }

    /* renamed from: a */
    public boolean mo29311a(C2993a2 a2Var) {
        C12775o.m28639i(a2Var, "location");
        try {
            C3785x1 a = C3240j.f1842h.mo29061a(a2Var);
            if (a != null) {
                this.f2260b.mo28641a(a);
            }
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3488e.f2269b, 4, (Object) null);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo29310a() {
        Location a;
        if (!m3509c()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3489f.f2270b, 6, (Object) null);
            return false;
        }
        boolean b = C8287i.m16471b(this.f2259a, "android.permission.ACCESS_FINE_LOCATION");
        boolean b2 = C8287i.m16471b(this.f2259a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!b2 && !b) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3490g.f2271b, 6, (Object) null);
            return false;
        } else if (!b || (a = f2257f.mo29408a(this.f2262d)) == null) {
            C3483b bVar = f2257f;
            LocationManager locationManager = this.f2262d;
            EnumSet<LocationProviderName> enumSet = this.f2263e;
            C12775o.m28638h(enumSet, "allowedLocationProviders");
            String a2 = bVar.mo29409a(locationManager, enumSet, b, b2);
            if (a2 == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3492i.f2273b, 7, (Object) null);
                return false;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3493j(a2), 7, (Object) null);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.f2262d.getCurrentLocation(a2, (CancellationSignal) null, C14016p1.m32521a(C13933b1.m32211b()), new C3350k7(this));
                } else {
                    m3506a(a2);
                }
                return true;
            } catch (SecurityException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3495l.f2276b, 4, (Object) null);
                return false;
            } catch (Exception e2) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e2, false, C3496m.f2277b, 4, (Object) null);
                return false;
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3491h(a), 7, (Object) null);
            mo29311a((C2993a2) new C3451n(a));
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3505a(C3481o oVar, Location location) {
        C12775o.m28639i(oVar, "this$0");
        C8266c.m16396e(C8266c.f11641a, oVar, (C8266c.C8267a) null, (Throwable) null, false, new C3494k(location), 7, (Object) null);
        if (location != null) {
            oVar.mo29311a((C2993a2) new C3451n(location));
        }
    }

    /* renamed from: a */
    private final void m3506a(String str) {
        Intent intent = new Intent(Constants.APPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION).setClass(this.f2259a, BrazeActionReceiver.class);
        C12775o.m28638h(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        this.f2262d.requestSingleUpdate(str, PendingIntent.getBroadcast(this.f2259a, 0, intent, C8275f.m16442c() | 134217728));
    }
}
