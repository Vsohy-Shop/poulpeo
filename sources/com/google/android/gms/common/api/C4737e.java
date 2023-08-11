package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4737e implements Parcelable.Creator<Status> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            int l = SafeParcelReader.m6721l(s);
            if (l == 1) {
                i2 = SafeParcelReader.m6730u(parcel, s);
            } else if (l == 2) {
                str = SafeParcelReader.m6715f(parcel, s);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m6714e(parcel, s, PendingIntent.CREATOR);
            } else if (l == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m6714e(parcel, s, ConnectionResult.CREATOR);
            } else if (l != 1000) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                i = SafeParcelReader.m6730u(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
