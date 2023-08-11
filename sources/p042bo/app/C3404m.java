package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7208a;
import p126j0.C8266c;
import p404of.C13074a;
import p454wf.C13735j;

/* renamed from: bo.app.m */
public final class C3404m {

    /* renamed from: i */
    public static final C3405a f2117i = new C3405a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SharedPreferences f2118a;

    /* renamed from: b */
    public final SharedPreferences f2119b;

    /* renamed from: c */
    public final Map<String, Long> f2120c;

    /* renamed from: d */
    private final AtomicBoolean f2121d = new AtomicBoolean(false);

    /* renamed from: e */
    public long f2122e;

    /* renamed from: f */
    public long f2123f;

    /* renamed from: g */
    public int f2124g;

    /* renamed from: h */
    public int f2125h;

    /* renamed from: bo.app.m$a */
    public static final class C3405a {
        public /* synthetic */ C3405a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3405a() {
        }
    }

    /* renamed from: bo.app.m$b */
    static final class C3406b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2126b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3406b(int i) {
            super(0);
            this.f2126b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Min time since last geofence request reset via server configuration: " + this.f2126b + '.';
        }
    }

    /* renamed from: bo.app.m$c */
    static final class C3407c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ int f2127b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3407c(int i) {
            super(0);
            this.f2127b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Min time since last geofence report reset via server configuration: " + this.f2127b + '.';
        }
    }

    /* renamed from: bo.app.m$d */
    static final class C3408d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3404m f2128b;

        /* renamed from: c */
        final /* synthetic */ String f2129c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3408d(C3404m mVar, String str) {
            super(0);
            this.f2128b = mVar;
            this.f2129c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Retrieving geofence id ");
            C3404m mVar = this.f2128b;
            String str = this.f2129c;
            C12775o.m28638h(str, "reEligibilityId");
            sb.append(mVar.mo29317a(str));
            sb.append(" eligibility information from local storage.");
            return sb.toString();
        }
    }

    /* renamed from: bo.app.m$e */
    static final class C3409e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2130b;

        /* renamed from: c */
        final /* synthetic */ C3404m f2131c;

        /* renamed from: d */
        final /* synthetic */ String f2132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3409e(long j, C3404m mVar, String str) {
            super(0);
            this.f2130b = j;
            this.f2131c = mVar;
            this.f2132d = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f2130b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f2131c.f2125h + "). id:" + this.f2132d;
        }
    }

    /* renamed from: bo.app.m$f */
    static final class C3410f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2133b;

        /* renamed from: c */
        final /* synthetic */ int f2134c;

        /* renamed from: d */
        final /* synthetic */ String f2135d;

        /* renamed from: e */
        final /* synthetic */ C3501o1 f2136e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3410f(long j, int i, String str, C3501o1 o1Var) {
            super(0);
            this.f2133b = j;
            this.f2134c = i;
            this.f2135d = str;
            this.f2136e = o1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f2133b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f2134c + "). id:" + this.f2135d + " transition:" + this.f2136e;
        }
    }

    /* renamed from: bo.app.m$g */
    static final class C3411g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2137b;

        /* renamed from: c */
        final /* synthetic */ int f2138c;

        /* renamed from: d */
        final /* synthetic */ String f2139d;

        /* renamed from: e */
        final /* synthetic */ C3501o1 f2140e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3411g(long j, int i, String str, C3501o1 o1Var) {
            super(0);
            this.f2137b = j;
            this.f2138c = i;
            this.f2139d = str;
            this.f2140e = o1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f2137b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f2138c + "). id:" + this.f2139d + " transition:" + this.f2140e;
        }
    }

    /* renamed from: bo.app.m$h */
    static final class C3412h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2141b;

        /* renamed from: c */
        final /* synthetic */ C3501o1 f2142c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3412h(String str, C3501o1 o1Var) {
            super(0);
            this.f2141b = str;
            this.f2142c = o1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + this.f2141b + " transition:" + this.f2142c;
        }
    }

    /* renamed from: bo.app.m$i */
    static final class C3413i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2143b;

        /* renamed from: c */
        final /* synthetic */ C3404m f2144c;

        /* renamed from: d */
        final /* synthetic */ String f2145d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3413i(long j, C3404m mVar, String str) {
            super(0);
            this.f2143b = j;
            this.f2144c = mVar;
            this.f2145d = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence report eligible since " + this.f2143b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f2144c.f2125h + "). id:" + this.f2145d;
        }
    }

    /* renamed from: bo.app.m$j */
    static final class C3414j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2146b;

        /* renamed from: c */
        final /* synthetic */ C3404m f2147c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3414j(long j, C3404m mVar) {
            super(0);
            this.f2146b = j;
            this.f2147c = mVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence request suppressed since only " + this.f2146b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f2147c.f2124g + ").";
        }
    }

    /* renamed from: bo.app.m$k */
    static final class C3415k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2148b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3415k(long j) {
            super(0);
            this.f2148b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Ignoring rate limit for this geofence request. Elapsed time since last request:", Long.valueOf(this.f2148b));
        }
    }

    /* renamed from: bo.app.m$l */
    static final class C3416l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2149b;

        /* renamed from: c */
        final /* synthetic */ C3404m f2150c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3416l(long j, C3404m mVar) {
            super(0);
            this.f2149b = j;
            this.f2150c = mVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f2149b + " seconds have passed since the last time geofences were requested (minimum interval: " + this.f2150c.f2124g + ").";
        }
    }

    /* renamed from: bo.app.m$m */
    static final class C3417m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3417m f2151b = new C3417m();

        C3417m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    /* renamed from: bo.app.m$n */
    static final class C3418n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3418n f2152b = new C3418n();

        C3418n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    /* renamed from: bo.app.m$o */
    static final class C3419o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2153b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3419o(String str) {
            super(0);
            this.f2153b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Exception trying to parse re-eligibility id: ", this.f2153b);
        }
    }

    /* renamed from: bo.app.m$p */
    static final class C3420p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2154b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3420p(String str) {
            super(0);
            this.f2154b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting outdated id " + this.f2154b + " from re-eligibility list.";
        }
    }

    /* renamed from: bo.app.m$q */
    static final class C3421q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2155b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3421q(String str) {
            super(0);
            this.f2155b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Retaining id " + this.f2155b + " in re-eligibility list.";
        }
    }

    /* renamed from: bo.app.m$r */
    static final class C3422r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2156b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3422r(long j) {
            super(0);
            this.f2156b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Updating the last successful location request time to: ", Long.valueOf(this.f2156b));
        }
    }

    public C3404m(Context context, String str, C3119e5 e5Var, C3285j2 j2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "apiKey");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(j2Var, "internalIEventMessenger");
        j2Var.mo29153a(new C3292j7(this), C3236i5.class);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.managers.geofences.eligibility.global.", str), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f2118a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(C12775o.m28647q("com.appboy.managers.geofences.eligibility.individual.", str), 0);
        C12775o.m28638h(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f2119b = sharedPreferences2;
        this.f2120c = mo29319a(sharedPreferences2);
        this.f2122e = sharedPreferences.getLong("last_request_global", 0);
        this.f2123f = sharedPreferences.getLong("last_report_global", 0);
        this.f2124g = e5Var.mo28869j();
        this.f2125h = e5Var.mo28868i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3370a(C3404m mVar, C3236i5 i5Var) {
        C12775o.m28639i(mVar, "this$0");
        mVar.f2121d.set(false);
    }

    /* renamed from: a */
    public final void mo29322a(List<C7208a> list) {
        C12775o.m28639i(list, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7208a id : list) {
            linkedHashSet.add(id.getId());
        }
        HashSet hashSet = new HashSet(this.f2120c.keySet());
        SharedPreferences.Editor edit = this.f2119b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C12775o.m28638h(str, "reEligibilityId");
            if (!linkedHashSet.contains(mo29317a(str))) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3420p(str), 7, (Object) null);
                this.f2120c.remove(str);
                edit.remove(str);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3421q(str), 7, (Object) null);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo29323a(long j, C7208a aVar, C3501o1 o1Var) {
        long j2 = j;
        C3501o1 o1Var2 = o1Var;
        C12775o.m28639i(aVar, "geofence");
        C12775o.m28639i(o1Var2, "transitionType");
        String id = aVar.getId();
        long j3 = j2 - this.f2123f;
        if (((long) this.f2125h) > j3) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3409e(j3, this, id), 7, (Object) null);
            return false;
        }
        String a = mo29318a(id, o1Var2);
        int f0 = o1Var2 == C3501o1.ENTER ? aVar.mo40757f0() : aVar.mo40758g0();
        if (this.f2120c.containsKey(a)) {
            Long l = this.f2120c.get(a);
            if (l != null) {
                long longValue = j2 - l.longValue();
                if (((long) f0) > longValue) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3410f(longValue, f0, id, o1Var), 7, (Object) null);
                    return false;
                }
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3411g(longValue, f0, id, o1Var), 7, (Object) null);
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3412h(id, o1Var2), 7, (Object) null);
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3413i(j3, this, id), 7, (Object) null);
        this.f2120c.put(a, Long.valueOf(j));
        this.f2119b.edit().putLong(a, j2).apply();
        this.f2123f = j2;
        this.f2118a.edit().putLong("last_report_global", j2).apply();
        return true;
    }

    /* renamed from: a */
    public final boolean mo29324a(boolean z, long j) {
        long j2 = j - this.f2122e;
        if (z || ((long) this.f2124g) <= j2) {
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3415k(j2), 7, (Object) null);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3416l(j2, this), 7, (Object) null);
            }
            if (this.f2121d.compareAndSet(false, true)) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3417m.f2151b, 7, (Object) null);
                return true;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3418n.f2152b, 7, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3414j(j2, this), 7, (Object) null);
        return false;
    }

    /* renamed from: a */
    public final void mo29320a(long j) {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3422r(j), 7, (Object) null);
        this.f2122e = j;
        this.f2118a.edit().putLong("last_request_global", this.f2122e).apply();
    }

    /* renamed from: a */
    public final String mo29317a(String str) {
        C12775o.m28639i(str, "reEligibilityId");
        try {
            return new C13735j("_").mo53415h(str, 2).get(1);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3419o(str), 4, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo29318a(String str, C3501o1 o1Var) {
        C12775o.m28639i(str, "geofenceId");
        C12775o.m28639i(o1Var, "transitionType");
        StringBuilder sb = new StringBuilder();
        String str2 = o1Var.toString();
        Locale locale = Locale.US;
        C12775o.m28638h(locale, "US");
        String lowerCase = str2.toLowerCase(locale);
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        sb.append('_');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo29321a(C3046c5 c5Var) {
        C12775o.m28639i(c5Var, "serverConfig");
        int m = c5Var.mo28749m();
        if (m >= 0) {
            this.f2124g = m;
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3406b(m), 6, (Object) null);
        }
        int l = c5Var.mo28748l();
        if (l >= 0) {
            this.f2125h = l;
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3407c(l), 6, (Object) null);
        }
    }

    /* renamed from: a */
    public final Map<String, Long> mo29319a(SharedPreferences sharedPreferences) {
        C12775o.m28639i(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            return concurrentHashMap;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            return concurrentHashMap;
        }
        for (String next : keySet) {
            long j = sharedPreferences.getLong(next, 0);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3408d(this, next), 7, (Object) null);
            C12775o.m28638h(next, "reEligibilityId");
            concurrentHashMap.put(next, Long.valueOf(j));
        }
        return concurrentHashMap;
    }
}
