package p219s3;

import java.util.concurrent.Executor;
import p169n3.C8901b;
import p230t3.C9609d;
import p241u3.C9880a;
import p330df.C11814a;

/* renamed from: s3.w */
/* compiled from: WorkInitializer_Factory */
public final class C9491w implements C8901b<C9490v> {

    /* renamed from: a */
    private final C11814a<Executor> f14144a;

    /* renamed from: b */
    private final C11814a<C9609d> f14145b;

    /* renamed from: c */
    private final C11814a<C9492x> f14146c;

    /* renamed from: d */
    private final C11814a<C9880a> f14147d;

    public C9491w(C11814a<Executor> aVar, C11814a<C9609d> aVar2, C11814a<C9492x> aVar3, C11814a<C9880a> aVar4) {
        this.f14144a = aVar;
        this.f14145b = aVar2;
        this.f14146c = aVar3;
        this.f14147d = aVar4;
    }

    /* renamed from: a */
    public static C9491w m19654a(C11814a<Executor> aVar, C11814a<C9609d> aVar2, C11814a<C9492x> aVar3, C11814a<C9880a> aVar4) {
        return new C9491w(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C9490v m19655c(Executor executor, C9609d dVar, C9492x xVar, C9880a aVar) {
        return new C9490v(executor, dVar, xVar, aVar);
    }

    /* renamed from: b */
    public C9490v get() {
        return m19655c(this.f14144a.get(), this.f14145b.get(), this.f14146c.get(), this.f14147d.get());
    }
}
