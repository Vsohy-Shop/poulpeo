package p120i4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: i4.b0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8120b0 extends C5205x implements C8123c0 {
    /* renamed from: G */
    public static C8123c0 m16015G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        if (queryLocalInterface instanceof C8123c0) {
            return (C8123c0) queryLocalInterface;
        }
        return new C8117a0(iBinder);
    }
}
