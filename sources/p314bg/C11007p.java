package p314bg;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p320cg.C11070h;
import p331dg.C11830h0;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n53#2:219\n55#2:223\n53#2:224\n55#2:228\n50#3:220\n55#3:222\n50#3:225\n55#3:227\n106#4:221\n106#4:226\n106#4:229\n1#5:230\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n47#1:219\n47#1:223\n74#1:224\n74#1:228\n47#1:220\n47#1:222\n74#1:225\n74#1:227\n47#1:221\n74#1:226\n82#1:229\n*E\n"})
/* renamed from: bg.p */
/* compiled from: Merge.kt */
final /* synthetic */ class C11007p {

    /* renamed from: a */
    private static final int f17016a = C11830h0.m25461b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", mo50610f = "Merge.kt", mo50611l = {217, 217}, mo50612m = "invokeSuspend")
    /* renamed from: bg.p$a */
    /* compiled from: Merge.kt */
    static final class C11008a extends C12746l implements C13089p<C10967g<? super R>, T, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17017h;

        /* renamed from: i */
        private /* synthetic */ Object f17018i;

        /* renamed from: j */
        /* synthetic */ Object f17019j;

        /* renamed from: k */
        final /* synthetic */ C13088o<T, C12074d<? super R>, Object> f17020k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11008a(C13088o<? super T, ? super C12074d<? super R>, ? extends Object> oVar, C12074d<? super C11008a> dVar) {
            super(3, dVar);
            this.f17020k = oVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: bg.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r5.f17017h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                p336ef.C11910n.m25701b(r6)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f17018i
                bg.g r1 = (p314bg.C10967g) r1
                p336ef.C11910n.m25701b(r6)
                goto L_0x0039
            L_0x0022:
                p336ef.C11910n.m25701b(r6)
                java.lang.Object r6 = r5.f17018i
                r1 = r6
                bg.g r1 = (p314bg.C10967g) r1
                java.lang.Object r6 = r5.f17019j
                of.o<T, hf.d<? super R>, java.lang.Object> r4 = r5.f17020k
                r5.f17018i = r1
                r5.f17017h = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.f17018i = r3
                r5.f17017h = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C11007p.C11008a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: l */
        public final Object invoke(C10967g<? super R> gVar, T t, C12074d<? super C11921v> dVar) {
            C11008a aVar = new C11008a(this.f17020k, dVar);
            aVar.f17018i = gVar;
            aVar.f17019j = t;
            return aVar.invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: a */
    public static final <T, R> C10962f<R> m23661a(C10962f<? extends T> fVar, C13088o<? super T, ? super C12074d<? super R>, ? extends Object> oVar) {
        return C10971h.m23616w(fVar, new C11008a(oVar, (C12074d<? super C11008a>) null));
    }

    /* renamed from: b */
    public static final <T, R> C10962f<R> m23662b(C10962f<? extends T> fVar, C13089p<? super C10967g<? super R>, ? super T, ? super C12074d<? super C11921v>, ? extends Object> pVar) {
        return new C11070h(pVar, fVar, (C12079g) null, 0, (C10886a) null, 28, (DefaultConstructorMarker) null);
    }
}
