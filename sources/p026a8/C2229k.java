package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.k */
/* compiled from: InflaterConfigModule_ProvidesCardPortraitConfigFactory */
public final class C2229k implements C11814a {

    /* renamed from: a */
    private final C2224g f1023a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1024b;

    public C2229k(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1023a = gVar;
        this.f1024b = aVar;
    }

    /* renamed from: a */
    public static C2229k m1898a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2229k(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1899c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23574e(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1899c(this.f1023a, this.f1024b.get());
    }
}
