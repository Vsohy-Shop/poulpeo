package p296z3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.gtm.C5451md;
import com.google.android.gms.internal.gtm.C5502q1;
import com.google.android.gms.internal.gtm.C5529rd;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p231t4.C9713p;

/* renamed from: z3.p */
public final class C10812p {

    /* renamed from: g */
    private static volatile C10812p f16558g;

    /* renamed from: a */
    private final Context f16559a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C10818s> f16560b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final C10806j f16561c = new C10806j();

    /* renamed from: d */
    private final C10813a f16562d = new C10813a();

    /* renamed from: e */
    private volatile C5451md f16563e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f16564f;

    /* renamed from: z3.p$a */
    class C10813a extends ThreadPoolExecutor {
        public C10813a() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C10814b((C10816q) null));
            allowCoreThreadTimeOut(true);
        }

        /* access modifiers changed from: protected */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C10817r(this, runnable, t);
        }
    }

    /* renamed from: z3.p$b */
    static class C10814b implements ThreadFactory {

        /* renamed from: b */
        private static final AtomicInteger f16566b = new AtomicInteger();

        private C10814b() {
        }

        /* synthetic */ C10814b(C10816q qVar) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = f16566b.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new C10815c(runnable, sb.toString());
        }
    }

    /* renamed from: z3.p$c */
    static class C10815c extends Thread {
        C10815c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C10812p(Context context) {
        Context applicationContext = context.getApplicationContext();
        C9713p.m20275j(applicationContext);
        this.f16559a = applicationContext;
    }

    /* renamed from: i */
    public static void m23065i() {
        if (!(Thread.currentThread() instanceof C10815c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: k */
    public static C10812p m23067k(Context context) {
        C9713p.m20275j(context);
        if (f16558g == null) {
            synchronized (C10812p.class) {
                if (f16558g == null) {
                    f16558g = new C10812p(context);
                }
            }
        }
        return f16558g;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m23068l(C10808l lVar) {
        C9713p.m20274i("deliver should be called from worker thread");
        C9713p.m20267b(lVar.mo45747i(), "Measurement must be submitted");
        List<C10819t> f = lVar.mo45744f();
        if (!f.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C10819t next : f) {
                Uri b = next.mo45737b();
                if (!hashSet.contains(b)) {
                    hashSet.add(b);
                    next.mo45736a(lVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final Context mo45756a() {
        return this.f16559a;
    }

    /* renamed from: c */
    public final <V> Future<V> mo45757c(Callable<V> callable) {
        C9713p.m20275j(callable);
        if (!(Thread.currentThread() instanceof C10815c)) {
            return this.f16562d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: d */
    public final void mo45758d(Runnable runnable) {
        C9713p.m20275j(runnable);
        this.f16562d.submit(runnable);
    }

    /* renamed from: e */
    public final void mo45759e(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f16564f = uncaughtExceptionHandler;
    }

    /* renamed from: g */
    public final C5451md mo45760g() {
        String str;
        if (this.f16563e == null) {
            synchronized (this) {
                if (this.f16563e == null) {
                    C5451md mdVar = new C5451md();
                    PackageManager packageManager = this.f16559a.getPackageManager();
                    String packageName = this.f16559a.getPackageName();
                    mdVar.mo33364e(packageName);
                    mdVar.mo33365f(packageManager.getInstallerPackageName(packageName));
                    String str2 = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f16559a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str2 = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str = "Error retrieving package info: appName set to ".concat(valueOf);
                        } else {
                            str = new String("Error retrieving package info: appName set to ");
                        }
                        Log.e("GAv4", str);
                    }
                    mdVar.mo33366g(packageName);
                    mdVar.mo33367h(str2);
                    this.f16563e = mdVar;
                }
            }
        }
        return this.f16563e;
    }

    /* renamed from: h */
    public final C5529rd mo45761h() {
        DisplayMetrics displayMetrics = this.f16559a.getResources().getDisplayMetrics();
        C5529rd rdVar = new C5529rd();
        rdVar.mo33503f(C5502q1.m8396c(Locale.getDefault()));
        rdVar.f6290c = displayMetrics.widthPixels;
        rdVar.f6291d = displayMetrics.heightPixels;
        return rdVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo45762m(C10808l lVar) {
        if (lVar.mo45750l()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!lVar.mo45747i()) {
            C10808l d = lVar.mo45742d();
            d.mo45748j();
            this.f16562d.execute(new C10816q(this, d));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }
}
