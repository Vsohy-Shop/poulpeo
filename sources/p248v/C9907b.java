package p248v;

import p205r.C9336e;
import p205r.C9342h;
import p205r.C9352o;
import p248v.C9909c;

/* renamed from: v.b */
/* compiled from: NoneTransition.kt */
public final class C9907b implements C9909c {

    /* renamed from: a */
    private final C9912d f14833a;

    /* renamed from: b */
    private final C9342h f14834b;

    /* renamed from: v.b$a */
    /* compiled from: NoneTransition.kt */
    public static final class C9908a implements C9909c.C9910a {
        /* renamed from: a */
        public C9909c mo44435a(C9912d dVar, C9342h hVar) {
            return new C9907b(dVar, hVar);
        }

        public boolean equals(Object obj) {
            return obj instanceof C9908a;
        }

        public int hashCode() {
            return C9908a.class.hashCode();
        }
    }

    public C9907b(C9912d dVar, C9342h hVar) {
        this.f14833a = dVar;
        this.f14834b = hVar;
    }

    /* renamed from: a */
    public void mo44432a() {
        C9342h hVar = this.f14834b;
        if (hVar instanceof C9352o) {
            this.f14833a.mo30071b(((C9352o) hVar).mo43683a());
        } else if (hVar instanceof C9336e) {
            this.f14833a.mo30072c(hVar.mo43683a());
        }
    }
}
