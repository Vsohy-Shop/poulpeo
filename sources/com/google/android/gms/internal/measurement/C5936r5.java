package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C5936r5 extends ContentObserver {
    C5936r5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C5952s5.f7350e.set(true);
    }
}
