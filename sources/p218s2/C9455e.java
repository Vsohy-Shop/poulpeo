package p218s2;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import p198q2.C9166l;
import p229t2.C9598b;
import p240u2.C9876a;
import p251v2.C9925a;
import p262w2.C10107b;
import p273x2.C10388a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: s2.e */
/* compiled from: InstrumentManager.kt */
public final class C9455e {

    /* renamed from: a */
    public static final C9455e f14068a = new C9455e();

    /* renamed from: s2.e$a */
    /* compiled from: InstrumentManager.kt */
    static final class C9456a implements C9166l.C9167a {

        /* renamed from: a */
        public static final C9456a f14069a = new C9456a();

        C9456a() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C9876a.f14770d.mo44405a();
                if (C9166l.m18760g(C9166l.C9168b.CrashShield)) {
                    C9447a.m19555a();
                    C9925a.m20731a();
                }
                if (C9166l.m18760g(C9166l.C9168b.ThreadCheck)) {
                    C10388a.m21770a();
                }
            }
        }
    }

    /* renamed from: s2.e$b */
    /* compiled from: InstrumentManager.kt */
    static final class C9457b implements C9166l.C9167a {

        /* renamed from: a */
        public static final C9457b f14070a = new C9457b();

        C9457b() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C10107b.m21235a();
            }
        }
    }

    /* renamed from: s2.e$c */
    /* compiled from: InstrumentManager.kt */
    static final class C9458c implements C9166l.C9167a {

        /* renamed from: a */
        public static final C9458c f14071a = new C9458c();

        C9458c() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C9598b.m19922a();
            }
        }
    }

    private C9455e() {
    }

    /* renamed from: a */
    public static final void m19573a() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            C9166l.m18754a(C9166l.C9168b.CrashReport, C9456a.f14069a);
            C9166l.m18754a(C9166l.C9168b.ErrorReport, C9457b.f14070a);
            C9166l.m18754a(C9166l.C9168b.AnrReport, C9458c.f14071a);
        }
    }
}
