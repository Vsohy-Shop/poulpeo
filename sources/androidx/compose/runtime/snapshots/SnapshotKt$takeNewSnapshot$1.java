package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1784#1:2192\n1784#1:2193\n*E\n"})
/* compiled from: Snapshot.kt */
final class SnapshotKt$takeNewSnapshot$1 extends C12777p implements Function1<SnapshotIdSet, T> {
    final /* synthetic */ Function1<SnapshotIdSet, T> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotKt$takeNewSnapshot$1(Function1<? super SnapshotIdSet, ? extends T> function1) {
        super(1);
        this.$block = function1;
    }

    public final T invoke(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "invalid");
        T t = (Snapshot) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(t.getId());
            C11921v vVar = C11921v.f18618a;
        }
        return t;
    }
}
