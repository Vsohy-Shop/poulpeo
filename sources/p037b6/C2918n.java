package p037b6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: b6.n */
final class C2918n implements ServiceConnection {

    /* renamed from: b */
    final /* synthetic */ C2920o f1314b;

    /* synthetic */ C2918n(C2920o oVar) {
        this.f1314b = oVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1314b.f1317b.mo28424f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f1314b.m2366h(new C2914l(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1314b.f1317b.mo28424f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f1314b.m2366h(new C2916m(this));
    }
}
