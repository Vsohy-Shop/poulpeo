package p231t4;

import android.os.IBinder;
import android.os.IInterface;
import p141k5.C8564b;

/* renamed from: t4.v0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9732v0 extends C8564b implements C9736w0 {
    /* renamed from: G */
    public static C9736w0 m20322G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C9736w0) {
            return (C9736w0) queryLocalInterface;
        }
        return new C9729u0(iBinder);
    }
}
