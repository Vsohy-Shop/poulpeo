package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.Iterator;
import p341fe.C11949f;
import p369je.C12620a;
import p386lg.C12860b;
import p397ne.C13016b;
import p403oe.C13064a;
import p465ye.C13920b;
import p465ye.C13922d;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.m */
/* compiled from: FlowableFromIterable */
public final class C13328m<T> extends C11949f<T> {

    /* renamed from: c */
    final Iterable<? extends T> f21320c;

    /* renamed from: re.m$a */
    /* compiled from: FlowableFromIterable */
    static abstract class C13329a<T> extends C13920b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        Iterator<? extends T> f21321b;

        /* renamed from: c */
        volatile boolean f21322c;

        /* renamed from: d */
        boolean f21323d;

        C13329a(Iterator<? extends T> it) {
            this.f21321b = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo52965a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo52966b(long j);

        public final void cancel() {
            this.f21322c = true;
        }

        public final void clear() {
            this.f21321b = null;
        }

        /* renamed from: g */
        public final int mo50862g(int i) {
            return i & 1;
        }

        /* renamed from: h */
        public final void mo50776h(long j) {
            if (C13925g.m32188g(j) && C14109d.m32751a(this, j) == 0) {
                if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                    mo52965a();
                } else {
                    mo52966b(j);
                }
            }
        }

        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f21321b;
            if (it == null || !it.hasNext()) {
                return true;
            }
            return false;
        }

        public final T poll() {
            Iterator<? extends T> it = this.f21321b;
            if (it == null) {
                return null;
            }
            if (!this.f21323d) {
                this.f21323d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return C13016b.m29390d(this.f21321b.next(), "Iterator.next() returned a null value");
        }
    }

    /* renamed from: re.m$b */
    /* compiled from: FlowableFromIterable */
    static final class C13330b<T> extends C13329a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e */
        final C13064a<? super T> f21324e;

        C13330b(C13064a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f21324e = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52965a() {
            Iterator<? extends T> it = this.f21321b;
            C13064a<? super T> aVar = this.f21324e;
            while (!this.f21322c) {
                try {
                    Object next = it.next();
                    if (!this.f21322c) {
                        if (next == null) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        aVar.mo50965f(next);
                        if (!this.f21322c) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f21322c) {
                                        aVar.mo50772b();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C12620a.m28007b(th);
                                aVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12620a.m28007b(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52966b(long j) {
            Iterator<? extends T> it = this.f21321b;
            C13064a<? super T> aVar = this.f21324e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.f21322c) {
                        try {
                            Object next = it.next();
                            if (!this.f21322c) {
                                if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean f = aVar.mo50965f(next);
                                if (!this.f21322c) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.f21322c) {
                                                aVar.mo50772b();
                                                return;
                                            }
                                            return;
                                        } else if (f) {
                                            j2++;
                                        }
                                    } catch (Throwable th) {
                                        C12620a.m28007b(th);
                                        aVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C12620a.m28007b(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: re.m$c */
    /* compiled from: FlowableFromIterable */
    static final class C13331c<T> extends C13329a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: e */
        final C12860b<? super T> f21325e;

        C13331c(C12860b<? super T> bVar, Iterator<? extends T> it) {
            super(it);
            this.f21325e = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52965a() {
            Iterator<? extends T> it = this.f21321b;
            C12860b<? super T> bVar = this.f21325e;
            while (!this.f21322c) {
                try {
                    Object next = it.next();
                    if (!this.f21322c) {
                        if (next == null) {
                            bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        bVar.mo50773d(next);
                        if (!this.f21322c) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f21322c) {
                                        bVar.mo50772b();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C12620a.m28007b(th);
                                bVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12620a.m28007b(th2);
                    bVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52966b(long j) {
            Iterator<? extends T> it = this.f21321b;
            C12860b<? super T> bVar = this.f21325e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = addAndGet(-j2);
                        }
                    } else if (!this.f21322c) {
                        try {
                            Object next = it.next();
                            if (!this.f21322c) {
                                if (next == null) {
                                    bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                bVar.mo50773d(next);
                                if (!this.f21322c) {
                                    try {
                                        if (it.hasNext()) {
                                            j2++;
                                        } else if (!this.f21322c) {
                                            bVar.mo50772b();
                                            return;
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        C12620a.m28007b(th);
                                        bVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C12620a.m28007b(th2);
                            bVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public C13328m(Iterable<? extends T> iterable) {
        this.f21320c = iterable;
    }

    /* renamed from: K */
    public static <T> void m30303K(C12860b<? super T> bVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                C13922d.m32170a(bVar);
            } else if (bVar instanceof C13064a) {
                bVar.mo49220e(new C13330b((C13064a) bVar, it));
            } else {
                bVar.mo49220e(new C13331c(bVar, it));
            }
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C13922d.m32171b(th, bVar);
        }
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        try {
            m30303K(bVar, this.f21320c.iterator());
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C13922d.m32171b(th, bVar);
        }
    }
}
