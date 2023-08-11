package p037b6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b6.a */
public abstract class C2892a extends C2907h0 implements C2894b {
    /* renamed from: G */
    public static C2894b m2298G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface instanceof C2894b) {
            return (C2894b) queryLocalInterface;
        }
        return new C2929s0(iBinder);
    }
}
