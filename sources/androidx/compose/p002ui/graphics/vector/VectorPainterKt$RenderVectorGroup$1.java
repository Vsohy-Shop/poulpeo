package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 */
/* compiled from: VectorPainter.kt */
final class VectorPainterKt$RenderVectorGroup$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ Map<String, VectorConfig> $configs;
    final /* synthetic */ VectorNode $vectorNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainterKt$RenderVectorGroup$1(VectorNode vectorNode, Map<String, ? extends VectorConfig> map) {
        super(2);
        this.$vectorNode = vectorNode;
        this.$configs = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
            }
            VectorPainterKt.RenderVectorGroup((VectorGroup) this.$vectorNode, this.$configs, composer, 64, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
