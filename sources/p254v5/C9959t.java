package p254v5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5366h3;
import com.google.android.gms.internal.gtm.C5381i3;
import com.google.android.gms.internal.gtm.C5511qa;
import com.google.android.gms.internal.gtm.C5513qc;
import p036b5.C2888a;

/* renamed from: v5.t */
public final class C9959t extends C5511qa implements C9957r {
    C9959t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public final C5366h3 getService(C2888a aVar, C9951l lVar, C9942c cVar) {
        Parcel E = mo33480E();
        C5513qc.m8435c(E, aVar);
        C5513qc.m8435c(E, lVar);
        C5513qc.m8435c(E, cVar);
        Parcel G = mo33481G(1, E);
        C5366h3 G2 = C5381i3.m8034G(G.readStrongBinder());
        G.recycle();
        return G2;
    }
}
