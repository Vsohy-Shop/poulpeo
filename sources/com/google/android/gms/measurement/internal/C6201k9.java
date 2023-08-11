package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6201k9 implements Parcelable.Creator<C6190j9> {
    /* renamed from: a */
    static void m10854a(C6190j9 j9Var, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, j9Var.f7906b);
        C9883b.m20539s(parcel, 2, j9Var.f7907c, false);
        C9883b.m20535o(parcel, 3, j9Var.f7908d);
        C9883b.m20537q(parcel, 4, j9Var.f7909e, false);
        C9883b.m20530j(parcel, 5, (Float) null, false);
        C9883b.m20539s(parcel, 6, j9Var.f7910f, false);
        C9883b.m20539s(parcel, 7, j9Var.f7911g, false);
        C9883b.m20528h(parcel, 8, j9Var.f7912h, false);
        C9883b.m20522b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 2:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 3:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 4:
                    l = SafeParcelReader.m6733x(parcel2, s);
                    break;
                case 5:
                    f = SafeParcelReader.m6727r(parcel2, s);
                    break;
                case 6:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 7:
                    str3 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 8:
                    d = SafeParcelReader.m6725p(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C6190j9(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C6190j9[i];
    }
}
