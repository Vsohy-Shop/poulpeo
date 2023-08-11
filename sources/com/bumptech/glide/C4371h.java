package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p094g1.C7737a;
import p197q1.C9102c;
import p217s1.C9427c;
import p217s1.C9429d;
import p217s1.C9434h;
import p217s1.C9435i;
import p217s1.C9442m;
import p217s1.C9443n;
import p217s1.C9446p;
import p250v1.C9916c;
import p250v1.C9919e;
import p250v1.C9920f;
import p261w1.C10104d;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.h */
/* compiled from: RequestManager */
public class C4371h implements ComponentCallbacks2, C9435i {

    /* renamed from: n */
    private static final C9920f f3732n = ((C9920f) C9920f.m20684b0(Bitmap.class).mo44443J());

    /* renamed from: o */
    private static final C9920f f3733o = ((C9920f) C9920f.m20684b0(C9102c.class).mo44443J());

    /* renamed from: p */
    private static final C9920f f3734p = ((C9920f) ((C9920f) C9920f.m20685c0(C7737a.f10717c).mo44446M(C4368f.LOW)).mo44450W(true));

    /* renamed from: b */
    protected final C4362b f3735b;

    /* renamed from: c */
    protected final Context f3736c;

    /* renamed from: d */
    final C9434h f3737d;
    @GuardedBy("this")

    /* renamed from: e */
    private final C9443n f3738e;
    @GuardedBy("this")

    /* renamed from: f */
    private final C9442m f3739f;
    @GuardedBy("this")

    /* renamed from: g */
    private final C9446p f3740g;

    /* renamed from: h */
    private final Runnable f3741h;

    /* renamed from: i */
    private final Handler f3742i;

    /* renamed from: j */
    private final C9427c f3743j;

    /* renamed from: k */
    private final CopyOnWriteArrayList<C9919e<Object>> f3744k;
    @GuardedBy("this")

    /* renamed from: l */
    private C9920f f3745l;

    /* renamed from: m */
    private boolean f3746m;

    /* renamed from: com.bumptech.glide.h$a */
    /* compiled from: RequestManager */
    class C4372a implements Runnable {
        C4372a() {
        }

        public void run() {
            C4371h hVar = C4371h.this;
            hVar.f3737d.mo43845b(hVar);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    /* compiled from: RequestManager */
    private class C4373b implements C9427c.C9428a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a */
        private final C9443n f3748a;

        C4373b(@NonNull C9443n nVar) {
            this.f3748a = nVar;
        }

        /* renamed from: a */
        public void mo31234a(boolean z) {
            if (z) {
                synchronized (C4371h.this) {
                    this.f3748a.mo43877e();
                }
            }
        }
    }

    public C4371h(@NonNull C4362b bVar, @NonNull C9434h hVar, @NonNull C9442m mVar, @NonNull Context context) {
        this(bVar, hVar, mVar, new C9443n(), bVar.mo31178g(), context);
    }

    /* renamed from: z */
    private void m5087z(@NonNull C10104d<?> dVar) {
        boolean y = mo31232y(dVar);
        C9916c a = dVar.mo44675a();
        if (!y && !this.f3735b.mo31187p(dVar) && a != null) {
            dVar.mo44676b((C9916c) null);
            a.clear();
        }
    }

    /* renamed from: e */
    public synchronized void mo31210e() {
        this.f3740g.mo31210e();
        for (C10104d<?> n : this.f3740g.mo43889k()) {
            mo31215n(n);
        }
        this.f3740g.mo43888j();
        this.f3738e.mo43874b();
        this.f3737d.mo43844a(this);
        this.f3737d.mo43844a(this.f3743j);
        this.f3742i.removeCallbacks(this.f3741h);
        this.f3735b.mo31189s(this);
    }

    /* renamed from: j */
    public C4371h mo31211j(C9919e<Object> eVar) {
        this.f3744k.add(eVar);
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public <ResourceType> C4369g<ResourceType> mo31212k(@NonNull Class<ResourceType> cls) {
        return new C4369g<>(this.f3735b, this, cls, this.f3736c);
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public C4369g<Bitmap> mo31213l() {
        return mo31212k(Bitmap.class).mo31201a(f3732n);
    }

    @CheckResult
    @NonNull
    /* renamed from: m */
    public C4369g<Drawable> mo31214m() {
        return mo31212k(Drawable.class);
    }

    /* renamed from: n */
    public void mo31215n(@Nullable C10104d<?> dVar) {
        if (dVar != null) {
            m5087z(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<C9919e<Object>> mo31216o() {
        return this.f3744k;
    }

    public synchronized void onStart() {
        mo31229v();
        this.f3740g.onStart();
    }

    public synchronized void onStop() {
        mo31228u();
        this.f3740g.onStop();
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f3746m) {
            mo31226t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public synchronized C9920f mo31222p() {
        return this.f3745l;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: q */
    public <T> C4374i<?, T> mo31223q(Class<T> cls) {
        return this.f3735b.mo31180i().mo31196d(cls);
    }

    @CheckResult
    @NonNull
    /* renamed from: r */
    public C4369g<Drawable> mo31224r(@Nullable Object obj) {
        return mo31214m().mo31209n0(obj);
    }

    /* renamed from: s */
    public synchronized void mo31225s() {
        this.f3738e.mo43875c();
    }

    /* renamed from: t */
    public synchronized void mo31226t() {
        mo31225s();
        for (C4371h s : this.f3739f.mo43852a()) {
            s.mo31225s();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3738e + ", treeNode=" + this.f3739f + "}";
    }

    /* renamed from: u */
    public synchronized void mo31228u() {
        this.f3738e.mo43876d();
    }

    /* renamed from: v */
    public synchronized void mo31229v() {
        this.f3738e.mo43878f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public synchronized void mo31230w(@NonNull C9920f fVar) {
        this.f3745l = (C9920f) ((C9920f) fVar.clone()).mo44455b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized void mo31231x(@NonNull C10104d<?> dVar, @NonNull C9916c cVar) {
        this.f3740g.mo43890l(dVar);
        this.f3738e.mo43879g(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized boolean mo31232y(@NonNull C10104d<?> dVar) {
        C9916c a = dVar.mo44675a();
        if (a == null) {
            return true;
        }
        if (!this.f3738e.mo43873a(a)) {
            return false;
        }
        this.f3740g.mo43891m(dVar);
        dVar.mo44676b((C9916c) null);
        return true;
    }

    C4371h(C4362b bVar, C9434h hVar, C9442m mVar, C9443n nVar, C9429d dVar, Context context) {
        this.f3740g = new C9446p();
        C4372a aVar = new C4372a();
        this.f3741h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3742i = handler;
        this.f3735b = bVar;
        this.f3737d = hVar;
        this.f3739f = mVar;
        this.f3738e = nVar;
        this.f3736c = context;
        C9427c a = dVar.mo43849a(context.getApplicationContext(), new C4373b(nVar));
        this.f3743j = a;
        if (C10792k.m22964o()) {
            handler.post(aVar);
        } else {
            hVar.mo43845b(this);
        }
        hVar.mo43845b(a);
        this.f3744k = new CopyOnWriteArrayList<>(bVar.mo31180i().mo31194b());
        mo31230w(bVar.mo31180i().mo31195c());
        bVar.mo31183o(this);
    }

    public void onLowMemory() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
