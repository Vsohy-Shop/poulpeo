package p320cg;

import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p314bg.C10972h0;
import p314bg.C11029y;

@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n20#3:137\n20#3:142\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n126#1:133,4\n128#1:138,4\n126#1:137\n128#1:142\n*E\n"})
/* renamed from: cg.t */
/* compiled from: AbstractSharedFlow.kt */
final class C11090t extends C11029y<Integer> implements C10972h0<Integer> {
    public C11090t(int i) {
        super(1, Integer.MAX_VALUE, C10886a.DROP_OLDEST);
        mo46041e(Integer.valueOf(i));
    }

    /* renamed from: Y */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) mo46062L()).intValue());
        }
        return valueOf;
    }

    /* renamed from: Z */
    public final boolean mo46176Z(int i) {
        boolean e;
        synchronized (this) {
            e = mo46041e(Integer.valueOf(((Number) mo46062L()).intValue() + i));
        }
        return e;
    }
}
