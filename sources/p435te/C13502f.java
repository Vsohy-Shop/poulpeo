package p435te;

import androidx.compose.animation.core.C0344a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11960p;
import p341fe.C11961q;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;
import p403oe.C13068e;
import p403oe.C13072i;
import p403oe.C13073j;
import p447ve.C13639a;
import p447ve.C13640b;
import p471ze.C14108c;
import p471ze.C14112g;

/* renamed from: te.f */
/* compiled from: ObservableFlatMap */
public final class C13502f<T, U> extends C13494a<T, U> {

    /* renamed from: c */
    final C12854e<? super T, ? extends C11960p<? extends U>> f21697c;

    /* renamed from: d */
    final boolean f21698d;

    /* renamed from: e */
    final int f21699e;

    /* renamed from: f */
    final int f21700f;

    /* renamed from: te.f$a */
    /* compiled from: ObservableFlatMap */
    static final class C13503a<T, U> extends AtomicReference<C12141b> implements C11961q<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b */
        final long f21701b;

        /* renamed from: c */
        final C13504b<T, U> f21702c;

        /* renamed from: d */
        volatile boolean f21703d;

        /* renamed from: e */
        volatile C13073j<U> f21704e;

        /* renamed from: f */
        int f21705f;

        C13503a(C13504b<T, U> bVar, long j) {
            this.f21701b = j;
            this.f21702c = bVar;
        }

        /* renamed from: a */
        public void mo53118a() {
            C12936b.m29221a(this);
        }

