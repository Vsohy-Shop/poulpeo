package p331dg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13937c0;
import p466yf.C13948e0;
import p466yf.C13971h0;
import p466yf.C13974h1;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14015p0;
import p466yf.C14047w2;
import p466yf.C14053y0;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n241#1,8:379\n253#1:387\n254#1,2:398\n256#1:402\n1#2:316\n1#2:322\n1#2:363\n295#3,5:317\n300#3,12:323\n312#3:357\n295#3,5:358\n300#3,12:364\n312#3:417\n198#4,3:335\n201#4,14:343\n198#4,3:376\n201#4,14:403\n95#5,5:338\n107#5,10:388\n118#5,2:400\n107#5,13:418\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n222#1:379,8\n223#1:387\n223#1:398,2\n223#1:402\n200#1:322\n221#1:363\n200#1:317,5\n200#1:323,12\n200#1:357\n221#1:358,5\n221#1:364,12\n221#1:417\n200#1:335,3\n200#1:343,14\n221#1:376,3\n221#1:403,14\n201#1:338,5\n223#1:388,10\n223#1:400,2\n253#1:418,13\n*E\n"})
/* renamed from: dg.i */
/* compiled from: DispatchedContinuation.kt */
public final class C11831i<T> extends C14053y0<T> implements C12738e, C12074d<T> {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f18476i = AtomicReferenceFieldUpdater.newUpdater(C11831i.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e */
    public final C13971h0 f18477e;

    /* renamed from: f */
    public final C12074d<T> f18478f;

    /* renamed from: g */
    public Object f18479g = C11833j.f18482a;

    /* renamed from: h */
    public final Object f18480h = C11836k0.m25498b(getContext());

    public C11831i(C13971h0 h0Var, C12074d<? super T> dVar) {
        super(-1);
        this.f18477e = h0Var;
        this.f18478f = dVar;
    }

    /* renamed from: r */
    private final C14010o<?> m25468r() {
        Object obj = f18476i.get(this);
        if (obj instanceof C14010o) {
            return (C14010o) obj;
        }
        return null;
    }

    /* renamed from: d */
    public void mo48996d(Object obj, Throwable th) {
        if (obj instanceof C13937c0) {
            ((C13937c0) obj).f22857b.invoke(th);
        }
    }

    public C12738e getCallerFrame() {
        C12074d<T> dVar = this.f18478f;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public C12079g getContext() {
        return this.f18478f.getContext();
    }

    /* renamed from: m */
    public Object mo48998m() {
        Object obj = this.f18479g;
        this.f18479g = C11833j.f18482a;
        return obj;
    }

    /* renamed from: n */
    public final void mo48999n() {
        do {
        } while (f18476i.get(this) == C11833j.f18483b);
    }

    /* renamed from: p */
    public final C14010o<T> mo49000p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18476i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f18476i.set(this, C11833j.f18483b);
                return null;
            } else if (obj instanceof C14010o) {
                if (C1248a.m719a(f18476i, this, obj, C11833j.f18483b)) {
                    return (C14010o) obj;
                }
            } else if (obj != C11833j.f18483b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: q */
    public final void mo49001q(C12079g gVar, T t) {
        this.f18479g = t;
        this.f22969d = 1;
        this.f18477e.dispatchYield(gVar, this);
    }

    public void resumeWith(Object obj) {
        C12079g context;
        Object c;
        C12079g context2 = this.f18478f.getContext();
        Object d = C13948e0.m32253d(obj, (Function1) null, 1, (Object) null);
        if (this.f18477e.isDispatchNeeded(context2)) {
            this.f18479g = d;
            this.f22969d = 0;
            this.f18477e.dispatch(context2, this);
            return;
        }
        C13974h1 b = C14047w2.f22961a.mo53812b();
        if (b.mo53749A0()) {
            this.f18479g = d;
            this.f22969d = 0;
            b.mo53756w0(this);
            return;
        }
        b.mo53758y0(true);
        try {
            context = getContext();
            c = C11836k0.m25499c(context, this.f18480h);
            this.f18478f.resumeWith(obj);
            C11921v vVar = C11921v.f18618a;
            C11836k0.m25497a(context, c);
            do {
            } while (b.mo53752D0());
        } catch (Throwable th) {
            try {
                mo53819l(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo53755t0(true);
                throw th2;
            }
        }
        b.mo53755t0(true);
    }

    /* renamed from: s */
    public final boolean mo49002s() {
        if (f18476i.get(this) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo49003t(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18476i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C11828g0 g0Var = C11833j.f18483b;
            if (C12775o.m28634d(obj, g0Var)) {
                if (C1248a.m719a(f18476i, this, g0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C1248a.m719a(f18476i, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f18477e + ", " + C14015p0.m32520c(this.f18478f) + ']';
    }

    /* renamed from: u */
    public final void mo49005u() {
        mo48999n();
        C14010o<?> r = m25468r();
        if (r != null) {
            r.mo53795t();
        }
    }

    /* renamed from: v */
    public final Throwable mo49006v(C14002n<?> nVar) {
        C11828g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18476i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            g0Var = C11833j.f18483b;
            if (obj != g0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C1248a.m719a(f18476i, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C1248a.m719a(f18476i, this, g0Var, nVar));
        return null;
    }

    /* renamed from: e */
    public C12074d<T> mo48997e() {
        return this;
    }
}
