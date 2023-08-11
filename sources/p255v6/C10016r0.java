package p255v6;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p276x5.C10394a;
import p276x5.C10406g;

/* renamed from: v6.r0 */
/* compiled from: Utils */
public final class C10016r0 {

    /* renamed from: a */
    private static final ExecutorService f15066a = C10021u.m21020c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: v6.r0$a */
    /* compiled from: Utils */
    class C10017a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Callable f15067b;

        /* renamed from: c */
        final /* synthetic */ C10406g f15068c;

        /* renamed from: v6.r0$a$a */
        /* compiled from: Utils */
        class C10018a implements C10394a<T, Void> {
            C10018a() {
            }

            /* renamed from: b */
            public Void mo39780a(@NonNull Task<T> task) {
                if (task.mo35465p()) {
                    C10017a.this.f15068c.mo45098c(task.mo35461l());
                    return null;
                }
                C10017a.this.f15068c.mo45097b(task.mo35460k());
                return null;
            }
        }

        C10017a(Callable callable, C10406g gVar) {
            this.f15067b = callable;
            this.f15068c = gVar;
        }

        public void run() {
            try {
                ((Task) this.f15067b.call()).mo35458i(new C10018a());
            } catch (Exception e) {
                this.f15068c.mo45097b(e);
            }
        }
    }

    /* renamed from: d */
    public static <T> T m20999d(Task<T> task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo35457h(f15066a, new C10009o0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (task.mo35465p()) {
            return task.mo35461l();
        }
        if (task.mo35463n()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.mo35464o()) {
            throw new IllegalStateException(task.mo35460k());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: e */
    public static <T> Task<T> m21000e(Executor executor, Callable<Task<T>> callable) {
        C10406g gVar = new C10406g();
        executor.execute(new C10017a(callable, gVar));
        return gVar.mo45096a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Void m21002g(C10406g gVar, Task task) {
        if (task.mo35465p()) {
            gVar.mo45100e(task.mo35461l());
            return null;
        }
        Exception k = task.mo35460k();
        Objects.requireNonNull(k);
        gVar.mo45099d(k);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Void m21003h(C10406g gVar, Task task) {
        if (task.mo35465p()) {
            gVar.mo45100e(task.mo35461l());
            return null;
        }
        Exception k = task.mo35460k();
        Objects.requireNonNull(k);
        gVar.mo45099d(k);
        return null;
    }

    /* renamed from: i */
    public static <T> Task<T> m21004i(Task<T> task, Task<T> task2) {
        C10406g gVar = new C10406g();
        C10014q0 q0Var = new C10014q0(gVar);
        task.mo35458i(q0Var);
        task2.mo35458i(q0Var);
        return gVar.mo45096a();
    }

    /* renamed from: j */
    public static <T> Task<T> m21005j(Executor executor, Task<T> task, Task<T> task2) {
        C10406g gVar = new C10406g();
        C10011p0 p0Var = new C10011p0(gVar);
        task.mo35457h(executor, p0Var);
        task2.mo35457h(executor, p0Var);
        return gVar.mo45096a();
    }
}
