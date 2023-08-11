package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p231t4.C9707n0;

/* renamed from: t5.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9754k implements Parcelable.Creator<C9753j> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        C9707n0 n0Var = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                n0Var = (C9707n0) SafeParcelReader.m6714e(parcel, s, C9707n0.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9753j(i, n0Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9753j[i];
    }
}
