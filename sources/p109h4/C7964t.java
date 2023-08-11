package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.t */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7964t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String[] strArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 3:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 4:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 5:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 6:
                    strArr = SafeParcelReader.m6716g(parcel2, s);
                    break;
                case 7:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 8:
                    z3 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C7907a(j, str, j2, z, strArr, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7907a[i];
    }
}
