package p139k3;

import p169n3.C8901b;
import p209r3.C9374e;
import p219s3.C9486r;
import p219s3.C9490v;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: k3.v */
/* compiled from: TransportRuntime_Factory */
public final class C8558v implements C8901b<C8555t> {

    /* renamed from: a */
    private final C11814a<C9927a> f12219a;

    /* renamed from: b */
    private final C11814a<C9927a> f12220b;

    /* renamed from: c */
    private final C11814a<C9374e> f12221c;

    /* renamed from: d */
    private final C11814a<C9486r> f12222d;

    /* renamed from: e */
    private final C11814a<C9490v> f12223e;

    public C8558v(C11814a<C9927a> aVar, C11814a<C9927a> aVar2, C11814a<C9374e> aVar3, C11814a<C9486r> aVar4, C11814a<C9490v> aVar5) {
        this.f12219a = aVar;
        this.f12220b = aVar2;
        this.f12221c = aVar3;
        this.f12222d = aVar4;
        this.f12223e = aVar5;
    }

    /* renamed from: a */
    public static C8558v m17193a(C11814a<C9927a> aVar, C11814a<C9927a> aVar2, C11814a<C9374e> aVar3, C11814a<C9486r> aVar4, C11814a<C9490v> aVar5) {
        return new C8558v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C8555t m17194c(C9927a aVar, C9927a aVar2, C9374e eVar, C9486r rVar, C9490v vVar) {
        return new C8555t(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public C8555t get() {
        return m17194c(this.f12219a.get(), this.f12220b.get(), this.f12221c.get(), this.f12222d.get(), this.f12223e.get());
    }
}
