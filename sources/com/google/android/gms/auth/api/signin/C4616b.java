package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4616b implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
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
                    uri = (Uri) SafeParcelReader.m6714e(parcel2, s, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 8:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 9:
                    str6 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m6719j(parcel2, s, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 12:
                    str8 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
