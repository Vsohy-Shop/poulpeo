package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.c1 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C6965c1 {
    @GuardedBy("TopicsStore.class")

    /* renamed from: d */
    private static WeakReference<C6965c1> f9255d;

    /* renamed from: a */
    private final SharedPreferences f9256a;

    /* renamed from: b */
    private C7024y0 f9257b;

    /* renamed from: c */
    private final Executor f9258c;

    private C6965c1(SharedPreferences sharedPreferences, Executor executor) {
        this.f9258c = executor;
        this.f9256a = sharedPreferences;
    }

    @WorkerThread
    /* renamed from: b */
    public static synchronized C6965c1 m12238b(Context context, Executor executor) {
        C6965c1 c1Var;
        synchronized (C6965c1.class) {
            WeakReference<C6965c1> weakReference = f9255d;
            if (weakReference != null) {
                c1Var = weakReference.get();
            } else {
                c1Var = null;
            }
            if (c1Var != null) {
                return c1Var;
            }
            C6965c1 c1Var2 = new C6965c1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            c1Var2.m12239d();
            f9255d = new WeakReference<>(c1Var2);
            return c1Var2;
        }
    }

    @WorkerThread
    /* renamed from: d */
    private synchronized void m12239d() {
        this.f9257b = C7024y0.m12434d(this.f9256a, "topic_operation_queue", ",", this.f9258c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo39895a(C6962b1 b1Var) {
        return this.f9257b.mo40001b(b1Var.mo39891e());
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public synchronized C6962b1 mo39896c() {
        return C6962b1.m12225a(this.f9257b.mo40002f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized boolean mo39897e(C6962b1 b1Var) {
        return this.f9257b.mo40003g(b1Var.mo39891e());
    }
}
