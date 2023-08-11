package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.C4366d;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.engine.C4396h;
import com.bumptech.glide.load.engine.C4423o;
import java.util.Map;
import java.util.concurrent.Executor;
import p020a2.C2125a;
import p058d1.C7214a;
import p058d1.C7218e;
import p058d1.C7222g;
import p058d1.C7226k;
import p094g1.C7737a;
import p094g1.C7744c;
import p117i1.C8064a;
import p117i1.C8067b;
import p117i1.C8077h;
import p127j1.C8329a;
import p250v1.C9921g;
import p294z1.C10787f;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.j */
/* compiled from: Engine */
public class C4407j implements C4420l, C8077h.C8078a, C4423o.C4424a {

    /* renamed from: i */
    private static final boolean f3872i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C4425p f3873a;

    /* renamed from: b */
    private final C4422n f3874b;

    /* renamed from: c */
    private final C8077h f3875c;

    /* renamed from: d */
    private final C4410b f3876d;

    /* renamed from: e */
    private final C4431u f3877e;

    /* renamed from: f */
    private final C4412c f3878f;

    /* renamed from: g */
    private final C4408a f3879g;

    /* renamed from: h */
    private final C4384a f3880h;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.j$a */
    /* compiled from: Engine */
    static class C4408a {

        /* renamed from: a */
        final C4396h.C4401e f3881a;

        /* renamed from: b */
        final Pools.Pool<C4396h<?>> f3882b = C2125a.m1478d(150, new C4409a());

        /* renamed from: c */
        private int f3883c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a */
        /* compiled from: Engine */
        class C4409a implements C2125a.C2129d<C4396h<?>> {
            C4409a() {
            }

            /* renamed from: b */
            public C4396h<?> mo23268a() {
                C4408a aVar = C4408a.this;
                return new C4396h<>(aVar.f3881a, aVar.f3882b);
            }
        }

