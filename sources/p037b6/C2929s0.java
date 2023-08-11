package p037b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b6.s0 */
public final class C2929s0 extends C2905g0 implements C2894b {
    C2929s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: k0 */
    public final void mo28417k0(String str, Bundle bundle, C2898d dVar) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2327b(E, dVar);
        mo28431G(2, E);
    }
}
