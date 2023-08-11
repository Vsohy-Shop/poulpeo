package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.f */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C4620f implements Parcelable.Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 4) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m6714e(parcel, s, GoogleSignInAccount.CREATOR);
            } else if (l != 8) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str2 = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
