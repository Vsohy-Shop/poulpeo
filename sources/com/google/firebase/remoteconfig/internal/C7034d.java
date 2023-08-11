package com.google.firebase.remoteconfig.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.profileinstaller.C2553b;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p276x5.C10396b;
import p276x5.C10400d;
import p276x5.C10402e;
import p276x5.C10410i;

@AnyThread
/* renamed from: com.google.firebase.remoteconfig.internal.d */
/* compiled from: ConfigCacheClient */
public class C7034d {
    @GuardedBy("ConfigCacheClient.class")

    /* renamed from: d */
    private static final Map<String, C7034d> f9426d = new HashMap();

    /* renamed from: e */
    private static final Executor f9427e = new C2553b();

    /* renamed from: a */
    private final ExecutorService f9428a;

    /* renamed from: b */
    private final C7050n f9429b;
    @GuardedBy("this")
    @Nullable

    /* renamed from: c */
    private Task<C7037e> f9430c = null;

    /* renamed from: com.google.firebase.remoteconfig.internal.d$b */
    /* compiled from: ConfigCacheClient */
    private static class C7036b<TResult> implements C10402e<TResult>, C10400d, C10396b {

        /* renamed from: a */
        private final CountDownLatch f9431a;

        private C7036b() {
            this.f9431a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void mo29368a(TResult tresult) {
            this.f9431a.countDown();
        }

        /* renamed from: b */
        public void mo29406b(@NonNull Exception exc) {
            this.f9431a.countDown();
        }

        /* renamed from: c */
        public boolean mo40041c(long j, TimeUnit timeUnit) {
            return this.f9431a.await(j, timeUnit);
        }

        public void onCanceled() {
            this.f9431a.countDown();
        }
    }

    private C7034d(ExecutorService executorService, C7050n nVar) {
        this.f9428a = executorService;
        this.f9429b = nVar;
    }

    /* renamed from: c */
    private static <TResult> TResult m12498c(Task<TResult> task, long j, TimeUnit timeUnit) {
        C7036b bVar = new C7036b();
        Executor executor = f9427e;
        task.mo35455f(executor, bVar);
        task.mo35453d(executor, bVar);
        task.mo35450a(executor, bVar);
        if (!bVar.mo40041c(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.mo35465p()) {
            return task.mo35461l();
        } else {
            throw new ExecutionException(task.mo35460k());
        }
    }

    /* renamed from: h */
    public static synchronized C7034d m12499h(ExecutorService executorService, C7050n nVar) {
        C7034d dVar;
        synchronized (C7034d.class) {
            String b = nVar.mo40075b();
            Map<String, C7034d> map = f9426d;
            if (!map.containsKey(b)) {
                map.put(b, new C7034d(executorService, nVar));
            }
            dVar = map.get(b);
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Void m12500i(C7037e eVar) {
        return this.f9429b.mo40077e(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m12501j(boolean z, C7037e eVar, Void voidR) {
        if (z) {
            m12502m(eVar);
        }
        return C10410i.m21831e(eVar);
    }

    /* renamed from: m */
    private synchronized void m12502m(C7037e eVar) {
        this.f9430c = C10410i.m21831e(eVar);
    }

    /* renamed from: d */
    public void mo40035d() {
        synchronized (this) {
            this.f9430c = C10410i.m21831e(null);
        }
        this.f9429b.mo40074a();
    }

    /* renamed from: e */
    public synchronized Task<C7037e> mo40036e() {
        Task<C7037e> task = this.f9430c;
        if (task == null || (task.mo35464o() && !this.f9430c.mo35465p())) {
            ExecutorService executorService = this.f9428a;
            C7050n nVar = this.f9429b;
            Objects.requireNonNull(nVar);
            this.f9430c = C10410i.m21829c(executorService, new C7031a(nVar));
        }
        return this.f9430c;
    }

    @Nullable
    /* renamed from: f */
    public C7037e mo40037f() {
        return mo40038g(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.C7037e) m12498c(mo40036e(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return null;
     */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.Nullable
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C7037e mo40038g(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.e> r0 = r2.f9430c     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo35465p()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.e> r3 = r2.f9430c     // Catch:{ all -> 0x0031 }
            java.lang.Object r3 = r3.mo35461l()     // Catch:{ all -> 0x0031 }
            com.google.firebase.remoteconfig.internal.e r3 = (com.google.firebase.remoteconfig.internal.C7037e) r3     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            com.google.android.gms.tasks.Task r0 = r2.mo40036e()     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.lang.Object r3 = m12498c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.e r3 = (com.google.firebase.remoteconfig.internal.C7037e) r3     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0028
        L_0x0025:
            r3 = move-exception
            goto L_0x0028
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C7034d.mo40038g(long):com.google.firebase.remoteconfig.internal.e");
    }

    /* renamed from: k */
    public Task<C7037e> mo40039k(C7037e eVar) {
        return mo40040l(eVar, true);
    }

    /* renamed from: l */
    public Task<C7037e> mo40040l(C7037e eVar, boolean z) {
        return C10410i.m21829c(this.f9428a, new C7032b(this, eVar)).mo35466q(this.f9428a, new C7033c(this, z, eVar));
    }
}
