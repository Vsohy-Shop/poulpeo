package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
/* renamed from: androidx.compose.ui.text.CacheTextLayoutInput */
/* compiled from: TextMeasurer.kt */
public final class CacheTextLayoutInput {
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput2) {
        C12775o.m28639i(textLayoutInput2, "textLayoutInput");
        this.textLayoutInput = textLayoutInput2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput2 = this.textLayoutInput;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (C12775o.m28634d(textLayoutInput2.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput2.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && C12775o.m28634d(textLayoutInput2.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput2.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput2.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m38390equalsimpl0(textLayoutInput2.m37944getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m37944getOverflowgIe3tQ8()) && C12775o.m28634d(textLayoutInput2.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput2.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput2.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m38412getMaxWidthimpl(textLayoutInput2.m37943getConstraintsmsEJaDk()) == Constraints.m38412getMaxWidthimpl(cacheTextLayoutInput.textLayoutInput.m37943getConstraintsmsEJaDk()) && Constraints.m38411getMaxHeightimpl(textLayoutInput2.m37943getConstraintsmsEJaDk()) == Constraints.m38411getMaxHeightimpl(cacheTextLayoutInput.textLayoutInput.m37943getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput2 = this.textLayoutInput;
        return (((((((((((((((((((textLayoutInput2.getText().hashCode() * 31) + textLayoutInput2.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput2.getPlaceholders().hashCode()) * 31) + textLayoutInput2.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput2.getSoftWrap())) * 31) + TextOverflow.m38391hashCodeimpl(textLayoutInput2.m37944getOverflowgIe3tQ8())) * 31) + textLayoutInput2.getDensity().hashCode()) * 31) + textLayoutInput2.getLayoutDirection().hashCode()) * 31) + textLayoutInput2.getFontFamilyResolver().hashCode()) * 31) + Integer.hashCode(Constraints.m38412getMaxWidthimpl(textLayoutInput2.m37943getConstraintsmsEJaDk()))) * 31) + Integer.hashCode(Constraints.m38411getMaxHeightimpl(textLayoutInput2.m37943getConstraintsmsEJaDk()));
    }
}
