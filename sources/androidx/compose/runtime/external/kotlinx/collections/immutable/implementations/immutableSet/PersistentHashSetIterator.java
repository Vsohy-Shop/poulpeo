package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: PersistentHashSetIterator.kt */
public class PersistentHashSetIterator<E> implements Iterator<E>, C13212a {
    private boolean hasNext = true;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        C12775o.m28639i(trieNode, "node");
        List<TrieNodeIterator<E>> q = C12726w.m28530q(new TrieNodeIterator());
        this.path = q;
        TrieNodeIterator.reset$default(q.get(0), trieNode.getBuffer(), 0, 2, (Object) null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (!this.path.get(this.pathLastIndex).hasNextElement()) {
            for (int i = this.pathLastIndex; -1 < i; i--) {
                int moveToNextNodeWithData = moveToNextNodeWithData(i);
                if (moveToNextNodeWithData == -1 && this.path.get(i).hasNextCell()) {
                    this.path.get(i).moveToNextCell();
                    moveToNextNodeWithData = moveToNextNodeWithData(i);
                }
                if (moveToNextNodeWithData != -1) {
                    this.pathLastIndex = moveToNextNodeWithData;
                    return;
                }
                if (i > 0) {
                    this.path.get(i - 1).moveToNextCell();
                }
                this.path.get(i).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
            }
            this.hasNext = false;
        }
    }

    private final int moveToNextNodeWithData(int i) {
        if (this.path.get(i).hasNextElement()) {
            return i;
        }
        if (!this.path.get(i).hasNextNode()) {
            return -1;
        }
        TrieNode currentNode = this.path.get(i).currentNode();
        int i2 = i + 1;
        if (i2 == this.path.size()) {
            this.path.add(new TrieNodeIterator());
        }
        TrieNodeIterator.reset$default(this.path.get(i2), currentNode.getBuffer(), 0, 2, (Object) null);
        return moveToNextNodeWithData(i2);
    }

    /* access modifiers changed from: protected */
    public final E currentElement() {
        CommonFunctionsKt.m35307assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    /* access modifiers changed from: protected */
    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    /* access modifiers changed from: protected */
    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    public boolean hasNext() {
        return this.hasNext;
    }

    public E next() {
        if (this.hasNext) {
            E nextElement = this.path.get(this.pathLastIndex).nextElement();
            ensureNextElementIsReady();
            return nextElement;
        }
        throw new NoSuchElementException();
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
