package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p109h4.C7907a;
import p109h4.C7931g;
import p109h4.C7943j;
import p109h4.C7946k;

/* renamed from: com.google.android.gms.cast.k */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4696k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        C7931g gVar = null;
        ArrayList<MediaTrack> arrayList = null;
        C7943j jVar = null;
        String str3 = null;
        ArrayList<C7907a> arrayList2 = null;
        ArrayList<C4624a> arrayList3 = null;
        String str4 = null;
        C7946k kVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 3:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 5:
                    gVar = (C7931g) SafeParcelReader.m6714e(parcel2, s, C7931g.CREATOR);
                    break;
                case 6:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m6719j(parcel2, s, MediaTrack.CREATOR);
                    break;
                case 8:
                    jVar = (C7943j) SafeParcelReader.m6714e(parcel2, s, C7943j.CREATOR);
                    break;
                case 9:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 10:
                    arrayList2 = SafeParcelReader.m6719j(parcel2, s, C7907a.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.m6719j(parcel2, s, C4624a.CREATOR);
                    break;
                case 12:
                    str4 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 13:
                    kVar = (C7946k) SafeParcelReader.m6714e(parcel2, s, C7946k.CREATOR);
                    break;
                case 14:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 15:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 16:
                    str6 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 17:
                    str7 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 18:
                    str8 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new MediaInfo(str, i, str2, gVar, j, arrayList, jVar, str3, arrayList2, arrayList3, str4, kVar, j2, str5, str6, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
