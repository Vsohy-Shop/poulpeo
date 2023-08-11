package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import p336ef.C11906l;

@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,298:1\n1#2:299\n25#3:300\n1114#4,6:301\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n295#1:300\n295#1:301,6\n*E\n"})
/* compiled from: SnapshotState.kt */
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(State<? extends T> state, Object obj, KProperty<?> kProperty) {
        C12775o.m28639i(state, "<this>");
        C12775o.m28639i(kProperty, "property");
        return state.getValue();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        return ActualAndroid_androidKt.createSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        composer.startReplaceableGroup(-1058319986);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, KProperty<?> kProperty, T t) {
        C12775o.m28639i(mutableState, "<this>");
        C12775o.m28639i(kProperty, "property");
        mutableState.setValue(t);
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        C12775o.m28639i(collection, "<this>");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends C11906l<? extends K, ? extends V>> iterable) {
        C12775o.m28639i(iterable, "<this>");
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(C12716r0.m28425p(iterable));
        return snapshotStateMap;
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        C12775o.m28639i(tArr, "elements");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(C12710p.m28405g0(tArr));
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(C11906l<? extends K, ? extends V>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(C12716r0.m28428s(lVarArr));
        return snapshotStateMap;
    }
}
