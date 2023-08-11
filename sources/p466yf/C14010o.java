package p466yf;

import androidx.concurrent.futures.C1248a;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletionHandlerException;
import p331dg.C11822d0;
import p331dg.C11828g0;
import p331dg.C11831i;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* renamed from: yf.o */
/* compiled from: CancellableContinuationImpl.kt */
public class C14010o<T> extends C14053y0<T> implements C14002n<T>, C12738e, C13945d3 {

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f22934g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f22935h;

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f22936i;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = C13941d.f22860b;

    /* renamed from: e */
    private final C12074d<T> f22937e;

    /* renamed from: f */
    private final C12079g f22938f;

    static {
        Class<C14010o> cls = C14010o.class;
        f22934g = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f22935h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f22936i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C14010o(C12074d<? super T> dVar, int i) {
        super(i);
        this.f22937e = dVar;
        this.f22938f = dVar.getContext();
    }

    /* renamed from: A */
    private final String m32469A() {
        Object z = mo53798z();
        if (z instanceof C14009n2) {
            return "Active";
        }
        if (z instanceof C14022r) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: C */
    private final C13943d1 m32470C() {
        C14054y1 y1Var = (C14054y1) getContext().get(C14054y1.f22970b0);
        if (y1Var == null) {
            return null;
        }
        C13943d1 d = C14054y1.C14055a.m32603d(y1Var, true, false, new C14026s(this), 2, (Object) null);
        C1248a.m719a(f22936i, this, (Object) null, d);
        return d;
    }

    /* renamed from: D */
    private final void m32471D(Object obj) {
        boolean z;
        Object obj2 = obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof C13941d)) {
                if (obj3 instanceof C13994l) {
                    z = true;
                } else {
                    z = obj3 instanceof C11822d0;
                }
                if (z) {
                    m32474H(obj2, obj3);
                } else {
                    boolean z2 = obj3 instanceof C13932b0;
                    if (z2) {
                        C13932b0 b0Var = (C13932b0) obj3;
                        if (!b0Var.mo53682b()) {
                            m32474H(obj2, obj3);
                        }
                        if (obj3 instanceof C14022r) {
                            Throwable th = null;
                            if (!z2) {
                                b0Var = null;
                            }
                            if (b0Var != null) {
                                th = b0Var.f22850a;
                            }
                            if (obj2 instanceof C13994l) {
                                mo53793p((C13994l) obj2, th);
                                return;
                            }
                            C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m32482r((C11822d0) obj2, th);
                            return;
                        }
                        return;
                    } else if (obj3 instanceof C13927a0) {
                        C13927a0 a0Var = (C13927a0) obj3;
                        if (a0Var.f22842b != null) {
                            m32474H(obj2, obj3);
                        }
                        if (!(obj2 instanceof C11822d0)) {
                            C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            C13994l lVar = (C13994l) obj2;
                            if (a0Var.mo53670c()) {
                                mo53793p(lVar, a0Var.f22845e);
                                return;
                            }
                            if (C1248a.m719a(f22935h, this, obj3, C13927a0.m32200b(a0Var, (Object) null, lVar, (Function1) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj2 instanceof C11822d0)) {
                        C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (C1248a.m719a(f22935h, this, obj3, new C13927a0(obj3, (C13994l) obj2, (Function1) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (C1248a.m719a(f22935h, this, obj3, obj2)) {
                return;
            }
        }
    }

    /* renamed from: F */
    private final boolean m32472F() {
        if (C14059z0.m32610c(this.f22969d)) {
            C12074d<T> dVar = this.f22937e;
            C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C11831i) dVar).mo49002s()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    private final C13994l m32473G(Function1<? super Throwable, C11921v> function1) {
        if (function1 instanceof C13994l) {
            return (C13994l) function1;
        }
        return new C14042v1(function1);
    }

    /* renamed from: H */
    private final void m32474H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: M */
    private final void m32475M(Object obj, int i, Function1<? super Throwable, C11921v> function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C14009n2) {
            } else {
                if (obj2 instanceof C14022r) {
                    C14022r rVar = (C14022r) obj2;
                    if (rVar.mo53803c()) {
                        if (function1 != null) {
                            mo53794q(function1, rVar.f22850a);
                            return;
                        }
                        return;
                    }
                }
                m32481n(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C1248a.m719a(f22935h, this, obj2, m32477O((C14009n2) obj2, obj, i, function1, (Object) null)));
        m32484u();
        m32485v(i);
    }

    /* renamed from: N */
    static /* synthetic */ void m32476N(C14010o oVar, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            oVar.m32475M(obj, i, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: O */
    private final Object m32477O(C14009n2 n2Var, Object obj, int i, Function1<? super Throwable, C11921v> function1, Object obj2) {
        C13994l lVar;
        if (obj instanceof C13932b0) {
            return obj;
        }
        if (!C14059z0.m32609b(i) && obj2 == null) {
            return obj;
        }
        if (function1 == null && !(n2Var instanceof C13994l) && obj2 == null) {
            return obj;
        }
        if (n2Var instanceof C13994l) {
            lVar = (C13994l) n2Var;
        } else {
            lVar = null;
        }
        return new C13927a0(obj, lVar, function1, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: P */
    private final boolean m32478P() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22934g;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f22934g.compareAndSet(this, i, BasicMeasure.EXACTLY + (536870911 & i)));
        return true;
    }

    /* renamed from: Q */
    private final C11828g0 m32479Q(Object obj, Object obj2, Function1<? super Throwable, C11921v> function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof C14009n2) {
            } else if (!(obj3 instanceof C13927a0) || obj2 == null || ((C13927a0) obj3).f22844d != obj2) {
                return null;
            } else {
                return C14014p.f22940a;
            }
        } while (!C1248a.m719a(f22935h, this, obj3, m32477O((C14009n2) obj3, obj, this.f22969d, function1, obj2)));
        m32484u();
        return C14014p.f22940a;
    }

    /* renamed from: R */
    private final boolean m32480R() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22934g;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f22934g.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    /* renamed from: n */
    private final Void m32481n(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: r */
    private final void m32482r(C11822d0<?> d0Var, Throwable th) {
        boolean z;
        int i = f22934g.get(this) & 536870911;
        if (i != 536870911) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                d0Var.mo45924o(i, th, getContext());
            } catch (Throwable th2) {
                C12079g context = getContext();
                C13986j0.m32424a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    /* renamed from: s */
    private final boolean m32483s(Throwable th) {
        if (!m32472F()) {
            return false;
        }
        C12074d<T> dVar = this.f22937e;
        C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C11831i) dVar).mo49003t(th);
    }

    /* renamed from: u */
    private final void m32484u() {
        if (!m32472F()) {
            mo53795t();
        }
    }

    /* renamed from: v */
    private final void m32485v(int i) {
        if (!m32478P()) {
            C14059z0.m32608a(this, i);
        }
    }

    /* renamed from: x */
    private final C13943d1 m32486x() {
        return (C13943d1) f22936i.get(this);
    }

    /* renamed from: B */
    public void mo53786B() {
        C13943d1 C = m32470C();
        if (C != null && mo53787E()) {
            C.dispose();
            f22936i.set(this, C14001m2.f22925b);
        }
    }

    /* renamed from: E */
    public boolean mo53787E() {
        return !(mo53798z() instanceof C14009n2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public String mo53729I() {
        return "CancellableContinuation";
    }

    /* renamed from: J */
    public final void mo53788J(Throwable th) {
        if (!m32483s(th)) {
            mo49530j(th);
            m32484u();
        }
    }

    /* renamed from: K */
    public final void mo53789K() {
        C11831i iVar;
        Throwable v;
        C12074d<T> dVar = this.f22937e;
        if (dVar instanceof C11831i) {
            iVar = (C11831i) dVar;
        } else {
            iVar = null;
        }
        if (iVar != null && (v = iVar.mo49006v(this)) != null) {
            mo53795t();
            mo49530j(v);
        }
    }

    /* renamed from: L */
    public final boolean mo53790L() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof C13927a0) || ((C13927a0) obj).f22844d == null) {
            f22934g.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, C13941d.f22860b);
            return true;
        }
        mo53795t();
        return false;
    }

    /* renamed from: a */
    public boolean mo49522a() {
        return mo53798z() instanceof C14009n2;
    }

    /* renamed from: b */
    public void mo45900b(C11822d0<?> d0Var, int i) {
        int i2;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22934g;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) == 536870911) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m32471D(d0Var);
    }

    /* renamed from: c */
    public void mo49523c(C13971h0 h0Var, T t) {
        C11831i iVar;
        int i;
        C12074d<T> dVar = this.f22937e;
        C13971h0 h0Var2 = null;
        if (dVar instanceof C11831i) {
            iVar = (C11831i) dVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            h0Var2 = iVar.f18477e;
        }
        if (h0Var2 == h0Var) {
            i = 4;
        } else {
            i = this.f22969d;
        }
        m32476N(this, t, i, (Function1) null, 4, (Object) null);
    }

    /* renamed from: d */
    public void mo48996d(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C14009n2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C13932b0)) {
                if (obj2 instanceof C13927a0) {
                    C13927a0 a0Var = (C13927a0) obj2;
                    if (!a0Var.mo53670c()) {
                        Throwable th2 = th;
                        if (C1248a.m719a(f22935h, this, obj2, C13927a0.m32200b(a0Var, (Object) null, (C13994l) null, (Function1) null, (Object) null, th, 15, (Object) null))) {
                            a0Var.mo53671d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th3 = th;
                    if (C1248a.m719a(f22935h, this, obj2, new C13927a0(obj2, (C13994l) null, (Function1) null, (Object) null, th, 14, (DefaultConstructorMarker) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final C12074d<T> mo48997e() {
        return this.f22937e;
    }

    /* renamed from: f */
    public void mo49526f(Function1<? super Throwable, C11921v> function1) {
        m32471D(m32473G(function1));
    }

    /* renamed from: g */
    public Throwable mo53791g(Object obj) {
        Throwable g = super.mo53791g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    public C12738e getCallerFrame() {
        C12074d<T> dVar = this.f22937e;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public C12079g getContext() {
        return this.f22938f;
    }

    /* renamed from: h */
    public Object mo49528h(T t, Object obj, Function1<? super Throwable, C11921v> function1) {
        return m32479Q(t, obj, function1);
    }

    /* renamed from: i */
    public void mo49529i(T t, Function1<? super Throwable, C11921v> function1) {
        m32475M(t, this.f22969d, function1);
    }

    /* renamed from: j */
    public boolean mo49530j(Throwable th) {
        Object obj;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22935h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof C14009n2)) {
                return false;
            }
            if ((obj instanceof C13994l) || (obj instanceof C11822d0)) {
                z = true;
            }
        } while (!C1248a.m719a(f22935h, this, obj, new C14022r(this, th, z)));
        C14009n2 n2Var = (C14009n2) obj;
        if (n2Var instanceof C13994l) {
            mo53793p((C13994l) obj, th);
        } else if (n2Var instanceof C11822d0) {
            m32482r((C11822d0) obj, th);
        }
        m32484u();
        m32485v(this.f22969d);
        return true;
    }

    /* renamed from: k */
    public <T> T mo53792k(Object obj) {
        if (obj instanceof C13927a0) {
            return ((C13927a0) obj).f22841a;
        }
        return obj;
    }

    /* renamed from: m */
    public Object mo48998m() {
        return mo53798z();
    }

    /* renamed from: o */
    public void mo49531o(Object obj) {
        m32485v(this.f22969d);
    }

    /* renamed from: p */
    public final void mo53793p(C13994l lVar, Throwable th) {
        try {
            lVar.mo49455d(th);
        } catch (Throwable th2) {
            C12079g context = getContext();
            C13986j0.m32424a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: q */
    public final void mo53794q(Function1<? super Throwable, C11921v> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            C12079g context = getContext();
            C13986j0.m32424a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public void resumeWith(Object obj) {
        m32476N(this, C13948e0.m32252c(obj, this), this.f22969d, (Function1) null, 4, (Object) null);
    }

    /* renamed from: t */
    public final void mo53795t() {
        C13943d1 x = m32486x();
        if (x != null) {
            x.dispose();
            f22936i.set(this, C14001m2.f22925b);
        }
    }

    public String toString() {
        return mo53729I() + '(' + C14015p0.m32520c(this.f22937e) + "){" + m32469A() + "}@" + C14015p0.m32519b(this);
    }

    /* renamed from: w */
    public Throwable mo53730w(C14054y1 y1Var) {
        return y1Var.mo53700A();
    }

    /* renamed from: y */
    public final Object mo53797y() {
        C14054y1 y1Var;
        boolean F = m32472F();
        if (m32480R()) {
            if (m32486x() == null) {
                m32470C();
            }
            if (F) {
                mo53789K();
            }
            return C12150d.m26492c();
        }
        if (F) {
            mo53789K();
        }
        Object z = mo53798z();
        if (z instanceof C13932b0) {
            throw ((C13932b0) z).f22850a;
        } else if (!C14059z0.m32609b(this.f22969d) || (y1Var = (C14054y1) getContext().get(C14054y1.f22970b0)) == null || y1Var.mo45937a()) {
            return mo53792k(z);
        } else {
            CancellationException A = y1Var.mo53700A();
            mo48996d(z, A);
            throw A;
        }
    }

    /* renamed from: z */
    public final Object mo53798z() {
        return f22935h.get(this);
    }
}
