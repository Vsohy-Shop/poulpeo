package com.bumptech.glide.load.engine;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C4396h;
import com.bumptech.glide.load.engine.C4423o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p020a2.C2125a;
import p020a2.C2134c;
import p058d1.C7214a;
import p058d1.C7218e;
import p094g1.C7744c;
import p127j1.C8329a;
import p250v1.C9921g;
import p294z1.C10784e;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.k */
/* compiled from: EngineJob */
class C4414k<R> implements C4396h.C4398b<R>, C2125a.C2131f {

    /* renamed from: z */
    private static final C4417c f3898z = new C4417c();

    /* renamed from: b */
    final C4419e f3899b;

    /* renamed from: c */
    private final C2134c f3900c;

    /* renamed from: d */
    private final C4423o.C4424a f3901d;

    /* renamed from: e */
    private final Pools.Pool<C4414k<?>> f3902e;

    /* renamed from: f */
    private final C4417c f3903f;

    /* renamed from: g */
    private final C4420l f3904g;

    /* renamed from: h */
    private final C8329a f3905h;

    /* renamed from: i */
    private final C8329a f3906i;

    /* renamed from: j */
    private final C8329a f3907j;

    /* renamed from: k */
    private final C8329a f3908k;

    /* renamed from: l */
    private final AtomicInteger f3909l;

    /* renamed from: m */
    private C7218e f3910m;

    /* renamed from: n */
    private boolean f3911n;

    /* renamed from: o */
    private boolean f3912o;

    /* renamed from: p */
    private boolean f3913p;

    /* renamed from: q */
    private boolean f3914q;

    /* renamed from: r */
    private C7744c<?> f3915r;

    /* renamed from: s */
    C7214a f3916s;

    /* renamed from: t */
    private boolean f3917t;

    /* renamed from: u */
    GlideException f3918u;

    /* renamed from: v */
    private boolean f3919v;

    /* renamed from: w */
    C4423o<?> f3920w;

    /* renamed from: x */
    private C4396h<R> f3921x;

    /* renamed from: y */
    private volatile boolean f3922y;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    /* compiled from: EngineJob */
    private class C4415a implements Runnable {

        /* renamed from: b */
        private final C9921g f3923b;

        C4415a(C9921g gVar) {
            this.f3923b = gVar;
        }

