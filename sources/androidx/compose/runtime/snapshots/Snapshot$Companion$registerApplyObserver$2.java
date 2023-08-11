package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n*L\n503#1:2192\n503#1:2193\n*E\n"})
/* compiled from: Snapshot.kt */
final class Snapshot$Companion$registerApplyObserver$2 implements ObserverHandle {
    final /* synthetic */ C13088o<Set<? extends Object>, Snapshot, C11921v> $observer;

    Snapshot$Companion$registerApplyObserver$2(C13088o<? super Set<? extends Object>, ? super Snapshot, C11921v> oVar) {
        this.$observer = oVar;
    }

    public final void dispose() {
        C13088o<Set<? extends Object>, Snapshot, C11921v> oVar = this.$observer;
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.applyObservers.remove(oVar);
            C11921v vVar = C11921v.f18618a;
        }
    }
}
