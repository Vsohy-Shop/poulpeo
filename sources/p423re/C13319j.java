package p423re;

import androidx.compose.animation.core.C0344a;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12140a;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p386lg.C12860b;
import p386lg.C12861c;
import p391me.C12936b;
import p397ne.C13016b;
import p447ve.C13640b;
import p465ye.C13925g;
import p471ze.C14108c;
import p471ze.C14109d;

/* renamed from: re.j */
/* compiled from: FlowableFlatMapMaybe */
public final class C13319j<T, R> extends C13287a<T, R> {

    /* renamed from: d */
    final C12854e<? super T, ? extends C11957n<? extends R>> f21284d;

    /* renamed from: e */
    final boolean f21285e;

    /* renamed from: f */
    final int f21286f;

    /* renamed from: re.j$a */
    /* compiled from: FlowableFlatMapMaybe */
    static final class C13320a<T, R> extends AtomicInteger implements C11952i<T>, C12861c {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b */
        final C12860b<? super R> f21287b;

        /* renamed from: c */
        final boolean f21288c;

        /* renamed from: d */
        final int f21289d;

        /* renamed from: e */
        final AtomicLong f21290e = new AtomicLong();

        /* renamed from: f */
        final C12140a f21291f = new C12140a();

        /* renamed from: g */
        final AtomicInteger f21292g = new AtomicInteger(1);

        /* renamed from: h */
        final C14108c f21293h = new C14108c();

        /* renamed from: i */
        final C12854e<? super T, ? extends C11957n<? extends R>> f21294i;

        /* renamed from: j */
        final AtomicReference<C13640b<R>> f21295j = new AtomicReference<>();

        /* renamed from: k */
        C12861c f21296k;

        /* renamed from: l */
        volatile boolean f21297l;

        /* renamed from: re.j$a$a */
        /* compiled from: FlowableFlatMapMaybe */
        final class C13321a extends AtomicReference<C12141b> implements C11955l<R>, C12141b {
            private static final long serialVersionUID = -502562646270949838L;

            C13321a() {
            }

            /* renamed from: a */
            public void mo49245a(R r) {
                C13320a.this.mo52959l(this, r);
            }

            /* renamed from: b */
            public void mo49246b() {
                C13320a.this.mo52957j(this);
            }

            /* renamed from: c */
            public void mo49247c(C12141b bVar) {
                C12936b.m29226f(this, bVar);
            }

            public void dispose() {
                C12936b.m29221a(this);
            }

            public boolean isDisposed() {
                return C12936b.m29222b((C12141b) get());
            }

            public void onError(Throwable th) {
                C13320a.this.mo52958k(this, th);
            }
        }

