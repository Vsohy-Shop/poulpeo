package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> {
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        C12775o.m28639i(persistentHashMapBuilder, "builder");
        C12775o.m28639i(trieNodeBaseIteratorArr, "path");
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void resetPath(int i, TrieNode<?, ?> trieNode, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!C12775o.m28634d(getPath()[i2].currentKey(), k)) {
                getPath()[i2].moveToNextKey();
            }
            setPathLastIndex(i2);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i3);
        if (trieNode.hasEntryAt$runtime_release(indexSegment)) {
            getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(indexSegment));
            setPathLastIndex(i2);
            return;
        }
        int nodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(indexSegment);
        TrieNode<?, ?> nodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        getPath()[i2].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, nodeIndex$runtime_release);
        resetPath(i, nodeAtIndex$runtime_release, k, i2 + 1);
    }

    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return super.next();
    }

    public void remove() {
        int i;
        checkNextWasInvoked();
        if (hasNext()) {
            Object currentKey = currentKey();
            C12772l0.m28612d(this.builder).remove(this.lastIteratedKey);
            if (currentKey != null) {
                i = currentKey.hashCode();
            } else {
                i = 0;
            }
            resetPath(i, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            C12772l0.m28612d(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k, V v) {
        int i;
        if (this.builder.containsKey(k)) {
            if (hasNext()) {
                Object currentKey = currentKey();
                this.builder.put(k, v);
                if (currentKey != null) {
                    i = currentKey.hashCode();
                } else {
                    i = 0;
                }
                resetPath(i, this.builder.getNode$runtime_release(), currentKey, 0);
            } else {
                this.builder.put(k, v);
            }
            this.expectedModCount = this.builder.getModCount$runtime_release();
        }
    }
}
