package p289y7;

import android.view.LayoutInflater;
import p101g8.C7817i;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: y7.b */
/* compiled from: BannerBindingWrapper_Factory */
public final class C10702b implements C11814a {

    /* renamed from: a */
    private final C11814a<C10582l> f16284a;

    /* renamed from: b */
    private final C11814a<LayoutInflater> f16285b;

    /* renamed from: c */
    private final C11814a<C7817i> f16286c;

    public C10702b(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        this.f16284a = aVar;
        this.f16285b = aVar2;
        this.f16286c = aVar3;
    }

    /* renamed from: a */
    public static C10702b m22772a(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        return new C10702b(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C10701a m22773c(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        return new C10701a(lVar, layoutInflater, iVar);
    }

    /* renamed from: b */
    public C10701a get() {
        return m22773c(this.f16284a.get(), this.f16285b.get(), this.f16286c.get());
    }
}
