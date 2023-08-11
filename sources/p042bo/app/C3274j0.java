package p042bo.app;

import com.appboy.enums.DeviceKey;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p057d0.C7213c;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.j0 */
public final class C3274j0 implements C7213c<JSONObject>, C3223i2 {

    /* renamed from: m */
    public static final C3276b f1903m = new C3276b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C4218b f1904b;

    /* renamed from: c */
    private final String f1905c;

    /* renamed from: d */
    private final String f1906d;

    /* renamed from: e */
    private final String f1907e;

    /* renamed from: f */
    private final String f1908f;

    /* renamed from: g */
    private final String f1909g;

    /* renamed from: h */
    private final String f1910h;

    /* renamed from: i */
    private final Boolean f1911i;

    /* renamed from: j */
    private final Boolean f1912j;

    /* renamed from: k */
    private final String f1913k;

    /* renamed from: l */
    private final Boolean f1914l;

    /* renamed from: bo.app.j0$a */
    public static final class C3275a {

        /* renamed from: a */
        private final C4218b f1915a;

        /* renamed from: b */
        private String f1916b;

        /* renamed from: c */
        private String f1917c;

        /* renamed from: d */
        private String f1918d;

        /* renamed from: e */
        private String f1919e;

        /* renamed from: f */
        private String f1920f;

        /* renamed from: g */
        private String f1921g;

        /* renamed from: h */
        private Boolean f1922h;

        /* renamed from: i */
        private Boolean f1923i;

        /* renamed from: j */
        private String f1924j;

        /* renamed from: k */
        private Boolean f1925k;

        public C3275a(C4218b bVar) {
            C12775o.m28639i(bVar, "configurationProvider");
            this.f1915a = bVar;
        }

        /* renamed from: a */
        public final C3275a mo29127a(String str) {
            this.f1916b = str;
            return this;
        }

        /* renamed from: b */
        public final C3275a mo29130b(String str) {
            this.f1917c = str;
            return this;
        }

        /* renamed from: c */
        public final C3275a mo29131c(Boolean bool) {
            this.f1922h = bool;
            return this;
        }

        /* renamed from: d */
        public final C3275a mo29133d(String str) {
            this.f1919e = str;
            return this;
        }

        /* renamed from: e */
        public final C3275a mo29134e(String str) {
            this.f1918d = str;
            return this;
        }

        /* renamed from: f */
        public final C3275a mo29135f(String str) {
            this.f1921g = str;
            return this;
        }

        /* renamed from: g */
        public final C3275a mo29136g(String str) {
            this.f1920f = str;
            return this;
        }

        /* renamed from: a */
        public final C3275a mo29126a(Boolean bool) {
            this.f1925k = bool;
            return this;
        }

        /* renamed from: b */
        public final C3275a mo29129b(Boolean bool) {
            this.f1923i = bool;
            return this;
        }

        /* renamed from: c */
        public final C3275a mo29132c(String str) {
            this.f1924j = str;
            return this;
        }

        /* renamed from: a */
        public final C3274j0 mo29128a() {
            return new C3274j0(this.f1915a, this.f1916b, this.f1917c, this.f1918d, this.f1919e, this.f1920f, this.f1921g, this.f1922h, this.f1923i, this.f1924j, this.f1925k);
        }
    }

    /* renamed from: bo.app.j0$b */
    public static final class C3276b {

