package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5692ca<T> implements C5811ja<T> {

    /* renamed from: a */
    private final C6052y9 f6829a;

    /* renamed from: b */
    private final C6037xa<?, ?> f6830b;

    /* renamed from: c */
    private final boolean f6831c;

    /* renamed from: d */
    private final C5809j8<?> f6832d;

    private C5692ca(C6037xa<?, ?> xaVar, C5809j8<?> j8Var, C6052y9 y9Var) {
        this.f6830b = xaVar;
        this.f6831c = j8Var.mo34125c(y9Var);
        this.f6832d = j8Var;
        this.f6829a = y9Var;
    }

    /* renamed from: j */
    static <T> C5692ca<T> m8911j(C6037xa<?, ?> xaVar, C5809j8<?> j8Var, C6052y9 y9Var) {
        return new C5692ca<>(xaVar, j8Var, y9Var);
    }

    /* renamed from: a */
    public final int mo33705a(T t) {
        int hashCode = this.f6830b.mo34605c(t).hashCode();
        if (!this.f6831c) {
            return hashCode;
        }
        this.f6832d.mo34123a(t);
        throw null;
    }

    /* renamed from: b */
    public final int mo33706b(T t) {
        C6037xa<?, ?> xaVar = this.f6830b;
        int b = xaVar.mo34604b(xaVar.mo34605c(t));
        if (!this.f6831c) {
            return b;
        }
        this.f6832d.mo34123a(t);
        throw null;
    }

    /* renamed from: c */
    public final void mo33707c(T t, T t2) {
        C5845la.m9596f(this.f6830b, t, t2);
        if (this.f6831c) {
            C5845la.m9595e(this.f6832d, t, t2);
        }
    }

    /* renamed from: d */
    public final void mo33708d(T t) {
        this.f6830b.mo34609g(t);
        this.f6832d.mo34124b(t);
    }

    /* renamed from: e */
    public final T mo33709e() {
        return this.f6829a.mo34554f().mo34351A();
    }

    /* renamed from: f */
    public final boolean mo33710f(T t) {
        this.f6832d.mo34123a(t);
        throw null;
    }

    /* renamed from: g */
    public final void mo33711g(T t, byte[] bArr, int i, int i2, C5808j7 j7Var) {
        C6003v8 v8Var = (C6003v8) t;
        if (v8Var.zzc == C6053ya.m10311c()) {
            v8Var.zzc = C6053ya.m10313e();
        }
        C5971t8 t8Var = (C5971t8) t;
        throw null;
    }

    /* renamed from: h */
    public final boolean mo33712h(T t, T t2) {
        if (!this.f6830b.mo34605c(t).equals(this.f6830b.mo34605c(t2))) {
            return false;
        }
        if (!this.f6831c) {
            return true;
        }
        this.f6832d.mo34123a(t);
        this.f6832d.mo34123a(t2);
        throw null;
    }

    /* renamed from: i */
    public final void mo33713i(T t, C5724e8 e8Var) {
        this.f6832d.mo34123a(t);
        throw null;
    }
}
