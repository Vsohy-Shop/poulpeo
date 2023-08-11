package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C12671c;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
/* compiled from: AbstractPersistentList.kt */
public abstract class AbstractPersistentList<E> extends C12671c<E> implements PersistentList<E> {
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<E> iterator() {
        return listIterator();
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public PersistentList<E> addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentList.Builder builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    public PersistentList<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    public PersistentList<E> removeAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        return removeAll(new AbstractPersistentList$removeAll$1(collection));
    }

    public PersistentList<E> retainAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        return removeAll(new AbstractPersistentList$retainAll$1(collection));
    }

    public ImmutableList<E> subList(int i, int i2) {
        return super.subList(i, i2);
    }

    public PersistentList<E> addAll(int i, Collection<? extends E> collection) {
        C12775o.m28639i(collection, "c");
        PersistentList.Builder builder = builder();
        builder.addAll(i, collection);
        return builder.build();
    }
}
