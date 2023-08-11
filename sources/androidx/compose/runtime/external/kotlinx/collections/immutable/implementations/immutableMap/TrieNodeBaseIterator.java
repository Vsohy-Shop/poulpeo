package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, C13212a {
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        return this.buffer[this.index];
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m35307assert(hasNextNode());
        Object obj = this.buffer[this.index];
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    /* access modifiers changed from: protected */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    /* access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        if (this.index < this.dataSize) {
            return true;
        }
        return false;
    }

    public final boolean hasNextNode() {
        boolean z;
        if (this.index >= this.dataSize) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m35307assert(z);
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m35307assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m35307assert(hasNextNode());
        this.index++;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i, int i2) {
        C12775o.m28639i(objArr, "buffer");
        this.buffer = objArr;
        this.dataSize = i;
        this.index = i2;
    }

    /* access modifiers changed from: protected */
    public final void setIndex(int i) {
        this.index = i;
    }

    public final void reset(Object[] objArr, int i) {
        C12775o.m28639i(objArr, "buffer");
        reset(objArr, i, 0);
    }
}
