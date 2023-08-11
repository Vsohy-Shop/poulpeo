package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C4423o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p058d1.C7218e;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.a */
/* compiled from: ActiveResources */
final class C4384a {

    /* renamed from: a */
    private final boolean f3770a;

    /* renamed from: b */
    private final Executor f3771b;
    @VisibleForTesting

    /* renamed from: c */
    final Map<C7218e, C4388c> f3772c;

    /* renamed from: d */
    private final ReferenceQueue<C4423o<?>> f3773d;

    /* renamed from: e */
    private C4423o.C4424a f3774e;

    /* renamed from: f */
    private volatile boolean f3775f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* compiled from: ActiveResources */
    class C4385a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* compiled from: ActiveResources */
        class C4386a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Runnable f3776b;

            C4386a(Runnable runnable) {
                this.f3776b = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f3776b.run();
            }
        }

        C4385a() {
        }

        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new C4386a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* compiled from: ActiveResources */
    class C4387b implements Runnable {
        C4387b() {
        }

        public void run() {
            C4384a.this.mo31259b();
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* compiled from: ActiveResources */
    static final class C4388c extends WeakReference<C4423o<?>> {

        /* renamed from: a */
        final C7218e f3779a;

        /* renamed from: b */
        final boolean f3780b;
        @Nullable

        /* renamed from: c */
        C7744c<?> f3781c;

        C4388c(@NonNull C7218e eVar, @NonNull C4423o<?> oVar, @NonNull ReferenceQueue<? super C4423o<?>> referenceQueue, boolean z) {
            super(oVar, referenceQueue);
            C7744c<?> cVar;
            this.f3779a = (C7218e) C10791j.m22948d(eVar);
            if (!oVar.mo31368d() || !z) {
                cVar = null;
            } else {
                cVar = (C7744c) C10791j.m22948d(oVar.mo31367c());
            }
            this.f3781c = cVar;
            this.f3780b = oVar.mo31368d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo31267a() {
            this.f3781c = null;
            clear();
        }
    }

    C4384a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C4385a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo31258a(C7218e eVar, C4423o<?> oVar) {
        C4388c put = this.f3772c.put(eVar, new C4388c(eVar, oVar, this.f3773d, this.f3770a));
        if (put != null) {
            put.mo31267a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31259b() {
        while (!this.f3775f) {
            try {
                mo31260c((C4388c) this.f3773d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31260c(@NonNull C4388c cVar) {
        synchronized (this) {
            this.f3772c.remove(cVar.f3779a);
            if (cVar.f3780b) {
                C7744c<?> cVar2 = cVar.f3781c;
                if (cVar2 != null) {
                    this.f3774e.mo31329c(cVar.f3779a, new C4423o(cVar2, true, false, cVar.f3779a, this.f3774e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo31261d(C7218e eVar) {
        C4388c remove = this.f3772c.remove(eVar);
        if (remove != null) {
            remove.mo31267a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r0;
     */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C4423o<?> mo31262e(p058d1.C7218e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<d1.e, com.bumptech.glide.load.engine.a$c> r0 = r1.f3772c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$c r2 = (com.bumptech.glide.load.engine.C4384a.C4388c) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.C4423o) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo31260c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4384a.mo31262e(d1.e):com.bumptech.glide.load.engine.o");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo31263f(C4423o.C4424a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3774e = aVar;
            }
        }
    }

    @VisibleForTesting
    C4384a(boolean z, Executor executor) {
        this.f3772c = new HashMap();
        this.f3773d = new ReferenceQueue<>();
        this.f3770a = z;
        this.f3771b = executor;
        executor.execute(new C4387b());
    }
}
