package p085f4;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C4615a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p286y4.C10683q;

/* renamed from: f4.v */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7592v extends C7589s {

    /* renamed from: a */
    private final Context f10568a;

    public C7592v(Context context) {
        this.f10568a = context;
    }

    /* renamed from: G */
    private final void m14948G() {
        if (!C10683q.m22710a(this.f10568a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: h */
    public final void mo41339h() {
        m14948G();
        C7573c b = C7573c.m14901b(this.f10568a);
        GoogleSignInAccount c = b.mo41326c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f4452m;
        if (c != null) {
            googleSignInOptions = b.mo41327d();
        }
        GoogleSignInClient a = C4615a.m5954a(this.f10568a, googleSignInOptions);
        if (c != null) {
            a.mo31858C();
        } else {
            a.mo31859D();
        }
    }

    /* renamed from: j */
    public final void mo41340j() {
        m14948G();
        C7587q.m14936c(this.f10568a).mo41341a();
    }
}
