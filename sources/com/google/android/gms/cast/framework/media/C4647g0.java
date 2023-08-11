package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p036b5.C2888a;
import p109h4.C7931g;
import p220s4.C9493a;

/* renamed from: com.google.android.gms.cast.framework.media.g0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C4647g0 extends C5205x implements C4654h0 {
    public C4647g0() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            C4917g0.m6984b(parcel);
            C9493a p2 = mo32210p2((C7931g) C4917g0.m6983a(parcel, C7931g.CREATOR), readInt);
            parcel2.writeNoException();
            C4917g0.m6987e(parcel2, p2);
        } else if (i == 2) {
            C2888a d = mo32208d();
            parcel2.writeNoException();
            C4917g0.m6988f(parcel2, d);
        } else if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(C4785c.f5063a);
        } else if (i != 4) {
            return false;
        } else {
            C4917g0.m6984b(parcel);
            C9493a e0 = mo32209e0((C7931g) C4917g0.m6983a(parcel, C7931g.CREATOR), (C4635b) C4917g0.m6983a(parcel, C4635b.CREATOR));
            parcel2.writeNoException();
            C4917g0.m6987e(parcel2, e0);
        }
        return true;
    }
}
