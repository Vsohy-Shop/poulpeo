package p170n4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: n4.d */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C8907d implements Parcelable.Creator<C8904a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 1) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                intent = (Intent) SafeParcelReader.m6714e(parcel, s, Intent.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8904a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C8904a[i];
    }
}
