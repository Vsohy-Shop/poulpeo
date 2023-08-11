package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.TextLayoutInput;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextLayoutHelper.kt */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M  reason: not valid java name */
    public static final boolean m33736canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        C12775o.m28639i(textLayoutResult, "$this$canReuse");
        C12775o.m28639i(annotatedString, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !C12775o.m28634d(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !C12775o.m28634d(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !TextOverflow.m38390equalsimpl0(layoutInput.m37944getOverflowgIe3tQ8(), i2) || !C12775o.m28634d(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !C12775o.m28634d(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m38414getMinWidthimpl(j) != Constraints.m38414getMinWidthimpl(layoutInput.m37943getConstraintsmsEJaDk())) {
            return false;
        }
        if (!z && !TextOverflow.m38390equalsimpl0(i2, TextOverflow.Companion.m38398getEllipsisgIe3tQ8())) {
            return true;
        }
        if (Constraints.m38412getMaxWidthimpl(j) == Constraints.m38412getMaxWidthimpl(layoutInput.m37943getConstraintsmsEJaDk()) && Constraints.m38411getMaxHeightimpl(j) == Constraints.m38411getMaxHeightimpl(layoutInput.m37943getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }
}
