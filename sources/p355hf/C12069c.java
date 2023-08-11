package p355hf;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.Serializable;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: hf.c */
/* compiled from: CoroutineContextImpl.kt */
public final class C12069c implements C12079g, Serializable {

    /* renamed from: b */
    private final C12079g f18906b;

    /* renamed from: c */
    private final C12079g.C12082b f18907c;

    /* renamed from: hf.c$a */
    /* compiled from: CoroutineContextImpl.kt */
    private static final class C12070a implements Serializable {

        /* renamed from: c */
        public static final C12071a f18908c = new C12071a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final C12079g[] f18909b;

        /* renamed from: hf.c$a$a */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C12071a {
            private C12071a() {
            }

            public /* synthetic */ C12071a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C12070a(C12079g[] gVarArr) {
            C12775o.m28639i(gVarArr, "elements");
            this.f18909b = gVarArr;
        }

        private final Object readResolve() {
            C12079g[] gVarArr = this.f18909b;
            C12079g gVar = C12085h.f18916b;
            for (C12079g plus : gVarArr) {
                gVar = gVar.plus(plus);
            }
            return gVar;
        }
    }

    /* renamed from: hf.c$b */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C12072b extends C12777p implements C13088o<String, C12079g.C12082b, String> {

        /* renamed from: g */
        public static final C12072b f18910g = new C12072b();

        C12072b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C12079g.C12082b bVar) {
            boolean z;
            C12775o.m28639i(str, "acc");
            C12775o.m28639i(bVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: hf.c$c */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C12073c extends C12777p implements C13088o<C11921v, C12079g.C12082b, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12079g[] f18911g;

        /* renamed from: h */
        final /* synthetic */ C12760f0 f18912h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12073c(C12079g[] gVarArr, C12760f0 f0Var) {
            super(2);
            this.f18911g = gVarArr;
            this.f18912h = f0Var;
        }

        /* renamed from: a */
        public final void mo49508a(C11921v vVar, C12079g.C12082b bVar) {
            C12775o.m28639i(vVar, "<anonymous parameter 0>");
            C12775o.m28639i(bVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
            C12079g[] gVarArr = this.f18911g;
            C12760f0 f0Var = this.f18912h;
            int i = f0Var.f20416b;
            f0Var.f20416b = i + 1;
            gVarArr[i] = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo49508a((C11921v) obj, (C12079g.C12082b) obj2);
            return C11921v.f18618a;
        }
    }

    public C12069c(C12079g gVar, C12079g.C12082b bVar) {
        C12775o.m28639i(gVar, "left");
        C12775o.m28639i(bVar, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        this.f18906b = gVar;
        this.f18907c = bVar;
    }

    /* renamed from: b */
    private final boolean m26251b(C12079g.C12082b bVar) {
        return C12775o.m28634d(get(bVar.getKey()), bVar);
    }

    /* renamed from: c */
    private final boolean m26252c(C12069c cVar) {
        while (m26251b(cVar.f18907c)) {
            C12079g gVar = cVar.f18906b;
            if (gVar instanceof C12069c) {
                cVar = (C12069c) gVar;
            } else {
                C12775o.m28637g(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m26251b((C12079g.C12082b) gVar);
            }
        }
        return false;
    }

    /* renamed from: d */
    private final int m26253d() {
        int i = 2;
        C12069c cVar = this;
        while (true) {
            C12079g gVar = cVar.f18906b;
            if (gVar instanceof C12069c) {
                cVar = (C12069c) gVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        boolean z;
        int d = m26253d();
        C12079g[] gVarArr = new C12079g[d];
        C12760f0 f0Var = new C12760f0();
        fold(C11921v.f18618a, new C12073c(gVarArr, f0Var));
        if (f0Var.f20416b == d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C12070a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12069c) {
                C12069c cVar = (C12069c) obj;
                if (cVar.m26253d() != m26253d() || !cVar.m26252c(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        C12775o.m28639i(oVar, "operation");
        return oVar.invoke(this.f18906b.fold(r, oVar), this.f18907c);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        C12775o.m28639i(cVar, "key");
        C12069c cVar2 = this;
        while (true) {
            E e = cVar2.f18907c.get(cVar);
            if (e != null) {
                return e;
            }
            C12079g gVar = cVar2.f18906b;
            if (!(gVar instanceof C12069c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C12069c) gVar;
        }
    }

    public int hashCode() {
        return this.f18906b.hashCode() + this.f18907c.hashCode();
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        C12775o.m28639i(cVar, "key");
        if (this.f18907c.get(cVar) != null) {
            return this.f18906b;
        }
        C12079g minusKey = this.f18906b.minusKey(cVar);
        if (minusKey == this.f18906b) {
            return this;
        }
        if (minusKey == C12085h.f18916b) {
            return this.f18907c;
        }
        return new C12069c(minusKey, this.f18907c);
    }

    public C12079g plus(C12079g gVar) {
        return C12079g.C12080a.m26260a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", C12072b.f18910g)) + ']';
    }
}
