package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.C4625b;
import com.google.android.gms.cast.C4626c;
import com.google.android.gms.cast.C4631f;
import com.google.android.gms.cast.C4689g;
import com.google.android.gms.cast.C4692h;
import com.google.android.gms.cast.C4694i;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: h4.w0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7971w0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList<C4689g> arrayList = null;
        C4625b bVar = null;
        C4694i iVar = null;
        C4626c cVar = null;
        C4631f fVar = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.m6714e(parcel2, s, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 4:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 5:
                    d = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 6:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 7:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 8:
                    j2 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 9:
                    j3 = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 10:
                    d2 = SafeParcelReader.m6724o(parcel2, s);
                    break;
                case 11:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 12:
                    jArr = SafeParcelReader.m6713d(parcel2, s);
                    break;
                case 13:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 14:
                    i5 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 15:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 16:
                    i6 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 17:
                    arrayList = SafeParcelReader.m6719j(parcel2, s, C4689g.CREATOR);
                    break;
                case 18:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 19:
                    bVar = (C4625b) SafeParcelReader.m6714e(parcel2, s, C4625b.CREATOR);
                    break;
                case 20:
                    iVar = (C4694i) SafeParcelReader.m6714e(parcel2, s, C4694i.CREATOR);
                    break;
                case 21:
                    cVar = (C4626c) SafeParcelReader.m6714e(parcel2, s, C4626c.CREATOR);
                    break;
                case 22:
                    fVar = (C4631f) SafeParcelReader.m6714e(parcel2, s, C4631f.CREATOR);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4692h(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, bVar, iVar, cVar, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4692h[i];
    }
}
