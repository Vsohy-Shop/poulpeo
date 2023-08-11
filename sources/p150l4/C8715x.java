package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: l4.x */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8715x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8677c(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8677c[i];
    }
}
