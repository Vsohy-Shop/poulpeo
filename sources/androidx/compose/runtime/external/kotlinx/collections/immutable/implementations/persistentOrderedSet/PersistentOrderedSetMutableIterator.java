package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;

/* compiled from: PersistentOrderedSetMutableIterator.kt */
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> {
    private final PersistentOrderedSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement$runtime_release(), persistentOrderedSetBuilder.getHashMapBuilder$runtime_release());
        C12775o.m28639i(persistentOrderedSetBuilder, "builder");
        this.builder = persistentOrderedSetBuilder;
        this.expectedModCount = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
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
        checkNextWasInvoked();
        PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder = this.builder;
        C12772l0.m28609a(persistentOrderedSetBuilder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        setIndex$runtime_release(getIndex$runtime_release() - 1);
    }
}
