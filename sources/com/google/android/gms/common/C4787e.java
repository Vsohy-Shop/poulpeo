package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4787e implements Parcelable.Creator<ConnectionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m6714e(parcel, s, PendingIntent.CREATOR);
            } else if (l != 4) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                str = SafeParcelReader.m6715f(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
