package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cast.framework.media.i */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4655i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        C4646g gVar = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 3:
                    str2 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 4:
                    iBinder = SafeParcelReader.m6729t(parcel, s);
                    break;
                case 5:
                    gVar = (C4646g) SafeParcelReader.m6714e(parcel, s, C4646g.CREATOR);
                    break;
                case 6:
                    z = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 7:
                    z2 = SafeParcelReader.m6722m(parcel, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C4633a(str, str2, iBinder, gVar, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4633a[i];
    }
}
