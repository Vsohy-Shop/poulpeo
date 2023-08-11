package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.y2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
final class C6045y2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    final /* synthetic */ C6061z2 f7476b;

    C6045y2(C6061z2 z2Var) {
        this.f7476b = z2Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f7476b.m10343o(new C5917q2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f7476b.m10343o(new C6029x2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f7476b.m10343o(new C5965t2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f7476b.m10343o(new C5949s2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C5666b1 b1Var = new C5666b1();
        this.f7476b.m10343o(new C6013w2(this, activity, b1Var));
        Bundle G = b1Var.mo33689G(50);
        if (G != null) {
            bundle.putAll(G);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f7476b.m10343o(new C5933r2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f7476b.m10343o(new C5997v2(this, activity));
    }
}
