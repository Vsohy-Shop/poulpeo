package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,110:1\n76#2:111\n102#2,2:112\n76#2:114\n102#2,2:115\n1#3:117\n480#4,4:118\n485#4:127\n480#4,4:128\n485#4:137\n122#5,5:122\n122#5,5:132\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:111\n34#1:112,2\n36#1:114\n36#1:115,2\n57#1:118,4\n57#1:127\n92#1:128,4\n92#1:137\n57#1:122,5\n92#1:132,5\n*E\n"})
/* compiled from: LazyListScrollPosition.kt */
public final class LazyListScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableState index$delegate;
    private Object lastKnownFirstItemKey;
    private final MutableState scrollOffset$delegate;

    public LazyListScrollPosition() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setValue(Integer.valueOf(i));
    }

    /* renamed from: update-AhXoVpI  reason: not valid java name */
    private final void m33419updateAhXoVpI(int i, int i2) {
        boolean z;
        if (((float) i) >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!DataIndex.m33394equalsimpl0(i, m33420getIndexjQJCoq8())) {
                m33422setIndexZjPyQlc(i);
            }
            if (i2 != getScrollOffset()) {
                setScrollOffset(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: getIndex-jQJCoq8  reason: not valid java name */
    public final int m33420getIndexjQJCoq8() {
        return ((DataIndex) this.index$delegate.getValue()).m33401unboximpl();
    }

    public final int getScrollOffset() {
        return ((Number) this.scrollOffset$delegate.getValue()).intValue();
    }

    /* renamed from: requestPosition-AhXoVpI  reason: not valid java name */
    public final void m33421requestPositionAhXoVpI(int i, int i2) {
        m33419updateAhXoVpI(i, i2);
        this.lastKnownFirstItemKey = null;
    }

    /* renamed from: setIndex-ZjPyQlc  reason: not valid java name */
    public final void m33422setIndexZjPyQlc(int i) {
        this.index$delegate.setValue(DataIndex.m33389boximpl(i));
    }

    public final void updateFromMeasureResult(LazyListMeasureResult lazyListMeasureResult) {
        Object obj;
        Snapshot makeCurrent;
        C12775o.m28639i(lazyListMeasureResult, "measureResult");
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        if (firstVisibleItem != null) {
            obj = firstVisibleItem.getKey();
        } else {
            obj = null;
        }
        this.lastKnownFirstItemKey = obj;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            boolean z = true;
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            int i = 0;
            if (((float) firstVisibleItemScrollOffset) < 0.0f) {
                z = false;
            }
            if (z) {
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    makeCurrent = createNonObservableSnapshot.makeCurrent();
                    LazyMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
                    if (firstVisibleItem2 != null) {
                        i = firstVisibleItem2.getIndex();
                    }
                    m33419updateAhXoVpI(DataIndex.m33391constructorimpl(i), firstVisibleItemScrollOffset);
                    C11921v vVar = C11921v.f18618a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                } catch (Throwable th) {
                    createNonObservableSnapshot.dispose();
                    throw th;
                }
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
            }
        }
    }

    @ExperimentalFoundationApi
    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider lazyListItemProvider) {
        Snapshot makeCurrent;
        C12775o.m28639i(lazyListItemProvider, "itemProvider");
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            m33419updateAhXoVpI(DataIndex.m33391constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, m33420getIndexjQJCoq8())), getScrollOffset());
            C11921v vVar = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    public LazyListScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DataIndex.m33389boximpl(DataIndex.m33391constructorimpl(i)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.scrollOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyListScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
