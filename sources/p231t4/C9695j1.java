package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t4.j1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9695j1 implements Parcelable.Creator<C9677e> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        C9719r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    rVar = (C9719r) SafeParcelReader.m6714e(parcel, s, C9719r.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 3:
                    z2 = SafeParcelReader.m6722m(parcel, s);
                    break;
                case 4:
                    iArr = SafeParcelReader.m6712c(parcel, s);
                    break;
                case 5:
                    i = SafeParcelReader.m6730u(parcel, s);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m6712c(parcel, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C9677e(rVar, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9677e[i];
    }
}
