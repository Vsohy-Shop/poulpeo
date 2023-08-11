package p086f5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: f5.e */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public abstract class C7599e extends C7596b implements C7600f {
    /* renamed from: E */
    public static C7600f m14959E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C7600f) {
            return (C7600f) queryLocalInterface;
        }
        return new C7598d(iBinder);
    }
}
