package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import java.util.concurrent.BlockingQueue;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6218m4 extends Thread {

    /* renamed from: b */
    private final Object f7976b;

    /* renamed from: c */
    private final BlockingQueue<C6207l4<?>> f7977c;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: d */
    private boolean f7978d = false;

    /* renamed from: e */
    final /* synthetic */ C6229n4 f7979e;

    public C6218m4(C6229n4 n4Var, String str, BlockingQueue<C6207l4<?>> blockingQueue) {
        this.f7979e = n4Var;
        C9713p.m20275j(str);
        C9713p.m20275j(blockingQueue);
        this.f7976b = new Object();
        this.f7977c = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m10888b() {
        synchronized (this.f7979e.f8005i) {
            if (!this.f7978d) {
                this.f7979e.f8006j.release();
                this.f7979e.f8005i.notifyAll();
                if (this == this.f7979e.f7999c) {
                    this.f7979e.f7999c = null;
                } else if (this == this.f7979e.f8000d) {
                    this.f7979e.f8000d = null;
                } else {
                    this.f7979e.f7899a.mo34920b().mo35075r().mo35037a("Current scheduler thread is neither worker nor network");
                }
                this.f7978d = true;
            }
        }
    }

    /* renamed from: c */
    private final void m10889c(InterruptedException interruptedException) {
        this.f7979e.f7899a.mo34920b().mo35080w().mo35038b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo35094a() {
        synchronized (this.f7976b) {
            this.f7976b.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        m10888b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 1
            if (r0 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.n4 r2 = r6.f7979e     // Catch:{ InterruptedException -> 0x000f }
            java.util.concurrent.Semaphore r2 = r2.f8006j     // Catch:{ InterruptedException -> 0x000f }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000f }
            r0 = r1
            goto L_0x0001
        L_0x000f:
            r1 = move-exception
            r6.m10889c(r1)
            goto L_0x0001
        L_0x0014:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0082 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0082 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.l4<?>> r2 = r6.f7977c     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.l4 r2 = (com.google.android.gms.measurement.internal.C6207l4) r2     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f7948c     // Catch:{ all -> 0x0082 }
            if (r1 == r3) goto L_0x002d
            r3 = 10
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0082 }
            r2.run()     // Catch:{ all -> 0x0082 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f7976b     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.l4<?>> r3 = r6.f7977c     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0051
            com.google.android.gms.measurement.internal.n4 r3 = r6.f7979e     // Catch:{ all -> 0x007f }
            boolean unused = r3.f8007k     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.f7976b     // Catch:{ InterruptedException -> 0x004d }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6.m10889c(r3)     // Catch:{ all -> 0x007f }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.n4 r2 = r6.f7979e     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f8005i     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.l4<?>> r3 = r6.f7977c     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            com.google.android.gms.measurement.internal.n4 r0 = r6.f7979e     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C6084a3.f7591l0     // Catch:{ all -> 0x007c }
            r3 = 0
            boolean r0 = r0.mo34873B(r3, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            r6.m10888b()     // Catch:{ all -> 0x007c }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            r6.m10888b()
            return
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x001c
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r6.m10888b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6218m4.run():void");
    }
}
