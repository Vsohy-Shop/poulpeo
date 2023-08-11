package p231t4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: t4.d1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9676d1 implements ServiceConnection {

    /* renamed from: b */
    private final int f14433b;

    /* renamed from: c */
    final /* synthetic */ C9665c f14434c;

    public C9676d1(C9665c cVar, int i) {
        this.f14434c = cVar;
        this.f14433b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C9699l lVar;
        C9665c cVar = this.f14434c;
        if (iBinder == null) {
            C9665c.m20126e0(cVar, 16);
            return;
        }
        synchronized (cVar.f14398o) {
            C9665c cVar2 = this.f14434c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C9699l)) {
                lVar = new C9726t0(iBinder);
            } else {
                lVar = (C9699l) queryLocalInterface;
            }
            cVar2.f14399p = lVar;
        }
        this.f14434c.mo44140f0(0, (Bundle) null, this.f14433b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14434c.f14398o) {
            this.f14434c.f14399p = null;
        }
        Handler handler = this.f14434c.f14396m;
        handler.sendMessage(handler.obtainMessage(6, this.f14433b, 1));
    }
}
