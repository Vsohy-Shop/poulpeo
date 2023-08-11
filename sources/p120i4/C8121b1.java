package p120i4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import p109h4.C7927e1;

/* renamed from: i4.b1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C8121b1 extends C7927e1 {

    /* renamed from: a */
    final /* synthetic */ C8125d f11451a;

    /* synthetic */ C8121b1(C8125d dVar, C8118a1 a1Var) {
        this.f11451a = dVar;
    }

    /* renamed from: a */
    public final void mo41688a() {
        C8125d dVar = this.f11451a;
        if (dVar.f11458f != null) {
            try {
                if (dVar.f11463k != null) {
                    dVar.f11463k.mo32154O();
                }
                this.f11451a.f11458f.mo42042H((Bundle) null);
            } catch (RemoteException e) {
                C8125d.f11455p.mo42755b(e, "Unable to call %s on %s.", "onConnected", C8168u.class.getSimpleName());
            }
        }
    }

    /* renamed from: b */
    public final void mo41689b(int i) {
        C8125d dVar = this.f11451a;
        if (dVar.f11458f != null) {
            try {
                dVar.f11458f.mo42043K1(new ConnectionResult(i));
            } catch (RemoteException e) {
                C8125d.f11455p.mo42755b(e, "Unable to call %s on %s.", "onConnectionFailed", C8168u.class.getSimpleName());
            }
        }
    }

    /* renamed from: c */
    public final void mo41690c(int i) {
        C8125d dVar = this.f11451a;
        if (dVar.f11458f != null) {
            try {
                dVar.f11458f.mo42041C(i);
            } catch (RemoteException e) {
                C8125d.f11455p.mo42755b(e, "Unable to call %s on %s.", "onConnectionSuspended", C8168u.class.getSimpleName());
            }
        }
    }

    /* renamed from: d */
    public final void mo41691d(int i) {
        C8125d dVar = this.f11451a;
        if (dVar.f11458f != null) {
            try {
                dVar.f11458f.mo42043K1(new ConnectionResult(i));
            } catch (RemoteException e) {
                C8125d.f11455p.mo42755b(e, "Unable to call %s on %s.", "onDisconnected", C8168u.class.getSimpleName());
            }
        }
    }
}
