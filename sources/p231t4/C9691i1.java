package p231t4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p180o4.C8974c;

/* renamed from: t4.i1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9691i1 implements Parcelable.Creator<C9688h1> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        Bundle bundle = null;
        C9677e eVar = null;
        int i = 0;
        C8974c[] cVarArr = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                bundle = SafeParcelReader.m6710a(parcel, s);
            } else if (l == 2) {
                cVarArr = (C8974c[]) SafeParcelReader.m6718i(parcel, s, C8974c.CREATOR);
            } else if (l == 3) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                eVar = (C9677e) SafeParcelReader.m6714e(parcel, s, C9677e.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9688h1(bundle, cVarArr, i, eVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9688h1[i];
    }
}
