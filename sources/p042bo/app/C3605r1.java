package p042bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p057d0.C7208a;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.r1 */
public final class C3605r1 {

    /* renamed from: a */
    public static final C3605r1 f2457a = new C3605r1();

    /* renamed from: bo.app.r1$a */
    static final class C3606a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3606a f2458b = new C3606a();

        C3606a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting registered geofence cache.";
        }
    }

    /* renamed from: bo.app.r1$b */
    static final class C3607b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3607b f2459b = new C3607b();

        C3607b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$c */
    static final class C3608c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2460b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3608c(int i) {
            super(0);
            this.f2460b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ", Integer.valueOf(this.f2460b));
        }
    }

    /* renamed from: bo.app.r1$d */
    static final class C3609d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2461b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3609d(int i) {
            super(0);
            this.f2461b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ", Integer.valueOf(this.f2461b));
        }
    }

    /* renamed from: bo.app.r1$e */
    static final class C3610e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2462b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3610e(int i) {
            super(0);
            this.f2462b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ", Integer.valueOf(this.f2462b));
        }
    }

    /* renamed from: bo.app.r1$f */
    static final class C3611f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3611f f2463b = new C3611f();

        C3611f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence registration success code in failure block with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$g */
    static final class C3612g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2464b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3612g(int i) {
            super(0);
            this.f2464b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofence pending result returned unknown status code: ", Integer.valueOf(this.f2464b));
        }
    }

    /* renamed from: bo.app.r1$h */
    static final class C3613h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3613h f2465b = new C3613h();

        C3613h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while adding geofences.";
        }
    }

    /* renamed from: bo.app.r1$i */
    static final class C3614i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ List<String> f2466b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3614i(List<String> list) {
            super(0);
            this.f2466b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Un-registering " + this.f2466b.size() + " obsolete geofences from Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$j */
    static final class C3615j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3615j f2467b = new C3615j();

        C3615j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No obsolete geofences need to be unregistered from Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$k */
    static final class C3616k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ List<C7208a> f2468b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3616k(List<C7208a> list) {
            super(0);
            this.f2468b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Registering " + this.f2468b.size() + " new geofences with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$l */
    static final class C3617l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3617l f2469b = new C3617l();

        C3617l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No new geofences need to be registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$m */
    static final class C3618m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3618m f2470b = new C3618m();

        C3618m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while adding geofences.";
        }
    }

    /* renamed from: bo.app.r1$n */
    static final class C3619n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2471b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3619n(String str) {
            super(0);
            this.f2471b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence with id: " + this.f2471b + " removed from shared preferences.";
        }
    }

    /* renamed from: bo.app.r1$o */
    static final class C3620o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3620o f2472b = new C3620o();

        C3620o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully un-registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$p */
    static final class C3621p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2473b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3621p(int i) {
            super(0);
            this.f2473b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ", Integer.valueOf(this.f2473b));
        }
    }

    /* renamed from: bo.app.r1$q */
    static final class C3622q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2474b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3622q(int i) {
            super(0);
            this.f2474b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ", Integer.valueOf(this.f2474b));
        }
    }

    /* renamed from: bo.app.r1$r */
    static final class C3623r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2475b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3623r(int i) {
            super(0);
            this.f2475b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ", Integer.valueOf(this.f2475b));
        }
    }

    /* renamed from: bo.app.r1$s */
    static final class C3624s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3624s f2476b = new C3624s();

        C3624s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence un-registration success code in failure block with Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$t */
    static final class C3625t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2477b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3625t(int i) {
            super(0);
            this.f2477b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Geofence pending result returned unknown status code: ", Integer.valueOf(this.f2477b));
        }
    }

    /* renamed from: bo.app.r1$u */
    static final class C3626u extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3626u f2478b = new C3626u();

        C3626u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while removing geofences.";
        }
    }

    /* renamed from: bo.app.r1$v */
    static final class C3627v extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3627v f2479b = new C3627v();

        C3627v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting single location update from Google Play Services.";
        }
    }

    /* renamed from: bo.app.r1$w */
    static final class C3628w extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3628w f2480b = new C3628w();

        C3628w() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request from Google Play services was successful.";
        }
    }

    /* renamed from: bo.app.r1$x */
    static final class C3629x extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3629x f2481b = new C3629x();

        C3629x() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get single location update from Google Play services.";
        }
    }

    /* renamed from: bo.app.r1$y */
    static final class C3630y extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3630y f2482b = new C3630y();

        C3630y() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request location update due to exception.";
        }
    }

    /* renamed from: bo.app.r1$z */
    static final class C3631z extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C7208a f2483b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3631z(C7208a aVar) {
            super(0);
            this.f2483b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence with id: " + this.f2483b.getId() + " added to shared preferences.";
        }
    }

    private C3605r1() {
    }

    /* renamed from: a */
    public static final void m3740a(Context context, PendingIntent pendingIntent, C3830z1 z1Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(pendingIntent, "pendingIntent");
        C12775o.m28639i(z1Var, "resultListener");
        try {
            C8266c.m16396e(C8266c.f11641a, f2457a, (C8266c.C8267a) null, (Throwable) null, false, C3627v.f2479b, 7, (Object) null);
            LocationRequest create = LocationRequest.create();
            C12775o.m28638h(create, "create()");
            create.setPriority(100);
            create.setNumUpdates(1);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            LocationServices.getFusedLocationProviderClient(context).requestLocationUpdates(create, pendingIntent).mo35456g(new C3590q7(z1Var)).mo35454e(new C3640r7(z1Var));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, e, false, C3630y.f2482b, 4, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ad A[Catch:{ Exception -> 0x012b }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0076 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3749b(android.content.Context r13, java.util.List<p057d0.C7208a> r14, android.app.PendingIntent r15) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "geofenceList"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "geofenceRequestIntent"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            bo.app.r1 r0 = f2457a     // Catch:{ Exception -> 0x012b }
            android.content.SharedPreferences r0 = r0.m3747b((android.content.Context) r13)     // Catch:{ Exception -> 0x012b }
            java.util.List r0 = p042bo.app.C3545p1.m3624a((android.content.SharedPreferences) r0)     // Catch:{ Exception -> 0x012b }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x012b }
            r1.<init>()     // Catch:{ Exception -> 0x012b }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x0022:
            boolean r2 = r14.hasNext()     // Catch:{ Exception -> 0x012b }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r14.next()     // Catch:{ Exception -> 0x012b }
            r5 = r2
            d0.a r5 = (p057d0.C7208a) r5     // Catch:{ Exception -> 0x012b }
            boolean r6 = r0 instanceof java.util.Collection     // Catch:{ Exception -> 0x012b }
            if (r6 == 0) goto L_0x003c
            boolean r6 = r0.isEmpty()     // Catch:{ Exception -> 0x012b }
            if (r6 == 0) goto L_0x003c
            goto L_0x0066
        L_0x003c:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012b }
            if (r7 == 0) goto L_0x0066
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012b }
            d0.a r7 = (p057d0.C7208a) r7     // Catch:{ Exception -> 0x012b }
            java.lang.String r8 = r7.getId()     // Catch:{ Exception -> 0x012b }
            java.lang.String r9 = r5.getId()     // Catch:{ Exception -> 0x012b }
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r9)     // Catch:{ Exception -> 0x012b }
            if (r8 == 0) goto L_0x0062
            boolean r7 = r7.mo40754c(r5)     // Catch:{ Exception -> 0x012b }
            if (r7 == 0) goto L_0x0062
            r7 = r4
            goto L_0x0063
        L_0x0062:
            r7 = r3
        L_0x0063:
            if (r7 == 0) goto L_0x0040
            goto L_0x0067
        L_0x0066:
            r3 = r4
        L_0x0067:
            if (r3 == 0) goto L_0x0022
            r1.add(r2)     // Catch:{ Exception -> 0x012b }
            goto L_0x0022
        L_0x006d:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x012b }
            r14.<init>()     // Catch:{ Exception -> 0x012b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x0076:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x012b }
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x012b }
            r5 = r2
            d0.a r5 = (p057d0.C7208a) r5     // Catch:{ Exception -> 0x012b }
            boolean r6 = r1.isEmpty()     // Catch:{ Exception -> 0x012b }
            if (r6 == 0) goto L_0x008a
            goto L_0x00aa
        L_0x008a:
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x008e:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012b }
            if (r7 == 0) goto L_0x00aa
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012b }
            d0.a r7 = (p057d0.C7208a) r7     // Catch:{ Exception -> 0x012b }
            java.lang.String r7 = r7.getId()     // Catch:{ Exception -> 0x012b }
            java.lang.String r8 = r5.getId()     // Catch:{ Exception -> 0x012b }
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)     // Catch:{ Exception -> 0x012b }
            if (r7 == 0) goto L_0x008e
            r5 = r3
            goto L_0x00ab
        L_0x00aa:
            r5 = r4
        L_0x00ab:
            if (r5 == 0) goto L_0x0076
            r14.add(r2)     // Catch:{ Exception -> 0x012b }
            goto L_0x0076
        L_0x00b1:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x012b }
            r2 = 10
            int r2 = kotlin.collections.C12728x.m28544v(r14, r2)     // Catch:{ Exception -> 0x012b }
            r0.<init>(r2)     // Catch:{ Exception -> 0x012b }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x012b }
        L_0x00c0:
            boolean r2 = r14.hasNext()     // Catch:{ Exception -> 0x012b }
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r14.next()     // Catch:{ Exception -> 0x012b }
            d0.a r2 = (p057d0.C7208a) r2     // Catch:{ Exception -> 0x012b }
            java.lang.String r2 = r2.getId()     // Catch:{ Exception -> 0x012b }
            r0.add(r2)     // Catch:{ Exception -> 0x012b }
            goto L_0x00c0
        L_0x00d4:
            boolean r14 = r0.isEmpty()     // Catch:{ Exception -> 0x012b }
            r14 = r14 ^ r4
            if (r14 == 0) goto L_0x00f1
            j0.c r5 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x012b }
            bo.app.r1 r14 = f2457a     // Catch:{ Exception -> 0x012b }
            r7 = 0
            r8 = 0
            r9 = 0
            bo.app.r1$i r10 = new bo.app.r1$i     // Catch:{ Exception -> 0x012b }
            r10.<init>(r0)     // Catch:{ Exception -> 0x012b }
            r11 = 7
            r12 = 0
            r6 = r14
            p126j0.C8266c.m16396e(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x012b }
            r14.m3748b(r13, r0)     // Catch:{ Exception -> 0x012b }
            goto L_0x00ff
        L_0x00f1:
            j0.c r5 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x012b }
            bo.app.r1 r6 = f2457a     // Catch:{ Exception -> 0x012b }
            r7 = 0
            r8 = 0
            r9 = 0
            bo.app.r1$j r10 = p042bo.app.C3605r1.C3615j.f2467b     // Catch:{ Exception -> 0x012b }
            r11 = 7
            r12 = 0
            p126j0.C8266c.m16396e(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x012b }
        L_0x00ff:
            boolean r14 = r1.isEmpty()     // Catch:{ Exception -> 0x012b }
            r14 = r14 ^ r4
            if (r14 == 0) goto L_0x011c
            j0.c r2 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x012b }
            bo.app.r1 r14 = f2457a     // Catch:{ Exception -> 0x012b }
            r4 = 0
            r5 = 0
            r6 = 0
            bo.app.r1$k r7 = new bo.app.r1$k     // Catch:{ Exception -> 0x012b }
            r7.<init>(r1)     // Catch:{ Exception -> 0x012b }
            r8 = 7
            r9 = 0
            r3 = r14
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x012b }
            r14.m3742a((android.content.Context) r13, (java.util.List<p057d0.C7208a>) r1, (android.app.PendingIntent) r15)     // Catch:{ Exception -> 0x012b }
            goto L_0x013b
        L_0x011c:
            j0.c r0 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x012b }
            bo.app.r1 r1 = f2457a     // Catch:{ Exception -> 0x012b }
            r2 = 0
            r3 = 0
            r4 = 0
            bo.app.r1$l r5 = p042bo.app.C3605r1.C3617l.f2469b     // Catch:{ Exception -> 0x012b }
            r6 = 7
            r7 = 0
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x012b }
            goto L_0x013b
        L_0x012b:
            r13 = move-exception
            r3 = r13
            j0.c r0 = p126j0.C8266c.f11641a
            bo.app.r1 r1 = f2457a
            j0.c$a r2 = p126j0.C8266c.C8267a.f11649e
            bo.app.r1$m r5 = p042bo.app.C3605r1.C3618m.f2470b
            r4 = 0
            r6 = 4
            r7 = 0
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3605r1.m3749b(android.content.Context, java.util.List, android.app.PendingIntent):void");
    }

    /* renamed from: c */
    private final void m3752c(Context context, List<C7208a> list) {
        SharedPreferences.Editor edit = m3747b(context).edit();
        for (C7208a next : list) {
            edit.putString(next.getId(), next.forJsonPut().toString());
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3631z(next), 6, (Object) null);
        }
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3745a(C3830z1 z1Var, Void voidR) {
        C12775o.m28639i(z1Var, "$resultListener");
        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11650f, (Throwable) null, false, C3628w.f2480b, 6, (Object) null);
        z1Var.mo29256a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3744a(C3830z1 z1Var, Exception exc) {
        C12775o.m28639i(z1Var, "$resultListener");
        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11649e, exc, false, C3629x.f2481b, 4, (Object) null);
        z1Var.mo29256a(false);
    }

    /* renamed from: a */
    public static final void m3739a(Context context) {
        C12775o.m28639i(context, "context");
        C8266c cVar = C8266c.f11641a;
        C3605r1 r1Var = f2457a;
        C8266c.m16396e(cVar, r1Var, (C8266c.C8267a) null, (Throwable) null, false, C3606a.f2458b, 7, (Object) null);
        r1Var.m3747b(context).edit().clear().apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3743a(Context context, List list, Void voidR) {
        C12775o.m28639i(context, "$context");
        C12775o.m28639i(list, "$newGeofencesToRegister");
        C8266c cVar = C8266c.f11641a;
        C3605r1 r1Var = f2457a;
        C8266c.m16396e(cVar, r1Var, (C8266c.C8267a) null, (Throwable) null, false, C3607b.f2459b, 7, (Object) null);
        r1Var.m3752c(context, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3746a(Exception exc) {
        Exception exc2 = exc;
        if (exc2 instanceof ApiException) {
            int b = ((ApiException) exc2).mo32366b();
            if (b != 0) {
                switch (b) {
                    case 1000:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3610e(b), 6, (Object) null);
                        return;
                    case 1001:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3608c(b), 6, (Object) null);
                        return;
                    case PointerIconCompat.TYPE_HAND:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3609d(b), 6, (Object) null);
                        return;
                    default:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3612g(b), 6, (Object) null);
                        return;
                }
            } else {
                C8266c.m16396e(C8266c.f11641a, f2457a, (C8266c.C8267a) null, (Throwable) null, false, C3611f.f2463b, 7, (Object) null);
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11649e, exc, false, C3613h.f2465b, 4, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m3741a(Context context, List<String> list) {
        SharedPreferences.Editor edit = m3747b(context).edit();
        for (String next : list) {
            edit.remove(next);
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3619n(next), 6, (Object) null);
        }
        edit.apply();
    }

    /* renamed from: b */
    private final void m3748b(Context context, List<String> list) {
        LocationServices.getGeofencingClient(context).removeGeofences(list).mo35456g(new C3518o7(context, list)).mo35454e(new C3564p7());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m3750b(Context context, List list, Void voidR) {
        C12775o.m28639i(context, "$context");
        C12775o.m28639i(list, "$obsoleteGeofenceIds");
        C8266c cVar = C8266c.f11641a;
        C3605r1 r1Var = f2457a;
        C8266c.m16396e(cVar, r1Var, (C8266c.C8267a) null, (Throwable) null, false, C3620o.f2472b, 7, (Object) null);
        r1Var.m3741a(context, (List<String>) list);
    }

    /* renamed from: a */
    private final void m3742a(Context context, List<C7208a> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList(C12728x.m28544v(list, 10));
        for (C7208a i0 : list) {
            arrayList.add(i0.mo40763i0());
        }
        GeofencingRequest build = new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(0).build();
        C12775o.m28638h(build, "Builder()\n            .a…r(0)\n            .build()");
        LocationServices.getGeofencingClient(context).addGeofences(build, pendingIntent).mo35456g(new C3450m7(context, list)).mo35454e(new C3480n7());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m3751b(Exception exc) {
        Exception exc2 = exc;
        if (exc2 instanceof ApiException) {
            int b = ((ApiException) exc2).mo32366b();
            if (b != 0) {
                switch (b) {
                    case 1000:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3623r(b), 6, (Object) null);
                        return;
                    case 1001:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3621p(b), 6, (Object) null);
                        return;
                    case PointerIconCompat.TYPE_HAND:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3622q(b), 6, (Object) null);
                        return;
                    default:
                        C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3625t(b), 6, (Object) null);
                        return;
                }
            } else {
                C8266c.m16396e(C8266c.f11641a, f2457a, (C8266c.C8267a) null, (Throwable) null, false, C3624s.f2476b, 7, (Object) null);
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, f2457a, C8266c.C8267a.f11649e, exc, false, C3626u.f2478b, 4, (Object) null);
        }
    }

    /* renamed from: b */
    private final SharedPreferences m3747b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.geofences", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ON, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
