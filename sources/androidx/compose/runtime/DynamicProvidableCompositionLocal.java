package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n25#2:256\n1114#3,6:257\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/DynamicProvidableCompositionLocal\n*L\n126#1:256\n126#1:257,6\n*E\n"})
/* compiled from: CompositionLocal.kt */
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    /* access modifiers changed from: private */
    public final SnapshotMutationPolicy<T> policy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy<T> snapshotMutationPolicy, C13074a<? extends T> aVar) {
        super(aVar);
        C12775o.m28639i(snapshotMutationPolicy, "policy");
        C12775o.m28639i(aVar, "defaultFactory");
        this.policy = snapshotMutationPolicy;
    }

    @Composable
    public State<T> provided$runtime_release(T t, Composer composer, int i) {
        composer.startReplaceableGroup(-84026900);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-84026900, i, -1, "androidx.compose.runtime.DynamicProvidableCompositionLocal.provided (CompositionLocal.kt:125)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateOf(t, this.policy);
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
}
