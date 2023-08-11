package p109h4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p220s4.C9493a;

/* renamed from: h4.r0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7961r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        ArrayList<C9493a> arrayList = null;
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                arrayList = SafeParcelReader.m6719j(parcel, s, C9493a.CREATOR);
            } else if (l == 3) {
                bundle = SafeParcelReader.m6710a(parcel, s);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7931g(arrayList, bundle, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7931g[i];
    }
}
