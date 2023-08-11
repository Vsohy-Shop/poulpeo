package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,117:1\n76#2:118\n102#2,2:119\n76#2:121\n102#2,2:122\n16594#3,14:124\n1#4:138\n116#5,2:139\n33#5,6:141\n118#5:147\n480#6,4:148\n485#6:157\n480#6,4:158\n485#6:167\n122#7,5:152\n122#7,5:162\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n34#1:118\n34#1:119,2\n35#1:121\n35#1:122,2\n47#1:124,14\n51#1:139,2\n51#1:141,6\n51#1:147\n58#1:148,4\n58#1:157\n95#1:158,4\n95#1:167\n58#1:152,5\n95#1:162,5\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyStaggeredGridScrollPosition.kt */
public final class LazyStaggeredGridScrollPosition {
    private final C13088o<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableState indices$delegate;
    private Object lastKnownFirstItemKey;
    private final MutableState offsets$delegate;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, C13088o<? super Integer, ? super Integer, int[]> oVar) {
        C12775o.m28639i(iArr, "initialIndices");
        C12775o.m28639i(iArr2, "initialOffsets");
        C12775o.m28639i(oVar, "fillIndices");
        this.fillIndices = oVar;
        this.indices$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iArr, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.offsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iArr2, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private final void update(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, getIndices())) {
            setIndices(iArr);
        }
        if (!Arrays.equals(iArr2, getOffsets())) {
            setOffsets(iArr2);
        }
    }

    public final int[] getIndices() {
        return (int[]) this.indices$delegate.getValue();
    }

    public final int[] getOffsets() {
        return (int[]) this.offsets$delegate.getValue();
    }

    public final void requestPosition(int i, int i2) {
        int[] invoke = this.fillIndices.invoke(Integer.valueOf(i), Integer.valueOf(getIndices().length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
        }
        update(invoke, iArr);
        this.lastKnownFirstItemKey = null;
    }

    public final void setIndices(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.indices$delegate.setValue(iArr);
    }

    public final void setOffsets(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.offsets$delegate.setValue(iArr);
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        boolean z;
        Object obj;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        Snapshot makeCurrent;
        boolean z2;
        int i;
        int i2;
        C12775o.m28639i(lazyStaggeredGridMeasureResult, "measureResult");
        int[] firstVisibleItemIndices = lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i3 = firstVisibleItemIndices[0];
            int L = C12710p.m28384L(firstVisibleItemIndices);
            if (L != 0) {
                if (i3 == -1) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = i3;
                }
                C12703l0 r = new C13528f(1, L).iterator();
                while (r.hasNext()) {
                    int i4 = firstVisibleItemIndices[r.nextInt()];
                    if (i4 == -1) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = i4;
                    }
                    if (i > i2) {
                        i3 = i4;
                        i = i2;
                    }
                }
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = 0;
            }
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i5 = 0;
            while (true) {
                obj = null;
                if (i5 >= size) {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
                lazyStaggeredGridItemInfo = visibleItemsInfo.get(i5);
                if (lazyStaggeredGridItemInfo.getIndex() == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i5++;
            }
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
            if (lazyStaggeredGridItemInfo2 != null) {
                obj = lazyStaggeredGridItemInfo2.getKey();
            }
            this.lastKnownFirstItemKey = obj;
            if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
                this.hadFirstNotEmptyLayout = true;
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    makeCurrent = createNonObservableSnapshot.makeCurrent();
                    update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                    C11921v vVar = C11921v.f18618a;
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    createNonObservableSnapshot.dispose();
                } catch (Throwable th) {
                    createNonObservableSnapshot.dispose();
                    throw th;
                }
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @ExperimentalFoundationApi
    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider lazyLayoutItemProvider) {
        Snapshot makeCurrent;
        C12775o.m28639i(lazyLayoutItemProvider, "itemProvider");
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            makeCurrent = createNonObservableSnapshot.makeCurrent();
            Object obj = this.lastKnownFirstItemKey;
            int i = 0;
            Integer N = C12710p.m28386N(getIndices(), 0);
            if (N != null) {
                i = N.intValue();
            }
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, i);
            if (!C12710p.m28376D(getIndices(), findIndexByKey)) {
                update(this.fillIndices.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(getIndices().length)), getOffsets());
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
