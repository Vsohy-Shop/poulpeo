package p314bg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p320cg.C11060a;
import p320cg.C11077k;
import p320cg.C11081n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
/* renamed from: bg.i0 */
/* compiled from: StateFlow.kt */
final class C10975i0<T> extends C11060a<C10982k0> implements C11025u<T>, C10962f, C11077k<T> {

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f16937g = AtomicReferenceFieldUpdater.newUpdater(C10975i0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: f */
    private int f16938f;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.StateFlowImpl", mo50610f = "StateFlow.kt", mo50611l = {384, 396, 401}, mo50612m = "collect")
    /* renamed from: bg.i0$a */
    /* compiled from: StateFlow.kt */
    static final class C10976a extends C12737d {

        /* renamed from: h */
        Object f16939h;

        /* renamed from: i */
        Object f16940i;

        /* renamed from: j */
        Object f16941j;

        /* renamed from: k */
        Object f16942k;

        /* renamed from: l */
        Object f16943l;

        /* renamed from: m */
        /* synthetic */ Object f16944m;

        /* renamed from: n */
        final /* synthetic */ C10975i0<T> f16945n;

        /* renamed from: o */
        int f16946o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10976a(C10975i0<T> i0Var, C12074d<? super C10976a> dVar) {
            super(dVar);
            this.f16945n = i0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16944m = obj;
            this.f16946o |= Integer.MIN_VALUE;
            return this.f16945n.collect((C10967g) null, this);
        }
    }

    public C10975i0(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r8 = (p314bg.C10982k0[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r8 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r3 >= r0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r4.mo46051g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f16938f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r6.f16938f = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = mo46157m();
        r0 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m23621p(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f16937g     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r7 == 0) goto L_0x0012
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r1, r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0012
            monitor-exit(r6)
            return r2
        L_0x0012:
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r1, r8)     // Catch:{ all -> 0x005e }
            r1 = 1
            if (r7 == 0) goto L_0x001b
            monitor-exit(r6)
            return r1
        L_0x001b:
            r0.set(r6, r8)     // Catch:{ all -> 0x005e }
            int r7 = r6.f16938f     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r1
            r6.f16938f = r7     // Catch:{ all -> 0x005e }
            cg.c[] r8 = r6.mo46157m()     // Catch:{ all -> 0x005e }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002e:
            bg.k0[] r8 = (p314bg.C10982k0[]) r8
            if (r8 == 0) goto L_0x0040
            int r0 = r8.length
            r3 = r2
        L_0x0034:
            if (r3 >= r0) goto L_0x0040
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003d
            r4.mo46051g()
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f16938f     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r1
            r6.f16938f = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r1
        L_0x004a:
            cg.c[] r7 = r6.mo46157m()     // Catch:{ all -> 0x0055 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002e
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f16938f = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r1
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10975i0.m23621p(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public C10962f<T> mo46038a(C12079g gVar, int i, C10886a aVar) {
        return C10979j0.m23636d(this, gVar, i, aVar);
    }

    /* renamed from: b */
    public boolean mo46039b(T t, T t2) {
        if (t == null) {
            t = C11081n.f17203a;
        }
        if (t2 == null) {
            t2 = C11081n.f17203a;
        }
        return m23621p(t, t2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: bg.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: bg.i0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2 A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(p314bg.C10967g<? super T> r11, p355hf.C12074d<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p314bg.C10975i0.C10976a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            bg.i0$a r0 = (p314bg.C10975i0.C10976a) r0
            int r1 = r0.f16946o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16946o = r1
            goto L_0x0018
        L_0x0013:
            bg.i0$a r0 = new bg.i0$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f16944m
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16946o
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.f16943l
            java.lang.Object r2 = r0.f16942k
            yf.y1 r2 = (p466yf.C14054y1) r2
            java.lang.Object r6 = r0.f16941j
            bg.k0 r6 = (p314bg.C10982k0) r6
            java.lang.Object r7 = r0.f16940i
            bg.g r7 = (p314bg.C10967g) r7
            java.lang.Object r8 = r0.f16939h
            bg.i0 r8 = (p314bg.C10975i0) r8
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.f16943l
            java.lang.Object r2 = r0.f16942k
            yf.y1 r2 = (p466yf.C14054y1) r2
            java.lang.Object r6 = r0.f16941j
            bg.k0 r6 = (p314bg.C10982k0) r6
            java.lang.Object r7 = r0.f16940i
            bg.g r7 = (p314bg.C10967g) r7
            java.lang.Object r8 = r0.f16939h
            bg.i0 r8 = (p314bg.C10975i0) r8
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d4
        L_0x0061:
            java.lang.Object r11 = r0.f16941j
            r6 = r11
            bg.k0 r6 = (p314bg.C10982k0) r6
            java.lang.Object r11 = r0.f16940i
            bg.g r11 = (p314bg.C10967g) r11
            java.lang.Object r2 = r0.f16939h
            r8 = r2
            bg.i0 r8 = (p314bg.C10975i0) r8
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00f0
        L_0x0076:
            p336ef.C11910n.m25701b(r12)
            cg.c r12 = r10.mo46154h()
            bg.k0 r12 = (p314bg.C10982k0) r12
            boolean r2 = r11 instanceof p314bg.C10984l0     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            bg.l0 r2 = (p314bg.C10984l0) r2     // Catch:{ all -> 0x00ed }
            r0.f16939h = r10     // Catch:{ all -> 0x00ed }
            r0.f16940i = r11     // Catch:{ all -> 0x00ed }
            r0.f16941j = r12     // Catch:{ all -> 0x00ed }
            r0.f16946o = r6     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.mo46053a(r0)     // Catch:{ all -> 0x00ed }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            hf.g r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            yf.y1$b r2 = p466yf.C14054y1.f22970b0     // Catch:{ all -> 0x0073 }
            hf.g$b r12 = r12.get(r2)     // Catch:{ all -> 0x0073 }
            yf.y1 r12 = (p466yf.C14054y1) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f16937g     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00b1
            p466yf.C13934b2.m32225m(r2)     // Catch:{ all -> 0x0073 }
        L_0x00b1:
            if (r11 == 0) goto L_0x00b9
            boolean r9 = kotlin.jvm.internal.C12775o.m28634d(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d4
        L_0x00b9:
            dg.g0 r11 = p320cg.C11081n.f17203a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bf
            r11 = r3
            goto L_0x00c0
        L_0x00bf:
            r11 = r12
        L_0x00c0:
            r0.f16939h = r8     // Catch:{ all -> 0x0073 }
            r0.f16940i = r7     // Catch:{ all -> 0x0073 }
            r0.f16941j = r6     // Catch:{ all -> 0x0073 }
            r0.f16942k = r2     // Catch:{ all -> 0x0073 }
            r0.f16943l = r12     // Catch:{ all -> 0x0073 }
            r0.f16946o = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r11 = r12
        L_0x00d4:
            boolean r12 = r6.mo46052h()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.f16939h = r8     // Catch:{ all -> 0x0073 }
            r0.f16940i = r7     // Catch:{ all -> 0x0073 }
            r0.f16941j = r6     // Catch:{ all -> 0x0073 }
            r0.f16942k = r2     // Catch:{ all -> 0x0073 }
            r0.f16943l = r11     // Catch:{ all -> 0x0073 }
            r0.f16946o = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.mo46049e(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ed:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00f0:
            r8.mo46155k(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10975i0.collect(bg.g, hf.d):java.lang.Object");
    }

    /* renamed from: d */
    public void mo46040d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* renamed from: e */
    public boolean mo46041e(T t) {
        setValue(t);
        return true;
    }

    public Object emit(T t, C12074d<? super C11921v> dVar) {
        setValue(t);
        return C11921v.f18618a;
    }

    public T getValue() {
        T t = C11081n.f17203a;
        T t2 = f16937g.get(this);
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C10982k0 mo46042i() {
        return new C10982k0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C10982k0[] mo46043j(int i) {
        return new C10982k0[i];
    }

    public void setValue(T t) {
        if (t == null) {
            t = C11081n.f17203a;
        }
        m23621p((Object) null, t);
    }
}
