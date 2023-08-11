package p150l4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.C4733c;
import p109h4.C7958q;
import p180o4.C8974c;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: l4.q0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8706q0 extends C9683g {

    /* renamed from: Y */
    private static final C8675b f12486Y = new C8675b("CastClientImplCxless");

    /* renamed from: J */
    private final CastDevice f12487J;

    /* renamed from: K */
    private final long f12488K;

    /* renamed from: M */
    private final Bundle f12489M;

    /* renamed from: X */
    private final String f12490X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8706q0(Context context, Looper looper, C9673d dVar, CastDevice castDevice, long j, Bundle bundle, String str, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.f12487J = castDevice;
        this.f12488K = j;
        this.f12489M = bundle;
        this.f12490X = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo41420A() {
        Bundle bundle = new Bundle();
        f12486Y.mo42754a("getRemoteService()", new Object[0]);
        this.f12487J.mo31903M(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f12488K);
        bundle.putString("connectionless_client_record_id", this.f12490X);
        Bundle bundle2 = this.f12489M;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* renamed from: T */
    public final boolean mo42094T() {
        return true;
    }

    /* renamed from: c */
    public final void mo32396c() {
        try {
            ((C8689i) mo44125E()).mo42788f();
        } catch (RemoteException | IllegalStateException e) {
            f12486Y.mo42755b(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.mo32396c();
        }
    }

    /* renamed from: k */
    public final int mo34955k() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C8689i) {
            return (C8689i) queryLocalInterface;
        }
        return new C8689i(iBinder);
    }

    /* renamed from: v */
    public final C8974c[] mo42784v() {
        return C7958q.f11196n;
    }
}