        /* renamed from: bo.app.j0$b$a */
        public /* synthetic */ class C3277a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1926a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                iArr[DeviceKey.CARRIER.ordinal()] = 2;
                iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                iArr[DeviceKey.LOCALE.ordinal()] = 5;
                iArr[DeviceKey.MODEL.ordinal()] = 6;
                iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
                iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
                iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
                iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
                f1926a = iArr;
            }
        }

        /* renamed from: bo.app.j0$b$b */
        static final class C3278b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ DeviceKey f1927b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3278b(DeviceKey deviceKey) {
                super(0);
                this.f1927b = deviceKey;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Not adding device key <" + this.f1927b + "> to export due to allowlist restrictions.";
            }
        }

        public /* synthetic */ C3276b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3274j0 mo29137a(C4218b bVar, JSONObject jSONObject) {
            C12775o.m28639i(bVar, "configurationProvider");
            C12775o.m28639i(jSONObject, "jsonObject");
            C3275a aVar = new C3275a(bVar);
            DeviceKey[] values = DeviceKey.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                DeviceKey deviceKey = values[i];
                i++;
                String key = deviceKey.getKey();
                switch (C3277a.f1926a[deviceKey.ordinal()]) {
                    case 1:
                        aVar.mo29136g(C8278g.m16455i(jSONObject, key));
                        break;
                    case 2:
                        aVar.mo29130b(C8278g.m16455i(jSONObject, key));
                        break;
                    case 3:
                        aVar.mo29127a(C8278g.m16455i(jSONObject, key));
                        break;
                    case 4:
                        aVar.mo29135f(C8278g.m16455i(jSONObject, key));
                        break;
                    case 5:
                        aVar.mo29133d(C8278g.m16455i(jSONObject, key));
                        break;
                    case 6:
                        aVar.mo29134e(C8278g.m16455i(jSONObject, key));
                        break;
                    case 7:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo29131c(Boolean.valueOf(jSONObject.optBoolean(key, true)));
                            break;
                        }
                    case 8:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo29129b(Boolean.valueOf(jSONObject.optBoolean(key, false)));
                            break;
                        }
                    case 9:
                        aVar.mo29132c(C8278g.m16455i(jSONObject, key));
                        break;
                    case 10:
                        if (!jSONObject.has(key)) {
                            break;
                        } else {
                            aVar.mo29126a(Boolean.valueOf(jSONObject.optBoolean(key)));
                            break;
                        }
                }
            }
            return aVar.mo29128a();
        }

        private C3276b() {
        }

        /* renamed from: a */
        public final void mo29138a(C4218b bVar, JSONObject jSONObject, DeviceKey deviceKey, Object obj) {
            C12775o.m28639i(bVar, "configurationProvider");
            C12775o.m28639i(jSONObject, "deviceExport");
            C12775o.m28639i(deviceKey, "exportKey");
            if (!bVar.isDeviceObjectAllowlistEnabled() || bVar.getDeviceObjectAllowlist().contains(deviceKey)) {
                jSONObject.putOpt(deviceKey.getKey(), obj);
                return;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3278b(deviceKey), 6, (Object) null);
        }
    }

    /* renamed from: bo.app.j0$c */
    static final class C3279c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3279c f1928b = new C3279c();

        C3279c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating device Json.";
        }
    }

    public C3274j0(C4218b bVar, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        C12775o.m28639i(bVar, "configurationProvider");
        this.f1904b = bVar;
        this.f1905c = str;
        this.f1906d = str2;
        this.f1907e = str3;
        this.f1908f = str4;
        this.f1909g = str5;
        this.f1910h = str6;
        this.f1911i = bool;
        this.f1912j = bool2;
        this.f1913k = str7;
        this.f1914l = bool3;
    }

    /* renamed from: e */
    public boolean mo28586e() {
        if (forJsonPut().length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo29124v() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0058 A[Catch:{ JSONException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065 A[Catch:{ JSONException -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[Catch:{ JSONException -> 0x0083 }] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            bo.app.j0$b r1 = f1903m     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.ANDROID_VERSION     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1905c     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.CARRIER     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1906d     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.MODEL     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1907e     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.RESOLUTION     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1910h     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.LOCALE     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1908f     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.NOTIFICATIONS_ENABLED     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r4 = r10.f1911i     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.IS_BACKGROUND_RESTRICTED     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r4 = r10.f1912j     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r2 = r10.f1913k     // Catch:{ JSONException -> 0x0083 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0055
            boolean r2 = p454wf.C13754v.m31532t(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x0056
        L_0x0055:
            r2 = r4
        L_0x0056:
            if (r2 != 0) goto L_0x0061
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r5 = com.appboy.enums.DeviceKey.GOOGLE_ADVERTISING_ID     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r6 = r10.f1913k     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r5, r6)     // Catch:{ JSONException -> 0x0083 }
        L_0x0061:
            java.lang.Boolean r2 = r10.f1914l     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x006c
            com.braze.configuration.b r5 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r6 = com.appboy.enums.DeviceKey.AD_TRACKING_ENABLED     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r5, r0, r6, r2)     // Catch:{ JSONException -> 0x0083 }
        L_0x006c:
            java.lang.String r2 = r10.f1909g     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0076
            boolean r2 = p454wf.C13754v.m31532t(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r2 == 0) goto L_0x0077
        L_0x0076:
            r3 = r4
        L_0x0077:
            if (r3 != 0) goto L_0x0092
            com.braze.configuration.b r2 = r10.f1904b     // Catch:{ JSONException -> 0x0083 }
            com.appboy.enums.DeviceKey r3 = com.appboy.enums.DeviceKey.TIMEZONE     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = r10.f1909g     // Catch:{ JSONException -> 0x0083 }
            r1.mo29138a(r2, r0, r3, r4)     // Catch:{ JSONException -> 0x0083 }
            goto L_0x0092
        L_0x0083:
            r1 = move-exception
            r5 = r1
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            bo.app.j0$c r7 = p042bo.app.C3274j0.C3279c.f1928b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3274j0.forJsonPut():org.json.JSONObject");
    }
}
