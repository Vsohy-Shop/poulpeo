package p255v6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p025a7.C2217f;
import p050c7.C3894e;
import p064d7.C7278a;
import p222s6.C9502a;
import p222s6.C9511f;
import p222s6.C9512g;
import p233t6.C9757a;
import p255v6.C10012q;
import p266w6.C10116c;
import p266w6.C10128g;
import p276x5.C10404f;
import p276x5.C10406g;
import p276x5.C10410i;
import p277x6.C10498c0;

/* renamed from: v6.k */
/* compiled from: CrashlyticsController */
class C9985k {

    /* renamed from: r */
    static final FilenameFilter f14978r = new C9983j();

    /* renamed from: a */
    private final Context f14979a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10019s f14980b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10006n f14981c;

    /* renamed from: d */
    private final C10128g f14982d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9975h f14983e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10026w f14984f;

    /* renamed from: g */
    private final C2217f f14985g;

    /* renamed from: h */
    private final C9960a f14986h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C10116c f14987i;

    /* renamed from: j */
    private final C9502a f14988j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C9757a f14989k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C10005m0 f14990l;

    /* renamed from: m */
    private C10012q f14991m;

    /* renamed from: n */
    final C10406g<Boolean> f14992n = new C10406g<>();

    /* renamed from: o */
    final C10406g<Boolean> f14993o = new C10406g<>();

    /* renamed from: p */
    final C10406g<Void> f14994p = new C10406g<>();

    /* renamed from: q */
    final AtomicBoolean f14995q = new AtomicBoolean(false);

    /* renamed from: v6.k$a */
    /* compiled from: CrashlyticsController */
    class C9986a implements C10012q.C10013a {
        C9986a() {
        }

        /* renamed from: a */
        public void mo44545a(@NonNull C3894e eVar, @NonNull Thread thread, @NonNull Throwable th) {
            C9985k.this.mo44534G(eVar, thread, th);
        }
    }

    /* renamed from: v6.k$b */
    /* compiled from: CrashlyticsController */
    class C9987b implements Callable<Task<Void>> {

        /* renamed from: b */
        final /* synthetic */ long f14997b;

        /* renamed from: c */
        final /* synthetic */ Throwable f14998c;

        /* renamed from: d */
        final /* synthetic */ Thread f14999d;

        /* renamed from: e */
        final /* synthetic */ C3894e f15000e;

        /* renamed from: v6.k$b$a */
        /* compiled from: CrashlyticsController */
        class C9988a implements C10404f<C7278a, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f15002a;

            C9988a(Executor executor) {
                this.f15002a = executor;
            }

            @NonNull
            /* renamed from: b */
            public Task<Void> mo29941a(@Nullable C7278a aVar) {
                if (aVar == null) {
                    C9511f.m19696f().mo43973k("Received null app settings, cannot send reports at crash time.");
                    return C10410i.m21831e(null);
                }
                return C10410i.m21833g(C9985k.this.m20864L(), C9985k.this.f14990l.mo44585v(this.f15002a));
            }
        }

        C9987b(long j, Throwable th, Thread thread, C3894e eVar) {
            this.f14997b = j;
            this.f14998c = th;
            this.f14999d = thread;
            this.f15000e = eVar;
        }

