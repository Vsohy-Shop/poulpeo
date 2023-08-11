package p168n2;

import com.facebook.bolts.ExecutorException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p168n2.C8884c;
import p251v2.C9925a;
import p336ef.C11921v;

/* renamed from: n2.f */
/* compiled from: Task.kt */
public final class C8890f<TResult> {

    /* renamed from: j */
    public static final ExecutorService f12877j;

    /* renamed from: k */
    private static final Executor f12878k;

    /* renamed from: l */
    public static final Executor f12879l = C8879a.f12861f.mo43004b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C8890f<?> f12880m = new C8890f<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C8890f<Boolean> f12881n = new C8890f<>(Boolean.TRUE);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C8890f<Boolean> f12882o = new C8890f<>(Boolean.FALSE);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C8890f<?> f12883p = new C8890f<>(true);

    /* renamed from: q */
    public static final C8891a f12884q = new C8891a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final ReentrantLock f12885a;

    /* renamed from: b */
    private final Condition f12886b;

    /* renamed from: c */
    private boolean f12887c;

    /* renamed from: d */
    private boolean f12888d;

    /* renamed from: e */
    private TResult f12889e;

    /* renamed from: f */
    private Exception f12890f;

    /* renamed from: g */
    private boolean f12891g;

    /* renamed from: h */
    private C8899h f12892h;

    /* renamed from: i */
    private List<C8889e<TResult, Void>> f12893i = new ArrayList();

    /* renamed from: n2.f$a */
    /* compiled from: Task.kt */
    public static final class C8891a {

        /* renamed from: n2.f$a$a */
        /* compiled from: Task.kt */
        static final class C8892a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C8898g f12894b;

            /* renamed from: c */
            final /* synthetic */ C8889e f12895c;

            /* renamed from: d */
            final /* synthetic */ C8890f f12896d;

            /* renamed from: n2.f$a$a$a */
            /* compiled from: Task.kt */
            static final class C8893a<TTaskResult, TContinuationResult> implements C8889e {

                /* renamed from: a */
                final /* synthetic */ C8892a f12897a;

                C8893a(C8892a aVar) {
                    this.f12897a = aVar;
                }

                /* renamed from: a */
                public final Void then(C8890f<TContinuationResult> fVar) {
                    C12775o.m28639i(fVar, "task");
                    this.f12897a.getClass();
                    if (fVar.mo43015l()) {
                        this.f12897a.f12894b.mo43033b();
                        return null;
                    } else if (fVar.mo43017n()) {
                        this.f12897a.f12894b.mo43034c(fVar.mo43013j());
                        return null;
                    } else {
                        this.f12897a.f12894b.mo43035d(fVar.mo43014k());
                        return null;
                    }
                }
            }

