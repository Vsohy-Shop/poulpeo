package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1 */
/* compiled from: VectorPainter.kt */
final class VectorPainter$composeVector$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ C13090q<Float, Float, Composer, Integer, C11921v> $composable;
    final /* synthetic */ VectorPainter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$composeVector$1(C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, VectorPainter vectorPainter) {
        super(2);
        this.$composable = qVar;
        this.this$0 = vectorPainter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1916507005, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
            }
            this.$composable.invoke(Float.valueOf(this.this$0.vector.getViewportWidth()), Float.valueOf(this.this$0.vector.getViewportHeight()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
