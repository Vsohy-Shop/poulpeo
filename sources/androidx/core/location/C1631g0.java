package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* renamed from: androidx.core.location.g0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1631g0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f485b;

    /* renamed from: c */
    public final /* synthetic */ List f486c;

    public /* synthetic */ C1631g0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, List list) {
        this.f485b = locationListenerTransport;
        this.f486c = list;
    }

    public final void run() {
        this.f485b.lambda$onLocationChanged$1(this.f486c);
    }
}
