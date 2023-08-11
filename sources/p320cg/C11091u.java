package p320cg;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10967g;
import p331dg.C11836k0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

/* renamed from: cg.u */
/* compiled from: ChannelFlow.kt */
final class C11091u<T> implements C10967g<T> {

    /* renamed from: b */
    private final C12079g f17218b;

    /* renamed from: c */
    private final Object f17219c;

    /* renamed from: d */
    private final C13088o<T, C12074d<? super C11921v>, Object> f17220d;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo50610f = "ChannelFlow.kt", mo50611l = {212}, mo50612m = "invokeSuspend")
    /* renamed from: cg.u$a */
    /* compiled from: ChannelFlow.kt */
    static final class C11092a extends C12746l implements C13088o<T, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17221h;

        /* renamed from: i */
        /* synthetic */ Object f17222i;

        /* renamed from: j */
        final /* synthetic */ C10967g<T> f17223j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11092a(C10967g<? super T> gVar, C12074d<? super C11092a> dVar) {
            super(2, dVar);
            this.f17223j = gVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C11092a aVar = new C11092a(this.f17223j, dVar);
            aVar.f17222i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17221h;
            if (i == 0) {
                C11910n.m25701b(obj);
                Object obj2 = this.f17222i;
                C10967g<T> gVar = this.f17223j;
                this.f17221h = 1;
                if (gVar.emit(obj2, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        /* renamed from: l */
        public final Object invoke(T t, C12074d<? super C11921v> dVar) {
            return ((C11092a) create(t, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    public C11091u(C10967g<? super T> gVar, C12079g gVar2) {
        this.f17218b = gVar2;
        this.f17219c = C11836k0.m25498b(gVar2);
        this.f17220d = new C11092a(gVar, (C12074d<? super C11092a>) null);
    }

    public Object emit(T t, C12074d<? super C11921v> dVar) {
        Object b = C11066e.m23883b(this.f17218b, t, this.f17219c, this.f17220d, dVar);
        if (b == C12150d.m26492c()) {
            return b;
        }
        return C11921v.f18618a;
    }
}
