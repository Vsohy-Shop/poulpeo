package p232t5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t5.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9746c implements Parcelable.Creator<C9745b> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        Intent intent = null;
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
                intent = (Intent) SafeParcelReader.m6714e(parcel, s, Intent.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9745b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9745b[i];
    }
}
