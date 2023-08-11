package p220s4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: s4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9494b implements Parcelable.Creator<C9493a> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        int i2 = 0;
        Uri uri = null;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                uri = (Uri) SafeParcelReader.m6714e(parcel, s, Uri.CREATOR);
            } else if (l == 3) {
                i3 = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i2 = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9493a(i, uri, i3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9493a[i];
    }
}
