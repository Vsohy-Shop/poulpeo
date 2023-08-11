package p364io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import p364io.grpc.C12155a;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p458xd.C13802i0;

/* renamed from: io.grpc.internal.i2 */
/* compiled from: StatsTraceContext */
public final class C12324i2 {

    /* renamed from: c */
    public static final C12324i2 f19550c = new C12324i2(new C13802i0[0]);

    /* renamed from: a */
    private final C13802i0[] f19551a;

    /* renamed from: b */
    private final AtomicBoolean f19552b = new AtomicBoolean(false);

    C12324i2(C13802i0[] i0VarArr) {
        this.f19551a = i0VarArr;
    }

    /* renamed from: h */
    public static C12324i2 m27052h(C12161c[] cVarArr, C12155a aVar, C12564o oVar) {
        C12324i2 i2Var = new C12324i2(cVarArr);
        for (C12161c m : cVarArr) {
            m.mo49640m(aVar, oVar);
        }
        return i2Var;
    }

    /* renamed from: a */
    public void mo49937a() {
        for (C13802i0 i0Var : this.f19551a) {
            ((C12161c) i0Var).mo49637j();
        }
    }

    /* renamed from: b */
    public void mo49938b(C12564o oVar) {
        for (C13802i0 i0Var : this.f19551a) {
            ((C12161c) i0Var).mo49638k(oVar);
        }
    }

    /* renamed from: c */
    public void mo49939c() {
        for (C13802i0 i0Var : this.f19551a) {
            ((C12161c) i0Var).mo49639l();
        }
    }

    /* renamed from: d */
    public void mo49940d(int i) {
        for (C13802i0 a : this.f19551a) {
            a.mo49956a(i);
        }
    }

    /* renamed from: e */
    public void mo49941e(int i, long j, long j2) {
        for (C13802i0 b : this.f19551a) {
            b.mo49957b(i, j, j2);
        }
    }

    /* renamed from: f */
    public void mo49942f(long j) {
        for (C13802i0 c : this.f19551a) {
            c.mo49958c(j);
        }
    }

    /* renamed from: g */
    public void mo49943g(long j) {
        for (C13802i0 d : this.f19551a) {
            d.mo49959d(j);
        }
    }

    /* renamed from: i */
    public void mo49944i(int i) {
        for (C13802i0 e : this.f19551a) {
            e.mo49960e(i);
        }
    }

    /* renamed from: j */
    public void mo49945j(int i, long j, long j2) {
        for (C13802i0 f : this.f19551a) {
            f.mo49961f(i, j, j2);
        }
    }

    /* renamed from: k */
    public void mo49946k(long j) {
        for (C13802i0 g : this.f19551a) {
            g.mo49962g(j);
        }
    }

    /* renamed from: l */
    public void mo49947l(long j) {
        for (C13802i0 h : this.f19551a) {
            h.mo49963h(j);
        }
    }

    /* renamed from: m */
    public void mo49948m(C12594t tVar) {
        if (this.f19552b.compareAndSet(false, true)) {
            for (C13802i0 i : this.f19551a) {
                i.mo50051i(tVar);
            }
        }
    }
}
