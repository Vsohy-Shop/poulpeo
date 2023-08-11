package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n*L\n531#1:2192\n531#1:2193\n*E\n"})
/* compiled from: Snapshot.kt */
final class Snapshot$Companion$registerGlobalWriteObserver$2 implements ObserverHandle {
    final /* synthetic */ Function1<Object, C11921v> $observer;

    Snapshot$Companion$registerGlobalWriteObserver$2(Function1<Object, C11921v> function1) {
        this.$observer = function1;
    }

    public final void dispose() {
        Function1<Object, C11921v> function1 = this.$observer;
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.globalWriteObservers.remove(function1);
        }
        SnapshotKt.advanceGlobalSnapshot();
    }
}
