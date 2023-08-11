package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p341fe.C11962r;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p369je.C12620a;
import p386lg.C12860b;
import p386lg.C12861c;
import p403oe.C13064a;
import p403oe.C13070g;
import p403oe.C13073j;
import p447ve.C13639a;
import p465ye.C13919a;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.r */
/* compiled from: FlowableObserveOn */
public final class C13339r<T> extends C13287a<T, T> {

    /* renamed from: d */
    final C11962r f21335d;

    /* renamed from: e */
    final boolean f21336e;

    /* renamed from: f */
    final int f21337f;

    /* renamed from: re.r$a */
    /* compiled from: FlowableObserveOn */
    static abstract class C13340a<T> extends C13919a<T> implements C11952i<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: b */
        final C11962r.C11964b f21338b;

        /* renamed from: c */
        final boolean f21339c;

        /* renamed from: d */
        final int f21340d;

        /* renamed from: e */
        final int f21341e;

        /* renamed from: f */
        final AtomicLong f21342f = new AtomicLong();

        /* renamed from: g */
        C12861c f21343g;

        /* renamed from: h */
        C13073j<T> f21344h;

        /* renamed from: i */
        volatile boolean f21345i;

        /* renamed from: j */
        volatile boolean f21346j;

        /* renamed from: k */
        Throwable f21347k;

        /* renamed from: l */
        int f21348l;

        /* renamed from: m */
        long f21349m;

        /* renamed from: n */
        boolean f21350n;

        C13340a(C11962r.C11964b bVar, boolean z, int i) {
            this.f21338b = bVar;
            this.f21339c = z;
            this.f21340d = i;
            this.f21341e = i - (i >> 2);
        }

        /* renamed from: b */
        public final void mo50772b() {
            if (!this.f21346j) {
                this.f21346j = true;
                mo52972m();
            }
        }

        public final void cancel() {
            if (!this.f21345i) {
                this.f21345i = true;
                this.f21343g.cancel();
                this.f21338b.dispose();
                if (getAndIncrement() == 0) {
                    this.f21344h.clear();
                }
            }
        }

        public final void clear() {
            this.f21344h.clear();
        }

        /* renamed from: d */
        public final void mo50773d(T t) {
            if (!this.f21346j) {
                if (this.f21348l == 2) {
                    mo52972m();
                    return;
                }
                if (!this.f21344h.offer(t)) {
                    this.f21343g.cancel();
                    this.f21347k = new MissingBackpressureException("Queue is full?!");
                    this.f21346j = true;
                }
                mo52972m();
            }
        }

