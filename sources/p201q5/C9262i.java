package p201q5;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.C5884o1;
import com.google.android.gms.measurement.internal.C6206l3;
import com.google.android.gms.measurement.internal.C6251p4;
import p231t4.C9713p;

/* renamed from: q5.i */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C9262i {

    /* renamed from: a */
    private final C9261h f13603a;

    public C9262i(C9261h hVar) {
        C9713p.m20275j(hVar);
        this.f13603a = hVar;
    }

    @MainThread
    /* renamed from: a */
    public final void mo43557a(Context context, Intent intent) {
        C6251p4 H = C6251p4.m10988H(context, (C5884o1) null, (Long) null);
        C6206l3 b = H.mo34920b();
        if (intent == null) {
            b.mo35080w().mo35037a("Receiver called with null intent");
            return;
        }
        H.mo34924d();
        String action = intent.getAction();
        b.mo35079v().mo35038b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo35079v().mo35037a("Starting wakeful intent.");
            this.f13603a.mo34715a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.mo35080w().mo35037a("Install Referrer Broadcasts are deprecated");
        }
    }
}
