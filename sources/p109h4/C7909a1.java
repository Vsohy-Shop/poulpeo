package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.a1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7909a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str2 = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7946k(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7946k[i];
    }
}
