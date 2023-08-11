package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1625d0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f478b;

    /* renamed from: c */
    public final /* synthetic */ Executor f479c;

    /* renamed from: d */
    public final /* synthetic */ GnssStatusCompat f480d;

    public /* synthetic */ C1625d0(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
        this.f478b = gpsStatusTransport;
        this.f479c = executor;
        this.f480d = gnssStatusCompat;
    }

    public final void run() {
        this.f478b.lambda$onGpsStatusChanged$3(this.f479c, this.f480d);
    }
}
