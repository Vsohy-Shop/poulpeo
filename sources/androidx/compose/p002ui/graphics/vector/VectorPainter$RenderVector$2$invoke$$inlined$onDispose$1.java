package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n1#1,484:1\n240#2,2:485\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    final /* synthetic */ Composition $composition$inlined;

    public VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1(Composition composition) {
        this.$composition$inlined = composition;
    }

    public void dispose() {
        this.$composition$inlined.dispose();
    }
}
