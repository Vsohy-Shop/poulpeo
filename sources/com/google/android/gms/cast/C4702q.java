package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cast.q */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4702q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.m6714e(parcel2, s, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 5:
                    d = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 6:
                    d2 = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 7:
                    d3 = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 8:
                    jArr = SafeParcelReader.m6713d(parcel2, s);
                    break;
                case 9:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4689g(mediaInfo, i, z, d, d2, d3, jArr, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4689g[i];
    }
}
