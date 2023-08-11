package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: CompositionLocal.kt */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StaticProvidableCompositionLocal(C13074a<? extends T> aVar) {
        super(aVar);
        C12775o.m28639i(aVar, "defaultFactory");
    }

    @Composable
    public State<T> provided$runtime_release(T t, Composer composer, int i) {
        composer.startReplaceableGroup(-1121811719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1121811719, i, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        StaticValueHolder staticValueHolder = new StaticValueHolder(t);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return staticValueHolder;
    }
}
