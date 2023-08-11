package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6301u implements Parcelable.Creator<C6290t> {
    /* renamed from: a */
    static void m11118a(C6290t tVar, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, tVar.f8229b, false);
        C9883b.m20538r(parcel, 3, tVar.f8230c, i, false);
        C9883b.m20539s(parcel, 4, tVar.f8231d, false);
        C9883b.m20535o(parcel, 5, tVar.f8232e);
        C9883b.m20522b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        String str = null;
        C6268r rVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 3) {
                rVar = (C6268r) SafeParcelReader.m6714e(parcel, s, C6268r.CREATOR);
            } else if (l == 4) {
                str2 = SafeParcelReader.m6715f(parcel, s);
            } else if (l != 5) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                j = SafeParcelReader.m6732w(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C6290t(str, rVar, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6290t[i];
    }
}
