package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
/* compiled from: LazyGridSpanLayoutProvider.kt */
public final class LazyGridSpanLayoutProvider {
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket = new ArrayList();
    private int cachedBucketIndex = -1;
    private final LazyGridItemProvider itemProvider;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans = C12726w.m28524k();
    private int slotsPerLine;

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    private static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i) {
            maxCurrentLineSpan = i;
        }

        public void setMaxLineSpan(int i) {
            maxLineSpan = i;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: LazyGridSpanLayoutProvider.kt */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i, List<GridItemSpan> list) {
            C12775o.m28639i(list, "spans");
            this.firstItemIndex = i;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridItemProvider lazyGridItemProvider) {
        C12775o.m28639i(lazyGridItemProvider, "itemProvider");
        this.itemProvider = lazyGridItemProvider;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        arrayList.add(new Bucket(0, 0, 2, (DefaultConstructorMarker) null));
        this.buckets = arrayList;
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((((double) getTotalSize()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i) {
        if (i == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(GridItemSpan.m33432boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        this.buckets.add(new Bucket(0, 0, 2, (DefaultConstructorMarker) null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae A[LOOP:0: B:33:0x00ae->B:76:0x00ae, LOOP_START, PHI: r2 r4 r5 
      PHI: (r2v6 int) = (r2v5 int), (r2v10 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 int) = (r5v4 int), (r5v13 int) binds: [B:32:0x00ac, B:76:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r12) {
        /*
            r11 = this;
            androidx.compose.foundation.lazy.grid.LazyGridItemProvider r0 = r11.itemProvider
            boolean r0 = r0.getHasCustomSpans()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            int r0 = r11.slotsPerLine
            int r12 = r12 * r0
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration
            int r2 = r11.slotsPerLine
            int r3 = r11.getTotalSize()
            int r3 = r3 - r12
            int r2 = p436tf.C13537l.m30882i(r2, r3)
            int r1 = p436tf.C13537l.m30877d(r2, r1)
            java.util.List r1 = r11.getDefaultSpans(r1)
            r0.<init>(r12, r1)
            return r0
        L_0x0025:
            int r0 = r11.getBucketSize()
            int r0 = r12 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket> r2 = r11.buckets
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r11.getBucketSize()
            int r2 = r2 * r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket> r4 = r11.buckets
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r4 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.Bucket) r4
            int r4 = r4.getFirstItemIndex()
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket> r5 = r11.buckets
            java.lang.Object r5 = r5.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r5 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.Bucket) r5
            int r5 = r5.getFirstItemKnownSpan()
            int r6 = r11.lastLineIndex
            if (r2 > r6) goto L_0x005c
            if (r6 > r12) goto L_0x005c
            r7 = r3
            goto L_0x005d
        L_0x005c:
            r7 = r1
        L_0x005d:
            if (r7 == 0) goto L_0x0065
            int r4 = r11.lastLineStartItemIndex
            int r5 = r11.lastLineStartKnownSpan
            r2 = r6
            goto L_0x0081
        L_0x0065:
            int r6 = r11.cachedBucketIndex
            if (r0 != r6) goto L_0x0081
            int r6 = r12 - r2
            java.util.List<java.lang.Integer> r7 = r11.cachedBucket
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0081
            java.util.List<java.lang.Integer> r2 = r11.cachedBucket
            java.lang.Object r2 = r2.get(r6)
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            r2 = r12
            r5 = r1
        L_0x0081:
            int r6 = r11.getBucketSize()
            int r6 = r2 % r6
            if (r6 != 0) goto L_0x009b
            int r6 = r11.getBucketSize()
            int r7 = r12 - r2
            r8 = 2
            if (r8 > r7) goto L_0x0096
            if (r7 >= r6) goto L_0x0096
            r6 = r3
            goto L_0x0097
        L_0x0096:
            r6 = r1
        L_0x0097:
            if (r6 == 0) goto L_0x009b
            r6 = r3
            goto L_0x009c
        L_0x009b:
            r6 = r1
        L_0x009c:
            if (r6 == 0) goto L_0x00a5
            r11.cachedBucketIndex = r0
            java.util.List<java.lang.Integer> r0 = r11.cachedBucket
            r0.clear()
        L_0x00a5:
            if (r2 > r12) goto L_0x00a9
            r0 = r3
            goto L_0x00aa
        L_0x00a9:
            r0 = r1
        L_0x00aa:
            java.lang.String r7 = "Check failed."
            if (r0 == 0) goto L_0x015b
        L_0x00ae:
            if (r2 >= r12) goto L_0x011c
            int r0 = r11.getTotalSize()
            if (r4 >= r0) goto L_0x011c
            if (r6 == 0) goto L_0x00c1
            java.util.List<java.lang.Integer> r0 = r11.cachedBucket
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0.add(r8)
        L_0x00c1:
            r0 = r1
        L_0x00c2:
            int r8 = r11.slotsPerLine
            if (r0 >= r8) goto L_0x00e4
            int r8 = r11.getTotalSize()
            if (r4 >= r8) goto L_0x00e4
            if (r5 != 0) goto L_0x00d9
            int r8 = r11.slotsPerLine
            int r8 = r8 - r0
            int r8 = r11.spanOf(r4, r8)
            r10 = r8
            r8 = r5
            r5 = r10
            goto L_0x00da
        L_0x00d9:
            r8 = r1
        L_0x00da:
            int r0 = r0 + r5
            int r9 = r11.slotsPerLine
            if (r0 <= r9) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            int r4 = r4 + 1
            r5 = r8
            goto L_0x00c2
        L_0x00e4:
            int r2 = r2 + 1
            int r0 = r11.getBucketSize()
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x00ae
            int r0 = r11.getTotalSize()
            if (r4 >= r0) goto L_0x00ae
            int r0 = r11.getBucketSize()
            int r0 = r2 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket> r8 = r11.buckets
            int r8 = r8.size()
            if (r8 != r0) goto L_0x0104
            r0 = r3
            goto L_0x0105
        L_0x0104:
            r0 = r1
        L_0x0105:
            if (r0 == 0) goto L_0x0112
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket> r0 = r11.buckets
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket r8 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$Bucket
            r8.<init>(r4, r5)
            r0.add(r8)
            goto L_0x00ae
        L_0x0112:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r12.<init>(r0)
            throw r12
        L_0x011c:
            r11.lastLineIndex = r12
            r11.lastLineStartItemIndex = r4
            r11.lastLineStartKnownSpan = r5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = r1
            r2 = r4
        L_0x0129:
            int r3 = r11.slotsPerLine
            if (r0 >= r3) goto L_0x0155
            int r3 = r11.getTotalSize()
            if (r2 >= r3) goto L_0x0155
            if (r5 != 0) goto L_0x0140
            int r3 = r11.slotsPerLine
            int r3 = r3 - r0
            int r3 = r11.spanOf(r2, r3)
            r10 = r5
            r5 = r3
            r3 = r10
            goto L_0x0141
        L_0x0140:
            r3 = r1
        L_0x0141:
            int r0 = r0 + r5
            int r6 = r11.slotsPerLine
            if (r0 > r6) goto L_0x0155
            int r2 = r2 + 1
            long r5 = androidx.compose.foundation.lazy.grid.LazyGridSpanKt.GridItemSpan(r5)
            androidx.compose.foundation.lazy.grid.GridItemSpan r5 = androidx.compose.foundation.lazy.grid.GridItemSpan.m33432boximpl(r5)
            r12.add(r5)
            r5 = r3
            goto L_0x0129
        L_0x0155:
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration
            r0.<init>(r4, r12)
            return r0
        L_0x015b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    /* renamed from: getLineIndexOfItem--_Ze7BM  reason: not valid java name */
    public final int m33487getLineIndexOfItem_Ze7BM(int i) {
        boolean z;
        boolean z2;
        int i2;
        if (getTotalSize() <= 0) {
            return LineIndex.m33496constructorimpl(0);
        }
        if (i < getTotalSize()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.itemProvider.getHasCustomSpans()) {
            return LineIndex.m33496constructorimpl(i / this.slotsPerLine);
        } else {
            int i3 = C12726w.m28522i(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i), 3, (Object) null);
            if (i3 < 0) {
                i3 = (-i3) - 2;
            }
            int bucketSize = getBucketSize() * i3;
            int firstItemIndex = this.buckets.get(i3).getFirstItemIndex();
            if (firstItemIndex <= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i4 = 0;
                while (firstItemIndex < i) {
                    int i5 = firstItemIndex + 1;
                    int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i4);
                    i4 += spanOf;
                    int i6 = this.slotsPerLine;
                    if (i4 >= i6) {
                        if (i4 == i6) {
                            bucketSize++;
                            i4 = 0;
                        } else {
                            bucketSize++;
                            i4 = spanOf;
                        }
                    }
                    if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                        ArrayList<Bucket> arrayList = this.buckets;
                        if (i4 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(new Bucket(i5 - i2, 0, 2, (DefaultConstructorMarker) null));
                    }
                    firstItemIndex = i5;
                }
                if (i4 + spanOf(i, this.slotsPerLine - i4) > this.slotsPerLine) {
                    bucketSize++;
                }
                return LineIndex.m33496constructorimpl(bucketSize);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.itemProvider.getItemCount();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            invalidateCache();
        }
    }

    public final int spanOf(int i, int i2) {
        LazyGridItemProvider lazyGridItemProvider = this.itemProvider;
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i2);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        return C13537l.m30886m(GridItemSpan.m33436getCurrentLineSpanimpl(lazyGridItemProvider.m33466getSpan_orMbw(lazyGridItemSpanScopeImpl, i)), 1, this.slotsPerLine);
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    private static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Bucket(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
