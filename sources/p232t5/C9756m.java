package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p231t4.C9714p0;

/* renamed from: t5.m */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9756m implements Parcelable.Creator<C9755l> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        C9714p0 p0Var = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m6714e(parcel, s, ConnectionResult.CREATOR);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                p0Var = (C9714p0) SafeParcelReader.m6714e(parcel, s, C9714p0.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9755l(i, connectionResult, p0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9755l[i];
    }
}
