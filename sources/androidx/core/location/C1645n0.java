package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.n0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1645n0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f505b;

    /* renamed from: c */
    public final /* synthetic */ Executor f506c;

    public /* synthetic */ C1645n0(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f505b = preRGnssStatusTransport;
        this.f506c = executor;
    }

    public final void run() {
        this.f505b.lambda$onStopped$1(this.f506c);
    }
}
