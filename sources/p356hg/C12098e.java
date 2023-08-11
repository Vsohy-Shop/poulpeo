package p356hg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p349gg.C12027b;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13945d3;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14018q;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
/* renamed from: hg.e */
/* compiled from: Semaphore.kt */
public class C12098e implements C12097d {

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f18934c;

    /* renamed from: d */
    private static final AtomicLongFieldUpdater f18935d;

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f18936e;

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f18937f;

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f18938g;
    private volatile int _availablePermits;

    /* renamed from: a */
    private final int f18939a;

    /* renamed from: b */
    private final Function1<Throwable, C11921v> f18940b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* renamed from: hg.e$a */
    /* compiled from: Semaphore.kt */
    /* synthetic */ class C12099a extends C12771l implements C13088o<Long, C12103g, C12103g> {

        /* renamed from: b */
        public static final C12099a f18941b = new C12099a();

        C12099a() {
            super(2, C12102f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: b */
        public final C12103g mo49541b(long j, C12103g gVar) {
            return C12102f.m26324j(j, gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo49541b(((Number) obj).longValue(), (C12103g) obj2);
        }
    }

    /* renamed from: hg.e$b */
    /* compiled from: Semaphore.kt */
    static final class C12100b extends C12777p implements Function1<Throwable, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12098e f18942g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12100b(C12098e eVar) {
            super(1);
            this.f18942g = eVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Throwable th) {
            this.f18942g.release();
        }
    }

    /* renamed from: hg.e$c */
    /* compiled from: Semaphore.kt */
    /* synthetic */ class C12101c extends C12771l implements C13088o<Long, C12103g, C12103g> {

        /* renamed from: b */
        public static final C12101c f18943b = new C12101c();

        C12101c() {
            super(2, C12102f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: b */
        public final C12103g mo49543b(long j, C12103g gVar) {
            return C12102f.m26324j(j, gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo49543b(((Number) obj).longValue(), (C12103g) obj2);
        }
    }

    static {
        Class<C12098e> cls = C12098e.class;
        Class<Object> cls2 = Object.class;
        f18934c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f18935d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        f18936e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        f18937f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        f18938g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public C12098e(int i, int i2) {
        boolean z;
        this.f18939a = i;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i2 < 0 || i2 > i) ? false : z2) {
                C12103g gVar = new C12103g(0, (C12103g) null, 2);
                this.head = gVar;
                this.tail = gVar;
                this._availablePermits = i - i2;
                this.f18940b = new C12100b(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    /* renamed from: j */
    static /* synthetic */ Object m26302j(C12098e eVar, C12074d<? super C11921v> dVar) {
        if (eVar.m26306n() > 0) {
            return C11921v.f18618a;
        }
        Object k = eVar.m26303k(dVar);
        if (k == C12150d.m26492c()) {
            return k;
        }
        return C11921v.f18618a;
    }

    /* renamed from: k */
    private final Object m26303k(C12074d<? super C11921v> dVar) {
        C14010o b = C14018q.m32525b(C12147c.m26491b(dVar));
        try {
            if (!m26304l(b)) {
                mo49540i(b);
            }
            Object y = b.mo53797y();
            if (y == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
            if (y == C12150d.m26492c()) {
                return y;
            }
            return C11921v.f18618a;
        } catch (Throwable th) {
            b.mo53789K();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r10 = true;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m26304l(p466yf.C13945d3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f18936e
            java.lang.Object r3 = r2.get(r0)
            hg.g r3 = (p356hg.C12103g) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f18937f
            long r4 = r4.getAndIncrement(r0)
            hg.e$a r6 = p356hg.C12098e.C12099a.f18941b
            int r7 = p356hg.C12102f.f18949f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x001b:
            java.lang.Object r9 = p331dg.C11821d.m25434c(r3, r7, r6)
            boolean r10 = p331dg.C11824e0.m25455c(r9)
            if (r10 != 0) goto L_0x005e
            dg.d0 r10 = p331dg.C11824e0.m25454b(r9)
        L_0x0029:
            java.lang.Object r13 = r2.get(r0)
            dg.d0 r13 = (p331dg.C11822d0) r13
            long r14 = r13.f18467d
            long r11 = r10.f18467d
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0039
        L_0x0037:
            r10 = 1
            goto L_0x0051
        L_0x0039:
            boolean r11 = r10.mo48986q()
            if (r11 != 0) goto L_0x0041
            r10 = 0
            goto L_0x0051
        L_0x0041:
            boolean r11 = androidx.concurrent.futures.C1248a.m719a(r2, r0, r13, r10)
            if (r11 == 0) goto L_0x0054
            boolean r10 = r13.mo48984m()
            if (r10 == 0) goto L_0x0037
            r13.mo48992k()
            goto L_0x0037
        L_0x0051:
            if (r10 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0054:
            boolean r11 = r10.mo48984m()
            if (r11 == 0) goto L_0x0029
            r10.mo48992k()
            goto L_0x0029
        L_0x005e:
            dg.d0 r2 = p331dg.C11824e0.m25454b(r9)
            hg.g r2 = (p356hg.C12103g) r2
            int r3 = p356hg.C12102f.f18949f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.mo49544r()
            r5 = 0
            boolean r4 = p308ag.C10903i.m23434a(r4, r3, r5, r1)
            if (r4 == 0) goto L_0x007b
            r1.mo45900b(r2, r3)
            r1 = 1
            return r1
        L_0x007b:
            dg.g0 r4 = p356hg.C12102f.f18945b
            dg.g0 r5 = p356hg.C12102f.f18946c
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.mo49544r()
            boolean r2 = p308ag.C10903i.m23434a(r2, r3, r4, r5)
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r1 instanceof p466yf.C14002n
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.C12775o.m28637g(r1, r2)
            yf.n r1 = (p466yf.C14002n) r1
            ef.v r2 = p336ef.C11921v.f18618a
            kotlin.jvm.functions.Function1<java.lang.Throwable, ef.v> r3 = r0.f18940b
            r1.mo49529i(r2, r3)
        L_0x009f:
            r1 = 1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1 instanceof p349gg.C12027b
            if (r2 == 0) goto L_0x00ae
            gg.b r1 = (p349gg.C12027b) r1
            ef.v r2 = p336ef.C11921v.f18618a
            r1.mo49454c(r2)
            goto L_0x009f
        L_0x00ad:
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p356hg.C12098e.m26304l(yf.d3):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: m */
    private final void m26305m() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f18938g
            int r1 = r0.get(r3)
            int r2 = r3.f18939a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p356hg.C12098e.m26305m():void");
    }

    /* renamed from: n */
    private final int m26306n() {
        int andDecrement;
        do {
            andDecrement = f18938g.getAndDecrement(this);
        } while (andDecrement > this.f18939a);
        return andDecrement;
    }

    /* renamed from: o */
    private final boolean m26307o(Object obj) {
        if (obj instanceof C14002n) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C14002n nVar = (C14002n) obj;
            Object h = nVar.mo49528h(C11921v.f18618a, (Object) null, this.f18940b);
            if (h == null) {
                return false;
            }
            nVar.mo49531o(h);
            return true;
        } else if (obj instanceof C12027b) {
            return ((C12027b) obj).mo49453a(this, C11921v.f18618a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r9 = true;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m26308p() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f18934c
            java.lang.Object r2 = r1.get(r15)
            hg.g r2 = (p356hg.C12103g) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f18935d
            long r3 = r3.getAndIncrement(r15)
            int r5 = p356hg.C12102f.f18949f
            long r5 = (long) r5
            long r5 = r3 / r5
            hg.e$c r7 = p356hg.C12098e.C12101c.f18943b
        L_0x0018:
            java.lang.Object r8 = p331dg.C11821d.m25434c(r2, r5, r7)
            boolean r9 = p331dg.C11824e0.m25455c(r8)
            if (r9 != 0) goto L_0x005b
            dg.d0 r9 = p331dg.C11824e0.m25454b(r8)
        L_0x0026:
            java.lang.Object r12 = r1.get(r15)
            dg.d0 r12 = (p331dg.C11822d0) r12
            long r13 = r12.f18467d
            long r10 = r9.f18467d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0036
        L_0x0034:
            r9 = 1
            goto L_0x004e
        L_0x0036:
            boolean r10 = r9.mo48986q()
            if (r10 != 0) goto L_0x003e
            r9 = 0
            goto L_0x004e
        L_0x003e:
            boolean r10 = androidx.concurrent.futures.C1248a.m719a(r1, r15, r12, r9)
            if (r10 == 0) goto L_0x0051
            boolean r9 = r12.mo48984m()
            if (r9 == 0) goto L_0x0034
            r12.mo48992k()
            goto L_0x0034
        L_0x004e:
            if (r9 == 0) goto L_0x0018
            goto L_0x005b
        L_0x0051:
            boolean r10 = r9.mo48984m()
            if (r10 == 0) goto L_0x0026
            r9.mo48992k()
            goto L_0x0026
        L_0x005b:
            dg.d0 r1 = p331dg.C11824e0.m25454b(r8)
            hg.g r1 = (p356hg.C12103g) r1
            r1.mo48987b()
            long r7 = r1.f18467d
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            r2 = 0
            return r2
        L_0x006c:
            int r2 = p356hg.C12102f.f18949f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            dg.g0 r3 = p356hg.C12102f.f18945b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.mo49544r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto L_0x00af
            int r3 = p356hg.C12102f.f18944a
            r10 = 0
        L_0x0086:
            if (r10 >= r3) goto L_0x009c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.mo49544r()
            java.lang.Object r4 = r4.get(r2)
            dg.g0 r5 = p356hg.C12102f.f18946c
            if (r4 != r5) goto L_0x0098
            r4 = 1
            return r4
        L_0x0098:
            r4 = 1
            int r10 = r10 + 1
            goto L_0x0086
        L_0x009c:
            r4 = 1
            dg.g0 r3 = p356hg.C12102f.f18945b
            dg.g0 r5 = p356hg.C12102f.f18947d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.mo49544r()
            boolean r1 = p308ag.C10903i.m23434a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        L_0x00af:
            dg.g0 r1 = p356hg.C12102f.f18948e
            if (r3 != r1) goto L_0x00b7
            r1 = 0
            return r1
        L_0x00b7:
            boolean r1 = r15.m26307o(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p356hg.C12098e.m26308p():boolean");
    }

    /* renamed from: b */
    public int mo49536b() {
        return Math.max(f18938g.get(this), 0);
    }

    /* renamed from: c */
    public Object mo49537c(C12074d<? super C11921v> dVar) {
        return m26302j(this, dVar);
    }

    /* renamed from: g */
    public boolean mo49538g() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18938g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.f18939a) {
                m26305m();
            } else if (i <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo49540i(C14002n<? super C11921v> nVar) {
        while (m26306n() <= 0) {
            C12775o.m28637g(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m26304l((C13945d3) nVar)) {
                return;
            }
        }
        nVar.mo49529i(C11921v.f18618a, this.f18940b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f18938g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f18939a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.m26308p()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.m26305m()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f18939a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p356hg.C12098e.release():void");
    }
}
