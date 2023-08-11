package p168n2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n2.a */
/* compiled from: AndroidExecutors.kt */
public final class C8879a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8879a f12857b = new C8879a();

    /* renamed from: c */
    private static final int f12858c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int f12859d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int f12860e;

    /* renamed from: f */
    public static final C8880a f12861f = new C8880a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Executor f12862a = new C8881b();

    /* renamed from: n2.a$a */
    /* compiled from: AndroidExecutors.kt */
    public static final class C8880a {
        private C8880a() {
        }

        public /* synthetic */ C8880a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ExecutorService mo43003a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C8879a.f12859d, C8879a.f12860e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        /* renamed from: b */
        public final Executor mo43004b() {
            return C8879a.f12857b.f12862a;
        }
    }

    /* renamed from: n2.a$b */
    /* compiled from: AndroidExecutors.kt */
    private static final class C8881b implements Executor {
        public void execute(Runnable runnable) {
            C12775o.m28639i(runnable, "command");
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f12858c = availableProcessors;
        f12859d = availableProcessors + 1;
        f12860e = (availableProcessors * 2) + 1;
    }

    private C8879a() {
    }
}
