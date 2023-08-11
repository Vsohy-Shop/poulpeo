package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6279s implements Parcelable.Creator<C6268r> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                bundle = SafeParcelReader.m6710a(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C6268r(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6268r[i];
    }
}
