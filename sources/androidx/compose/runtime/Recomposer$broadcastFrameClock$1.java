package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p404of.C13074a;
import p466yf.C14000m1;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$broadcastFrameClock$1\n*L\n138#1:1409\n*E\n"})
/* compiled from: Recomposer.kt */
final class Recomposer$broadcastFrameClock$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public final void invoke() {
        C14002n access$deriveStateLocked;
        Object access$getStateLock$p = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (access$getStateLock$p) {
            access$deriveStateLocked = recomposer.deriveStateLocked();
            if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                throw C14000m1.m32454a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
            }
        }
        if (access$deriveStateLocked != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            access$deriveStateLocked.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }
}
