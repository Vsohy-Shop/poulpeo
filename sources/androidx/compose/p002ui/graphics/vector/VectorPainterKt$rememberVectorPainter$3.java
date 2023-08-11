package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Map;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3 */
/* compiled from: VectorPainter.kt */
final class VectorPainterKt$rememberVectorPainter$3 extends C12777p implements C13090q<Float, Float, Composer, Integer, C11921v> {
    final /* synthetic */ ImageVector $image;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainterKt$rememberVectorPainter$3(ImageVector imageVector) {
        super(4);
        this.$image = imageVector;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public final void invoke(float f, float f2, Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1873274766, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
            }
            VectorPainterKt.RenderVectorGroup(this.$image.getRoot(), (Map<String, ? extends VectorConfig>) null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
