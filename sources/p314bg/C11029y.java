package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p320cg.C11060a;
import p320cg.C11061b;
import p320cg.C11062c;
import p320cg.C11077k;
import p331dg.C11828g0;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13943d1;
import p466yf.C14010o;
import p466yf.C14018q;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
/* renamed from: bg.y */
/* compiled from: SharedFlow.kt */
public class C11029y<T> extends C11060a<C10949a0> implements C11024t<T>, C10962f, C11077k<T> {

    /* renamed from: f */
    private final int f17063f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f17064g;

    /* renamed from: h */
    private final C10886a f17065h;

    /* renamed from: i */
    private Object[] f17066i;

    /* renamed from: j */
    private long f17067j;

    /* renamed from: k */
    private long f17068k;

    /* renamed from: l */
    private int f17069l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f17070m;

    /* renamed from: bg.y$a */
    /* compiled from: SharedFlow.kt */
    private static final class C11030a implements C13943d1 {

        /* renamed from: b */
        public final C11029y<?> f17071b;

        /* renamed from: c */
        public long f17072c;

        /* renamed from: d */
        public final Object f17073d;

        /* renamed from: e */
        public final C12074d<C11921v> f17074e;

        public C11030a(C11029y<?> yVar, long j, Object obj, C12074d<? super C11921v> dVar) {
            this.f17071b = yVar;
            this.f17072c = j;
            this.f17073d = obj;
            this.f17074e = dVar;
        }

        public void dispose() {
            this.f17071b.m23709y(this);
        }
    }

    /* renamed from: bg.y$b */
    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class C11031b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17075a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ag.a[] r0 = p308ag.C10886a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ag.a r1 = p308ag.C10886a.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ag.a r1 = p308ag.C10886a.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ag.a r1 = p308ag.C10886a.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f17075a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C11029y.C11031b.<clinit>():void");
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.SharedFlowImpl", mo50610f = "SharedFlow.kt", mo50611l = {372, 379, 382}, mo50612m = "collect$suspendImpl")
    /* renamed from: bg.y$c */
    /* compiled from: SharedFlow.kt */
    static final class C11032c<T> extends C12737d {

        /* renamed from: h */
        Object f17076h;

        /* renamed from: i */
        Object f17077i;

        /* renamed from: j */
        Object f17078j;

        /* renamed from: k */
        Object f17079k;

        /* renamed from: l */
        /* synthetic */ Object f17080l;

        /* renamed from: m */
        final /* synthetic */ C11029y<T> f17081m;

        /* renamed from: n */
        int f17082n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11032c(C11029y<T> yVar, C12074d<? super C11032c> dVar) {
            super(dVar);
            this.f17081m = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17080l = obj;
            this.f17082n |= Integer.MIN_VALUE;
            return C11029y.m23679A(this.f17081m, (C10967g) null, this);
        }
    }