        public void run() {
            synchronized (this.f3923b.mo44500f()) {
                synchronized (C4414k.this) {
                    if (C4414k.this.f3899b.mo31357d(this.f3923b)) {
                        C4414k.this.mo31339f(this.f3923b);
                    }
                    C4414k.this.mo31342i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    /* compiled from: EngineJob */
    private class C4416b implements Runnable {

        /* renamed from: b */
        private final C9921g f3925b;

        C4416b(C9921g gVar) {
            this.f3925b = gVar;
        }

        public void run() {
            synchronized (this.f3925b.mo44500f()) {
                synchronized (C4414k.this) {
                    if (C4414k.this.f3899b.mo31357d(this.f3925b)) {
                        C4414k.this.f3920w.mo31366b();
                        C4414k.this.mo31340g(this.f3925b);
                        C4414k.this.mo31348r(this.f3925b);
                    }
                    C4414k.this.mo31342i();
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.k$c */
    /* compiled from: EngineJob */
    static class C4417c {
        C4417c() {
        }

        /* renamed from: a */
        public <R> C4423o<R> mo31352a(C7744c<R> cVar, boolean z, C7218e eVar, C4423o.C4424a aVar) {
            return new C4423o(cVar, z, true, eVar, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    /* compiled from: EngineJob */
    static final class C4418d {

        /* renamed from: a */
        final C9921g f3927a;

        /* renamed from: b */
        final Executor f3928b;

        C4418d(C9921g gVar, Executor executor) {
            this.f3927a = gVar;
            this.f3928b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4418d) {
                return this.f3927a.equals(((C4418d) obj).f3927a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3927a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$e */
    /* compiled from: EngineJob */
    static final class C4419e implements Iterable<C4418d> {

        /* renamed from: b */
        private final List<C4418d> f3929b;

        C4419e() {
            this(new ArrayList(2));
        }

        /* renamed from: k */
        private static C4418d m5265k(C9921g gVar) {
            return new C4418d(gVar, C10784e.m22929a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo31355b(C9921g gVar, Executor executor) {
            this.f3929b.add(new C4418d(gVar, executor));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f3929b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo31357d(C9921g gVar) {
            return this.f3929b.contains(m5265k(gVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f3929b.isEmpty();
        }

        @NonNull
        public Iterator<C4418d> iterator() {
            return this.f3929b.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C4419e mo31360j() {
            return new C4419e(new ArrayList(this.f3929b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo31361q(C9921g gVar) {
            this.f3929b.remove(m5265k(gVar));
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f3929b.size();
        }

        C4419e(List<C4418d> list) {
            this.f3929b = list;
        }
    }

    C4414k(C8329a aVar, C8329a aVar2, C8329a aVar3, C8329a aVar4, C4420l lVar, C4423o.C4424a aVar5, Pools.Pool<C4414k<?>> pool) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, pool, f3898z);
    }

    /* renamed from: j */
    private C8329a m5245j() {
        if (this.f3912o) {
            return this.f3907j;
        }
        if (this.f3913p) {
            return this.f3908k;
        }
        return this.f3906i;
    }

    /* renamed from: m */
    private boolean m5246m() {
        if (this.f3919v || this.f3917t || this.f3922y) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private synchronized void m5247q() {
        if (this.f3910m != null) {
            this.f3899b.clear();
            this.f3910m = null;
            this.f3920w = null;
            this.f3915r = null;
            this.f3919v = false;
            this.f3922y = false;
            this.f3917t = false;
            this.f3921x.mo31311w(false);
            this.f3921x = null;
            this.f3918u = null;
            this.f3916s = null;
            this.f3902e.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo31312a(GlideException glideException) {
        synchronized (this) {
            this.f3918u = glideException;
        }
        mo31345n();
    }

    /* renamed from: b */
    public void mo31313b(C7744c<R> cVar, C7214a aVar) {
        synchronized (this) {
            this.f3915r = cVar;
            this.f3916s = aVar;
        }
        mo31346o();
    }

    /* renamed from: c */
    public void mo31314c(C4396h<?> hVar) {
        m5245j().execute(hVar);
    }

    @NonNull
    /* renamed from: d */
    public C2134c mo23271d() {
        return this.f3900c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo31338e(C9921g gVar, Executor executor) {
        this.f3900c.mo23273c();
        this.f3899b.mo31355b(gVar, executor);
        boolean z = true;
        if (this.f3917t) {
            mo31343k(1);
            executor.execute(new C4416b(gVar));
        } else if (this.f3919v) {
            mo31343k(1);
            executor.execute(new C4415a(gVar));
        } else {
            if (this.f3922y) {
                z = false;
            }
            C10791j.m22945a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("this")
    /* renamed from: f */
    public void mo31339f(C9921g gVar) {
        try {
            gVar.mo44498a(this.f3918u);
        } catch (Throwable th) {
            throw new C4389b(th);
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("this")
    /* renamed from: g */
    public void mo31340g(C9921g gVar) {
        try {
            gVar.mo44499b(this.f3920w, this.f3916s);
        } catch (Throwable th) {
            throw new C4389b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo31341h() {
        if (!m5246m()) {
            this.f3922y = true;
            this.f3921x.mo31305b();
            this.f3904g.mo31328b(this, this.f3910m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo31342i() {
        boolean z;
        C4423o<?> oVar;
        synchronized (this) {
            this.f3900c.mo23273c();
            C10791j.m22945a(m5246m(), "Not yet complete!");
            int decrementAndGet = this.f3909l.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10791j.m22945a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                oVar = this.f3920w;
                m5247q();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.mo31369e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void mo31343k(int i) {
        C4423o<?> oVar;
        C10791j.m22945a(m5246m(), "Not yet complete!");
        if (this.f3909l.getAndAdd(i) == 0 && (oVar = this.f3920w) != null) {
            oVar.mo31366b();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: l */
    public synchronized C4414k<R> mo31344l(C7218e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f3910m = eVar;
        this.f3911n = z;
        this.f3912o = z2;
        this.f3913p = z3;
        this.f3914q = z4;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f3904g.mo31327a(r4, r1, (com.bumptech.glide.load.engine.C4423o<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f3928b.execute(new com.bumptech.glide.load.engine.C4414k.C4415a(r4, r1.f3927a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo31342i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31345n() {
        /*
            r4 = this;
            monitor-enter(r4)
            a2.c r0 = r4.f3900c     // Catch:{ all -> 0x0066 }
            r0.mo23273c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f3922y     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m5247q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.k$e r0 = r4.f3899b     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f3919v     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f3919v = r0     // Catch:{ all -> 0x0066 }
            d1.e r1 = r4.f3910m     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r4.f3899b     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r2.mo31360j()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo31343k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l r0 = r4.f3904g
            r3 = 0
            r0.mo31327a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C4414k.C4418d) r1
            java.util.concurrent.Executor r2 = r1.f3928b
            com.bumptech.glide.load.engine.k$a r3 = new com.bumptech.glide.load.engine.k$a
            v1.g r1 = r1.f3927a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo31342i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4414k.mo31345n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f3904g.mo31327a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f3928b.execute(new com.bumptech.glide.load.engine.C4414k.C4416b(r5, r1.f3927a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo31342i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31346o() {
        /*
            r5 = this;
            monitor-enter(r5)
            a2.c r0 = r5.f3900c     // Catch:{ all -> 0x007c }
            r0.mo23273c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f3922y     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            g1.c<?> r0 = r5.f3915r     // Catch:{ all -> 0x007c }
            r0.recycle()     // Catch:{ all -> 0x007c }
            r5.m5247q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.k$e r0 = r5.f3899b     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f3917t     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.k$c r0 = r5.f3903f     // Catch:{ all -> 0x007c }
            g1.c<?> r1 = r5.f3915r     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f3911n     // Catch:{ all -> 0x007c }
            d1.e r3 = r5.f3910m     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o$a r4 = r5.f3901d     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o r0 = r0.mo31352a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f3920w = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f3917t = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r5.f3899b     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r1.mo31360j()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo31343k(r2)     // Catch:{ all -> 0x007c }
            d1.e r0 = r5.f3910m     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o<?> r2 = r5.f3920w     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.l r3 = r5.f3904g
            r3.mo31327a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C4414k.C4418d) r1
            java.util.concurrent.Executor r2 = r1.f3928b
            com.bumptech.glide.load.engine.k$b r3 = new com.bumptech.glide.load.engine.k$b
            v1.g r1 = r1.f3927a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo31342i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4414k.mo31346o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo31347p() {
        return this.f3914q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo31348r(C9921g gVar) {
        boolean z;
        this.f3900c.mo23273c();
        this.f3899b.mo31361q(gVar);
        if (this.f3899b.isEmpty()) {
            mo31341h();
            if (!this.f3917t) {
                if (!this.f3919v) {
                    z = false;
                    if (z && this.f3909l.get() == 0) {
                        m5247q();
                    }
                }
            }
            z = true;
            m5247q();
        }
    }

    /* renamed from: s */
    public synchronized void mo31349s(C4396h<R> hVar) {
        C8329a aVar;
        this.f3921x = hVar;
        if (hVar.mo31304H()) {
            aVar = this.f3905h;
        } else {
            aVar = m5245j();
        }
        aVar.execute(hVar);
    }

    @VisibleForTesting
    C4414k(C8329a aVar, C8329a aVar2, C8329a aVar3, C8329a aVar4, C4420l lVar, C4423o.C4424a aVar5, Pools.Pool<C4414k<?>> pool, C4417c cVar) {
        this.f3899b = new C4419e();
        this.f3900c = C2134c.m1493a();
        this.f3909l = new AtomicInteger();
        this.f3905h = aVar;
        this.f3906i = aVar2;
        this.f3907j = aVar3;
        this.f3908k = aVar4;
        this.f3904g = lVar;
        this.f3901d = aVar5;
        this.f3902e = pool;
        this.f3903f = cVar;
    }
}
