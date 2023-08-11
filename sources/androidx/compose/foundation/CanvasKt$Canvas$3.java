package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Canvas.kt */
final class CanvasKt$Canvas$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<DrawScope, C11921v> $onDraw;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CanvasKt$Canvas$3(Modifier modifier, String str, Function1<? super DrawScope, C11921v> function1, int i) {
        super(2);
        this.$modifier = modifier;
        this.$contentDescription = str;
        this.$onDraw = function1;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CanvasKt.Canvas(this.$modifier, this.$contentDescription, this.$onDraw, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