        /* renamed from: b */
        public void mo46139b() {
            this.f21703d = true;
            this.f21702c.mo53122g();
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29226f(this, bVar) && (bVar instanceof C13068e)) {
                C13068e eVar = (C13068e) bVar;
                int g = eVar.mo50862g(7);
                if (g == 1) {
                    this.f21705f = g;
                    this.f21704e = eVar;
                    this.f21703d = true;
                    this.f21702c.mo53122g();
                } else if (g == 2) {
                    this.f21705f = g;
                    this.f21704e = eVar;
                }
            }
        }

        /* renamed from: d */
        public void mo46141d(U u) {
            if (this.f21705f == 0) {
                this.f21702c.mo53126k(u, this);
            } else {
                this.f21702c.mo53122g();
            }
        }

        public void onError(Throwable th) {
            if (this.f21702c.f21715i.mo53884a(th)) {
                C13504b<T, U> bVar = this.f21702c;
                if (!bVar.f21710d) {
                    bVar.mo53121f();
                }
                this.f21703d = true;
                this.f21702c.mo53122g();
                return;
            }
            C10885a.m23270q(th);
        }
    }

    /* renamed from: te.f$b */
    /* compiled from: ObservableFlatMap */
    static final class C13504b<T, U> extends AtomicInteger implements C12141b, C11961q<T> {

        /* renamed from: r */
        static final C13503a<?, ?>[] f21706r = new C13503a[0];

        /* renamed from: s */
        static final C13503a<?, ?>[] f21707s = new C13503a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b */
        final C11961q<? super U> f21708b;

        /* renamed from: c */
        final C12854e<? super T, ? extends C11960p<? extends U>> f21709c;

        /* renamed from: d */
        final boolean f21710d;

        /* renamed from: e */
        final int f21711e;

        /* renamed from: f */
        final int f21712f;

        /* renamed from: g */
        volatile C13072i<U> f21713g;

        /* renamed from: h */
        volatile boolean f21714h;

        /* renamed from: i */
        final C14108c f21715i = new C14108c();

        /* renamed from: j */
        volatile boolean f21716j;

        /* renamed from: k */
        final AtomicReference<C13503a<?, ?>[]> f21717k;

        /* renamed from: l */
        C12141b f21718l;

        /* renamed from: m */
        long f21719m;

        /* renamed from: n */
        long f21720n;

        /* renamed from: o */
        int f21721o;

        /* renamed from: p */
        Queue<C11960p<? extends U>> f21722p;

        /* renamed from: q */
        int f21723q;

        C13504b(C11961q<? super U> qVar, C12854e<? super T, ? extends C11960p<? extends U>> eVar, boolean z, int i, int i2) {
            this.f21708b = qVar;
            this.f21709c = eVar;
            this.f21710d = z;
            this.f21711e = i;
            this.f21712f = i2;
            if (i != Integer.MAX_VALUE) {
                this.f21722p = new ArrayDeque(i);
            }
            this.f21717k = new AtomicReference<>(f21706r);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo53119a(C13503a<T, U> aVar) {
            C13503a<?, ?>[] aVarArr;
            C13503a[] aVarArr2;
            do {
                aVarArr = (C13503a[]) this.f21717k.get();
                if (aVarArr == f21707s) {
                    aVar.mo53118a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C13503a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!C0344a.m496a(this.f21717k, aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo46139b() {
            if (!this.f21714h) {
                this.f21714h = true;
                mo53122g();
            }
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            if (C12936b.m29227g(this.f21718l, bVar)) {
                this.f21718l = bVar;
                this.f21708b.mo46140c(this);
            }
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            if (!this.f21714h) {
                try {
                    C11960p pVar = (C11960p) C13016b.m29390d(this.f21709c.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f21711e != Integer.MAX_VALUE) {
                        synchronized (this) {
                            int i = this.f21723q;
                            if (i == this.f21711e) {
                                this.f21722p.offer(pVar);
                                return;
                            }
                            this.f21723q = i + 1;
                        }
                    }
                    mo53125j(pVar);
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    this.f21718l.dispose();
                    onError(th);
                }
            }
        }

        public void dispose() {
            Throwable b;
            if (!this.f21716j) {
                this.f21716j = true;
                if (mo53121f() && (b = this.f21715i.mo53885b()) != null && b != C14112g.f23185a) {
                    C10885a.m23270q(b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo53120e() {
            if (this.f21716j) {
                return true;
            }
            Throwable th = (Throwable) this.f21715i.get();
            if (this.f21710d || th == null) {
                return false;
            }
            mo53121f();
            Throwable b = this.f21715i.mo53885b();
            if (b != C14112g.f23185a) {
                this.f21708b.onError(b);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53121f() {
            C13503a<?, ?>[] aVarArr;
            this.f21718l.dispose();
            C13503a<?, ?>[] aVarArr2 = (C13503a[]) this.f21717k.get();
            C13503a<?, ?>[] aVarArr3 = f21707s;
            if (aVarArr2 == aVarArr3 || (aVarArr = (C13503a[]) this.f21717k.getAndSet(aVarArr3)) == aVarArr3) {
                return false;
            }
            for (C13503a<?, ?> a : aVarArr) {
                a.mo53118a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo53122g() {
            if (getAndIncrement() == 0) {
                mo53123h();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b5, code lost:
            if (r12 != null) goto L_0x00a3;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53123h() {
            /*
                r13 = this;
                fe.q<? super U> r0 = r13.f21708b
                r1 = 1
                r2 = r1
            L_0x0004:
                boolean r3 = r13.mo53120e()
                if (r3 == 0) goto L_0x000b
                return
            L_0x000b:
                oe.i<U> r3 = r13.f21713g
                if (r3 == 0) goto L_0x0023
            L_0x000f:
                boolean r4 = r13.mo53120e()
                if (r4 == 0) goto L_0x0016
                return
            L_0x0016:
                java.lang.Object r4 = r3.poll()
                if (r4 != 0) goto L_0x001f
                if (r4 != 0) goto L_0x000f
                goto L_0x0023
            L_0x001f:
                r0.mo46141d(r4)
                goto L_0x000f
            L_0x0023:
                boolean r3 = r13.f21714h
                oe.i<U> r4 = r13.f21713g
                java.util.concurrent.atomic.AtomicReference<te.f$a<?, ?>[]> r5 = r13.f21717k
                java.lang.Object r5 = r5.get()
                te.f$a[] r5 = (p435te.C13502f.C13503a[]) r5
                int r6 = r5.length
                int r7 = r13.f21711e
                r8 = 2147483647(0x7fffffff, float:NaN)
                r9 = 0
                if (r7 == r8) goto L_0x0044
                monitor-enter(r13)
                java.util.Queue<fe.p<? extends U>> r7 = r13.f21722p     // Catch:{ all -> 0x0041 }
                int r7 = r7.size()     // Catch:{ all -> 0x0041 }
                monitor-exit(r13)     // Catch:{ all -> 0x0041 }
                goto L_0x0045
            L_0x0041:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0041 }
                throw r0
            L_0x0044:
                r7 = r9
            L_0x0045:
                if (r3 == 0) goto L_0x0067
                if (r4 == 0) goto L_0x004f
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L_0x0067
            L_0x004f:
                if (r6 != 0) goto L_0x0067
                if (r7 != 0) goto L_0x0067
                ze.c r1 = r13.f21715i
                java.lang.Throwable r1 = r1.mo53885b()
                java.lang.Throwable r2 = p471ze.C14112g.f23185a
                if (r1 == r2) goto L_0x0066
                if (r1 != 0) goto L_0x0063
                r0.mo46139b()
                goto L_0x0066
            L_0x0063:
                r0.onError(r1)
            L_0x0066:
                return
            L_0x0067:
                if (r6 == 0) goto L_0x0104
                long r3 = r13.f21720n
                int r7 = r13.f21721o
                if (r6 <= r7) goto L_0x0077
                r10 = r5[r7]
                long r10 = r10.f21701b
                int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r10 == 0) goto L_0x0096
            L_0x0077:
                if (r6 > r7) goto L_0x007a
                r7 = r9
            L_0x007a:
                r10 = r9
            L_0x007b:
                if (r10 >= r6) goto L_0x008e
                r11 = r5[r7]
                long r11 = r11.f21701b
                int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r11 != 0) goto L_0x0086
                goto L_0x008e
            L_0x0086:
                int r7 = r7 + 1
                if (r7 != r6) goto L_0x008b
                r7 = r9
            L_0x008b:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x008e:
                r13.f21721o = r7
                r3 = r5[r7]
                long r3 = r3.f21701b
                r13.f21720n = r3
            L_0x0096:
                r3 = r9
                r4 = r3
            L_0x0098:
                if (r3 >= r6) goto L_0x00fb
                boolean r10 = r13.mo53120e()
                if (r10 == 0) goto L_0x00a1
                return
            L_0x00a1:
                r10 = r5[r7]
            L_0x00a3:
                boolean r11 = r13.mo53120e()
                if (r11 == 0) goto L_0x00aa
                return
            L_0x00aa:
                oe.j<U> r11 = r10.f21704e
                if (r11 != 0) goto L_0x00af
                goto L_0x00b7
            L_0x00af:
                java.lang.Object r12 = r11.poll()     // Catch:{ all -> 0x00e0 }
                if (r12 != 0) goto L_0x00d6
                if (r12 != 0) goto L_0x00a3
            L_0x00b7:
                boolean r11 = r10.f21703d
                oe.j<U> r12 = r10.f21704e
                if (r11 == 0) goto L_0x00d0
                if (r12 == 0) goto L_0x00c5
                boolean r11 = r12.isEmpty()
                if (r11 == 0) goto L_0x00d0
            L_0x00c5:
                r13.mo53124i(r10)
                boolean r4 = r13.mo53120e()
                if (r4 == 0) goto L_0x00cf
                return
            L_0x00cf:
                r4 = r1
            L_0x00d0:
                int r7 = r7 + 1
                if (r7 != r6) goto L_0x00f9
                r7 = r9
                goto L_0x00f9
            L_0x00d6:
                r0.mo46141d(r12)
                boolean r12 = r13.mo53120e()
                if (r12 == 0) goto L_0x00af
                return
            L_0x00e0:
                r4 = move-exception
                p369je.C12620a.m28007b(r4)
                r10.mo53118a()
                ze.c r11 = r13.f21715i
                r11.mo53884a(r4)
                boolean r4 = r13.mo53120e()
                if (r4 == 0) goto L_0x00f3
                return
            L_0x00f3:
                r13.mo53124i(r10)
                int r3 = r3 + 1
                r4 = r1
            L_0x00f9:
                int r3 = r3 + r1
                goto L_0x0098
            L_0x00fb:
                r13.f21721o = r7
                r3 = r5[r7]
                long r5 = r3.f21701b
                r13.f21720n = r5
                r9 = r4
            L_0x0104:
                if (r9 == 0) goto L_0x0126
                int r3 = r13.f21711e
                if (r3 == r8) goto L_0x0004
                monitor-enter(r13)
                java.util.Queue<fe.p<? extends U>> r3 = r13.f21722p     // Catch:{ all -> 0x0123 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0123 }
                fe.p r3 = (p341fe.C11960p) r3     // Catch:{ all -> 0x0123 }
                if (r3 != 0) goto L_0x011d
                int r3 = r13.f21723q     // Catch:{ all -> 0x0123 }
                int r3 = r3 - r1
                r13.f21723q = r3     // Catch:{ all -> 0x0123 }
                monitor-exit(r13)     // Catch:{ all -> 0x0123 }
                goto L_0x0004
            L_0x011d:
                monitor-exit(r13)     // Catch:{ all -> 0x0123 }
                r13.mo53125j(r3)
                goto L_0x0004
            L_0x0123:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0123 }
                throw r0
            L_0x0126:
                int r2 = -r2
                int r2 = r13.addAndGet(r2)
                if (r2 != 0) goto L_0x0004
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p435te.C13502f.C13504b.mo53123h():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo53124i(C13503a<T, U> aVar) {
            C13503a<T, U>[] aVarArr;
            C13503a<?, ?>[] aVarArr2;
            do {
                aVarArr = (C13503a[]) this.f21717k.get();
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
                            aVarArr2 = f21706r;
                        } else {
                            C13503a<?, ?>[] aVarArr3 = new C13503a[(length - 1)];
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
            } while (!C0344a.m496a(this.f21717k, aVarArr, aVarArr2));
        }

        public boolean isDisposed() {
            return this.f21716j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo53125j(C11960p<? extends U> pVar) {
            boolean z;
            while (pVar instanceof Callable) {
                if (mo53127l((Callable) pVar) && this.f21711e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        pVar = this.f21722p.poll();
                        if (pVar == null) {
                            z = true;
                            this.f21723q--;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        mo53122g();
                        return;
                    }
                } else {
                    return;
                }
            }
            long j = this.f21719m;
            this.f21719m = 1 + j;
            C13503a aVar = new C13503a(this, j);
            if (mo53119a(aVar)) {
                pVar.mo49249a(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo53126k(U u, C13503a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C13073j jVar = aVar.f21704e;
                if (jVar == null) {
                    jVar = new C13640b(this.f21712f);
                    aVar.f21704e = jVar;
                }
                jVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f21708b.mo46141d(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo53123h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo53127l(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C13072i<U> iVar = this.f21713g;
                    if (iVar == null) {
                        if (this.f21711e == Integer.MAX_VALUE) {
                            iVar = new C13640b<>(this.f21712f);
                        } else {
                            iVar = new C13639a<>(this.f21711e);
                        }
                        this.f21713g = iVar;
                    }
                    if (!iVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f21708b.mo46141d(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo53123h();
                return true;
            } catch (Throwable th) {
                C12620a.m28007b(th);
                this.f21715i.mo53884a(th);
                mo53122g();
                return true;
            }
        }

        public void onError(Throwable th) {
            if (this.f21714h) {
                C10885a.m23270q(th);
            } else if (this.f21715i.mo53884a(th)) {
                this.f21714h = true;
                mo53122g();
            } else {
                C10885a.m23270q(th);
            }
        }
    }

    public C13502f(C11960p<T> pVar, C12854e<? super T, ? extends C11960p<? extends U>> eVar, boolean z, int i, int i2) {
        super(pVar);
        this.f21697c = eVar;
        this.f21698d = z;
        this.f21699e = i;
        this.f21700f = i2;
    }

    /* renamed from: s */
    public void mo46143s(C11961q<? super U> qVar) {
        if (!C13516l.m30824b(this.f21682b, qVar, this.f21697c)) {
            this.f21682b.mo49249a(new C13504b(qVar, this.f21697c, this.f21698d, this.f21699e, this.f21700f));
        }
    }
}
