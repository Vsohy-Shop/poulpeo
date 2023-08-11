package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p412pf.C13215d;

/* compiled from: ImmutableList.kt */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* compiled from: ImmutableList.kt */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, C13215d {
        PersistentList<E> build();
    }

    PersistentList<E> add(int i, E e);

    PersistentList<E> add(E e);

    PersistentList<E> addAll(int i, Collection<? extends E> collection);

    PersistentList<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    PersistentList<E> clear();

    PersistentList<E> remove(E e);

    PersistentList<E> removeAll(Collection<? extends E> collection);

    PersistentList<E> removeAll(Function1<? super E, Boolean> function1);

    PersistentList<E> removeAt(int i);

    PersistentList<E> retainAll(Collection<? extends E> collection);

    PersistentList<E> set(int i, E e);
}
