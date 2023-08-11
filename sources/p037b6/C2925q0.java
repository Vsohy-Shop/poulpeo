package p037b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b6.q0 */
public final class C2925q0 extends C2905g0 implements C2927r0 {
    C2925q0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: b */
    public final void mo28465b(Bundle bundle) {
        Parcel E = mo28430E();
        C2909i0.m2328c(E, bundle);
        mo28431G(3, E);
    }

    /* renamed from: p */
    public final void mo28466p(Bundle bundle, Bundle bundle2) {
        Parcel E = mo28430E();
        C2909i0.m2328c(E, bundle);
        C2909i0.m2328c(E, bundle2);
        mo28431G(2, E);
    }

    /* renamed from: v */
    public final void mo28467v(Bundle bundle) {
        Parcel E = mo28430E();
        C2909i0.m2328c(E, bundle);
        mo28431G(4, E);
    }
}
