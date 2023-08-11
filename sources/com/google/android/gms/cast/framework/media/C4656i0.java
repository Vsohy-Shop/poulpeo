package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.i0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4656i0 extends C4810a implements C4658j0 {
    C4656i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    /* renamed from: d */
    public final int[] mo32213d() {
        Parcel G = mo32607G(4, mo32606E());
        int[] createIntArray = G.createIntArray();
        G.recycle();
        return createIntArray;
    }

    /* renamed from: f */
    public final List mo32214f() {
        Parcel G = mo32607G(3, mo32606E());
        ArrayList<C4642e> createTypedArrayList = G.createTypedArrayList(C4642e.CREATOR);
        G.recycle();
        return createTypedArrayList;
    }
}
