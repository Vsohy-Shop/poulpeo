package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p448vf.C13650g;

@SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* compiled from: extensions.kt */
public final class ExtensionsKt {
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        return persistentHashMapOf((C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    public static final <E> PersistentSet<E> immutableHashSetOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> PersistentList<E> immutableListOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <K, V> PersistentMap<K, V> immutableMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        return persistentMapOf((C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    public static final <E> PersistentSet<E> immutableSetOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    public static final <E> PersistentSet<E> intersect(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28193Q(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E e) {
        C12775o.m28639i(persistentCollection, "<this>");
        return persistentCollection.remove(e);
    }

    public static final <T> PersistentSet<T> mutate(PersistentSet<? extends T> persistentSet, Function1<? super Set<T>, C11921v> function1) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(function1, "mutator");
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        PersistentHashMap emptyOf$runtime_release = PersistentHashMap.Companion.emptyOf$runtime_release();
        C12775o.m28637g(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder builder = emptyOf$runtime_release.builder();
        C12716r0.m28424o(builder, lVarArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll(C12708o.m28336c(eArr));
    }

    public static final <E> PersistentList<E> persistentListOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return UtilsKt.persistentVectorOf().addAll(C12708o.m28336c(eArr));
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        PersistentOrderedMap emptyOf$runtime_release = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        C12775o.m28637g(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder builder = emptyOf$runtime_release.builder();
        C12716r0.m28424o(builder, lVarArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> persistentSetOf(E... eArr) {
        C12775o.m28639i(eArr, "elements");
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll(C12708o.m28336c(eArr));
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E e) {
        C12775o.m28639i(persistentCollection, "<this>");
        return persistentCollection.add(e);
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(map, "map");
        return persistentMap.putAll(map);
    }

    public static final <T> ImmutableList<T> toImmutableList(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    public static final <K, V> ImmutableMap<K, V> toImmutableMap(Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap;
        PersistentMap.Builder builder;
        C12775o.m28639i(map, "<this>");
        PersistentMap persistentMap = null;
        if (map instanceof ImmutableMap) {
            immutableMap = (ImmutableMap) map;
        } else {
            immutableMap = null;
        }
        if (immutableMap != null) {
            return immutableMap;
        }
        if (map instanceof PersistentMap.Builder) {
            builder = (PersistentMap.Builder) map;
        } else {
            builder = null;
        }
        if (builder != null) {
            persistentMap = builder.build();
        }
        if (persistentMap != null) {
            return persistentMap;
        }
        return persistentMapOf().putAll(map);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        PersistentSet persistentSet = null;
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        if (builder != null) {
            persistentSet = builder.build();
        }
        if (persistentSet != null) {
            return persistentSet;
        }
        return plus(persistentSetOf(), iterable);
    }

    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        C12775o.m28639i(map, "<this>");
        PersistentHashMap persistentHashMap2 = null;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        if (map instanceof PersistentHashMapBuilder) {
            persistentHashMapBuilder = (PersistentHashMapBuilder) map;
        } else {
            persistentHashMapBuilder = null;
        }
        if (persistentHashMapBuilder != null) {
            persistentHashMap2 = persistentHashMapBuilder.build();
        }
        if (persistentHashMap2 != null) {
            return persistentHashMap2;
        }
        return PersistentHashMap.Companion.emptyOf$runtime_release().putAll(map);
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        PersistentHashSet persistentHashSet = null;
        PersistentHashSet persistentHashSet2 = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet2 != null) {
            return persistentHashSet2;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        if (persistentHashSetBuilder != null) {
            persistentHashSet = persistentHashSetBuilder.build();
        }
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        return plus(PersistentHashSet.Companion.emptyOf$runtime_release(), iterable);
    }

    public static final <T> PersistentList<T> toPersistentList(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        PersistentList<T> persistentList = null;
        PersistentList<T> persistentList2 = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList2 != null) {
            return persistentList2;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        if (builder != null) {
            persistentList = builder.build();
        }
        return persistentList == null ? plus(persistentListOf(), iterable) : persistentList;
    }

    public static final <K, V> PersistentMap<K, V> toPersistentMap(Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder;
        C12775o.m28639i(map, "<this>");
        PersistentMap<K, V> persistentMap = null;
        if (map instanceof PersistentOrderedMap) {
            persistentOrderedMap = (PersistentOrderedMap) map;
        } else {
            persistentOrderedMap = null;
        }
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        if (map instanceof PersistentOrderedMapBuilder) {
            persistentOrderedMapBuilder = (PersistentOrderedMapBuilder) map;
        } else {
            persistentOrderedMapBuilder = null;
        }
        if (persistentOrderedMapBuilder != null) {
            persistentMap = persistentOrderedMapBuilder.build();
        }
        if (persistentMap == null) {
            return PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll(map);
        }
        return persistentMap;
    }

    public static final <T> PersistentSet<T> toPersistentSet(Iterable<? extends T> iterable) {
        C12775o.m28639i(iterable, "<this>");
        PersistentSet<T> persistentSet = null;
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        if (persistentOrderedSetBuilder != null) {
            persistentSet = persistentOrderedSetBuilder.build();
        }
        return persistentSet == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), iterable) : persistentSet;
    }

    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) (Collection) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28184H(builder, iterable);
        return builder.build();
    }

    public static final <T> PersistentList<T> mutate(PersistentList<? extends T> persistentList, Function1<? super List<T>, C11921v> function1) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(function1, "mutator");
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28178B(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(iterable, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C12716r0.m28422m(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28186J(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> mutate(PersistentMap<? extends K, ? extends V> persistentMap, Function1<? super Map<K, V>, C11921v> function1) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(function1, "mutator");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, E[] eArr) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28180D(builder, eArr);
        return builder.build();
    }

    public static final <T> ImmutableList<T> toImmutableList(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return toPersistentList(gVar);
    }

    public static final <E> PersistentCollection<E> minus(PersistentCollection<? extends E> persistentCollection, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28185I(builder, gVar);
        return builder.build();
    }

    public static final <E> PersistentCollection<E> plus(PersistentCollection<? extends E> persistentCollection, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        boolean unused = C12669b0.m28179C(builder, gVar);
        return builder.build();
    }

    public static final ImmutableList<Character> toImmutableList(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return toPersistentList(charSequence);
    }

    public static final <T> ImmutableSet<T> toImmutableSet(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return toPersistentSet(gVar);
    }

    public static final <T> PersistentSet<T> toPersistentHashSet(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return plus(persistentHashSetOf(), gVar);
    }

    public static final <T> PersistentList<T> toPersistentList(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return plus(persistentListOf(), gVar);
    }

    public static final <T> PersistentSet<T> toPersistentSet(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        return plus(persistentSetOf(), gVar);
    }

    public static final <E> PersistentSet<E> intersect(PersistentCollection<? extends E> persistentCollection, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentCollection, "<this>");
        C12775o.m28639i(iterable, "elements");
        return intersect(toPersistentSet(persistentCollection), iterable);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E e) {
        C12775o.m28639i(persistentList, "<this>");
        return persistentList.remove(e);
    }

    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E e) {
        C12775o.m28639i(persistentList, "<this>");
        return persistentList.add(e);
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, C11906l<? extends K, ? extends V>[] lVarArr) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(lVarArr, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C12716r0.m28424o(builder, lVarArr);
        return builder.build();
    }

    public static final PersistentSet<Character> toImmutableSet(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return toPersistentSet(charSequence);
    }

    public static final PersistentSet<Character> toPersistentHashSet(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        Collection unused = C13760y.m31608T0(charSequence, builder);
        return builder.build();
    }

    public static final PersistentList<Character> toPersistentList(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        PersistentList.Builder builder = persistentListOf().builder();
        Collection unused = C13760y.m31608T0(charSequence, builder);
        return builder.build();
    }

    public static final PersistentSet<Character> toPersistentSet(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        PersistentSet.Builder builder = persistentSetOf().builder();
        Collection unused = C13760y.m31608T0(charSequence, builder);
        return builder.build();
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) (Collection) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28184H(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28178B(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> putAll(PersistentMap<? extends K, ? extends V> persistentMap, C13650g<? extends C11906l<? extends K, ? extends V>> gVar) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(gVar, "pairs");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        C12716r0.m28423n(builder, gVar);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E e) {
        C12775o.m28639i(persistentSet, "<this>");
        return persistentSet.remove(e);
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E e) {
        C12775o.m28639i(persistentSet, "<this>");
        return persistentSet.add(e);
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) (Collection) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28184H(builder, iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, Iterable<? extends E> iterable) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(iterable, "elements");
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28178B(builder, iterable);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K k) {
        C12775o.m28639i(persistentMap, "<this>");
        return persistentMap.remove(k);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, C11906l<? extends K, ? extends V> lVar) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(lVar, "pair");
        return persistentMap.put(lVar.mo49111c(), lVar.mo49112d());
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, E[] eArr) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28186J(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(iterable, "pairs");
        return putAll(persistentMap, iterable);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, C11906l<? extends K, ? extends V>[] lVarArr) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(lVarArr, "pairs");
        return putAll(persistentMap, lVarArr);
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, C13650g<? extends C11906l<? extends K, ? extends V>> gVar) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(gVar, "pairs");
        return putAll(persistentMap, gVar);
    }

    public static final <E> PersistentList<E> minus(PersistentList<? extends E> persistentList, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28185I(builder, gVar);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> plus(PersistentMap<? extends K, ? extends V> persistentMap, Map<? extends K, ? extends V> map) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(map, "map");
        return putAll(persistentMap, map);
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, E[] eArr) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28180D(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28186J(builder, eArr);
        return builder.build();
    }

    public static final <E> PersistentList<E> plus(PersistentList<? extends E> persistentList, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentList, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        boolean unused = C12669b0.m28179C(builder, gVar);
        return builder.build();
    }

    public static final <E> PersistentSet<E> minus(PersistentSet<? extends E> persistentSet, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28185I(builder, gVar);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, E[] eArr) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(eArr, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28180D(builder, eArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, Iterable<? extends K> iterable) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(iterable, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        boolean unused = C12669b0.m28184H(builder.keySet(), iterable);
        return builder.build();
    }

    public static final <E> PersistentSet<E> plus(PersistentSet<? extends E> persistentSet, C13650g<? extends E> gVar) {
        C12775o.m28639i(persistentSet, "<this>");
        C12775o.m28639i(gVar, "elements");
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        boolean unused = C12669b0.m28179C(builder, gVar);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, K[] kArr) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(kArr, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        boolean unused = C12669b0.m28186J(builder.keySet(), kArr);
        return builder.build();
    }

    public static final <K, V> PersistentMap<K, V> minus(PersistentMap<? extends K, ? extends V> persistentMap, C13650g<? extends K> gVar) {
        C12775o.m28639i(persistentMap, "<this>");
        C12775o.m28639i(gVar, "keys");
        PersistentMap.Builder<? extends K, ? extends V> builder = persistentMap.builder();
        boolean unused = C12669b0.m28185I(builder.keySet(), gVar);
        return builder.build();
    }
}
