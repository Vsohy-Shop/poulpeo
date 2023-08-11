package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3 */
/* compiled from: VectorPainter.kt */
final class VectorPainter$RenderVector$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13090q<Float, Float, Composer, Integer, C11921v> $content;
    final /* synthetic */ String $name;
    final /* synthetic */ VectorPainter $tmp0_rcvr;
    final /* synthetic */ float $viewportHeight;
    final /* synthetic */ float $viewportWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f, float f2, C13090q<? super Float, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, int i) {
        super(2);
        this.$tmp0_rcvr = vectorPainter;
        this.$name = str;
        this.$viewportWidth = f;
        this.$viewportHeight = f2;
        this.$content = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.RenderVector$ui_release(this.$name, this.$viewportWidth, this.$viewportHeight, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
