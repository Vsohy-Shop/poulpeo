package com.rmn.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.auth.api.signin.C4615a;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* compiled from: GoogleLoginUtil.kt */
public final class GoogleLoginUtil {
    public static final int $stable = 0;
    public static final GoogleLoginUtil INSTANCE = new GoogleLoginUtil();

    private GoogleLoginUtil() {
    }

    public final GoogleSignInClient newGoogleSignIn(Context context) {
        C12775o.m28639i(context, "context");
        GoogleSignInOptions a = new GoogleSignInOptions.C4614a(GoogleSignInOptions.f4452m).mo31878f("1022663636855-hprk0hg5rldubmg93bks0n25no1e9g3d.apps.googleusercontent.com").mo31874b().mo31873a();
        C12775o.m28638h(a, "Builder(GoogleSignInOpti…\n                .build()");
        GoogleSignInClient a2 = C4615a.m5954a(context, a);
        C12775o.m28638h(a2, "getClient(context, gso)");
        return a2;
    }

    public final void signOut(Context context) {
        C12775o.m28639i(context, "context");
        newGoogleSignIn(context).mo31859D();
    }
}
