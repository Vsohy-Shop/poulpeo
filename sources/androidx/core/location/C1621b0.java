package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1621b0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f473b;

    /* renamed from: c */
    public final /* synthetic */ Executor f474c;

    public /* synthetic */ C1621b0(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f473b = gpsStatusTransport;
        this.f474c = executor;
    }

    public final void run() {
        this.f473b.lambda$onGpsStatusChanged$1(this.f474c);
    }
}
