package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.n6 */
public final class C3468n6 implements C2994a3 {

    /* renamed from: c */
    public static final C3469a f2241c = new C3469a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f2242a;

    /* renamed from: b */
    private final Map<String, Long> f2243b = m3489a();

    /* renamed from: bo.app.n6$a */
    public static final class C3469a {
        public /* synthetic */ C3469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3469a() {
        }
    }

    /* renamed from: bo.app.n6$b */
    static final class C3470b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2244b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3470b(C3024b3 b3Var) {
            super(0);
            this.f2244b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f2244b.getId() + " always eligible via configuration. Returning true for eligibility status";
        }
    }

    /* renamed from: bo.app.n6$c */
    static final class C3471c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2245b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3471c(C3024b3 b3Var) {
            super(0);
            this.f2245b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f2245b.getId() + " always eligible via never having been triggered. Returning true for eligibility status";
        }
    }

    /* renamed from: bo.app.n6$d */
    static final class C3472d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2246b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3472d(C3024b3 b3Var) {
            super(0);
            this.f2246b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action id " + this.f2246b.getId() + " no longer eligible due to having been triggered in the past and is only eligible once.";
        }
    }

    /* renamed from: bo.app.n6$e */
    static final class C3473e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2247b;

        /* renamed from: c */
        final /* synthetic */ C3463n2 f2248c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3473e(long j, C3463n2 n2Var) {
            super(0);
            this.f2247b = j;
            this.f2248c = n2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is re-eligible for display since " + (C8273e.m16436i() - this.f2247b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f2248c.mo29352q() + ").";
        }
    }

    /* renamed from: bo.app.n6$f */
    static final class C3474f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2249b;

        /* renamed from: c */
        final /* synthetic */ C3463n2 f2250c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3474f(long j, C3463n2 n2Var) {
            super(0);
            this.f2249b = j;
            this.f2250c = n2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger action is not re-eligible for display since only " + (C8273e.m16436i() - this.f2249b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f2250c.mo29352q() + ").";
        }
    }

    /* renamed from: bo.app.n6$g */
    static final class C3475g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2251b;

        /* renamed from: c */
        final /* synthetic */ long f2252c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3475g(C3024b3 b3Var, long j) {
            super(0);
            this.f2251b = b3Var;
            this.f2252c = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Updating re-eligibility for action Id " + this.f2251b.getId() + " to time " + this.f2252c + '.';
        }
    }

    /* renamed from: bo.app.n6$h */
    static final class C3476h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2253b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3476h(String str) {
            super(0);
            this.f2253b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting outdated triggered action id " + this.f2253b + " from stored re-eligibility list. In-memory re-eligibility list is unchanged.";
        }
    }

    /* renamed from: bo.app.n6$i */
    static final class C3477i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2254b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3477i(String str) {
            super(0);
            this.f2254b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Retaining triggered action " + this.f2254b + " in re-eligibility list.";
        }
    }

    /* renamed from: bo.app.n6$j */
    static final class C3478j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2255b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3478j(String str) {
            super(0);
            this.f2255b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Retrieving triggered action id " + this.f2255b + " eligibility information from local storage.";
        }
    }

    /* renamed from: bo.app.n6$k */
    static final class C3479k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3479k f2256b = new C3479k();

        C3479k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public C3468n6(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str2, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.triggers.re_eligibility", C8300j.m16489c(context, str, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f2242a = sharedPreferences;
    }

    /* renamed from: a */
    public void mo28584a(C3024b3 b3Var, long j) {
        C12775o.m28639i(b3Var, "triggeredAction");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3475g(b3Var, j), 7, (Object) null);
        this.f2243b.put(b3Var.getId(), Long.valueOf(j));
        this.f2242a.edit().putLong(b3Var.getId(), j).apply();
    }

    /* renamed from: b */
    public boolean mo28585b(C3024b3 b3Var) {
        long j;
        int i;
        C12775o.m28639i(b3Var, "triggeredAction");
        C3463n2 t = b3Var.mo28657f().mo29599t();
        if (t.mo29351o()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3470b(b3Var), 7, (Object) null);
            return true;
        } else if (!this.f2243b.containsKey(b3Var.getId())) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3471c(b3Var), 7, (Object) null);
            return true;
        } else if (t.mo29353s()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3472d(b3Var), 7, (Object) null);
            return false;
        } else {
            Long l = this.f2243b.get(b3Var.getId());
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            long i2 = C8273e.m16436i() + ((long) b3Var.mo28657f().mo29596g());
            Integer q = t.mo29352q();
            if (q == null) {
                i = 0;
            } else {
                i = q.intValue();
            }
            if (i2 >= ((long) i) + j) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3473e(j, t), 7, (Object) null);
                return true;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3474f(j, t), 7, (Object) null);
            return false;
        }
    }

    /* renamed from: a */
    private final Map<String, Long> m3489a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String next : this.f2242a.getAll().keySet()) {
                long j = this.f2242a.getLong(next, 0);
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3478j(next), 7, (Object) null);
                C12775o.m28638h(next, "actionId");
                concurrentHashMap.put(next, Long.valueOf(j));
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3479k.f2256b, 4, (Object) null);
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public void mo28762a(List<? extends C3024b3> list) {
        C12775o.m28639i(list, "triggeredActions");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(list, 10));
        for (C3024b3 id : list) {
            arrayList.add(id.getId());
        }
        SharedPreferences.Editor edit = this.f2242a.edit();
        for (String str : C12686e0.m28209F0(this.f2243b.keySet())) {
            if (!arrayList.contains(str)) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3476h(str), 7, (Object) null);
                edit.remove(str);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3477i(str), 7, (Object) null);
            }
        }
        edit.apply();
    }
}
