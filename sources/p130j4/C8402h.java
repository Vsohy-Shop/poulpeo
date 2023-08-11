package p130j4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: j4.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8402h extends C5205x implements C8403i {
    /* renamed from: G */
    public static C8403i m16786G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        if (queryLocalInterface instanceof C8403i) {
            return (C8403i) queryLocalInterface;
        }
        return new C8401g(iBinder);
    }
}
