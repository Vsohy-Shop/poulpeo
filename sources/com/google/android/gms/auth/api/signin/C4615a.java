package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p073e4.C7474b;
import p085f4.C7580j;
import p085f4.C7587q;
import p231t4.C9662b;
import p231t4.C9713p;
import p276x5.C10410i;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C4615a {
    /* renamed from: a */
    public static GoogleSignInClient m5954a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new GoogleSignInClient(context, (GoogleSignInOptions) C9713p.m20275j(googleSignInOptions));
    }

    @Nullable
    /* renamed from: b */
    public static GoogleSignInAccount m5955b(Context context) {
        return C7587q.m14936c(context).mo41343e();
    }

    /* renamed from: c */
    public static Task<GoogleSignInAccount> m5956c(@Nullable Intent intent) {
        C7474b a = C7580j.m14920a(intent);
        if (a == null) {
            return C10410i.m21830d(C9662b.m20102a(Status.f4891i));
        }
        GoogleSignInAccount a2 = a.mo41185a();
        if (!a.getStatus().mo32381I() || a2 == null) {
            return C10410i.m21830d(C9662b.m20102a(a.getStatus()));
        }
        return C10410i.m21831e(a2);
    }
}
