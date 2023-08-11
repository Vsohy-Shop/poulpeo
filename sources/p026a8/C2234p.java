package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.p */
/* compiled from: InflaterConfigModule_ProvidesPortraitImageLayoutConfigFactory */
public final class C2234p implements C11814a {

    /* renamed from: a */
    private final C2224g f1033a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1034b;

    public C2234p(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1033a = gVar;
        this.f1034b = aVar;
    }

    /* renamed from: a */
    public static C2234p m1913a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2234p(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1914c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23579j(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1914c(this.f1033a, this.f1034b.get());
    }
}
