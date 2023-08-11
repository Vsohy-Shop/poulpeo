package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5900p1 implements Parcelable.Creator<C5884o1> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 2:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 3:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 4:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 5:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 7:
                    bundle = SafeParcelReader.m6710a(parcel2, s);
                    break;
                case 8:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C5884o1(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C5884o1[i];
    }
}
