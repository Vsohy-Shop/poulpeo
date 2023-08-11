package p423re;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p361ie.C12141b;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p376ke.C12657a;
import p386lg.C12859a;
import p386lg.C12860b;
import p386lg.C12861c;
import p403oe.C13070g;
import p403oe.C13073j;
import p447ve.C13639a;
import p465ye.C13925g;
import p471ze.C14109d;
import p471ze.C14115i;

/* renamed from: re.w */
/* compiled from: FlowablePublish */
public final class C13351w<T> extends C12657a<T> {

    /* renamed from: c */
    final C11949f<T> f21383c;

    /* renamed from: d */
    final AtomicReference<C13354c<T>> f21384d;

    /* renamed from: e */
    final int f21385e;

    /* renamed from: f */
    final C12859a<T> f21386f;

    /* renamed from: re.w$a */
    /* compiled from: FlowablePublish */
    static final class C13352a<T> implements C12859a<T> {

        /* renamed from: b */
        private final AtomicReference<C13354c<T>> f21387b;

        /* renamed from: c */
        private final int f21388c;

        C13352a(AtomicReference<C13354c<T>> atomicReference, int i) {
            this.f21387b = atomicReference;
            this.f21388c = i;
        }

        /* renamed from: a */
        public void mo49202a(C12860b<? super T> bVar) {
            C13354c<T> cVar;
            C13353b bVar2 = new C13353b(bVar);
            bVar.mo49220e(bVar2);
            while (true) {
                cVar = this.f21387b.get();
                if (cVar == null || cVar.isDisposed()) {
                    C13354c<T> cVar2 = new C13354c<>(this.f21387b, this.f21388c);
                    if (!C0344a.m496a(this.f21387b, cVar, cVar2)) {
                        continue;
                    } else {
                        cVar = cVar2;
                    }
                }
                if (cVar.mo52978a(bVar2)) {
                    break;
                }
            }
            if (bVar2.get() == Long.MIN_VALUE) {
                cVar.mo52981h(bVar2);
            } else {
                bVar2.f21390c = cVar;
            }
            cVar.mo52980g();
        }
    }

    /* renamed from: re.w$b */
    /* compiled from: FlowablePublish */
    static final class C13353b<T> extends AtomicLong implements C12861c {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: b */
        final C12860b<? super T> f21389b;

        /* renamed from: c */
        volatile C13354c<T> f21390c;

        /* renamed from: d */
        long f21391d;

        C13353b(C12860b<? super T> bVar) {
            this.f21389b = bVar;
        }

