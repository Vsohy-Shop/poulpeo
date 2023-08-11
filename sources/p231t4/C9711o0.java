package p231t4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t4.o0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9711o0 implements Parcelable.Creator<C9707n0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                account = (Account) SafeParcelReader.m6714e(parcel, s, Account.CREATOR);
            } else if (l == 3) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m6714e(parcel, s, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9707n0(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9707n0[i];
    }
}
