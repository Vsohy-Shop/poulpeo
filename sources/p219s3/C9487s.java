package p219s3;

import android.content.Context;
import java.util.concurrent.Executor;
import p149l3.C8661e;
import p169n3.C8901b;
import p230t3.C9607c;
import p230t3.C9609d;
import p241u3.C9880a;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: s3.s */
/* compiled from: Uploader_Factory */
public final class C9487s implements C8901b<C9486r> {

    /* renamed from: a */
    private final C11814a<Context> f14129a;

    /* renamed from: b */
    private final C11814a<C8661e> f14130b;

    /* renamed from: c */
    private final C11814a<C9609d> f14131c;

    /* renamed from: d */
    private final C11814a<C9492x> f14132d;

    /* renamed from: e */
    private final C11814a<Executor> f14133e;

    /* renamed from: f */
    private final C11814a<C9880a> f14134f;

    /* renamed from: g */
    private final C11814a<C9927a> f14135g;

    /* renamed from: h */
    private final C11814a<C9927a> f14136h;

    /* renamed from: i */
    private final C11814a<C9607c> f14137i;

    public C9487s(C11814a<Context> aVar, C11814a<C8661e> aVar2, C11814a<C9609d> aVar3, C11814a<C9492x> aVar4, C11814a<Executor> aVar5, C11814a<C9880a> aVar6, C11814a<C9927a> aVar7, C11814a<C9927a> aVar8, C11814a<C9607c> aVar9) {
        this.f14129a = aVar;
        this.f14130b = aVar2;
        this.f14131c = aVar3;
        this.f14132d = aVar4;
        this.f14133e = aVar5;
        this.f14134f = aVar6;
        this.f14135g = aVar7;
        this.f14136h = aVar8;
        this.f14137i = aVar9;
    }

    /* renamed from: a */
    public static C9487s m19646a(C11814a<Context> aVar, C11814a<C8661e> aVar2, C11814a<C9609d> aVar3, C11814a<C9492x> aVar4, C11814a<Executor> aVar5, C11814a<C9880a> aVar6, C11814a<C9927a> aVar7, C11814a<C9927a> aVar8, C11814a<C9607c> aVar9) {
        return new C9487s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    /* renamed from: c */
    public static C9486r m19647c(Context context, C8661e eVar, C9609d dVar, C9492x xVar, Executor executor, C9880a aVar, C9927a aVar2, C9927a aVar3, C9607c cVar) {
        return new C9486r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    /* renamed from: b */
    public C9486r get() {
        return m19647c(this.f14129a.get(), this.f14130b.get(), this.f14131c.get(), this.f14132d.get(), this.f14133e.get(), this.f14134f.get(), this.f14135g.get(), this.f14136h.get(), this.f14137i.get());
    }
}
