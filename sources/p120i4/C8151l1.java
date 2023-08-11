package p120i4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: i4.l1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8151l1 extends C5205x implements C8168u {
    /* renamed from: G */
    public static C8168u m16103G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        if (queryLocalInterface instanceof C8168u) {
            return (C8168u) queryLocalInterface;
        }
        return new C8148k1(iBinder);
    }
}
