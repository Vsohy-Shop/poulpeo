package p042bo.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.c5 */
public final class C3046c5 {

    /* renamed from: p */
    public static final C3047a f1539p = new C3047a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private long f1540a;

    /* renamed from: b */
    private Set<String> f1541b;

    /* renamed from: c */
    private Set<String> f1542c;

    /* renamed from: d */
    private Set<String> f1543d;

    /* renamed from: e */
    private int f1544e;

    /* renamed from: f */
    private int f1545f;

    /* renamed from: g */
    private int f1546g;

    /* renamed from: h */
    private boolean f1547h;

    /* renamed from: i */
    private boolean f1548i;

    /* renamed from: j */
    private boolean f1549j;

    /* renamed from: k */
    private long f1550k;

    /* renamed from: l */
    private boolean f1551l;

    /* renamed from: m */
    private boolean f1552m;

    /* renamed from: n */
    private boolean f1553n;

    /* renamed from: o */
    private int f1554o;

    /* renamed from: bo.app.c5$a */
    public static final class C3047a {
        public /* synthetic */ C3047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3047a() {
        }
    }

    /* renamed from: bo.app.c5$b */
    static final class C3048b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3048b f1555b = new C3048b();

        C3048b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.c5$c */
    static final class C3049c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3049c f1556b = new C3049c();

        C3049c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.c5$d */
    static final class C3050d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3050d f1557b = new C3050d();

