package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: t5.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9752i implements Parcelable.Creator<C9751h> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                arrayList = SafeParcelReader.m6717h(parcel, s);
            } else if (l != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9751h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9751h[i];
    }
}
