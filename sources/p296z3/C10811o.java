package p296z3;

import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;
import p286y4.C10671e;
import p296z3.C10811o;

/* renamed from: z3.o */
public class C10811o<T extends C10811o> {

    /* renamed from: a */
    private final C10812p f16555a;

    /* renamed from: b */
    protected final C10808l f16556b;

    /* renamed from: c */
    private final List<C10809m> f16557c = new ArrayList();

    protected C10811o(C10812p pVar, C10671e eVar) {
        C9713p.m20275j(pVar);
        this.f16555a = pVar;
        C10808l lVar = new C10808l(this, eVar);
        lVar.mo45751m();
        this.f16556b = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45731a(C10808l lVar) {
        throw null;
    }

    /* renamed from: b */
    public C10808l mo45732b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10812p mo45754c() {
        return this.f16555a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo45755d(C10808l lVar) {
        for (C10809m a : this.f16557c) {
            a.mo45753a(this, lVar);
        }
    }
}
