package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p404of.C13074a;

/* renamed from: bo.app.q */
public final class C3565q {

    /* renamed from: e */
    public static final C3566a f2387e = new C3566a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3285j2 f2388a;

    /* renamed from: b */
    private final C3119e5 f2389b;

    /* renamed from: c */
    public final SharedPreferences f2390c;

    /* renamed from: d */
    public boolean f2391d;

    /* renamed from: bo.app.q$a */
    public static final class C3566a {
        public /* synthetic */ C3566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3566a() {
        }
    }

    /* renamed from: bo.app.q$b */
    static final class C3567b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2392b;

        /* renamed from: c */
        final /* synthetic */ long f2393c;

        /* renamed from: d */
        final /* synthetic */ long f2394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3567b(long j, long j2, long j3) {
            super(0);
            this.f2392b = j;
            this.f2393c = j2;
            this.f2394d = j3;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Messaging session timeout: " + this.f2392b + ", current diff: " + (this.f2393c - this.f2394d);
        }
    }

    /* renamed from: bo.app.q$c */
    static final class C3568c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3568c f2395b = new C3568c();

        C3568c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Publishing new messaging session event.";
        }
    }

    /* renamed from: bo.app.q$d */
    static final class C3569d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3569d f2396b = new C3569d();

        C3569d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Messaging session not started.";
        }
    }

    /* renamed from: bo.app.q$e */
    static final class C3570e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2397b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3570e(long j) {
            super(0);
            this.f2397b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Messaging session stopped. Adding new messaging session timestamp: ", Long.valueOf(this.f2397b));
        }
    }

    public C3565q(Context context, C3285j2 j2Var, C3119e5 e5Var) {
        C12775o.m28639i(context, "applicationContext");
        C12775o.m28639i(j2Var, "eventPublisher");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        this.f2388a = j2Var;
        this.f2389b = e5Var;
        this.f2390c = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* renamed from: a */
    public final boolean mo29512a() {
        long h = this.f2389b.mo28867h();
        if (h == -1 || this.f2391d) {
            return false;
        }
        long j = this.f2390c.getLong("messaging_session_timestamp", -1);
        long i = C8273e.m16436i();
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3567b(h, i, j), 7, (Object) null);
        if (j + h < i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo29513b() {
        if (mo29512a()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3568c.f2395b, 7, (Object) null);
            this.f2388a.mo29152a(C3555p3.f2375b, C3555p3.class);
            this.f2391d = true;
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3569d.f2396b, 7, (Object) null);
    }

    /* renamed from: c */
    public final void mo29514c() {
        long i = C8273e.m16436i();
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3570e(i), 7, (Object) null);
        this.f2390c.edit().putLong("messaging_session_timestamp", i).apply();
        this.f2391d = false;
    }
}
