package p033b2;

import androidx.annotation.RestrictTo;
import p045c2.C3871a;
import p083f2.C7568a;
import p095g2.C7762f;
import p128j2.C8343d;
import p148l2.C8653a;
import p198q2.C9166l;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b2.i */
/* compiled from: AppEventsManager.kt */
public final class C2857i {

    /* renamed from: a */
    public static final C2857i f1232a = new C2857i();

    private C2857i() {
    }

    /* renamed from: a */
    public static final void m2237a() {
        Class<C2857i> cls = C2857i.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C9181q.m18804h(new C2858a());
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b2.i$a */
    /* compiled from: AppEventsManager.kt */
    public static final class C2858a implements C9181q.C9183b {

        /* renamed from: b2.i$a$a */
        /* compiled from: AppEventsManager.kt */
        static final class C2859a implements C9166l.C9167a {

            /* renamed from: a */
            public static final C2859a f1233a = new C2859a();

            C2859a() {
            }

            /* renamed from: a */
            public final void mo28381a(boolean z) {
                if (z) {
                    C3871a.m4332c();
                }
            }
        }

        /* renamed from: b2.i$a$b */
        /* compiled from: AppEventsManager.kt */
        static final class C2860b implements C9166l.C9167a {

            /* renamed from: a */
            public static final C2860b f1234a = new C2860b();

            C2860b() {
            }

            /* renamed from: a */
            public final void mo28381a(boolean z) {
                if (z) {
                    C8653a.m17392a();
                }
            }
        }

        /* renamed from: b2.i$a$c */
        /* compiled from: AppEventsManager.kt */
        static final class C2861c implements C9166l.C9167a {

            /* renamed from: a */
            public static final C2861c f1235a = new C2861c();

            C2861c() {
            }

            /* renamed from: a */
            public final void mo28381a(boolean z) {
                if (z) {
                    C8343d.m16566g();
                }
            }
        }

        /* renamed from: b2.i$a$d */
        /* compiled from: AppEventsManager.kt */
        static final class C2862d implements C9166l.C9167a {

            /* renamed from: a */
            public static final C2862d f1236a = new C2862d();

            C2862d() {
            }

            /* renamed from: a */
            public final void mo28381a(boolean z) {
                if (z) {
                    C7568a.m14890a();
                }
            }
        }

        /* renamed from: b2.i$a$e */
        /* compiled from: AppEventsManager.kt */
        static final class C2863e implements C9166l.C9167a {

            /* renamed from: a */
            public static final C2863e f1237a = new C2863e();

            C2863e() {
            }

            /* renamed from: a */
            public final void mo28381a(boolean z) {
                if (z) {
                    C7762f.m15130a();
                }
            }
        }

        C2858a() {
        }

        /* renamed from: a */
        public void mo28379a(C9177p pVar) {
            C9166l.m18754a(C9166l.C9168b.AAM, C2859a.f1233a);
            C9166l.m18754a(C9166l.C9168b.RestrictiveDataFiltering, C2860b.f1234a);
            C9166l.m18754a(C9166l.C9168b.PrivacyProtection, C2861c.f1235a);
            C9166l.m18754a(C9166l.C9168b.EventDeactivation, C2862d.f1236a);
            C9166l.m18754a(C9166l.C9168b.IapLogging, C2863e.f1237a);
        }

        /* renamed from: d */
        public void mo28380d() {
        }
    }
}
