package p209r3;

import java.util.concurrent.Executor;
import p149l3.C8661e;
import p169n3.C8901b;
import p219s3.C9492x;
import p230t3.C9609d;
import p241u3.C9880a;
import p330df.C11814a;

/* renamed from: r3.d */
/* compiled from: DefaultScheduler_Factory */
public final class C9373d implements C8901b<C9372c> {

    /* renamed from: a */
    private final C11814a<Executor> f13945a;

    /* renamed from: b */
    private final C11814a<C8661e> f13946b;

    /* renamed from: c */
    private final C11814a<C9492x> f13947c;

    /* renamed from: d */
    private final C11814a<C9609d> f13948d;

    /* renamed from: e */
    private final C11814a<C9880a> f13949e;

    public C9373d(C11814a<Executor> aVar, C11814a<C8661e> aVar2, C11814a<C9492x> aVar3, C11814a<C9609d> aVar4, C11814a<C9880a> aVar5) {
        this.f13945a = aVar;
        this.f13946b = aVar2;
        this.f13947c = aVar3;
        this.f13948d = aVar4;
        this.f13949e = aVar5;
    }

    /* renamed from: a */
    public static C9373d m19393a(C11814a<Executor> aVar, C11814a<C8661e> aVar2, C11814a<C9492x> aVar3, C11814a<C9609d> aVar4, C11814a<C9880a> aVar5) {
        return new C9373d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C9372c m19394c(Executor executor, C8661e eVar, C9492x xVar, C9609d dVar, C9880a aVar) {
        return new C9372c(executor, eVar, xVar, dVar, aVar);
    }

    /* renamed from: b */
    public C9372c get() {
        return m19394c(this.f13945a.get(), this.f13946b.get(), this.f13947c.get(), this.f13948d.get(), this.f13949e.get());
    }
}
