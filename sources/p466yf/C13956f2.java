package p466yf;

import androidx.concurrent.futures.C1248a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import p331dg.C11850q;
import p331dg.C11851r;
import p331dg.C11864z;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p448vf.C13650g;
import p448vf.C13652i;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1451:1\n705#1,2:1458\n366#1,2:1468\n368#1,4:1473\n372#1,4:1479\n376#1,2:1486\n366#1,2:1488\n368#1,4:1493\n372#1,4:1499\n376#1,2:1506\n177#1,2:1515\n706#1:1517\n177#1,2:1518\n177#1,2:1537\n177#1,2:1552\n705#1,2:1554\n705#1,2:1556\n177#1,2:1558\n705#1,2:1560\n177#1,2:1562\n177#1,2:1569\n177#1,2:1571\n1#2:1452\n1#2:1477\n1#2:1497\n28#3,4:1453\n28#3,4:1520\n28#3,4:1564\n28#3,4:1573\n20#4:1457\n20#4:1524\n20#4:1568\n20#4:1577\n288#5,2:1460\n288#5,2:1462\n19#6:1464\n162#7:1465\n162#7:1466\n153#7,4:1580\n75#8:1467\n75#8:1478\n75#8:1498\n75#8:1511\n341#9,3:1470\n344#9,3:1483\n341#9,3:1490\n344#9,3:1503\n341#9,3:1508\n344#9,3:1512\n47#10:1525\n22#11:1526\n22#11:1527\n13#11:1548\n13#11:1551\n13#11:1578\n13#11:1579\n13#11:1584\n13#11:1585\n134#12:1528\n73#12,3:1529\n135#12,5:1532\n314#13,9:1539\n323#13,2:1549\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n249#1:1458,2\n331#1:1468,2\n331#1:1473,4\n331#1:1479,4\n331#1:1486,2\n363#1:1488,2\n363#1:1493,4\n363#1:1499,4\n363#1:1506,2\n380#1:1515,2\n425#1:1517\n460#1:1518,2\n552#1:1537,2\n593#1:1552,2\n620#1:1554,2\n629#1:1556,2\n693#1:1558,2\n722#1:1560,2\n735#1:1562,2\n808#1:1569,2\n830#1:1571,2\n331#1:1477\n363#1:1497\n212#1:1453,4\n477#1:1520,4\n738#1:1564,4\n883#1:1573,4\n212#1:1457\n477#1:1524\n738#1:1568\n883#1:1577\n260#1:1460,2\n264#1:1462,2\n272#1:1464\n278#1:1465\n280#1:1466\n1217#1:1580,4\n283#1:1467\n331#1:1478\n363#1:1498\n371#1:1511\n331#1:1470,3\n331#1:1483,3\n363#1:1490,3\n363#1:1503,3\n367#1:1508,3\n367#1:1512,3\n482#1:1525\n494#1:1526\n504#1:1527\n560#1:1548\n576#1:1551\n923#1:1578\n973#1:1579\n1236#1:1584\n1258#1:1585\n525#1:1528\n525#1:1529,3\n525#1:1532,5\n558#1:1539,9\n558#1:1549,2\n*E\n"})
/* renamed from: yf.f2 */
/* compiled from: JobSupport.kt */
public class C13956f2 implements C14054y1, C14040v, C14013o2 {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f22871b;

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f22872c;
    private volatile Object _parentHandle;
    private volatile Object _state;

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* renamed from: yf.f2$a */
    /* compiled from: JobSupport.kt */
    private static final class C13957a<T> extends C14010o<T> {

        /* renamed from: j */
        private final C13956f2 f22873j;

        public C13957a(C12074d<? super T> dVar, C13956f2 f2Var) {
            super(dVar, 1);
            this.f22873j = f2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: I */
        public String mo53729I() {
            return "AwaitContinuation";
        }

        /* renamed from: w */
        public Throwable mo53730w(C14054y1 y1Var) {
            Throwable f;
            Object T = this.f22873j.mo53707T();
            if ((T instanceof C13959c) && (f = ((C13959c) T).mo53732f()) != null) {
                return f;
            }
            if (T instanceof C13932b0) {
                return ((C13932b0) T).f22850a;
            }
            return y1Var.mo53700A();
        }
    }

    /* renamed from: yf.f2$b */
    /* compiled from: JobSupport.kt */
    private static final class C13958b extends C13950e2 {

        /* renamed from: f */
        private final C13956f2 f22874f;

        /* renamed from: g */
        private final C13959c f22875g;

        /* renamed from: h */
        private final C14034u f22876h;

        /* renamed from: i */
        private final Object f22877i;

