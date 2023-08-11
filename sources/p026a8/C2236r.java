package p026a8;

import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.r */
/* compiled from: InflaterModule_InAppMessageLayoutConfigFactory */
public final class C2236r implements C11814a {

    /* renamed from: a */
    private final C2235q f1038a;

    public C2236r(C2235q qVar) {
        this.f1038a = qVar;
    }

    /* renamed from: a */
    public static C2236r m1919a(C2235q qVar) {
        return new C2236r(qVar);
    }

    /* renamed from: c */
    public static C10582l m1920c(C2235q qVar) {
        return (C10582l) C10133d.m21326c(qVar.mo23589a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1920c(this.f1038a);
    }
}
