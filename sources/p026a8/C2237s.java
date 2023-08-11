package p026a8;

import p101g8.C7817i;
import p267w7.C10133d;
import p330df.C11814a;

/* renamed from: a8.s */
/* compiled from: InflaterModule_ProvidesBannerMessageFactory */
public final class C2237s implements C11814a {

    /* renamed from: a */
    private final C2235q f1039a;

    public C2237s(C2235q qVar) {
        this.f1039a = qVar;
    }

    /* renamed from: a */
    public static C2237s m1922a(C2235q qVar) {
        return new C2237s(qVar);
    }

    /* renamed from: c */
    public static C7817i m1923c(C2235q qVar) {
        return (C7817i) C10133d.m21326c(qVar.mo23590b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C7817i get() {
        return m1923c(this.f1039a);
    }
}
