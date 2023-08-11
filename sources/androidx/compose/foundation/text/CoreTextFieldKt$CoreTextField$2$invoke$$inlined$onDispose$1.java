package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$2\n*L\n1#1,484:1\n327#2,4:485\n*E\n"})
/* compiled from: Effects.kt */
public final class CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ TextFieldState $state$inlined;

    public CoreTextFieldKt$CoreTextField$2$invoke$$inlined$onDispose$1(TextFieldState textFieldState) {
        this.$state$inlined = textFieldState;
    }

    public void dispose() {
        if (this.$state$inlined.getHasFocus()) {
            CoreTextFieldKt.onBlur(this.$state$inlined);
        }
    }
}
