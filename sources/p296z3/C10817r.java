package p296z3;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;
import p296z3.C10812p;

/* renamed from: z3.r */
final class C10817r extends FutureTask {

    /* renamed from: b */
    private final /* synthetic */ C10812p.C10813a f16569b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C10817r(C10812p.C10813a aVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f16569b = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler j = C10812p.this.f16564f;
        if (j != null) {
            j.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
