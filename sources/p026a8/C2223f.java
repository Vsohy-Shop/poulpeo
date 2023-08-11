package p026a8;

import p223s7.C9564q;
import p267w7.C10133d;
import p330df.C11814a;

/* renamed from: a8.f */
/* compiled from: HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory */
public final class C2223f implements C11814a {

    /* renamed from: a */
    private final C2222e f1012a;

    public C2223f(C2222e eVar) {
        this.f1012a = eVar;
    }

    /* renamed from: a */
    public static C2223f m1876a(C2222e eVar) {
        return new C2223f(eVar);
    }

    /* renamed from: c */
    public static C9564q m1877c(C2222e eVar) {
        return (C9564q) C10133d.m21326c(eVar.mo23569a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9564q get() {
        return m1877c(this.f1012a);
    }
}
