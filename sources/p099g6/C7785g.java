package p099g6;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: g6.g */
final class C7785g<ResultT> implements C7788j<ResultT> {

    /* renamed from: a */
    private final Executor f10818a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10819b = new Object();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public final C7779a f10820c;

    public C7785g(Executor executor, C7779a aVar) {
        this.f10818a = executor;
        this.f10820c = aVar;
    }

    /* renamed from: a */
    public final void mo41430a(C7781c<ResultT> cVar) {
        if (!cVar.mo41428h()) {
            synchronized (this.f10819b) {
                if (this.f10820c != null) {
                    this.f10818a.execute(new C7784f(this, cVar));
                }
            }
        }
    }
}
