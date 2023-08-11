package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1619a0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f471b;

    /* renamed from: c */
    public final /* synthetic */ Executor f472c;

    public /* synthetic */ C1619a0(LocationManagerCompat.GpsStatusTransport gpsStatusTransport, Executor executor) {
        this.f471b = gpsStatusTransport;
        this.f472c = executor;
    }

    public final void run() {
        this.f471b.lambda$onGpsStatusChanged$0(this.f472c);
    }
}
