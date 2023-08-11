package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.n */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7952n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                f = SafeParcelReader.m6726q(parcel, s);
            } else if (l == 3) {
                f2 = SafeParcelReader.m6726q(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                f3 = SafeParcelReader.m6726q(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7950m(f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7950m[i];
    }
}
