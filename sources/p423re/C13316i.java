package p423re;

import androidx.compose.animation.core.C0344a;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p361ie.C12141b;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p369je.C12620a;
import p384le.C12854e;
import p386lg.C12859a;
import p386lg.C12860b;
import p386lg.C12861c;
import p397ne.C13016b;
import p403oe.C13070g;
import p403oe.C13072i;
import p403oe.C13073j;
import p447ve.C13639a;
import p447ve.C13640b;
import p465ye.C13925g;
import p471ze.C14108c;
import p471ze.C14109d;
import p471ze.C14112g;

/* renamed from: re.i */
/* compiled from: FlowableFlatMap */
public final class C13316i<T, U> extends C13287a<T, U> {

    /* renamed from: d */
    final C12854e<? super T, ? extends C12859a<? extends U>> f21253d;

    /* renamed from: e */
    final boolean f21254e;

    /* renamed from: f */
    final int f21255f;

    /* renamed from: g */
    final int f21256g;

    /* renamed from: re.i$a */
    /* compiled from: FlowableFlatMap */
    static final class C13317a<T, U> extends AtomicReference<C12861c> implements C11952i<U>, C12141b {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b */
        final long f21257b;

        /* renamed from: c */
        final C13318b<T, U> f21258c;

        /* renamed from: d */
        final int f21259d;

        /* renamed from: e */
        final int f21260e;

        /* renamed from: f */
        volatile boolean f21261f;

        /* renamed from: g */
        volatile C13073j<U> f21262g;

        /* renamed from: h */
        long f21263h;

        /* renamed from: i */
        int f21264i;

        C13317a(C13318b<T, U> bVar, long j) {
            this.f21257b = j;
            this.f21258c = bVar;
            int i = bVar.f21271f;
            this.f21260e = i;
            this.f21259d = i >> 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52940a(long j) {
            if (this.f21264i != 1) {
                long j2 = this.f21263h + j;
                if (j2 >= ((long) this.f21259d)) {
                    this.f21263h = 0;
                    ((C12861c) get()).mo50776h(j2);
                    return;
                }
                this.f21263h = j2;
            }
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21261f = true;
            this.f21258c.mo52945j();
        }

        /* renamed from: d */
        public void mo50773d(U u) {
            if (this.f21264i != 2) {
                this.f21258c.mo52951p(u, this);
            } else {
                this.f21258c.mo52945j();
            }
        }

        public void dispose() {
            C13925g.m32182a(this);
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32187f(this, cVar)) {
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(7);
                    if (g == 1) {
                        this.f21264i = g;
                        this.f21262g = gVar;
                        this.f21261f = true;
                        this.f21258c.mo52945j();
                        return;
                    } else if (g == 2) {
                        this.f21264i = g;
                        this.f21262g = gVar;
                    }
                }
                cVar.mo50776h((long) this.f21260e);
            }
        }

        public boolean isDisposed() {
            if (get() == C13925g.CANCELLED) {
                return true;
            }
            return false;
        }

