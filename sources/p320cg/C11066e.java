package p320cg;

import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10967g;
import p331dg.C11836k0;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
/* renamed from: cg.e */
/* compiled from: ChannelFlow.kt */
public final class C11066e {
    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final <T, V> Object m23883b(C12079g gVar, V v, Object obj, C13088o<? super V, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        Object c = C11836k0.m25499c(gVar, obj);
        try {
            Object invoke = ((C13088o) C12772l0.m28614f(oVar, 2)).invoke(v, new C11089s(dVar, gVar));
            C11836k0.m25497a(gVar, c);
            if (invoke == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
            return invoke;
        } catch (Throwable th) {
            C11836k0.m25497a(gVar, c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m23884c(C12079g gVar, Object obj, Object obj2, C13088o oVar, C12074d dVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C11836k0.m25498b(gVar);
        }
        return m23883b(gVar, obj, obj2, oVar, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final <T> C10967g<T> m23885d(C10967g<? super T> gVar, C12079g gVar2) {
        boolean z;
        if (gVar instanceof C11088r) {
            z = true;
        } else {
            z = gVar instanceof C11080m;
        }
        if (z) {
            return gVar;
        }
        return new C11091u(gVar, gVar2);
    }
}
