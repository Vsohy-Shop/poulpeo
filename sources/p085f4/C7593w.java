package p085f4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p110h5.C7981d;
import p110h5.C7982e;

/* renamed from: f4.w */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7593w extends C7981d implements C7590t {
    C7593w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: K0 */
    public final void mo41345K0(C7588r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel E = mo41821E();
        C7982e.m15686b(E, rVar);
        C7982e.m15687c(E, googleSignInOptions);
        mo41822G(102, E);
    }

    /* renamed from: j1 */
    public final void mo41346j1(C7588r rVar, GoogleSignInOptions googleSignInOptions) {
        Parcel E = mo41821E();
        C7982e.m15686b(E, rVar);
        C7982e.m15687c(E, googleSignInOptions);
        mo41822G(103, E);
    }
}
