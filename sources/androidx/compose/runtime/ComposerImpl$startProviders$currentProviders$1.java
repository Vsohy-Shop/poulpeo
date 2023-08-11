package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Composer.kt */
final class ComposerImpl$startProviders$currentProviders$1 extends C12777p implements C13088o<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>> {
    final /* synthetic */ PersistentMap<CompositionLocal<Object>, State<Object>> $parentScope;
    final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$startProviders$currentProviders$1(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        super(2);
        this.$values = providedValueArr;
        this.$parentScope = persistentMap;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Composer) obj, ((Number) obj2).intValue());
    }

    @Composable
    public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(Composer composer, int i) {
        composer.startReplaceableGroup(935231726);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(935231726, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)");
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> access$compositionLocalMapOf = ComposerKt.compositionLocalMapOf(this.$values, this.$parentScope, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return access$compositionLocalMapOf;
    }
}
