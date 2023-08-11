package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import p020a2.C2125a;
import p020a2.C2134c;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.r */
/* compiled from: LockedResource */
final class C4427r<Z> implements C7744c<Z>, C2125a.C2131f {

    /* renamed from: f */
    private static final Pools.Pool<C4427r<?>> f3952f = C2125a.m1478d(20, new C4428a());

    /* renamed from: b */
    private final C2134c f3953b = C2134c.m1493a();

    /* renamed from: c */
    private C7744c<Z> f3954c;

    /* renamed from: d */
    private boolean f3955d;

    /* renamed from: e */
    private boolean f3956e;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    /* compiled from: LockedResource */
    class C4428a implements C2125a.C2129d<C4427r<?>> {
        C4428a() {
        }

        /* renamed from: b */
        public C4427r<?> mo23268a() {
            return new C4427r<>();
        }
    }

    C4427r() {
    }

    /* renamed from: b */
    private void m5286b(C7744c<Z> cVar) {
        this.f3956e = false;
        this.f3955d = true;
        this.f3954c = cVar;
    }

    @NonNull
    /* renamed from: c */
    static <Z> C4427r<Z> m5287c(C7744c<Z> cVar) {
        C4427r<Z> rVar = (C4427r) C10791j.m22948d(f3952f.acquire());
        rVar.m5286b(cVar);
        return rVar;
    }

    /* renamed from: e */
    private void m5288e() {
        this.f3954c = null;
        f3952f.release(this);
    }

    @NonNull
    /* renamed from: a */
    public Class<Z> mo31365a() {
        return this.f3954c.mo31365a();
    }

    @NonNull
    /* renamed from: d */
    public C2134c mo23271d() {
        return this.f3953b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo31379f() {
        this.f3953b.mo23273c();
        if (this.f3955d) {
            this.f3955d = false;
            if (this.f3956e) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public Z get() {
        return this.f3954c.get();
    }

    public int getSize() {
        return this.f3954c.getSize();
    }

    public synchronized void recycle() {
        this.f3953b.mo23273c();
        this.f3956e = true;
        if (!this.f3955d) {
            this.f3954c.recycle();
            m5288e();
        }
    }
}
