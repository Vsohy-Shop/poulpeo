package p320cg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p308ag.C10886a;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;

/* renamed from: cg.g */
/* compiled from: ChannelFlow.kt */
public final class C11069g<T> extends C11067f<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11069g(C10962f fVar, C12079g gVar, int i, C10886a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i2 & 2) != 0 ? C12085h.f18916b : gVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C10886a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11063d<T> mo46022i(C12079g gVar, int i, C10886a aVar) {
        return new C11069g(this.f17175e, gVar, i, aVar);
    }

    /* renamed from: j */
    public C10962f<T> mo46159j() {
        return this.f17175e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Object mo46165q(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        Object collect = this.f17175e.collect(gVar, dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    public C11069g(C10962f<? extends T> fVar, C12079g gVar, int i, C10886a aVar) {
        super(fVar, gVar, i, aVar);
    }
}
