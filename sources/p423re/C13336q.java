package p423re;

import p341fe.C11949f;
import p384le.C12854e;
import p386lg.C12860b;
import p397ne.C13016b;
import p403oe.C13064a;
import p459xe.C13842a;
import p459xe.C13843b;

/* renamed from: re.q */
/* compiled from: FlowableMap */
public final class C13336q<T, U> extends C13287a<T, U> {

    /* renamed from: d */
    final C12854e<? super T, ? extends U> f21332d;

    /* renamed from: re.q$a */
    /* compiled from: FlowableMap */
    static final class C13337a<T, U> extends C13842a<T, U> {

        /* renamed from: g */
        final C12854e<? super T, ? extends U> f21333g;

        C13337a(C13064a<? super U> aVar, C12854e<? super T, ? extends U> eVar) {
            super(aVar);
            this.f21333g = eVar;
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f22338e) {
                if (this.f22339f != 0) {
                    this.f22335b.mo50773d(null);
                    return;
                }
                try {
                    this.f22335b.mo50773d(C13016b.m29390d(this.f21333g.apply(t), "The mapper function returned a null value."));
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
                return this.f22335b.mo50965f(C13016b.m29390d(this.f21333g.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo53527i(th);
                return true;
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53528j(i);
        }

        public U poll() {
            T poll = this.f22337d.poll();
            if (poll != null) {
                return C13016b.m29390d(this.f21333g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* renamed from: re.q$b */
    /* compiled from: FlowableMap */
    static final class C13338b<T, U> extends C13843b<T, U> {

        /* renamed from: g */
        final C12854e<? super T, ? extends U> f21334g;

        C13338b(C12860b<? super U> bVar, C12854e<? super T, ? extends U> eVar) {
            super(bVar);
            this.f21334g = eVar;
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f22343e) {
                if (this.f22344f != 0) {
                    this.f22340b.mo50773d(null);
                    return;
                }
                try {
                    this.f22340b.mo50773d(C13016b.m29390d(this.f21334g.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo53531i(th);
                }
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            return mo53532j(i);
        }

        public U poll() {
            T poll = this.f22342d.poll();
            if (poll != null) {
                return C13016b.m29390d(this.f21334g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C13336q(C11949f<T> fVar, C12854e<? super T, ? extends U> eVar) {
        super(fVar);
        this.f21332d = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super U> bVar) {
        if (bVar instanceof C13064a) {
            this.f21182c.mo49199H(new C13337a((C13064a) bVar, this.f21332d));
        } else {
            this.f21182c.mo49199H(new C13338b(bVar, this.f21332d));
        }
    }
}
