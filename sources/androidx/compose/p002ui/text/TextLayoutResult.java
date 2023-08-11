package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.TextLayoutResult */
/* compiled from: TextLayoutResult.kt */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph2, j);
    }

    /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m37945copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m37946copyO0kMr_c(textLayoutInput, j);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    /* renamed from: copy-O0kMr_c  reason: not valid java name */
    public final TextLayoutResult m37946copyO0kMr_c(TextLayoutInput textLayoutInput, long j) {
        C12775o.m28639i(textLayoutInput, "layoutInput");
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        if (!C12775o.m28634d(this.layoutInput, textLayoutResult.layoutInput) || !C12775o.m28634d(this.multiParagraph, textLayoutResult.multiParagraph) || !IntSize.m38626equalsimpl0(this.size, textLayoutResult.size)) {
            return false;
        }
        if (this.firstBaseline == textLayoutResult.firstBaseline) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.lastBaseline == textLayoutResult.lastBaseline) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && C12775o.m28634d(this.placeholderRects, textLayoutResult.placeholderRects)) {
            return true;
        }
        return false;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        return this.multiParagraph.getBidiRunDirection(i);
    }

    public final Rect getBoundingBox(int i) {
        return this.multiParagraph.getBoundingBox(i);
    }

    public final Rect getCursorRect(int i) {
        return this.multiParagraph.getCursorRect(i);
    }

    public final boolean getDidOverflowHeight() {
        if (this.multiParagraph.getDidExceedMaxLines() || ((float) IntSize.m38627getHeightimpl(this.size)) < this.multiParagraph.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean getDidOverflowWidth() {
        if (((float) IntSize.m38628getWidthimpl(this.size)) < this.multiParagraph.getWidth()) {
            return true;
        }
        return false;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        if (getDidOverflowWidth() || getDidOverflowHeight()) {
            return true;
        }
        return false;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int i) {
        return this.multiParagraph.getLineBottom(i);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i, boolean z) {
        return this.multiParagraph.getLineEnd(i, z);
    }

    public final int getLineForOffset(int i) {
        return this.multiParagraph.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.multiParagraph.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int i) {
        return this.multiParagraph.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.multiParagraph.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.multiParagraph.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.multiParagraph.getLineTop(i);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m37947getOffsetForPositionk4lQ0M(long j) {
        return this.multiParagraph.m37860getOffsetForPositionk4lQ0M(j);
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        return this.multiParagraph.getParagraphDirection(i);
    }

    public final Path getPathForRange(int i, int i2) {
        return this.multiParagraph.getPathForRange(i, i2);
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m37948getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m37949getWordBoundaryjx7JFs(int i) {
        return this.multiParagraph.m37861getWordBoundaryjx7JFs(i);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m38629hashCodeimpl(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i) {
        return this.multiParagraph.isLineEllipsized(i);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + IntSize.m38631toStringimpl(this.size) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph2, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph2;
        this.size = j;
        this.firstBaseline = multiParagraph2.getFirstBaseline();
        this.lastBaseline = multiParagraph2.getLastBaseline();
        this.placeholderRects = multiParagraph2.getPlaceholderRects();
    }
}
