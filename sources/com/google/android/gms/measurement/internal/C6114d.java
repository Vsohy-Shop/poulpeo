package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6114d implements Parcelable.Creator<C6103c> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        C6190j9 j9Var = null;
        String str3 = null;
        C6290t tVar = null;
        C6290t tVar2 = null;
        C6290t tVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
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
                    j9Var = (C6190j9) SafeParcelReader.m6714e(parcel2, s, C6190j9.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 6:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 7:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 8:
                    tVar = (C6290t) SafeParcelReader.m6714e(parcel2, s, C6290t.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 10:
                    tVar2 = (C6290t) SafeParcelReader.m6714e(parcel2, s, C6290t.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 12:
                    tVar3 = (C6290t) SafeParcelReader.m6714e(parcel2, s, C6290t.CREATOR);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C6103c(str, str2, j9Var, j, z, str3, tVar, j2, tVar2, j3, tVar3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6103c[i];
    }
}
