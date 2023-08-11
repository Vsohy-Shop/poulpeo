package p254v5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5512qb;
import com.google.android.gms.internal.gtm.C5513qc;

/* renamed from: v5.j */
public abstract class C9949j extends C5512qb implements C9948i {
    public C9949j() {
        super("com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33210E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        mo33479w(parcel.readString(), parcel.readString(), (Bundle) C5513qc.m8434b(parcel, Bundle.CREATOR), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}
