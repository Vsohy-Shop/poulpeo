package p423re;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11944a;
import p341fe.C11949f;
import p341fe.C11950g;
import p341fe.C11951h;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p369je.C12620a;
import p386lg.C12860b;
import p386lg.C12861c;
import p391me.C12939e;
import p447ve.C13640b;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.c */
/* compiled from: FlowableCreate */
public final class C13296c<T> extends C11949f<T> {

    /* renamed from: c */
    final C11951h<T> f21208c;

    /* renamed from: d */
    final C11944a f21209d;

    /* renamed from: re.c$a */
    /* compiled from: FlowableCreate */
    static /* synthetic */ class C13297a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21210a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                fe.a[] r0 = p341fe.C11944a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21210a = r0
                fe.a r1 = p341fe.C11944a.MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21210a     // Catch:{ NoSuchFieldError -> 0x001d }
                fe.a r1 = p341fe.C11944a.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21210a     // Catch:{ NoSuchFieldError -> 0x0028 }
                fe.a r1 = p341fe.C11944a.DROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21210a     // Catch:{ NoSuchFieldError -> 0x0033 }
                fe.a r1 = p341fe.C11944a.LATEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p423re.C13296c.C13297a.<clinit>():void");
        }
    }

    /* renamed from: re.c$c */
    /* compiled from: FlowableCreate */
    static final class C13299c<T> extends C13298b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: d */
        final C13640b<T> f21213d;

        /* renamed from: e */
        Throwable f21214e;

        /* renamed from: f */
        volatile boolean f21215f;

        /* renamed from: g */
        final AtomicInteger f21216g = new AtomicInteger();

        C13299c(C12860b<? super T> bVar, int i) {
            super(bVar);
            this.f21213d = new C13640b<>(i);
        }

        /* renamed from: d */
        public void mo49191d(T t) {
            if (!this.f21215f && !mo52931c()) {
                if (t == null) {
                    mo52932e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f21213d.offer(t);
                mo52937j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo52933f() {
            mo52937j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo52934g() {
            if (this.f21216g.getAndIncrement() == 0) {
                this.f21213d.clear();
            }
        }

        /* renamed from: i */
        public boolean mo52935i(Throwable th) {
            if (this.f21215f || mo52931c()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f21214e = th;
            this.f21215f = true;
            mo52937j();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52937j() {
            int i;
            boolean z;
            if (this.f21216g.getAndIncrement() == 0) {
                C12860b<? super T> bVar = this.f21211b;
                C13640b<T> bVar2 = this.f21213d;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (mo52931c()) {
                            bVar2.clear();
                            return;
                        } else {
                            boolean z2 = this.f21215f;
                            T poll = bVar2.poll();
                            if (poll == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && z) {
                                Throwable th = this.f21214e;
                                if (th != null) {
                                    mo52930b(th);
                                    return;
                                } else {
                                    mo52929a();
                                    return;
                                }
                            } else if (z) {
                                break;
                            } else {
                                bVar.mo50773d(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (mo52931c()) {
                            bVar2.clear();
                            return;
                        }
                        boolean z3 = this.f21215f;
                        boolean isEmpty = bVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f21214e;
                            if (th2 != null) {
                                mo52930b(th2);
                                return;
                            } else {
                                mo52929a();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C14109d.m32754d(this, j2);
                    }
                    i2 = this.f21216g.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: re.c$e */
    /* compiled from: FlowableCreate */
    static final class C13301e<T> extends C13304h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        C13301e(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52938j() {
            mo52932e(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: re.c$f */
    /* compiled from: FlowableCreate */
    static final class C13302f<T> extends C13298b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: d */
        final AtomicReference<T> f21217d = new AtomicReference<>();

        /* renamed from: e */
        Throwable f21218e;

        /* renamed from: f */
        volatile boolean f21219f;

        /* renamed from: g */
        final AtomicInteger f21220g = new AtomicInteger();

        C13302f(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: d */
        public void mo49191d(T t) {
            if (!this.f21219f && !mo52931c()) {
                if (t == null) {
                    mo52932e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.f21217d.set(t);
                mo52939j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo52933f() {
            mo52939j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo52934g() {
            if (this.f21220g.getAndIncrement() == 0) {
                this.f21217d.lazySet((Object) null);
            }
        }

        /* renamed from: i */
        public boolean mo52935i(Throwable th) {
            if (this.f21219f || mo52931c()) {
                return false;
            }
            if (th == null) {
                mo52932e(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f21218e = th;
            this.f21219f = true;
            mo52939j();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52939j() {
            int i;
            boolean z;
            boolean z2;
            if (this.f21220g.getAndIncrement() == 0) {
                C12860b<? super T> bVar = this.f21211b;
                AtomicReference<T> atomicReference = this.f21217d;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        z = false;
                        if (i == 0) {
                            break;
                        } else if (mo52931c()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z3 = this.f21219f;
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (andSet == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z3 && z2) {
                                Throwable th = this.f21218e;
                                if (th != null) {
                                    mo52930b(th);
                                    return;
                                } else {
                                    mo52929a();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                bVar.mo50773d(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (mo52931c()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.f21219f;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f21218e;
                            if (th2 != null) {
                                mo52930b(th2);
                                return;
                            } else {
                                mo52929a();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        C14109d.m32754d(this, j2);
                    }
                    i2 = this.f21220g.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: re.c$g */
    /* compiled from: FlowableCreate */
    static final class C13303g<T> extends C13298b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        C13303g(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: d */
        public void mo49191d(T t) {
            long j;
            if (!mo52931c()) {
                if (t != null) {
                    this.f21211b.mo50773d(t);
                    do {
                        j = get();
                        if (j == 0 || compareAndSet(j, j - 1)) {
                            return;
                        }
                        j = get();
                        return;
                    } while (compareAndSet(j, j - 1));
                    return;
                }
                mo52932e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: re.c$h */
    /* compiled from: FlowableCreate */
    static abstract class C13304h<T> extends C13298b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        C13304h(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: d */
        public final void mo49191d(T t) {
            if (!mo52931c()) {
                if (t == null) {
                    mo52932e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.f21211b.mo50773d(t);
                    C14109d.m32754d(this, 1);
                } else {
                    mo52938j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract void mo52938j();
    }

    public C13296c(C11951h<T> hVar, C11944a aVar) {
        this.f21208c = hVar;
        this.f21209d = aVar;
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        C13298b bVar2;
        int i = C13297a.f21210a[this.f21209d.ordinal()];
        if (i == 1) {
            bVar2 = new C13303g(bVar);
        } else if (i == 2) {
            bVar2 = new C13301e(bVar);
        } else if (i == 3) {
            bVar2 = new C13300d(bVar);
        } else if (i != 4) {
            bVar2 = new C13299c(bVar, C11949f.m25825b());
        } else {
            bVar2 = new C13302f(bVar);
        }
        bVar.mo49220e(bVar2);
        try {
            this.f21208c.mo29958a(bVar2);
        } catch (Throwable th) {
            C12620a.m28007b(th);
            bVar2.mo52932e(th);
        }
    }

    /* renamed from: re.c$b */
    /* compiled from: FlowableCreate */
    static abstract class C13298b<T> extends AtomicLong implements C11950g<T>, C12861c {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: b */
        final C12860b<? super T> f21211b;

        /* renamed from: c */
        final C12939e f21212c = new C12939e();

        C13298b(C12860b<? super T> bVar) {
            this.f21211b = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo52929a() {
            if (!mo52931c()) {
                try {
                    this.f21211b.mo50772b();
                } finally {
                    this.f21212c.dispose();
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo52930b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo52931c()) {
                return false;
            }
            try {
                this.f21211b.onError(th);
                this.f21212c.dispose();
                return true;
            } catch (Throwable th2) {
                this.f21212c.dispose();
                throw th2;
            }
        }

        /* renamed from: c */
        public final boolean mo52931c() {
            return this.f21212c.isDisposed();
        }

        public final void cancel() {
            this.f21212c.dispose();
            mo52934g();
        }

        /* renamed from: e */
        public final void mo52932e(Throwable th) {
            if (!mo52935i(th)) {
                C10885a.m23270q(th);
            }
        }

        /* renamed from: h */
        public final void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this, j);
                mo52933f();
            }
        }

        /* renamed from: i */
        public boolean mo52935i(Throwable th) {
            return mo52930b(th);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo52933f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo52934g() {
        }
    }

    /* renamed from: re.c$d */
    /* compiled from: FlowableCreate */
    static final class C13300d<T> extends C13304h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        C13300d(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo52938j() {
        }
    }
}
