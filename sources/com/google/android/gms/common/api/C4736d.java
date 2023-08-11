package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4736d implements Parcelable.Creator<Scope> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
