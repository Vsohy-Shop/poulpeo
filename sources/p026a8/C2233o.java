package p026a8;

import android.util.DisplayMetrics;
import p267w7.C10133d;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: a8.o */
/* compiled from: InflaterConfigModule_ProvidesModalPortraitConfigFactory */
public final class C2233o implements C11814a {

    /* renamed from: a */
    private final C2224g f1031a;

    /* renamed from: b */
    private final C11814a<DisplayMetrics> f1032b;

    public C2233o(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        this.f1031a = gVar;
        this.f1032b = aVar;
    }

    /* renamed from: a */
    public static C2233o m1910a(C2224g gVar, C11814a<DisplayMetrics> aVar) {
        return new C2233o(gVar, aVar);
    }

    /* renamed from: c */
    public static C10582l m1911c(C2224g gVar, DisplayMetrics displayMetrics) {
        return (C10582l) C10133d.m21326c(gVar.mo23578i(displayMetrics), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C10582l get() {
        return m1911c(this.f1031a, this.f1032b.get());
    }
}
