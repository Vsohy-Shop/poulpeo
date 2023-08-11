package p423re;

import p307af.C10885a;
import p341fe.C11949f;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p386lg.C12860b;
import p403oe.C13064a;
import p459xe.C13842a;
import p459xe.C13843b;

/* renamed from: re.d */
/* compiled from: FlowableDoOnEach */
public final class C13305d<T> extends C13287a<T, T> {

    /* renamed from: d */
    final C12853d<? super T> f21221d;

    /* renamed from: e */
    final C12853d<? super Throwable> f21222e;

    /* renamed from: f */
    final C12850a f21223f;

    /* renamed from: g */
    final C12850a f21224g;

    /* renamed from: re.d$a */
    /* compiled from: FlowableDoOnEach */
    static final class C13306a<T> extends C13842a<T, T> {

        /* renamed from: g */
        final C12853d<? super T> f21225g;

        /* renamed from: h */
        final C12853d<? super Throwable> f21226h;

        /* renamed from: i */
        final C12850a f21227i;

        /* renamed from: j */
        final C12850a f21228j;

        C13306a(C13064a<? super T> aVar, C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar2, C12850a aVar3) {
            super(aVar);
            this.f21225g = dVar;
            this.f21226h = dVar2;
            this.f21227i = aVar2;
            this.f21228j = aVar3;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f22338e) {
                try {
                    this.f21227i.run();
                    this.f22338e = true;
                    this.f22335b.mo50772b();
                    try {
                        this.f21228j.run();
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C10885a.m23270q(th);
                    }
                } catch (Throwable th2) {
                    mo53527i(th2);
                }
            }
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f22338e) {
                if (this.f22339f != 0) {
                    this.f22335b.mo50773d(null);
                    return;
                }
                try {
                    this.f21225g.accept(t);
                    this.f22335b.mo50773d(t);
                } catch (Throwable th) {
                    mo53527i(th);
                }
            }
        }

        /* renamed from: f */
        public boolean mo50965f(T t) {
            if (this.f22338e) {
                return false;
            }
            try {
                this.f21225g.accept(t);
                return this.f22335b.mo50965f(t);
            } catch (Throwable th) {
                mo53527i(th);
                return false;
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53528j(i);
        }

        public void onError(Throwable th) {
            if (this.f22338e) {
                C10885a.m23270q(th);
                return;
            }
            boolean z = true;
            this.f22338e = true;
            try {
                this.f21226h.accept(th);
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                this.f22335b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f22335b.onError(th);
            }
            try {
                this.f21228j.run();
            } catch (Throwable th3) {
                C12620a.m28007b(th3);
                C10885a.m23270q(th3);
            }
        }

        public T poll() {
            try {
                T poll = this.f22337d.poll();
                if (poll != null) {
                    try {
                        this.f21225g.accept(poll);
                        this.f21228j.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f22339f == 1) {
                    this.f21227i.run();
                    this.f21228j.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    /* renamed from: re.d$b */
    /* compiled from: FlowableDoOnEach */
    static final class C13307b<T> extends C13843b<T, T> {

        /* renamed from: g */
        final C12853d<? super T> f21229g;

        /* renamed from: h */
        final C12853d<? super Throwable> f21230h;

        /* renamed from: i */
        final C12850a f21231i;

        /* renamed from: j */
        final C12850a f21232j;

        C13307b(C12860b<? super T> bVar, C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12850a aVar2) {
            super(bVar);
            this.f21229g = dVar;
            this.f21230h = dVar2;
            this.f21231i = aVar;
            this.f21232j = aVar2;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f22343e) {
                try {
                    this.f21231i.run();
                    this.f22343e = true;
                    this.f22340b.mo50772b();
                    try {
                        this.f21232j.run();
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        C10885a.m23270q(th);
                    }
                } catch (Throwable th2) {
                    mo53531i(th2);
                }
            }
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f22343e) {
                if (this.f22344f != 0) {
                    this.f22340b.mo50773d(null);
                    return;
                }
                try {
                    this.f21229g.accept(t);
                    this.f22340b.mo50773d(t);
                } catch (Throwable th) {
                    mo53531i(th);
                }
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53532j(i);
        }

        public void onError(Throwable th) {
            if (this.f22343e) {
                C10885a.m23270q(th);
                return;
            }
            boolean z = true;
            this.f22343e = true;
            try {
                this.f21230h.accept(th);
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                this.f22340b.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f22340b.onError(th);
            }
            try {
                this.f21232j.run();
            } catch (Throwable th3) {
                C12620a.m28007b(th3);
                C10885a.m23270q(th3);
            }
        }

        public T poll() {
            try {
                T poll = this.f22342d.poll();
                if (poll != null) {
                    try {
                        this.f21229g.accept(poll);
                        this.f21232j.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f22344f == 1) {
                    this.f21231i.run();
                    this.f21232j.run();
                }
                return poll;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }
    }

    public C13305d(C11949f<T> fVar, C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12850a aVar2) {
        super(fVar);
        this.f21221d = dVar;
        this.f21222e = dVar2;
        this.f21223f = aVar;
        this.f21224g = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        if (bVar instanceof C13064a) {
            this.f21182c.mo49199H(new C13306a((C13064a) bVar, this.f21221d, this.f21222e, this.f21223f, this.f21224g));
            return;
        }
        this.f21182c.mo49199H(new C13307b(bVar, this.f21221d, this.f21222e, this.f21223f, this.f21224g));
    }
}
