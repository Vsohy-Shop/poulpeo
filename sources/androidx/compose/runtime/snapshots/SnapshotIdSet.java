package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p412pf.C13212a;

@Immutable
@SourceDebugExtension({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* compiled from: SnapshotIdSet.kt */
public final class SnapshotIdSet implements Iterable<Integer>, C13212a {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, (int[]) null);
    /* access modifiers changed from: private */
    public final int[] belowBound;
    /* access modifiers changed from: private */
    public final int lowerBound;
    /* access modifiers changed from: private */
    public final long lowerSet;
    /* access modifiers changed from: private */
    public final long upperSet;

    /* compiled from: SnapshotIdSet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.upperSet = j;
        this.lowerSet = j2;
        this.lowerBound = i;
        this.belowBound = iArr;
    }

    public final SnapshotIdSet and(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
        C12775o.m28639i(snapshotIdSet2, "bits");
        SnapshotIdSet snapshotIdSet3 = EMPTY;
        if (C12775o.m28634d(snapshotIdSet2, snapshotIdSet3) || C12775o.m28634d(this, snapshotIdSet3)) {
            return snapshotIdSet3;
        }
        int i = snapshotIdSet2.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2 && snapshotIdSet2.belowBound == (iArr = this.belowBound)) {
            long j = this.upperSet;
            long j2 = snapshotIdSet2.upperSet;
            long j3 = this.lowerSet;
            long j4 = snapshotIdSet2.lowerSet;
            long j5 = j3 & j4;
            if ((j & j2) == 0 && j5 == 0 && iArr == null) {
                return snapshotIdSet3;
            }
            return new SnapshotIdSet(j2 & j, j3 & j4, i2, iArr);
        } else if (this.belowBound == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (snapshotIdSet2.get(intValue)) {
                    snapshotIdSet3 = snapshotIdSet3.set(intValue);
                }
            }
            return snapshotIdSet3;
        } else {
            Iterator it2 = snapshotIdSet.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Number) it2.next()).intValue();
                if (get(intValue2)) {
                    snapshotIdSet3 = snapshotIdSet3.set(intValue2);
                }
            }
            return snapshotIdSet3;
        }
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C12775o.m28639i(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2 && snapshotIdSet.belowBound == (iArr = this.belowBound)) {
            return new SnapshotIdSet(this.upperSet & (~snapshotIdSet.upperSet), this.lowerSet & (~snapshotIdSet.lowerSet), i2, iArr);
        }
        Iterator it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.clear(((Number) it.next()).intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet clear(int i) {
        int[] iArr;
        int binarySearch;
        int i2 = i;
        int i3 = this.lowerBound;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j = 1 << i4;
            long j2 = this.lowerSet;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.upperSet, j2 & (~j), i3, this.belowBound);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j3 = 1 << (i4 - 64);
            long j4 = this.upperSet;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.lowerSet, i3, this.belowBound);
            }
        } else if (i4 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i2)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (binarySearch > 0) {
                int[] unused = C12708o.m28340g(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < length) {
                int[] unused2 = C12708o.m28340g(iArr, iArr2, binarySearch, binarySearch + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void fastForEach(Function1<? super Integer, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        int[] access$getBelowBound$p = this.belowBound;
        if (access$getBelowBound$p != null) {
            for (int valueOf : access$getBelowBound$p) {
                function1.invoke(Integer.valueOf(valueOf));
            }
        }
        if (this.lowerSet != 0) {
            for (int i = 0; i < 64; i++) {
                if ((this.lowerSet & (1 << i)) != 0) {
                    function1.invoke(Integer.valueOf(this.lowerBound + i));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((this.upperSet & (1 << i2)) != 0) {
                    function1.invoke(Integer.valueOf(i2 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean get(int i) {
        int[] iArr;
        int i2 = i - this.lowerBound;
        boolean z = true;
        if (i2 < 0 || i2 >= 64) {
            if (i2 < 64 || i2 >= 128) {
                if (i2 > 0 || (iArr = this.belowBound) == null) {
                    return false;
                }
                if (SnapshotIdSetKt.binarySearch(iArr, i) < 0) {
                    z = false;
                }
                return z;
            } else if (((1 << (i2 - 64)) & this.upperSet) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i2) & this.lowerSet) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public Iterator<Integer> iterator() {
        return C13654k.m31268b(new SnapshotIdSet$iterator$1(this, (C12074d<? super SnapshotIdSet$iterator$1>) null)).iterator();
    }

    public final int lowest(int i) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.lowerSet;
        if (j != 0) {
            return this.lowerBound + SnapshotIdSetKt.lowestBitOf(j);
        }
        long j2 = this.upperSet;
        if (j2 != 0) {
            return this.lowerBound + 64 + SnapshotIdSetKt.lowestBitOf(j2);
        }
        return i;
    }

    /* renamed from: or */
    public final SnapshotIdSet mo12044or(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        C12775o.m28639i(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.lowerBound;
        int i2 = this.lowerBound;
        if (i == i2 && snapshotIdSet.belowBound == (iArr = this.belowBound)) {
            return new SnapshotIdSet(this.upperSet | snapshotIdSet.upperSet, this.lowerSet | snapshotIdSet.lowerSet, i2, iArr);
        }
        if (this.belowBound == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.set(((Number) it.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.set(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet set(int i) {
        int i2;
        int[] iArr;
        int i3 = i;
        int i4 = this.lowerBound;
        int i5 = i3 - i4;
        long j = 0;
        if (i5 >= 0 && i5 < 64) {
            long j2 = 1 << i5;
            long j3 = this.lowerSet;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.upperSet, j3 | j2, i4, this.belowBound);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j4 = 1 << (i5 - 64);
            long j5 = this.upperSet;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.lowerSet, i4, this.belowBound);
            }
        } else if (i5 < 128) {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i4, new int[]{i3});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr2, i3);
            if (binarySearch < 0) {
                int i6 = -(binarySearch + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                int[] unused = C12708o.m28340g(iArr2, iArr3, 0, 0, i6);
                int[] unused2 = C12708o.m28340g(iArr2, iArr3, i6 + 1, i6, length - 1);
                iArr3[i6] = i3;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr3);
            }
        } else if (!get(i)) {
            long j6 = this.upperSet;
            long j7 = this.lowerSet;
            int i7 = this.lowerBound;
            int i8 = ((i3 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i7 >= i8) {
                    i2 = i7;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.belowBound;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    i2 = i8;
                    j8 = j;
                    break;
                }
                i7 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (iArr = C12686e0.m28204A0(arrayList)) == null) {
                iArr = this.belowBound;
            }
            return new SnapshotIdSet(j9, j8, i2, iArr).set(i3);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        sb.append(']');
        return sb.toString();
    }
}
