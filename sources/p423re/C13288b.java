package p423re;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p369je.C12620a;
import p384le.C12854e;
import p386lg.C12859a;
import p386lg.C12860b;
import p386lg.C12861c;
import p397ne.C13016b;
import p403oe.C13070g;
import p403oe.C13073j;
import p447ve.C13639a;
import p465ye.C13924f;
import p465ye.C13925g;
import p471ze.C14108c;
import p471ze.C14111f;

/* renamed from: re.b */
/* compiled from: FlowableConcatMap */
public final class C13288b<T, R> extends C13287a<T, R> {

    /* renamed from: d */
    final C12854e<? super T, ? extends C12859a<? extends R>> f21183d;

    /* renamed from: e */
    final int f21184e;

    /* renamed from: f */
    final C14111f f21185f;

    /* renamed from: re.b$a */
    /* compiled from: FlowableConcatMap */
    static /* synthetic */ class C13289a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21186a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ze.f[] r0 = p471ze.C14111f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21186a = r0
                ze.f r1 = p471ze.C14111f.BOUNDARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21186a     // Catch:{ NoSuchFieldError -> 0x001d }
                ze.f r1 = p471ze.C14111f.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p423re.C13288b.C13289a.<clinit>():void");
        }
    }

    /* renamed from: re.b$b */
    /* compiled from: FlowableConcatMap */
    static abstract class C13290b<T, R> extends AtomicInteger implements C11952i<T>, C13294f<R>, C12861c {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: b */
        final C13293e<R> f21187b = new C13293e<>(this);

        /* renamed from: c */
        final C12854e<? super T, ? extends C12859a<? extends R>> f21188c;

        /* renamed from: d */
        final int f21189d;

        /* renamed from: e */
        final int f21190e;

        /* renamed from: f */
        C12861c f21191f;

        /* renamed from: g */
        int f21192g;

        /* renamed from: h */
        C13073j<T> f21193h;

        /* renamed from: i */
        volatile boolean f21194i;

        /* renamed from: j */
        volatile boolean f21195j;

        /* renamed from: k */
        final C14108c f21196k = new C14108c();

        /* renamed from: l */
        volatile boolean f21197l;

        /* renamed from: m */
        int f21198m;

        C13290b(C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i) {
            this.f21188c = eVar;
            this.f21189d = i;
            this.f21190e = i - (i >> 2);
        }

        /* renamed from: b */
        public final void mo50772b() {
            this.f21194i = true;
            mo52925i();
        }

        /* renamed from: c */
        public final void mo52924c() {
            this.f21197l = false;
            mo52925i();
        }

        /* renamed from: d */
        public final void mo50773d(T t) {
            if (this.f21198m == 2 || this.f21193h.offer(t)) {
                mo52925i();
                return;
            }
            this.f21191f.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        /* renamed from: e */
        public final void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21191f, cVar)) {
                this.f21191f = cVar;
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(3);
                    if (g == 1) {
                        this.f21198m = g;
                        this.f21193h = gVar;
                        this.f21194i = true;
                        mo52926j();
                        mo52925i();
                        return;
                    } else if (g == 2) {
                        this.f21198m = g;
                        this.f21193h = gVar;
                        mo52926j();
                        cVar.mo50776h((long) this.f21189d);
                        return;
                    }
                }
                this.f21193h = new C13639a(this.f21189d);
                mo52926j();
                cVar.mo50776h((long) this.f21189d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract void mo52925i();

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract void mo52926j();
    }

    /* renamed from: re.b$c */
    /* compiled from: FlowableConcatMap */
    static final class C13291c<T, R> extends C13290b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* renamed from: n */
        final C12860b<? super R> f21199n;

        /* renamed from: o */
        final boolean f21200o;

        C13291c(C12860b<? super R> bVar, C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i, boolean z) {
            super(eVar, i);
            this.f21199n = bVar;
            this.f21200o = z;
        }

        /* renamed from: a */
        public void mo52927a(R r) {
            this.f21199n.mo50773d(r);
        }

        public void cancel() {
            if (!this.f21195j) {
                this.f21195j = true;
                this.f21187b.cancel();
                this.f21191f.cancel();
            }
        }

        /* renamed from: g */
        public void mo52928g(Throwable th) {
            if (this.f21196k.mo53884a(th)) {
                if (!this.f21200o) {
                    this.f21191f.cancel();
                    this.f21194i = true;
                }
                this.f21197l = false;
                mo52925i();
                return;
            }
            C10885a.m23270q(th);
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            this.f21187b.mo50776h(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo52925i() {
            boolean z;
            if (getAndIncrement() == 0) {
                while (!this.f21195j) {
                    if (!this.f21197l) {
                        boolean z2 = this.f21194i;
                        if (!z2 || this.f21200o || ((Throwable) this.f21196k.get()) == null) {
                            try {
                                T poll = this.f21193h.poll();
                                if (poll == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z2 && z) {
                                    Throwable b = this.f21196k.mo53885b();
                                    if (b != null) {
                                        this.f21199n.onError(b);
                                        return;
                                    } else {
                                        this.f21199n.mo50772b();
                                        return;
                                    }
                                } else if (!z) {
                                    try {
                                        C12859a aVar = (C12859a) C13016b.m29390d(this.f21188c.apply(poll), "The mapper returned a null Publisher");
                                        if (this.f21198m != 1) {
                                            int i = this.f21192g + 1;
                                            if (i == this.f21190e) {
                                                this.f21192g = 0;
                                                this.f21191f.mo50776h((long) i);
                                            } else {
                                                this.f21192g = i;
                                            }
                                        }
                                        if (aVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) aVar).call();
                                                if (call == null) {
                                                    continue;
                                                } else if (this.f21187b.mo53661g()) {
                                                    this.f21199n.mo50773d(call);
                                                } else {
                                                    this.f21197l = true;
                                                    C13293e<R> eVar = this.f21187b;
                                                    eVar.mo53663j(new C13295g(call, eVar));
                                                }
                                            } catch (Throwable th) {
                                                C12620a.m28007b(th);
                                                this.f21191f.cancel();
                                                this.f21196k.mo53884a(th);
                                                this.f21199n.onError(this.f21196k.mo53885b());
                                                return;
                                            }
                                        } else {
                                            this.f21197l = true;
                                            aVar.mo49202a(this.f21187b);
                                        }
                                    } catch (Throwable th2) {
                                        C12620a.m28007b(th2);
                                        this.f21191f.cancel();
                                        this.f21196k.mo53884a(th2);
                                        this.f21199n.onError(this.f21196k.mo53885b());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C12620a.m28007b(th3);
                                this.f21191f.cancel();
                                this.f21196k.mo53884a(th3);
                                this.f21199n.onError(this.f21196k.mo53885b());
                                return;
                            }
                        } else {
                            this.f21199n.onError(this.f21196k.mo53885b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52926j() {
            this.f21199n.mo49220e(this);
        }

        public void onError(Throwable th) {
            if (this.f21196k.mo53884a(th)) {
                this.f21194i = true;
                mo52925i();
                return;
            }
            C10885a.m23270q(th);
        }
    }

    /* renamed from: re.b$d */
    /* compiled from: FlowableConcatMap */
    static final class C13292d<T, R> extends C13290b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* renamed from: n */
        final C12860b<? super R> f21201n;

        /* renamed from: o */
        final AtomicInteger f21202o = new AtomicInteger();

        C13292d(C12860b<? super R> bVar, C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i) {
            super(eVar, i);
            this.f21201n = bVar;
        }

        /* renamed from: a */
        public void mo52927a(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f21201n.mo50773d(r);
                if (!compareAndSet(1, 0)) {
                    this.f21201n.onError(this.f21196k.mo53885b());
                }
            }
        }

        public void cancel() {
            if (!this.f21195j) {
                this.f21195j = true;
                this.f21187b.cancel();
                this.f21191f.cancel();
            }
        }

        /* renamed from: g */
        public void mo52928g(Throwable th) {
            if (this.f21196k.mo53884a(th)) {
                this.f21191f.cancel();
                if (getAndIncrement() == 0) {
                    this.f21201n.onError(this.f21196k.mo53885b());
                    return;
                }
                return;
            }
            C10885a.m23270q(th);
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            this.f21187b.mo50776h(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo52925i() {
            boolean z;
            if (this.f21202o.getAndIncrement() == 0) {
                while (!this.f21195j) {
                    if (!this.f21197l) {
                        boolean z2 = this.f21194i;
                        try {
                            T poll = this.f21193h.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                this.f21201n.mo50772b();
                                return;
                            } else if (!z) {
                                try {
                                    C12859a aVar = (C12859a) C13016b.m29390d(this.f21188c.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f21198m != 1) {
                                        int i = this.f21192g + 1;
                                        if (i == this.f21190e) {
                                            this.f21192g = 0;
                                            this.f21191f.mo50776h((long) i);
                                        } else {
                                            this.f21192g = i;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) aVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f21187b.mo53661g()) {
                                                this.f21197l = true;
                                                C13293e<R> eVar = this.f21187b;
                                                eVar.mo53663j(new C13295g(call, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f21201n.mo50773d(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f21201n.onError(this.f21196k.mo53885b());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C12620a.m28007b(th);
                                            this.f21191f.cancel();
                                            this.f21196k.mo53884a(th);
                                            this.f21201n.onError(this.f21196k.mo53885b());
                                            return;
                                        }
                                    } else {
                                        this.f21197l = true;
                                        aVar.mo49202a(this.f21187b);
                                    }
                                } catch (Throwable th2) {
                                    C12620a.m28007b(th2);
                                    this.f21191f.cancel();
                                    this.f21196k.mo53884a(th2);
                                    this.f21201n.onError(this.f21196k.mo53885b());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C12620a.m28007b(th3);
                            this.f21191f.cancel();
                            this.f21196k.mo53884a(th3);
                            this.f21201n.onError(this.f21196k.mo53885b());
                            return;
                        }
                    }
                    if (this.f21202o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52926j() {
            this.f21201n.mo49220e(this);
        }

        public void onError(Throwable th) {
            if (this.f21196k.mo53884a(th)) {
                this.f21187b.cancel();
                if (getAndIncrement() == 0) {
                    this.f21201n.onError(this.f21196k.mo53885b());
                    return;
                }
                return;
            }
            C10885a.m23270q(th);
        }
    }

    /* renamed from: re.b$e */
    /* compiled from: FlowableConcatMap */
    static final class C13293e<R> extends C13924f implements C11952i<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* renamed from: i */
        final C13294f<R> f21203i;

        /* renamed from: j */
        long f21204j;

        C13293e(C13294f<R> fVar) {
            this.f21203i = fVar;
        }

        /* renamed from: b */
        public void mo50772b() {
            long j = this.f21204j;
            if (j != 0) {
                this.f21204j = 0;
                mo53662i(j);
            }
            this.f21203i.mo52924c();
        }

        /* renamed from: d */
        public void mo50773d(R r) {
            this.f21204j++;
            this.f21203i.mo52927a(r);
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            mo53663j(cVar);
        }

        public void onError(Throwable th) {
            long j = this.f21204j;
            if (j != 0) {
                this.f21204j = 0;
                mo53662i(j);
            }
            this.f21203i.mo52928g(th);
        }
    }

    /* renamed from: re.b$f */
    /* compiled from: FlowableConcatMap */
    interface C13294f<T> {
        /* renamed from: a */
        void mo52927a(T t);

        /* renamed from: c */
        void mo52924c();

        /* renamed from: g */
        void mo52928g(Throwable th);
    }

    public C13288b(C11949f<T> fVar, C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i, C14111f fVar2) {
        super(fVar);
        this.f21183d = eVar;
        this.f21184e = i;
        this.f21185f = fVar2;
    }

    /* renamed from: K */
    public static <T, R> C12860b<T> m30174K(C12860b<? super R> bVar, C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i, C14111f fVar) {
        int i2 = C13289a.f21186a[fVar.ordinal()];
        if (i2 == 1) {
            return new C13291c(bVar, eVar, i, false);
        }
        if (i2 != 2) {
            return new C13292d(bVar, eVar, i);
        }
        return new C13291c(bVar, eVar, i, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super R> bVar) {
        if (!C13355x.m30382b(this.f21182c, bVar, this.f21183d)) {
            this.f21182c.mo49202a(m30174K(bVar, this.f21183d, this.f21184e, this.f21185f));
        }
    }

    /* renamed from: re.b$g */
    /* compiled from: FlowableConcatMap */
    static final class C13295g<T> implements C12861c {

        /* renamed from: b */
        final C12860b<? super T> f21205b;

        /* renamed from: c */
        final T f21206c;

        /* renamed from: d */
        boolean f21207d;

        C13295g(T t, C12860b<? super T> bVar) {
            this.f21206c = t;
            this.f21205b = bVar;
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (j > 0 && !this.f21207d) {
                this.f21207d = true;
                C12860b<? super T> bVar = this.f21205b;
                bVar.mo50773d(this.f21206c);
                bVar.mo50772b();
            }
        }

        public void cancel() {
        }
    }
}
