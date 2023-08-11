package p180o4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: o4.y */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8996y implements Parcelable.Creator<C8995x> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 2) {
                iBinder = SafeParcelReader.m6729t(parcel, s);
            } else if (l == 3) {
                z = SafeParcelReader.m6722m(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                z2 = SafeParcelReader.m6722m(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8995x(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8995x[i];
    }
}
