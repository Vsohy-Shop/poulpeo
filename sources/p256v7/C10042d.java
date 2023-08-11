package p256v7;

import android.app.Application;
import java.util.Map;
import p223s7.C9564q;
import p278x7.C10561a;
import p278x7.C10563c;
import p278x7.C10569e;
import p278x7.C10573g;
import p278x7.C10582l;
import p278x7.C10585n;
import p330df.C11814a;

/* renamed from: v7.d */
/* compiled from: FirebaseInAppMessagingDisplay_Factory */
public final class C10042d implements C11814a {

    /* renamed from: a */
    private final C11814a<C9564q> f15137a;

    /* renamed from: b */
    private final C11814a<Map<String, C11814a<C10582l>>> f15138b;

    /* renamed from: c */
    private final C11814a<C10569e> f15139c;

    /* renamed from: d */
    private final C11814a<C10585n> f15140d;

    /* renamed from: e */
    private final C11814a<C10585n> f15141e;

    /* renamed from: f */
    private final C11814a<C10573g> f15142f;

    /* renamed from: g */
    private final C11814a<Application> f15143g;

    /* renamed from: h */
    private final C11814a<C10561a> f15144h;

    /* renamed from: i */
    private final C11814a<C10563c> f15145i;

    public C10042d(C11814a<C9564q> aVar, C11814a<Map<String, C11814a<C10582l>>> aVar2, C11814a<C10569e> aVar3, C11814a<C10585n> aVar4, C11814a<C10585n> aVar5, C11814a<C10573g> aVar6, C11814a<Application> aVar7, C11814a<C10561a> aVar8, C11814a<C10563c> aVar9) {
        this.f15137a = aVar;
        this.f15138b = aVar2;
        this.f15139c = aVar3;
        this.f15140d = aVar4;
        this.f15141e = aVar5;
        this.f15142f = aVar6;
        this.f15143g = aVar7;
        this.f15144h = aVar8;
        this.f15145i = aVar9;
    }

    /* renamed from: a */
    public static C10042d m21086a(C11814a<C9564q> aVar, C11814a<Map<String, C11814a<C10582l>>> aVar2, C11814a<C10569e> aVar3, C11814a<C10585n> aVar4, C11814a<C10585n> aVar5, C11814a<C10573g> aVar6, C11814a<Application> aVar7, C11814a<C10561a> aVar8, C11814a<C10563c> aVar9) {
        return new C10042d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static C10031b m21087c(C9564q qVar, Map<String, C11814a<C10582l>> map, C10569e eVar, C10585n nVar, C10585n nVar2, C10573g gVar, Application application, C10561a aVar, C10563c cVar) {
        return new C10031b(qVar, map, eVar, nVar, nVar2, gVar, application, aVar, cVar);
    }

    /* renamed from: b */
    public C10031b get() {
        return m21087c(this.f15137a.get(), this.f15138b.get(), this.f15139c.get(), this.f15140d.get(), this.f15141e.get(), this.f15142f.get(), this.f15143g.get(), this.f15144h.get(), this.f15145i.get());
    }
}
