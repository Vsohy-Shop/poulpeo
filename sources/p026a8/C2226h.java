package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.h */
/* compiled from: InflaterConfigModule_ProvidesBannerLandscapeLayoutConfigFactory */
public final class C2226h implements C11814a {

    /* renamed from: a */
    private final C2224g f1017a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1018b;

    public C2226h(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1017a = gVar;
        this.f1018b = aVar;
    }

    /* renamed from: a */
    public static C2226h m1889a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2226h(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1890c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23571b(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1890c(this.f1017a, this.f1018b.get());
    }
}
