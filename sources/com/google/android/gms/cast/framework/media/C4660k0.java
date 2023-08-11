package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cast.framework.media.k0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4660k0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 3) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i3 = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C4635b(i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4635b[i];
    }
}
