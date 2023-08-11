package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.C12775o;

/* compiled from: RememberSaveable.kt */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1 implements SaverScope {
    final /* synthetic */ SaveableStateRegistry $registry;

    RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1(SaveableStateRegistry saveableStateRegistry) {
        this.$registry = saveableStateRegistry;
    }

    public final boolean canBeSaved(Object obj) {
        C12775o.m28639i(obj, "it");
        return this.$registry.canBeSaved(obj);
    }
}
