package p085f4;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: f4.q */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C7587q {
    @Nullable

    /* renamed from: d */
    private static C7587q f10564d;

    /* renamed from: a */
    private C7573c f10565a;
    @Nullable

    /* renamed from: b */
    private GoogleSignInAccount f10566b;
    @Nullable

    /* renamed from: c */
    private GoogleSignInOptions f10567c = this.f10565a.mo41327d();

    private C7587q(Context context) {
        C7573c b = C7573c.m14901b(context);
        this.f10565a = b;
        this.f10566b = b.mo41326c();
    }

    /* renamed from: c */
    public static synchronized C7587q m14936c(@NonNull Context context) {
        C7587q d;
        synchronized (C7587q.class) {
            d = m14937d(context.getApplicationContext());
        }
        return d;
    }

    /* renamed from: d */
    private static synchronized C7587q m14937d(Context context) {
        synchronized (C7587q.class) {
            C7587q qVar = f10564d;
            if (qVar != null) {
                return qVar;
            }
            C7587q qVar2 = new C7587q(context);
            f10564d = qVar2;
            return qVar2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41341a() {
        this.f10565a.mo41325a();
        this.f10566b = null;
        this.f10567c = null;
    }

    /* renamed from: b */
    public final synchronized void mo41342b(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f10565a.mo41329f(googleSignInAccount, googleSignInOptions);
        this.f10566b = googleSignInAccount;
        this.f10567c = googleSignInOptions;
    }

    @Nullable
    /* renamed from: e */
    public final synchronized GoogleSignInAccount mo41343e() {
        return this.f10566b;
    }
}
