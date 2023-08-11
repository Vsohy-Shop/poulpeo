package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p085f4.C7571a;

/* renamed from: com.google.android.gms.auth.api.signin.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4618d implements Parcelable.Creator<GoogleSignInOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<C7571a> arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    i = SafeParcelReader.m6730u(parcel, s);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m6719j(parcel, s, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m6714e(parcel, s, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 5:
                    z2 = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 6:
                    z3 = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 7:
                    str = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 8:
                    str2 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m6719j(parcel, s, C7571a.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m6715f(parcel, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
