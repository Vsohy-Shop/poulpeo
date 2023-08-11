package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p058d1.C7218e;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.o */
/* compiled from: EngineResource */
class C4423o<Z> implements C7744c<Z> {

    /* renamed from: b */
    private final boolean f3939b;

    /* renamed from: c */
    private final boolean f3940c;

    /* renamed from: d */
    private final C7744c<Z> f3941d;

    /* renamed from: e */
    private final C4424a f3942e;

    /* renamed from: f */
    private final C7218e f3943f;

    /* renamed from: g */
    private int f3944g;

    /* renamed from: h */
    private boolean f3945h;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    /* compiled from: EngineResource */
    interface C4424a {
        /* renamed from: c */
        void mo31329c(C7218e eVar, C4423o<?> oVar);
    }

    C4423o(C7744c<Z> cVar, boolean z, boolean z2, C7218e eVar, C4424a aVar) {
        this.f3941d = (C7744c) C10791j.m22948d(cVar);
        this.f3939b = z;
        this.f3940c = z2;
        this.f3943f = eVar;
        this.f3942e = (C4424a) C10791j.m22948d(aVar);
    }

    @NonNull
    /* renamed from: a */
    public Class<Z> mo31365a() {
        return this.f3941d.mo31365a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo31366b() {
        if (!this.f3945h) {
            this.f3944g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7744c<Z> mo31367c() {
        return this.f3941d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo31368d() {
        return this.f3939b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo31369e() {
        boolean z;
        synchronized (this) {
            int i = this.f3944g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f3944g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f3942e.mo31329c(this.f3943f, this);
        }
    }

    @NonNull
    public Z get() {
        return this.f3941d.get();
    }

    public int getSize() {
        return this.f3941d.getSize();
    }

    public synchronized void recycle() {
        if (this.f3944g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f3945h) {
            this.f3945h = true;
            if (this.f3940c) {
                this.f3941d.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3939b + ", listener=" + this.f3942e + ", key=" + this.f3943f + ", acquired=" + this.f3944g + ", isRecycled=" + this.f3945h + ", resource=" + this.f3941d + '}';
    }
}
