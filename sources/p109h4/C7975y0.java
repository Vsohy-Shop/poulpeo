package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.C4627d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p150l4.C8673a;

/* renamed from: h4.y0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7975y0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        C4627d dVar = null;
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                dVar = (C4627d) SafeParcelReader.m6714e(parcel, s, C4627d.CREATOR);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7939i(dVar, C8673a.m17442a(str));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7939i[i];
    }
}
