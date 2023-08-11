package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4810a;
import p036b5.C2888a;

/* renamed from: com.google.android.gms.cast.framework.media.s */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4675s extends C4810a implements C4654h0 {
    C4675s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    /* renamed from: d */
    public final C2888a mo32208d() {
        Parcel G = mo32607G(2, mo32606E());
        C2888a G2 = C2888a.C2889a.m2295G(G.readStrongBinder());
        G.recycle();
        return G2;
    }
}
