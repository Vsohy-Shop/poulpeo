package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.m0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7951m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7949l0(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7949l0[i];
    }
}
