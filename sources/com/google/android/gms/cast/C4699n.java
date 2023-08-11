package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.cast.n */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4699n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        MediaInfo mediaInfo = null;
        C4631f fVar = null;
        Boolean bool = null;
        long[] jArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.m6714e(parcel2, s, MediaInfo.CREATOR);
                    break;
                case 3:
                    fVar = (C4631f) SafeParcelReader.m6714e(parcel2, s, C4631f.CREATOR);
                    break;
                case 4:
                    bool = SafeParcelReader.m6723n(parcel2, s);
                    break;
                case 5:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 6:
                    d = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 7:
                    jArr = SafeParcelReader.m6713d(parcel2, s);
                    break;
                case 8:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 9:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 10:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 11:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 12:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 13:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4627d(mediaInfo, fVar, bool, j, d, jArr, str, str2, str3, str4, str5, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4627d[i];
    }
}
