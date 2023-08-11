package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.gtm.g3 */
public final class C5350g3 extends C5511qa implements C5320e3 {
    C5350g3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    /* renamed from: Y */
    public final void mo33185Y(boolean z, String str) {
        Parcel E = mo33480E();
        C5513qc.m8433a(E, z);
        E.writeString(str);
        mo33484b3(1, E);
    }
}
