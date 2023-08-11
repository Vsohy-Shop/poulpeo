package p073e4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p190p4.C9056e;

/* renamed from: e4.b */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class C7474b implements C9056e {

    /* renamed from: b */
    private Status f10357b;
    @Nullable

    /* renamed from: c */
    private GoogleSignInAccount f10358c;

    public C7474b(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f10358c = googleSignInAccount;
        this.f10357b = status;
    }

    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount mo41185a() {
        return this.f10358c;
    }

    @NonNull
    public Status getStatus() {
        return this.f10357b;
    }
}
