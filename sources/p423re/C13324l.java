package p423re;

import androidx.core.location.LocationRequestCompat;
import p341fe.C11949f;
import p386lg.C12860b;
import p397ne.C13016b;
import p403oe.C13064a;
import p465ye.C13920b;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.l */
/* compiled from: FlowableFromArray */
public final class C13324l<T> extends C11949f<T> {

    /* renamed from: c */
    final T[] f21314c;

    /* renamed from: re.l$a */
    /* compiled from: FlowableFromArray */
    static final class C13325a<T> extends C13327c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        final C13064a<? super T> f21315e;

        C13325a(C13064a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f21315e = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52963a() {
            T[] tArr = this.f21317b;
            int length = tArr.length;
            C13064a<? super T> aVar = this.f21315e;
            int i = this.f21318c;
            while (i != length) {
                if (!this.f21319d) {
                    T t = tArr[i];
                    if (t == null) {
                        aVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        aVar.mo50965f(t);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f21319d) {
                aVar.mo50772b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52964b(long j) {
            T[] tArr = this.f21317b;
            int length = tArr.length;
            int i = this.f21318c;
            C13064a<? super T> aVar = this.f21315e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.f21318c = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.f21319d) {
                            aVar.mo50772b();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.f21319d) {
                        T t = tArr[i];
                        if (t == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.mo50965f(t)) {
                            j2++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: re.l$b */
    /* compiled from: FlowableFromArray */
    static final class C13326b<T> extends C13327c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        final C12860b<? super T> f21316e;

        C13326b(C12860b<? super T> bVar, T[] tArr) {
            super(tArr);
            this.f21316e = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52963a() {
            T[] tArr = this.f21317b;
            int length = tArr.length;
            C12860b<? super T> bVar = this.f21316e;
            int i = this.f21318c;
            while (i != length) {
                if (!this.f21319d) {
                    T t = tArr[i];
                    if (t == null) {
                        bVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        bVar.mo50773d(t);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f21319d) {
                bVar.mo50772b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52964b(long j) {
            T[] tArr = this.f21317b;
            int length = tArr.length;
            int i = this.f21318c;
            C12860b<? super T> bVar = this.f21316e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i != length) {
                            j = get();
                            if (j2 == j) {
                                this.f21318c = i;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.f21319d) {
                            bVar.mo50772b();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.f21319d) {
                        T t = tArr[i];
                        if (t == null) {
                            bVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        bVar.mo50773d(t);
                        j2++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: re.l$c */
    /* compiled from: FlowableFromArray */
    static abstract class C13327c<T> extends C13920b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        final T[] f21317b;

        /* renamed from: c */
        int f21318c;

        /* renamed from: d */
        volatile boolean f21319d;

        C13327c(T[] tArr) {
            this.f21317b = tArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo52963a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo52964b(long j);

        public final void cancel() {
            this.f21319d = true;
        }

        public final void clear() {
            this.f21318c = this.f21317b.length;
        }

        /* renamed from: g */
        public final int mo50862g(int i) {
            return i & 1;
        }

        /* renamed from: h */
        public final void mo50776h(long j) {
            if (C13925g.m32188g(j) && C14109d.m32751a(this, j) == 0) {
                if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                    mo52963a();
                } else {
                    mo52964b(j);
                }
            }
        }

        public final boolean isEmpty() {
            if (this.f21318c == this.f21317b.length) {
                return true;
            }
            return false;
        }

        public final T poll() {
            int i = this.f21318c;
            T[] tArr = this.f21317b;
            if (i == tArr.length) {
                return null;
            }
            this.f21318c = i + 1;
            return C13016b.m29390d(tArr[i], "array element is null");
        }
    }

    public C13324l(T[] tArr) {
        this.f21314c = tArr;
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        if (bVar instanceof C13064a) {
            bVar.mo49220e(new C13325a((C13064a) bVar, this.f21314c));
        } else {
            bVar.mo49220e(new C13326b(bVar, this.f21314c));
        }
    }
}
