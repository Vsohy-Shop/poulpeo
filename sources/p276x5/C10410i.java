package p276x5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p231t4.C9713p;

/* renamed from: x5.i */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class C10410i {
    /* renamed from: a */
    public static <TResult> TResult m21827a(@NonNull Task<TResult> task) {
        C9713p.m20273h();
        C9713p.m20276k(task, "Task must not be null");
        if (task.mo35464o()) {
            return m21836j(task);
        }
        C10413l lVar = new C10413l((C10412k) null);
        m21837k(task, lVar);
        lVar.mo45107c();
        return m21836j(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m21828b(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) {
        C9713p.m20273h();
        C9713p.m20276k(task, "Task must not be null");
        C9713p.m20276k(timeUnit, "TimeUnit must not be null");
        if (task.mo35464o()) {
            return m21836j(task);
        }
        C10413l lVar = new C10413l((C10412k) null);
        m21837k(task, lVar);
        if (lVar.mo45108d(j, timeUnit)) {
            return m21836j(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m21829c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C9713p.m20276k(executor, "Executor must not be null");
        C9713p.m20276k(callable, "Callback must not be null");
        C10407g0 g0Var = new C10407g0();
        executor.execute(new C10409h0(g0Var, callable));
        return g0Var;
    }

    @NonNull
    /* renamed from: d */
    public static <TResult> Task<TResult> m21830d(@NonNull Exception exc) {
        C10407g0 g0Var = new C10407g0();
        g0Var.mo45101s(exc);
        return g0Var;
    }

    @NonNull
    /* renamed from: e */
    public static <TResult> Task<TResult> m21831e(TResult tresult) {
        C10407g0 g0Var = new C10407g0();
        g0Var.mo45102t(tresult);
        return g0Var;
    }

    @NonNull
    /* renamed from: f */
    public static Task<Void> m21832f(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m21831e((Object) null);
        }
        for (Task task : collection) {
            if (task == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C10407g0 g0Var = new C10407g0();
        C10415n nVar = new C10415n(collection.size(), g0Var);
        for (Task k : collection) {
            m21837k(k, nVar);
        }
        return g0Var;
    }

    @NonNull
    /* renamed from: g */
    public static Task<Void> m21833g(@Nullable Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m21831e((Object) null);
        }
        return m21832f(Arrays.asList(taskArr));
    }

    @NonNull
    /* renamed from: h */
    public static Task<List<Task<?>>> m21834h(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m21831e(Collections.emptyList());
        }
        return m21832f(collection).mo35459j(C10408h.f15694a, new C10411j(collection));
    }

    @NonNull
    /* renamed from: i */
    public static Task<List<Task<?>>> m21835i(@Nullable Task<?>... taskArr) {
        if (taskArr == null || taskArr.length == 0) {
            return m21831e(Collections.emptyList());
        }
        return m21834h(Arrays.asList(taskArr));
    }

    /* renamed from: j */
    private static <TResult> TResult m21836j(@NonNull Task<TResult> task) {
        if (task.mo35465p()) {
            return task.mo35461l();
        }
        if (task.mo35463n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo35460k());
    }

    /* renamed from: k */
    private static <T> void m21837k(Task<T> task, C10414m<? super T> mVar) {
        Executor executor = C10408h.f15695b;
        task.mo35455f(executor, mVar);
        task.mo35453d(executor, mVar);
        task.mo35450a(executor, mVar);
    }
}
