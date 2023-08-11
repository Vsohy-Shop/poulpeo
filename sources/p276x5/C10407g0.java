package p276x5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p231t4.C9713p;

/* renamed from: x5.g0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10407g0<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f15688a = new Object();

    /* renamed from: b */
    private final C10401d0<TResult> f15689b = new C10401d0<>();

    /* renamed from: c */
    private boolean f15690c;

    /* renamed from: d */
    private volatile boolean f15691d;
    @Nullable

    /* renamed from: e */
    private TResult f15692e;

    /* renamed from: f */
    private Exception f15693f;

    C10407g0() {
    }

    /* renamed from: A */
    private final void m21800A() {
        synchronized (this.f15688a) {
            if (this.f15690c) {
                this.f15689b.mo45093b(this);
            }
        }
    }

    /* renamed from: x */
    private final void m21801x() {
        C9713p.m20279n(this.f15690c, "Task is not yet complete");
    }

    /* renamed from: y */
    private final void m21802y() {
        if (this.f15691d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: z */
    private final void m21803z() {
        if (this.f15690c) {
            throw DuplicateTaskCompletionException.m11270a(this);
        }
    }

    @NonNull
    /* renamed from: a */
    public final Task<TResult> mo35450a(@NonNull Executor executor, @NonNull C10396b bVar) {
        this.f15689b.mo45092a(new C10421t(executor, bVar));
        m21800A();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final Task<TResult> mo35451b(@NonNull Executor executor, @NonNull C10398c<TResult> cVar) {
        this.f15689b.mo45092a(new C10423v(executor, cVar));
        m21800A();
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final Task<TResult> mo35452c(@NonNull C10398c<TResult> cVar) {
        this.f15689b.mo45092a(new C10423v(C10408h.f15694a, cVar));
        m21800A();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final Task<TResult> mo35453d(@NonNull Executor executor, @NonNull C10400d dVar) {
        this.f15689b.mo45092a(new C10425x(executor, dVar));
        m21800A();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final Task<TResult> mo35454e(@NonNull C10400d dVar) {
        mo35453d(C10408h.f15694a, dVar);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final Task<TResult> mo35455f(@NonNull Executor executor, @NonNull C10402e<? super TResult> eVar) {
        this.f15689b.mo45092a(new C10427z(executor, eVar));
        m21800A();
        return this;
    }

    @NonNull
    /* renamed from: g */
    public final Task<TResult> mo35456g(@NonNull C10402e<? super TResult> eVar) {
        mo35455f(C10408h.f15694a, eVar);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo35457h(@NonNull Executor executor, @NonNull C10394a<TResult, TContinuationResult> aVar) {
        C10407g0 g0Var = new C10407g0();
        this.f15689b.mo45092a(new C10417p(executor, aVar, g0Var));
        m21800A();
        return g0Var;
    }

    @NonNull
    /* renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo35458i(@NonNull C10394a<TResult, TContinuationResult> aVar) {
        return mo35457h(C10408h.f15694a, aVar);
    }

    @NonNull
    /* renamed from: j */
    public final <TContinuationResult> Task<TContinuationResult> mo35459j(@NonNull Executor executor, @NonNull C10394a<TResult, Task<TContinuationResult>> aVar) {
        C10407g0 g0Var = new C10407g0();
        this.f15689b.mo45092a(new C10419r(executor, aVar, g0Var));
        m21800A();
        return g0Var;
    }

    @Nullable
    /* renamed from: k */
    public final Exception mo35460k() {
        Exception exc;
        synchronized (this.f15688a) {
            exc = this.f15693f;
        }
        return exc;
    }

    /* renamed from: l */
    public final TResult mo35461l() {
        TResult tresult;
        synchronized (this.f15688a) {
            m21801x();
            m21802y();
            Exception exc = this.f15693f;
            if (exc == null) {
                tresult = this.f15692e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final <X extends Throwable> TResult mo35462m(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f15688a) {
            m21801x();
            m21802y();
            if (!cls.isInstance(this.f15693f)) {
                Exception exc = this.f15693f;
                if (exc == null) {
                    tresult = this.f15692e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f15693f));
            }
        }
        return tresult;
    }

    /* renamed from: n */
    public final boolean mo35463n() {
        return this.f15691d;
    }

    /* renamed from: o */
    public final boolean mo35464o() {
        boolean z;
        synchronized (this.f15688a) {
            z = this.f15690c;
        }
        return z;
    }

    /* renamed from: p */
    public final boolean mo35465p() {
        boolean z;
        synchronized (this.f15688a) {
            z = false;
            if (this.f15690c && !this.f15691d && this.f15693f == null) {
                z = true;
            }
        }
        return z;
    }

    @NonNull
    /* renamed from: q */
    public final <TContinuationResult> Task<TContinuationResult> mo35466q(Executor executor, C10404f<TResult, TContinuationResult> fVar) {
        C10407g0 g0Var = new C10407g0();
        this.f15689b.mo45092a(new C10397b0(executor, fVar, g0Var));
        m21800A();
        return g0Var;
    }

    @NonNull
    /* renamed from: r */
    public final <TContinuationResult> Task<TContinuationResult> mo35467r(@NonNull C10404f<TResult, TContinuationResult> fVar) {
        Executor executor = C10408h.f15694a;
        C10407g0 g0Var = new C10407g0();
        this.f15689b.mo45092a(new C10397b0(executor, fVar, g0Var));
        m21800A();
        return g0Var;
    }

    /* renamed from: s */
    public final void mo45101s(@NonNull Exception exc) {
        C9713p.m20276k(exc, "Exception must not be null");
        synchronized (this.f15688a) {
            m21803z();
            this.f15690c = true;
            this.f15693f = exc;
        }
        this.f15689b.mo45093b(this);
    }

    /* renamed from: t */
    public final void mo45102t(@Nullable TResult tresult) {
        synchronized (this.f15688a) {
            m21803z();
            this.f15690c = true;
            this.f15692e = tresult;
        }
        this.f15689b.mo45093b(this);
    }

    /* renamed from: u */
    public final boolean mo45103u() {
        synchronized (this.f15688a) {
            if (this.f15690c) {
                return false;
            }
            this.f15690c = true;
            this.f15691d = true;
            this.f15689b.mo45093b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean mo45104v(@NonNull Exception exc) {
        C9713p.m20276k(exc, "Exception must not be null");
        synchronized (this.f15688a) {
            if (this.f15690c) {
                return false;
            }
            this.f15690c = true;
            this.f15693f = exc;
            this.f15689b.mo45093b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo45105w(@Nullable TResult tresult) {
        synchronized (this.f15688a) {
            if (this.f15690c) {
                return false;
            }
            this.f15690c = true;
            this.f15692e = tresult;
            this.f15689b.mo45093b(this);
            return true;
        }
    }
}
