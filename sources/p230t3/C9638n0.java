package p230t3;

import p159m3.C8821a;
import p169n3.C8900a;
import p169n3.C8901b;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: t3.n0 */
/* compiled from: SQLiteEventStore_Factory */
public final class C9638n0 implements C8901b<C9632m0> {

    /* renamed from: a */
    private final C11814a<C9927a> f14337a;

    /* renamed from: b */
    private final C11814a<C9927a> f14338b;

    /* renamed from: c */
    private final C11814a<C9611e> f14339c;

    /* renamed from: d */
    private final C11814a<C9650t0> f14340d;

    /* renamed from: e */
    private final C11814a<String> f14341e;

    public C9638n0(C11814a<C9927a> aVar, C11814a<C9927a> aVar2, C11814a<C9611e> aVar3, C11814a<C9650t0> aVar4, C11814a<String> aVar5) {
        this.f14337a = aVar;
        this.f14338b = aVar2;
        this.f14339c = aVar3;
        this.f14340d = aVar4;
        this.f14341e = aVar5;
    }

    /* renamed from: a */
    public static C9638n0 m20073a(C11814a<C9927a> aVar, C11814a<C9927a> aVar2, C11814a<C9611e> aVar3, C11814a<C9650t0> aVar4, C11814a<String> aVar5) {
        return new C9638n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C9632m0 m20074c(C9927a aVar, C9927a aVar2, Object obj, Object obj2, C8821a<String> aVar3) {
        return new C9632m0(aVar, aVar2, (C9611e) obj, (C9650t0) obj2, aVar3);
    }

    /* renamed from: b */
    public C9632m0 get() {
        return m20074c(this.f14337a.get(), this.f14338b.get(), this.f14339c.get(), this.f14340d.get(), C8900a.m18029a(this.f14341e));
    }
}
