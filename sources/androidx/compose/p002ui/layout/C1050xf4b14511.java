package androidx.compose.p002ui.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt$SubcomposeLayout$5$1\n*L\n1#1,484:1\n134#2,2:485\n*E\n"})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C1050xf4b14511 implements DisposableEffectResult {
    final /* synthetic */ State $stateHolder$inlined;

    public C1050xf4b14511(State state) {
        this.$stateHolder$inlined = state;
    }

    public void dispose() {
        ((SubcomposeLayoutState) this.$stateHolder$inlined.getValue()).disposeCurrentNodes$ui_release();
    }
}
