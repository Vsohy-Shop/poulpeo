package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.i */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C4714i extends C4715j<Void> {
    C4714i(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32327a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo32330d(null);
        } else {
            mo32329c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo32328b() {
        return true;
    }
}
