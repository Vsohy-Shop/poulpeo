package p362if;

import kotlin.coroutines.jvm.internal.C12734a;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.coroutines.jvm.internal.C12744j;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;

/* renamed from: if.c */
/* compiled from: IntrinsicsJvm.kt */
class C12147c {

    /* renamed from: if.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C12148a extends C12744j {

        /* renamed from: h */
        private int f19027h;

        /* renamed from: i */
        final /* synthetic */ C13088o f19028i;

        /* renamed from: j */
        final /* synthetic */ Object f19029j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12148a(C12074d dVar, C13088o oVar, Object obj) {
            super(dVar);
            this.f19028i = oVar;
            this.f19029j = obj;
            C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f19027h;
            if (i == 0) {
                this.f19027h = 1;
                C11910n.m25701b(obj);
                C12775o.m28637g(this.f19028i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C13088o) C12772l0.m28614f(this.f19028i, 2)).invoke(this.f19029j, this);
            } else if (i == 1) {
                this.f19027h = 2;
                C11910n.m25701b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: if.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C12149b extends C12737d {

        /* renamed from: h */
        private int f19030h;

        /* renamed from: i */
        final /* synthetic */ C13088o f19031i;

        /* renamed from: j */
        final /* synthetic */ Object f19032j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12149b(C12074d dVar, C12079g gVar, C13088o oVar, Object obj) {
            super(dVar, gVar);
            this.f19031i = oVar;
            this.f19032j = obj;
            C12775o.m28637g(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f19030h;
            if (i == 0) {
                this.f19030h = 1;
                C11910n.m25701b(obj);
                C12775o.m28637g(this.f19031i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C13088o) C12772l0.m28614f(this.f19031i, 2)).invoke(this.f19032j, this);
            } else if (i == 1) {
                this.f19030h = 2;
                C11910n.m25701b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C12074d<C11921v> m26490a(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar) {
        C12775o.m28639i(oVar, "<this>");
        C12775o.m28639i(dVar, "completion");
        C12074d<? super T> a = C12741h.m28571a(dVar);
        if (oVar instanceof C12734a) {
            return ((C12734a) oVar).create(r, a);
        }
        C12079g context = a.getContext();
        if (context == C12085h.f18916b) {
            return new C12148a(a, oVar, r);
        }
        return new C12149b(a, context, oVar, r);
    }

    /* renamed from: b */
    public static <T> C12074d<T> m26491b(C12074d<? super T> dVar) {
        C12737d dVar2;
        C12074d<Object> intercepted;
        C12775o.m28639i(dVar, "<this>");
        if (dVar instanceof C12737d) {
            dVar2 = (C12737d) dVar;
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || (intercepted = dVar2.intercepted()) == null) {
            return dVar;
        }
        return intercepted;
    }
}
