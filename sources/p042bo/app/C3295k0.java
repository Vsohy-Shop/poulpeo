package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.k0 */
public final class C3295k0 extends C2956a<C3274j0> {

    /* renamed from: e */
    public static final C3296a f1955e = new C3296a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C4218b f1956b;

    /* renamed from: c */
    private final SharedPreferences f1957c;

    /* renamed from: d */
    private C3274j0 f1958d;

    /* renamed from: bo.app.k0$a */
    public static final class C3296a {
        public /* synthetic */ C3296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3296a() {
        }
    }

    /* renamed from: bo.app.k0$b */
    static final class C3297b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3297b f1959b = new C3297b();

        C3297b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking device cache.";
        }
    }

    /* renamed from: bo.app.k0$c */
    static final class C3298c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3298c f1960b = new C3298c();

        C3298c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Device object cache cleared.";
        }
    }

    /* renamed from: bo.app.k0$d */
    static final class C3299d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3299d f1961b = new C3299d();

        C3299d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking Json objects.";
        }
    }

    /* renamed from: bo.app.k0$e */
    static final class C3300e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3300e f1962b = new C3300e();

        C3300e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.";
        }
    }

    /* renamed from: bo.app.k0$f */
    static final class C3301f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3301f f1963b = new C3301f();

        C3301f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device. Returning the whole device.";
        }
    }

    /* renamed from: bo.app.k0$g */
    static final class C3302g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3302g f1964b = new C3302g();

        C3302g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Sending full device due to NOTIFICATIONS_ENABLED true";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3295k0(Context context, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final void mo29172a(C3274j0 j0Var) {
        this.f1958d = j0Var;
    }

    /* renamed from: e */
    public final void mo29174e() {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3298c.f1960b, 6, (Object) null);
        this.f1957c.edit().clear().apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r2.hasNext() == true) goto L_0x004c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p042bo.app.C3274j0 mo28514d() {
        /*
            r15 = this;
            java.lang.String r0 = "{}"
            bo.app.j0 r1 = r15.f1958d
            r2 = 0
            if (r1 != 0) goto L_0x0009
            r1 = r2
            goto L_0x000d
        L_0x0009:
            org.json.JSONObject r1 = r1.forJsonPut()
        L_0x000d:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0025 }
            android.content.SharedPreferences r5 = r15.f1957c     // Catch:{ JSONException -> 0x0025 }
            java.lang.String r6 = "cached_device"
            java.lang.String r5 = r5.getString(r6, r0)     // Catch:{ JSONException -> 0x0025 }
            if (r5 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r5
        L_0x0020:
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0025 }
            r3 = r4
            goto L_0x0034
        L_0x0025:
            r0 = move-exception
            r7 = r0
            j0.c r4 = p126j0.C8266c.f11641a
            j0.c$a r6 = p126j0.C8266c.C8267a.f11649e
            bo.app.k0$d r9 = p042bo.app.C3295k0.C3299d.f1961b
            r8 = 0
            r10 = 4
            r11 = 0
            r5 = r15
            p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0034:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r1 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            java.util.Iterator r2 = r1.keys()
        L_0x0040:
            if (r2 != 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            boolean r4 = r2.hasNext()
            r5 = 1
            if (r4 != r5) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.opt(r4)
            java.lang.Object r6 = r3.opt(r4)
            if (r5 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            boolean r7 = r5 instanceof org.json.JSONObject
            if (r7 == 0) goto L_0x0086
            if (r6 == 0) goto L_0x0070
            r7 = r5
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0074 }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0074 }
            boolean r6 = p126j0.C8278g.m16447a(r7, r6)     // Catch:{ JSONException -> 0x0074 }
            if (r6 != 0) goto L_0x0040
        L_0x0070:
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0040
        L_0x0074:
            r0 = move-exception
            r4 = r0
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e
            bo.app.k0$e r6 = p042bo.app.C3295k0.C3300e.f1962b
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r15
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            bo.app.j0 r0 = r15.f1958d
            return r0
        L_0x0086:
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r5, r6)
            if (r6 != 0) goto L_0x0040
            r0.put(r4, r5)     // Catch:{ JSONException -> 0x0090 }
            goto L_0x0040
        L_0x0090:
            r10 = move-exception
            j0.c r7 = p126j0.C8266c.f11641a
            j0.c$a r9 = p126j0.C8266c.C8267a.f11649e
            bo.app.k0$f r12 = p042bo.app.C3295k0.C3301f.f1963b
            r11 = 0
            r13 = 4
            r14 = 0
            r8 = r15
            p126j0.C8266c.m16396e(r7, r8, r9, r10, r11, r12, r13, r14)
            bo.app.j0 r0 = r15.f1958d
            return r0
        L_0x00a1:
            if (r1 == 0) goto L_0x00c6
            com.appboy.enums.DeviceKey r2 = com.appboy.enums.DeviceKey.NOTIFICATIONS_ENABLED
            java.lang.String r2 = r2.getKey()
            boolean r2 = r0.optBoolean(r2)
            if (r2 == 0) goto L_0x00c6
            j0.c r3 = p126j0.C8266c.f11641a
            j0.c$a r5 = p126j0.C8266c.C8267a.f11650f
            bo.app.k0$g r8 = p042bo.app.C3295k0.C3302g.f1964b
            r6 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            r4 = r15
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)
            bo.app.j0$b r0 = p042bo.app.C3274j0.f1903m
            com.braze.configuration.b r2 = r15.f1956b
            bo.app.j0 r0 = r0.mo29137a(r2, r1)
            goto L_0x00ce
        L_0x00c6:
            bo.app.j0$b r1 = p042bo.app.C3274j0.f1903m
            com.braze.configuration.b r2 = r15.f1956b
            bo.app.j0 r0 = r1.mo29137a(r2, r0)
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3295k0.mo28514d():bo.app.j0");
    }

    public C3295k0(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        this.f1956b = new C4218b(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.device_cache.v3", C8300j.m16489c(context, str, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f1957c = sharedPreferences;
    }

    /* renamed from: a */
    public void mo28511b(C3274j0 j0Var, boolean z) {
        String str = "{}";
        C12775o.m28639i(j0Var, "outboundObject");
        if (z) {
            try {
                String string = this.f1957c.getString("cached_device", str);
                if (string != null) {
                    str = string;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject w = j0Var.forJsonPut();
                SharedPreferences.Editor edit = this.f1957c.edit();
                edit.putString("cached_device", C8278g.m16458l(jSONObject, w).toString());
                edit.apply();
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3297b.f1959b, 4, (Object) null);
            }
        }
    }
}
