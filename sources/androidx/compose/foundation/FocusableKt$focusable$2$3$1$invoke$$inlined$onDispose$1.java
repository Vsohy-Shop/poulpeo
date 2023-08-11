package androidx.compose.foundation;

import androidx.compose.p002ui.layout.PinnableContainer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n1#1,484:1\n124#2,3:485\n*E\n"})
/* compiled from: Effects.kt */
public final class FocusableKt$focusable$2$3$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ MutableState $pinHandle$delegate$inlined;

    public FocusableKt$focusable$2$3$1$invoke$$inlined$onDispose$1(MutableState mutableState) {
        this.$pinHandle$delegate$inlined = mutableState;
    }

    public void dispose() {
        PinnableContainer.PinnedHandle access$invoke$lambda$9 = FocusableKt$focusable$2.invoke$lambda$9(this.$pinHandle$delegate$inlined);
        if (access$invoke$lambda$9 != null) {
            access$invoke$lambda$9.release();
        }
        FocusableKt$focusable$2.invoke$lambda$10(this.$pinHandle$delegate$inlined, (PinnableContainer.PinnedHandle) null);
    }
}
