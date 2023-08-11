package p254v5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5511qa;
import com.google.android.gms.internal.gtm.C5513qc;

/* renamed from: v5.h */
public final class C9947h extends C5511qa implements C9945f {
    C9947h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementEventListener");
    }

    /* renamed from: s */
    public final void mo33515s(String str, String str2, Bundle bundle, long j) {
        Parcel E = mo33480E();
        E.writeString(str);
        E.writeString(str2);
        C5513qc.m8436d(E, bundle);
        E.writeLong(j);
        mo33482J(1, E);
    }
}
