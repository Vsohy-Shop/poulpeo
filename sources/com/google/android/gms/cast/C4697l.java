package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cast.l */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4697l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                j = SafeParcelReader.m6732w(parcel, s);
            } else if (l == 3) {
                j2 = SafeParcelReader.m6732w(parcel, s);
            } else if (l == 4) {
                z = SafeParcelReader.m6722m(parcel, s);
            } else if (l != 5) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                z2 = SafeParcelReader.m6722m(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C4626c(j, j2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4626c[i];
    }
}
