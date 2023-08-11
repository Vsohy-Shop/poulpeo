package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p404of.C13088o;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,1408:1\n70#2:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2$unregisterApplyObserver$1\n*L\n880#1:1409\n*E\n"})
/* compiled from: Recomposer.kt */
final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends C12777p implements C13088o<Set<? extends Object>, Snapshot, C11921v> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) (Set) obj, (Snapshot) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        C14002n nVar;
        C12775o.m28639i(set, "changed");
        C12775o.m28639i(snapshot, "<anonymous parameter 1>");
        Object access$getStateLock$p = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (access$getStateLock$p) {
            if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.snapshotInvalidations.addAll(set);
                nVar = recomposer.deriveStateLocked();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            C11907m.C11908a aVar = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }
}
