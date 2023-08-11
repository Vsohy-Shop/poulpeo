package p356hg;

import androidx.concurrent.futures.C1248a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11822d0;
import p331dg.C11828g0;
import p336ef.C11921v;
import p349gg.C12027b;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13089p;
import p466yf.C13945d3;
import p466yf.C13971h0;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14015p0;
import p466yf.C14018q;

@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n332#2,12:301\n1#3:313\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n168#1:301,12\n*E\n"})
/* renamed from: hg.b */
/* compiled from: Mutex.kt */
public class C12090b extends C12098e implements C12088a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f18920i = AtomicReferenceFieldUpdater.newUpdater(C12090b.class, Object.class, "owner");

    /* renamed from: h */
    private final C13089p<C12027b<?>, Object, Object, Function1<Throwable, C11921v>> f18921h;
    private volatile Object owner;

    @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
    /* renamed from: hg.b$a */
    /* compiled from: Mutex.kt */
    private final class C12091a implements C14002n<C11921v>, C13945d3 {

        /* renamed from: b */
        public final C14010o<C11921v> f18922b;

        /* renamed from: c */
        public final Object f18923c;

        /* renamed from: hg.b$a$a */
        /* compiled from: Mutex.kt */
        static final class C12092a extends C12777p implements Function1<Throwable, C11921v> {

            /* renamed from: g */
            final /* synthetic */ C12090b f18925g;

            /* renamed from: h */
            final /* synthetic */ C12091a f18926h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12092a(C12090b bVar, C12091a aVar) {
                super(1);
                this.f18925g = bVar;
                this.f18926h = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Throwable th) {
                this.f18925g.mo49519f(this.f18926h.f18923c);
            }
        }

        @SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
        /* renamed from: hg.b$a$b */
        /* compiled from: Mutex.kt */
        static final class C12093b extends C12777p implements Function1<Throwable, C11921v> {

            /* renamed from: g */
            final /* synthetic */ C12090b f18927g;

            /* renamed from: h */
            final /* synthetic */ C12091a f18928h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12093b(C12090b bVar, C12091a aVar) {
                super(1);
                this.f18927g = bVar;
                this.f18928h = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Throwable th) {
                C12090b.f18920i.set(this.f18927g, this.f18928h.f18923c);
                this.f18927g.mo49519f(this.f18928h.f18923c);
            }
        }

        public C12091a(C14010o<? super C11921v> oVar, Object obj) {
            this.f18922b = oVar;
            this.f18923c = obj;
        }

        /* renamed from: a */
        public boolean mo49522a() {
            return this.f18922b.mo49522a();
        }

        /* renamed from: b */
        public void mo45900b(C11822d0<?> d0Var, int i) {
            this.f18922b.mo45900b(d0Var, i);
        }

        /* renamed from: d */
        public void mo49529i(C11921v vVar, Function1<? super Throwable, C11921v> function1) {
            C12090b.f18920i.set(C12090b.this, this.f18923c);
            this.f18922b.mo49529i(vVar, new C12092a(C12090b.this, this));
        }

        /* renamed from: e */
        public void mo49523c(C13971h0 h0Var, C11921v vVar) {
            this.f18922b.mo49523c(h0Var, vVar);
        }

        /* renamed from: f */
        public void mo49526f(Function1<? super Throwable, C11921v> function1) {
            this.f18922b.mo49526f(function1);
        }

        /* renamed from: g */
        public Object mo49528h(C11921v vVar, Object obj, Function1<? super Throwable, C11921v> function1) {
            Object h = this.f18922b.mo49528h(vVar, obj, new C12093b(C12090b.this, this));
            if (h != null) {
                C12090b.f18920i.set(C12090b.this, this.f18923c);
            }
            return h;
        }

        public C12079g getContext() {
            return this.f18922b.getContext();
        }

        /* renamed from: j */
        public boolean mo49530j(Throwable th) {
            return this.f18922b.mo49530j(th);
        }

        /* renamed from: o */
        public void mo49531o(Object obj) {
            this.f18922b.mo49531o(obj);
        }

        public void resumeWith(Object obj) {
            this.f18922b.resumeWith(obj);
        }
    }

    /* renamed from: hg.b$b */
    /* compiled from: Mutex.kt */
    static final class C12094b extends C12777p implements C13089p<C12027b<?>, Object, Object, Function1<? super Throwable, ? extends C11921v>> {

        /* renamed from: g */
        final /* synthetic */ C12090b f18929g;

        /* renamed from: hg.b$b$a */
        /* compiled from: Mutex.kt */
        static final class C12095a extends C12777p implements Function1<Throwable, C11921v> {

            /* renamed from: g */
            final /* synthetic */ C12090b f18930g;

            /* renamed from: h */
            final /* synthetic */ Object f18931h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12095a(C12090b bVar, Object obj) {
                super(1);
                this.f18930g = bVar;
                this.f18931h = obj;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Throwable th) {
                this.f18930g.mo49519f(this.f18931h);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12094b(C12090b bVar) {
            super(3);
            this.f18929g = bVar;
        }

        /* renamed from: a */
        public final Function1<Throwable, C11921v> invoke(C12027b<?> bVar, Object obj, Object obj2) {
            return new C12095a(this.f18929g, obj);
        }
    }

    public C12090b(boolean z) {
        super(1, z ? 1 : 0);
        C11828g0 g0Var;
        if (z) {
            g0Var = null;
        } else {
            g0Var = C12096c.f18932a;
        }
        this.owner = g0Var;
        this.f18921h = new C12094b(this);
    }

    /* renamed from: s */
    static /* synthetic */ Object m26275s(C12090b bVar, Object obj, C12074d<? super C11921v> dVar) {
        if (bVar.mo49517d(obj)) {
            return C11921v.f18618a;
        }
        Object t = bVar.m26276t(obj, dVar);
        if (t == C12150d.m26492c()) {
            return t;
        }
        return C11921v.f18618a;
    }

    /* renamed from: t */
    private final Object m26276t(Object obj, C12074d<? super C11921v> dVar) {
        C14010o b = C14018q.m32525b(C12147c.m26491b(dVar));
        try {
            mo49540i(new C12091a(b, obj));
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

    /* renamed from: u */
    private final int m26277u(Object obj) {
        while (!mo49538g()) {
            if (obj == null) {
                return 1;
            }
            if (mo49520r(obj)) {
                return 2;
            }
            if (mo49518e()) {
                return 1;
            }
        }
        f18920i.set(this, obj);
        return 0;
    }

    /* renamed from: a */
    public Object mo49516a(Object obj, C12074d<? super C11921v> dVar) {
        return m26275s(this, obj, dVar);
    }

    /* renamed from: d */
    public boolean mo49517d(Object obj) {
        int u = m26277u(obj);
        if (u == 0) {
            return true;
        }
        if (u == 1) {
            return false;
        }
        if (u != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: e */
    public boolean mo49518e() {
        if (mo49536b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo49519f(Object obj) {
        boolean z;
        while (mo49518e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18920i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != C12096c.f18932a) {
                if (obj2 == obj || obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (C1248a.m719a(atomicReferenceFieldUpdater, this, obj2, C12096c.f18932a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* renamed from: r */
    public boolean mo49520r(Object obj) {
        while (mo49518e()) {
            Object obj2 = f18920i.get(this);
            if (obj2 != C12096c.f18932a) {
                if (obj2 == obj) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String toString() {
        return "Mutex@" + C14015p0.m32519b(this) + "[isLocked=" + mo49518e() + ",owner=" + f18920i.get(this) + ']';
    }
}
