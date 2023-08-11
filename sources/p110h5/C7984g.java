package p110h5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C4733c;
import p035b4.C2880a;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: h5.g */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7984g extends C9683g<C7986i> {

    /* renamed from: J */
    private final C2880a.C2881a f11221J;

    public C7984g(Context context, Looper looper, C9673d dVar, C2880a.C2881a aVar, C4733c.C4734a aVar2, C4733c.C4735b bVar) {
        super(context, looper, 68, dVar, aVar2, bVar);
        this.f11221J = new C2880a.C2881a.C2882a(aVar == null ? C2880a.C2881a.f1286e : aVar).mo28414a(C7979b.m15681a()).mo28415b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo41420A() {
        return this.f11221J.mo28411a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: k */
    public final int mo34955k() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C7986i) {
            return (C7986i) queryLocalInterface;
        }
        return new C7985h(iBinder);
    }
}
