package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import p109h4.C7931g;
import p220s4.C9493a;

/* renamed from: com.google.android.gms.cast.o */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4700o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        String str = null;
        ArrayList<C7931g> arrayList = null;
        ArrayList<C9493a> arrayList2 = null;
        double d = 0.0d;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 2) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 3) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 4) {
                arrayList = SafeParcelReader.m6719j(parcel, s, C7931g.CREATOR);
            } else if (l == 5) {
                arrayList2 = SafeParcelReader.m6719j(parcel, s, C9493a.CREATOR);
            } else if (l != 6) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                d = SafeParcelReader.m6724o(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C4629e(i, str, arrayList, arrayList2, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4629e[i];
    }
}
