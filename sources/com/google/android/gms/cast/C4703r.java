package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p150l4.C8673a;

/* renamed from: com.google.android.gms.cast.r */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4703r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 3:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
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
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 9:
                    arrayList = SafeParcelReader.m6717h(parcel2, s);
                    break;
                case 10:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, C8673a.m17442a(str));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}
