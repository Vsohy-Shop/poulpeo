package p037b6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b6.k0 */
public abstract class C2913k0 extends C2907h0 implements C2915l0 {
    /* renamed from: G */
    public static C2915l0 m2338G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        if (queryLocalInterface instanceof C2915l0) {
            return (C2915l0) queryLocalInterface;
        }
        return new C2911j0(iBinder);
    }
}
