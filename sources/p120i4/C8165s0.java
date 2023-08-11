package p120i4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.C4633a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p109h4.C7928f;

/* renamed from: i4.s0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8165s0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        C7928f fVar = null;
        C4633a aVar = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 3:
                    arrayList = SafeParcelReader.m6717h(parcel2, s);
                    break;
                case 4:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 5:
                    fVar = (C7928f) SafeParcelReader.m6714e(parcel2, s, C7928f.CREATOR);
                    break;
                case 6:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 7:
                    aVar = (C4633a) SafeParcelReader.m6714e(parcel2, s, C4633a.CREATOR);
                    break;
                case 8:
                    z3 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 9:
                    d = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 10:
                    z4 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 11:
                    z5 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 12:
                    z6 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 13:
                    arrayList2 = SafeParcelReader.m6717h(parcel2, s);
                    break;
                case 14:
                    z7 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 15:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C8119b(str, arrayList, z, fVar, z2, aVar, z3, d, z4, z5, z6, arrayList2, z7, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8119b[i];
    }
}
