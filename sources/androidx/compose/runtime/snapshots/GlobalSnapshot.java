package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1292#1:2192\n1346#1:2194\n1292#1:2193\n1346#1:2195\n*E\n"})
/* compiled from: Snapshot.kt */
public final class GlobalSnapshot extends MutableSnapshot {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSnapshot(int r5, androidx.compose.runtime.snapshots.SnapshotIdSet r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers     // Catch:{ all -> 0x003b }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers     // Catch:{ all -> 0x003b }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x003b }
            java.util.List r1 = kotlin.collections.C12686e0.m28207D0(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            if (r1 == 0) goto L_0x0035
            java.lang.Object r3 = kotlin.collections.C12686e0.m28240s0(r1)     // Catch:{ all -> 0x003b }
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch:{ all -> 0x003b }
            if (r3 != 0) goto L_0x0036
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r3 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch:{ all -> 0x003b }
            r3.<init>(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L_0x003b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
        return (MutableSnapshot) SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedMutableSnapshot$1(function1, function12));
    }

    public Snapshot takeNestedSnapshot(Function1<Object, C11921v> function1) {
        return SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedSnapshot$1(function1));
    }

    public Void nestedActivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public Void nestedDeactivated$runtime_release(Snapshot snapshot) {
        C12775o.m28639i(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
