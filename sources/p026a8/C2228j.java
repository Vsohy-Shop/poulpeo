package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.j */
/* compiled from: InflaterConfigModule_ProvidesCardLandscapeConfigFactory */
public final class C2228j implements C11814a {

    /* renamed from: a */
    private final C2224g f1021a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1022b;

    public C2228j(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1021a = gVar;
        this.f1022b = aVar;
    }

    /* renamed from: a */
    public static C2228j m1895a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2228j(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1896c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23573d(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1896c(this.f1021a, this.f1022b.get());
    }
}