        C13320a(C12860b<? super R> bVar, C12854e<? super T, ? extends C11957n<? extends R>> eVar, boolean z, int i) {
            this.f21287b = bVar;
            this.f21294i = eVar;
            this.f21288c = z;
            this.f21289d = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52953a() {
            C13640b bVar = this.f21295j.get();
            if (bVar != null) {
                bVar.clear();
            }
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21292g.decrementAndGet();
            mo52954c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo52954c() {
            if (getAndIncrement() == 0) {
                mo52955g();
            }
        }

        public void cancel() {
            this.f21297l = true;
            this.f21296k.cancel();
            this.f21291f.dispose();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            try {
                C11957n nVar = (C11957n) C13016b.m29390d(this.f21294i.apply(t), "The mapper returned a null MaybeSource");
                this.f21292g.getAndIncrement();
                C13321a aVar = new C13321a();
                if (!this.f21297l && this.f21291f.mo49583c(aVar)) {
                    nVar.mo49221a(aVar);
                }
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21296k.cancel();
                onError(th);
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21296k, cVar)) {
                this.f21296k = cVar;
                this.f21287b.mo49220e(this);
                int i = this.f21289d;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
                } else {
                    cVar.mo50776h((long) i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo52955g() {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            Object obj;
            boolean z4;
            C12860b<? super R> bVar = this.f21287b;
            AtomicInteger atomicInteger = this.f21292g;
            AtomicReference<C13640b<R>> atomicReference = this.f21295j;
            int i2 = 1;
            do {
                long j = this.f21290e.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    z = false;
                    if (i == 0) {
                        break;
                    } else if (this.f21297l) {
                        mo52953a();
                        return;
                    } else if (this.f21288c || ((Throwable) this.f21293h.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C13640b bVar2 = atomicReference.get();
                        if (bVar2 != null) {
                            obj = bVar2.poll();
                        } else {
                            obj = null;
                        }
                        if (obj == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z3 && z4) {
                            Throwable b = this.f21293h.mo53885b();
                            if (b != null) {
                                bVar.onError(b);
                                return;
                            } else {
                                bVar.mo50772b();
                                return;
                            }
                        } else if (z4) {
                            break;
                        } else {
                            bVar.mo50773d(obj);
                            j2++;
                        }
                    } else {
                        Throwable b2 = this.f21293h.mo53885b();
                        mo52953a();
                        bVar.onError(b2);
                        return;
                    }
                }
                if (i == 0) {
                    if (this.f21297l) {
                        mo52953a();
                        return;
                    } else if (this.f21288c || ((Throwable) this.f21293h.get()) == null) {
                        if (atomicInteger.get() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C13640b bVar3 = atomicReference.get();
                        if (bVar3 == null || bVar3.isEmpty()) {
                            z = true;
                        }
                        if (z2 && z) {
                            Throwable b3 = this.f21293h.mo53885b();
                            if (b3 != null) {
                                bVar.onError(b3);
                                return;
                            } else {
                                bVar.mo50772b();
                                return;
                            }
                        }
                    } else {
                        Throwable b4 = this.f21293h.mo53885b();
                        mo52953a();
                        bVar.onError(b4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C14109d.m32754d(this.f21290e, j2);
                    if (this.f21289d != Integer.MAX_VALUE) {
                        this.f21296k.mo50776h(j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21290e, j);
                mo52954c();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C13640b<R> mo52956i() {
            C13640b<R> bVar;
            do {
                C13640b<R> bVar2 = this.f21295j.get();
                if (bVar2 != null) {
                    return bVar2;
                }
                bVar = new C13640b<>(C11949f.m25825b());
            } while (!C0344a.m496a(this.f21295j, (Object) null, bVar));
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52957j(C13320a<T, R>.a aVar) {
            this.f21291f.mo49581a(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f21292g.decrementAndGet() == 0) {
                        z = true;
                    }
                    C13640b bVar = this.f21295j.get();
                    if (!z || (bVar != null && !bVar.isEmpty())) {
                        if (this.f21289d != Integer.MAX_VALUE) {
                            this.f21296k.mo50776h(1);
                        }
                        if (decrementAndGet() != 0) {
                            mo52955g();
                            return;
                        }
                        return;
                    }
                    Throwable b = this.f21293h.mo53885b();
                    if (b != null) {
                        this.f21287b.onError(b);
                        return;
                    } else {
                        this.f21287b.mo50772b();
                        return;
                    }
                }
            }
            this.f21292g.decrementAndGet();
            if (this.f21289d != Integer.MAX_VALUE) {
                this.f21296k.mo50776h(1);
            }
            mo52954c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo52958k(C13320a<T, R>.a aVar, Throwable th) {
            this.f21291f.mo49581a(aVar);
            if (this.f21293h.mo53884a(th)) {
                if (!this.f21288c) {
                    this.f21296k.cancel();
                    this.f21291f.dispose();
                } else if (this.f21289d != Integer.MAX_VALUE) {
                    this.f21296k.mo50776h(1);
                }
                this.f21292g.decrementAndGet();
                mo52954c();
                return;
            }
            C10885a.m23270q(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo52959l(C13320a<T, R>.a aVar, R r) {
            this.f21291f.mo49581a(aVar);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f21292g.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.f21290e.get() != 0) {
                        this.f21287b.mo50773d(r);
                        C13640b bVar = this.f21295j.get();
                        if (!z || (bVar != null && !bVar.isEmpty())) {
                            C14109d.m32754d(this.f21290e, 1);
                            if (this.f21289d != Integer.MAX_VALUE) {
                                this.f21296k.mo50776h(1);
                            }
                        } else {
                            Throwable b = this.f21293h.mo53885b();
                            if (b != null) {
                                this.f21287b.onError(b);
                                return;
                            } else {
                                this.f21287b.mo50772b();
                                return;
                            }
                        }
                    } else {
                        C13640b i = mo52956i();
                        synchronized (i) {
                            i.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo52955g();
                }
            }
            C13640b i2 = mo52956i();
            synchronized (i2) {
                i2.offer(r);
            }
            this.f21292g.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo52955g();
        }

        public void onError(Throwable th) {
            this.f21292g.decrementAndGet();
            if (this.f21293h.mo53884a(th)) {
                if (!this.f21288c) {
                    this.f21291f.dispose();
                }
                mo52954c();
                return;
            }
            C10885a.m23270q(th);
        }
    }

    public C13319j(C11949f<T> fVar, C12854e<? super T, ? extends C11957n<? extends R>> eVar, boolean z, int i) {
        super(fVar);
        this.f21284d = eVar;
        this.f21285e = z;
        this.f21286f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super R> bVar) {
        this.f21182c.mo49199H(new C13320a(bVar, this.f21284d, this.f21285e, this.f21286f));
    }
}
