package p423re;

import p341fe.C11949f;
import p384le.C12856g;
import p386lg.C12860b;
import p403oe.C13064a;
import p403oe.C13070g;
import p459xe.C13842a;
import p459xe.C13843b;

/* renamed from: re.h */
/* compiled from: FlowableFilter */
public final class C13313h<T> extends C13287a<T, T> {

    /* renamed from: d */
    final C12856g<? super T> f21250d;

    /* renamed from: re.h$a */
    /* compiled from: FlowableFilter */
    static final class C13314a<T> extends C13842a<T, T> {

        /* renamed from: g */
        final C12856g<? super T> f21251g;

        C13314a(C13064a<? super T> aVar, C12856g<? super T> gVar) {
            super(aVar);
            this.f21251g = gVar;
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!mo50965f(t)) {
                this.f22336c.mo50776h(1);
            }
        }

        /* renamed from: f */
        public boolean mo50965f(T t) {
            if (this.f22338e) {
                return false;
            }
            if (this.f22339f != 0) {
                return this.f22335b.mo50965f(null);
            }
            try {
                if (!this.f21251g.test(t) || !this.f22335b.mo50965f(t)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                mo53527i(th);
                return true;
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53528j(i);
        }

        public T poll() {
            C13070g<T> gVar = this.f22337d;
            C12856g<? super T> gVar2 = this.f21251g;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (gVar2.test(poll)) {
                    return poll;
                }
                if (this.f22339f == 2) {
                    gVar.mo50776h(1);
                }
            }
        }
    }

    /* renamed from: re.h$b */
    /* compiled from: FlowableFilter */
    static final class C13315b<T> extends C13843b<T, T> implements C13064a<T> {

        /* renamed from: g */
        final C12856g<? super T> f21252g;

        C13315b(C12860b<? super T> bVar, C12856g<? super T> gVar) {
            super(bVar);
            this.f21252g = gVar;
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!mo50965f(t)) {
                this.f22341c.mo50776h(1);
            }
        }

        /* renamed from: f */
        public boolean mo50965f(T t) {
            if (this.f22343e) {
                return false;
            }
            if (this.f22344f != 0) {
                this.f22340b.mo50773d(null);
                return true;
            }
            try {
                boolean test = this.f21252g.test(t);
                if (test) {
                    this.f22340b.mo50773d(t);
                }
                return test;
            } catch (Throwable th) {
                mo53531i(th);
                return true;
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53532j(i);
        }

        public T poll() {
            C13070g<T> gVar = this.f22342d;
            C12856g<? super T> gVar2 = this.f21252g;
            while (true) {
                T poll = gVar.poll();
                if (poll == null) {
                    return null;
                }
                if (gVar2.test(poll)) {
                    return poll;
                }
                if (this.f22344f == 2) {
                    gVar.mo50776h(1);
                }
            }
        }
    }

    public C13313h(C11949f<T> fVar, C12856g<? super T> gVar) {
        super(fVar);
        this.f21250d = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        if (bVar instanceof C13064a) {
            this.f21182c.mo49199H(new C13314a((C13064a) bVar, this.f21250d));
        } else {
            this.f21182c.mo49199H(new C13315b(bVar, this.f21250d));
        }
    }
}
