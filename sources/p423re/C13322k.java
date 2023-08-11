package p423re;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p369je.C12620a;
import p384le.C12854e;
import p386lg.C12860b;
import p386lg.C12861c;
import p397ne.C13016b;
import p403oe.C13070g;
import p403oe.C13073j;
import p447ve.C13639a;
import p465ye.C13919a;
import p465ye.C13922d;
import p465ye.C13925g;
import p471ze.C14109d;
import p471ze.C14112g;

/* renamed from: re.k */
/* compiled from: FlowableFlattenIterable */
public final class C13322k<T, R> extends C13287a<T, R> {

    /* renamed from: d */
    final C12854e<? super T, ? extends Iterable<? extends R>> f21299d;

    /* renamed from: e */
    final int f21300e;

    /* renamed from: re.k$a */
    /* compiled from: FlowableFlattenIterable */
    static final class C13323a<T, R> extends C13919a<R> implements C11952i<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* renamed from: b */
        final C12860b<? super R> f21301b;

        /* renamed from: c */
        final C12854e<? super T, ? extends Iterable<? extends R>> f21302c;

        /* renamed from: d */
        final int f21303d;

        /* renamed from: e */
        final int f21304e;

        /* renamed from: f */
        final AtomicLong f21305f = new AtomicLong();

        /* renamed from: g */
        C12861c f21306g;

        /* renamed from: h */
        C13073j<T> f21307h;

        /* renamed from: i */
        volatile boolean f21308i;

        /* renamed from: j */
        volatile boolean f21309j;

        /* renamed from: k */
        final AtomicReference<Throwable> f21310k = new AtomicReference<>();

        /* renamed from: l */
        Iterator<? extends R> f21311l;

        /* renamed from: m */
        int f21312m;

        /* renamed from: n */
        int f21313n;