        /* renamed from: g */
        public final int mo50862g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f21350n = true;
            return 2;
        }

        /* renamed from: h */
        public final void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21342f, j);
                mo52972m();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo52968i(boolean z, boolean z2, C12860b<?> bVar) {
            if (this.f21345i) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f21339c) {
                    Throwable th = this.f21347k;
                    if (th != null) {
                        clear();
                        bVar.onError(th);
                        this.f21338b.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.mo50772b();
                        this.f21338b.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f21347k;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.mo50772b();
                    }
                    this.f21338b.dispose();
                    return true;
                }
            }
        }

        public final boolean isEmpty() {
            return this.f21344h.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract void mo52969j();

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract void mo52970k();

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public abstract void mo52971l();

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final void mo52972m() {
            if (getAndIncrement() == 0) {
                this.f21338b.mo49267b(this);
            }
        }

        public final void onError(Throwable th) {
            if (this.f21346j) {
                C10885a.m23270q(th);
                return;
            }
            this.f21347k = th;
            this.f21346j = true;
            mo52972m();
        }

        public final void run() {
            if (this.f21350n) {
                mo52970k();
            } else if (this.f21348l == 1) {
                mo52971l();
            } else {
                mo52969j();
            }
        }
    }

    /* renamed from: re.r$b */
    /* compiled from: FlowableObserveOn */
    static final class C13341b<T> extends C13340a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: o */
        final C13064a<? super T> f21351o;

        /* renamed from: p */
        long f21352p;

        C13341b(C13064a<? super T> aVar, C11962r.C11964b bVar, boolean z, int i) {
            super(bVar, z, i);
            this.f21351o = aVar;
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21343g, cVar)) {
                this.f21343g = cVar;
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(7);
                    if (g == 1) {
                        this.f21348l = 1;
                        this.f21344h = gVar;
                        this.f21346j = true;
                        this.f21351o.mo49220e(this);
                        return;
                    } else if (g == 2) {
                        this.f21348l = 2;
                        this.f21344h = gVar;
                        this.f21351o.mo49220e(this);
                        cVar.mo50776h((long) this.f21340d);
                        return;
                    }
                }
                this.f21344h = new C13639a(this.f21340d);
                this.f21351o.mo49220e(this);
                cVar.mo50776h((long) this.f21340d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52969j() {
            int i;
            boolean z;
            C13064a<? super T> aVar = this.f21351o;
            C13073j<T> jVar = this.f21344h;
            long j = this.f21349m;
            long j2 = this.f21352p;
            int i2 = 1;
            while (true) {
                long j3 = this.f21342f.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f21346j;
                    try {
                        T poll = jVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo52968i(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.mo50965f(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f21341e)) {
                                this.f21343g.mo50776h(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        this.f21343g.cancel();
                        jVar.clear();
                        aVar.onError(th);
                        this.f21338b.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo52968i(this.f21346j, jVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f21349m = j;
                        this.f21352p = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo52970k() {
            int i = 1;
            while (!this.f21345i) {
                boolean z = this.f21346j;
                this.f21351o.mo50773d(null);
                if (z) {
                    Throwable th = this.f21347k;
                    if (th != null) {
                        this.f21351o.onError(th);
                    } else {
                        this.f21351o.mo50772b();
                    }
                    this.f21338b.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo52971l() {
            C13064a<? super T> aVar = this.f21351o;
            C13073j<T> jVar = this.f21344h;
            long j = this.f21349m;
            int i = 1;
            while (true) {
                long j2 = this.f21342f.get();
                while (j != j2) {
                    try {
                        T poll = jVar.poll();
                        if (!this.f21345i) {
                            if (poll == null) {
                                aVar.mo50772b();
                                this.f21338b.dispose();
                                return;
                            } else if (aVar.mo50965f(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        this.f21343g.cancel();
                        aVar.onError(th);
                        this.f21338b.dispose();
                        return;
                    }
                }
                if (!this.f21345i) {
                    if (jVar.isEmpty()) {
                        aVar.mo50772b();
                        this.f21338b.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f21349m = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() {
            T poll = this.f21344h.poll();
            if (!(poll == null || this.f21348l == 1)) {
                long j = this.f21352p + 1;
                if (j == ((long) this.f21341e)) {
                    this.f21352p = 0;
                    this.f21343g.mo50776h(j);
                } else {
                    this.f21352p = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: re.r$c */
    /* compiled from: FlowableObserveOn */
    static final class C13342c<T> extends C13340a<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: o */
        final C12860b<? super T> f21353o;

        C13342c(C12860b<? super T> bVar, C11962r.C11964b bVar2, boolean z, int i) {
            super(bVar2, z, i);
            this.f21353o = bVar;
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21343g, cVar)) {
                this.f21343g = cVar;
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(7);
                    if (g == 1) {
                        this.f21348l = 1;
                        this.f21344h = gVar;
                        this.f21346j = true;
                        this.f21353o.mo49220e(this);
                        return;
                    } else if (g == 2) {
                        this.f21348l = 2;
                        this.f21344h = gVar;
                        this.f21353o.mo49220e(this);
                        cVar.mo50776h((long) this.f21340d);
                        return;
                    }
                }
                this.f21344h = new C13639a(this.f21340d);
                this.f21353o.mo49220e(this);
                cVar.mo50776h((long) this.f21340d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52969j() {
            int i;
            boolean z;
            C12860b<? super T> bVar = this.f21353o;
            C13073j<T> jVar = this.f21344h;
            long j = this.f21349m;
            int i2 = 1;
            while (true) {
                long j2 = this.f21342f.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f21346j;
                    try {
                        T poll = jVar.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo52968i(z2, z, bVar)) {
                            if (z) {
                                break;
                            }
                            bVar.mo50773d(poll);
                            j++;
                            if (j == ((long) this.f21341e)) {
                                if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
                                    j2 = this.f21342f.addAndGet(-j);
                                }
                                this.f21343g.mo50776h(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        this.f21343g.cancel();
                        jVar.clear();
                        bVar.onError(th);
                        this.f21338b.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo52968i(this.f21346j, jVar.isEmpty(), bVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f21349m = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo52970k() {
            int i = 1;
            while (!this.f21345i) {
                boolean z = this.f21346j;
                this.f21353o.mo50773d(null);
                if (z) {
                    Throwable th = this.f21347k;
                    if (th != null) {
                        this.f21353o.onError(th);
                    } else {
                        this.f21353o.mo50772b();
                    }
                    this.f21338b.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo52971l() {
            C12860b<? super T> bVar = this.f21353o;
            C13073j<T> jVar = this.f21344h;
            long j = this.f21349m;
            int i = 1;
            while (true) {
                long j2 = this.f21342f.get();
                while (j != j2) {
                    try {
                        T poll = jVar.poll();
                        if (!this.f21345i) {
                            if (poll == null) {
                                bVar.mo50772b();
                                this.f21338b.dispose();
                                return;
                            }
                            bVar.mo50773d(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12620a.m28007b(th);
                        this.f21343g.cancel();
                        bVar.onError(th);
                        this.f21338b.dispose();
                        return;
                    }
                }
                if (!this.f21345i) {
                    if (jVar.isEmpty()) {
                        bVar.mo50772b();
                        this.f21338b.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f21349m = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() {
            T poll = this.f21344h.poll();
            if (!(poll == null || this.f21348l == 1)) {
                long j = this.f21349m + 1;
                if (j == ((long) this.f21341e)) {
                    this.f21349m = 0;
                    this.f21343g.mo50776h(j);
                } else {
                    this.f21349m = j;
                }
            }
            return poll;
        }
    }

    public C13339r(C11949f<T> fVar, C11962r rVar, boolean z, int i) {
        super(fVar);
        this.f21335d = rVar;
        this.f21336e = z;
        this.f21337f = i;
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        C11962r.C11964b a = this.f21335d.mo49262a();
        if (bVar instanceof C13064a) {
            this.f21182c.mo49199H(new C13341b((C13064a) bVar, a, this.f21336e, this.f21337f));
        } else {
            this.f21182c.mo49199H(new C13342c(bVar, a, this.f21336e, this.f21337f));
        }
    }
}
