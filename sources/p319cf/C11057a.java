package p319cf;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p307af.C10885a;
import p341fe.C11961q;
import p361ie.C12141b;
import p397ne.C13016b;
import p471ze.C14105a;
import p471ze.C14112g;
import p471ze.C14115i;

/* renamed from: cf.a */
/* compiled from: BehaviorSubject */
public final class C11057a<T> extends C11059b<T> {

    /* renamed from: i */
    private static final Object[] f17142i = new Object[0];

    /* renamed from: j */
    static final C11058a[] f17143j = new C11058a[0];

    /* renamed from: k */
    static final C11058a[] f17144k = new C11058a[0];

    /* renamed from: b */
    final AtomicReference<Object> f17145b = new AtomicReference<>();

    /* renamed from: c */
    final AtomicReference<C11058a<T>[]> f17146c = new AtomicReference<>(f17143j);

    /* renamed from: d */
    final ReadWriteLock f17147d;

    /* renamed from: e */
    final Lock f17148e;

    /* renamed from: f */
    final Lock f17149f;

    /* renamed from: g */
    final AtomicReference<Throwable> f17150g = new AtomicReference<>();

    /* renamed from: h */
    long f17151h;

    /* renamed from: cf.a$a */
    /* compiled from: BehaviorSubject */
    static final class C11058a<T> implements C12141b, C14105a.C14106a<Object> {

        /* renamed from: b */
        final C11961q<? super T> f17152b;

        /* renamed from: c */
        final C11057a<T> f17153c;

        /* renamed from: d */
        boolean f17154d;

        /* renamed from: e */
        boolean f17155e;

        /* renamed from: f */
        C14105a<Object> f17156f;

        /* renamed from: g */
        boolean f17157g;

        /* renamed from: h */
        volatile boolean f17158h;

        /* renamed from: i */
        long f17159i;

        C11058a(C11961q<? super T> qVar, C11057a<T> aVar) {
            this.f17152b = qVar;
            this.f17153c = aVar;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo46149b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo46148a() {
            /*
                r4 = this;
                boolean r0 = r4.f17158h
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f17158h     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f17154d     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                cf.a<T> r0 = r4.f17153c     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f17148e     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f17151h     // Catch:{ all -> 0x003e }
                r4.f17159i = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f17145b     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = r1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f17155e = r2     // Catch:{ all -> 0x003e }
                r4.f17154d = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo46149b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p319cf.C11057a.C11058a.mo46148a():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo53880b(r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo46149b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f17158h
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                ze.a<java.lang.Object> r0 = r2.f17156f     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f17155e = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f17156f = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo53880b(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p319cf.C11057a.C11058a.mo46149b():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r2.f17157g = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo46150c(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.f17158h
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.f17157g
                if (r0 != 0) goto L_0x0037
                monitor-enter(r2)
                boolean r0 = r2.f17158h     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r2.f17159i     // Catch:{ all -> 0x0034 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r4 = r2.f17155e     // Catch:{ all -> 0x0034 }
                if (r4 == 0) goto L_0x002d
                ze.a<java.lang.Object> r4 = r2.f17156f     // Catch:{ all -> 0x0034 }
                if (r4 != 0) goto L_0x0028
                ze.a r4 = new ze.a     // Catch:{ all -> 0x0034 }
                r5 = 4
                r4.<init>(r5)     // Catch:{ all -> 0x0034 }
                r2.f17156f = r4     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r4.mo53879a(r3)     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r4 = 1
                r2.f17154d = r4     // Catch:{ all -> 0x0034 }
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                r2.f17157g = r4
                goto L_0x0037
            L_0x0034:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0034 }
                throw r3
            L_0x0037:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p319cf.C11057a.C11058a.mo46150c(java.lang.Object, long):void");
        }

        public void dispose() {
            if (!this.f17158h) {
                this.f17158h = true;
                this.f17153c.mo46145x(this);
            }
        }

        public boolean isDisposed() {
            return this.f17158h;
        }

        public boolean test(Object obj) {
            if (this.f17158h || C14115i.m32763a(obj, this.f17152b)) {
                return true;
            }
            return false;
        }
    }

    C11057a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f17147d = reentrantReadWriteLock;
        this.f17148e = reentrantReadWriteLock.readLock();
        this.f17149f = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: w */
    public static <T> C11057a<T> m23850w() {
        return new C11057a<>();
    }

    /* renamed from: b */
    public void mo46139b() {
        if (C0344a.m496a(this.f17150g, (Object) null, C14112g.f23185a)) {
            Object b = C14115i.m32764b();
            for (C11058a c : mo46147z(b)) {
                c.mo46150c(b, this.f17151h);
            }
        }
    }

    /* renamed from: c */
    public void mo46140c(C12141b bVar) {
        if (this.f17150g.get() != null) {
            bVar.dispose();
        }
    }

    /* renamed from: d */
    public void mo46141d(T t) {
        C13016b.m29390d(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f17150g.get() == null) {
            Object g = C14115i.m32769g(t);
            mo46146y(g);
            for (C11058a c : (C11058a[]) this.f17146c.get()) {
                c.mo46150c(g, this.f17151h);
            }
        }
    }

    public void onError(Throwable th) {
        C13016b.m29390d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C0344a.m496a(this.f17150g, (Object) null, th)) {
            C10885a.m23270q(th);
            return;
        }
        Object c = C14115i.m32765c(th);
        for (C11058a c2 : mo46147z(c)) {
            c2.mo46150c(c, this.f17151h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        C11058a aVar = new C11058a(qVar, this);
        qVar.mo46140c(aVar);
        if (!mo46144v(aVar)) {
            Throwable th = this.f17150g.get();
            if (th == C14112g.f23185a) {
                qVar.mo46139b();
            } else {
                qVar.onError(th);
            }
        } else if (aVar.f17158h) {
            mo46145x(aVar);
        } else {
            aVar.mo46148a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo46144v(C11058a<T> aVar) {
        C11058a[] aVarArr;
        C11058a[] aVarArr2;
        do {
            aVarArr = (C11058a[]) this.f17146c.get();
            if (aVarArr == f17144k) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11058a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!C0344a.m496a(this.f17146c, aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo46145x(C11058a<T> aVar) {
        C11058a<T>[] aVarArr;
        C11058a[] aVarArr2;
        do {
            aVarArr = (C11058a[]) this.f17146c.get();
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
                        aVarArr2 = f17143j;
                    } else {
                        C11058a[] aVarArr3 = new C11058a[(length - 1)];
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
        } while (!C0344a.m496a(this.f17146c, aVarArr, aVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo46146y(Object obj) {
        this.f17149f.lock();
        this.f17151h++;
        this.f17145b.lazySet(obj);
        this.f17149f.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C11058a<T>[] mo46147z(Object obj) {
        AtomicReference<C11058a<T>[]> atomicReference = this.f17146c;
        C11058a<T>[] aVarArr = f17144k;
        C11058a<T>[] aVarArr2 = (C11058a[]) atomicReference.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            mo46146y(obj);
        }
        return aVarArr2;
    }
}
