package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p109h4.C7910b;
import p109h4.C7954o;

/* renamed from: l4.f */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8683f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        C7910b bVar = null;
        C7954o oVar = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    d = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 3:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 4:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 5:
                    bVar = (C7910b) SafeParcelReader.m6714e(parcel2, s, C7910b.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 7:
                    oVar = (C7954o) SafeParcelReader.m6714e(parcel2, s, C7954o.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.m6724o(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C8681e(d, z, i, bVar, i2, oVar, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C8681e[i];
    }
}
