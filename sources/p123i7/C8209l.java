package p123i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p123i7.C8206j;
import p242u4.C9883b;

/* renamed from: i7.l */
/* compiled from: WarningImplCreator */
public class C8209l implements Parcelable.Creator<C8206j.C8207a> {
    /* renamed from: c */
    static void m16254c(C8206j.C8207a aVar, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, aVar.mo42113A(), false);
        C9883b.m20522b(parcel, a);
    }

    /* renamed from: a */
    public C8206j.C8207a createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C8206j.C8207a(str);
    }

    /* renamed from: b */
    public C8206j.C8207a[] newArray(int i) {
        return new C8206j.C8207a[i];
    }
}
