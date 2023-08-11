package p255v6;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p276x5.C10394a;
import p276x5.C10410i;

/* renamed from: v6.h */
/* compiled from: CrashlyticsBackgroundWorker */
public class C9975h {

    /* renamed from: a */
    private final Executor f14968a;

    /* renamed from: b */
    private Task<Void> f14969b = C10410i.m21831e(null);

    /* renamed from: c */
    private final Object f14970c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ThreadLocal<Boolean> f14971d = new ThreadLocal<>();

    /* renamed from: v6.h$a */
    /* compiled from: CrashlyticsBackgroundWorker */
    class C9976a implements Runnable {
        C9976a() {
        }

        public void run() {
            C9975h.this.f14971d.set(Boolean.TRUE);
        }
    }

    /* renamed from: v6.h$b */
    /* compiled from: CrashlyticsBackgroundWorker */
    class C9977b implements Callable<Void> {

        /* renamed from: b */
        final /* synthetic */ Runnable f14973b;

        C9977b(Runnable runnable) {
            this.f14973b = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f14973b.run();
            return null;
        }
    }

    /* renamed from: v6.h$c */
    /* compiled from: CrashlyticsBackgroundWorker */
    class C9978c implements C10394a<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f14975a;

        C9978c(Callable callable) {
            this.f14975a = callable;
        }

        /* renamed from: a */
        public T mo39780a(@NonNull Task<Void> task) {
            return this.f14975a.call();
        }
    }

    /* renamed from: v6.h$d */
    /* compiled from: CrashlyticsBackgroundWorker */
    class C9979d implements C10394a<T, Void> {
        C9979d() {
        }

        /* renamed from: b */
        public Void mo39780a(@NonNull Task<T> task) {
            return null;
        }
    }

    public C9975h(Executor executor) {
        this.f14968a = executor;
        executor.execute(new C9976a());
    }

    /* renamed from: d */
    private <T> Task<Void> m20840d(Task<T> task) {
        return task.mo35457h(this.f14968a, new C9979d());
    }

    /* renamed from: e */
    private boolean m20841e() {
        return Boolean.TRUE.equals(this.f14971d.get());
    }

    /* renamed from: f */
    private <T> C10394a<Void, T> m20842f(Callable<T> callable) {
        return new C9978c(callable);
    }

    /* renamed from: b */
    public void mo44524b() {
        if (!m20841e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo44525c() {
        return this.f14968a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Task<Void> mo44526g(Runnable runnable) {
        return mo44527h(new C9977b(runnable));
    }

    /* renamed from: h */
    public <T> Task<T> mo44527h(Callable<T> callable) {
        Task<TContinuationResult> h;
        synchronized (this.f14970c) {
            h = this.f14969b.mo35457h(this.f14968a, m20842f(callable));
            this.f14969b = m20840d(h);
        }
        return h;
    }

    /* renamed from: i */
    public <T> Task<T> mo44528i(Callable<Task<T>> callable) {
        Task<TContinuationResult> j;
        synchronized (this.f14970c) {
            j = this.f14969b.mo35459j(this.f14968a, m20842f(callable));
            this.f14969b = m20840d(j);
        }
        return j;
    }
}
