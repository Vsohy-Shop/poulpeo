package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p150l4.C8710s0;
import p220s4.C9493a;

/* renamed from: com.google.android.gms.cast.t */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4705t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<C9493a> arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        C8710s0 s0Var = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
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
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 5:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 7:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 8:
                    arrayList = SafeParcelReader.m6719j(parcel2, s, C9493a.CREATOR);
                    break;
                case 9:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 10:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 11:
                    str6 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 12:
                    str7 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 13:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 14:
                    str8 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 15:
                    bArr = SafeParcelReader.m6711b(parcel2, s);
                    break;
                case 16:
                    str9 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 17:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 18:
                    s0Var = (C8710s0) SafeParcelReader.m6714e(parcel2, s, C8710s0.CREATOR);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i4, str6, str7, i3, str8, bArr, str9, z, s0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
