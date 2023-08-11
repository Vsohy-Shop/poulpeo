package androidx.compose.p002ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
/* renamed from: androidx.compose.ui.node.NestedVectorStack */
/* compiled from: NestedVectorStack.kt */
public final class NestedVectorStack<T> {
    private int current = -1;
    private int[] indexes = new int[16];
    private int lastIndex;
    private final MutableVector<MutableVector<T>> vectors = new MutableVector<>(new MutableVector[16], 0);

    private final void pushIndex(int i) {
        int i2 = this.lastIndex;
        int[] iArr = this.indexes;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            this.indexes = copyOf;
        }
        int[] iArr2 = this.indexes;
        int i3 = this.lastIndex;
        this.lastIndex = i3 + 1;
        iArr2[i3] = i;
    }

    public final boolean isNotEmpty() {
        int i = this.current;
        if (i < 0 || this.indexes[i] < 0) {
            return false;
        }
        return true;
    }

    public final T pop() {
        int i = this.current;
        int i2 = this.indexes[i];
        MutableVector mutableVector = (MutableVector) this.vectors.getContent()[i];
        if (i2 > 0) {
            int[] iArr = this.indexes;
            iArr[i] = iArr[i] - 1;
        } else if (i2 == 0) {
            this.vectors.removeAt(i);
            this.current--;
        }
        return mutableVector.getContent()[i2];
    }

    public final void push(MutableVector<T> mutableVector) {
        C12775o.m28639i(mutableVector, "vector");
        if (mutableVector.isNotEmpty()) {
            this.vectors.add(mutableVector);
            pushIndex(mutableVector.getSize() - 1);
            this.current++;
        }
    }
}
