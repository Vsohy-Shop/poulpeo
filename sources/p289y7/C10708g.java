package p289y7;

import android.view.LayoutInflater;
import p101g8.C7817i;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: y7.g */
/* compiled from: ImageBindingWrapper_Factory */
public final class C10708g implements C11814a {

    /* renamed from: a */
    private final C11814a<C10582l> f16309a;

    /* renamed from: b */
    private final C11814a<LayoutInflater> f16310b;

    /* renamed from: c */
    private final C11814a<C7817i> f16311c;

    public C10708g(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        this.f16309a = aVar;
        this.f16310b = aVar2;
        this.f16311c = aVar3;
    }

    /* renamed from: a */
    public static C10708g m22805a(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        return new C10708g(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C10707f m22806c(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        return new C10707f(lVar, layoutInflater, iVar);
    }

    /* renamed from: b */
    public C10707f get() {
        return m22806c(this.f16309a.get(), this.f16310b.get(), this.f16311c.get());
    }
}
