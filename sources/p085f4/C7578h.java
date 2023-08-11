package p085f4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Scope;
import p110h5.C7979b;
import p231t4.C9673d;
import p231t4.C9683g;

/* renamed from: f4.h */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7578h extends C9683g<C7590t> {

    /* renamed from: J */
    private final GoogleSignInOptions f10560J;

    public C7578h(Context context, Looper looper, C9673d dVar, @Nullable GoogleSignInOptions googleSignInOptions, C4733c.C4734a aVar, C4733c.C4735b bVar) {
        super(context, looper, 91, dVar, aVar, bVar);
        GoogleSignInOptions.C4614a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.C4614a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.C4614a();
        }
        aVar2.mo31880h(C7979b.m15681a());
        if (!dVar.mo44162d().isEmpty()) {
            for (Scope e : dVar.mo44162d()) {
                aVar2.mo31877e(e, new Scope[0]);
            }
        }
        this.f10560J = aVar2.mo31873a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: k */
    public final int mo34955k() {
        return C4785c.f5063a;
    }

    /* renamed from: n0 */
    public final GoogleSignInOptions mo41338n0() {
        return this.f10560J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C7590t) {
            return (C7590t) queryLocalInterface;
        }
        return new C7593w(iBinder);
    }
}
