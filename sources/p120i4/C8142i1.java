package p120i4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: i4.i1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8142i1 extends C5205x implements C8145j1 {
    /* renamed from: G */
    public static C8145j1 m16084G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
        if (queryLocalInterface instanceof C8145j1) {
            return (C8145j1) queryLocalInterface;
        }
        return new C8139h1(iBinder);
    }
}
