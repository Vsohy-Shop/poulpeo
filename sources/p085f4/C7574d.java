package p085f4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: f4.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7574d implements Parcelable.Creator<C7571a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                bundle = SafeParcelReader.m6710a(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7571a(i, i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7571a[i];
    }
}
