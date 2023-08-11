package p231t4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p180o4.C8974c;
import p242u4.C9883b;

/* renamed from: t4.k1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9698k1 implements Parcelable.Creator<C9680f> {
    /* renamed from: a */
    static void m20241a(C9680f fVar, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, fVar.f14443b);
        C9883b.m20532l(parcel, 2, fVar.f14444c);
        C9883b.m20532l(parcel, 3, fVar.f14445d);
        C9883b.m20539s(parcel, 4, fVar.f14446e, false);
        C9883b.m20531k(parcel, 5, fVar.f14447f, false);
        C9883b.m20542v(parcel, 6, fVar.f14448g, i, false);
        C9883b.m20525e(parcel, 7, fVar.f14449h, false);
        C9883b.m20538r(parcel, 8, fVar.f14450i, i, false);
        C9883b.m20542v(parcel, 10, fVar.f14451j, i, false);
        C9883b.m20542v(parcel, 11, fVar.f14452k, i, false);
        C9883b.m20523c(parcel, 12, fVar.f14453l);
        C9883b.m20532l(parcel, 13, fVar.f14454m);
        C9883b.m20523c(parcel, 14, fVar.f14455n);
        C9883b.m20539s(parcel, 15, fVar.mo44187A(), false);
        C9883b.m20522b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = SafeParcelReader.m6707A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C8974c[] cVarArr = null;
        C8974c[] cVarArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            switch (SafeParcelReader.m6721l(s)) {
                case 1:
                    i = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 2:
                    i2 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 3:
                    i3 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 4:
                    str = SafeParcelReader.m6715f(parcel2, s);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m6729t(parcel2, s);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m6718i(parcel2, s, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m6710a(parcel2, s);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m6714e(parcel2, s, Account.CREATOR);
                    break;
                case 10:
                    cVarArr = (C8974c[]) SafeParcelReader.m6718i(parcel2, s, C8974c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (C8974c[]) SafeParcelReader.m6718i(parcel2, s, C8974c.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 13:
                    i4 = SafeParcelReader.m6730u(parcel2, s);
                    break;
                case 14:
                    z2 = SafeParcelReader.m6722m(parcel2, s);
                    break;
                case 15:
                    str2 = SafeParcelReader.m6715f(parcel2, s);
                    break;
                default:
                    SafeParcelReader.m6735z(parcel2, s);
                    break;
            }
        }
        SafeParcelReader.m6720k(parcel2, A);
        return new C9680f(i, i2, i3, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C9680f[i];
    }
}
