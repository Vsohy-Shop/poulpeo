package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t4.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9690i0 implements Parcelable.Creator<C9702m> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 2:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 3:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 5:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 6:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 7:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 8:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 9:
                    i5 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C9702m(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9702m[i];
    }
}
