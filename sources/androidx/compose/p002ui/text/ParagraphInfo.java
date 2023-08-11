package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.Path;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.ParagraphInfo */
/* compiled from: MultiParagraph.kt */
public final class ParagraphInfo {
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(Paragraph paragraph2, int i, int i2, int i3, int i4, float f, float f2) {
        C12775o.m28639i(paragraph2, "paragraph");
        this.paragraph = paragraph2;
        this.startIndex = i;
        this.endIndex = i2;
        this.startLineIndex = i3;
        this.endLineIndex = i4;
        this.top = f;
        this.bottom = f2;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph2, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            paragraph2 = paragraphInfo.paragraph;
        }
        if ((i5 & 2) != 0) {
            i = paragraphInfo.startIndex;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = paragraphInfo.endIndex;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = paragraphInfo.startLineIndex;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = paragraphInfo.endLineIndex;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = paragraphInfo.top;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph2, i6, i7, i8, i9, f3, f2);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph2, int i, int i2, int i3, int i4, float f, float f2) {
        C12775o.m28639i(paragraph2, "paragraph");
        return new ParagraphInfo(paragraph2, i, i2, i3, i4, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        if (C12775o.m28634d(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setEndLineIndex(int i) {
        this.endLineIndex = i;
    }

    public final void setStartLineIndex(int i) {
        this.startLineIndex = i;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public final Rect toGlobal(Rect rect) {
        C12775o.m28639i(rect, "<this>");
        return rect.m35459translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* renamed from: toGlobal-GEjPoXI  reason: not valid java name */
    public final long m37873toGlobalGEjPoXI(long j) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m37975getStartimpl(j)), toGlobalIndex(TextRange.m37970getEndimpl(j)));
    }

    public final int toGlobalIndex(int i) {
        return i + this.startIndex;
    }

    public final int toGlobalLineIndex(int i) {
        return i + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.top;
    }

    /* renamed from: toLocal-MK-Hz9U  reason: not valid java name */
    public final long m37874toLocalMKHz9U(long j) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j) - this.top);
    }

    public final int toLocalIndex(int i) {
        return C13537l.m30886m(i, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i) {
        return i - this.startLineIndex;
    }

    public final float toLocalYPosition(float f) {
        return f - this.top;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public final Path toGlobal(Path path) {
        C12775o.m28639i(path, "<this>");
        path.m35953translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParagraphInfo(Paragraph paragraph2, int i, int i2, int i3, int i4, float f, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(paragraph2, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