        public C13958b(C13956f2 f2Var, C13959c cVar, C14034u uVar, Object obj) {
            this.f22874f = f2Var;
            this.f22875g = cVar;
            this.f22876h = uVar;
            this.f22877i = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53691s((Throwable) obj);
            return C11921v.f18618a;
        }

        /* renamed from: s */
        public void mo53691s(Throwable th) {
            this.f22874f.m32271F(this.f22875g, this.f22876h, this.f22877i);
        }
    }

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
    /* renamed from: yf.f2$c */
    /* compiled from: JobSupport.kt */
    private static final class C13959c implements C14028s1 {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater f22878c;

        /* renamed from: d */
        private static final AtomicReferenceFieldUpdater f22879d;

        /* renamed from: e */
        private static final AtomicReferenceFieldUpdater f22880e;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: b */
        private final C13993k2 f22881b;

        static {
            Class<C13959c> cls = C13959c.class;
            f22878c = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
            Class<Object> cls2 = Object.class;
            f22879d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
            f22880e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
        }

        public C13959c(C13993k2 k2Var, boolean z, Throwable th) {
            this.f22881b = k2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m32335d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m32336e() {
            return f22880e.get(this);
        }

        /* renamed from: l */
        private final void m32337l(Object obj) {
            f22880e.set(this, obj);
        }

        /* renamed from: a */
        public boolean mo53693a() {
            if (mo53732f() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo53731b(Throwable th) {
            Throwable f = mo53732f();
            if (f == null) {
                mo53738m(th);
            } else if (th != f) {
                Object e = m32336e();
                if (e == null) {
                    m32337l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> d = m32335d();
                        d.add(e);
                        d.add(th);
                        m32337l(d);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e).toString());
                }
            }
        }

        /* renamed from: c */
        public C13993k2 mo53694c() {
            return this.f22881b;
        }

        /* renamed from: f */
        public final Throwable mo53732f() {
            return (Throwable) f22879d.get(this);
        }

        /* renamed from: g */
        public final boolean mo53733g() {
            if (mo53732f() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public final boolean mo53734h() {
            if (f22878c.get(this) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final boolean mo53735i() {
            if (m32336e() == C13969g2.f22899e) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final List<Throwable> mo53736j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = m32336e();
            if (e == null) {
                arrayList = m32335d();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> d = m32335d();
                d.add(e);
                arrayList = d;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(("State is " + e).toString());
            }
            Throwable f = mo53732f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !C12775o.m28634d(th, f)) {
                arrayList.add(th);
            }
            m32337l(C13969g2.f22899e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo53737k(boolean z) {
            f22878c.set(this, z ? 1 : 0);
        }

        /* renamed from: m */
        public final void mo53738m(Throwable th) {
            f22879d.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + mo53733g() + ", completing=" + mo53734h() + ", rootCause=" + mo53732f() + ", exceptions=" + m32336e() + ", list=" + mo53694c() + ']';
        }
    }

    @SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n525#2:368\n*E\n"})
    /* renamed from: yf.f2$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C13960d extends C11851r.C11852a {

        /* renamed from: d */
        final /* synthetic */ C13956f2 f22882d;

        /* renamed from: e */
        final /* synthetic */ Object f22883e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13960d(C11851r rVar, C13956f2 f2Var, Object obj) {
            super(rVar);
            this.f22882d = f2Var;
            this.f22883e = obj;
        }

        /* renamed from: f */
        public Object mo48976d(C11851r rVar) {
            boolean z;
            if (this.f22882d.mo53707T() == this.f22883e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C11850q.m25533a();
        }
    }

    @SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1451:1\n341#2,6:1452\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n957#1:1452,6\n*E\n"})
    @C12739f(mo50609c = "kotlinx.coroutines.JobSupport$children$1", mo50610f = "JobSupport.kt", mo50611l = {955, 957}, mo50612m = "invokeSuspend")
    /* renamed from: yf.f2$e */
    /* compiled from: JobSupport.kt */
    static final class C13961e extends C12745k implements C13088o<C13652i<? super C14054y1>, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        Object f22884h;

        /* renamed from: i */
        Object f22885i;

        /* renamed from: j */
        int f22886j;

        /* renamed from: k */
        private /* synthetic */ Object f22887k;

        /* renamed from: l */
        final /* synthetic */ C13956f2 f22888l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13961e(C13956f2 f2Var, C12074d<? super C13961e> dVar) {
            super(2, dVar);
            this.f22888l = f2Var;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C13961e eVar = new C13961e(this.f22888l, dVar);
            eVar.f22887k = obj;
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r7.f22886j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r7.f22885i
                dg.r r1 = (p331dg.C11851r) r1
                java.lang.Object r3 = r7.f22884h
                dg.p r3 = (p331dg.C11849p) r3
                java.lang.Object r4 = r7.f22887k
                vf.i r4 = (p448vf.C13652i) r4
                p336ef.C11910n.m25701b(r8)
                r8 = r7
                goto L_0x0083
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                p336ef.C11910n.m25701b(r8)
                goto L_0x0088
            L_0x002b:
                p336ef.C11910n.m25701b(r8)
                java.lang.Object r8 = r7.f22887k
                vf.i r8 = (p448vf.C13652i) r8
                yf.f2 r1 = r7.f22888l
                java.lang.Object r1 = r1.mo53707T()
                boolean r4 = r1 instanceof p466yf.C14034u
                if (r4 == 0) goto L_0x0049
                yf.u r1 = (p466yf.C14034u) r1
                yf.v r1 = r1.f22954f
                r7.f22886j = r3
                java.lang.Object r8 = r8.mo53327e(r1, r7)
                if (r8 != r0) goto L_0x0088
                return r0
            L_0x0049:
                boolean r3 = r1 instanceof p466yf.C14028s1
                if (r3 == 0) goto L_0x0088
                yf.s1 r1 = (p466yf.C14028s1) r1
                yf.k2 r1 = r1.mo53694c()
                if (r1 == 0) goto L_0x0088
                java.lang.Object r3 = r1.mo49033j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.C12775o.m28637g(r3, r4)
                dg.r r3 = (p331dg.C11851r) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x0065:
                boolean r5 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
                if (r5 != 0) goto L_0x0088
                boolean r5 = r1 instanceof p466yf.C14034u
                if (r5 == 0) goto L_0x0083
                r5 = r1
                yf.u r5 = (p466yf.C14034u) r5
                yf.v r5 = r5.f22954f
                r8.f22887k = r4
                r8.f22884h = r3
                r8.f22885i = r1
                r8.f22886j = r2
                java.lang.Object r5 = r4.mo53327e(r5, r8)
                if (r5 != r0) goto L_0x0083
                return r0
            L_0x0083:
                dg.r r1 = r1.mo49034l()
                goto L_0x0065
            L_0x0088:
                ef.v r8 = p336ef.C11921v.f18618a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.C13961e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13652i<? super C14054y1> iVar, C12074d<? super C11921v> dVar) {
            return ((C13961e) create(iVar, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    static {
        Class<C13956f2> cls = C13956f2.class;
        Class<Object> cls2 = Object.class;
        f22871b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f22872c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C13956f2(boolean z) {
        C13968g1 g1Var;
        if (z) {
            g1Var = C13969g2.f22901g;
        } else {
            g1Var = C13969g2.f22900f;
        }
        this._state = g1Var;
    }

    /* renamed from: A0 */
    public static /* synthetic */ CancellationException m32265A0(C13956f2 f2Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return f2Var.mo53728z0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: B */
    private final boolean m32266B(Throwable th) {
        if (mo48981b0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C14030t S = mo53706S();
        if (S == null || S == C14001m2.f22925b) {
            return z;
        }
        if (S.mo53780b(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    private final boolean m32267C0(C14028s1 s1Var, Object obj) {
        if (!C1248a.m719a(f22871b, this, s1Var, C13969g2.m32370g(obj))) {
            return false;
        }
        mo53719q0((Throwable) null);
        mo53668r0(obj);
        m32269E(s1Var, obj);
        return true;
    }

    /* renamed from: D0 */
    private final boolean m32268D0(C14028s1 s1Var, Throwable th) {
        C13993k2 P = m32279P(s1Var);
        if (P == null) {
            return false;
        }
        if (!C1248a.m719a(f22871b, this, s1Var, new C13959c(P, false, th))) {
            return false;
        }
        m32285n0(P, th);
        return true;
    }

    /* renamed from: E */
    private final void m32269E(C14028s1 s1Var, Object obj) {
        C13932b0 b0Var;
        C14030t S = mo53706S();
        if (S != null) {
            S.dispose();
            mo53726w0(C14001m2.f22925b);
        }
        Throwable th = null;
        if (obj instanceof C13932b0) {
            b0Var = (C13932b0) obj;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            th = b0Var.f22850a;
        }
        if (s1Var instanceof C13950e2) {
            try {
                ((C13950e2) s1Var).mo53691s(th);
            } catch (Throwable th2) {
                mo53666W(new CompletionHandlerException("Exception in completion handler " + s1Var + " for " + this, th2));
            }
        } else {
            C13993k2 c = s1Var.mo53694c();
            if (c != null) {
                m32286o0(c, th);
            }
        }
    }

    /* renamed from: E0 */
    private final Object m32270E0(Object obj, Object obj2) {
        if (!(obj instanceof C14028s1)) {
            return C13969g2.f22895a;
        }
        if ((!(obj instanceof C13968g1) && !(obj instanceof C13950e2)) || (obj instanceof C14034u) || (obj2 instanceof C13932b0)) {
            return m32272F0((C14028s1) obj, obj2);
        }
        if (m32267C0((C14028s1) obj, obj2)) {
            return obj2;
        }
        return C13969g2.f22897c;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m32271F(C13959c cVar, C14034u uVar, Object obj) {
        C14034u m0 = m32284m0(uVar);
        if (m0 == null || !m32273G0(cVar, m0, obj)) {
            mo48982t(m32275I(cVar, obj));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        m32285n0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        r9 = m32276J(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007d, code lost:
        if (m32273G0(r1, r9, r10) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        return p466yf.C13969g2.f22896b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0086, code lost:
        return m32275I(r1, r10);
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m32272F0(p466yf.C14028s1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            yf.k2 r0 = r8.m32279P(r9)
            if (r0 != 0) goto L_0x000b
            dg.g0 r9 = p466yf.C13969g2.f22897c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof p466yf.C13956f2.C13959c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            yf.f2$c r1 = (p466yf.C13956f2.C13959c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            yf.f2$c r1 = new yf.f2$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.mo53734h()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x002f
            dg.g0 r9 = p466yf.C13969g2.f22895a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.mo53737k(r5)     // Catch:{ all -> 0x0087 }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f22871b     // Catch:{ all -> 0x0087 }
            boolean r6 = androidx.concurrent.futures.C1248a.m719a(r6, r8, r9, r1)     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x0043
            dg.g0 r9 = p466yf.C13969g2.f22897c     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.mo53733g()     // Catch:{ all -> 0x0087 }
            boolean r7 = r10 instanceof p466yf.C13932b0     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            yf.b0 r7 = (p466yf.C13932b0) r7     // Catch:{ all -> 0x0087 }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f22850a     // Catch:{ all -> 0x0087 }
            r1.mo53731b(r7)     // Catch:{ all -> 0x0087 }
        L_0x0057:
            java.lang.Throwable r7 = r1.mo53732f()     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0087 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.f20403b = r2     // Catch:{ all -> 0x0087 }
            ef.v r3 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0073
            r8.m32285n0(r0, r2)
        L_0x0073:
            yf.u r9 = r8.m32276J(r9)
            if (r9 == 0) goto L_0x0082
            boolean r9 = r8.m32273G0(r1, r9, r10)
            if (r9 == 0) goto L_0x0082
            dg.g0 r9 = p466yf.C13969g2.f22896b
            return r9
        L_0x0082:
            java.lang.Object r9 = r8.m32275I(r1, r10)
            return r9
        L_0x0087:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.m32272F0(yf.s1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: G0 */
    private final boolean m32273G0(C13959c cVar, C14034u uVar, Object obj) {
        while (C14054y1.C14055a.m32603d(uVar.f22954f, false, false, new C13958b(this, cVar, uVar, obj), 1, (Object) null) == C14001m2.f22925b) {
            uVar = m32284m0(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private final Throwable m32274H(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo53664C(), (Throwable) null, this);
            }
            return th;
        }
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C14013o2) obj).mo53711c0();
    }

    /* renamed from: I */
    private final Object m32275I(C13959c cVar, Object obj) {
        C13932b0 b0Var;
        Throwable th;
        boolean g;
        Throwable L;
        if (obj instanceof C13932b0) {
            b0Var = (C13932b0) obj;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            th = b0Var.f22850a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            g = cVar.mo53733g();
            List<Throwable> j = cVar.mo53736j(th);
            L = m32278L(cVar, j);
            if (L != null) {
                m32290s(L, j);
            }
        }
        boolean z = false;
        if (!(L == null || L == th)) {
            obj = new C13932b0(L, false, 2, (DefaultConstructorMarker) null);
        }
        if (L != null) {
            if (m32266B(L) || mo53708U(L)) {
                z = true;
            }
            if (z) {
                C12775o.m28637g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C13932b0) obj).mo53682b();
            }
        }
        if (!g) {
            mo53719q0(L);
        }
        mo53668r0(obj);
        C1248a.m719a(f22871b, this, cVar, C13969g2.m32370g(obj));
        m32269E(cVar, obj);
        return obj;
    }

    /* renamed from: J */
    private final C14034u m32276J(C14028s1 s1Var) {
        C14034u uVar;
        if (s1Var instanceof C14034u) {
            uVar = (C14034u) s1Var;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar;
        }
        C13993k2 c = s1Var.mo53694c();
        if (c != null) {
            return m32284m0(c);
        }
        return null;
    }

    /* renamed from: K */
    private final Throwable m32277K(Object obj) {
        C13932b0 b0Var;
        if (obj instanceof C13932b0) {
            b0Var = (C13932b0) obj;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            return b0Var.f22850a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable m32278L(p466yf.C13956f2.C13959c r6, java.util.List<? extends java.lang.Throwable> r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.mo53733g()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.mo53664C()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            r6 = r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r0 = r6.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r4 = r4 instanceof java.util.concurrent.CancellationException
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x001f
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0039
            return r2
        L_0x0039:
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r2 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L_0x0066
            java.util.Iterator r6 = r6.iterator()
        L_0x0048:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r6.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r7) goto L_0x005d
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005d
            r4 = r3
            goto L_0x005e
        L_0x005d:
            r4 = r0
        L_0x005e:
            if (r4 == 0) goto L_0x0048
            r1 = r2
        L_0x0061:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0066
            return r1
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.m32278L(yf.f2$c, java.util.List):java.lang.Throwable");
    }

    /* renamed from: P */
    private final C13993k2 m32279P(C14028s1 s1Var) {
        C13993k2 c = s1Var.mo53694c();
        if (c != null) {
            return c;
        }
        if (s1Var instanceof C13968g1) {
            return new C13993k2();
        }
        if (s1Var instanceof C13950e2) {
            m32292u0((C13950e2) s1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + s1Var).toString());
    }

    /* renamed from: d0 */
    private final boolean m32280d0() {
        Object T;
        do {
            T = mo53707T();
            if (!(T instanceof C14028s1)) {
                return false;
            }
        } while (m32294x0(T) < 0);
        return true;
    }

    /* renamed from: e0 */
    private final Object m32281e0(C12074d<? super C11921v> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        C14018q.m32524a(oVar, mo53704O(new C14021q2(oVar)));
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        m32285n0(((p466yf.C13956f2.C13959c) r2).mo53694c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return p466yf.C13969g2.m32364a();
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m32282f0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo53707T()
            boolean r3 = r2 instanceof p466yf.C13956f2.C13959c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            yf.f2$c r3 = (p466yf.C13956f2.C13959c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo53735i()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            dg.g0 r7 = p466yf.C13969g2.f22898d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            yf.f2$c r3 = (p466yf.C13956f2.C13959c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo53733g()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m32274H(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            yf.f2$c r7 = (p466yf.C13956f2.C13959c) r7     // Catch:{ all -> 0x004e }
            r7.mo53731b(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            yf.f2$c r7 = (p466yf.C13956f2.C13959c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.mo53732f()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            yf.f2$c r2 = (p466yf.C13956f2.C13959c) r2
            yf.k2 r7 = r2.mo53694c()
            r6.m32285n0(r7, r0)
        L_0x0049:
            dg.g0 r7 = p466yf.C13969g2.f22895a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof p466yf.C14028s1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.m32274H(r7)
        L_0x005b:
            r3 = r2
            yf.s1 r3 = (p466yf.C14028s1) r3
            boolean r4 = r3.mo53693a()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.m32268D0(r3, r1)
            if (r2 == 0) goto L_0x0002
            dg.g0 r7 = p466yf.C13969g2.f22895a
            return r7
        L_0x006f:
            yf.b0 r3 = new yf.b0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m32270E0(r2, r3)
            dg.g0 r4 = p466yf.C13969g2.f22895a
            if (r3 == r4) goto L_0x0087
            dg.g0 r2 = p466yf.C13969g2.f22897c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            dg.g0 r7 = p466yf.C13969g2.f22898d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.m32282f0(java.lang.Object):java.lang.Object");
    }

    /* renamed from: i0 */
    private final C13950e2 m32283i0(Function1<? super Throwable, C11921v> function1, boolean z) {
        C13950e2 e2Var = null;
        if (z) {
            if (function1 instanceof C14060z1) {
                e2Var = (C14060z1) function1;
            }
            if (e2Var == null) {
                e2Var = new C14046w1(function1);
            }
        } else {
            if (function1 instanceof C13950e2) {
                e2Var = (C13950e2) function1;
            }
            if (e2Var == null) {
                e2Var = new C14050x1(function1);
            }
        }
        e2Var.mo53696u(this);
        return e2Var;
    }

    /* renamed from: m0 */
    private final C14034u m32284m0(C11851r rVar) {
        while (rVar.mo49031n()) {
            rVar = rVar.mo49035m();
        }
        while (true) {
            rVar = rVar.mo49034l();
            if (!rVar.mo49031n()) {
                if (rVar instanceof C14034u) {
                    return (C14034u) rVar;
                }
                if (rVar instanceof C13993k2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: n0 */
    private final void m32285n0(C13993k2 k2Var, Throwable th) {
        mo53719q0(th);
        Object j = k2Var.mo49033j();
        C12775o.m28637g(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (C11851r rVar = (C11851r) j; !C12775o.m28634d(rVar, k2Var); rVar = rVar.mo49034l()) {
            if (rVar instanceof C14060z1) {
                C13950e2 e2Var = (C13950e2) rVar;
                try {
                    e2Var.mo53691s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C11894b.m25683a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + e2Var + " for " + this, th2);
                        C11921v vVar = C11921v.f18618a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo53666W(completionHandlerException);
        }
        m32266B(th);
    }

    /* renamed from: o0 */
    private final void m32286o0(C13993k2 k2Var, Throwable th) {
        Object j = k2Var.mo49033j();
        C12775o.m28637g(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (C11851r rVar = (C11851r) j; !C12775o.m28634d(rVar, k2Var); rVar = rVar.mo49034l()) {
            if (rVar instanceof C13950e2) {
                C13950e2 e2Var = (C13950e2) rVar;
                try {
                    e2Var.mo53691s(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C11894b.m25683a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + e2Var + " for " + this, th2);
                        C11921v vVar = C11921v.f18618a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo53666W(completionHandlerException);
        }
    }

    /* renamed from: r */
    private final boolean m32289r(Object obj, C13993k2 k2Var, C13950e2 e2Var) {
        int r;
        C13960d dVar = new C13960d(e2Var, this, obj);
        do {
            r = k2Var.mo49035m().mo49038r(e2Var, k2Var, dVar);
            if (r == 1) {
                return true;
            }
        } while (r != 2);
        return false;
    }

    /* renamed from: s */
    private final void m32290s(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C11894b.m25683a(th, th2);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [yf.r1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32291t0(p466yf.C13968g1 r3) {
        /*
            r2 = this;
            yf.k2 r0 = new yf.k2
            r0.<init>()
            boolean r1 = r3.mo53693a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            yf.r1 r1 = new yf.r1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f22871b
            androidx.concurrent.futures.C1248a.m719a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.m32291t0(yf.g1):void");
    }

    /* renamed from: u0 */
    private final void m32292u0(C13950e2 e2Var) {
        e2Var.mo49032f(new C13993k2());
        C1248a.m719a(f22871b, this, e2Var, e2Var.mo49034l());
    }

    /* renamed from: v */
    private final Object m32293v(C12074d<Object> dVar) {
        C13957a aVar = new C13957a(C12147c.m26491b(dVar), this);
        aVar.mo53786B();
        C14018q.m32524a(aVar, mo53704O(new C14017p2(aVar)));
        Object y = aVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }

    /* renamed from: x0 */
    private final int m32294x0(Object obj) {
        if (obj instanceof C13968g1) {
            if (((C13968g1) obj).mo53693a()) {
                return 0;
            }
            if (!C1248a.m719a(f22871b, this, obj, C13969g2.f22901g)) {
                return -1;
            }
            mo53720s0();
            return 1;
        } else if (!(obj instanceof C14024r1)) {
            return 0;
        } else {
            if (!C1248a.m719a(f22871b, this, obj, ((C14024r1) obj).mo53694c())) {
                return -1;
            }
            mo53720s0();
            return 1;
        }
    }

    /* renamed from: y0 */
    private final String m32295y0(Object obj) {
        if (obj instanceof C13959c) {
            C13959c cVar = (C13959c) obj;
            if (cVar.mo53733g()) {
                return "Cancelling";
            }
            if (cVar.mo53734h()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C14028s1) {
            if (((C14028s1) obj).mo53693a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C13932b0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: z */
    private final Object m32296z(Object obj) {
        Object E0;
        do {
            Object T = mo53707T();
            if (!(T instanceof C14028s1) || ((T instanceof C13959c) && ((C13959c) T).mo53734h())) {
                return C13969g2.f22895a;
            }
            E0 = m32270E0(T, new C13932b0(m32274H(obj), false, 2, (DefaultConstructorMarker) null));
        } while (E0 == C13969g2.f22897c);
        return E0;
    }

    /* renamed from: A */
    public final CancellationException mo53700A() {
        Object T = mo53707T();
        if (T instanceof C13959c) {
            Throwable f = ((C13959c) T).mo53732f();
            if (f != null) {
                CancellationException z0 = mo53728z0(f, C14015p0.m32518a(this) + " is cancelling");
                if (z0 != null) {
                    return z0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (T instanceof C14028s1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (T instanceof C13932b0) {
            return m32265A0(this, ((C13932b0) T).f22850a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(C14015p0.m32518a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: B0 */
    public final String mo53701B0() {
        return mo53667l0() + '{' + m32295y0(mo53707T()) + '}';
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo53664C() {
        return "Job was cancelled";
    }

    /* renamed from: D */
    public boolean mo53702D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo53727x(th) || !mo53677M()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final Object mo53703G(C12074d<? super C11921v> dVar) {
        if (!m32280d0()) {
            C13934b2.m32224l(dVar.getContext());
            return C11921v.f18618a;
        }
        Object e0 = m32281e0(dVar);
        if (e0 == C12150d.m26492c()) {
            return e0;
        }
        return C11921v.f18618a;
    }

    /* renamed from: M */
    public boolean mo53677M() {
        return true;
    }

    /* renamed from: N */
    public boolean mo53678N() {
        return false;
    }

    /* renamed from: O */
    public final C13943d1 mo53704O(Function1<? super Throwable, C11921v> function1) {
        return mo53717k(false, true, function1);
    }

    /* renamed from: R */
    public final void mo53705R(C14013o2 o2Var) {
        mo53727x(o2Var);
    }

    /* renamed from: S */
    public final C14030t mo53706S() {
        return (C14030t) f22872c.get(this);
    }

    /* renamed from: T */
    public final Object mo53707T() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22871b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C11864z)) {
                return obj;
            }
            ((C11864z) obj).mo48974a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public boolean mo53708U(Throwable th) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo53709Z(C14054y1 y1Var) {
        if (y1Var == null) {
            mo53726w0(C14001m2.f22925b);
            return;
        }
        y1Var.start();
        C14030t p0 = y1Var.mo53718p0(this);
        mo53726w0(p0);
        if (mo53716j0()) {
            p0.dispose();
            mo53726w0(C14001m2.f22925b);
        }
    }

    /* renamed from: a */
    public boolean mo45937a() {
        Object T = mo53707T();
        if (!(T instanceof C14028s1) || !((C14028s1) T).mo53693a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final boolean mo53710a0() {
        Object T = mo53707T();
        if ((T instanceof C13932b0) || ((T instanceof C13959c) && ((C13959c) T).mo53733g())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public boolean mo48981b0() {
        return false;
    }

    /* renamed from: c0 */
    public CancellationException mo53711c0() {
        Throwable th;
        Object T = mo53707T();
        CancellationException cancellationException = null;
        if (T instanceof C13959c) {
            th = ((C13959c) T).mo53732f();
        } else if (T instanceof C13932b0) {
            th = ((C13932b0) T).f22850a;
        } else if (!(T instanceof C14028s1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + T).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m32295y0(T), th, this);
    }

    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo53664C(), (Throwable) null, this);
        }
        mo45910y(cancellationException);
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return C14054y1.C14055a.m32601b(this, r, oVar);
    }

    /* renamed from: g0 */
    public final boolean mo53712g0(Object obj) {
        Object E0;
        do {
            E0 = m32270E0(mo53707T(), obj);
            if (E0 == C13969g2.f22895a) {
                return false;
            }
            if (E0 == C13969g2.f22896b) {
                return true;
            }
        } while (E0 == C13969g2.f22897c);
        mo48982t(E0);
        return true;
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return C14054y1.C14055a.m32602c(this, cVar);
    }

    public final C13650g<C14054y1> getChildren() {
        return C13654k.m31268b(new C13961e(this, (C12074d<? super C13961e>) null));
    }

    public final C12079g.C12084c<?> getKey() {
        return C14054y1.f22970b0;
    }

    public C14054y1 getParent() {
        C14030t S = mo53706S();
        if (S != null) {
            return S.getParent();
        }
        return null;
    }

    /* renamed from: h0 */
    public final Object mo53715h0(Object obj) {
        Object E0;
        do {
            E0 = m32270E0(mo53707T(), obj);
            if (E0 == C13969g2.f22895a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m32277K(obj));
            }
        } while (E0 == C13969g2.f22897c);
        return E0;
    }

    /* renamed from: j0 */
    public final boolean mo53716j0() {
        return !(mo53707T() instanceof C14028s1);
    }

    /* renamed from: k */
    public final C13943d1 mo53717k(boolean z, boolean z2, Function1<? super Throwable, C11921v> function1) {
        C13932b0 b0Var;
        C13950e2 i0 = m32283i0(function1, z);
        while (true) {
            Object T = mo53707T();
            if (T instanceof C13968g1) {
                C13968g1 g1Var = (C13968g1) T;
                if (!g1Var.mo53693a()) {
                    m32291t0(g1Var);
                } else if (C1248a.m719a(f22871b, this, T, i0)) {
                    return i0;
                }
            } else {
                Throwable th = null;
                if (T instanceof C14028s1) {
                    C13993k2 c = ((C14028s1) T).mo53694c();
                    if (c == null) {
                        C12775o.m28637g(T, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m32292u0((C13950e2) T);
                    } else {
                        C13943d1 d1Var = C14001m2.f22925b;
                        if (z && (T instanceof C13959c)) {
                            synchronized (T) {
                                th = ((C13959c) T).mo53732f();
                                if (th == null || ((function1 instanceof C14034u) && !((C13959c) T).mo53734h())) {
                                    if (m32289r(T, c, i0)) {
                                        if (th == null) {
                                            return i0;
                                        }
                                        d1Var = i0;
                                    }
                                }
                                C11921v vVar = C11921v.f18618a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                function1.invoke(th);
                            }
                            return d1Var;
                        } else if (m32289r(T, c, i0)) {
                            return i0;
                        }
                    }
                } else {
                    if (z2) {
                        if (T instanceof C13932b0) {
                            b0Var = (C13932b0) T;
                        } else {
                            b0Var = null;
                        }
                        if (b0Var != null) {
                            th = b0Var.f22850a;
                        }
                        function1.invoke(th);
                    }
                    return C14001m2.f22925b;
                }
            }
        }
    }

    /* renamed from: l0 */
    public String mo53667l0() {
        return C14015p0.m32518a(this);
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return C14054y1.C14055a.m32604e(this, cVar);
    }

    /* renamed from: p0 */
    public final C14030t mo53718p0(C14040v vVar) {
        C13943d1 d = C14054y1.C14055a.m32603d(this, true, false, new C14034u(vVar), 2, (Object) null);
        C12775o.m28637g(d, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C14030t) d;
    }

    public C12079g plus(C12079g gVar) {
        return C14054y1.C14055a.m32605f(this, gVar);
    }

    public final boolean start() {
        int x0;
        do {
            x0 = m32294x0(mo53707T());
            if (x0 == 0) {
                return false;
            }
        } while (x0 != 1);
        return true;
    }

    public String toString() {
        return mo53701B0() + '@' + C14015p0.m32519b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo53723u(C12074d<Object> dVar) {
        Object T;
        do {
            T = mo53707T();
            if (!(T instanceof C14028s1)) {
                if (!(T instanceof C13932b0)) {
                    return C13969g2.m32371h(T);
                }
                throw ((C13932b0) T).f22850a;
            }
        } while (m32294x0(T) < 0);
        return m32293v(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53724v0(p466yf.C13950e2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo53707T()
            boolean r1 = r0 instanceof p466yf.C13950e2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f22871b
            yf.g1 r2 = p466yf.C13969g2.f22901g
            boolean r0 = androidx.concurrent.futures.C1248a.m719a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof p466yf.C14028s1
            if (r1 == 0) goto L_0x0027
            yf.s1 r0 = (p466yf.C14028s1) r0
            yf.k2 r0 = r0.mo53694c()
            if (r0 == 0) goto L_0x0027
            r4.mo49036o()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13956f2.mo53724v0(yf.e2):void");
    }

    /* renamed from: w */
    public final boolean mo53725w(Throwable th) {
        return mo53727x(th);
    }

    /* renamed from: w0 */
    public final void mo53726w0(C14030t tVar) {
        f22872c.set(this, tVar);
    }

    /* renamed from: x */
    public final boolean mo53727x(Object obj) {
        Object a = C13969g2.f22895a;
        if (mo53678N() && (a = m32296z(obj)) == C13969g2.f22896b) {
            return true;
        }
        if (a == C13969g2.f22895a) {
            a = m32282f0(obj);
        }
        if (a == C13969g2.f22895a || a == C13969g2.f22896b) {
            return true;
        }
        if (a == C13969g2.f22898d) {
            return false;
        }
        mo48982t(a);
        return true;
    }

    /* renamed from: y */
    public void mo45910y(Throwable th) {
        mo53727x(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public final CancellationException mo53728z0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo53664C();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo53720s0() {
    }

    /* renamed from: W */
    public void mo53666W(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo53719q0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo53668r0(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo48982t(Object obj) {
    }
}