            C8892a(C8888d dVar, C8898g gVar, C8889e eVar, C8890f fVar) {
                this.f12894b = gVar;
                this.f12895c = eVar;
                this.f12896d = fVar;
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            try {
                                C8890f fVar = (C8890f) this.f12895c.then(this.f12896d);
                                if (fVar == null || fVar.mo43009e(new C8893a(this)) == null) {
                                    this.f12894b.mo43035d(null);
                                    C11921v vVar = C11921v.f18618a;
                                }
                            } catch (CancellationException unused) {
                                this.f12894b.mo43033b();
                            } catch (Exception e) {
                                this.f12894b.mo43034c(e);
                            }
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        /* renamed from: n2.f$a$b */
        /* compiled from: Task.kt */
        static final class C8894b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C8898g f12898b;

            /* renamed from: c */
            final /* synthetic */ C8889e f12899c;

            /* renamed from: d */
            final /* synthetic */ C8890f f12900d;

            C8894b(C8888d dVar, C8898g gVar, C8889e eVar, C8890f fVar) {
                this.f12898b = gVar;
                this.f12899c = eVar;
                this.f12900d = fVar;
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            try {
                                this.f12898b.mo43035d(this.f12899c.then(this.f12900d));
                            } catch (CancellationException unused) {
                                this.f12898b.mo43033b();
                            } catch (Exception e) {
                                this.f12898b.mo43034c(e);
                            }
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        private C8891a() {
        }

        public /* synthetic */ C8891a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final <TContinuationResult, TResult> void m18012d(C8898g<TContinuationResult> gVar, C8889e<TResult, C8890f<TContinuationResult>> eVar, C8890f<TResult> fVar, Executor executor, C8888d dVar) {
            try {
                executor.execute(new C8892a(dVar, gVar, eVar, fVar));
            } catch (Exception e) {
                gVar.mo43034c(new ExecutorException(e));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final <TContinuationResult, TResult> void m18013e(C8898g<TContinuationResult> gVar, C8889e<TResult, TContinuationResult> eVar, C8890f<TResult> fVar, Executor executor, C8888d dVar) {
            try {
                executor.execute(new C8894b(dVar, gVar, eVar, fVar));
            } catch (Exception e) {
                gVar.mo43034c(new ExecutorException(e));
            }
        }

        /* renamed from: c */
        public final <TResult> C8890f<TResult> mo43023c() {
            C8890f<TResult> a = C8890f.f12883p;
            if (a != null) {
                return a;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
        }

        /* renamed from: f */
        public final <TResult> C8890f<TResult> mo43024f(Exception exc) {
            C8898g gVar = new C8898g();
            gVar.mo43034c(exc);
            return gVar.mo43032a();
        }

        /* renamed from: g */
        public final <TResult> C8890f<TResult> mo43025g(TResult tresult) {
            C8890f<TResult> fVar;
            if (tresult == null) {
                C8890f<TResult> c = C8890f.f12880m;
                if (c != null) {
                    return c;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
            } else if (tresult instanceof Boolean) {
                if (((Boolean) tresult).booleanValue()) {
                    fVar = C8890f.f12881n;
                } else {
                    fVar = C8890f.f12882o;
                }
                if (fVar != null) {
                    return fVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.bolts.Task<TResult>");
            } else {
                C8898g gVar = new C8898g();
                gVar.mo43035d(tresult);
                return gVar.mo43032a();
            }
        }
    }

    /* renamed from: n2.f$b */
    /* compiled from: Task.kt */
    static final class C8895b<TTaskResult, TContinuationResult> implements C8889e {

        /* renamed from: a */
        final /* synthetic */ C8890f f12901a;

        /* renamed from: b */
        final /* synthetic */ C12755d0 f12902b;

        /* renamed from: c */
        final /* synthetic */ C8898g f12903c;

        /* renamed from: d */
        final /* synthetic */ C8889e f12904d;

        /* renamed from: e */
        final /* synthetic */ Executor f12905e;

        C8895b(C8890f fVar, C12755d0 d0Var, C8898g gVar, C8889e eVar, Executor executor, C8888d dVar) {
            this.f12901a = fVar;
            this.f12902b = d0Var;
            this.f12903c = gVar;
            this.f12904d = eVar;
            this.f12905e = executor;
        }

        /* renamed from: a */
        public final Void then(C8890f<TResult> fVar) {
            C12775o.m28639i(fVar, "task");
            C8890f.f12884q.m18013e(this.f12903c, this.f12904d, fVar, this.f12905e, (C8888d) null);
            return null;
        }
    }

    /* renamed from: n2.f$c */
    /* compiled from: Task.kt */
    static final class C8896c<TTaskResult, TContinuationResult> implements C8889e {

        /* renamed from: a */
        final /* synthetic */ C8890f f12906a;

        /* renamed from: b */
        final /* synthetic */ C12755d0 f12907b;

        /* renamed from: c */
        final /* synthetic */ C8898g f12908c;

        /* renamed from: d */
        final /* synthetic */ C8889e f12909d;

        /* renamed from: e */
        final /* synthetic */ Executor f12910e;

        C8896c(C8890f fVar, C12755d0 d0Var, C8898g gVar, C8889e eVar, Executor executor, C8888d dVar) {
            this.f12906a = fVar;
            this.f12907b = d0Var;
            this.f12908c = gVar;
            this.f12909d = eVar;
            this.f12910e = executor;
        }

        /* renamed from: a */
        public final Void then(C8890f<TResult> fVar) {
            C12775o.m28639i(fVar, "task");
            C8890f.f12884q.m18012d(this.f12908c, this.f12909d, fVar, this.f12910e, (C8888d) null);
            return null;
        }
    }

    /* renamed from: n2.f$d */
    /* compiled from: Task.kt */
    static final class C8897d<TTaskResult, TContinuationResult> implements C8889e {

        /* renamed from: a */
        final /* synthetic */ C8889e f12911a;

        C8897d(C8888d dVar, C8889e eVar) {
            this.f12911a = eVar;
        }

        /* renamed from: a */
        public final C8890f<TContinuationResult> then(C8890f<TResult> fVar) {
            C12775o.m28639i(fVar, "task");
            if (fVar.mo43017n()) {
                return C8890f.f12884q.mo43024f(fVar.mo43013j());
            }
            if (fVar.mo43015l()) {
                return C8890f.f12884q.mo43023c();
            }
            return fVar.mo43009e(this.f12911a);
        }
    }

    static {
        C8884c.C8885a aVar = C8884c.f12871e;
        f12877j = aVar.mo43006b();
        f12878k = aVar.mo43007c();
    }

    public C8890f() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12885a = reentrantLock;
        this.f12886b = reentrantLock.newCondition();
    }

    /* renamed from: i */
    public static final <TResult> C8890f<TResult> m17994i(TResult tresult) {
        return f12884q.mo43025g(tresult);
    }

    /* renamed from: q */
    private final void m17995q() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            List<C8889e<TResult, Void>> list = this.f12893i;
            if (list != null) {
                for (C8889e then : list) {
                    then.then(this);
                }
            }
            this.f12893i = null;
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43009e(C8889e<TResult, TContinuationResult> eVar) {
        C12775o.m28639i(eVar, "continuation");
        return mo43010f(eVar, f12878k, (C8888d) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43010f(C8889e<TResult, TContinuationResult> eVar, Executor executor, C8888d dVar) {
        List<C8889e<TResult, Void>> list;
        C12775o.m28639i(eVar, "continuation");
        C12775o.m28639i(executor, "executor");
        C12755d0 d0Var = new C12755d0();
        C8898g gVar = new C8898g();
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            boolean m = mo43016m();
            d0Var.f20407b = m;
            if (!m && (list = this.f12893i) != null) {
                list.add(new C8895b(this, d0Var, gVar, eVar, executor, dVar));
            }
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            if (d0Var.f20407b) {
                f12884q.m18013e(gVar, eVar, this, executor, dVar);
            }
            return gVar.mo43032a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43011g(C8889e<TResult, C8890f<TContinuationResult>> eVar, Executor executor) {
        C12775o.m28639i(eVar, "continuation");
        C12775o.m28639i(executor, "executor");
        return mo43012h(eVar, executor, (C8888d) null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43012h(C8889e<TResult, C8890f<TContinuationResult>> eVar, Executor executor, C8888d dVar) {
        List<C8889e<TResult, Void>> list;
        C12775o.m28639i(eVar, "continuation");
        C12775o.m28639i(executor, "executor");
        C12755d0 d0Var = new C12755d0();
        C8898g gVar = new C8898g();
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            boolean m = mo43016m();
            d0Var.f20407b = m;
            if (!m && (list = this.f12893i) != null) {
                list.add(new C8896c(this, d0Var, gVar, eVar, executor, dVar));
            }
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            if (d0Var.f20407b) {
                f12884q.m18012d(gVar, eVar, this, executor, dVar);
            }
            return gVar.mo43032a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public final Exception mo43013j() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            if (this.f12890f != null) {
                this.f12891g = true;
                C8899h hVar = this.f12892h;
                if (hVar != null) {
                    hVar.mo43039a();
                    this.f12892h = null;
                }
            }
            return this.f12890f;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    public final TResult mo43014k() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            return this.f12889e;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    public final boolean mo43015l() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            return this.f12888d;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final boolean mo43016m() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            return this.f12887c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final boolean mo43017n() {
        boolean z;
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            if (this.f12890f != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: o */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43018o(C8889e<TResult, TContinuationResult> eVar) {
        C12775o.m28639i(eVar, "continuation");
        return mo43019p(eVar, f12878k, (C8888d) null);
    }

    /* renamed from: p */
    public final <TContinuationResult> C8890f<TContinuationResult> mo43019p(C8889e<TResult, TContinuationResult> eVar, Executor executor, C8888d dVar) {
        C12775o.m28639i(eVar, "continuation");
        C12775o.m28639i(executor, "executor");
        return mo43011g(new C8897d(dVar, eVar), executor);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r */
    public final boolean mo43020r() {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            if (this.f12887c) {
                reentrantLock.unlock();
                return false;
            }
            this.f12887c = true;
            this.f12888d = true;
            this.f12886b.signalAll();
            m17995q();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: s */
    public final boolean mo43021s(Exception exc) {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            if (this.f12887c) {
                return false;
            }
            this.f12887c = true;
            this.f12890f = exc;
            this.f12891g = false;
            this.f12886b.signalAll();
            m17995q();
            boolean z = this.f12891g;
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    public final boolean mo43022t(TResult tresult) {
        ReentrantLock reentrantLock = this.f12885a;
        reentrantLock.lock();
        try {
            if (this.f12887c) {
                reentrantLock.unlock();
                return false;
            }
            this.f12887c = true;
            this.f12889e = tresult;
            this.f12886b.signalAll();
            m17995q();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private C8890f(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12885a = reentrantLock;
        this.f12886b = reentrantLock.newCondition();
        mo43022t(tresult);
    }

    private C8890f(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f12885a = reentrantLock;
        this.f12886b = reentrantLock.newCondition();
        if (z) {
            mo43020r();
        } else {
            mo43022t((Object) null);
        }
    }
}
