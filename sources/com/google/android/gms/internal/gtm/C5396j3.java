package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.gtm.j3 */
public final class C5396j3 extends C5511qa implements C5366h3 {
    C5396j3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    /* renamed from: H2 */
    public final void mo33127H2(String str, Bundle bundle, String str2, long j, boolean z) {
        Parcel E = mo33480E();
        E.writeString(str);
        C5513qc.m8436d(E, bundle);
        E.writeString(str2);
        E.writeLong(j);
        C5513qc.m8433a(E, z);
        mo33482J(101, E);
    }

    /* renamed from: O */
    public final void mo33128O() {
        mo33482J(3, mo33480E());
    }

    /* renamed from: R2 */
    public final void mo33129R2(String str, String str2, String str3, C5320e3 e3Var) {
        Parcel E = mo33480E();
        E.writeString(str);
        E.writeString(str2);
        E.writeString(str3);
        C5513qc.m8435c(E, e3Var);
        mo33482J(2, E);
    }

    /* renamed from: k */
    public final void mo33131k() {
        mo33482J(102, mo33480E());
    }
}
