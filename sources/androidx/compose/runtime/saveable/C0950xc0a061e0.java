package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n*L\n1#1,484:1\n108#2,2:485\n*E\n"})
/* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0950xc0a061e0 implements DisposableEffectResult {
    final /* synthetic */ SaveableStateRegistry.Entry $entry$inlined;

    public C0950xc0a061e0(SaveableStateRegistry.Entry entry) {
        this.$entry$inlined = entry;
    }

    public void dispose() {
        this.$entry$inlined.unregister();
    }
}
