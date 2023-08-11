package p232t5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4733c;
import p085f4.C7573c;
import p221s5.C9500f;
import p231t4.C9665c;
import p231t4.C9673d;
import p231t4.C9683g;
import p231t4.C9707n0;
import p231t4.C9713p;
import p231t4.C9714p0;

/* renamed from: t5.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9744a extends C9683g<C9750g> implements C9500f {

    /* renamed from: Y */
    public static final /* synthetic */ int f14551Y = 0;

    /* renamed from: J */
    private final boolean f14552J = true;

    /* renamed from: K */
    private final C9673d f14553K;

    /* renamed from: M */
    private final Bundle f14554M;
    @Nullable

    /* renamed from: X */
    private final Integer f14555X;

    public C9744a(@NonNull Context context, @NonNull Looper looper, boolean z, @NonNull C9673d dVar, @NonNull Bundle bundle, @NonNull C4733c.C4734a aVar, @NonNull C4733c.C4735b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f14553K = dVar;
        this.f14554M = bundle;
        this.f14555X = dVar.mo44167i();
    }

    @NonNull
    /* renamed from: n0 */
    public static Bundle m20335n0(@NonNull C9673d dVar) {
        dVar.mo44166h();
        Integer i = dVar.mo44167i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo44159a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: A */
    public final Bundle mo41420A() {
        if (!mo44153y().getPackageName().equals(this.f14553K.mo44164f())) {
            this.f14554M.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14553K.mo44164f());
        }
        return this.f14554M;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: F */
    public final String mo34953F() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo34954G() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: f */
    public final void mo43951f(C9749f fVar) {
        GoogleSignInAccount googleSignInAccount;
        C9713p.m20276k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f14553K.mo44161c();
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C7573c.m14901b(mo44153y()).mo41326c();
            } else {
                googleSignInAccount = null;
            }
            ((C9750g) mo44125E()).mo44273b3(new C9753j(1, new C9707n0(c, ((Integer) C9713p.m20275j(this.f14555X)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo43515b0(new C9755l(1, new ConnectionResult(8, (PendingIntent) null), (C9714p0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: k */
    public final int mo34955k() {
        return C4785c.f5063a;
    }

    /* renamed from: o */
    public final boolean mo32407o() {
        return this.f14552J;
    }

    /* renamed from: p */
    public final void mo43952p() {
        mo44142h(new C9665c.C9669d());
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: s */
    public final /* synthetic */ IInterface mo34956s(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C9750g) {
            return (C9750g) queryLocalInterface;
        }
        return new C9750g(iBinder);
    }
}
