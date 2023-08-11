package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.p */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7956p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        C7950m mVar = null;
        C7950m mVar2 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                mVar = (C7950m) SafeParcelReader.m6714e(parcel, s, C7950m.CREATOR);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                mVar2 = (C7950m) SafeParcelReader.m6714e(parcel, s, C7950m.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7954o(mVar, mVar2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7954o[i];
    }
}
