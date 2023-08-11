package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n125#2:256\n152#2,3:257\n37#3,2:260\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n250#1:256\n250#1:257,3\n251#1:260,2\n*E\n"})
/* compiled from: CompositionLocal.kt */
public final class CompositionLocalKt {
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void CompositionLocalProvider(ProvidedValue<?>[] providedValueArr, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        C12775o.m28639i(providedValueArr, "values");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        startRestartGroup.startProviders(providedValueArr);
        oVar.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$1(providedValueArr, oVar, i));
        }
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, C13074a<? extends T> aVar) {
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        C12775o.m28639i(aVar, "defaultFactory");
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, aVar);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, C13074a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "defaultFactory");
        return new StaticProvidableCompositionLocal(aVar);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        C12775o.m28639i(compositionLocalContext, "context");
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) compositionLocalContext) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(oVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry next : compositionLocals$runtime_release.entrySet()) {
                Object key = next.getKey();
                C12775o.m28637g(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((ProvidableCompositionLocal) key).provides(((State) next.getValue()).getValue()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) (ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), oVar, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$3(compositionLocalContext, oVar, i));
        }
    }
}
