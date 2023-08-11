package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.C12775o;

/* compiled from: ProcessLifecycleOwner.kt */
public final class ProcessLifecycleOwner$attach$1 extends EmptyActivityLifecycleCallbacks {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    ProcessLifecycleOwner$attach$1(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            ReportFragment.Companion.get(activity).setProcessListener(this.this$0.initializationListener);
        }
    }

    public void onActivityPaused(Activity activity) {
        C12775o.m28639i(activity, "activity");
        this.this$0.activityPaused$lifecycle_process_release();
    }

    @RequiresApi(29)
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
        ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new ProcessLifecycleOwner$attach$1$onActivityPreCreated$1(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        C12775o.m28639i(activity, "activity");
        this.this$0.activityStopped$lifecycle_process_release();
    }
}
