package p254v5;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5511qa;
import com.google.android.gms.internal.gtm.C5513qc;
import p036b5.C2888a;

/* renamed from: v5.q */
public final class C9956q extends C5511qa implements C9954o {
    C9956q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public final void initialize(C2888a aVar, C9951l lVar, C9942c cVar) {
        Parcel E = mo33480E();
        C5513qc.m8435c(E, aVar);
        C5513qc.m8435c(E, lVar);
        C5513qc.m8435c(E, cVar);
        mo33482J(1, E);
    }

    public final void previewIntent(Intent intent, C2888a aVar, C2888a aVar2, C9951l lVar, C9942c cVar) {
        Parcel E = mo33480E();
        C5513qc.m8436d(E, intent);
        C5513qc.m8435c(E, aVar);
        C5513qc.m8435c(E, aVar2);
        C5513qc.m8435c(E, lVar);
        C5513qc.m8435c(E, cVar);
        mo33482J(3, E);
    }
}
