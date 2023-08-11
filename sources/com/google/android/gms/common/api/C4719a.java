package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C4719a.C4723d;
import com.google.android.gms.common.api.C4733c;
import java.util.Set;
import p180o4.C8974c;
import p190p4.C9058g;
import p200q4.C9222d;
import p200q4.C9230h;
import p231t4.C9665c;
import p231t4.C9673d;
import p231t4.C9692j;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.common.api.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4719a<O extends C4723d> {

    /* renamed from: a */
    private final C4720a<?, O> f4902a;

    /* renamed from: b */
    private final C4729g<?> f4903b;

    /* renamed from: c */
    private final String f4904c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C4720a<T extends C4728f, O> extends C4727e<T, O> {
        @NonNull
        @Deprecated
        /* renamed from: a */
        public T mo28416a(@NonNull Context context, @NonNull Looper looper, @NonNull C9673d dVar, @NonNull O o, @NonNull C4733c.C4734a aVar, @NonNull C4733c.C4735b bVar) {
            return mo32391b(context, looper, dVar, o, aVar, bVar);
        }

        @NonNull
        /* renamed from: b */
        public T mo32391b(@NonNull Context context, @NonNull Looper looper, @NonNull C9673d dVar, @NonNull O o, @NonNull C9222d dVar2, @NonNull C9230h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4721b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4722c<C extends C4721b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4723d {
        @NonNull

        /* renamed from: N */
        public static final C4726c f4905N = new C4726c((C9058g) null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C4724a extends C4723d {
            @NonNull
            /* renamed from: s */
            Account mo32392s();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface C4725b extends C4723d {
            @Nullable
            /* renamed from: k */
            GoogleSignInAccount mo32393k();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class C4726c implements C4723d {
            private C4726c() {
            }

            /* synthetic */ C4726c(C9058g gVar) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class C4727e<T extends C4721b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4728f extends C4721b {
        @NonNull
        /* renamed from: a */
        Set<Scope> mo32394a();

        /* renamed from: b */
        void mo32395b(@NonNull String str);

        /* renamed from: c */
        void mo32396c();

        /* renamed from: d */
        boolean mo32397d();

        @NonNull
        /* renamed from: e */
        String mo32398e();

        /* renamed from: g */
        boolean mo32399g();

        /* renamed from: h */
        void mo32400h(@NonNull C9665c.C9668c cVar);

        /* renamed from: i */
        void mo32401i(@NonNull C9665c.C9670e eVar);

        /* renamed from: j */
        boolean mo32402j();

        /* renamed from: k */
        int mo32403k();

        @NonNull
        /* renamed from: l */
        C8974c[] mo32404l();

        @Nullable
        /* renamed from: m */
        String mo32405m();

        /* renamed from: n */
        void mo32406n(@Nullable C9692j jVar, @Nullable Set<Scope> set);

        /* renamed from: o */
        boolean mo32407o();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4729g<C extends C4728f> extends C4722c<C> {
    }

    public <C extends C4728f> C4719a(@NonNull String str, @NonNull C4720a<C, O> aVar, @NonNull C4729g<C> gVar) {
        C9713p.m20276k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C9713p.m20276k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f4904c = str;
        this.f4902a = aVar;
        this.f4903b = gVar;
    }

    @NonNull
    /* renamed from: a */
    public final C4720a<?, O> mo32388a() {
        return this.f4902a;
    }

    @NonNull
    /* renamed from: b */
    public final C4722c<?> mo32389b() {
        return this.f4903b;
    }

    @NonNull
    /* renamed from: c */
    public final String mo32390c() {
        return this.f4904c;
    }
}
