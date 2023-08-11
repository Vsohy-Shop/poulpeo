package p120i4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: i4.y */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8176y extends C5205x implements C8178z {
    /* renamed from: G */
    public static C8178z m16179G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        if (queryLocalInterface instanceof C8178z) {
            return (C8178z) queryLocalInterface;
        }
        return new C8174x(iBinder);
    }
}
