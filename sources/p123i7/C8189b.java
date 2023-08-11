package p123i7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p242u4.C9883b;

/* renamed from: i7.b */
/* compiled from: DynamicLinkDataCreator */
public class C8189b implements Parcelable.Creator<C8188a> {
    /* renamed from: c */
    static void m16210c(C8188a aVar, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 1, aVar.mo42083G(), false);
        C9883b.m20539s(parcel, 2, aVar.mo42082F(), false);
        C9883b.m20532l(parcel, 3, aVar.mo42085I());
        C9883b.m20535o(parcel, 4, aVar.mo42081A());
        C9883b.m20525e(parcel, 5, aVar.mo42084H(), false);
        C9883b.m20538r(parcel, 6, aVar.mo42086J(), i, false);
        C9883b.m20522b(parcel, a);
    }

    /* renamed from: a */
    public C8188a createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Uri uri = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    str = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 2:
                    str2 = SafeParcelReader.m6715f(parcel, s);
                    break;
                case 3:
                    i = SafeParcelReader.m6730u(parcel, s);
                    break;
                case 4:
                    j = SafeParcelReader.m6732w(parcel, s);
                    break;
                case 5:
                    bundle = SafeParcelReader.m6710a(parcel, s);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m6714e(parcel, s, Uri.CREATOR);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8188a(str, str2, i, j, bundle, uri);
    }

    /* renamed from: b */
    public C8188a[] newArray(int i) {
        return new C8188a[i];
    }
}
