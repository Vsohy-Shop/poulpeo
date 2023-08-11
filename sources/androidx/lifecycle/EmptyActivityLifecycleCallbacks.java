package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C12775o;

/* compiled from: EmptyActivityLifecycleCallbacks.kt */
public class EmptyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }
}