        public void cancel() {
            C13354c<T> cVar;
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (cVar = this.f21390c) != null) {
                cVar.mo52981h(this);
                cVar.mo52980g();
            }
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32752b(this, j);
                C13354c<T> cVar = this.f21390c;
                if (cVar != null) {
                    cVar.mo52980g();
                }
            }
        }
    }

    /* renamed from: re.w$c */
    /* compiled from: FlowablePublish */
    static final class C13354c<T> extends AtomicInteger implements C11952i<T>, C12141b {

        /* renamed from: j */
        static final C13353b[] f21392j = new C13353b[0];

        /* renamed from: k */
        static final C13353b[] f21393k = new C13353b[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* renamed from: b */
        final AtomicReference<C13354c<T>> f21394b;

        /* renamed from: c */
        final int f21395c;

        /* renamed from: d */
        final AtomicReference<C13353b<T>[]> f21396d = new AtomicReference<>(f21392j);

        /* renamed from: e */
        final AtomicBoolean f21397e;

        /* renamed from: f */
        final AtomicReference<C12861c> f21398f = new AtomicReference<>();

        /* renamed from: g */
        volatile Object f21399g;

        /* renamed from: h */
        int f21400h;

        /* renamed from: i */
        volatile C13073j<T> f21401i;

        C13354c(AtomicReference<C13354c<T>> atomicReference, int i) {
            this.f21394b = atomicReference;
            this.f21397e = new AtomicBoolean();
            this.f21395c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo52978a(C13353b<T> bVar) {
            C13353b[] bVarArr;
            C13353b[] bVarArr2;
            do {
                bVarArr = (C13353b[]) this.f21396d.get();
                if (bVarArr == f21393k) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new C13353b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!C0344a.m496a(this.f21396d, bVarArr, bVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (this.f21399g == null) {
                this.f21399g = C14115i.m32764b();
                mo52980g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo52979c(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!C14115i.m32768f(obj)) {
                    Throwable d = C14115i.m32766d(obj);
                    C0344a.m496a(this.f21394b, this, (Object) null);
                    C13353b[] bVarArr = (C13353b[]) this.f21396d.getAndSet(f21393k);
                    if (bVarArr.length != 0) {
                        int length = bVarArr.length;
                        while (i < length) {
                            bVarArr[i].f21389b.onError(d);
                            i++;
                        }
                    } else {
                        C10885a.m23270q(d);
                    }
                    return true;
                } else if (z) {
                    C0344a.m496a(this.f21394b, this, (Object) null);
                    C13353b[] bVarArr2 = (C13353b[]) this.f21396d.getAndSet(f21393k);
                    int length2 = bVarArr2.length;
                    while (i < length2) {
                        bVarArr2[i].f21389b.mo50772b();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (this.f21400h != 0 || this.f21401i.offer(t)) {
                mo52980g();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        public void dispose() {
            C13353b<T>[] bVarArr = this.f21396d.get();
            C13353b<T>[] bVarArr2 = f21393k;
            if (bVarArr != bVarArr2 && ((C13353b[]) this.f21396d.getAndSet(bVarArr2)) != bVarArr2) {
                C0344a.m496a(this.f21394b, this, (Object) null);
                C13925g.m32182a(this.f21398f);
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32187f(this.f21398f, cVar)) {
                if (cVar instanceof C13070g) {
                    C13070g gVar = (C13070g) cVar;
                    int g = gVar.mo50862g(3);
                    if (g == 1) {
                        this.f21400h = g;
                        this.f21401i = gVar;
                        this.f21399g = C14115i.m32764b();
                        mo52980g();
                        return;
                    } else if (g == 2) {
                        this.f21400h = g;
                        this.f21401i = gVar;
                        cVar.mo50776h((long) this.f21395c);
                        return;
                    }
                }
                this.f21401i = new C13639a(this.f21395c);
                cVar.mo50776h((long) this.f21395c);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
            if (r11 <= 0) goto L_0x013b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x012a, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x012d, code lost:
            if (r1.f21400h == 1) goto L_0x013c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x012f, code lost:
            r1.f21398f.get().mo50776h(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x013b, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0140, code lost:
            if (r14 == 0) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0142, code lost:
            if (r8 != false) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0014, code lost:
            continue;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo52980g() {
            /*
                r25 = this;
                r1 = r25
                int r0 = r25.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                java.util.concurrent.atomic.AtomicReference<re.w$b<T>[]> r2 = r1.f21396d
                java.lang.Object r0 = r2.get()
                re.w$b[] r0 = (p423re.C13351w.C13353b[]) r0
                r3 = 1
                r4 = r0
                r5 = r3
            L_0x0014:
                java.lang.Object r0 = r1.f21399g
                oe.j<T> r6 = r1.f21401i
                if (r6 == 0) goto L_0x0023
                boolean r8 = r6.isEmpty()
                if (r8 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r8 = 0
                goto L_0x0024
            L_0x0023:
                r8 = r3
            L_0x0024:
                boolean r0 = r1.mo52979c(r0, r8)
                if (r0 == 0) goto L_0x002b
                return
            L_0x002b:
                if (r8 != 0) goto L_0x0146
                int r0 = r4.length
                int r9 = r4.length
                r12 = 0
                r13 = 0
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0036:
                r16 = -9223372036854775808
                if (r12 >= r9) goto L_0x0052
                r7 = r4[r12]
                long r18 = r7.get()
                int r16 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r16 == 0) goto L_0x004d
                long r10 = r7.f21391d
                long r10 = r18 - r10
                long r14 = java.lang.Math.min(r14, r10)
                goto L_0x004f
            L_0x004d:
                int r13 = r13 + 1
            L_0x004f:
                int r12 = r12 + 1
                goto L_0x0036
            L_0x0052:
                r9 = 1
                if (r0 != r13) goto L_0x0090
                java.lang.Object r0 = r1.f21399g
                java.lang.Object r7 = r6.poll()     // Catch:{ all -> 0x005d }
                goto L_0x0074
            L_0x005d:
                r0 = move-exception
                r6 = r0
                p369je.C12620a.m28007b(r6)
                java.util.concurrent.atomic.AtomicReference<lg.c> r0 = r1.f21398f
                java.lang.Object r0 = r0.get()
                lg.c r0 = (p386lg.C12861c) r0
                r0.cancel()
                java.lang.Object r0 = p471ze.C14115i.m32765c(r6)
                r1.f21399g = r0
                r7 = 0
            L_0x0074:
                if (r7 != 0) goto L_0x0078
                r7 = r3
                goto L_0x0079
            L_0x0078:
                r7 = 0
            L_0x0079:
                boolean r0 = r1.mo52979c(r0, r7)
                if (r0 == 0) goto L_0x0080
                return
            L_0x0080:
                int r0 = r1.f21400h
                if (r0 == r3) goto L_0x0014
                java.util.concurrent.atomic.AtomicReference<lg.c> r0 = r1.f21398f
                java.lang.Object r0 = r0.get()
                lg.c r0 = (p386lg.C12861c) r0
                r0.mo50776h(r9)
                goto L_0x0014
            L_0x0090:
                r11 = 0
            L_0x0091:
                long r12 = (long) r11
                int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r0 >= 0) goto L_0x0128
                java.lang.Object r0 = r1.f21399g
                java.lang.Object r8 = r6.poll()     // Catch:{ all -> 0x009d }
                goto L_0x00b4
            L_0x009d:
                r0 = move-exception
                r8 = r0
                p369je.C12620a.m28007b(r8)
                java.util.concurrent.atomic.AtomicReference<lg.c> r0 = r1.f21398f
                java.lang.Object r0 = r0.get()
                lg.c r0 = (p386lg.C12861c) r0
                r0.cancel()
                java.lang.Object r0 = p471ze.C14115i.m32765c(r8)
                r1.f21399g = r0
                r8 = 0
            L_0x00b4:
                if (r8 != 0) goto L_0x00b8
                r7 = r3
                goto L_0x00b9
            L_0x00b8:
                r7 = 0
            L_0x00b9:
                boolean r0 = r1.mo52979c(r0, r7)
                if (r0 == 0) goto L_0x00c0
                return
            L_0x00c0:
                if (r7 == 0) goto L_0x00c5
                r8 = r7
                goto L_0x0128
            L_0x00c5:
                java.lang.Object r0 = p471ze.C14115i.m32767e(r8)
                int r8 = r4.length
                r12 = 0
                r13 = 0
            L_0x00cc:
                if (r12 >= r8) goto L_0x0107
                r3 = r4[r12]
                long r22 = r3.get()
                int r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
                if (r24 == 0) goto L_0x00f5
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r22 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
                if (r22 == 0) goto L_0x00eb
                r22 = r6
                r23 = r7
                long r6 = r3.f21391d
                long r6 = r6 + r9
                r3.f21391d = r6
                goto L_0x00ef
            L_0x00eb:
                r22 = r6
                r23 = r7
            L_0x00ef:
                lg.b<? super T> r3 = r3.f21389b
                r3.mo50773d(r0)
                goto L_0x00ff
            L_0x00f5:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r13 = 1
            L_0x00ff:
                int r12 = r12 + 1
                r6 = r22
                r7 = r23
                r3 = 1
                goto L_0x00cc
            L_0x0107:
                r22 = r6
                r23 = r7
                r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r11 = r11 + 1
                java.lang.Object r0 = r2.get()
                re.w$b[] r0 = (p423re.C13351w.C13353b[]) r0
                if (r13 != 0) goto L_0x0124
                if (r0 == r4) goto L_0x011d
                goto L_0x0124
            L_0x011d:
                r6 = r22
                r8 = r23
                r3 = 1
                goto L_0x0091
            L_0x0124:
                r4 = r0
                r3 = 1
                goto L_0x0014
            L_0x0128:
                if (r11 <= 0) goto L_0x013b
                int r0 = r1.f21400h
                r3 = 1
                if (r0 == r3) goto L_0x013c
                java.util.concurrent.atomic.AtomicReference<lg.c> r0 = r1.f21398f
                java.lang.Object r0 = r0.get()
                lg.c r0 = (p386lg.C12861c) r0
                r0.mo50776h(r12)
                goto L_0x013c
            L_0x013b:
                r3 = 1
            L_0x013c:
                r6 = 0
                int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x0146
                if (r8 != 0) goto L_0x0146
                goto L_0x0014
            L_0x0146:
                int r0 = -r5
                int r5 = r1.addAndGet(r0)
                if (r5 != 0) goto L_0x014e
                return
            L_0x014e:
                java.lang.Object r0 = r2.get()
                r4 = r0
                re.w$b[] r4 = (p423re.C13351w.C13353b[]) r4
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: p423re.C13351w.C13354c.mo52980g():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo52981h(C13353b<T> bVar) {
            C13353b[] bVarArr;
            C13353b[] bVarArr2;
            do {
                bVarArr = (C13353b[]) this.f21396d.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (bVarArr[i].equals(bVar)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f21392j;
                        } else {
                            C13353b[] bVarArr3 = new C13353b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                            bVarArr2 = bVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!C0344a.m496a(this.f21396d, bVarArr, bVarArr2));
        }

        public boolean isDisposed() {
            if (this.f21396d.get() == f21393k) {
                return true;
            }
            return false;
        }

        public void onError(Throwable th) {
            if (this.f21399g == null) {
                this.f21399g = C14115i.m32765c(th);
                mo52980g();
                return;
            }
            C10885a.m23270q(th);
        }
    }

    private C13351w(C12859a<T> aVar, C11949f<T> fVar, AtomicReference<C13354c<T>> atomicReference, int i) {
        this.f21386f = aVar;
        this.f21383c = fVar;
        this.f21384d = atomicReference;
        this.f21385e = i;
    }

    /* renamed from: M */
    public static <T> C12657a<T> m30369M(C11949f<T> fVar, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return C10885a.m23268o(new C13351w(new C13352a(atomicReference, i), fVar, atomicReference, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21386f.mo49202a(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50403L(p384le.C12853d<? super p361ie.C12141b> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<re.w$c<T>> r0 = r4.f21384d
            java.lang.Object r0 = r0.get()
            re.w$c r0 = (p423re.C13351w.C13354c) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0023
        L_0x0010:
            re.w$c r1 = new re.w$c
            java.util.concurrent.atomic.AtomicReference<re.w$c<T>> r2 = r4.f21384d
            int r3 = r4.f21385e
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference<re.w$c<T>> r2 = r4.f21384d
            boolean r0 = androidx.compose.animation.core.C0344a.m496a(r2, r0, r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0000
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f21397e
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f21397e
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0036
            r2 = r3
        L_0x0036:
            r5.accept(r0)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0040
            fe.f<T> r5 = r4.f21383c
            r5.mo49199H(r0)
        L_0x0040:
            return
        L_0x0041:
            r5 = move-exception
            p369je.C12620a.m28007b(r5)
            java.lang.RuntimeException r5 = p471ze.C14112g.m32759d(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p423re.C13351w.mo50403L(le.d):void");
    }
}
