package p308ag;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13964g0;
import p466yf.C13995l0;
import p466yf.C14002n;
import p466yf.C14004n0;

@SourceDebugExtension({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,151:1\n1#2:152\n314#3,11:153\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n48#1:153,11\n*E\n"})
/* renamed from: ag.n */
/* compiled from: Produce.kt */
public final class C10908n {

    @C12739f(mo50609c = "kotlinx.coroutines.channels.ProduceKt", mo50610f = "Produce.kt", mo50611l = {153}, mo50612m = "awaitClose")
    /* renamed from: ag.n$a */
    /* compiled from: Produce.kt */
    static final class C10909a extends C12737d {

        /* renamed from: h */
        Object f16826h;

        /* renamed from: i */
        Object f16827i;

        /* renamed from: j */
        /* synthetic */ Object f16828j;

        /* renamed from: k */
        int f16829k;

        C10909a(C12074d<? super C10909a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16828j = obj;
            this.f16829k |= Integer.MIN_VALUE;
            return C10908n.m23457a((C10912p<?>) null, (C13074a<C11921v>) null, this);
        }
    }

    /* renamed from: ag.n$b */
    /* compiled from: Produce.kt */
    static final class C10910b extends C12777p implements Function1<Throwable, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C14002n<C11921v> f16830g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10910b(C14002n<? super C11921v> nVar) {
            super(1);
            this.f16830g = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Throwable th) {
            C14002n<C11921v> nVar = this.f16830g;
            C11907m.C11908a aVar = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: of.a<ef.v>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m23457a(p308ag.C10912p<?> r4, p404of.C13074a<p336ef.C11921v> r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            boolean r0 = r6 instanceof p308ag.C10908n.C10909a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ag.n$a r0 = (p308ag.C10908n.C10909a) r0
            int r1 = r0.f16829k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16829k = r1
            goto L_0x0018
        L_0x0013:
            ag.n$a r0 = new ag.n$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16828j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16829k
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f16827i
            r5 = r4
            of.a r5 = (p404of.C13074a) r5
            java.lang.Object r4 = r0.f16826h
            ag.p r4 = (p308ag.C10912p) r4
            p336ef.C11910n.m25701b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            p336ef.C11910n.m25701b(r6)
            hf.g r6 = r0.getContext()
            yf.y1$b r2 = p466yf.C14054y1.f22970b0
            hf.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004d
            r6 = r3
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.f16826h = r4     // Catch:{ all -> 0x0032 }
            r0.f16827i = r5     // Catch:{ all -> 0x0032 }
            r0.f16829k = r3     // Catch:{ all -> 0x0032 }
            yf.o r6 = new yf.o     // Catch:{ all -> 0x0032 }
            hf.d r2 = p362if.C12147c.m26491b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.mo53786B()     // Catch:{ all -> 0x0032 }
            ag.n$b r2 = new ag.n$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.mo45888g(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.mo53797y()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            ef.v r4 = p336ef.C11921v.f18618a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p308ag.C10908n.m23457a(ag.p, of.a, hf.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final <E> C10914r<E> m23458b(C13995l0 l0Var, C12079g gVar, int i, C10886a aVar, C14004n0 n0Var, Function1<? super Throwable, C11921v> function1, C13088o<? super C10912p<? super E>, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C10911o oVar2 = new C10911o(C13964g0.m32356e(l0Var, gVar), C10898g.m23419b(i, aVar, (Function1) null, 4, (Object) null));
        if (function1 != null) {
            oVar2.mo53704O(function1);
        }
        oVar2.mo53665K0(n0Var, oVar2, oVar);
        return oVar2;
    }

    /* renamed from: c */
    public static /* synthetic */ C10914r m23459c(C13995l0 l0Var, C12079g gVar, int i, C10886a aVar, C14004n0 n0Var, Function1 function1, C13088o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        C12079g gVar2 = gVar;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            aVar = C10886a.SUSPEND;
        }
        C10886a aVar2 = aVar;
        if ((i2 & 8) != 0) {
            n0Var = C14004n0.DEFAULT;
        }
        C14004n0 n0Var2 = n0Var;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return m23458b(l0Var, gVar2, i3, aVar2, n0Var2, function1, oVar);
    }
}
