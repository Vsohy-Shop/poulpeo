package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.y */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1663y implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f509b;

    public /* synthetic */ C1663y(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f509b = cancellableLocationListener;
    }

    public final void run() {
        this.f509b.lambda$startTimeout$0();
    }
}
