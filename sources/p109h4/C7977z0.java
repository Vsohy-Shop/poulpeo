package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: h4.z0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7977z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    f = SafeParcelReader.m6726q(parcel2, s);
                    break;
                case 3:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 5:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 6:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 7:
                    i5 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 8:
                    i6 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 9:
                    i7 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 10:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 11:
                    i8 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 12:
                    i9 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 13:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C7943j(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7943j[i];
    }
}
