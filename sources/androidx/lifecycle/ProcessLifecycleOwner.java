package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ProcessLifecycleOwner.kt */
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long TIMEOUT_MS = 700;
    /* access modifiers changed from: private */
    public static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private final Runnable delayedPauseRunnable = new C2342e(this);
    private Handler handler;
    /* access modifiers changed from: private */
    public final ReportFragment.ActivityInitializationListener initializationListener = new ProcessLifecycleOwner$initializationListener$1(this);
    private boolean pauseSent = true;
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    private int resumedCounter;
    private int startedCounter;
    private boolean stopSent = true;

    @RequiresApi(29)
    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @DoNotInline
        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C12775o.m28639i(activity, "activity");
            C12775o.m28639i(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* access modifiers changed from: private */
    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner processLifecycleOwner) {
        C12775o.m28639i(processLifecycleOwner, "this$0");
        processLifecycleOwner.dispatchPauseIfNeeded$lifecycle_process_release();
        processLifecycleOwner.dispatchStopIfNeeded$lifecycle_process_release();
    }

    public static final LifecycleOwner get() {
        return Companion.get();
    }

    public static final void init$lifecycle_process_release(Context context) {
        Companion.init$lifecycle_process_release(context);
    }

    public final void activityPaused$lifecycle_process_release() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler2 = this.handler;
            C12775o.m28636f(handler2);
            handler2.postDelayed(this.delayedPauseRunnable, 700);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i != 1) {
            return;
        }
        if (this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            this.pauseSent = false;
            return;
        }
        Handler handler2 = this.handler;
        C12775o.m28636f(handler2);
        handler2.removeCallbacks(this.delayedPauseRunnable);
    }

    public final void activityStarted$lifecycle_process_release() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(Context context) {
        C12775o.m28639i(context, "context");
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C12775o.m28637g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$attach$1(this));
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        public final void init$lifecycle_process_release(Context context) {
            C12775o.m28639i(context, "context");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }

        @VisibleForTesting
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }
    }
}
