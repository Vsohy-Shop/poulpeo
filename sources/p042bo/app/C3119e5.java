package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import p126j0.C8266c;
import p336ef.C11906l;
import p336ef.C11921v;
import p356hg.C12088a;
import p356hg.C12096c;
import p404of.C13074a;

/* renamed from: bo.app.e5 */
public final class C3119e5 {

    /* renamed from: f */
    public static final C3120a f1666f = new C3120a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3667s2 f1667a;

    /* renamed from: b */
    private final SharedPreferences f1668b;

    /* renamed from: c */
    private final ReentrantLock f1669c = new ReentrantLock();

    /* renamed from: d */
    private final C12088a f1670d = C12096c.m26296b(false, 1, (Object) null);

    /* renamed from: e */
    private C3046c5 f1671e;

    /* renamed from: bo.app.e5$a */
    public static final class C3120a {
        public /* synthetic */ C3120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3120a() {
        }
    }

    /* renamed from: bo.app.e5$b */
    static final class C3121b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3121b f1672b = new C3121b();

        C3121b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not allowing server config info unlock. Returning null.";
        }
    }

    /* renamed from: bo.app.e5$c */
    public static final class C3122c extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1673b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3122c(JSONArray jSONArray) {
            super(1);
            this.f1673b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo28880a(int i) {
            return Boolean.valueOf(this.f1673b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28880a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.e5$d */
    public static final class C3123d extends C12777p implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1674b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3123d(JSONArray jSONArray) {
            super(1);
            this.f1674b = jSONArray;
        }

        /* renamed from: a */
        public final String mo28881a(int i) {
            Object obj = this.f1674b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28881a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.e5$e */
    static final class C3124e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3124e f1675b = new C3124e();

        C3124e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
        }
    }

    /* renamed from: bo.app.e5$f */
    static final class C3125f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3125f f1676b = new C3125f();

        C3125f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Attempting to unlock server config info.";
        }
    }

    /* renamed from: bo.app.e5$g */
    static final class C3126g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3126g f1677b = new C3126g();

        C3126g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unlocking config info lock.";
        }
    }

    /* renamed from: bo.app.e5$h */
    static final class C3127h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3127h f1678b = new C3127h();

        C3127h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Server config updated for Content Cards from disabled to enabled";
        }
    }

    /* renamed from: bo.app.e5$i */
    static final class C3128i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3128i f1679b = new C3128i();

        C3128i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    /* renamed from: bo.app.e5$j */
    static final class C3129j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3046c5 f1680b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3129j(C3046c5 c5Var) {
            super(0);
            this.f1680b = c5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Finishing updating server config to ", this.f1680b);
        }
    }

    public C3119e5(Context context, String str, C3667s2 s2Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "apiKey");
        C12775o.m28639i(s2Var, "serverConfigUpdateListener");
        this.f1667a = s2Var;
        this.f1668b = C3587q5.m3685a(context, C12775o.m28647q("com.braze.storage.server_config.", str), (String) null, 2, (Object) null);
        m2854s();
    }

    /* renamed from: s */
    private final void m2854s() {
        C3046c5 c5Var = new C3046c5(0, (Set) null, (Set) null, (Set) null, 0, 0, 0, false, false, false, 0, false, false, false, 0, 32767, (DefaultConstructorMarker) null);
        c5Var.mo28725a(mo28860b());
        c5Var.mo28730b(mo28862c());
        c5Var.mo28734c(mo28863d());
        c5Var.mo28724a(mo28864e());
        c5Var.mo28729b(mo28867h());
        c5Var.mo28737d(mo28869j());
        c5Var.mo28733c(mo28868i());
        c5Var.mo28728b(mo28866g());
        c5Var.mo28738d(mo28875p());
        c5Var.mo28739e(mo28876q());
        c5Var.mo28741f(mo28877r());
        c5Var.mo28726a(mo28872m());
        c5Var.mo28731b(mo28873n());
        c5Var.mo28735c(mo28874o());
        c5Var.mo28723a(mo28865f());
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            mo28859a(c5Var);
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final void mo28859a(C3046c5 c5Var) {
        this.f1671e = c5Var;
    }

    /* renamed from: b */
    public final Set<String> mo28860b() {
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            Set<String> a = k == null ? null : k.mo28722a();
            if (a == null) {
                a = m2853a("blacklisted_attributes");
            }
            return a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final Set<String> mo28862c() {
        Set<String> set;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                set = null;
            } else {
                set = k.mo28727b();
            }
            if (set == null) {
                set = m2853a("blacklisted_events");
            }
            return set;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public final Set<String> mo28863d() {
        Set<String> set;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                set = null;
            } else {
                set = k.mo28732c();
            }
            if (set == null) {
                set = m2853a("blacklisted_purchases");
            }
            return set;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final long mo28864e() {
        Long l;
        long j;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                l = null;
            } else {
                l = Long.valueOf(k.mo28736d());
            }
            if (l == null) {
                j = this.f1668b.getLong("config_time", 0);
            } else {
                j = l.longValue();
            }
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public final int mo28865f() {
        Integer num;
        int i;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                num = null;
            } else {
                num = Integer.valueOf(k.mo28743g());
            }
            if (num == null) {
                i = this.f1668b.getInt("feature_flags_refresh_rate_limit", -1);
            } else {
                i = num.intValue();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final int mo28866g() {
        Integer num;
        int i;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                num = null;
            } else {
                num = Integer.valueOf(k.mo28746j());
            }
            if (num == null) {
                i = this.f1668b.getInt("geofences_max_num_to_register", -1);
            } else {
                i = num.intValue();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final long mo28867h() {
        Long l;
        long j;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                l = null;
            } else {
                l = Long.valueOf(k.mo28747k());
            }
            if (l == null) {
                j = this.f1668b.getLong("messaging_session_timeout", -1);
            } else {
                j = l.longValue();
            }
            return j;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final int mo28868i() {
        Integer num;
        int i;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                num = null;
            } else {
                num = Integer.valueOf(k.mo28748l());
            }
            if (num == null) {
                i = this.f1668b.getInt("geofences_min_time_since_last_report", -1);
            } else {
                i = num.intValue();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public final int mo28869j() {
        Integer num;
        int i;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                num = null;
            } else {
                num = Integer.valueOf(k.mo28749m());
            }
            if (num == null) {
                i = this.f1668b.getInt("geofences_min_time_since_last_request", -1);
            } else {
                i = num.intValue();
            }
            return i;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    public final C3046c5 mo28870k() {
        return this.f1671e;
    }

    /* renamed from: l */
    public final boolean mo28871l() {
        if (mo28864e() <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo28872m() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28751o());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("content_cards_enabled", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final boolean mo28873n() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28740e());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("ephemeral_events_enabled", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    public final boolean mo28874o() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28742f());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("feature_flags_enabled", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: p */
    public final boolean mo28875p() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28744h());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("geofences_enabled", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: q */
    public final boolean mo28876q() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28745i());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("geofences_enabled_set", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: r */
    public final boolean mo28877r() {
        Boolean bool;
        boolean z;
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            C3046c5 k = mo28870k();
            if (k == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(k.mo28750n());
            }
            if (bool == null) {
                z = this.f1668b.getBoolean("test_user_device_logging_enabled", false);
            } else {
                z = bool.booleanValue();
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: t */
    public final void mo28878t() {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3125f.f1676b, 6, (Object) null);
        if (this.f1670d.mo49518e()) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3126g.f1677b, 7, (Object) null);
            C12088a.C12089a.m26273c(this.f1670d, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public final C11906l<Long, Boolean> mo28858a() {
        if (C12088a.C12089a.m26272b(this.f1670d, (Object) null, 1, (Object) null)) {
            return new C11906l<>(Long.valueOf(mo28864e()), Boolean.valueOf(mo28871l()));
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3121b.f1672b, 6, (Object) null);
        return null;
    }

    /* renamed from: b */
    public final void mo28861b(C3046c5 c5Var) {
        C12775o.m28639i(c5Var, "serverConfig");
        boolean z = !mo28872m() && c5Var.mo28751o();
        ReentrantLock reentrantLock = this.f1669c;
        reentrantLock.lock();
        try {
            mo28859a(c5Var);
            C11921v vVar = C11921v.f18618a;
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3127h.f1678b, 7, (Object) null);
                this.f1667a.mo28917a();
            }
            try {
                SharedPreferences.Editor edit = this.f1668b.edit();
                if (c5Var.mo28727b() != null) {
                    edit.putString("blacklisted_events", new JSONArray(c5Var.mo28727b()).toString());
                }
                if (c5Var.mo28722a() != null) {
                    edit.putString("blacklisted_attributes", new JSONArray(c5Var.mo28722a()).toString());
                }
                if (c5Var.mo28732c() != null) {
                    edit.putString("blacklisted_purchases", new JSONArray(c5Var.mo28732c()).toString());
                }
                edit.putLong("config_time", c5Var.mo28736d());
                edit.putInt("geofences_min_time_since_last_request", c5Var.mo28749m());
                edit.putInt("geofences_min_time_since_last_report", c5Var.mo28748l());
                edit.putInt("geofences_max_num_to_register", c5Var.mo28746j());
                edit.putBoolean("geofences_enabled", c5Var.mo28744h());
                edit.putBoolean("geofences_enabled_set", c5Var.mo28745i());
                edit.putLong("messaging_session_timeout", c5Var.mo28747k());
                edit.putBoolean("test_user_device_logging_enabled", c5Var.mo28750n());
                edit.putBoolean("content_cards_enabled", c5Var.mo28751o());
                edit.putBoolean("ephemeral_events_enabled", c5Var.mo28740e());
                edit.putBoolean("feature_flags_enabled", c5Var.mo28742f());
                edit.putInt("feature_flags_refresh_rate_limit", c5Var.mo28743g());
                edit.apply();
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3128i.f1679b, 4, (Object) null);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3129j(c5Var), 6, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[Catch:{ Exception -> 0x0053 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<java.lang.String> m2853a(java.lang.String r9) {
        /*
            r8 = this;
            android.content.SharedPreferences r0 = r8.f1668b     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = ""
            java.lang.String r9 = r0.getString(r9, r1)     // Catch:{ Exception -> 0x0053 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x0053 }
            r0.<init>()     // Catch:{ Exception -> 0x0053 }
            r1 = 0
            if (r9 == 0) goto L_0x0019
            boolean r2 = p454wf.C13754v.m31532t(r9)     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r2 = r1
            goto L_0x001a
        L_0x0019:
            r2 = 1
        L_0x001a:
            if (r2 != 0) goto L_0x0067
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0053 }
            int r9 = r2.length()     // Catch:{ Exception -> 0x0053 }
            tf.f r9 = p436tf.C13537l.m30893t(r1, r9)     // Catch:{ Exception -> 0x0053 }
            vf.g r9 = kotlin.collections.C12686e0.m28213R(r9)     // Catch:{ Exception -> 0x0053 }
            bo.app.e5$c r1 = new bo.app.e5$c     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0053 }
            vf.g r9 = p448vf.C13662o.m31280m(r9, r1)     // Catch:{ Exception -> 0x0053 }
            bo.app.e5$d r1 = new bo.app.e5$d     // Catch:{ Exception -> 0x0053 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0053 }
            vf.g r9 = p448vf.C13662o.m31287t(r9, r1)     // Catch:{ Exception -> 0x0053 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x0053 }
        L_0x0043:
            boolean r1 = r9.hasNext()     // Catch:{ Exception -> 0x0053 }
            if (r1 == 0) goto L_0x0067
            java.lang.Object r1 = r9.next()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0053 }
            r0.add(r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0043
        L_0x0053:
            r9 = move-exception
            r3 = r9
            j0.c r0 = p126j0.C8266c.f11641a
            j0.c$a r2 = p126j0.C8266c.C8267a.f11649e
            bo.app.e5$e r5 = p042bo.app.C3119e5.C3124e.f1675b
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r8
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3119e5.m2853a(java.lang.String):java.util.Set");
    }
}
