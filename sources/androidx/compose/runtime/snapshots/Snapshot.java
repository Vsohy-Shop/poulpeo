package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n1#4:2196\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n84#1:2192\n233#1:2194\n84#1:2193\n233#1:2195\n*E\n"})
/* compiled from: Snapshot.kt */
public abstract class Snapshot {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private boolean disposed;

    /* renamed from: id */
    private int f257id;
    private SnapshotIdSet invalid;
    /* access modifiers changed from: private */
    public int pinningTrackingHandle;

    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1#2:2192\n122#3,5:2193\n122#3,5:2198\n122#3,5:2203\n1686#4:2208\n1686#4:2210\n1686#4:2212\n70#5:2209\n70#5:2211\n70#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n424#1:2193,5\n461#1:2198,5\n483#1:2203,5\n499#1:2208\n526#1:2210\n564#1:2212\n499#1:2209\n526#1:2211\n564#1:2213\n*E\n"})
    /* compiled from: Snapshot.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, C13074a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, aVar);
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), (Function1) null, false, 6, (Object) null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(C13074a<? extends T> aVar) {
            C12775o.m28639i(aVar, "block");
            Snapshot removeCurrent = removeCurrent();
            T invoke = aVar.invoke();
            Snapshot.Companion.restoreCurrent(removeCurrent);
            return invoke;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12, C13074a<? extends T> aVar) {
            Snapshot snapshot;
            Snapshot makeCurrent;
            MutableSnapshot mutableSnapshot;
            C12775o.m28639i(aVar, "block");
            if (function1 == null && function12 == null) {
                return aVar.invoke();
            }
            Snapshot snapshot2 = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot2 == null || (snapshot2 instanceof MutableSnapshot)) {
                if (snapshot2 instanceof MutableSnapshot) {
                    mutableSnapshot = (MutableSnapshot) snapshot2;
                } else {
                    mutableSnapshot = null;
                }
                snapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, function1, function12, true, false);
            } else if (function1 == null) {
                return aVar.invoke();
            } else {
                snapshot = snapshot2.takeNestedSnapshot(function1);
            }
            try {
                makeCurrent = snapshot.makeCurrent();
                T invoke = aVar.invoke();
                snapshot.restoreCurrent(makeCurrent);
                snapshot.dispose();
                return invoke;
            } catch (Throwable th) {
                snapshot.dispose();
                throw th;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return C12686e0.m28205B0(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(C13088o<? super Set<? extends Object>, ? super Snapshot, C11921v> oVar) {
            C12775o.m28639i(oVar, "observer");
            Object unused = SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers.add(oVar);
            }
            return new Snapshot$Companion$registerApplyObserver$2(oVar);
        }

        public final ObserverHandle registerGlobalWriteObserver(Function1<Object, C11921v> function1) {
            C12775o.m28639i(function1, "observer");
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers.add(function1);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new Snapshot$Companion$registerGlobalWriteObserver$2(function1);
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            boolean z;
            synchronized (SnapshotKt.getLock()) {
                Set<StateObject> modified$runtime_release = ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getModified$runtime_release();
                z = false;
                if (modified$runtime_release != null && (!modified$runtime_release.isEmpty())) {
                    z = true;
                }
            }
            if (z) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(Function1<Object, C11921v> function1, Function1<Object, C11921v> function12) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            if (currentSnapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) currentSnapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(function1, function12)) != null) {
                return takeNestedMutableSnapshot;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        public final Snapshot takeSnapshot(Function1<Object, C11921v> function1) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function1);
        }

        public final <R> R withMutableSnapshot(C13074a<? extends R> aVar) {
            Snapshot makeCurrent;
            C12775o.m28639i(aVar, "block");
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, (Function1) null, (Function1) null, 3, (Object) null);
            try {
                makeCurrent = takeMutableSnapshot$default.makeCurrent();
                R invoke = aVar.invoke();
                C12773m.m28629b(1);
                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                C12773m.m28628a(1);
                takeMutableSnapshot$default.apply().check();
                C12773m.m28629b(1);
                takeMutableSnapshot$default.dispose();
                C12773m.m28628a(1);
                return invoke;
            } catch (Throwable th) {
                C12773m.m28629b(1);
                takeMutableSnapshot$default.dispose();
                C12773m.m28628a(1);
                throw th;
            }
        }

        public final <T> T withoutReadObservation(C13074a<? extends T> aVar) {
            Snapshot makeCurrent;
            C12775o.m28639i(aVar, "block");
            Snapshot createNonObservableSnapshot = createNonObservableSnapshot();
            try {
                makeCurrent = createNonObservableSnapshot.makeCurrent();
                T invoke = aVar.invoke();
                C12773m.m28629b(1);
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                C12773m.m28628a(1);
                C12773m.m28629b(1);
                createNonObservableSnapshot.dispose();
                C12773m.m28628a(1);
                return invoke;
            } catch (Throwable th) {
                C12773m.m28629b(1);
                createNonObservableSnapshot.dispose();
                C12773m.m28628a(1);
                throw th;
            }
        }
    }

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return snapshot.takeNestedSnapshot(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final <T> T enter(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        Snapshot makeCurrent = makeCurrent();
        try {
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            restoreCurrent(makeCurrent);
            C12773m.m28628a(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.f257id;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public abstract Set<StateObject> getModified$runtime_release();

    public abstract Function1<Object, C11921v> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public abstract Function1<Object, C11921v> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        if (this.pinningTrackingHandle >= 0) {
            return true;
        }
        return false;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    public abstract void nestedActivated$runtime_release(Snapshot snapshot);

    public abstract void nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    public abstract void recordModified$runtime_release(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int i) {
        this.f257id = i;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        C12775o.m28639i(snapshotIdSet, "<set-?>");
        this.invalid = snapshotIdSet;
    }

    public abstract Snapshot takeNestedSnapshot(Function1<Object, C11921v> function1);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    @ExperimentalComposeApi
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(Snapshot snapshot) {
        boolean z;
        if (SnapshotKt.threadSnapshot.get() == this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            restoreCurrent(snapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    private Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.f257id = i;
        this.pinningTrackingHandle = i != 0 ? SnapshotKt.trackPinning(i, getInvalid$runtime_release()) : -1;
    }
}
