package p254v5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5511qa;
import com.google.android.gms.internal.gtm.C5513qc;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v5.n */
public final class C9953n extends C5511qa implements C9951l {
    C9953n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    /* renamed from: E2 */
    public final void mo35444E2(C9948i iVar) {
        Parcel E = mo33480E();
        C5513qc.m8435c(E, iVar);
        mo33482J(21, E);
    }

    /* renamed from: S1 */
    public final Map mo35445S1() {
        Parcel G = mo33481G(11, mo33480E());
        HashMap f = C5513qc.m8438f(G);
        G.recycle();
        return f;
    }

    /* renamed from: t1 */
    public final void mo35446t1(C9945f fVar) {
        Parcel E = mo33480E();
        C5513qc.m8435c(E, fVar);
        mo33482J(22, E);
    }

    /* renamed from: z0 */
    public final void mo35447z0(String str, String str2, Bundle bundle, long j) {
        Parcel E = mo33480E();
        E.writeString(str);
        E.writeString(str2);
        C5513qc.m8436d(E, bundle);
        E.writeLong(j);
        mo33482J(2, E);
    }
}
