package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextField.kt */
final class TextFieldKt$drawIndicatorLine$1 extends C12777p implements Function1<ContentDrawScope, C11921v> {
    final /* synthetic */ BorderStroke $indicatorBorder;
    final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$drawIndicatorLine$1(float f, BorderStroke borderStroke) {
        super(1);
        this.$strokeWidthDp = f;
        this.$indicatorBorder = borderStroke;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "$this$drawWithContent");
        contentDrawScope.drawContent();
        if (!C1232Dp.m38473equalsimpl0(this.$strokeWidthDp, C1232Dp.Companion.m38486getHairlineD9Ej5fM())) {
            float density = this.$strokeWidthDp * contentDrawScope.getDensity();
            float r1 = Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc()) - (density / ((float) 2));
            DrawScope.m36241drawLine1RTmtNc$default(contentDrawScope, this.$indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, r1), OffsetKt.Offset(Size.m35491getWidthimpl(contentDrawScope.m36274getSizeNHjbRc()), r1), density, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
        }
    }
}
