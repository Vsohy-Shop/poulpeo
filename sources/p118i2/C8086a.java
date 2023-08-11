package p118i2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.C4579r;
import com.facebook.FacebookSdk;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p033b2.C2849g;
import p045c2.C3871a;
import p059d2.C7231b;
import p095g2.C7762f;
import p158m2.C8812d;
import p198q2.C9138d0;
import p198q2.C9166l;
import p198q2.C9177p;
import p198q2.C9181q;
import p198q2.C9194v;
import p251v2.C9925a;
import p336ef.C11921v;

/* renamed from: i2.a */
/* compiled from: ActivityLifecycleTracker.kt */
public final class C8086a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11355a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f11356b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture<?> f11357c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f11358d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicInteger f11359e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C8103h f11360f;

    /* renamed from: g */
    private static final AtomicBoolean f11361g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f11362h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f11363i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static int f11364j;

    /* renamed from: k */
    private static WeakReference<Activity> f11365k;

    /* renamed from: l */
    public static final C8086a f11366l = new C8086a();

    /* renamed from: i2.a$a */
    /* compiled from: ActivityLifecycleTracker.kt */
    static final class C8087a implements Runnable {

        /* renamed from: b */
        public static final C8087a f11367b = new C8087a();

        C8087a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C8086a aVar = C8086a.f11366l;
                        if (C8086a.f11360f == null) {
                            C8086a.f11360f = C8103h.f11398g.mo41951b();
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: i2.a$b */
    /* compiled from: ActivityLifecycleTracker.kt */
    static final class C8088b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f11368b;

        /* renamed from: c */
        final /* synthetic */ String f11369c;

        /* renamed from: i2.a$b$a */
        /* compiled from: ActivityLifecycleTracker.kt */
        static final class C8089a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C8088b f11370b;

            C8089a(C8088b bVar) {
                this.f11370b = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
                p251v2.C9925a.m20732b(r0, r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
                return;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    boolean r0 = p251v2.C9925a.m20734d(r8)
                    if (r0 == 0) goto L_0x0007
                    return
                L_0x0007:
                    boolean r0 = p251v2.C9925a.m20734d(r8)     // Catch:{ all -> 0x0061 }
                    if (r0 == 0) goto L_0x000e
                    return
                L_0x000e:
                    i2.a r0 = p118i2.C8086a.f11366l     // Catch:{ all -> 0x005c }
                    i2.h r1 = p118i2.C8086a.f11360f     // Catch:{ all -> 0x005c }
                    if (r1 != 0) goto L_0x002b
                    i2.h r1 = new i2.h     // Catch:{ all -> 0x005c }
                    i2.a$b r2 = r8.f11370b     // Catch:{ all -> 0x005c }
                    long r2 = r2.f11368b     // Catch:{ all -> 0x005c }
                    java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005c }
                    r4 = 0
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r1
                    r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005c }
                    p118i2.C8086a.f11360f = r1     // Catch:{ all -> 0x005c }
                L_0x002b:
                    java.util.concurrent.atomic.AtomicInteger r1 = p118i2.C8086a.f11359e     // Catch:{ all -> 0x005c }
                    int r1 = r1.get()     // Catch:{ all -> 0x005c }
                    r2 = 0
                    if (r1 > 0) goto L_0x004d
                    i2.a$b r1 = r8.f11370b     // Catch:{ all -> 0x005c }
                    java.lang.String r1 = r1.f11369c     // Catch:{ all -> 0x005c }
                    i2.h r3 = p118i2.C8086a.f11360f     // Catch:{ all -> 0x005c }
                    java.lang.String r4 = p118i2.C8086a.f11362h     // Catch:{ all -> 0x005c }
                    p118i2.C8105i.m15962e(r1, r3, r4)     // Catch:{ all -> 0x005c }
                    i2.h$a r1 = p118i2.C8103h.f11398g     // Catch:{ all -> 0x005c }
                    r1.mo41950a()     // Catch:{ all -> 0x005c }
                    p118i2.C8086a.f11360f = r2     // Catch:{ all -> 0x005c }
                L_0x004d:
                    java.lang.Object r1 = p118i2.C8086a.f11358d     // Catch:{ all -> 0x005c }
                    monitor-enter(r1)     // Catch:{ all -> 0x005c }
                    p118i2.C8086a.f11357c = r2     // Catch:{ all -> 0x0059 }
                    ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0059 }
                    monitor-exit(r1)     // Catch:{ all -> 0x005c }
                    return
                L_0x0059:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x005c }
                    throw r0     // Catch:{ all -> 0x005c }
                L_0x005c:
                    r0 = move-exception
                    p251v2.C9925a.m20732b(r0, r8)     // Catch:{ all -> 0x0061 }
                    return
                L_0x0061:
                    r0 = move-exception
                    p251v2.C9925a.m20732b(r0, r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p118i2.C8086a.C8088b.C8089a.run():void");
            }
        }

        C8088b(long j, String str) {
            this.f11368b = j;
            this.f11369c = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            p251v2.C9925a.m20732b(r0, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                boolean r0 = p251v2.C9925a.m20734d(r8)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                boolean r0 = p251v2.C9925a.m20734d(r8)     // Catch:{ all -> 0x008a }
                if (r0 == 0) goto L_0x000e
                return
            L_0x000e:
                i2.a r0 = p118i2.C8086a.f11366l     // Catch:{ all -> 0x0085 }
                i2.h r1 = p118i2.C8086a.f11360f     // Catch:{ all -> 0x0085 }
                if (r1 != 0) goto L_0x0029
                i2.h r1 = new i2.h     // Catch:{ all -> 0x0085 }
                long r2 = r8.f11368b     // Catch:{ all -> 0x0085 }
                java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0085 }
                p118i2.C8086a.f11360f = r1     // Catch:{ all -> 0x0085 }
            L_0x0029:
                i2.h r1 = p118i2.C8086a.f11360f     // Catch:{ all -> 0x0085 }
                if (r1 == 0) goto L_0x0038
                long r2 = r8.f11368b     // Catch:{ all -> 0x0085 }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r1.mo41947k(r2)     // Catch:{ all -> 0x0085 }
            L_0x0038:
                java.util.concurrent.atomic.AtomicInteger r1 = p118i2.C8086a.f11359e     // Catch:{ all -> 0x0085 }
                int r1 = r1.get()     // Catch:{ all -> 0x0085 }
                if (r1 > 0) goto L_0x0065
                i2.a$b$a r1 = new i2.a$b$a     // Catch:{ all -> 0x0085 }
                r1.<init>(r8)     // Catch:{ all -> 0x0085 }
                java.lang.Object r2 = p118i2.C8086a.f11358d     // Catch:{ all -> 0x0085 }
                monitor-enter(r2)     // Catch:{ all -> 0x0085 }
                java.util.concurrent.ScheduledExecutorService r3 = p118i2.C8086a.f11356b     // Catch:{ all -> 0x0062 }
                int r4 = r0.m15911r()     // Catch:{ all -> 0x0062 }
                long r4 = (long) r4     // Catch:{ all -> 0x0062 }
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0062 }
                java.util.concurrent.ScheduledFuture r1 = r3.schedule(r1, r4, r6)     // Catch:{ all -> 0x0062 }
                p118i2.C8086a.f11357c = r1     // Catch:{ all -> 0x0062 }
                ef.v r1 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0062 }
                monitor-exit(r2)     // Catch:{ all -> 0x0085 }
                goto L_0x0065
            L_0x0062:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0085 }
                throw r0     // Catch:{ all -> 0x0085 }
            L_0x0065:
                long r1 = p118i2.C8086a.f11363i     // Catch:{ all -> 0x0085 }
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x0076
                long r3 = r8.f11368b     // Catch:{ all -> 0x0085 }
                long r3 = r3 - r1
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1     // Catch:{ all -> 0x0085 }
                long r3 = r3 / r1
            L_0x0076:
                java.lang.String r1 = r8.f11369c     // Catch:{ all -> 0x0085 }
                p118i2.C8096d.m15931e(r1, r3)     // Catch:{ all -> 0x0085 }
                i2.h r0 = p118i2.C8086a.f11360f     // Catch:{ all -> 0x0085 }
                if (r0 == 0) goto L_0x0084
                r0.mo41949m()     // Catch:{ all -> 0x0085 }
            L_0x0084:
                return
            L_0x0085:
                r0 = move-exception
                p251v2.C9925a.m20732b(r0, r8)     // Catch:{ all -> 0x008a }
                return
            L_0x008a:
                r0 = move-exception
                p251v2.C9925a.m20732b(r0, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p118i2.C8086a.C8088b.run():void");
        }
    }

    /* renamed from: i2.a$c */
    /* compiled from: ActivityLifecycleTracker.kt */
    static final class C8090c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ long f11371b;

        /* renamed from: c */
        final /* synthetic */ String f11372c;

        /* renamed from: d */
        final /* synthetic */ Context f11373d;

        C8090c(long j, String str, Context context) {
            this.f11371b = j;
            this.f11372c = str;
            this.f11373d = context;
        }

        public final void run() {
            Long l;
            C8103h e;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C8086a aVar = C8086a.f11366l;
                        C8103h e2 = C8086a.f11360f;
                        if (e2 != null) {
                            l = e2.mo41941e();
                        } else {
                            l = null;
                        }
                        if (C8086a.f11360f == null) {
                            C8086a.f11360f = new C8103h(Long.valueOf(this.f11371b), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
                            String str = this.f11372c;
                            String b = C8086a.f11362h;
                            Context context = this.f11373d;
                            C12775o.m28638h(context, "appContext");
                            C8105i.m15960c(str, (C8106j) null, b, context);
                        } else if (l != null) {
                            long longValue = this.f11371b - l.longValue();
                            if (longValue > ((long) (aVar.m15911r() * 1000))) {
                                C8105i.m15962e(this.f11372c, C8086a.f11360f, C8086a.f11362h);
                                String str2 = this.f11372c;
                                String b2 = C8086a.f11362h;
                                Context context2 = this.f11373d;
                                C12775o.m28638h(context2, "appContext");
                                C8105i.m15960c(str2, (C8106j) null, b2, context2);
                                C8086a.f11360f = new C8103h(Long.valueOf(this.f11371b), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
                            } else if (longValue > 1000 && (e = C8086a.f11360f) != null) {
                                e.mo41944h();
                            }
                        }
                        C8103h e3 = C8086a.f11360f;
                        if (e3 != null) {
                            e3.mo41947k(Long.valueOf(this.f11371b));
                        }
                        C8103h e4 = C8086a.f11360f;
                        if (e4 != null) {
                            e4.mo41949m();
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: i2.a$d */
    /* compiled from: ActivityLifecycleTracker.kt */
    static final class C8091d implements C9166l.C9167a {

        /* renamed from: a */
        public static final C8091d f11374a = new C8091d();

        C8091d() {
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                C7231b.m14014g();
            } else {
                C7231b.m14013f();
            }
        }
    }

    /* renamed from: i2.a$e */
    /* compiled from: ActivityLifecycleTracker.kt */
    public static final class C8092e implements Application.ActivityLifecycleCallbacks {
        C8092e() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
            C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, C8086a.f11355a, "onActivityCreated");
            C8093b.m15919a();
            C8086a.m15913t(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C12775o.m28639i(activity, "activity");
            C9194v.C9195a aVar = C9194v.f13504f;
            C4579r rVar = C4579r.APP_EVENTS;
            C8086a aVar2 = C8086a.f11366l;
            aVar.mo43482c(rVar, C8086a.f11355a, "onActivityDestroyed");
            aVar2.m15914u(activity);
        }

        public void onActivityPaused(Activity activity) {
            C12775o.m28639i(activity, "activity");
            C9194v.C9195a aVar = C9194v.f13504f;
            C4579r rVar = C4579r.APP_EVENTS;
            C8086a aVar2 = C8086a.f11366l;
            aVar.mo43482c(rVar, C8086a.f11355a, "onActivityPaused");
            C8093b.m15919a();
            aVar2.m15915v(activity);
        }

        public void onActivityResumed(Activity activity) {
            C12775o.m28639i(activity, "activity");
            C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, C8086a.f11355a, "onActivityResumed");
            C8093b.m15919a();
            C8086a.m15916w(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
            C12775o.m28639i(bundle, "outState");
            C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, C8086a.f11355a, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C12775o.m28639i(activity, "activity");
            C8086a aVar = C8086a.f11366l;
            C8086a.f11364j = C8086a.f11364j + 1;
            C9194v.f13504f.mo43482c(C4579r.APP_EVENTS, C8086a.f11355a, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C12775o.m28639i(activity, "activity");
            C9194v.C9195a aVar = C9194v.f13504f;
            C4579r rVar = C4579r.APP_EVENTS;
            C8086a aVar2 = C8086a.f11366l;
            aVar.mo43482c(rVar, C8086a.f11355a, "onActivityStopped");
            C2849g.f1214c.mo28356g();
            C8086a.f11364j = C8086a.f11364j - 1;
        }
    }

    static {
        String canonicalName = C8086a.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f11355a = canonicalName;
    }

    private C8086a() {
    }

    /* renamed from: o */
    private final void m15908o() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f11358d) {
            if (!(f11357c == null || (scheduledFuture = f11357c) == null)) {
                scheduledFuture.cancel(false);
            }
            f11357c = null;
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* renamed from: p */
    public static final Activity m15909p() {
        WeakReference<Activity> weakReference = f11365k;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: q */
    public static final UUID m15910q() {
        C8103h hVar;
        if (f11360f == null || (hVar = f11360f) == null) {
            return null;
        }
        return hVar.mo41940d();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final int m15911r() {
        C9177p j = C9181q.m18806j(FacebookSdk.getApplicationId());
        if (j != null) {
            return j.mo43461i();
        }
        return C8098e.m15936a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public static final boolean m15912s() {
        if (f11364j == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final void m15913t(Activity activity) {
        f11356b.execute(C8087a.f11367b);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m15914u(Activity activity) {
        C7231b.m14018k(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m15915v(Activity activity) {
        AtomicInteger atomicInteger = f11359e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f11355a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m15908o();
        long currentTimeMillis = System.currentTimeMillis();
        String q = C9138d0.m18657q(activity);
        C7231b.m14019l(activity);
        f11356b.execute(new C8088b(currentTimeMillis, q));
    }

    /* renamed from: w */
    public static final void m15916w(Activity activity) {
        C12775o.m28639i(activity, "activity");
        f11365k = new WeakReference<>(activity);
        f11359e.incrementAndGet();
        f11366l.m15908o();
        long currentTimeMillis = System.currentTimeMillis();
        f11363i = currentTimeMillis;
        String q = C9138d0.m18657q(activity);
        C7231b.m14020m(activity);
        C3871a.m4333d(activity);
        C8812d.m17859h(activity);
        C7762f.m15131b();
        f11356b.execute(new C8090c(currentTimeMillis, q, activity.getApplicationContext()));
    }

    /* renamed from: x */
    public static final void m15917x(Application application, String str) {
        C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
        if (f11361g.compareAndSet(false, true)) {
            C9166l.m18754a(C9166l.C9168b.CodelessEvents, C8091d.f11374a);
            f11362h = str;
            application.registerActivityLifecycleCallbacks(new C8092e());
        }
    }
}
