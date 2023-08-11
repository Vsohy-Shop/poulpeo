package p130j4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;

/* renamed from: j4.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8401g extends C4810a implements C8403i {
    C8401g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    /* renamed from: m0 */
    public final Bitmap mo42421m0(Uri uri) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, uri);
        Parcel G = mo32607G(1, E);
        Bitmap bitmap = (Bitmap) C4917g0.m6983a(G, Bitmap.CREATOR);
        G.recycle();
        return bitmap;
    }
}
