package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import p314bg.C10962f;
import p314bg.C10972h0;
import p336ef.C11906l;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;

public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(C10962f<? extends T> fVar, R r, C12079g gVar, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(fVar, r, gVar, composer, i, i2);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, C13074a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, KProperty<?> kProperty) {
        return SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(Function1<? super State<?>, C11921v> function1, Function1<? super State<?>, C11921v> function12, C13074a<? extends R> aVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(function1, function12, aVar);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, oVar, composer, i);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, KProperty<?> kProperty, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, kProperty, t);
    }

    public static final <T> C10962f<T> snapshotFlow(C13074a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(aVar);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    public static final <T> State<T> collectAsState(C10972h0<? extends T> h0Var, C12079g gVar, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(h0Var, gVar, composer, i, i2);
    }

    public static final <T> State<T> derivedStateOf(C13074a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(aVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(lVarArr);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, oVar, composer, i);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, oVar, composer, i);
    }

    @Composable
    public static final <T> State<T> produceState(T t, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, oVar, composer, i);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object[] objArr, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, objArr, oVar, composer, i);
    }
}
