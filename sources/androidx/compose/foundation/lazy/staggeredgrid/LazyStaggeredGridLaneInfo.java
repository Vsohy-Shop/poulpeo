package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.C12699k;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,207:1\n1#2:208\n388#3,7:209\n388#3,7:216\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:209,7\n187#1:216,7\n*E\n"})
/* compiled from: LazyStaggeredGridLaneInfo.kt */
public final class LazyStaggeredGridLaneInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;
    private int[] lanes = new int[16];
    private final C12699k<SpannedItem> spannedItems = new C12699k<>();

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LazyStaggeredGridLaneInfo.kt */
    private static final class SpannedItem {
        private int[] gaps;
        private final int index;

        public SpannedItem(int i, int[] iArr) {
            C12775o.m28639i(iArr, "gaps");
            this.index = i;
            this.gaps = iArr;
        }

        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(int[] iArr) {
            C12775o.m28639i(iArr, "<set-?>");
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i, int i2) {
        boolean z;
        if (i <= 131072) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = this.lanes;
            if (iArr.length < i) {
                int length = iArr.length;
                while (length < i) {
                    length *= 2;
                }
                this.lanes = C12708o.m28345l(this.lanes, new int[length], i2, 0, 0, 12, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i + " is larger than max supported: 131072!").toString());
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i, i2);
    }

    public final boolean assignedToLane(int i, int i2) {
        int lane = getLane(i);
        if (lane == i2 || lane == -1 || lane == -2) {
            return true;
        }
        return false;
    }

    public final void ensureValidIndex(int i) {
        boolean z;
        int i2 = this.anchor;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ensureCapacity$default(this, i3 + 1, 0, 2, (Object) null);
        } else {
            int max = Math.max(i - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                int[] iArr = this.lanes;
                if (i4 < iArr.length) {
                    int[] unused = C12708o.m28340g(iArr, iArr, 0, i4, iArr.length);
                }
                int[] iArr2 = this.lanes;
                C12708o.m28351r(iArr2, 0, Math.max(0, iArr2.length - i4), this.lanes.length);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i5 < 131072) {
                    ensureCapacity(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        int[] unused2 = C12708o.m28340g(iArr3, iArr3, i5, 0, iArr3.length - i5);
                    }
                    int[] iArr4 = this.lanes;
                    C12708o.m28351r(iArr4, 0, 0, Math.min(iArr4.length, i5));
                }
            }
        }
        while ((!this.spannedItems.isEmpty()) && this.spannedItems.first().getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while ((!this.spannedItems.isEmpty()) && this.spannedItems.last().getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i, int i2) {
        int upperBound = upperBound();
        for (int i3 = i + 1; i3 < upperBound; i3++) {
            if (assignedToLane(i3, i2)) {
                return i3;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i, int i2) {
        while (true) {
            i--;
            if (-1 >= i) {
                return -1;
            }
            if (assignedToLane(i, i2)) {
                return i;
            }
        }
    }

    public final int[] getGaps(int i) {
        C12699k<SpannedItem> kVar = this.spannedItems;
        SpannedItem spannedItem = (SpannedItem) C12686e0.m28224c0(this.spannedItems, C12726w.m28520g(kVar, 0, kVar.size(), new C0572x6e01acca(Integer.valueOf(i))));
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i) {
        if (i < lowerBound() || i >= upperBound()) {
            return -1;
        }
        return this.lanes[i - this.anchor] - 1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        C12708o.m28354u(this.lanes, 0, 0, 0, 6, (Object) null);
        this.spannedItems.clear();
    }

    public final void setGaps(int i, int[] iArr) {
        C12699k<SpannedItem> kVar = this.spannedItems;
        int g = C12726w.m28520g(kVar, 0, kVar.size(), new C0573x583b0d6(Integer.valueOf(i)));
        if (g < 0) {
            if (iArr != null) {
                this.spannedItems.add(-(g + 1), new SpannedItem(i, iArr));
            }
        } else if (iArr == null) {
            this.spannedItems.remove(g);
        } else {
            this.spannedItems.get(g).setGaps(iArr);
        }
    }

    public final void setLane(int i, int i2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ensureValidIndex(i);
            this.lanes[i - this.anchor] = i2 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported".toString());
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
