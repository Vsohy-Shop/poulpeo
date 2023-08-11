package p109h4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p220s4.C9493a;

/* renamed from: h4.x0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7973x0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        ArrayList<C9493a> arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    str = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 3:
                    str2 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m6719j(parcel, s, C9493a.CREATOR);
                    break;
                case 5:
                    arrayList2 = SafeParcelReader.m6717h(parcel, s);
                    break;
                case 6:
                    str3 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.m6714e(parcel, s, Uri.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 9:
                    str5 = SafeParcelReader.m6715f(parcel, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7910b(str, str2, arrayList, arrayList2, str3, uri, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C7910b[i];
    }
}
