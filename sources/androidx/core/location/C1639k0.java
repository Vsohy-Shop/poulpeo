package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.k0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1639k0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f495b;

    /* renamed from: c */
    public final /* synthetic */ Executor f496c;

    public /* synthetic */ C1639k0(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
        this.f495b = preRGnssStatusTransport;
        this.f496c = executor;
    }

    public final void run() {
        this.f495b.lambda$onStarted$0(this.f496c);
    }
}
