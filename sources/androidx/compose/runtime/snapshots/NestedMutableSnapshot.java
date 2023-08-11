package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1390#1:2192\n1390#1:2193\n*E\n"})
/* compiled from: Snapshot.kt */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    private final MutableSnapshot parent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedMutableSnapshot(int i, SnapshotIdSet snapshotIdSet, Function1<Object, C11921v> function1, Function1<Object, C11921v> function12, MutableSnapshot mutableSnapshot) {
        super(i, snapshotIdSet, function1, function12);
        C12775o.m28639i(snapshotIdSet, "invalid");
        C12775o.m28639i(mutableSnapshot, "parent");
        this.parent = mutableSnapshot;
        mutableSnapshot.nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (!this.deactivated) {
            this.deactivated = true;
            this.parent.nestedDeactivated$runtime_release(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r6 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent
            boolean r0 = r0.getApplied$runtime_release()
            if (r0 != 0) goto L_0x00be
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent
            boolean r0 = r0.getDisposed$runtime_release()
            if (r0 == 0) goto L_0x0012
            goto L_0x00be
        L_0x0012:
            java.util.Set r0 = r6.getModified$runtime_release()
            int r1 = r6.getId()
            if (r0 == 0) goto L_0x0027
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r6.parent
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r2.getInvalid$runtime_release()
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.optimisticMerges(r2, r6, r3)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.validateOpen(r6)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0069
            int r4 = r0.size()     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0039
            goto L_0x0069
        L_0x0039:
            androidx.compose.runtime.snapshots.MutableSnapshot r4 = r6.parent     // Catch:{ all -> 0x00bb }
            int r4 = r4.getId()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r5 = r6.parent     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.getInvalid$runtime_release()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotApplyResult r2 = r6.innerApplyLocked$runtime_release(r4, r2, r5)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r4 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch:{ all -> 0x00bb }
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r2, r4)     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)
            return r2
        L_0x0053:
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r6.parent     // Catch:{ all -> 0x00bb }
            java.util.Set r2 = r2.getModified$runtime_release()     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0065
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r4 = r6.parent     // Catch:{ all -> 0x00bb }
            r4.setModified(r2)     // Catch:{ all -> 0x00bb }
        L_0x0065:
            r2.addAll(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x006c
        L_0x0069:
            r6.closeAndReleasePinning$runtime_release()     // Catch:{ all -> 0x00bb }
        L_0x006c:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            int r0 = r0.getId()     // Catch:{ all -> 0x00bb }
            if (r0 >= r1) goto L_0x0079
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            r0.advance$runtime_release()     // Catch:{ all -> 0x00bb }
        L_0x0079:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.getInvalid$runtime_release()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.clear(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r6.getPreviousIds$runtime_release()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.andNot(r4)     // Catch:{ all -> 0x00bb }
            r0.setInvalid$runtime_release(r2)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            r0.recordPrevious$runtime_release(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            int r1 = r6.takeoverPinnedSnapshot$runtime_release()     // Catch:{ all -> 0x00bb }
            r0.recordPreviousPinnedSnapshot$runtime_release(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r6.getPreviousIds$runtime_release()     // Catch:{ all -> 0x00bb }
            r0.recordPreviousList$runtime_release(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent     // Catch:{ all -> 0x00bb }
            int[] r1 = r6.getPreviousPinnedSnapshots$runtime_release()     // Catch:{ all -> 0x00bb }
            r0.recordPreviousPinnedSnapshots$runtime_release(r1)     // Catch:{ all -> 0x00bb }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00bb }
            monitor-exit(r3)
            r0 = 1
            r6.setApplied$runtime_release(r0)
            r6.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00be:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            deactivate();
        }
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
