package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.google.android.gms.internal.gtm.x4 */
final class C5610x4 implements ComponentCallbacks2 {

    /* renamed from: b */
    final /* synthetic */ C5472o4 f6724b;

    C5610x4(C5472o4 o4Var) {
        this.f6724b = o4Var;
    }

    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f6724b.f6199e.execute(new C5624y4(this));
        }
    }

    public final void onLowMemory() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }
}
