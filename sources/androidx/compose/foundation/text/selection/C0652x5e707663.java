package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n1#1,484:1\n140#2,2:485\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0652x5e707663 implements DisposableEffectResult {
    final /* synthetic */ SelectionManager $manager$inlined;

    public C0652x5e707663(SelectionManager selectionManager) {
        this.$manager$inlined = selectionManager;
    }

    public void dispose() {
        this.$manager$inlined.hideSelectionToolbar$foundation_release();
    }
}
