package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashSetIterator.kt */
public final class TrieNodeIterator<E> {
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        trieNodeIterator.reset(objArr, i);
    }

    public final E currentElement() {
        CommonFunctionsKt.m35307assert(hasNextElement());
        return this.buffer[this.index];
    }

    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m35307assert(hasNextNode());
        Object obj = this.buffer[this.index];
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final boolean hasNextElement() {
        if (!hasNextCell() || (this.buffer[this.index] instanceof TrieNode)) {
            return false;
        }
        return true;
    }

    public final boolean hasNextNode() {
        if (!hasNextCell() || !(this.buffer[this.index] instanceof TrieNode)) {
            return false;
        }
        return true;
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m35307assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m35307assert(hasNextElement());
        E[] eArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        return eArr[i];
    }

    public final void reset(Object[] objArr, int i) {
        C12775o.m28639i(objArr, "buffer");
        this.buffer = objArr;
        this.index = i;
    }
}
