package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,113:1\n76#2:114\n102#2,2:115\n76#2:117\n102#2,2:118\n1#3:120\n480#4,4:121\n485#4:130\n480#4,4:131\n485#4:140\n122#5,5:125\n122#5,5:135\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:114\n35#1:115,2\n38#1:117\n38#1:118,2\n59#1:121,4\n59#1:130\n95#1:131,4\n95#1:140\n59#1:125,5\n95#1:135,5\n*E\n"})
/* compiled from: LazyGridScrollPosition.kt */
public final class LazyGridScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableState index$delegate;
    private Object lastKnownFirstItemKey;
    private final MutableState scrollOffset$delegate;

    public LazyGridScrollPosition() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: setIndex-YGsSkvE  reason: not valid java name */
    private final void m33483setIndexYGsSkvE(int i) {
        this.index$delegate.setValue(ItemIndex.m33440boximpl(i));
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setValue(Integer.valueOf(i));
    }

    /* renamed from: update-yO3Fmg4  reason: not valid java name */
    private final void m33484updateyO3Fmg4(int i, int i2) {
        boolean z;
        if (((float) i) >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!ItemIndex.m33445equalsimpl0(i, m33485getIndexVZbfaAc())) {
                m33483setIndexYGsSkvE(i);
            }
            if (i2 != getScrollOffset()) {
                setScrollOffset(i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
    }

    /* renamed from: getIndex-VZbfaAc  reason: not valid java name */
    public final int m33485getIndexVZbfaAc() {
        return ((ItemIndex) this.index$delegate.getValue()).m33452unboximpl();
    }

    public final int getScrollOffset() {
        return ((Number) this.scrollOffset$delegate.getValue()).intValue();
    }

    /* renamed from: requestPosition-yO3Fmg4  reason: not valid java name */
    public final void m33486requestPositionyO3Fmg4(int i, int i2) {
        m33484updateyO3Fmg4(i, i2);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult lazyGridMeasureResult) {
        Object obj;
        Snapshot makeCurrent;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        C12775o.m28639i(lazyGridMeasureResult, "measureResult");
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        if (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) C12710p.m28381I(items2)) == null) {
            obj = null;
        } else {
            obj = lazyGridMeasuredItem2.getKey();
        }
        this.lastKnownFirstItemKey = obj;
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            boolean z = true;
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int i = 0;
            if (((float) firstVisibleLineScrollOffset) < 0.0f) {
                z = false;
            }
            if (z) {
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    makeCurrent = createNonObservableSnapshot.makeCurrent();
                    LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
                    if (!(firstVisibleLine2 == null || (items = firstVisibleLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) C12710p.m28381I(items)) == null)) {
                        i = lazyGridMeasuredItem.m33476getIndexVZbfaAc();
                    }
                    m33484updateyO3Fmg4(ItemIndex.m33442constructorimpl(i), firstVisibleLineScrollOffset);
                    C11921v vVar = C11921v.f18618a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                } catch (Throwable th) {
                    createNonObservableSnapshot.dispose();
                    throw th;
                }
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')').toString());
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider) {
        Snapshot makeCurrent;
        C12775o.m28639i(lazyGridItemProvider, "itemProvider");
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            m33484updateyO3Fmg4(ItemIndex.m33442constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, m33485getIndexVZbfaAc())), getScrollOffset());
            C11921v vVar = C11921v.f18618a;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    public LazyGridScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ItemIndex.m33440boximpl(ItemIndex.m33442constructorimpl(i)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.scrollOffset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
