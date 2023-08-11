package p255v6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p025a7.C2217f;
import p050c7.C3894e;
import p088f7.C7606a;
import p088f7.C7608c;
import p222s6.C9502a;
import p222s6.C9511f;
import p233t6.C9757a;
import p244u6.C9893b;
import p266w6.C10116c;
import p266w6.C10128g;
import p276x5.C10410i;

/* renamed from: v6.m */
/* compiled from: CrashlyticsCore */
public class C10000m {

    /* renamed from: a */
    private final Context f15024a;

    /* renamed from: b */
    private final C6922c f15025b;

    /* renamed from: c */
    private final C10019s f15026c;

    /* renamed from: d */
    private final long f15027d = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10006n f15028e;

    /* renamed from: f */
    private C10006n f15029f;

    /* renamed from: g */
    private boolean f15030g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9985k f15031h;

    /* renamed from: i */
    private final C10026w f15032i;

    /* renamed from: j */
    private final C2217f f15033j;
    @VisibleForTesting

    /* renamed from: k */
    public final C9893b f15034k;

    /* renamed from: l */
    private final C9757a f15035l;

    /* renamed from: m */
    private final ExecutorService f15036m;

    /* renamed from: n */
    private final C9975h f15037n;

    /* renamed from: o */
    private final C9502a f15038o;

    /* renamed from: v6.m$a */
    /* compiled from: CrashlyticsCore */
    class C10001a implements Callable<Task<Void>> {

        /* renamed from: b */
        final /* synthetic */ C3894e f15039b;

        C10001a(C3894e eVar) {
            this.f15039b = eVar;
        }

        /* renamed from: a */
        public Task<Void> call() {
            return C10000m.this.m20920f(this.f15039b);
        }
    }

    /* renamed from: v6.m$b */
    /* compiled from: CrashlyticsCore */
    class C10002b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3894e f15041b;

        C10002b(C3894e eVar) {
            this.f15041b = eVar;
        }

        public void run() {
            Task unused = C10000m.this.m20920f(this.f15041b);
        }
    }

    /* renamed from: v6.m$c */
    /* compiled from: CrashlyticsCore */
    class C10003c implements Callable<Boolean> {
        C10003c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C10000m.this.f15028e.mo44588d();
                if (!d) {
                    C9511f.m19696f().mo43973k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C9511f.m19696f().mo43968e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: v6.m$d */
    /* compiled from: CrashlyticsCore */
    class C10004d implements Callable<Boolean> {
        C10004d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C10000m.this.f15031h.mo44541s());
        }
    }

    public C10000m(C6922c cVar, C10026w wVar, C9502a aVar, C10019s sVar, C9893b bVar, C9757a aVar2, C2217f fVar, ExecutorService executorService) {
        this.f15025b = cVar;
        this.f15026c = sVar;
        this.f15024a = cVar.mo39766h();
        this.f15032i = wVar;
        this.f15038o = aVar;
        this.f15034k = bVar;
        this.f15035l = aVar2;
        this.f15036m = executorService;
        this.f15033j = fVar;
        this.f15037n = new C9975h(executorService);
    }

    /* renamed from: d */
    private void m20919d() {
        try {
            this.f15030g = Boolean.TRUE.equals((Boolean) C10016r0.m20999d(this.f15037n.mo44527h(new C10004d())));
        } catch (Exception unused) {
            this.f15030g = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Task<Void> m20920f(C3894e eVar) {
        mo44567n();
        try {
            this.f15034k.mo43805a(new C9998l(this));
            if (!eVar.mo29937b().mo40842a().f10019a) {
                C9511f.m19696f().mo43965b("Collection of crash reports disabled in Crashlytics settings.");
                return C10410i.m21830d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f15031h.mo44544z(eVar)) {
                C9511f.m19696f().mo43973k("Previous sessions could not be finalized.");
            }
            Task<Void> N = this.f15031h.mo44538N(eVar.mo29936a());
            mo44566m();
            return N;
        } catch (Exception e) {
            C9511f.m19696f().mo43968e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C10410i.m21830d(e);
        } finally {
            mo44566m();
        }
    }

    /* renamed from: h */
    private void m20921h(C3894e eVar) {
        Future<?> submit = this.f15036m.submit(new C10002b(eVar));
        C9511f.m19696f().mo43965b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C9511f.m19696f().mo43968e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C9511f.m19696f().mo43968e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C9511f.m19696f().mo43968e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: i */
    public static String m20922i() {
        return "18.2.7";
    }

    /* renamed from: j */
    static boolean m20923j(String str, boolean z) {
        if (!z) {
            C9511f.m19696f().mo43971i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo44562e() {
        return this.f15028e.mo44587c();
    }

    /* renamed from: g */
    public Task<Void> mo44563g(C3894e eVar) {
        return C10016r0.m21000e(this.f15036m, new C10001a(eVar));
    }

    /* renamed from: k */
    public void mo44564k(String str) {
        this.f15031h.mo44540R(System.currentTimeMillis() - this.f15027d, str);
    }

    /* renamed from: l */
    public void mo44565l(@NonNull Throwable th) {
        this.f15031h.mo44539Q(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo44566m() {
        this.f15037n.mo44527h(new C10003c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo44567n() {
        this.f15037n.mo44524b();
        this.f15028e.mo44586a();
        C9511f.m19696f().mo43971i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean mo44568o(C9960a aVar, C3894e eVar) {
        C3894e eVar2 = eVar;
        if (m20923j(aVar.f14938b, C9972g.m20821k(this.f15024a, "com.crashlytics.RequireBuildId", true))) {
            String fVar = new C9970f(this.f15032i).toString();
            try {
                this.f15029f = new C10006n("crash_marker", this.f15033j);
                this.f15028e = new C10006n("initialization_marker", this.f15033j);
                C10128g gVar = new C10128g(fVar, this.f15033j, this.f15037n);
                C10116c cVar = new C10116c(this.f15033j);
                C10005m0 g = C10005m0.m20940g(this.f15024a, this.f15032i, this.f15033j, aVar, cVar, gVar, new C7606a(1024, new C7608c(10)), eVar);
                Context context = this.f15024a;
                C9975h hVar = this.f15037n;
                C10026w wVar = this.f15032i;
                C10019s sVar = this.f15026c;
                C2217f fVar2 = this.f15033j;
                C10006n nVar = this.f15029f;
                C10116c cVar2 = cVar;
                Context context2 = context;
                C10128g gVar2 = gVar;
                C9975h hVar2 = hVar;
                String str = fVar;
                this.f15031h = new C9985k(context2, hVar2, wVar, sVar, fVar2, nVar, aVar, gVar2, cVar2, g, this.f15038o, this.f15035l);
                boolean e = mo44562e();
                m20919d();
                this.f15031h.mo44543x(str, Thread.getDefaultUncaughtExceptionHandler(), eVar2);
                if (!e || !C9972g.m20813c(this.f15024a)) {
                    C9511f.m19696f().mo43965b("Successfully configured exception handler.");
                    return true;
                }
                C9511f.m19696f().mo43965b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m20921h(eVar2);
                return false;
            } catch (Exception e2) {
                C9511f.m19696f().mo43968e("Crashlytics was not started due to an exception during initialization", e2);
                this.f15031h = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }
}
