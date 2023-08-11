package p120i4;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import p036b5.C2888a;
import p150l4.C8675b;

/* renamed from: i4.c1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8124c1 {

    /* renamed from: b */
    private static final C8675b f11453b = new C8675b("DiscoveryManager");

    /* renamed from: a */
    private final C8172w f11454a;

    C8124c1(C8172w wVar) {
        this.f11454a = wVar;
    }

    @Nullable
    /* renamed from: a */
    public final C2888a mo41996a() {
        try {
            return this.f11454a.mo42065e();
        } catch (RemoteException e) {
            f11453b.mo42755b(e, "Unable to call %s on %s.", "getWrappedThis", C8172w.class.getSimpleName());
            return null;
        }
    }
}
