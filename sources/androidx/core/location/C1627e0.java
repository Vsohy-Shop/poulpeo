package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.e0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1627e0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f481b;

    /* renamed from: c */
    public final /* synthetic */ String f482c;

    public /* synthetic */ C1627e0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str) {
        this.f481b = locationListenerTransport;
        this.f482c = str;
    }

    public final void run() {
        this.f481b.lambda$onProviderEnabled$4(this.f482c);
    }
}
