package p130j4;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.C4646g;
import com.google.android.gms.cast.framework.media.C4658j0;
import java.util.List;
import p150l4.C8675b;

/* renamed from: j4.s */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8413s {

    /* renamed from: a */
    private static final C8675b f11985a = new C8675b("MediaSessionUtils");

    /* renamed from: a */
    public static int m16830a(C4646g gVar, long j) {
        int K = gVar.mo32118K();
        if (j == 10000) {
            return gVar.mo32116I();
        }
        if (j != 30000) {
            return K;
        }
        return gVar.mo32117J();
    }

    /* renamed from: b */
    public static int m16831b(C4646g gVar, long j) {
        int a0 = gVar.mo32134a0();
        if (j == 10000) {
            return gVar.mo32132Y();
        }
        if (j != 30000) {
            return a0;
        }
        return gVar.mo32133Z();
    }

    /* renamed from: c */
    public static int m16832c(C4646g gVar, long j) {
        int P = gVar.mo32123P();
        if (j == 10000) {
            return gVar.mo32121N();
        }
        if (j != 30000) {
            return P;
        }
        return gVar.mo32122O();
    }

    /* renamed from: d */
    public static int m16833d(C4646g gVar, long j) {
        int g0 = gVar.mo32140g0();
        if (j == 10000) {
            return gVar.mo32138e0();
        }
        if (j != 30000) {
            return g0;
        }
        return gVar.mo32139f0();
    }

    @Nullable
    /* renamed from: e */
    public static List m16834e(C4658j0 j0Var) {
        try {
            return j0Var.mo32214f();
        } catch (RemoteException e) {
            f11985a.mo42757d(e, "Unable to call %s on %s.", "getNotificationActions", C4658j0.class.getSimpleName());
            return null;
        }
    }

    @Nullable
    /* renamed from: f */
    public static int[] m16835f(C4658j0 j0Var) {
        try {
            return j0Var.mo32213d();
        } catch (RemoteException e) {
            f11985a.mo42757d(e, "Unable to call %s on %s.", "getCompactViewActionIndices", C4658j0.class.getSimpleName());
            return null;
        }
    }
}
