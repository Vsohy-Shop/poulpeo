package p099g6;

import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
import p037b6.C2922p;

/* renamed from: g6.o */
final class C7793o<ResultT> extends C7781c<ResultT> {

    /* renamed from: a */
    private final Object f10831a = new Object();

    /* renamed from: b */
    private final C7789k<ResultT> f10832b = new C7789k<>();

    /* renamed from: c */
    private boolean f10833c;

    /* renamed from: d */
    private ResultT f10834d;

    /* renamed from: e */
    private Exception f10835e;

    C7793o() {
    }

    /* renamed from: i */
    private final void m15193i() {
        C2922p.m2383c(this.f10833c, "Task is not yet complete");
    }

    /* renamed from: l */
    private final void m15194l() {
        C2922p.m2383c(!this.f10833c, "Task is already complete");
    }

    /* renamed from: o */
    private final void m15195o() {
        synchronized (this.f10831a) {
            if (this.f10833c) {
                this.f10832b.mo41432a(this);
            }
        }
    }

    /* renamed from: a */
    public final C7781c<ResultT> mo41421a(C7779a aVar) {
        mo41422b(C7782d.f10814a, aVar);
        return this;
    }

    /* renamed from: b */
    public final C7781c<ResultT> mo41422b(Executor executor, C7779a aVar) {
        this.f10832b.mo41433b(new C7785g(executor, aVar));
        m15195o();
        return this;
    }

    /* renamed from: c */
    public final C7781c<ResultT> mo41423c(C7780b<? super ResultT> bVar) {
        mo41424d(C7782d.f10814a, bVar);
        return this;
    }

    /* renamed from: d */
    public final C7781c<ResultT> mo41424d(Executor executor, C7780b<? super ResultT> bVar) {
        this.f10832b.mo41433b(new C7787i(executor, bVar));
        m15195o();
        return this;
    }

    @Nullable
    /* renamed from: e */
    public final Exception mo41425e() {
        Exception exc;
        synchronized (this.f10831a) {
            exc = this.f10835e;
        }
        return exc;
    }

    /* renamed from: f */
    public final ResultT mo41426f() {
        ResultT resultt;
        synchronized (this.f10831a) {
            m15193i();
            Exception exc = this.f10835e;
            if (exc == null) {
                resultt = this.f10834d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    /* renamed from: g */
    public final boolean mo41427g() {
        boolean z;
        synchronized (this.f10831a) {
            z = this.f10833c;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo41428h() {
        boolean z;
        synchronized (this.f10831a) {
            z = false;
            if (this.f10833c && this.f10835e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final void mo41441j(Exception exc) {
        synchronized (this.f10831a) {
            m15194l();
            this.f10833c = true;
            this.f10835e = exc;
        }
        this.f10832b.mo41432a(this);
    }

    /* renamed from: k */
    public final void mo41442k(ResultT resultt) {
        synchronized (this.f10831a) {
            m15194l();
            this.f10833c = true;
            this.f10834d = resultt;
        }
        this.f10832b.mo41432a(this);
    }

    /* renamed from: m */
    public final boolean mo41443m(Exception exc) {
        synchronized (this.f10831a) {
            if (this.f10833c) {
                return false;
            }
            this.f10833c = true;
            this.f10835e = exc;
            this.f10832b.mo41432a(this);
            return true;
        }
    }

    /* renamed from: n */
    public final boolean mo41444n(ResultT resultt) {
        synchronized (this.f10831a) {
            if (this.f10833c) {
                return false;
            }
            this.f10833c = true;
            this.f10834d = resultt;
            this.f10832b.mo41432a(this);
            return true;
        }
    }
}