        C13323a(C12860b<? super R> bVar, C12854e<? super T, ? extends Iterable<? extends R>> eVar, int i) {
            this.f21301b = bVar;
            this.f21302c = eVar;
            this.f21303d = i;
            this.f21304e = i - (i >> 2);
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f21308i) {
                this.f21308i = true;
                mo52962k();
            }
        }

        public void cancel() {
            if (!this.f21309j) {
                this.f21309j = true;
                this.f21306g.cancel();
                if (getAndIncrement() == 0) {
                    this.f21307h.clear();
                }
            }
        }

        public void clear() {
            this.f21311l = null;
            this.f21307h.clear();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21308i) {
                if (this.f21313n != 0 || this.f21307h.offer(t)) {
                    mo52962k();
                } else {
                    onError(new MissingBackpressureException("Queue is full?!"));
                }
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21306g, cVar)) {
                this.f21306g = cVar;
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(3);
                    if (g == 1) {
                        this.f21313n = g;
                        this.f21307h = gVar;
                        this.f21308i = true;
                        this.f21301b.mo49220e(this);
                        return;
                    } else if (g == 2) {
                        this.f21313n = g;
                        this.f21307h = gVar;
                        this.f21301b.mo49220e(this);
                        cVar.mo50776h((long) this.f21303d);
                        return;
                    }
                }
                this.f21307h = new C13639a(this.f21303d);
                this.f21301b.mo49220e(this);
                cVar.mo50776h((long) this.f21303d);
            }
        }

        /* renamed from: g */
        public int mo50862g(int i) {
            if ((i & 1) == 0 || this.f21313n != 1) {
                return 0;
            }
            return 1;
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21305f, j);
                mo52962k();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo52960i(boolean z, boolean z2, C12860b<?> bVar, C13073j<?> jVar) {
            if (this.f21309j) {
                this.f21311l = null;
                jVar.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (this.f21310k.get() != null) {
                    Throwable b = C14112g.m32757b(this.f21310k);
                    this.f21311l = null;
                    jVar.clear();
                    bVar.onError(b);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.mo50772b();
                    return true;
                }
            }
        }

        public boolean isEmpty() {
            if (this.f21311l != null || !this.f21307h.isEmpty()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52961j(boolean z) {
            if (z) {
                int i = this.f21312m + 1;
                if (i == this.f21304e) {
                    this.f21312m = 0;
                    this.f21306g.mo50776h((long) i);
                    return;
                }
                this.f21312m = i;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
            if (r6 == null) goto L_0x012c;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo52962k() {
            /*
                r18 = this;
                r1 = r18
                int r0 = r18.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                lg.b<? super R> r2 = r1.f21301b
                oe.j<T> r3 = r1.f21307h
                int r0 = r1.f21313n
                r4 = 0
                r5 = 1
                if (r0 == r5) goto L_0x0015
                r0 = r5
                goto L_0x0016
            L_0x0015:
                r0 = r4
            L_0x0016:
                java.util.Iterator<? extends R> r6 = r1.f21311l
                r7 = r5
            L_0x0019:
                r8 = 0
                if (r6 != 0) goto L_0x0080
                boolean r9 = r1.f21308i
                java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0062 }
                if (r10 != 0) goto L_0x0026
                r11 = r5
                goto L_0x0027
            L_0x0026:
                r11 = r4
            L_0x0027:
                boolean r9 = r1.mo52960i(r9, r11, r2, r3)
                if (r9 == 0) goto L_0x002e
                return
            L_0x002e:
                if (r10 == 0) goto L_0x0080
                le.e<? super T, ? extends java.lang.Iterable<? extends R>> r6 = r1.f21302c     // Catch:{ all -> 0x004a }
                java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x004a }
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x004a }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x004a }
                boolean r9 = r6.hasNext()     // Catch:{ all -> 0x004a }
                if (r9 != 0) goto L_0x0047
                r1.mo52961j(r0)
                r6 = r8
                goto L_0x0019
            L_0x0047:
                r1.f21311l = r6
                goto L_0x0080
            L_0x004a:
                r0 = move-exception
                p369je.C12620a.m28007b(r0)
                lg.c r3 = r1.f21306g
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.f21310k
                p471ze.C14112g.m32756a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                java.lang.Throwable r0 = p471ze.C14112g.m32757b(r0)
                r2.onError(r0)
                return
            L_0x0062:
                r0 = move-exception
                r4 = r0
                p369je.C12620a.m28007b(r4)
                lg.c r0 = r1.f21306g
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                p471ze.C14112g.m32756a(r0, r4)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                java.lang.Throwable r0 = p471ze.C14112g.m32757b(r0)
                r1.f21311l = r8
                r3.clear()
                r2.onError(r0)
                return
            L_0x0080:
                if (r6 == 0) goto L_0x0124
                java.util.concurrent.atomic.AtomicLong r9 = r1.f21305f
                long r9 = r9.get()
                r11 = 0
                r13 = r11
            L_0x008b:
                int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f6
                boolean r15 = r1.f21308i
                boolean r15 = r1.mo52960i(r15, r4, r2, r3)
                if (r15 == 0) goto L_0x0098
                return
            L_0x0098:
                java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00dc }
                java.lang.String r5 = "The iterator returned a null value"
                java.lang.Object r5 = p397ne.C13016b.m29390d(r15, r5)     // Catch:{ all -> 0x00dc }
                r2.mo50773d(r5)
                boolean r5 = r1.f21308i
                boolean r5 = r1.mo52960i(r5, r4, r2, r3)
                if (r5 == 0) goto L_0x00ae
                return
            L_0x00ae:
                r16 = 1
                long r13 = r13 + r16
                boolean r5 = r6.hasNext()     // Catch:{ all -> 0x00c1 }
                if (r5 != 0) goto L_0x00bf
                r1.mo52961j(r0)
                r1.f21311l = r8
                r6 = r8
                goto L_0x00f6
            L_0x00bf:
                r5 = 1
                goto L_0x008b
            L_0x00c1:
                r0 = move-exception
                r3 = r0
                p369je.C12620a.m28007b(r3)
                r1.f21311l = r8
                lg.c r0 = r1.f21306g
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                p471ze.C14112g.m32756a(r0, r3)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                java.lang.Throwable r0 = p471ze.C14112g.m32757b(r0)
                r2.onError(r0)
                return
            L_0x00dc:
                r0 = move-exception
                p369je.C12620a.m28007b(r0)
                r1.f21311l = r8
                lg.c r3 = r1.f21306g
                r3.cancel()
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r3 = r1.f21310k
                p471ze.C14112g.m32756a(r3, r0)
                java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.f21310k
                java.lang.Throwable r0 = p471ze.C14112g.m32757b(r0)
                r2.onError(r0)
                return
            L_0x00f6:
                int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x010e
                boolean r5 = r1.f21308i
                boolean r8 = r3.isEmpty()
                if (r8 == 0) goto L_0x0106
                if (r6 != 0) goto L_0x0106
                r8 = 1
                goto L_0x0107
            L_0x0106:
                r8 = r4
            L_0x0107:
                boolean r5 = r1.mo52960i(r5, r8, r2, r3)
                if (r5 == 0) goto L_0x010e
                return
            L_0x010e:
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0121
                java.util.concurrent.atomic.AtomicLong r5 = r1.f21305f
                long r8 = -r13
                r5.addAndGet(r8)
            L_0x0121:
                if (r6 != 0) goto L_0x0124
                goto L_0x012c
            L_0x0124:
                int r5 = -r7
                int r7 = r1.addAndGet(r5)
                if (r7 != 0) goto L_0x012c
                return
            L_0x012c:
                r5 = 1
                goto L_0x0019
            */
            throw new UnsupportedOperationException("Method not decompiled: p423re.C13322k.C13323a.mo52962k():void");
        }

        public void onError(Throwable th) {
            if (this.f21308i || !C14112g.m32756a(this.f21310k, th)) {
                C10885a.m23270q(th);
                return;
            }
            this.f21308i = true;
            mo52962k();
        }

        public R poll() {
            Iterator<? extends R> it = this.f21311l;
            while (true) {
                if (it == null) {
                    T poll = this.f21307h.poll();
                    if (poll != null) {
                        it = ((Iterable) this.f21302c.apply(poll)).iterator();
                        if (it.hasNext()) {
                            this.f21311l = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R d = C13016b.m29390d(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f21311l = null;
            }
            return d;
        }
    }

    public C13322k(C11949f<T> fVar, C12854e<? super T, ? extends Iterable<? extends R>> eVar, int i) {
        super(fVar);
        this.f21299d = eVar;
        this.f21300e = i;
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super R> bVar) {
        C11949f<T> fVar = this.f21182c;
        if (fVar instanceof Callable) {
            try {
                Object call = ((Callable) fVar).call();
                if (call == null) {
                    C13922d.m32170a(bVar);
                    return;
                }
                try {
                    C13328m.m30303K(bVar, ((Iterable) this.f21299d.apply(call)).iterator());
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    C13922d.m32171b(th, bVar);
                }
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                C13922d.m32171b(th2, bVar);
            }
        } else {
            fVar.mo49199H(new C13323a(bVar, this.f21299d, this.f21300e));
        }
    }
}
