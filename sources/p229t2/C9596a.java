package p229t2;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import p218s2.C9449b;
import p218s2.C9459f;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: t2.a */
/* compiled from: ANRDetector.kt */
public final class C9596a {

    /* renamed from: a */
    private static final int f14283a = Process.myUid();

    /* renamed from: b */
    private static final ScheduledExecutorService f14284b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private static String f14285c = "";

    /* renamed from: d */
    private static final Runnable f14286d = C9597a.f14288b;

    /* renamed from: e */
    public static final C9596a f14287e = new C9596a();

    /* renamed from: t2.a$a */
    /* compiled from: ANRDetector.kt */
    static final class C9597a implements Runnable {

        /* renamed from: b */
        public static final C9597a f14288b = new C9597a();

        C9597a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        Object systemService = FacebookSdk.getApplicationContext().getSystemService("activity");
                        if (systemService != null) {
                            C9596a.m19920a((ActivityManager) systemService);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C9596a() {
    }

    @VisibleForTesting
    /* renamed from: a */
    public static final void m19920a(ActivityManager activityManager) {
        Class<C9596a> cls = C9596a.class;
        if (!C9925a.m20734d(cls) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f14283a) {
                            Looper mainLooper = Looper.getMainLooper();
                            C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                            Thread thread = mainLooper.getThread();
                            C12775o.m28638h(thread, "Looper.getMainLooper().thread");
                            String d = C9459f.m19580d(thread);
                            if (!C12775o.m28634d(d, f14285c)) {
                                if (C9459f.m19583g(thread)) {
                                    f14285c = d;
                                    C9449b.C9450a.m19566a(processErrorStateInfo.shortMsg, d).mo43896g();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public static final void m19921b() {
        Class<C9596a> cls = C9596a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f14284b.scheduleAtFixedRate(f14286d, 0, (long) 500, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
