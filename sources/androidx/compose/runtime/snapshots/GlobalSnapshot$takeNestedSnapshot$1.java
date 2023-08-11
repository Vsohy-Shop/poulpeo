package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1312#1:2192\n1312#1:2193\n*E\n"})
/* compiled from: Snapshot.kt */
final class GlobalSnapshot$takeNestedSnapshot$1 extends C12777p implements Function1<SnapshotIdSet, ReadonlySnapshot> {
    final /* synthetic */ Function1<Object, C11921v> $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshot$takeNestedSnapshot$1(Function1<Object, C11921v> function1) {
        super(1);
        this.$readObserver = function1;
    }

    public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
        int access$getNextSnapshotId$p;
        C12775o.m28639i(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.getLock()) {
            access$getNextSnapshotId$p = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = access$getNextSnapshotId$p + 1;
        }
        return new ReadonlySnapshot(access$getNextSnapshotId$p, snapshotIdSet, this.$readObserver);
    }
}
