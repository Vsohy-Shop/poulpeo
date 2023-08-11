package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: t4.x */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9738x implements Parcelable.Creator<C9725t> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        ArrayList<C9702m> arrayList = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                arrayList = SafeParcelReader.m6719j(parcel, s, C9702m.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9725t(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9725t[i];
    }
}
