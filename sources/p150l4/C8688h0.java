package p150l4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.api.C4733c;
import p109h4.C7958q;
import p180o4.C8974c;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: l4.h0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8688h0 extends C9683g {
    public C8688h0(Context context, Looper looper, C9673d dVar, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 161, dVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.cast.internal.ICastService";
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

    /* renamed from: k */
    public final int mo34955k() {
        return C4785c.f5063a;
    }

    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof C8695l) {
            return (C8695l) queryLocalInterface;
        }
        return new C8695l(iBinder);
    }

    /* renamed from: v */
    public final C8974c[] mo42784v() {
        return C7958q.f11196n;
    }
}
