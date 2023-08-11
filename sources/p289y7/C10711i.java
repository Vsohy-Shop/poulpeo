package p289y7;

import android.view.LayoutInflater;
import p101g8.C7817i;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: y7.i */
/* compiled from: ModalBindingWrapper_Factory */
public final class C10711i implements C11814a {

    /* renamed from: a */
    private final C11814a<C10582l> f16323a;

    /* renamed from: b */
    private final C11814a<LayoutInflater> f16324b;

    /* renamed from: c */
    private final C11814a<C7817i> f16325c;

    public C10711i(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        this.f16323a = aVar;
        this.f16324b = aVar2;
        this.f16325c = aVar3;
    }

    /* renamed from: a */
    public static C10711i m22818a(C11814a<C10582l> aVar, C11814a<LayoutInflater> aVar2, C11814a<C7817i> aVar3) {
        return new C10711i(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C10709h m22819c(C10582l lVar, LayoutInflater layoutInflater, C7817i iVar) {
        return new C10709h(lVar, layoutInflater, iVar);
    }

    /* renamed from: b */
    public C10709h get() {
        return m22819c(this.f16323a.get(), this.f16324b.get(), this.f16325c.get());
    }
}
