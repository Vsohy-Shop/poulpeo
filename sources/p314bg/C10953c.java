package p314bg;

import p308ag.C10886a;
import p308ag.C10912p;
import p320cg.C11063d;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: bg.c */
/* compiled from: Builders.kt */
class C10953c<T> extends C11063d<T> {

    /* renamed from: e */
    private final C13088o<C10912p<? super T>, C12074d<? super C11921v>, Object> f16901e;

    public C10953c(C13088o<? super C10912p<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12079g gVar, int i, C10886a aVar) {
        super(gVar, i, aVar);
        this.f16901e = oVar;
    }

    /* renamed from: n */
    static /* synthetic */ <T> Object m23579n(C10953c<T> cVar, C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
        Object invoke = cVar.f16901e.invoke(pVar, dVar);
        if (invoke == C12150d.m26492c()) {
            return invoke;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Object mo46021h(C10912p<? super T> pVar, C12074d<? super C11921v> dVar) {
        return m23579n(this, pVar, dVar);
    }

    public String toString() {
        return "block[" + this.f16901e + "] -> " + super.toString();
    }
}
