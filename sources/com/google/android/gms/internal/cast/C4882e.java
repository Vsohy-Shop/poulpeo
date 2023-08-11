package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;
import p036b5.C2888a;
import p036b5.C2890b;
import p120i4.C8119b;
import p120i4.C8123c0;
import p120i4.C8136g1;
import p120i4.C8145j1;
import p120i4.C8147k0;
import p120i4.C8168u;
import p120i4.C8178z;
import p130j4.C8403i;
import p130j4.C8405k;
import p150l4.C8675b;

/* renamed from: com.google.android.gms.internal.cast.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4882e {

    /* renamed from: a */
    private static final C8675b f5199a = new C8675b("CastDynamiteModule");

    /* renamed from: a */
    public static C8145j1 m6933a(Context context, C8119b bVar, C4984k kVar, Map map) {
        return m6938f(context).mo32821v1(C2890b.m2297b3(context.getApplicationContext()), bVar, kVar, map);
    }

    @Nullable
    /* renamed from: b */
    public static C8168u m6934b(Context context, C8119b bVar, @Nullable C2888a aVar, C8136g1 g1Var) {
        if (aVar == null) {
            return null;
        }
        try {
            return m6938f(context).mo32817J0(bVar, aVar, g1Var);
        } catch (RemoteException | ModuleUnavailableException e) {
            f5199a.mo42755b(e, "Unable to call %s on %s.", "newCastSessionImpl", C4950i.class.getSimpleName());
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public static C8178z m6935c(Service service, @Nullable C2888a aVar, @Nullable C2888a aVar2) {
        if (!(aVar == null || aVar2 == null)) {
            try {
                return m6938f(service.getApplicationContext()).mo32820p1(C2890b.m2297b3(service), aVar, aVar2);
            } catch (RemoteException | ModuleUnavailableException e) {
                f5199a.mo42755b(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", C4950i.class.getSimpleName());
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static C8123c0 m6936d(Context context, String str, @Nullable String str2, C8147k0 k0Var) {
        try {
            return m6938f(context).mo32818V2(str, str2, k0Var);
        } catch (RemoteException | ModuleUnavailableException e) {
            f5199a.mo42755b(e, "Unable to call %s on %s.", "newSessionImpl", C4950i.class.getSimpleName());
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public static C8403i m6937e(Context context, AsyncTask asyncTask, C8405k kVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            return m6938f(context.getApplicationContext()).mo32819h2(C2890b.m2297b3(asyncTask), kVar, i, i2, false, 2097152, 5, 333, 10000);
        } catch (RemoteException | ModuleUnavailableException e) {
            f5199a.mo42755b(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C4950i.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: f */
    private static C4950i m6938f(Context context) {
        try {
            IBinder d = DynamiteModule.m6738e(context, DynamiteModule.f5071b, "com.google.android.gms.cast.framework.dynamite").mo32582d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (d == null) {
                return null;
            }
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof C4950i) {
                return (C4950i) queryLocalInterface;
            }
            return new C4933h(d);
        } catch (DynamiteModule.LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
