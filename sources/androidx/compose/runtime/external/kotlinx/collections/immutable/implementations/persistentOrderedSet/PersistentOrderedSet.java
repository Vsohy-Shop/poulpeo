package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C12694i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
/* compiled from: PersistentOrderedSet.kt */
public final class PersistentOrderedSet<E> extends C12694i<E> implements PersistentSet<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final PersistentOrderedSet EMPTY;
    private final Object firstElement;
    private final PersistentHashMap<E, Links> hashMap;
    private final Object lastElement;

    /* compiled from: PersistentOrderedSet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentOrderedSet.EMPTY;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap<E, Links> persistentHashMap) {
        C12775o.m28639i(persistentHashMap, "hashMap");
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final PersistentHashMap<E, Links> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public final Object getLastElement$runtime_release() {
        return this.lastElement;
    }

    public int getSize() {
        return this.hashMap.size();
    }

    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    public PersistentSet<E> add(E e) {
        if (this.hashMap.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(e, e, this.hashMap.put((Object) e, (Object) new Links()));
        }
        Object obj = this.lastElement;
        Links links = this.hashMap.get(obj);
        C12775o.m28636f(links);
        return new PersistentOrderedSet(this.firstElement, e, this.hashMap.put(obj, (Object) links.withNext(e)).put((Object) e, (Object) new Links(obj)));
    }

    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    public PersistentSet.Builder<E> builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    public PersistentSet<E> remove(E e) {
        Links links = this.hashMap.get(e);
        if (links == null) {
            return this;
        }
        PersistentHashMap remove = this.hashMap.remove((Object) e);
        if (links.getHasPrevious()) {
            Object obj = remove.get(links.getPrevious());
            C12775o.m28636f(obj);
            remove = remove.put(links.getPrevious(), (Object) ((Links) obj).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            Object obj2 = remove.get(links.getNext());
            C12775o.m28636f(obj2);
            remove = remove.put(links.getNext(), (Object) ((Links) obj2).withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
    }

    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        PersistentSet.Builder builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    public PersistentSet<E> removeAll(Function1<? super E, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        PersistentSet.Builder builder = builder();
        boolean unused = C12669b0.m28183G(builder, function1);
        return builder.build();
    }
}
