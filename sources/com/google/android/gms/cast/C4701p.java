package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.p */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4701p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C4629e eVar = null;
        ArrayList<C4689g> arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        long j = 0;
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
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 5:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    eVar = (C4629e) SafeParcelReader.m6714e(parcel2, s, C4629e.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 8:
                    arrayList = SafeParcelReader.m6719j(parcel2, s, C4689g.CREATOR);
                    break;
                case 9:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 10:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 11:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4631f(str, str2, i, str3, eVar, i2, arrayList, i3, j, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4631f[i];
    }
}
