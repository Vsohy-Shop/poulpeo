package p099g6;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: g6.i */
final class C7787i<ResultT> implements C7788j<ResultT> {

    /* renamed from: a */
    private final Executor f10823a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10824b = new Object();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public final C7780b<? super ResultT> f10825c;

    public C7787i(Executor executor, C7780b<? super ResultT> bVar) {
        this.f10823a = executor;
        this.f10825c = bVar;
    }

    /* renamed from: a */
    public final void mo41430a(C7781c<ResultT> cVar) {
        if (cVar.mo41428h()) {
            synchronized (this.f10824b) {
                if (this.f10825c != null) {
                    this.f10823a.execute(new C7786h(this, cVar));
                }
            }
        }
    }
}
