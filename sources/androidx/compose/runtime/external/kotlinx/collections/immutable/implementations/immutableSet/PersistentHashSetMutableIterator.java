package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentHashSetMutableIterator.kt */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> {
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime_release());
        C12775o.m28639i(persistentHashSetBuilder, "builder");
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime_release();
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

    private final boolean isCollision(TrieNode<?> trieNode) {
        if (trieNode.getBitmap() == 0) {
            return true;
        }
        return false;
    }

    private final void resetPath(int i, TrieNode<?> trieNode, E e, int i2) {
        boolean z = true;
        if (isCollision(trieNode)) {
            int Q = C12710p.m28389Q(trieNode.getBuffer(), e);
            if (Q == -1) {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            ((TrieNodeIterator) getPath().get(i2)).reset(trieNode.getBuffer(), Q);
            setPathLastIndex(i2);
            return;
        }
        int indexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i, i2 * 5));
        ((TrieNodeIterator) getPath().get(i2)).reset(trieNode.getBuffer(), indexOfCellAt$runtime_release);
        Object obj = trieNode.getBuffer()[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            resetPath(i, (TrieNode) obj, e, i2 + 1);
        } else {
            setPathLastIndex(i2);
        }
    }

    public E next() {
        checkForComodification();
        E next = super.next();
        this.lastIteratedElement = next;
        this.nextWasInvoked = true;
        return next;
    }

    public void remove() {
        int i;
        checkNextWasInvoked();
        if (hasNext()) {
            Object currentElement = currentElement();
            C12772l0.m28609a(this.builder).remove(this.lastIteratedElement);
            if (currentElement != null) {
                i = currentElement.hashCode();
            } else {
                i = 0;
            }
            resetPath(i, this.builder.getNode$runtime_release(), currentElement, 0);
        } else {
            C12772l0.m28609a(this.builder).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
