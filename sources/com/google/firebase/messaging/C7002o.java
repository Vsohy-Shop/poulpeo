package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.firebase.messaging.o */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C7002o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final Set<Intent> f9341b = Collections.newSetFromMap(new WeakHashMap());

    C7002o() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent != null && this.f9341b.add(intent) && (extras = intent.getExtras()) != null) {
            Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
            if (C6987j0.m12314C(bundle2)) {
                C6987j0.m12335u(bundle2);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f9341b.remove(activity.getIntent());
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
