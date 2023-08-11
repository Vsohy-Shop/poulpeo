package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, C13212a {
    private boolean hasNext = true;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(TrieNode<K, V> trieNode, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        C12775o.m28639i(trieNode, "node");
        C12775o.m28639i(trieNodeBaseIteratorArr, "path");
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void ensureNextEntryIsReady() {
        if (!this.path[this.pathLastIndex].hasNextKey()) {
            for (int i = this.pathLastIndex; -1 < i; i--) {
                int moveToNextNodeWithData = moveToNextNodeWithData(i);
                if (moveToNextNodeWithData == -1 && this.path[i].hasNextNode()) {
                    this.path[i].moveToNextNode();
                    moveToNextNodeWithData = moveToNextNodeWithData(i);
                }
                if (moveToNextNodeWithData != -1) {
                    this.pathLastIndex = moveToNextNodeWithData;
                    return;
                }
                if (i > 0) {
                    this.path[i - 1].moveToNextNode();
                }
                this.path[i].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
            }
            this.hasNext = false;
        }
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path[i].hasNextKey()) {
            return i;
        }
        if (!this.path[i].hasNextNode()) {
            return -1;
        }
        TrieNode<? extends K, ? extends V> currentNode = this.path[i].currentNode();
        if (i == 6) {
            this.path[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.getBuffer$runtime_release().length);
        } else {
            this.path[i + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.entryCount$runtime_release() * 2);
        }
        return moveToNextNodeWithData(i + 1);
    }

    /* access modifiers changed from: protected */
    public final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    /* access modifiers changed from: protected */
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    /* access modifiers changed from: protected */
    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    public boolean hasNext() {
        return this.hasNext;
    }

    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    public final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }
}
