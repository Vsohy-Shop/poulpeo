package p231t4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t4.q0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9717q0 implements Parcelable.Creator<C9714p0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                iBinder = SafeParcelReader.m6729t(parcel, s);
            } else if (l == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m6714e(parcel, s, ConnectionResult.CREATOR);
            } else if (l == 4) {
                z = SafeParcelReader.m6722m(parcel, s);
            } else if (l != 5) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                z2 = SafeParcelReader.m6722m(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9714p0(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9714p0[i];
    }
}
