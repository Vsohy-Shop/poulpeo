package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;

/* compiled from: LifecycleDispatcher.kt */
public final class LifecycleDispatcher {
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @VisibleForTesting
    /* compiled from: LifecycleDispatcher.kt */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }

    private LifecycleDispatcher() {
    }

    public static final void init(Context context) {
        C12775o.m28639i(context, "context");
        if (!initialized.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            C12775o.m28637g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
        }
    }
}
