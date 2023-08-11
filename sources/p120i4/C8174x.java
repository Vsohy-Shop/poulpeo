package p120i4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import com.google.android.gms.internal.cast.C4917g0;

/* renamed from: i4.x */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8174x extends C4810a implements C8178z {
    C8174x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    /* renamed from: X2 */
    public final int mo42066X2(Intent intent, int i, int i2) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, intent);
        E.writeInt(i);
        E.writeInt(i2);
        Parcel G = mo32607G(2, E);
        int readInt = G.readInt();
        G.recycle();
        return readInt;
    }

    /* renamed from: d */
    public final void mo42067d() {
        mo32608J(1, mo32606E());
    }

    /* renamed from: k1 */
    public final IBinder mo42068k1(Intent intent) {
        Parcel E = mo32606E();
        C4917g0.m6986d(E, intent);
        Parcel G = mo32607G(3, E);
        IBinder readStrongBinder = G.readStrongBinder();
        G.recycle();
        return readStrongBinder;
    }

    /* renamed from: y */
    public final void mo42069y() {
        mo32608J(4, mo32606E());
    }
}
