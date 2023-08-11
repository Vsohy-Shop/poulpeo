package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.m0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1643m0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f500b;

    /* renamed from: c */
    public final /* synthetic */ Executor f501c;

    /* renamed from: d */
    public final /* synthetic */ int f502d;

    public /* synthetic */ C1643m0(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f500b = preRGnssStatusTransport;
        this.f501c = executor;
        this.f502d = i;
    }

    public final void run() {
        this.f500b.lambda$onFirstFix$2(this.f501c, this.f502d);
    }
}
