package androidx.compose.foundation.text;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.text.input.TransformedText;
import androidx.compose.p002ui.unit.Constraints;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: TextFieldScroll.kt */
final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;
    private final TextFieldScrollerPosition scrollerPosition;
    private final C13074a<TextLayoutResultProxy> textLayoutResultProvider;
    private final TransformedText transformedText;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText2, C13074a<TextLayoutResultProxy> aVar) {
        C12775o.m28639i(textFieldScrollerPosition, "scrollerPosition");
        C12775o.m28639i(transformedText2, "transformedText");
        C12775o.m28639i(aVar, "textLayoutResultProvider");
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i;
        this.transformedText = transformedText2;
        this.textLayoutResultProvider = aVar;
    }

    public static /* synthetic */ VerticalScrollLayoutModifier copy$default(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText2, C13074a<TextLayoutResultProxy> aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i2 & 2) != 0) {
            i = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i2 & 4) != 0) {
            transformedText2 = verticalScrollLayoutModifier.transformedText;
        }
        if ((i2 & 8) != 0) {
            aVar = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.copy(textFieldScrollerPosition, i, transformedText2, aVar);
    }

    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    public final TransformedText component3() {
        return this.transformedText;
    }

    public final C13074a<TextLayoutResultProxy> component4() {
        return this.textLayoutResultProvider;
    }

    public final VerticalScrollLayoutModifier copy(TextFieldScrollerPosition textFieldScrollerPosition, int i, TransformedText transformedText2, C13074a<TextLayoutResultProxy> aVar) {
        C12775o.m28639i(textFieldScrollerPosition, "scrollerPosition");
        C12775o.m28639i(transformedText2, "transformedText");
        C12775o.m28639i(aVar, "textLayoutResultProvider");
        return new VerticalScrollLayoutModifier(textFieldScrollerPosition, i, transformedText2, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        if (C12775o.m28634d(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && C12775o.m28634d(this.transformedText, verticalScrollLayoutModifier.transformedText) && C12775o.m28634d(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider)) {
            return true;
        }
        return false;
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final C13074a<TextLayoutResultProxy> getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33748measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r11 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(r11.getHeight(), Constraints.m38411getMaxHeightimpl(j));
        return MeasureScope.layout$default(measureScope, r11.getWidth(), min, (Map) null, new VerticalScrollLayoutModifier$measure$1(measureScope, this, r11, min), 4, (Object) null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
