package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.m */
/* compiled from: InflaterConfigModule_ProvidesLandscapeImageLayoutConfigFactory */
public final class C2231m implements C11814a {

    /* renamed from: a */
    private final C2224g f1027a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1028b;

    public C2231m(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1027a = gVar;
        this.f1028b = aVar;
    }

    /* renamed from: a */
    public static C2231m m1904a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2231m(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1905c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23576g(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1905c(this.f1027a, this.f1028b.get());
    }
}
