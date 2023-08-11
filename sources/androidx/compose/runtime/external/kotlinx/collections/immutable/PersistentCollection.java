package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import p412pf.C13213b;

/* compiled from: ImmutableCollection.kt */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: ImmutableCollection.kt */
    public interface Builder<E> extends Collection<E>, C13213b {
        PersistentCollection<E> build();
    }

    PersistentCollection<E> add(E e);

    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    PersistentCollection<E> clear();

    PersistentCollection<E> remove(E e);

    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    PersistentCollection<E> removeAll(Function1<? super E, Boolean> function1);

    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}
