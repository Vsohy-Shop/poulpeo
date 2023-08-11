package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInAccount extends C9882a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C4620f();
    @Deprecated

    /* renamed from: b */
    private String f4480b;

    /* renamed from: c */
    private GoogleSignInAccount f4481c;
    @Deprecated

    /* renamed from: d */
    private String f4482d;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f4481c = googleSignInAccount;
        this.f4480b = C9713p.m20272g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f4482d = C9713p.m20272g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: k */
    public final GoogleSignInAccount mo31882k() {
        return this.f4481c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 4, this.f4480b, false);
        C9883b.m20538r(parcel, 7, this.f4481c, i, false);
        C9883b.m20539s(parcel, 8, this.f4482d, false);
        C9883b.m20522b(parcel, a);
    }
}
