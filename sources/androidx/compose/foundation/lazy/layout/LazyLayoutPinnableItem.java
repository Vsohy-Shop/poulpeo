package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p002ui.layout.PinnableContainer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n76#2:162\n102#2,2:163\n76#2:165\n102#2,2:166\n76#2:168\n102#2,2:169\n76#2:171\n102#2,2:172\n480#3,4:174\n485#3:183\n122#4,5:178\n1#5:184\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n104#1:162\n104#1:163,2\n110#1:165\n110#1:166,2\n115#1:168\n115#1:169,2\n121#1:171\n121#1:172,2\n124#1:174,4\n124#1:183\n124#1:178,5\n*E\n"})
/* compiled from: LazyLayoutPinnableItem.kt */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private final MutableState _parentPinnableContainer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final MutableState index$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final Object key;
    private final MutableState parentHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final LazyLayoutPinnedItemList pinnedItemList;
    private final MutableState pinsCount$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        C12775o.m28639i(lazyLayoutPinnedItemList, "pinnedItemList");
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle$delegate.getValue();
    }

    private final int getPinsCount() {
        return ((Number) this.pinsCount$delegate.getValue()).intValue();
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle$delegate.setValue(pinnedHandle);
    }

    private final void setPinsCount(int i) {
        this.pinsCount$delegate.setValue(Integer.valueOf(i));
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    public int getIndex() {
        return ((Number) this.index$delegate.getValue()).intValue();
    }

    public Object getKey() {
        return this.key;
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i = 0; i < pinsCount; i++) {
            release();
        }
    }

    public PinnableContainer.PinnedHandle pin() {
        PinnableContainer.PinnedHandle pinnedHandle;
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            if (parentPinnableContainer != null) {
                pinnedHandle = parentPinnableContainer.pin();
            } else {
                pinnedHandle = null;
            }
            setParentHandle(pinnedHandle);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    public void release() {
        boolean z;
        if (getPinsCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setPinsCount(getPinsCount() - 1);
            if (getPinsCount() == 0) {
                this.pinnedItemList.release$foundation_release(this);
                PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                if (parentHandle != null) {
                    parentHandle.release();
                }
                setParentHandle((PinnableContainer.PinnedHandle) null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }

    public void setIndex(int i) {
        this.index$delegate.setValue(Integer.valueOf(i));
    }

    public final void setParentPinnableContainer(PinnableContainer pinnableContainer) {
        Snapshot makeCurrent;
        PinnableContainer.PinnedHandle pinnedHandle;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            if (pinnableContainer != get_parentPinnableContainer()) {
                set_parentPinnableContainer(pinnableContainer);
                if (getPinsCount() > 0) {
                    PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                    if (parentHandle != null) {
                        parentHandle.release();
                    }
                    if (pinnableContainer != null) {
                        pinnedHandle = pinnableContainer.pin();
                    } else {
                        pinnedHandle = null;
                    }
                    setParentHandle(pinnedHandle);
                }
            }
            C11921v vVar = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }
}
