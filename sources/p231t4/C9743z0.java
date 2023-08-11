package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t4.z0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9743z0 implements Parcelable.Creator<C9719r> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                z = SafeParcelReader.m6722m(parcel, s);
            } else if (l == 3) {
                z2 = SafeParcelReader.m6722m(parcel, s);
            } else if (l == 4) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 5) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i3 = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9719r(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9719r[i];
    }
}
