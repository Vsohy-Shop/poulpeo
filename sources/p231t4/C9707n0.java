package p231t4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.n0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9707n0 extends C9882a {
    public static final Parcelable.Creator<C9707n0> CREATOR = new C9711o0();

    /* renamed from: b */
    final int f14504b;

    /* renamed from: c */
    private final Account f14505c;

    /* renamed from: d */
    private final int f14506d;
    @Nullable

    /* renamed from: e */
    private final GoogleSignInAccount f14507e;

    C9707n0(int i, Account account, int i2, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f14504b = i;
        this.f14505c = account;
        this.f14506d = i2;
        this.f14507e = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14504b);
        C9883b.m20538r(parcel, 2, this.f14505c, i, false);
        C9883b.m20532l(parcel, 3, this.f14506d);
        C9883b.m20538r(parcel, 4, this.f14507e, i, false);
        C9883b.m20522b(parcel, a);
    }

    public C9707n0(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
