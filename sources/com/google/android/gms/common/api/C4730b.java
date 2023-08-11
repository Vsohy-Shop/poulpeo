package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4723d;
import com.google.android.gms.common.api.internal.C4742b;
import com.google.android.gms.common.api.internal.C4744c;
import com.google.android.gms.common.api.internal.C4746d;
import com.google.android.gms.common.api.internal.C4749e;
import com.google.android.gms.common.api.internal.C4753g;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.common.api.internal.C4767m;
import com.google.android.gms.common.api.internal.C4777t;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p190p4.C9056e;
import p200q4.C9216a;
import p200q4.C9218b;
import p200q4.C9225e0;
import p200q4.C9228g;
import p200q4.C9236k;
import p200q4.C9244q;
import p231t4.C9665c;
import p231t4.C9673d;
import p231t4.C9713p;
import p276x5.C10406g;
import p286y4.C10680n;

/* renamed from: com.google.android.gms.common.api.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4730b<O extends C4719a.C4723d> {

    /* renamed from: a */
    private final Context f4906a;
    @Nullable

    /* renamed from: b */
    private final String f4907b;

    /* renamed from: c */
    private final C4719a<O> f4908c;

    /* renamed from: d */
    private final O f4909d;

    /* renamed from: e */
    private final C9218b<O> f4910e;

    /* renamed from: f */
    private final Looper f4911f;

    /* renamed from: g */
    private final int f4912g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final C4733c f4913h;

    /* renamed from: i */
    private final C9236k f4914i;
    @NonNull

    /* renamed from: j */
    protected final C4744c f4915j;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4731a {
        @NonNull

        /* renamed from: c */
        public static final C4731a f4916c = new C4732a().mo32425a();
        @NonNull

        /* renamed from: a */
        public final C9236k f4917a;
        @NonNull

        /* renamed from: b */
        public final Looper f4918b;

        /* renamed from: com.google.android.gms.common.api.b$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static class C4732a {

            /* renamed from: a */
            private C9236k f4919a;

            /* renamed from: b */
            private Looper f4920b;

            @NonNull
            /* renamed from: a */
            public C4731a mo32425a() {
                if (this.f4919a == null) {
                    this.f4919a = new C9216a();
                }
                if (this.f4920b == null) {
                    this.f4920b = Looper.getMainLooper();
                }
                return new C4731a(this.f4919a, this.f4920b);
            }

            @NonNull
            /* renamed from: b */
            public C4732a mo32426b(@NonNull C9236k kVar) {
                C9713p.m20276k(kVar, "StatusExceptionMapper must not be null.");
                this.f4919a = kVar;
                return this;
            }
        }

        private C4731a(C9236k kVar, Account account, Looper looper) {
            this.f4917a = kVar;
            this.f4918b = looper;
        }
    }

    private C4730b(@NonNull Context context, @Nullable Activity activity, C4719a<O> aVar, O o, C4731a aVar2) {
        C9713p.m20276k(context, "Null context is not permitted.");
        C9713p.m20276k(aVar, "Api must not be null.");
        C9713p.m20276k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f4906a = context.getApplicationContext();
        String str = null;
        if (C10680n.m22707k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f4907b = str;
        this.f4908c = aVar;
        this.f4909d = o;
        this.f4911f = aVar2.f4918b;
        C9218b<O> a = C9218b.m18921a(aVar, o, str);
        this.f4910e = a;
        this.f4913h = new C9244q(this);
        C4744c y = C4744c.m6524y(this.f4906a);
        this.f4915j = y;
        this.f4912g = y.mo32489n();
        this.f4914i = aVar2.f4917a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C4767m.m6611u(activity, y, a);
        }
        y.mo32483c(this);
    }

    /* renamed from: A */
    private final <TResult, A extends C4719a.C4721b> Task<TResult> m6437A(int i, @NonNull C4756h<A, TResult> hVar) {
        C10406g gVar = new C10406g();
        this.f4915j.mo32479H(this, i, hVar, gVar, this.f4914i);
        return gVar.mo45096a();
    }

    /* renamed from: y */
    private final <A extends C4719a.C4721b, T extends C4742b<? extends C9056e, A>> T m6438y(int i, @NonNull T t) {
        t.mo32443n();
        this.f4915j.mo32478G(this, i, t);
        return t;
    }

    @NonNull
    /* renamed from: h */
    public C4733c mo32408h() {
        return this.f4913h;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: i */
    public C9673d.C9674a mo32409i() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount k;
        C9673d.C9674a aVar = new C9673d.C9674a();
        O o = this.f4909d;
        if (!(o instanceof C4719a.C4723d.C4725b) || (k = ((C4719a.C4723d.C4725b) o).mo32393k()) == null) {
            O o2 = this.f4909d;
            if (o2 instanceof C4719a.C4723d.C4724a) {
                account = ((C4719a.C4723d.C4724a) o2).mo32392s();
            } else {
                account = null;
            }
        } else {
            account = k.mo31855s();
        }
        aVar.mo44173d(account);
        O o3 = this.f4909d;
        if (o3 instanceof C4719a.C4723d.C4725b) {
            GoogleSignInAccount k2 = ((C4719a.C4723d.C4725b) o3).mo32393k();
            if (k2 == null) {
                set = Collections.emptySet();
            } else {
                set = k2.mo31849L();
            }
        } else {
            set = Collections.emptySet();
        }
        aVar.mo44172c(set);
        aVar.mo44174e(this.f4906a.getClass().getName());
        aVar.mo44171b(this.f4906a.getPackageName());
        return aVar;
    }

    @NonNull
    /* renamed from: j */
    public <TResult, A extends C4719a.C4721b> Task<TResult> mo32410j(@NonNull C4756h<A, TResult> hVar) {
        return m6437A(2, hVar);
    }

    @NonNull
    /* renamed from: k */
    public <TResult, A extends C4719a.C4721b> Task<TResult> mo32411k(@NonNull C4756h<A, TResult> hVar) {
        return m6437A(0, hVar);
    }

    @NonNull
    /* renamed from: l */
    public <A extends C4719a.C4721b> Task<Void> mo32412l(@NonNull C4753g<A, ?> gVar) {
        C9713p.m20275j(gVar);
        C9713p.m20276k(gVar.f4979a.mo32501b(), "Listener has already been released.");
        C9713p.m20276k(gVar.f4980b.mo32522a(), "Listener has already been released.");
        return this.f4915j.mo32476A(this, gVar.f4979a, gVar.f4980b, gVar.f4981c);
    }

    @NonNull
    /* renamed from: m */
    public Task<Boolean> mo32413m(@NonNull C4746d.C4747a<?> aVar, int i) {
        C9713p.m20276k(aVar, "Listener key cannot be null.");
        return this.f4915j.mo32477B(this, aVar, i);
    }

    @NonNull
    /* renamed from: n */
    public <A extends C4719a.C4721b, T extends C4742b<? extends C9056e, A>> T mo32414n(@NonNull T t) {
        m6438y(1, t);
        return t;
    }

    @NonNull
    /* renamed from: o */
    public <TResult, A extends C4719a.C4721b> Task<TResult> mo32415o(@NonNull C4756h<A, TResult> hVar) {
        return m6437A(1, hVar);
    }

    @NonNull
    /* renamed from: p */
    public final C9218b<O> mo32416p() {
        return this.f4910e;
    }

    @NonNull
    /* renamed from: q */
    public O mo32417q() {
        return this.f4909d;
    }

    @NonNull
    /* renamed from: r */
    public Context mo32418r() {
        return this.f4906a;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: s */
    public String mo32419s() {
        return this.f4907b;
    }

    @NonNull
    /* renamed from: t */
    public Looper mo32420t() {
        return this.f4911f;
    }

    @NonNull
    /* renamed from: u */
    public <L> C4746d<L> mo32421u(@NonNull L l, @NonNull String str) {
        return C4749e.m6546a(l, this.f4911f, str);
    }

    /* renamed from: v */
    public final int mo32422v() {
        return this.f4912g;
    }

    @WorkerThread
    /* renamed from: w */
    public final C4719a.C4728f mo32423w(Looper looper, C4777t<O> tVar) {
        Looper looper2 = looper;
        C4719a.C4728f a = ((C4719a.C4720a) C9713p.m20275j(this.f4908c.mo32388a())).mo28416a(this.f4906a, looper2, mo32409i().mo44170a(), this.f4909d, tVar, tVar);
        String s = mo32419s();
        if (s != null && (a instanceof C9665c)) {
            ((C9665c) a).mo44133Q(s);
        }
        if (s != null && (a instanceof C9228g)) {
            ((C9228g) a).mo43526r(s);
        }
        return a;
    }

    /* renamed from: x */
    public final C9225e0 mo32424x(Context context, Handler handler) {
        return new C9225e0(context, handler, mo32409i().mo44170a());
    }

    public C4730b(@NonNull Context context, @NonNull C4719a<O> aVar, @NonNull O o, @NonNull C4731a aVar2) {
        this(context, (Activity) null, aVar, o, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4730b(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.api.C4719a<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull p200q4.C9236k r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.b$a$a r0 = new com.google.android.gms.common.api.b$a$a
            r0.<init>()
            r0.mo32426b(r5)
            com.google.android.gms.common.api.b$a r5 = r0.mo32425a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.C4730b.C4731a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C4730b.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, q4.k):void");
    }
}
