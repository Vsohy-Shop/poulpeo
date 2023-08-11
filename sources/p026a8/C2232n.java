package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.n */
/* compiled from: InflaterConfigModule_ProvidesModalLandscapeConfigFactory */
public final class C2232n implements C11814a {

    /* renamed from: a */
    private final C2224g f1029a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1030b;

    public C2232n(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1029a = gVar;
        this.f1030b = aVar;
    }

    /* renamed from: a */
    public static C2232n m1907a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2232n(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1908c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23577h(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1908c(this.f1029a, this.f1030b.get());
    }
}
