package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1635i0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f489b;

    /* renamed from: c */
    public final /* synthetic */ Location f490c;

    public /* synthetic */ C1635i0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Location location) {
        this.f489b = locationListenerTransport;
        this.f490c = location;
    }

    public final void run() {
        this.f489b.lambda$onLocationChanged$0(this.f490c);
    }
}
