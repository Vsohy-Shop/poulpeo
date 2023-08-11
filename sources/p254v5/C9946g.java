package p254v5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5512qb;
import com.google.android.gms.internal.gtm.C5513qc;

/* renamed from: v5.g */
public abstract class C9946g extends C5512qb implements C9945f {
    public C9946g() {
        super("com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33210E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo33515s(parcel.readString(), parcel.readString(), (Bundle) C5513qc.m8434b(parcel, Bundle.CREATOR), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}
