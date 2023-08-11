package p098g5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.api.C4733c;
import p035b4.C2883b;
import p035b4.C2884c;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: g5.b */
public final class C7775b extends C9683g<C7776c> {

    /* renamed from: J */
    private final Bundle f10813J;

    public C7775b(Context context, Looper looper, C9673d dVar, C2884c cVar, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 16, dVar, aVar, bVar);
        if (cVar == null) {
            this.f10813J = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Bundle mo41420A() {
        return this.f10813J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: k */
    public final int mo34955k() {
        return C4785c.f5063a;
    }

    /* renamed from: o */
    public final boolean mo32407o() {
        C9673d k0 = mo44189k0();
        if (TextUtils.isEmpty(k0.mo44160b()) || k0.mo44163e(C2883b.f1295c).isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C7776c) {
            return (C7776c) queryLocalInterface;
        }
        return new C7777d(iBinder);
    }
}
