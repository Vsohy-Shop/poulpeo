package p042bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.braze.receivers.BrazeActionReceiver;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p126j0.C8275f;
import p404of.C13074a;

/* renamed from: bo.app.p1 */
public final class C3545p1 {

    /* renamed from: a */
    public static final C3545p1 f2365a = new C3545p1();

    /* renamed from: bo.app.p1$a */
    static final class C3546a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3546a f2366b = new C3546a();

        C3546a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled in server configuration.";
        }
    }

    /* renamed from: bo.app.p1$b */
    static final class C3547b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3547b f2367b = new C3547b();

        C3547b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences explicitly disabled via server configuration.";
        }
    }

    /* renamed from: bo.app.p1$c */
    static final class C3548c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3548c f2368b = new C3548c();

        C3548c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences implicitly disabled via server configuration.";
        }
    }

    /* renamed from: bo.app.p1$d */
    static final class C3549d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3549d f2369b = new C3549d();

        C3549d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not find stored geofences.";
        }
    }

    /* renamed from: bo.app.p1$e */
    static final class C3550e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3550e f2370b = new C3550e();

        C3550e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to find stored geofence keys.";
        }
    }

    /* renamed from: bo.app.p1$f */
    static final class C3551f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2371b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3551f(String str) {
            super(0);
            this.f2371b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank serialized geofence string for geofence id " + this.f2371b + " from shared preferences. Not parsing.";
        }
    }

    /* renamed from: bo.app.p1$g */
    static final class C3552g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2372b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3552g(String str) {
            super(0);
            this.f2372b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered Json exception while parsing stored geofence: ", this.f2372b);
        }
    }

    /* renamed from: bo.app.p1$h */
    static final class C3553h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2373b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3553h(String str) {
            super(0);
            this.f2373b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered unexpected exception while parsing stored geofence: ", this.f2373b);
        }
    }

    private C3545p1() {
    }

    /* renamed from: a */
    public static final PendingIntent m3623a(Context context) {
        C12775o.m28639i(context, "context");
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE").setClass(context, BrazeActionReceiver.class);
        C12775o.m28638h(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, C8275f.m16442c() | 134217728);
        C12775o.m28638h(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    /* renamed from: b */
    public static final PendingIntent m3627b(Context context) {
        C12775o.m28639i(context, "context");
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE").setClass(context, BrazeActionReceiver.class);
        C12775o.m28638h(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, C8275f.m16442c() | 134217728);
        C12775o.m28638h(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    /* renamed from: a */
    public static final boolean m3625a(C3119e5 e5Var) {
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        if (!e5Var.mo28876q()) {
            C8266c.m16396e(C8266c.f11641a, f2365a, C8266c.C8267a.I, (Throwable) null, false, C3548c.f2368b, 6, (Object) null);
            return false;
        } else if (e5Var.mo28875p()) {
            C8266c.m16396e(C8266c.f11641a, f2365a, C8266c.C8267a.I, (Throwable) null, false, C3546a.f2366b, 6, (Object) null);
            return true;
        } else {
            C8266c.m16396e(C8266c.f11641a, f2365a, C8266c.C8267a.I, (Throwable) null, false, C3547b.f2367b, 6, (Object) null);
            return false;
        }
    }

    /* renamed from: b */
    public static final int m3626b(C3119e5 e5Var) {
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        if (e5Var.mo28866g() > 0) {
            return e5Var.mo28866g();
        }
        return 20;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<p057d0.C7208a> m3624a(android.content.SharedPreferences r15) {
        /*
            java.lang.String r0 = "sharedPreferences"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r1 = r15.getAll()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r4 == 0) goto L_0x002d
            j0.c r5 = p126j0.C8266c.f11641a
            bo.app.p1 r6 = f2365a
            bo.app.p1$d r10 = p042bo.app.C3545p1.C3549d.f2369b
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r12 = 0
            p126j0.C8266c.m16396e(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x002d:
            java.util.Set r1 = r1.keySet()
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0047
            j0.c r5 = p126j0.C8266c.f11641a
            bo.app.p1 r6 = f2365a
            j0.c$a r7 = p126j0.C8266c.C8267a.f11651g
            bo.app.p1$e r10 = p042bo.app.C3545p1.C3550e.f2370b
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            p126j0.C8266c.m16396e(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0047:
            java.util.Iterator r1 = r1.iterator()
        L_0x004b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            java.lang.String r5 = r15.getString(r4, r5)
            if (r5 == 0) goto L_0x006d
            boolean r6 = p454wf.C13754v.m31532t(r5)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            if (r6 == 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            r6 = r2
            goto L_0x006e
        L_0x0067:
            r4 = move-exception
            r9 = r4
            goto L_0x0091
        L_0x006a:
            r4 = move-exception
            r9 = r4
            goto L_0x00a3
        L_0x006d:
            r6 = r3
        L_0x006e:
            if (r6 == 0) goto L_0x0083
            j0.c r7 = p126j0.C8266c.f11641a     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            bo.app.p1 r8 = f2365a     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            j0.c$a r9 = p126j0.C8266c.C8267a.f11651g     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r10 = 0
            r11 = 0
            bo.app.p1$f r12 = new bo.app.p1$f     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r12.<init>(r4)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r13 = 6
            r14 = 0
            p126j0.C8266c.m16396e(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            goto L_0x004b
        L_0x0083:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            d0.a r6 = new d0.a     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            r0.add(r6)     // Catch:{ JSONException -> 0x006a, Exception -> 0x0067 }
            goto L_0x004b
        L_0x0091:
            j0.c r6 = p126j0.C8266c.f11641a
            bo.app.p1 r7 = f2365a
            j0.c$a r8 = p126j0.C8266c.C8267a.f11649e
            bo.app.p1$h r11 = new bo.app.p1$h
            r11.<init>(r5)
            r10 = 0
            r12 = 4
            r13 = 0
            p126j0.C8266c.m16396e(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004b
        L_0x00a3:
            j0.c r6 = p126j0.C8266c.f11641a
            bo.app.p1 r7 = f2365a
            j0.c$a r8 = p126j0.C8266c.C8267a.f11649e
            bo.app.p1$g r11 = new bo.app.p1$g
            r11.<init>(r5)
            r10 = 0
            r12 = 4
            r13 = 0
            p126j0.C8266c.m16396e(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004b
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3545p1.m3624a(android.content.SharedPreferences):java.util.List");
    }
}
