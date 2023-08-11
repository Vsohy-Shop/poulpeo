package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.c0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1623c0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f475b;

    /* renamed from: c */
    public final /* synthetic */ Executor f476c;

    /* renamed from: d */
    public final /* synthetic */ int f477d;

    public /* synthetic */ C1623c0(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor, int i) {
        this.f475b = gpsStatusTransport;
        this.f476c = executor;
        this.f477d = i;
    }

    public final void run() {
        this.f475b.lambda$onGpsStatusChanged$2(this.f476c, this.f477d);
    }
}
