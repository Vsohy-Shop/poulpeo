package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import p412pf.C13218f;

/* compiled from: ImmutableSet.kt */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* compiled from: ImmutableSet.kt */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, C13218f {
        PersistentSet<E> build();
    }

    PersistentSet<E> add(E e);

    PersistentSet<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    PersistentSet<E> clear();

    PersistentSet<E> remove(E e);

    PersistentSet<E> removeAll(Collection<? extends E> collection);

    PersistentSet<E> removeAll(Function1<? super E, Boolean> function1);

    PersistentSet<E> retainAll(Collection<? extends E> collection);
}
