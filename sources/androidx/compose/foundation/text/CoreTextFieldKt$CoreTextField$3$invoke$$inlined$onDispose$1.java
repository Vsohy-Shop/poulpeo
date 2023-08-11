package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n1#1,484:1\n514#2:485\n*E\n"})
/* compiled from: Effects.kt */
public final class CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ TextFieldSelectionManager $manager$inlined;

    public CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1(TextFieldSelectionManager textFieldSelectionManager) {
        this.$manager$inlined = textFieldSelectionManager;
    }

    public void dispose() {
        this.$manager$inlined.hideSelectionToolbar$foundation_release();
    }
}
