package p231t4;

import android.os.Bundle;
import android.os.Parcel;
import p141k5.C8564b;
import p141k5.C8565c;

/* renamed from: t4.s0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9723s0 extends C8564b implements C9696k {
    public C9723s0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo42628E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo44158y1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C8565c.m17199a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo44157Q0(parcel.readInt(), (Bundle) C8565c.m17199a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo44156E1(parcel.readInt(), parcel.readStrongBinder(), (C9688h1) C8565c.m17199a(parcel, C9688h1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