        public void onError(Throwable th) {
            lazySet(C13925g.CANCELLED);
            this.f21258c.mo52949n(this, th);
        }
    }

    /* renamed from: re.i$b */
    /* compiled from: FlowableFlatMap */
    static final class C13318b<T, U> extends AtomicInteger implements C11952i<T>, C12861c {

        /* renamed from: s */
        static final C13317a<?, ?>[] f21265s = new C13317a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: t */
        static final C13317a<?, ?>[] f21266t = new C13317a[0];

        /* renamed from: b */
        final C12860b<? super U> f21267b;

        /* renamed from: c */
        final C12854e<? super T, ? extends C12859a<? extends U>> f21268c;

        /* renamed from: d */
        final boolean f21269d;

        /* renamed from: e */
        final int f21270e;

        /* renamed from: f */
        final int f21271f;

        /* renamed from: g */
        volatile C13072i<U> f21272g;

        /* renamed from: h */
        volatile boolean f21273h;

        /* renamed from: i */
        final C14108c f21274i = new C14108c();

        /* renamed from: j */
        volatile boolean f21275j;

        /* renamed from: k */
        final AtomicReference<C13317a<?, ?>[]> f21276k;

        /* renamed from: l */
        final AtomicLong f21277l;

        /* renamed from: m */
        C12861c f21278m;

        /* renamed from: n */
        long f21279n;

        /* renamed from: o */
        long f21280o;

        /* renamed from: p */
        int f21281p;

        /* renamed from: q */
        int f21282q;

        /* renamed from: r */
        final int f21283r;

        C13318b(C12860b<? super U> bVar, C12854e<? super T, ? extends C12859a<? extends U>> eVar, boolean z, int i, int i2) {
            AtomicReference<C13317a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f21276k = atomicReference;
            this.f21277l = new AtomicLong();
            this.f21267b = bVar;
            this.f21268c = eVar;
            this.f21269d = z;
            this.f21270e = i;
            this.f21271f = i2;
            this.f21283r = Math.max(1, i >> 1);
            atomicReference.lazySet(f21265s);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo52941a(C13317a<T, U> aVar) {
            C13317a<?, ?>[] aVarArr;
            C13317a[] aVarArr2;
            do {
                aVarArr = (C13317a[]) this.f21276k.get();
                if (aVarArr == f21266t) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13317a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C0344a.m496a(this.f21276k, aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f21273h) {
                this.f21273h = true;
                mo52945j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo52942c() {
            if (this.f21275j) {
                mo52943g();
                return true;
            } else if (this.f21269d || this.f21274i.get() == null) {
                return false;
            } else {
                mo52943g();
                Throwable b = this.f21274i.mo53885b();
                if (b != C14112g.f23185a) {
                    this.f21267b.onError(b);
                }
                return true;
            }
        }

        public void cancel() {
            C13072i<U> iVar;
            if (!this.f21275j) {
                this.f21275j = true;
                this.f21278m.cancel();
                mo52944i();
                if (getAndIncrement() == 0 && (iVar = this.f21272g) != null) {
                    iVar.clear();
                }
            }
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21273h) {
                try {
                    C12859a aVar = (C12859a) C13016b.m29390d(this.f21268c.apply(t), "The mapper returned a null Publisher");
                    if (aVar instanceof Callable) {
                        try {
                            Object call = ((Callable) aVar).call();
                            if (call != null) {
                                mo52952q(call);
                            } else if (this.f21270e != Integer.MAX_VALUE && !this.f21275j) {
                                int i = this.f21282q + 1;
                                this.f21282q = i;
                                int i2 = this.f21283r;
                                if (i == i2) {
                                    this.f21282q = 0;
                                    this.f21278m.mo50776h((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C12620a.m28007b(th);
                            this.f21274i.mo53884a(th);
                            mo52945j();
                        }
                    } else {
                        long j = this.f21279n;
                        this.f21279n = 1 + j;
                        C13317a aVar2 = new C13317a(this, j);
                        if (mo52941a(aVar2)) {
                            aVar.mo49202a(aVar2);
                        }
                    }
                } catch (Throwable th2) {
                    C12620a.m28007b(th2);
                    this.f21278m.cancel();
                    onError(th2);
                }
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21278m, cVar)) {
                this.f21278m = cVar;
                this.f21267b.mo49220e(this);
                if (!this.f21275j) {
                    int i = this.f21270e;
                    if (i == Integer.MAX_VALUE) {
                        cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
                    } else {
                        cVar.mo50776h((long) i);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo52943g() {
            C13072i<U> iVar = this.f21272g;
            if (iVar != null) {
                iVar.clear();
            }
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21277l, j);
                mo52945j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo52944i() {
            C13317a<?, ?>[] aVarArr;
            C13317a<?, ?>[] aVarArr2 = (C13317a[]) this.f21276k.get();
            C13317a<?, ?>[] aVarArr3 = f21266t;
            if (aVarArr2 != aVarArr3 && (aVarArr = (C13317a[]) this.f21276k.getAndSet(aVarArr3)) != aVarArr3) {
                for (C13317a<?, ?> dispose : aVarArr) {
                    dispose.dispose();
                }
                Throwable b = this.f21274i.mo53885b();
                if (b != null && b != C14112g.f23185a) {
                    C10885a.m23270q(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52945j() {
            if (getAndIncrement() == 0) {
                mo52946k();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo52946k() {
            boolean z;
            long j;
            boolean z2;
            long j2;
            long j3;
            int i;
            int i2;
            long j4;
            C12860b<? super U> bVar = this.f21267b;
            int i3 = 1;
            while (!mo52942c()) {
                C13072i<U> iVar = this.f21272g;
                long j5 = this.f21277l.get();
                if (j5 == LocationRequestCompat.PASSIVE_INTERVAL) {
                    z = true;
                } else {
                    z = false;
                }
                long j6 = 0;
                long j7 = 0;
                if (iVar != null) {
                    while (true) {
                        long j8 = 0;
                        U u = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = iVar.poll();
                            if (!mo52942c()) {
                                if (poll == null) {
                                    u = poll;
                                    break;
                                }
                                bVar.mo50773d(poll);
                                j7++;
                                j8++;
                                j5--;
                                u = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z) {
                                j5 = LocationRequestCompat.PASSIVE_INTERVAL;
                            } else {
                                j5 = this.f21277l.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || u == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f21273h;
                C13072i<U> iVar2 = this.f21272g;
                C13317a[] aVarArr = (C13317a[]) this.f21276k.get();
                int length = aVarArr.length;
                if (!z3 || ((iVar2 != null && !iVar2.isEmpty()) || length != 0)) {
                    int i4 = i3;
                    if (length != 0) {
                        long j9 = this.f21280o;
                        int i5 = this.f21281p;
                        if (length <= i5 || aVarArr[i5].f21257b != j9) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            for (int i6 = 0; i6 < length && aVarArr[i5].f21257b != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f21281p = i5;
                            this.f21280o = aVarArr[i5].f21257b;
                        }
                        int i7 = i5;
                        boolean z4 = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                z2 = z4;
                                break;
                            } else if (!mo52942c()) {
                                C13317a aVar = aVarArr[i7];
                                U u2 = null;
                                while (!mo52942c()) {
                                    C13073j<U> jVar = aVar.f21262g;
                                    if (jVar == null) {
                                        i = length;
                                    } else {
                                        i = length;
                                        U u3 = u2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                U poll2 = jVar.poll();
                                                if (poll2 == null) {
                                                    u3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                bVar.mo50773d(poll2);
                                                if (!mo52942c()) {
                                                    j--;
                                                    j10++;
                                                    u3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C12620a.m28007b(th2);
                                                aVar.dispose();
                                                this.f21274i.mo53884a(th2);
                                                if (!this.f21269d) {
                                                    this.f21278m.cancel();
                                                }
                                                if (!mo52942c()) {
                                                    mo52950o(aVar);
                                                    i8++;
                                                    z4 = true;
                                                    i2 = 1;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            if (!z) {
                                                j = this.f21277l.addAndGet(-j10);
                                            } else {
                                                j = LocationRequestCompat.PASSIVE_INTERVAL;
                                            }
                                            aVar.mo52940a(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || u3 == null)) {
                                            length = i;
                                            u2 = u3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z5 = aVar.f21261f;
                                    C13073j<U> jVar2 = aVar.f21262g;
                                    if (z5 && (jVar2 == null || jVar2.isEmpty())) {
                                        mo52950o(aVar);
                                        if (!mo52942c()) {
                                            j7++;
                                            z4 = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        z2 = z4;
                                        break;
                                    }
                                    i7++;
                                    if (i7 == i) {
                                        i7 = 0;
                                    }
                                    i2 = 1;
                                    i8 += i2;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f21281p = i7;
                        this.f21280o = aVarArr[i7].f21257b;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z2 = false;
                    }
                    if (j3 != j2 && !this.f21275j) {
                        this.f21278m.mo50776h(j3);
                    }
                    if (z2) {
                        i3 = i4;
                    } else {
                        i3 = addAndGet(-i4);
                        if (i3 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable b = this.f21274i.mo53885b();
                    if (b == C14112g.f23185a) {
                        return;
                    }
                    if (b == null) {
                        bVar.mo50772b();
                        return;
                    } else {
                        bVar.onError(b);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C13073j<U> mo52947l(C13317a<T, U> aVar) {
            C13073j<U> jVar = aVar.f21262g;
            if (jVar != null) {
                return jVar;
            }
            C13639a aVar2 = new C13639a(this.f21271f);
            aVar.f21262g = aVar2;
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C13073j<U> mo52948m() {
            C13072i<U> iVar = this.f21272g;
            if (iVar == null) {
                if (this.f21270e == Integer.MAX_VALUE) {
                    iVar = new C13640b<>(this.f21271f);
                } else {
                    iVar = new C13639a<>(this.f21270e);
                }
                this.f21272g = iVar;
            }
            return iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo52949n(C13317a<T, U> aVar, Throwable th) {
            if (this.f21274i.mo53884a(th)) {
                aVar.f21261f = true;
                if (!this.f21269d) {
                    this.f21278m.cancel();
                    for (C13317a dispose : (C13317a[]) this.f21276k.getAndSet(f21266t)) {
                        dispose.dispose();
                    }
                }
                mo52945j();
                return;
            }
            C10885a.m23270q(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo52950o(C13317a<T, U> aVar) {
            C13317a<T, U>[] aVarArr;
            C13317a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C13317a[]) this.f21276k.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (aVarArr[i] == aVar) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f21265s;
                        } else {
                            C13317a<?, ?>[] aVarArr3 = new C13317a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!C0344a.m496a(this.f21276k, aVarArr, aVarArr2));
        }

        public void onError(Throwable th) {
            if (this.f21273h) {
                C10885a.m23270q(th);
            } else if (this.f21274i.mo53884a(th)) {
                this.f21273h = true;
                mo52945j();
            } else {
                C10885a.m23270q(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo52951p(U u, C13317a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13073j jVar = aVar.f21262g;
                if (jVar == null) {
                    jVar = new C13639a(this.f21271f);
                    aVar.f21262g = jVar;
                }
                if (!jVar.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f21277l.get();
                C13073j<U> jVar2 = aVar.f21262g;
                if (j == 0 || (jVar2 != null && !jVar2.isEmpty())) {
                    if (jVar2 == null) {
                        jVar2 = mo52947l(aVar);
                    }
                    if (!jVar2.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f21267b.mo50773d(u);
                    if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.f21277l.decrementAndGet();
                    }
                    aVar.mo52940a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo52946k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo52952q(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f21277l.get();
                C13073j jVar = this.f21272g;
                if (j == 0 || (jVar != null && !jVar.isEmpty())) {
                    if (jVar == null) {
                        jVar = mo52948m();
                    }
                    if (!jVar.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f21267b.mo50773d(u);
                    if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
                        this.f21277l.decrementAndGet();
                    }
                    if (this.f21270e != Integer.MAX_VALUE && !this.f21275j) {
                        int i = this.f21282q + 1;
                        this.f21282q = i;
                        int i2 = this.f21283r;
                        if (i == i2) {
                            this.f21282q = 0;
                            this.f21278m.mo50776h((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo52948m().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo52946k();
        }
    }

    public C13316i(C11949f<T> fVar, C12854e<? super T, ? extends C12859a<? extends U>> eVar, boolean z, int i, int i2) {
        super(fVar);
        this.f21253d = eVar;
        this.f21254e = z;
        this.f21255f = i;
        this.f21256g = i2;
    }

    /* renamed from: K */
    public static <T, U> C11952i<T> m30248K(C12860b<? super U> bVar, C12854e<? super T, ? extends C12859a<? extends U>> eVar, boolean z, int i, int i2) {
        return new C13318b(bVar, eVar, z, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super U> bVar) {
        if (!C13355x.m30382b(this.f21182c, bVar, this.f21253d)) {
            this.f21182c.mo49199H(m30248K(bVar, this.f21253d, this.f21254e, this.f21255f, this.f21256g));
        }
    }
}
