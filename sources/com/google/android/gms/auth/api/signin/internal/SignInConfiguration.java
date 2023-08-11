package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p085f4.C7572b;
import p085f4.C7594x;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class SignInConfiguration extends C9882a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C7594x();

    /* renamed from: b */
    private final String f4484b;

    /* renamed from: c */
    private GoogleSignInOptions f4485c;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f4484b = C9713p.m20271f(str);
        this.f4485c = googleSignInOptions;
    }

    /* renamed from: A */
    public final GoogleSignInOptions mo31891A() {
        return this.f4485c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f4484b.equals(signInConfiguration.f4484b)) {
            GoogleSignInOptions googleSignInOptions = this.f4485c;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f4485c == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f4485c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C7572b().mo41322a(this.f4484b).mo41322a(this.f4485c).mo41323b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, this.f4484b, false);
        C9883b.m20538r(parcel, 5, this.f4485c, i, false);
        C9883b.m20522b(parcel, a);
    }
}
