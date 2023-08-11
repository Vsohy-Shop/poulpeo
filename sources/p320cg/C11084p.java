package p320cg;

import kotlin.jvm.internal.C12771l;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;

/* renamed from: cg.p */
/* compiled from: SafeCollector.kt */
public final class C11084p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13089p<C10967g<Object>, Object, C12074d<? super C11921v>, Object> f17212a;

    /* renamed from: cg.p$a */
    /* compiled from: SafeCollector.kt */
    /* synthetic */ class C11085a extends C12771l implements C13089p<C10967g<? super Object>, Object, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        public static final C11085a f17213b = new C11085a();

        C11085a() {
            super(3, C10967g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b */
        public final Object invoke(C10967g<Object> gVar, Object obj, C12074d<? super C11921v> dVar) {
            return gVar.emit(obj, dVar);
        }
    }

    static {
        C11085a aVar = C11085a.f17213b;
        C12775o.m28637g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f17212a = (C13089p) C12772l0.m28614f(aVar, 3);
    }
}
