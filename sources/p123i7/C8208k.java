package p123i7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p123i7.C8206j;
import p242u4.C9883b;

/* renamed from: i7.k */
/* compiled from: ShortDynamicLinkImplCreator */
public class C8208k implements Parcelable.Creator<C8206j> {
    /* renamed from: c */
    static void m16251c(C8206j jVar, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 1, jVar.mo41858v(), i, false);
        C9883b.m20538r(parcel, 2, jVar.mo42110A(), i, false);
        C9883b.m20543w(parcel, 3, jVar.mo42111F(), false);
        C9883b.m20522b(parcel, a);
    }

    /* renamed from: a */
    public C8206j createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList<C8206j.C8207a> arrayList = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                uri = (Uri) SafeParcelReader.m6714e(parcel, s, Uri.CREATOR);
            } else if (l == 2) {
                uri2 = (Uri) SafeParcelReader.m6714e(parcel, s, Uri.CREATOR);
            } else if (l != 3) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                arrayList = SafeParcelReader.m6719j(parcel, s, C8206j.C8207a.CREATOR);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8206j(uri, uri2, arrayList);
    }

    /* renamed from: b */
    public C8206j[] newArray(int i) {
        return new C8206j[i];
    }
}