        C3050d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required feature flag fields. Disabling feature flags.";
        }
    }

    /* renamed from: bo.app.c5$e */
    static final class C3051e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3051e f1558b = new C3051e();

        C3051e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    /* renamed from: bo.app.c5$f */
    static final class C3052f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3052f f1559b = new C3052f();

        C3052f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error getting required test user fields. Using defaults";
        }
    }

    /* renamed from: bo.app.c5$g */
    public static final class C3053g extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1560b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3053g(JSONArray jSONArray) {
            super(1);
            this.f1560b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo28757a(int i) {
            return Boolean.valueOf(this.f1560b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28757a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.c5$h */
    public static final class C3054h extends C12777p implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1561b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3054h(JSONArray jSONArray) {
            super(1);
            this.f1561b = jSONArray;
        }

        /* renamed from: a */
        public final String mo28758a(int i) {
            Object obj = this.f1561b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28758a(((Number) obj).intValue());
        }
    }

    public C3046c5(long j, Set<String> set, Set<String> set2, Set<String> set3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, boolean z6, int i4) {
        this.f1540a = j;
        this.f1541b = set;
        this.f1542c = set2;
        this.f1543d = set3;
        this.f1544e = i;
        this.f1545f = i2;
        this.f1546g = i3;
        this.f1547h = z;
        this.f1548i = z2;
        this.f1549j = z3;
        this.f1550k = j2;
        this.f1551l = z4;
        this.f1552m = z5;
        this.f1553n = z6;
        this.f1554o = i4;
    }

    /* renamed from: a */
    public final void mo28724a(long j) {
        this.f1540a = j;
    }

    /* renamed from: b */
    public final Set<String> mo28727b() {
        return this.f1541b;
    }

    /* renamed from: c */
    public final Set<String> mo28732c() {
        return this.f1543d;
    }

    /* renamed from: d */
    public final long mo28736d() {
        return this.f1540a;
    }

    /* renamed from: e */
    public final void mo28739e(boolean z) {
        this.f1547h = z;
    }

    /* renamed from: f */
    public final void mo28741f(boolean z) {
        this.f1551l = z;
    }

    /* renamed from: g */
    public final int mo28743g() {
        return this.f1554o;
    }

    /* renamed from: h */
    public final boolean mo28744h() {
        return this.f1548i;
    }

    /* renamed from: i */
    public final boolean mo28745i() {
        return this.f1547h;
    }

    /* renamed from: j */
    public final int mo28746j() {
        return this.f1546g;
    }

    /* renamed from: k */
    public final long mo28747k() {
        return this.f1550k;
    }

    /* renamed from: l */
    public final int mo28748l() {
        return this.f1545f;
    }

    /* renamed from: m */
    public final int mo28749m() {
        return this.f1544e;
    }

    /* renamed from: n */
    public final boolean mo28750n() {
        return this.f1551l;
    }

    /* renamed from: o */
    public final boolean mo28751o() {
        return this.f1549j;
    }

    /* renamed from: a */
    public final Set<String> mo28722a() {
        return this.f1542c;
    }

    /* renamed from: b */
    public final void mo28730b(Set<String> set) {
        this.f1541b = set;
    }

    /* renamed from: c */
    public final void mo28734c(Set<String> set) {
        this.f1543d = set;
    }

    /* renamed from: d */
    public final void mo28737d(int i) {
        this.f1544e = i;
    }

    /* renamed from: e */
    public final boolean mo28740e() {
        return this.f1552m;
    }

    /* renamed from: f */
    public final boolean mo28742f() {
        return this.f1553n;
    }

    /* renamed from: e */
    private final void m2711e(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.f1544e = optJSONObject.getInt("min_time_since_last_request");
                this.f1545f = optJSONObject.getInt("min_time_since_last_report");
                this.f1548i = optJSONObject.getBoolean("enabled");
                this.f1547h = true;
                this.f1546g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3051e.f1558b, 4, (Object) null);
                this.f1544e = -1;
                this.f1545f = -1;
                this.f1546g = -1;
                this.f1548i = false;
                this.f1547h = false;
            }
        }
    }

    /* renamed from: f */
    private final void m2712f(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("test_user");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("device_logging_enabled");
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3052f.f1559b, 4, (Object) null);
                z = false;
            }
            this.f1551l = z;
        }
    }

    /* renamed from: a */
    public final void mo28725a(Set<String> set) {
        this.f1542c = set;
    }

    /* renamed from: b */
    public final void mo28728b(int i) {
        this.f1546g = i;
    }

    /* renamed from: c */
    public final void mo28733c(int i) {
        this.f1545f = i;
    }

    /* renamed from: d */
    public final void mo28738d(boolean z) {
        this.f1548i = z;
    }

    /* renamed from: d */
    private final void m2710d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.f1553n = optJSONObject.optBoolean("enabled");
                this.f1554o = optJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3050d.f1557b, 4, (Object) null);
                this.f1553n = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo28726a(boolean z) {
        this.f1549j = z;
    }

    /* renamed from: b */
    public final void mo28729b(long j) {
        this.f1550k = j;
    }

    /* renamed from: c */
    public final void mo28735c(boolean z) {
        this.f1553n = z;
    }

    /* renamed from: c */
    private final void m2709c(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3049c.f1556b, 4, (Object) null);
                z = false;
            }
            mo28731b(z);
        }
    }

    /* renamed from: a */
    public final void mo28723a(int i) {
        this.f1554o = i;
    }

    /* renamed from: b */
    public final void mo28731b(boolean z) {
        this.f1552m = z;
    }

    /* renamed from: a */
    private final void m2707a(JSONObject jSONObject) {
        this.f1541b = m2706a(jSONObject, "events_blacklist");
        this.f1542c = m2706a(jSONObject, "attributes_blacklist");
        this.f1543d = m2706a(jSONObject, "purchases_blacklist");
    }

    /* renamed from: b */
    private final void m2708b(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3048b.f1555b, 4, (Object) null);
                z = false;
            }
            this.f1549j = z;
        }
    }

    /* renamed from: a */
    private final Set<String> m2706a(JSONObject jSONObject, String str) {
        Iterator it;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                it = C12726w.m28524k().iterator();
            } else {
                it = C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, optJSONArray.length())), new C3053g(optJSONArray)), new C3054h(optJSONArray)).iterator();
            }
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3046c5(long r17, java.util.Set r19, java.util.Set r20, java.util.Set r21, int r22, int r23, int r24, boolean r25, boolean r26, boolean r27, long r28, boolean r30, boolean r31, boolean r32, int r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r16 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r19
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r4
            goto L_0x001c
        L_0x001a:
            r5 = r20
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = r21
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = -1
            goto L_0x002b
        L_0x0029:
            r6 = r22
        L_0x002b:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0031
            r8 = -1
            goto L_0x0033
        L_0x0031:
            r8 = r23
        L_0x0033:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0039
            r9 = -1
            goto L_0x003b
        L_0x0039:
            r9 = r24
        L_0x003b:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0041
            r10 = 0
            goto L_0x0043
        L_0x0041:
            r10 = r25
        L_0x0043:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0049
            r12 = 0
            goto L_0x004b
        L_0x0049:
            r12 = r26
        L_0x004b:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0051
            r13 = 0
            goto L_0x0053
        L_0x0051:
            r13 = r27
        L_0x0053:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005a
            r14 = -1
            goto L_0x005c
        L_0x005a:
            r14 = r28
        L_0x005c:
            r7 = r0 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0062
            r7 = 0
            goto L_0x0064
        L_0x0062:
            r7 = r30
        L_0x0064:
            r11 = r0 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x006a
            r11 = 0
            goto L_0x006c
        L_0x006a:
            r11 = r31
        L_0x006c:
            r35 = r11
            r11 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0074
            r11 = 0
            goto L_0x0076
        L_0x0074:
            r11 = r32
        L_0x0076:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007c
            r0 = -1
            goto L_0x007e
        L_0x007c:
            r0 = r33
        L_0x007e:
            r17 = r16
            r18 = r1
            r20 = r3
            r21 = r5
            r22 = r4
            r23 = r6
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r12
            r28 = r13
            r29 = r14
            r31 = r7
            r32 = r35
            r33 = r11
            r34 = r0
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3046c5.<init>(long, java.util.Set, java.util.Set, java.util.Set, int, int, int, boolean, boolean, boolean, long, boolean, boolean, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3046c5(JSONObject jSONObject) {
        this(0, (Set) null, (Set) null, (Set) null, 0, 0, 0, false, false, false, 0, false, false, false, 0, 32767, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        JSONObject jSONObject2 = jSONObject;
        this.f1540a = jSONObject2.optLong("time", 0);
        this.f1550k = jSONObject2.optLong("messaging_session_timeout", -1);
        m2707a(jSONObject);
        m2708b(jSONObject);
        m2711e(jSONObject);
        m2712f(jSONObject);
        m2709c(jSONObject);
        m2710d(jSONObject);
    }
}
