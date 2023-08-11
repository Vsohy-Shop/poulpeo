package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.C4882e;
import p120i4.C8116a;
import p120i4.C8178z;
import p150l4.C8675b;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class ReconnectionService extends Service {

    /* renamed from: c */
    private static final C8675b f4615c = new C8675b("ReconnectionService");
    @Nullable

    /* renamed from: b */
    private C8178z f4616b;

    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        C8178z zVar = this.f4616b;
        if (zVar != null) {
            try {
                return zVar.mo42068k1(intent);
            } catch (RemoteException e) {
                f4615c.mo42755b(e, "Unable to call %s on %s.", "onBind", C8178z.class.getSimpleName());
            }
        }
        return null;
    }

    public void onCreate() {
        C8116a d = C8116a.m15986d(this);
        C8178z c = C4882e.m6935c(this, d.mo41972b().mo42059e(), d.mo41973e().mo41996a());
        this.f4616b = c;
        if (c != null) {
            try {
                c.mo42067d();
            } catch (RemoteException e) {
                f4615c.mo42755b(e, "Unable to call %s on %s.", "onCreate", C8178z.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    public void onDestroy() {
        C8178z zVar = this.f4616b;
        if (zVar != null) {
            try {
                zVar.mo42069y();
            } catch (RemoteException e) {
                f4615c.mo42755b(e, "Unable to call %s on %s.", "onDestroy", C8178z.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        C8178z zVar = this.f4616b;
        if (zVar != null) {
            try {
                return zVar.mo42066X2(intent, i, i2);
            } catch (RemoteException e) {
                f4615c.mo42755b(e, "Unable to call %s on %s.", "onStartCommand", C8178z.class.getSimpleName());
            }
        }
        return 2;
    }
}
