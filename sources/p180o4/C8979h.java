package p180o4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: o4.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8979h implements Parcelable.Creator<C8974c> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 2) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                j = SafeParcelReader.m6732w(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8974c(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8974c[i];
    }
}
