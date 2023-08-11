package p026a8;

import android.view.LayoutInflater;
import p267w7.C10133d;
import p330df.C11814a;

/* renamed from: a8.t */
/* compiled from: InflaterModule_ProvidesInflaterserviceFactory */
public final class C2238t implements C11814a {

    /* renamed from: a */
    private final C2235q f1040a;

    public C2238t(C2235q qVar) {
        this.f1040a = qVar;
    }

    /* renamed from: a */
    public static C2238t m1925a(C2235q qVar) {
        return new C2238t(qVar);
    }

    /* renamed from: c */
    public static LayoutInflater m1926c(C2235q qVar) {
        return (LayoutInflater) C10133d.m21326c(qVar.mo23591c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public LayoutInflater get() {
        return m1926c(this.f1040a);
    }
}
