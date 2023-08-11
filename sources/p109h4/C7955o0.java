package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p150l4.C8673a;

/* renamed from: h4.o0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7955o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        while (true) {
            long j2 = j;
            while (parcel.dataPosition() < A) {
                int s = SafeParcelReader.m6728s(parcel);
                int l = SafeParcelReader.m6721l(s);
                if (l == 2) {
                    str2 = SafeParcelReader.m6715f(parcel, s);
                } else if (l == 3) {
                    j = SafeParcelReader.m6732w(parcel, s);
                } else if (l == 4) {
                    num = SafeParcelReader.m6731v(parcel, s);
                } else if (l == 5) {
                    str3 = SafeParcelReader.m6715f(parcel, s);
                } else if (l != 6) {
                    SafeParcelReader.m6735z(parcel, s);
                } else {
                    str = SafeParcelReader.m6715f(parcel, s);
                }
            }
            SafeParcelReader.m6720k(parcel, A);
            return new MediaError(str2, j2, num, str3, C8673a.m17442a(str));
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
