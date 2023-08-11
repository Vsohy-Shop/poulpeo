package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,90:1\n70#2:91\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:91\n*E\n"})
/* compiled from: Latch.kt */
final class Latch$await$2$2 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ C14002n<C11921v> $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Latch$await$2$2(Latch latch, C14002n<? super C11921v> nVar) {
        super(1);
        this.this$0 = latch;
        this.$co = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        Object access$getLock$p = this.this$0.lock;
        Latch latch = this.this$0;
        C14002n<C11921v> nVar = this.$co;
        synchronized (access$getLock$p) {
            latch.awaiters.remove(nVar);
            C11921v vVar = C11921v.f18618a;
        }
    }
}
