package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import p031b0.C2809e;
import p057d0.C7210b;
import p126j0.C8266c;
import p126j0.C8273e;
import p404of.C13074a;

/* renamed from: bo.app.e1 */
public final class C3107e1 {

    /* renamed from: f */
    public static final C3108a f1650f = new C3108a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3119e5 f1651a;

    /* renamed from: b */
    private final C3023b2 f1652b;

    /* renamed from: c */
    private List<C7210b> f1653c = C12726w.m28524k();

    /* renamed from: d */
    private final SharedPreferences f1654d;

    /* renamed from: e */
    private final SharedPreferences f1655e;

    /* renamed from: bo.app.e1$a */
    public static final class C3108a {
        public /* synthetic */ C3108a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3108a() {
        }
    }

    /* renamed from: bo.app.e1$b */
    static final class C3109b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3109b f1656b = new C3109b();

        C3109b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not find stored feature flags.";
        }
    }

    /* renamed from: bo.app.e1$c */
    static final class C3110c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3110c f1657b = new C3110c();

        C3110c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to find stored feature flag keys.";
        }
    }

    /* renamed from: bo.app.e1$d */
    static final class C3111d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1658b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3111d(String str) {
            super(0);
            this.f1658b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank serialized feature flag string for feature flag id " + this.f1658b + " from shared preferences. Not parsing.";
        }
    }

    /* renamed from: bo.app.e1$e */
    static final class C3112e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1659b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3112e(String str) {
            super(0);
            this.f1659b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered unexpected exception while parsing stored feature flags: ", this.f1659b);
        }
    }

    /* renamed from: bo.app.e1$f */
    static final class C3113f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3113f f1660b = new C3113f();

        C3113f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not enough time has passed since last feature flags refresh. Not refreshing feature flags.";
        }
    }

    /* renamed from: bo.app.e1$g */
    static final class C3114g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C7210b f1661b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3114g(C7210b bVar) {
            super(0);
            this.f1661b = bVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error storing feature flag: " + this.f1661b + '.';
        }
    }

    /* renamed from: bo.app.e1$h */
    static final class C3115h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3115h f1662b = new C3115h();

        C3115h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Added new feature flags to local storage.";
        }
    }

    public C3107e1(Context context, String str, C3119e5 e5Var, C3023b2 b2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "apiKey");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(b2Var, "brazeManager");
        this.f1651a = e5Var;
        this.f1652b = b2Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.braze.managers.featureflags.eligibility.", str), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f1654d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(C12775o.m28647q("com.braze.managers.featureflags.storage.", str), 0);
        C12775o.m28638h(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f1655e = sharedPreferences2;
        m2835b();
    }

    /* renamed from: a */
    private final long m2833a() {
        return this.f1654d.getLong("last_refresh", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[Catch:{ Exception -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[Catch:{ Exception -> 0x0074 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2835b() {
        /*
            r16 = this;
            r9 = r16
            android.content.SharedPreferences r0 = r9.f1655e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Map r11 = r0.getAll()
            r12 = 0
            r13 = 1
            if (r11 == 0) goto L_0x001a
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = r12
            goto L_0x001b
        L_0x001a:
            r0 = r13
        L_0x001b:
            if (r0 == 0) goto L_0x0032
            j0.c r1 = p126j0.C8266c.f11641a
            bo.app.e1$b r6 = p042bo.app.C3107e1.C3109b.f1656b
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 7
            r8 = 0
            r2 = r16
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            r9.f1653c = r0
            return
        L_0x0032:
            java.util.Set r0 = r11.keySet()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0052
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11651g
            bo.app.e1$c r6 = p042bo.app.C3107e1.C3110c.f1657b
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r2 = r16
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            r9.f1653c = r0
            return
        L_0x0052:
            java.util.Iterator r14 = r0.iterator()
        L_0x0056:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r11.get(r0)
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x0077
            boolean r1 = p454wf.C13754v.m31532t(r15)     // Catch:{ Exception -> 0x0074 }
            if (r1 == 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            r1 = r12
            goto L_0x0078
        L_0x0074:
            r0 = move-exception
            r4 = r0
            goto L_0x009f
        L_0x0077:
            r1 = r13
        L_0x0078:
            if (r1 == 0) goto L_0x008d
            j0.c r1 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0074 }
            j0.c$a r3 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0074 }
            r4 = 0
            r5 = 0
            bo.app.e1$d r6 = new bo.app.e1$d     // Catch:{ Exception -> 0x0074 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0074 }
            r7 = 6
            r8 = 0
            r2 = r16
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0056
        L_0x008d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0074 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x0074 }
            bo.app.h1 r1 = p042bo.app.C3199h1.f1790a     // Catch:{ Exception -> 0x0074 }
            d0.b r0 = r1.mo28986a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x009b
            goto L_0x0056
        L_0x009b:
            r10.add(r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0056
        L_0x009f:
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e
            bo.app.e1$e r6 = new bo.app.e1$e
            r6.<init>(r15)
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r16
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0056
        L_0x00b1:
            r9.f1653c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3107e1.m2835b():void");
    }

    /* renamed from: c */
    public final void mo28846c() {
        this.f1654d.edit().putLong("last_refresh", C8273e.m16436i()).apply();
        this.f1652b.refreshFeatureFlags();
    }

    /* renamed from: d */
    public final void mo28847d() {
        if (C8273e.m16436i() - m2833a() < ((long) this.f1651a.mo28865f())) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3113f.f1660b, 6, (Object) null);
            return;
        }
        mo28846c();
    }

    /* renamed from: a */
    public final C2809e mo28844a(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "featureFlagsData");
        this.f1653c = C3199h1.f1790a.mo28987a(jSONArray);
        SharedPreferences.Editor edit = this.f1655e.edit();
        edit.clear();
        for (C7210b next : this.f1653c) {
            try {
                edit.putString(next.getId(), next.forJsonPut().toString());
            } catch (Exception e) {
                Exception exc = e;
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, exc, false, new C3114g(next), 4, (Object) null);
            }
        }
        edit.apply();
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3115h.f1662b, 7, (Object) null);
        List<C7210b> list = this.f1653c;
        ArrayList arrayList = new ArrayList(C12728x.m28544v(list, 10));
        for (C7210b e2 : list) {
            arrayList.add(e2.mo40767e());
        }
        return new C2809e(arrayList);
    }

    /* renamed from: a */
    public static /* synthetic */ List m2834a(C3107e1 e1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return e1Var.mo28845a(str);
    }

    /* renamed from: a */
    public final List<C7210b> mo28845a(String str) {
        List<C7210b> list;
        if (str != null) {
            List<C7210b> list2 = this.f1653c;
            list = new ArrayList<>();
            for (C7210b next : list2) {
                if (C12775o.m28634d(next.getId(), str)) {
                    list.add(next);
                }
            }
        } else {
            list = this.f1653c;
        }
        ArrayList arrayList = new ArrayList(C12728x.m28544v(list, 10));
        for (C7210b e : list) {
            arrayList.add(e.mo40767e());
        }
        return arrayList;
    }
}
