package p185p;

import p185p.C9016c;
import p259w.C10063c;

/* renamed from: p.e */
/* compiled from: RealMemoryCache.kt */
public final class C9024e implements C9016c {

    /* renamed from: a */
    private final C9031h f13141a;

    /* renamed from: b */
    private final C9032i f13142b;

    public C9024e(C9031h hVar, C9032i iVar) {
        this.f13141a = hVar;
        this.f13142b = iVar;
    }

    /* renamed from: a */
    public void mo43209a(int i) {
        this.f13141a.mo43203a(i);
        this.f13142b.mo43206a(i);
    }

    /* renamed from: b */
    public C9016c.C9021c mo43210b(C9016c.C9018b bVar) {
        C9016c.C9021c b = this.f13141a.mo43204b(bVar);
        if (b == null) {
            return this.f13142b.mo43207b(bVar);
        }
        return b;
    }

    /* renamed from: c */
    public void mo43211c(C9016c.C9018b bVar, C9016c.C9021c cVar) {
        this.f13141a.mo43205c(C9016c.C9018b.m18304b(bVar, (String) null, C10063c.m21127b(bVar.mo43214c()), 1, (Object) null), cVar.mo43224a(), C10063c.m21127b(cVar.mo43225b()));
    }
}
