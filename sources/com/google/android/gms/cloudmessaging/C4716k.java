package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.k */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C4716k extends C4715j<Bundle> {
    C4716k(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32327a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo32330d(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo32328b() {
        return false;
    }
}
