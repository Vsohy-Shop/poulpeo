package p222s6;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p113h8.C8028a;
import p113h8.C8030b;
import p277x6.C10498c0;

/* renamed from: s6.d */
/* compiled from: CrashlyticsNativeComponentDeferredProxy */
public final class C9505d implements C9502a {

    /* renamed from: c */
    private static final C9512g f14175c = new C9507b();

    /* renamed from: a */
    private final C8028a<C9502a> f14176a;

    /* renamed from: b */
    private final AtomicReference<C9502a> f14177b = new AtomicReference<>((Object) null);

    /* renamed from: s6.d$b */
    /* compiled from: CrashlyticsNativeComponentDeferredProxy */
    private static final class C9507b implements C9512g {
        private C9507b() {
        }

        /* renamed from: a */
        public File mo43957a() {
            return null;
        }

        /* renamed from: b */
        public File mo43958b() {
            return null;
        }

        /* renamed from: c */
        public File mo43959c() {
            return null;
        }

        /* renamed from: d */
        public File mo43960d() {
            return null;
        }

        /* renamed from: e */
        public File mo43961e() {
            return null;
        }

        /* renamed from: f */
        public File mo43962f() {
            return null;
        }
    }

    public C9505d(C8028a<C9502a> aVar) {
        this.f14176a = aVar;
        aVar.mo41859a(new C9503b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m19675g(C8030b bVar) {
        C9511f.m19696f().mo43965b("Crashlytics native component now available.");
        this.f14177b.set((C9502a) bVar.get());
    }

    @NonNull
    /* renamed from: a */
    public C9512g mo43953a(@NonNull String str) {
        C9502a aVar = this.f14177b.get();
        if (aVar == null) {
            return f14175c;
        }
        return aVar.mo43953a(str);
    }

    /* renamed from: b */
    public boolean mo43954b() {
        C9502a aVar = this.f14177b.get();
        if (aVar == null || !aVar.mo43954b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo43955c(@NonNull String str) {
        C9502a aVar = this.f14177b.get();
        if (aVar == null || !aVar.mo43955c(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo43956d(@NonNull String str, @NonNull String str2, long j, @NonNull C10498c0 c0Var) {
        C9511f f = C9511f.m19696f();
        f.mo43971i("Deferring native open session: " + str);
        this.f14176a.mo41859a(new C9504c(str, str2, j, c0Var));
    }
}
