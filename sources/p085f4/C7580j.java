package p085f4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4744c;
import p073e4.C7474b;
import p190p4.C9052b;
import p190p4.C9054c;
import p264w4.C10112a;

/* renamed from: f4.j */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7580j {

    /* renamed from: a */
    private static C10112a f10561a = new C10112a("GoogleSignInCommon", new String[0]);

    @Nullable
    /* renamed from: a */
    public static C7474b m14920a(@Nullable Intent intent) {
        if (intent == null) {
            return new C7474b((GoogleSignInAccount) null, Status.f4891i);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C7474b(googleSignInAccount, Status.f4889g);
        }
        if (status == null) {
            status = Status.f4891i;
        }
        return new C7474b((GoogleSignInAccount) null, status);
    }

    /* renamed from: b */
    public static Intent m14921b(Context context, GoogleSignInOptions googleSignInOptions) {
        f10561a.mo44690a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: c */
    public static C9052b<Status> m14922c(C4733c cVar, Context context, boolean z) {
        f10561a.mo44690a("Signing out", new Object[0]);
        m14923d(context);
        if (z) {
            return C9054c.m18393b(Status.f4889g, cVar);
        }
        return cVar.mo32427a(new C7581k(cVar));
    }

    /* renamed from: d */
    private static void m14923d(Context context) {
        C7587q.m14936c(context).mo41341a();
        for (C4733c e : C4733c.m6458b()) {
            e.mo32430e();
        }
        C4744c.m6508a();
    }

    /* renamed from: e */
    public static Intent m14924e(Context context, GoogleSignInOptions googleSignInOptions) {
        f10561a.mo44690a("getFallbackSignInIntent()", new Object[0]);
        Intent b = m14921b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    /* renamed from: f */
    public static C9052b<Status> m14925f(C4733c cVar, Context context, boolean z) {
        f10561a.mo44690a("Revoking access", new Object[0]);
        String e = C7573c.m14901b(context).mo41328e();
        m14923d(context);
        if (z) {
            return C7577g.m14914a(e);
        }
        return cVar.mo32427a(new C7582l(cVar));
    }

    /* renamed from: g */
    public static Intent m14926g(Context context, GoogleSignInOptions googleSignInOptions) {
        f10561a.mo44690a("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = m14921b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
