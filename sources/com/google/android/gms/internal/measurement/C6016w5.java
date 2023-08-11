package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.w5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6016w5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C6048y5 f7450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6016w5(C6048y5 y5Var, Handler handler) {
        super((Handler) null);
        this.f7450a = y5Var;
    }

    public final void onChange(boolean z) {
        this.f7450a.mo34638e();
    }
}
