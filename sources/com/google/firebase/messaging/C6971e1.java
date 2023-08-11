package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: com.google.firebase.messaging.e1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6971e1 {

    /* renamed from: i */
    private static final long f9271i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f9272a;

    /* renamed from: b */
    private final C6991k0 f9273b;

    /* renamed from: c */
    private final C6973f0 f9274c;

    /* renamed from: d */
    private final FirebaseMessaging f9275d;
    @GuardedBy("pendingOperations")

    /* renamed from: e */
    private final Map<String, ArrayDeque<C10406g<Void>>> f9276e = new ArrayMap();

    /* renamed from: f */
    private final ScheduledExecutorService f9277f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f9278g = false;

    /* renamed from: h */
    private final C6965c1 f9279h;

    private C6971e1(FirebaseMessaging firebaseMessaging, C6991k0 k0Var, C6965c1 c1Var, C6973f0 f0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f9275d = firebaseMessaging;
        this.f9273b = k0Var;
        this.f9279h = c1Var;
        this.f9274c = f0Var;
        this.f9272a = context;
        this.f9277f = scheduledExecutorService;
    }

    /* renamed from: a */
    private void m12245a(C6962b1 b1Var, C10406g<Void> gVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f9276e) {
            String e = b1Var.mo39891e();
            if (this.f9276e.containsKey(e)) {
                arrayDeque = this.f9276e.get(e);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f9276e.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(gVar);
        }
    }

    @WorkerThread
    /* renamed from: b */
    private static <T> void m12246b(Task<T> task) {
        try {
            C10410i.m21828b(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    @WorkerThread
    /* renamed from: c */
    private void m12247c(String str) {
        m12246b(this.f9274c.mo39916k(this.f9275d.blockingGetToken(), str));
    }

    @WorkerThread
    /* renamed from: d */
    private void m12248d(String str) {
        m12246b(this.f9274c.mo39917l(this.f9275d.blockingGetToken(), str));
    }

    @VisibleForTesting
    /* renamed from: e */
    static Task<C6971e1> m12249e(FirebaseMessaging firebaseMessaging, C6991k0 k0Var, C6973f0 f0Var, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        return C10410i.m21829c(scheduledExecutorService, new C6968d1(context, scheduledExecutorService, firebaseMessaging, k0Var, f0Var));
    }

    /* renamed from: g */
    static boolean m12250g() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    static /* synthetic */ C6971e1 m12251i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6991k0 k0Var, C6973f0 f0Var) {
        return new C6971e1(firebaseMessaging, k0Var, C6965c1.m12238b(context, scheduledExecutorService), f0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12252j(com.google.firebase.messaging.C6962b1 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<x5.g<java.lang.Void>>> r0 = r4.f9276e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo39891e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<x5.g<java.lang.Void>>> r1 = r4.f9276e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<x5.g<java.lang.Void>>> r1 = r4.f9276e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            x5.g r2 = (p276x5.C10406g) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo45098c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<x5.g<java.lang.Void>>> r1 = r4.f9276e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6971e1.m12252j(com.google.firebase.messaging.b1):void");
    }

    /* renamed from: o */
    private void m12253o() {
        if (!mo39902h()) {
            mo39910s(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo39901f() {
        if (this.f9279h.mo39896c() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized boolean mo39902h() {
        return this.f9278g;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d A[Catch:{ IOException -> 0x00c0 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39903k(com.google.firebase.messaging.C6962b1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.mo39889b()     // Catch:{ IOException -> 0x00c0 }
            int r3 = r2.hashCode()     // Catch:{ IOException -> 0x00c0 }
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L_0x001f
            r4 = 85
            if (r3 == r4) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = r5
            goto L_0x002a
        L_0x001f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L_0x008d
            if (r2 == r5) goto L_0x005a
            boolean r2 = m12250g()     // Catch:{ IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00c0 }
            int r2 = r7.length()     // Catch:{ IOException -> 0x00c0 }
            int r2 = r2 + 24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c0 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = "Unknown topic operation"
            r3.append(r2)     // Catch:{ IOException -> 0x00c0 }
            r3.append(r7)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r7 = "."
            r3.append(r7)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r7 = r3.toString()     // Catch:{ IOException -> 0x00c0 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00bf
        L_0x005a:
            java.lang.String r2 = r7.mo39890c()     // Catch:{ IOException -> 0x00c0 }
            r6.m12248d(r2)     // Catch:{ IOException -> 0x00c0 }
            boolean r2 = m12250g()     // Catch:{ IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r7 = r7.mo39890c()     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00c0 }
            int r2 = r2 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c0 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = "Unsubscribe from topic: "
            r4.append(r2)     // Catch:{ IOException -> 0x00c0 }
            r4.append(r7)     // Catch:{ IOException -> 0x00c0 }
            r4.append(r3)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x00c0 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00c0 }
            goto L_0x00bf
        L_0x008d:
            java.lang.String r2 = r7.mo39890c()     // Catch:{ IOException -> 0x00c0 }
            r6.m12247c(r2)     // Catch:{ IOException -> 0x00c0 }
            boolean r2 = m12250g()     // Catch:{ IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x00bf
            java.lang.String r7 = r7.mo39890c()     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00c0 }
            int r2 = r2 + 31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c0 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r2 = "Subscribe to topic: "
            r4.append(r2)     // Catch:{ IOException -> 0x00c0 }
            r4.append(r7)     // Catch:{ IOException -> 0x00c0 }
            r4.append(r3)     // Catch:{ IOException -> 0x00c0 }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x00c0 }
            android.util.Log.d(r0, r7)     // Catch:{ IOException -> 0x00c0 }
        L_0x00bf:
            return r5
        L_0x00c0:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00e7
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00da
            goto L_0x00e7
        L_0x00da:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto L_0x00e6
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        L_0x00e6:
            throw r7
        L_0x00e7:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r7)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 53
            r3.<init>(r2)
            java.lang.String r2 = "Topic operation failed: "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6971e1.mo39903k(com.google.firebase.messaging.b1):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo39904l(Runnable runnable, long j) {
        this.f9277f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: m */
    public Task<Void> mo39905m(C6962b1 b1Var) {
        this.f9279h.mo39895a(b1Var);
        C10406g gVar = new C10406g();
        m12245a(b1Var, gVar);
        return gVar.mo45096a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized void mo39906n(boolean z) {
        this.f9278g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo39907p() {
        if (mo39901f()) {
            m12253o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Task<Void> mo39908q(String str) {
        Task<Void> m = mo39905m(C6962b1.m12227f(str));
        mo39907p();
        return m;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (mo39903k(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return true;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39909r() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.c1 r0 = r2.f9279h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.b1 r0 = r0.mo39896c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m12250g()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            r0 = 1
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo39903k(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.c1 r1 = r2.f9279h
            r1.mo39897e(r0)
            r2.m12252j(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C6971e1.mo39909r():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo39910s(long j) {
        mo39904l(new C6974f1(this, this.f9272a, this.f9273b, Math.min(Math.max(30, j + j), f9271i)), j);
        mo39906n(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Task<Void> mo39911t(String str) {
        Task<Void> m = mo39905m(C6962b1.m12228g(str));
        mo39907p();
        return m;
    }
}
