package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1633h0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f487b;

    /* renamed from: c */
    public final /* synthetic */ String f488c;

    public /* synthetic */ C1633h0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f487b = locationListenerTransport;
        this.f488c = str;
    }

    public final void run() {
        this.f487b.lambda$onProviderDisabled$5(this.f488c);
    }
}