    public C11029y(int i, int i2, C10886a aVar) {
        this.f17063f = i;
        this.f17064g = i2;
        this.f17065h = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: bg.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <T> java.lang.Object m23679A(p314bg.C11029y<T> r8, p314bg.C10967g<? super T> r9, p355hf.C12074d<?> r10) {
        /*
            boolean r0 = r10 instanceof p314bg.C11029y.C11032c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            bg.y$c r0 = (p314bg.C11029y.C11032c) r0
            int r1 = r0.f17082n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17082n = r1
            goto L_0x0018
        L_0x0013:
            bg.y$c r0 = new bg.y$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f17080l
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f17082n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.f17079k
            yf.y1 r8 = (p466yf.C14054y1) r8
            java.lang.Object r9 = r0.f17078j
            bg.a0 r9 = (p314bg.C10949a0) r9
            java.lang.Object r2 = r0.f17077i
            bg.g r2 = (p314bg.C10967g) r2
            java.lang.Object r5 = r0.f17076h
            bg.y r5 = (p314bg.C11029y) r5
            goto L_0x0054
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.f17079k
            yf.y1 r8 = (p466yf.C14054y1) r8
            java.lang.Object r9 = r0.f17078j
            bg.a0 r9 = (p314bg.C10949a0) r9
            java.lang.Object r2 = r0.f17077i
            bg.g r2 = (p314bg.C10967g) r2
            java.lang.Object r5 = r0.f17076h
            bg.y r5 = (p314bg.C11029y) r5
        L_0x0054:
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x005b:
            r8 = move-exception
            goto L_0x00da
        L_0x005e:
            java.lang.Object r8 = r0.f17078j
            r9 = r8
            bg.a0 r9 = (p314bg.C10949a0) r9
            java.lang.Object r8 = r0.f17077i
            bg.g r8 = (p314bg.C10967g) r8
            java.lang.Object r2 = r0.f17076h
            bg.y r2 = (p314bg.C11029y) r2
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00da
        L_0x0075:
            p336ef.C11910n.m25701b(r10)
            cg.c r10 = r8.mo46154h()
            bg.a0 r10 = (p314bg.C10949a0) r10
            boolean r2 = r9 instanceof p314bg.C10984l0     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            bg.l0 r2 = (p314bg.C10984l0) r2     // Catch:{ all -> 0x00d6 }
            r0.f17076h = r8     // Catch:{ all -> 0x00d6 }
            r0.f17077i = r9     // Catch:{ all -> 0x00d6 }
            r0.f17078j = r10     // Catch:{ all -> 0x00d6 }
            r0.f17082n = r5     // Catch:{ all -> 0x00d6 }
            java.lang.Object r2 = r2.mo46053a(r0)     // Catch:{ all -> 0x00d6 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            hf.g r2 = r0.getContext()     // Catch:{ all -> 0x00d2 }
            yf.y1$b r5 = p466yf.C14054y1.f22970b0     // Catch:{ all -> 0x00d2 }
            hf.g$b r2 = r2.get(r5)     // Catch:{ all -> 0x00d2 }
            yf.y1 r2 = (p466yf.C14054y1) r2     // Catch:{ all -> 0x00d2 }
        L_0x00a3:
            java.lang.Object r5 = r8.m23696U(r9)     // Catch:{ all -> 0x00d2 }
            dg.g0 r6 = p314bg.C11033z.f17083a     // Catch:{ all -> 0x00d2 }
            if (r5 != r6) goto L_0x00bc
            r0.f17076h = r8     // Catch:{ all -> 0x00d2 }
            r0.f17077i = r10     // Catch:{ all -> 0x00d2 }
            r0.f17078j = r9     // Catch:{ all -> 0x00d2 }
            r0.f17079k = r2     // Catch:{ all -> 0x00d2 }
            r0.f17082n = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r8.m23708x(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            p466yf.C13934b2.m32225m(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00c1:
            r0.f17076h = r8     // Catch:{ all -> 0x00d2 }
            r0.f17077i = r10     // Catch:{ all -> 0x00d2 }
            r0.f17078j = r9     // Catch:{ all -> 0x00d2 }
            r0.f17079k = r2     // Catch:{ all -> 0x00d2 }
            r0.f17082n = r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00da:
            r5.mo46155k(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C11029y.m23679A(bg.y, bg.g, hf.d):java.lang.Object");
    }

    /* renamed from: B */
    private final void m23680B(long j) {
        C11062c[] f;
        if (!(this.f17161c == 0 || (f = this.f17160b) == null)) {
            for (C11062c cVar : f) {
                if (cVar != null) {
                    C10949a0 a0Var = (C10949a0) cVar;
                    long j2 = a0Var.f16890a;
                    if (j2 >= 0 && j2 < j) {
                        a0Var.f16890a = j;
                    }
                }
            }
        }
        this.f17068k = j;
    }

    /* renamed from: E */
    private final void m23681E() {
        Object[] objArr = this.f17066i;
        C12775o.m28636f(objArr);
        C11033z.m23727g(objArr, m23687K(), (Object) null);
        this.f17069l--;
        long K = m23687K() + 1;
        if (this.f17067j < K) {
            this.f17067j = K;
        }
        if (this.f17068k < K) {
            m23680B(K);
        }
    }

    /* renamed from: F */
    static /* synthetic */ <T> Object m23682F(C11029y<T> yVar, T t, C12074d<? super C11921v> dVar) {
        if (yVar.mo46041e(t)) {
            return C11921v.f18618a;
        }
        Object G = yVar.m23683G(t, dVar);
        if (G == C12150d.m26492c()) {
            return G;
        }
        return C11921v.f18618a;
    }

    /* renamed from: G */
    private final Object m23683G(T t, C12074d<? super C11921v> dVar) {
        C12074d<C11921v>[] dVarArr;
        C11030a aVar;
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        C12074d<C11921v>[] dVarArr2 = C11061b.f17164a;
        synchronized (this) {
            if (m23693R(t)) {
                C11907m.C11908a aVar2 = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
                dVarArr = m23685I(dVarArr2);
                aVar = null;
            } else {
                C11030a aVar3 = new C11030a(this, ((long) m23691P()) + m23687K(), t, oVar);
                m23684H(aVar3);
                this.f17070m = this.f17070m + 1;
                if (this.f17064g == 0) {
                    dVarArr2 = m23685I(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C14018q.m32524a(oVar, aVar);
        }
        for (C12074d<C11921v> dVar2 : dVarArr) {
            if (dVar2 != null) {
                C11907m.C11908a aVar4 = C11907m.f18600b;
                dVar2.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m23684H(Object obj) {
        int P = m23691P();
        Object[] objArr = this.f17066i;
        if (objArr == null) {
            objArr = m23692Q((Object[]) null, 0, 2);
        } else if (P >= objArr.length) {
            objArr = m23692Q(objArr, P, objArr.length * 2);
        }
        C11033z.m23727g(objArr, m23687K() + ((long) P), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (p314bg.C10949a0) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p355hf.C12074d<p336ef.C11921v>[] m23685I(p355hf.C12074d<p336ef.C11921v>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f17161c
            if (r1 == 0) goto L_0x0047
            cg.c[] r1 = r10.f17160b
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            bg.a0 r4 = (p314bg.C10949a0) r4
            hf.d<? super ef.v> r5 = r4.f16891b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.m23695T(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C12775o.m28638h(r11, r6)
        L_0x0039:
            r6 = r11
            hf.d[] r6 = (p355hf.C12074d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f16891b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            hf.d[] r11 = (p355hf.C12074d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C11029y.m23685I(hf.d[]):hf.d[]");
    }

    /* renamed from: J */
    private final long m23686J() {
        return m23687K() + ((long) this.f17069l);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final long m23687K() {
        return Math.min(this.f17068k, this.f17067j);
    }

    /* renamed from: M */
    private final Object m23688M(long j) {
        Object[] objArr = this.f17066i;
        C12775o.m28636f(objArr);
        Object c = C11033z.m23726f(objArr, j);
        if (c instanceof C11030a) {
            return ((C11030a) c).f17073d;
        }
        return c;
    }

    /* renamed from: N */
    private final long m23689N() {
        return m23687K() + ((long) this.f17069l) + ((long) this.f17070m);
    }

    /* renamed from: O */
    private final int m23690O() {
        return (int) ((m23687K() + ((long) this.f17069l)) - this.f17067j);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final int m23691P() {
        return this.f17069l + this.f17070m;
    }

    /* renamed from: Q */
    private final Object[] m23692Q(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f17066i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K = m23687K();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + K;
                C11033z.m23727g(objArr2, j, C11033z.m23726f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final boolean m23693R(T t) {
        if (mo46156l() == 0) {
            return m23694S(t);
        }
        if (this.f17069l >= this.f17064g && this.f17068k <= this.f17067j) {
            int i = C11031b.f17075a[this.f17065h.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m23684H(t);
        int i2 = this.f17069l + 1;
        this.f17069l = i2;
        if (i2 > this.f17064g) {
            m23681E();
        }
        if (m23690O() > this.f17063f) {
            m23697V(this.f17067j + 1, this.f17068k, m23686J(), m23689N());
        }
        return true;
    }

    /* renamed from: S */
    private final boolean m23694S(T t) {
        if (this.f17063f == 0) {
            return true;
        }
        m23684H(t);
        int i = this.f17069l + 1;
        this.f17069l = i;
        if (i > this.f17063f) {
            m23681E();
        }
        this.f17068k = m23687K() + ((long) this.f17069l);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final long m23695T(C10949a0 a0Var) {
        long j = a0Var.f16890a;
        if (j < m23686J()) {
            return j;
        }
        if (this.f17064g <= 0 && j <= m23687K() && this.f17070m != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: U */
    private final Object m23696U(C10949a0 a0Var) {
        Object obj;
        C12074d<C11921v>[] dVarArr = C11061b.f17164a;
        synchronized (this) {
            long T = m23695T(a0Var);
            if (T < 0) {
                obj = C11033z.f17083a;
            } else {
                long j = a0Var.f16890a;
                Object M = m23688M(T);
                a0Var.f16890a = T + 1;
                Object obj2 = M;
                dVarArr = mo46063W(j);
                obj = obj2;
            }
        }
        for (C12074d<C11921v> dVar : dVarArr) {
            if (dVar != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
        }
        return obj;
    }

    /* renamed from: V */
    private final void m23697V(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long K = m23687K(); K < min; K++) {
            Object[] objArr = this.f17066i;
            C12775o.m28636f(objArr);
            C11033z.m23727g(objArr, K, (Object) null);
        }
        this.f17067j = j;
        this.f17068k = j2;
        this.f17069l = (int) (j3 - min);
        this.f17070m = (int) (j4 - j3);
    }

    /* renamed from: x */
    private final Object m23708x(C10949a0 a0Var, C12074d<? super C11921v> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        synchronized (this) {
            if (m23695T(a0Var) < 0) {
                a0Var.f16891b = oVar;
            } else {
                C11907m.C11908a aVar = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
            C11921v vVar = C11921v.f18618a;
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m23709y(C11030a aVar) {
        synchronized (this) {
            if (aVar.f17072c >= m23687K()) {
                Object[] objArr = this.f17066i;
                C12775o.m28636f(objArr);
                if (C11033z.m23726f(objArr, aVar.f17072c) == aVar) {
                    C11033z.m23727g(objArr, aVar.f17072c, C11033z.f17083a);
                    m23710z();
                    C11921v vVar = C11921v.f18618a;
                }
            }
        }
    }

    /* renamed from: z */
    private final void m23710z() {
        if (this.f17064g != 0 || this.f17070m > 1) {
            Object[] objArr = this.f17066i;
            C12775o.m28636f(objArr);
            while (this.f17070m > 0 && C11033z.m23726f(objArr, (m23687K() + ((long) m23691P())) - 1) == C11033z.f17083a) {
                this.f17070m--;
                C11033z.m23727g(objArr, m23687K() + ((long) m23691P()), (Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C10949a0 mo46042i() {
        return new C10949a0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C10949a0[] mo46043j(int i) {
        return new C10949a0[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final T mo46062L() {
        Object[] objArr = this.f17066i;
        C12775o.m28636f(objArr);
        return C11033z.m23726f(objArr, (this.f17067j + ((long) m23690O())) - 1);
    }

    /* renamed from: W */
    public final C12074d<C11921v>[] mo46063W(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        C11062c[] f;
        if (j > this.f17068k) {
            return C11061b.f17164a;
        }
        long K = m23687K();
        long j6 = ((long) this.f17069l) + K;
        if (this.f17064g == 0 && this.f17070m > 0) {
            j6++;
        }
        if (!(this.f17161c == 0 || (f = this.f17160b) == null)) {
            for (C11062c cVar : f) {
                if (cVar != null) {
                    long j7 = ((C10949a0) cVar).f16890a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f17068k) {
            return C11061b.f17164a;
        }
        long J = m23686J();
        if (mo46156l() > 0) {
            i = Math.min(this.f17070m, this.f17064g - ((int) (J - j6)));
        } else {
            i = this.f17070m;
        }
        C12074d<C11921v>[] dVarArr = C11061b.f17164a;
        long j8 = ((long) this.f17070m) + J;
        if (i > 0) {
            dVarArr = new C12074d[i];
            Object[] objArr = this.f17066i;
            C12775o.m28636f(objArr);
            long j9 = J;
            int i2 = 0;
            while (true) {
                if (J >= j8) {
                    j3 = j6;
                    j2 = j8;
                    break;
                }
                Object c = C11033z.m23726f(objArr, J);
                j3 = j6;
                C11828g0 g0Var = C11033z.f17083a;
                if (c != g0Var) {
                    C12775o.m28637g(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C11030a aVar = (C11030a) c;
                    int i3 = i2 + 1;
                    j2 = j8;
                    dVarArr[i2] = aVar.f17074e;
                    C11033z.m23727g(objArr, J, g0Var);
                    C11033z.m23727g(objArr, j9, aVar.f17073d);
                    j5 = 1;
                    j9++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j2 = j8;
                    j5 = 1;
                }
                J += j5;
                j6 = j3;
                j8 = j2;
            }
            J = j9;
        } else {
            j3 = j6;
            j2 = j8;
        }
        int i4 = (int) (J - K);
        if (mo46156l() == 0) {
            j4 = J;
        } else {
            j4 = j3;
        }
        long max = Math.max(this.f17067j, J - ((long) Math.min(this.f17063f, i4)));
        if (this.f17064g == 0 && max < j2) {
            Object[] objArr2 = this.f17066i;
            C12775o.m28636f(objArr2);
            if (C12775o.m28634d(C11033z.m23726f(objArr2, max), C11033z.f17083a)) {
                J++;
                max++;
            }
        }
        m23697V(max, j4, J, j2);
        m23710z();
        if (dVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m23685I(dVarArr);
        }
        return dVarArr;
    }

    /* renamed from: X */
    public final long mo46064X() {
        long j = this.f17067j;
        if (j < this.f17068k) {
            this.f17068k = j;
        }
        return j;
    }

    /* renamed from: a */
    public C10962f<T> mo46038a(C12079g gVar, int i, C10886a aVar) {
        return C11033z.m23725e(this, gVar, i, aVar);
    }

    public Object collect(C10967g<? super T> gVar, C12074d<?> dVar) {
        return m23679A(this, gVar, dVar);
    }

    /* renamed from: d */
    public void mo46040d() {
        synchronized (this) {
            m23697V(m23686J(), this.f17068k, m23686J(), m23689N());
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* renamed from: e */
    public boolean mo46041e(T t) {
        int i;
        boolean z;
        C12074d<C11921v>[] dVarArr = C11061b.f17164a;
        synchronized (this) {
            if (m23693R(t)) {
                dVarArr = m23685I(dVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (C12074d<C11921v> dVar : dVarArr) {
            if (dVar != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
        }
        return z;
    }

    public Object emit(T t, C12074d<? super C11921v> dVar) {
        return m23682F(this, t, dVar);
    }
}
