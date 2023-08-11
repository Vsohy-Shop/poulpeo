package p231t4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p141k5.C8563a;
import p141k5.C8565c;

/* renamed from: t4.t1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9727t1 extends C8563a implements C9692j {
    C9727t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() {
        Parcel E = mo42625E(2, mo42626G());
        Account account = (Account) C8565c.m17199a(E, Account.CREATOR);
        E.recycle();
        return account;
    }
}
