package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1641l0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f497b;

    /* renamed from: c */
    public final /* synthetic */ Executor f498c;

    /* renamed from: d */
    public final /* synthetic */ GnssStatus f499d;

    public /* synthetic */ C1641l0(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
        this.f497b = preRGnssStatusTransport;
        this.f498c = executor;
        this.f499d = gnssStatus;
    }

    public final void run() {
        this.f497b.lambda$onSatelliteStatusChanged$3(this.f498c, this.f499d);
    }
}
