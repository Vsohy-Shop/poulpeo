package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.n0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7953n0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        boolean z = false;
        String str = null;
        C7925e eVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                z = SafeParcelReader.m6722m(parcel, s);
            } else if (l == 3) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 4) {
                z2 = SafeParcelReader.m6722m(parcel, s);
            } else if (l != 5) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                eVar = (C7925e) SafeParcelReader.m6714e(parcel, s, C7925e.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7928f(z, str, z2, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7928f[i];
    }
}
