package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p109h4.C7946k;

/* renamed from: com.google.android.gms.cast.j */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4695j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        C7946k kVar = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 3:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 4:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 5:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 7:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 8:
                    str6 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 9:
                    str7 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 10:
                    str8 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 11:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 12:
                    str9 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 13:
                    kVar = (C7946k) SafeParcelReader.m6714e(parcel2, s, C7946k.CREATOR);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4624a(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, kVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4624a[i];
    }
}
