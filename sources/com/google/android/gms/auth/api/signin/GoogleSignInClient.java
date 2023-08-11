package com.google.android.gms.auth.api.signin;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p035b4.C2880a;
import p073e4.C7474b;
import p085f4.C7580j;
import p190p4.C9056e;
import p200q4.C9216a;
import p200q4.C9236k;
import p231t4.C9709o;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class GoogleSignInClient extends C4730b<GoogleSignInOptions> {

    /* renamed from: k */
    private static final C4613b f4445k = new C4613b((C4619e) null);

    /* renamed from: l */
    private static int f4446l = C4612a.f4447a;

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    static final class C4612a {

        /* renamed from: a */
        public static final int f4447a = 1;

        /* renamed from: b */
        public static final int f4448b = 2;

        /* renamed from: c */
        public static final int f4449c = 3;

        /* renamed from: d */
        public static final int f4450d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f4451e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m5921a() {
            return (int[]) f4451e.clone();
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private static class C4613b implements C9709o.C9710a<C7474b, GoogleSignInAccount> {
        private C4613b() {
        }

        /* synthetic */ C4613b(C4619e eVar) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final /* synthetic */ Object mo31860a(C9056e eVar) {
            return ((C7474b) eVar).mo41185a();
        }
    }

    GoogleSignInClient(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C2880a.f1282g, googleSignInOptions, (C9236k) new C9216a());
    }

    /* renamed from: E */
    private final synchronized int m5917E() {
        if (f4446l == C4612a.f4447a) {
            Context r = mo32418r();
            GoogleApiAvailability n = GoogleApiAvailability.m6375n();
            int h = n.mo32347h(r, C4785c.f5063a);
            if (h == 0) {
                f4446l = C4612a.f4450d;
            } else if (n.mo32343b(r, h, (String) null) != null || DynamiteModule.m6736a(r, "com.google.android.gms.auth.api.fallback") == 0) {
                f4446l = C4612a.f4448b;
            } else {
                f4446l = C4612a.f4449c;
            }
        }
        return f4446l;
    }

    @NonNull
    /* renamed from: B */
    public Intent mo31857B() {
        Context r = mo32418r();
        int i = C4619e.f4483a[m5917E() - 1];
        if (i == 1) {
            return C7580j.m14924e(r, (GoogleSignInOptions) mo32417q());
        }
        if (i != 2) {
            return C7580j.m14926g(r, (GoogleSignInOptions) mo32417q());
        }
        return C7580j.m14921b(r, (GoogleSignInOptions) mo32417q());
    }

    /* renamed from: C */
    public Task<Void> mo31858C() {
        boolean z;
        C4733c h = mo32408h();
        Context r = mo32418r();
        if (m5917E() == C4612a.f4449c) {
            z = true;
        } else {
            z = false;
        }
        return C9709o.m20264b(C7580j.m14925f(h, r, z));
    }

    /* renamed from: D */
    public Task<Void> mo31859D() {
        boolean z;
        C4733c h = mo32408h();
        Context r = mo32418r();
        if (m5917E() == C4612a.f4449c) {
            z = true;
        } else {
            z = false;
        }
        return C9709o.m20264b(C7580j.m14922c(h, r, z));
    }
}
