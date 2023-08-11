package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6300t9 implements Parcelable.Creator<C6289s9> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = "";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str9 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j6 = -2147483648L;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 3:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 4:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 5:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 7:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 8:
                    str6 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 9:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 10:
                    z3 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 11:
                    j6 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 12:
                    str7 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 13:
                    j3 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 14:
                    j4 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 15:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 16:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 18:
                    z4 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 19:
                    str8 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 21:
                    bool = SafeParcelReader.m6723n(parcel2, s);
                    break;
                case 22:
                    j5 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m6717h(parcel2, s);
                    break;
                case 24:
                    str9 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 25:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C6289s9(str2, str3, str4, str5, j, j2, str6, z, z3, j6, str7, j3, j4, i, z2, z4, str8, bool, j5, (List<String>) arrayList, str9, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6289s9[i];
    }
}
