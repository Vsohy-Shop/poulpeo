package androidx.core.location;

import android.os.Bundle;
import androidx.core.location.LocationManagerCompat;

/* renamed from: androidx.core.location.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1637j0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f491b;

    /* renamed from: c */
    public final /* synthetic */ String f492c;

    /* renamed from: d */
    public final /* synthetic */ int f493d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f494e;

    public /* synthetic */ C1637j0(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i, Bundle bundle) {
        this.f491b = locationListenerTransport;
        this.f492c = str;
        this.f493d = i;
        this.f494e = bundle;
    }

    public final void run() {
        this.f491b.lambda$onStatusChanged$3(this.f492c, this.f493d, this.f494e);
    }
}