        C4408a(C4396h.C4401e eVar) {
            this.f3881a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C4396h<R> mo31333a(C4366d dVar, Object obj, C4421m mVar, C7218e eVar, int i, int i2, Class<?> cls, Class<R> cls2, C4368f fVar, C7737a aVar, Map<Class<?>, C7226k<?>> map, boolean z, boolean z2, boolean z3, C7222g gVar, C4396h.C4398b<R> bVar) {
            C4396h hVar = (C4396h) C10791j.m22948d(this.f3882b.acquire());
            int i3 = this.f3883c;
            int i4 = i3;
            this.f3883c = i3 + 1;
            return hVar.mo31308n(dVar, obj, mVar, eVar, i, i2, cls, cls2, fVar, aVar, map, z, z2, z3, gVar, bVar, i4);
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.j$b */
    /* compiled from: Engine */
    static class C4410b {

        /* renamed from: a */
        final C8329a f3885a;

        /* renamed from: b */
        final C8329a f3886b;

        /* renamed from: c */
        final C8329a f3887c;

        /* renamed from: d */
        final C8329a f3888d;

        /* renamed from: e */
        final C4420l f3889e;

        /* renamed from: f */
        final C4423o.C4424a f3890f;

        /* renamed from: g */
        final Pools.Pool<C4414k<?>> f3891g = C2125a.m1478d(150, new C4411a());

        /* renamed from: com.bumptech.glide.load.engine.j$b$a */
        /* compiled from: Engine */
        class C4411a implements C2125a.C2129d<C4414k<?>> {
            C4411a() {
            }

            /* renamed from: b */
            public C4414k<?> mo23268a() {
                C4410b bVar = C4410b.this;
                return new C4414k(bVar.f3885a, bVar.f3886b, bVar.f3887c, bVar.f3888d, bVar.f3889e, bVar.f3890f, bVar.f3891g);
            }
        }

        C4410b(C8329a aVar, C8329a aVar2, C8329a aVar3, C8329a aVar4, C4420l lVar, C4423o.C4424a aVar5) {
            this.f3885a = aVar;
            this.f3886b = aVar2;
            this.f3887c = aVar3;
            this.f3888d = aVar4;
            this.f3889e = lVar;
            this.f3890f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C4414k<R> mo31335a(C7218e eVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C4414k) C10791j.m22948d(this.f3891g.acquire())).mo31344l(eVar, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    /* compiled from: Engine */
    private static class C4412c implements C4396h.C4401e {

        /* renamed from: a */
        private final C8064a.C8065a f3893a;

        /* renamed from: b */
        private volatile C8064a f3894b;

        C4412c(C8064a.C8065a aVar) {
            this.f3893a = aVar;
        }

        /* renamed from: a */
        public C8064a mo31320a() {
            if (this.f3894b == null) {
                synchronized (this) {
                    if (this.f3894b == null) {
                        this.f3894b = this.f3893a.build();
                    }
                    if (this.f3894b == null) {
                        this.f3894b = new C8067b();
                    }
                }
            }
            return this.f3894b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    /* compiled from: Engine */
    public class C4413d {

        /* renamed from: a */
        private final C4414k<?> f3895a;

        /* renamed from: b */
        private final C9921g f3896b;

        C4413d(C9921g gVar, C4414k<?> kVar) {
            this.f3896b = gVar;
            this.f3895a = kVar;
        }

        /* renamed from: a */
        public void mo31337a() {
            synchronized (C4407j.this) {
                this.f3895a.mo31348r(this.f3896b);
            }
        }
    }

    public C4407j(C8077h hVar, C8064a.C8065a aVar, C8329a aVar2, C8329a aVar3, C8329a aVar4, C8329a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C4425p) null, (C4422n) null, (C4384a) null, (C4410b) null, (C4408a) null, (C4431u) null, z);
    }

    /* renamed from: e */
    private C4423o<?> m5225e(C7218e eVar) {
        C7744c<?> d = this.f3875c.mo41903d(eVar);
        if (d == null) {
            return null;
        }
        if (d instanceof C4423o) {
            return (C4423o) d;
        }
        return new C4423o<>(d, true, true, eVar, this);
    }

    @Nullable
    /* renamed from: g */
    private C4423o<?> m5226g(C7218e eVar) {
        C4423o<?> e = this.f3880h.mo31262e(eVar);
        if (e != null) {
            e.mo31366b();
        }
        return e;
    }

    /* renamed from: h */
    private C4423o<?> m5227h(C7218e eVar) {
        C4423o<?> e = m5225e(eVar);
        if (e != null) {
            e.mo31366b();
            this.f3880h.mo31258a(eVar, e);
        }
        return e;
    }

    @Nullable
    /* renamed from: i */
    private C4423o<?> m5228i(C4421m mVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C4423o<?> g = m5226g(mVar);
        if (g != null) {
            if (f3872i) {
                m5229j("Loaded resource from active resources", j, mVar);
            }
            return g;
        }
        C4423o<?> h = m5227h(mVar);
        if (h == null) {
            return null;
        }
        if (f3872i) {
            m5229j("Loaded resource from cache", j, mVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m5229j(String str, long j, C7218e eVar) {
        Log.v("Engine", str + " in " + C10787f.m22931a(j) + "ms, key: " + eVar);
    }

    /* renamed from: l */
    private <R> C4413d m5230l(C4366d dVar, Object obj, C7218e eVar, int i, int i2, Class<?> cls, Class<R> cls2, C4368f fVar, C7737a aVar, Map<Class<?>, C7226k<?>> map, boolean z, boolean z2, C7222g gVar, boolean z3, boolean z4, boolean z5, boolean z6, C9921g gVar2, Executor executor, C4421m mVar, long j) {
        C9921g gVar3 = gVar2;
        Executor executor2 = executor;
        C4421m mVar2 = mVar;
        long j2 = j;
        C4414k<?> a = this.f3873a.mo31374a(mVar2, z6);
        if (a != null) {
            a.mo31338e(gVar3, executor2);
            if (f3872i) {
                m5229j("Added to existing load", j2, mVar2);
            }
            return new C4413d(gVar3, a);
        }
        C4414k a2 = this.f3876d.mo31335a(mVar, z3, z4, z5, z6);
        C4414k kVar = a2;
        C4421m mVar3 = mVar2;
        C4396h<R> a3 = this.f3879g.mo31333a(dVar, obj, mVar, eVar, i, i2, cls, cls2, fVar, aVar, map, z, z2, z6, gVar, a2);
        this.f3873a.mo31375c(mVar3, kVar);
        C4414k kVar2 = kVar;
        C4421m mVar4 = mVar3;
        C9921g gVar4 = gVar2;
        kVar2.mo31338e(gVar4, executor);
        kVar2.mo31349s(a3);
        if (f3872i) {
            m5229j("Started new load", j, mVar4);
        }
        return new C4413d(gVar4, kVar2);
    }

    /* renamed from: a */
    public synchronized void mo31327a(C4414k<?> kVar, C7218e eVar, C4423o<?> oVar) {
        if (oVar != null) {
            if (oVar.mo31368d()) {
                this.f3880h.mo31258a(eVar, oVar);
            }
        }
        this.f3873a.mo31376d(eVar, kVar);
    }

    /* renamed from: b */
    public synchronized void mo31328b(C4414k<?> kVar, C7218e eVar) {
        this.f3873a.mo31376d(eVar, kVar);
    }

    /* renamed from: c */
    public void mo31329c(C7218e eVar, C4423o<?> oVar) {
        this.f3880h.mo31261d(eVar);
        if (oVar.mo31368d()) {
            this.f3875c.mo41902c(eVar, oVar);
        } else {
            this.f3877e.mo31382a(oVar, false);
        }
    }

    /* renamed from: d */
    public void mo31330d(@NonNull C7744c<?> cVar) {
        this.f3877e.mo31382a(cVar, true);
    }

    /* renamed from: f */
    public <R> C4413d mo31331f(C4366d dVar, Object obj, C7218e eVar, int i, int i2, Class<?> cls, Class<R> cls2, C4368f fVar, C7737a aVar, Map<Class<?>, C7226k<?>> map, boolean z, boolean z2, C7222g gVar, boolean z3, boolean z4, boolean z5, boolean z6, C9921g gVar2, Executor executor) {
        long b = f3872i ? C10787f.m22932b() : 0;
        C4421m a = this.f3874b.mo31364a(obj, eVar, i, i2, map, cls, cls2, gVar);
        synchronized (this) {
            C4423o<?> i3 = m5228i(a, z3, b);
            if (i3 == null) {
                C4413d l = m5230l(dVar, obj, eVar, i, i2, cls, cls2, fVar, aVar, map, z, z2, gVar, z3, z4, z5, z6, gVar2, executor, a, b);
                return l;
            }
            gVar2.mo44499b(i3, C7214a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: k */
    public void mo31332k(C7744c<?> cVar) {
        if (cVar instanceof C4423o) {
            ((C4423o) cVar).mo31369e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @VisibleForTesting
    C4407j(C8077h hVar, C8064a.C8065a aVar, C8329a aVar2, C8329a aVar3, C8329a aVar4, C8329a aVar5, C4425p pVar, C4422n nVar, C4384a aVar6, C4410b bVar, C4408a aVar7, C4431u uVar, boolean z) {
        this.f3875c = hVar;
        C8064a.C8065a aVar8 = aVar;
        C4412c cVar = new C4412c(aVar);
        this.f3878f = cVar;
        C4384a aVar9 = aVar6 == null ? new C4384a(z) : aVar6;
        this.f3880h = aVar9;
        aVar9.mo31263f(this);
        this.f3874b = nVar == null ? new C4422n() : nVar;
        this.f3873a = pVar == null ? new C4425p() : pVar;
        this.f3876d = bVar == null ? new C4410b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f3879g = aVar7 == null ? new C4408a(cVar) : aVar7;
        this.f3877e = uVar == null ? new C4431u() : uVar;
        hVar.mo41904e(this);
    }
}
