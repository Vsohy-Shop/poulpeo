package p466yf;

import kotlin.coroutines.jvm.internal.C12738e;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;

/* renamed from: yf.g0 */
/* compiled from: CoroutineContext.kt */
public final class C13964g0 {

    /* renamed from: yf.g0$a */
    /* compiled from: CoroutineContext.kt */
    static final class C13965a extends C12777p implements C13088o<C12079g, C12079g.C12082b, C12079g> {

        /* renamed from: g */
        public static final C13965a f22890g = new C13965a();

        C13965a() {
            super(2);
        }

        /* renamed from: a */
        public final C12079g invoke(C12079g gVar, C12079g.C12082b bVar) {
            if (bVar instanceof C13954f0) {
                return gVar.plus(((C13954f0) bVar).mo53698Q());
            }
            return gVar.plus(bVar);
        }
    }

    /* renamed from: yf.g0$b */
    /* compiled from: CoroutineContext.kt */
    static final class C13966b extends C12777p implements C13088o<C12079g, C12079g.C12082b, C12079g> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<C12079g> f22891g;

        /* renamed from: h */
        final /* synthetic */ boolean f22892h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13966b(Ref$ObjectRef<C12079g> ref$ObjectRef, boolean z) {
            super(2);
            this.f22891g = ref$ObjectRef;
            this.f22892h = z;
        }

        /* renamed from: a */
        public final C12079g invoke(C12079g gVar, C12079g.C12082b bVar) {
            if (!(bVar instanceof C13954f0)) {
                return gVar.plus(bVar);
            }
            C12079g.C12082b bVar2 = ((C12079g) this.f22891g.f20403b).get(bVar.getKey());
            if (bVar2 == null) {
                C13954f0 f0Var = (C13954f0) bVar;
                if (this.f22892h) {
                    f0Var = f0Var.mo53698Q();
                }
                return gVar.plus(f0Var);
            }
            Ref$ObjectRef<C12079g> ref$ObjectRef = this.f22891g;
            ref$ObjectRef.f20403b = ((C12079g) ref$ObjectRef.f20403b).minusKey(bVar.getKey());
            return gVar.plus(((C13954f0) bVar).mo53699k0(bVar2));
        }
    }

    /* renamed from: yf.g0$c */
    /* compiled from: CoroutineContext.kt */
    static final class C13967c extends C12777p implements C13088o<Boolean, C12079g.C12082b, Boolean> {

        /* renamed from: g */
        public static final C13967c f22893g = new C13967c();

        C13967c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo53745a(boolean z, C12079g.C12082b bVar) {
            boolean z2;
            if (z || (bVar instanceof C13954f0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo53745a(((Boolean) obj).booleanValue(), (C12079g.C12082b) obj2);
        }
    }

    /* renamed from: a */
    private static final C12079g m32352a(C12079g gVar, C12079g gVar2, boolean z) {
        boolean c = m32354c(gVar);
        boolean c2 = m32354c(gVar2);
        if (!c && !c2) {
            return gVar.plus(gVar2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = gVar2;
        C12085h hVar = C12085h.f18916b;
        C12079g gVar3 = (C12079g) gVar.fold(hVar, new C13966b(ref$ObjectRef, z));
        if (c2) {
            ref$ObjectRef.f20403b = ((C12079g) ref$ObjectRef.f20403b).fold(hVar, C13965a.f22890g);
        }
        return gVar3.plus((C12079g) ref$ObjectRef.f20403b);
    }

    /* renamed from: b */
    public static final String m32353b(C12079g gVar) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m32354c(C12079g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, C13967c.f22893g)).booleanValue();
    }

    /* renamed from: d */
    public static final C12079g m32355d(C12079g gVar, C12079g gVar2) {
        if (!m32354c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return m32352a(gVar, gVar2, false);
    }

    /* renamed from: e */
    public static final C12079g m32356e(C13995l0 l0Var, C12079g gVar) {
        C12079g a = m32352a(l0Var.getCoroutineContext(), gVar, true);
        if (a == C13933b1.m32210a() || a.get(C12075e.f18913W) != null) {
            return a;
        }
        return a.plus(C13933b1.m32210a());
    }

    /* renamed from: f */
    public static final C13935b3<?> m32357f(C12738e eVar) {
        while (!(eVar instanceof C14049x0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof C13935b3) {
                return (C13935b3) eVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C13935b3<?> m32358g(C12074d<?> dVar, C12079g gVar, Object obj) {
        boolean z;
        if (!(dVar instanceof C12738e)) {
            return null;
        }
        if (gVar.get(C13940c3.f22859b) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C13935b3<?> f = m32357f((C12738e) dVar);
        if (f != null) {
            f.mo53685M0(gVar, obj);
        }
        return f;
    }
}