        /* renamed from: a */
        public Task<Void> call() {
            long b = C9985k.m20861F(this.f14997b);
            String c = C9985k.this.m20858C();
            if (c == null) {
                C9511f.m19696f().mo43967d("Tried to write a fatal exception while no session was open.");
                return C10410i.m21831e(null);
            }
            C9985k.this.f14981c.mo44586a();
            C9985k.this.f14990l.mo44581r(this.f14998c, this.f14999d, c, b);
            C9985k.this.m20887w(this.f14997b);
            C9985k.this.mo44542t(this.f15000e);
            C9985k.this.m20886v(new C9970f(C9985k.this.f14984f).toString());
            if (!C9985k.this.f14980b.mo44598d()) {
                return C10410i.m21831e(null);
            }
            Executor c2 = C9985k.this.f14983e.mo44525c();
            return this.f15000e.mo29936a().mo35466q(c2, new C9988a(c2));
        }
    }

    /* renamed from: v6.k$c */
    /* compiled from: CrashlyticsController */
    class C9989c implements C10404f<Void, Boolean> {
        C9989c() {
        }

        @NonNull
        /* renamed from: b */
        public Task<Boolean> mo29941a(@Nullable Void voidR) {
            return C10410i.m21831e(Boolean.TRUE);
        }
    }

    /* renamed from: v6.k$d */
    /* compiled from: CrashlyticsController */
    class C9990d implements C10404f<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ Task f15005a;

        /* renamed from: v6.k$d$a */
        /* compiled from: CrashlyticsController */
        class C9991a implements Callable<Task<Void>> {

            /* renamed from: b */
            final /* synthetic */ Boolean f15007b;

            /* renamed from: v6.k$d$a$a */
            /* compiled from: CrashlyticsController */
            class C9992a implements C10404f<C7278a, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f15009a;

                C9992a(Executor executor) {
                    this.f15009a = executor;
                }

                @NonNull
                /* renamed from: b */
                public Task<Void> mo29941a(@Nullable C7278a aVar) {
                    if (aVar == null) {
                        C9511f.m19696f().mo43973k("Received null app settings at app startup. Cannot send cached reports");
                        return C10410i.m21831e(null);
                    }
                    Task unused = C9985k.this.m20864L();
                    C9985k.this.f14990l.mo44585v(this.f15009a);
                    C9985k.this.f14994p.mo45100e(null);
                    return C10410i.m21831e(null);
                }
            }

            C9991a(Boolean bool) {
                this.f15007b = bool;
            }

            /* renamed from: a */
            public Task<Void> call() {
                if (!this.f15007b.booleanValue()) {
                    C9511f.m19696f().mo43971i("Deleting cached crash reports...");
                    C9985k.m20884r(C9985k.this.mo44536J());
                    C9985k.this.f14990l.mo44584u();
                    C9985k.this.f14994p.mo45100e(null);
                    return C10410i.m21831e(null);
                }
                C9511f.m19696f().mo43965b("Sending cached crash reports...");
                C9985k.this.f14980b.mo44597c(this.f15007b.booleanValue());
                Executor c = C9985k.this.f14983e.mo44525c();
                return C9990d.this.f15005a.mo35466q(c, new C9992a(c));
            }
        }

        C9990d(Task task) {
            this.f15005a = task;
        }

        @NonNull
        /* renamed from: b */
        public Task<Void> mo29941a(@Nullable Boolean bool) {
            return C9985k.this.f14983e.mo44528i(new C9991a(bool));
        }
    }

    /* renamed from: v6.k$e */
    /* compiled from: CrashlyticsController */
    class C9993e implements Callable<Void> {

        /* renamed from: b */
        final /* synthetic */ long f15011b;

        /* renamed from: c */
        final /* synthetic */ String f15012c;

        C9993e(long j, String str) {
            this.f15011b = j;
            this.f15012c = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C9985k.this.mo44535H()) {
                return null;
            }
            C9985k.this.f14987i.mo44706g(this.f15011b, this.f15012c);
            return null;
        }
    }

    /* renamed from: v6.k$f */
    /* compiled from: CrashlyticsController */
    class C9994f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f15014b;

        /* renamed from: c */
        final /* synthetic */ Throwable f15015c;

        /* renamed from: d */
        final /* synthetic */ Thread f15016d;

        C9994f(long j, Throwable th, Thread thread) {
            this.f15014b = j;
            this.f15015c = th;
            this.f15016d = thread;
        }

        public void run() {
            if (!C9985k.this.mo44535H()) {
                long b = C9985k.m20861F(this.f15014b);
                String c = C9985k.this.m20858C();
                if (c == null) {
                    C9511f.m19696f().mo43973k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C9985k.this.f14990l.mo44582s(this.f15015c, this.f15016d, c, b);
                }
            }
        }
    }

    /* renamed from: v6.k$g */
    /* compiled from: CrashlyticsController */
    class C9995g implements Callable<Void> {

        /* renamed from: b */
        final /* synthetic */ String f15018b;

        C9995g(String str) {
            this.f15018b = str;
        }

        /* renamed from: a */
        public Void call() {
            C9985k.this.m20886v(this.f15018b);
            return null;
        }
    }

    /* renamed from: v6.k$h */
    /* compiled from: CrashlyticsController */
    class C9996h implements Callable<Void> {

        /* renamed from: b */
        final /* synthetic */ long f15020b;

        C9996h(long j) {
            this.f15020b = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f15020b);
            C9985k.this.f14989k.mo43806a("_ae", bundle);
            return null;
        }
    }

    C9985k(Context context, C9975h hVar, C10026w wVar, C10019s sVar, C2217f fVar, C10006n nVar, C9960a aVar, C10128g gVar, C10116c cVar, C10005m0 m0Var, C9502a aVar2, C9757a aVar3) {
        this.f14979a = context;
        this.f14983e = hVar;
        this.f14984f = wVar;
        this.f14980b = sVar;
        this.f14985g = fVar;
        this.f14981c = nVar;
        this.f14986h = aVar;
        this.f14982d = gVar;
        this.f14987i = cVar;
        this.f14988j = aVar2;
        this.f14989k = aVar3;
        this.f14990l = m0Var;
    }

    /* renamed from: A */
    private static boolean m20856A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: B */
    private Context m20857B() {
        return this.f14979a;
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: C */
    public String m20858C() {
        SortedSet<String> n = this.f14990l.mo44579n();
        if (!n.isEmpty()) {
            return n.first();
        }
        return null;
    }

    /* renamed from: D */
    private static long m20859D() {
        return m20861F(System.currentTimeMillis());
    }

    @NonNull
    /* renamed from: E */
    static List<C10029z> m20860E(C9512g gVar, String str, C2217f fVar, byte[] bArr) {
        File n = fVar.mo23562n(str, "user-data");
        File n2 = fVar.mo23562n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9968e("logs_file", "logs", bArr));
        arrayList.add(new C10025v("crash_meta_file", "metadata", gVar.mo43962f()));
        arrayList.add(new C10025v("session_meta_file", "session", gVar.mo43961e()));
        arrayList.add(new C10025v("app_meta_file", "app", gVar.mo43957a()));
        arrayList.add(new C10025v("device_meta_file", "device", gVar.mo43959c()));
        arrayList.add(new C10025v("os_meta_file", "os", gVar.mo43958b()));
        arrayList.add(new C10025v("minidump_file", "minidump", gVar.mo43960d()));
        arrayList.add(new C10025v("user_meta_file", "user", n));
        arrayList.add(new C10025v("keys_file", "keys", n2));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static long m20861F(long j) {
        return j / 1000;
    }

    /* renamed from: K */
    private Task<Void> m20863K(long j) {
        if (m20856A()) {
            C9511f.m19696f().mo43973k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C10410i.m21831e(null);
        }
        C9511f.m19696f().mo43965b("Logging app exception event to Firebase Analytics");
        return C10410i.m21829c(new ScheduledThreadPoolExecutor(1), new C9996h(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public Task<Void> m20864L() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo44536J()) {
            try {
                arrayList.add(m20863K(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C9511f f = C9511f.m19696f();
                f.mo43973k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C10410i.m21832f(arrayList);
    }

    /* renamed from: O */
    private Task<Boolean> m20865O() {
        if (this.f14980b.mo44598d()) {
            C9511f.m19696f().mo43965b("Automatic data collection is enabled. Allowing upload.");
            this.f14992n.mo45100e(Boolean.FALSE);
            return C10410i.m21831e(Boolean.TRUE);
        }
        C9511f.m19696f().mo43965b("Automatic data collection is disabled.");
        C9511f.m19696f().mo43971i("Notifying that unsent reports are available.");
        this.f14992n.mo45100e(Boolean.TRUE);
        Task<TContinuationResult> r = this.f14980b.mo44599g().mo35467r(new C9989c());
        C9511f.m19696f().mo43965b("Waiting for send/deleteUnsentReports to be called.");
        return C10016r0.m21004i(r, this.f14993o.mo45096a());
    }

    /* renamed from: P */
    private void m20866P(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List a = ((ActivityManager) this.f14979a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (a.size() != 0) {
                this.f14990l.mo44583t(str, a, new C10116c(this.f14985g, str), C10128g.m21312c(str, this.f14985g, this.f14983e));
                return;
            }
            C9511f f = C9511f.m19696f();
            f.mo43971i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C9511f f2 = C9511f.m19696f();
        f2.mo43971i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static C10498c0.C10499a m20881o(C10026w wVar, C9960a aVar) {
        return C10498c0.C10499a.m22196b(wVar.mo44605f(), aVar.f14941e, aVar.f14942f, wVar.mo44604a(), C10020t.m21016a(aVar.f14939c).mo44601b(), aVar.f14943g);
    }

    /* renamed from: p */
    private static C10498c0.C10500b m20882p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C10498c0.C10500b.m22203c(C9972g.m20822l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C9972g.m20829s(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C9972g.m20834x(context), C9972g.m20823m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static C10498c0.C10501c m20883q(Context context) {
        return C10498c0.C10501c.m22213a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C9972g.m20835y(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m20884r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20885u(boolean r4, p050c7.C3894e r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            v6.m0 r1 = r3.f14990l
            java.util.SortedSet r1 = r1.mo44579n()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            s6.f r4 = p222s6.C9511f.m19696f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo43971i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            d7.d r5 = r5.mo29937b()
            d7.b r5 = r5.mo40842a()
            boolean r5 = r5.f10020b
            if (r5 == 0) goto L_0x0031
            r3.m20866P(r1)
            goto L_0x003a
        L_0x0031:
            s6.f r5 = p222s6.C9511f.m19696f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo43971i(r2)
        L_0x003a:
            s6.a r5 = r3.f14988j
            boolean r5 = r5.mo43955c(r1)
            if (r5 == 0) goto L_0x0045
            r3.m20888y(r1)
        L_0x0045:
            if (r4 == 0) goto L_0x004f
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            v6.m0 r5 = r3.f14990l
            long r0 = m20859D()
            r5.mo44577i(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255v6.C9985k.m20885u(boolean, c7.e):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m20886v(String str) {
        long D = m20859D();
        C9511f f = C9511f.m19696f();
        f.mo43965b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C10000m.m20922i()});
        C10498c0.C10499a o = m20881o(this.f14984f, this.f14986h);
        C10498c0.C10501c q = m20883q(m20857B());
        C10498c0.C10500b p = m20882p(m20857B());
        this.f14988j.mo43956d(str, format, D, C10498c0.m22192b(o, q, p));
        this.f14987i.mo44704e(str);
        this.f14990l.mo44580o(str, D);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m20887w(long j) {
        try {
            C2217f fVar = this.f14985g;
            if (!fVar.mo23553d(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C9511f.m19696f().mo43974l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private void m20888y(String str) {
        C9511f f = C9511f.m19696f();
        f.mo43971i("Finalizing native report for session " + str);
        C9512g a = this.f14988j.mo43953a(str);
        File d = a.mo43960d();
        if (d == null || !d.exists()) {
            C9511f f2 = C9511f.m19696f();
            f2.mo43973k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d.lastModified();
        C10116c cVar = new C10116c(this.f14985g, str);
        File h = this.f14985g.mo23557h(str);
        if (!h.isDirectory()) {
            C9511f.m19696f().mo43973k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m20887w(lastModified);
        List<C10029z> E = m20860E(a, str, this.f14985g, cVar.mo44702b());
        C9961a0.m20785b(h, E);
        C9511f.m19696f().mo43965b("CrashlyticsController#finalizePreviousNativeSession");
        this.f14990l.mo44576h(str, E);
        cVar.mo44701a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public synchronized void mo44534G(@NonNull C3894e eVar, @NonNull Thread thread, @NonNull Throwable th) {
        C9511f f = C9511f.m19696f();
        f.mo43965b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C10016r0.m20999d(this.f14983e.mo44528i(new C9987b(System.currentTimeMillis(), th, thread, eVar)));
        } catch (Exception e) {
            C9511f.m19696f().mo43968e("Error handling uncaught exception", e);
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo44535H() {
        C10012q qVar = this.f14991m;
        if (qVar == null || !qVar.mo44593a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public List<File> mo44536J() {
        return this.f14985g.mo23554e(f14978r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo44537M(String str) {
        this.f14983e.mo44527h(new C9995g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public Task<Void> mo44538N(Task<C7278a> task) {
        if (!this.f14990l.mo44578l()) {
            C9511f.m19696f().mo43971i("No crash reports are available to be sent.");
            this.f14992n.mo45100e(Boolean.FALSE);
            return C10410i.m21831e(null);
        }
        C9511f.m19696f().mo43971i("Crash reports are available to be sent.");
        return m20865O().mo35467r(new C9990d(task));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo44539Q(@NonNull Thread thread, @NonNull Throwable th) {
        this.f14983e.mo44526g(new C9994f(System.currentTimeMillis(), th, thread));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo44540R(long j, String str) {
        this.f14983e.mo44527h(new C9993e(j, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo44541s() {
        if (!this.f14981c.mo44587c()) {
            String C = m20858C();
            if (C == null || !this.f14988j.mo43955c(C)) {
                return false;
            }
            return true;
        }
        C9511f.m19696f().mo43971i("Found previous crash marker.");
        this.f14981c.mo44588d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo44542t(C3894e eVar) {
        m20885u(false, eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo44543x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C3894e eVar) {
        mo44537M(str);
        C10012q qVar = new C10012q(new C9986a(), eVar, uncaughtExceptionHandler, this.f14988j);
        this.f14991m = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo44544z(C3894e eVar) {
        this.f14983e.mo44524b();
        if (mo44535H()) {
            C9511f.m19696f().mo43973k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C9511f.m19696f().mo43971i("Finalizing previously open sessions.");
        try {
            m20885u(true, eVar);
            C9511f.m19696f().mo43971i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C9511f.m19696f().mo43968e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
