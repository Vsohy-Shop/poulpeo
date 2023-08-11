package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6229n4 extends C6197k5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f7998l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public C6218m4 f7999c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C6218m4 f8000d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C6207l4<?>> f8001e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C6207l4<?>> f8002f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f8003g = new C6196k4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f8004h = new C6196k4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f8005i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f8006j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f8007k;

    C6229n4(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: D */
    private final void m10901D(C6207l4<?> l4Var) {
        synchronized (this.f8005i) {
            this.f8001e.add(l4Var);
            C6218m4 m4Var = this.f7999c;
            if (m4Var == null) {
                C6218m4 m4Var2 = new C6218m4(this, "Measurement Worker", this.f8001e);
                this.f7999c = m4Var2;
                m4Var2.setUncaughtExceptionHandler(this.f8003g);
                this.f7999c.start();
            } else {
                m4Var.mo35094a();
            }
        }
    }

    /* renamed from: A */
    public final void mo35104A(Runnable runnable) {
        mo35062k();
        C9713p.m20275j(runnable);
        m10901D(new C6207l4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo35105C() {
        if (Thread.currentThread() == this.f7999c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo35053g() {
        if (Thread.currentThread() != this.f8000d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo34778h() {
        if (Thread.currentThread() != this.f7999c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo35061j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo35037a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f7899a.mo34920b().mo35080w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r5.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r3.mo35037a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f7899a.mo34920b().mo35080w();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    @androidx.annotation.Nullable
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo35106r(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.n4 r0 = r0.mo34919a()     // Catch:{ all -> 0x0058 }
            r0.mo35110z(r6)     // Catch:{ all -> 0x0058 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35080w()
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo35037a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.l3 r3 = r3.mo34920b()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.j3 r3 = r3.mo35080w()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x004c
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x004c:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0058 }
            r5.<init>(r4)     // Catch:{ all -> 0x0058 }
            r4 = r5
        L_0x0052:
            r3.mo35037a(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            r2 = 0
            return r2
        L_0x0058:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6229n4.mo35106r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final <V> Future<V> mo35107s(Callable<V> callable) {
        mo35062k();
        C9713p.m20275j(callable);
        C6207l4 l4Var = new C6207l4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7999c) {
            if (!this.f8001e.isEmpty()) {
                this.f7899a.mo34920b().mo35080w().mo35037a("Callable skipped the worker queue.");
            }
            l4Var.run();
        } else {
            m10901D(l4Var);
        }
        return l4Var;
    }

    /* renamed from: t */
    public final <V> Future<V> mo35108t(Callable<V> callable) {
        mo35062k();
        C9713p.m20275j(callable);
        C6207l4 l4Var = new C6207l4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7999c) {
            l4Var.run();
        } else {
            m10901D(l4Var);
        }
        return l4Var;
    }

    /* renamed from: y */
    public final void mo35109y(Runnable runnable) {
        mo35062k();
        C9713p.m20275j(runnable);
        C6207l4 l4Var = new C6207l4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8005i) {
            this.f8002f.add(l4Var);
            C6218m4 m4Var = this.f8000d;
            if (m4Var == null) {
                C6218m4 m4Var2 = new C6218m4(this, "Measurement Network", this.f8002f);
                this.f8000d = m4Var2;
                m4Var2.setUncaughtExceptionHandler(this.f8004h);
                this.f8000d.start();
            } else {
                m4Var.mo35094a();
            }
        }
    }

    /* renamed from: z */
    public final void mo35110z(Runnable runnable) {
        mo35062k();
        C9713p.m20275j(runnable);
        m10901D(new C6207l4(this, runnable, false, "Task exception on worker thread"));
    }
}
