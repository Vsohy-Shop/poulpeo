package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1629f0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f483b;

    /* renamed from: c */
    public final /* synthetic */ int f484c;

    public /* synthetic */ C1629f0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, int i) {
        this.f483b = locationListenerTransport;
        this.f484c = i;
    }

    public final void run() {
        this.f483b.lambda$onFlushComplete$2(this.f484c);
    }
}
