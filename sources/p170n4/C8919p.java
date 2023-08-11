package p170n4;

import android.util.Log;
import java.io.IOException;
import p276x5.C10406g;

/* renamed from: n4.p */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C8919p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C10406g f12948b;

    public /* synthetic */ C8919p(C10406g gVar) {
        this.f12948b = gVar;
    }

    public final void run() {
        if (this.f12948b.mo45099d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
