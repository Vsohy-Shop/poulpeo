package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: l4.d */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8679d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                z = SafeParcelReader.m6722m(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8710s0(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8710s0[i];
    }
}
