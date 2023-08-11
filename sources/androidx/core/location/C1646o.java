package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import androidx.core.p004os.CancellationSignal;

/* renamed from: androidx.core.location.o */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1646o implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ LocationManagerCompat.CancellableLocationListener f507a;

    public /* synthetic */ C1646o(LocationManagerCompat.CancellableLocationListener cancellableLocationListener) {
        this.f507a = cancellableLocationListener;
    }

    public final void onCancel() {
        this.f507a.cancel();
    }
}
