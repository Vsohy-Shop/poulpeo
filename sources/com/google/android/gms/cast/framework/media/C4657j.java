package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.framework.media.j */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4657j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 2:
                    arrayList = SafeParcelReader.m6717h(parcel2, s);
                    break;
                case 3:
                    iArr = SafeParcelReader.m6712c(parcel2, s);
                    break;
                case 4:
                    j = SafeParcelReader.m6732w(parcel2, s);
                    break;
                case 5:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 6:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 7:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 8:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 9:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 10:
                    i5 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 11:
                    i6 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 12:
                    i7 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 13:
                    i8 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 14:
                    i9 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 15:
                    i10 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 16:
                    i11 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 17:
                    i12 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 18:
                    i13 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 19:
                    i14 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 20:
                    i15 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 21:
                    i16 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 22:
                    i17 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 23:
                    i18 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 24:
                    i19 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 25:
                    i20 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 26:
                    i21 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 27:
                    i22 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 28:
                    i23 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 29:
                    i24 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 30:
                    i25 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 31:
                    i26 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 32:
                    i27 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 33:
                    iBinder = SafeParcelReader.m6729t(parcel2, s);
                    break;
                case 34:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 35:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C4646g(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4646g[i];
    }
}
