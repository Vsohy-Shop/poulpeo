package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n127#2,3:981\n130#2:988\n131#2,2:1000\n133#2:1003\n33#3,4:984\n151#3,3:989\n33#3,4:992\n154#3,2:996\n38#3:998\n156#3:999\n38#3:1002\n33#3,6:1005\n33#3,6:1011\n1#4:1004\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:981,3\n371#1:988\n371#1:1000,2\n371#1:1003\n371#1:984,4\n373#1:989,3\n373#1:992,4\n373#1:996,2\n373#1:998\n373#1:999\n371#1:1002\n395#1:1005,6\n413#1:1011,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraph */
/* compiled from: MultiParagraph.kt */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, z);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i, z);
    }

    /* renamed from: paint-LG529CI$default  reason: not valid java name */
    public static /* synthetic */ void m37857paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        long j2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i3;
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m35707getUnspecified0d7_KjU();
        } else {
            j2 = j;
        }
        DrawStyle drawStyle2 = null;
        if ((i2 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 16) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 32) != 0) {
            i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        multiParagraph.m37862paintLG529CI(canvas, j2, shadow2, textDecoration2, drawStyle2, i3);
    }

    /* renamed from: paint-RPmYEkk$default  reason: not valid java name */
    public static /* synthetic */ void m37858paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if ((i & 2) != 0) {
            j = Color.Companion.m35707getUnspecified0d7_KjU();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        multiParagraph.m37863paintRPmYEkk(canvas, j2, shadow2, textDecoration2);
    }

    /* renamed from: paint-hn5TExg$default  reason: not valid java name */
    public static /* synthetic */ void m37859painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        float f2;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i2 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i2 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i2 & 64) != 0) {
            i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        multiParagraph.m37864painthn5TExg(canvas, brush, f2, shadow2, textDecoration2, drawStyle2, i3);
    }

    private final void requireIndexInRange(int i) {
        boolean z = false;
        if (i >= 0 && i < getAnnotatedString().getText().length()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i) {
        boolean z = false;
        if (i >= 0 && i <= getAnnotatedString().getText().length()) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
        }
    }

    private final void requireLineIndexInRange(int i) {
        boolean z = false;
        if (i >= 0 && i < this.lineCount) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.lineCount + ')').toString());
        }
    }

    public final ResolvedTextDirection getBidiRunDirection(int i) {
        int i2;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i));
    }

    public final Rect getBoundingBox(int i) {
        requireIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i)));
    }

    public final Rect getCursorRect(int i) {
        int i2;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        int i2;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i), z);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) C12686e0.m28231j0(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i, boolean z) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i), z));
    }

    public final int getLineForOffset(int i) {
        int i2;
        if (i >= getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else if (i < 0) {
            i2 = 0;
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i)));
    }

    public final int getLineForVerticalPosition(float f) {
        int i;
        if (f <= 0.0f) {
            i = 0;
        } else if (f >= this.height) {
            i = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f)));
    }

    public final float getLineHeight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineLeft(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i));
    }

    public final int getLineStart(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i)));
    }

    public final float getLineWidth(int i) {
        requireLineIndexInRange(i);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m37860getOffsetForPositionk4lQ0M(long j) {
        int i;
        if (Offset.m35423getYimpl(j) <= 0.0f) {
            i = 0;
        } else if (Offset.m35423getYimpl(j) >= this.height) {
            i = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m35423getYimpl(j));
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i);
        if (paragraphInfo.getLength() == 0) {
            return Math.max(0, paragraphInfo.getStartIndex() - 1);
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().m37868getOffsetForPositionk4lQ0M(paragraphInfo.m37874toLocalMKHz9U(j)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i) {
        int i2;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 0 || i > i2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || i2 > getAnnotatedString().getText().length()) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        } else if (i == i2) {
            return AndroidPath_androidKt.Path();
        } else {
            Path Path = AndroidPath_androidKt.Path();
            int size = this.paragraphInfoList.size();
            for (int findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i); findParagraphByIndex < size; findParagraphByIndex++) {
                ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
                if (paragraphInfo.getStartIndex() >= i2) {
                    break;
                }
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    Path.m35948addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i), paragraphInfo.toLocalIndex(i2))), 0, 2, (Object) null);
                }
            }
            return Path;
        }
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m37861getWordBoundaryjx7JFs(int i) {
        int i2;
        requireIndexInRangeInclusiveEnd(i);
        if (i == getAnnotatedString().length()) {
            i2 = C12726w.m28526m(this.paragraphInfoList);
        } else {
            i2 = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2);
        return paragraphInfo.m37873toGlobalGEjPoXI(paragraphInfo.getParagraph().m37869getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i)));
    }

    public final boolean isLineEllipsized(int i) {
        requireLineIndexInRange(i);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i)).getParagraph().isLineEllipsized(i);
    }

    @ExperimentalTextApi
    /* renamed from: paint-LG529CI  reason: not valid java name */
    public final void m37862paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Canvas canvas2 = canvas;
        C12775o.m28639i(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().m37870paintLG529CI(canvas, j, shadow, textDecoration, drawStyle, i);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public final void m37863paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        C12775o.m28639i(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().m37871paintRPmYEkk(canvas, j, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @ExperimentalTextApi
    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public final void m37864painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(brush, "brush");
        AndroidMultiParagraphDrawKt.m38202drawMultiParagraph7AXcY_I(this, canvas, brush, f, shadow, textDecoration, drawStyle, i);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i, z);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z) {
        boolean z2;
        int i2;
        float height2;
        int i3;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        int i4 = 0;
        if (Constraints.m38414getMinWidthimpl(j) == 0 && Constraints.m38413getMinHeightimpl(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i5 = 0;
            float f = 0.0f;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z2 = false;
                    break;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i6);
                ParagraphIntrinsics intrinsics2 = paragraphIntrinsicInfo.getIntrinsics();
                int r15 = Constraints.m38412getMaxWidthimpl(j);
                if (Constraints.m38407getHasBoundedHeightimpl(j)) {
                    i2 = C13537l.m30877d(Constraints.m38411getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f), i4);
                } else {
                    i2 = Constraints.m38411getMaxHeightimpl(j);
                }
                Paragraph r16 = ParagraphKt.m37877Paragraph_EkL_Y(intrinsics2, ConstraintsKt.Constraints$default(0, r15, 0, i2, 5, (Object) null), this.maxLines - i5, z);
                height2 = f + r16.getHeight();
                int lineCount2 = i5 + r16.getLineCount();
                ParagraphInfo paragraphInfo = r7;
                i3 = lineCount2;
                ParagraphInfo paragraphInfo2 = new ParagraphInfo(r16, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, lineCount2, f, height2);
                arrayList.add(paragraphInfo);
                if (r16.getDidExceedMaxLines() || (i3 == this.maxLines && i6 != C12726w.m28526m(this.intrinsics.getInfoList$ui_text_release()))) {
                    i5 = i3;
                    f = height2;
                    z2 = true;
                } else {
                    i6++;
                    i5 = i3;
                    f = height2;
                    i4 = 0;
                }
            }
            i5 = i3;
            f = height2;
            z2 = true;
            this.height = f;
            this.lineCount = i5;
            this.didExceedMaxLines = z2;
            this.paragraphInfoList = arrayList;
            this.width = (float) Constraints.m38412getMaxWidthimpl(j);
            List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ParagraphInfo paragraphInfo3 = (ParagraphInfo) arrayList.get(i7);
                List<Rect> placeholderRects2 = paragraphInfo3.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects2.size());
                int size3 = placeholderRects2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Rect rect = placeholderRects2.get(i8);
                    arrayList3.add(rect != null ? paragraphInfo3.toGlobal(rect) : null);
                }
                boolean unused = C12669b0.m28178B(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i9 = 0; i9 < size4; i9++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = C12686e0.m28236o0(arrayList2, arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z, float f) {
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, (Object) null), i, z, (DefaultConstructorMarker) null);
        C12775o.m28639i(multiParagraphIntrinsics, "intrinsics");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) (i2 & 4) != 0 ? C12726w.m28524k() : list, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiParagraph(androidx.compose.p002ui.text.AnnotatedString r14, androidx.compose.p002ui.text.TextStyle r15, java.util.List<androidx.compose.p002ui.text.AnnotatedString.Range<androidx.compose.p002ui.text.Placeholder>> r16, int r17, boolean r18, float r19, androidx.compose.p002ui.unit.Density r20, androidx.compose.p002ui.text.font.Font.ResourceLoader r21) {
        /*
            r13 = this;
            java.lang.String r0 = "annotatedString"
            r2 = r14
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "style"
            r3 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "placeholders"
            r4 = r16
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "density"
            r5 = r20
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "resourceLoader"
            r1 = r21
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            androidx.compose.ui.text.MultiParagraphIntrinsics r0 = new androidx.compose.ui.text.MultiParagraphIntrinsics
            androidx.compose.ui.text.font.FontFamily$Resolver r6 = androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(r21)
            r1 = r0
            r1.<init>((androidx.compose.p002ui.text.AnnotatedString) r2, (androidx.compose.p002ui.text.TextStyle) r3, (java.util.List<androidx.compose.p002ui.text.AnnotatedString.Range<androidx.compose.p002ui.text.Placeholder>>) r4, (androidx.compose.p002ui.unit.Density) r5, (androidx.compose.p002ui.text.font.FontFamily.Resolver) r6)
            r7 = 0
            int r8 = androidx.compose.p002ui.text.ParagraphKt.ceilToInt(r19)
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            long r3 = androidx.compose.p002ui.unit.ConstraintsKt.Constraints$default(r7, r8, r9, r10, r11, r12)
            r7 = 0
            r1 = r13
            r2 = r0
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, java.util.List, int, boolean, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.Font$ResourceLoader):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MultiParagraph(androidx.compose.p002ui.text.AnnotatedString r12, androidx.compose.p002ui.text.TextStyle r13, float r14, androidx.compose.p002ui.unit.Density r15, androidx.compose.p002ui.text.font.FontFamily.Resolver r16, java.util.List r17, int r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.C12726w.m28524k()
            r8 = r1
            goto L_0x000e
        L_0x000c:
            r8 = r17
        L_0x000e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0017
            r1 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1
            goto L_0x0019
        L_0x0017:
            r9 = r18
        L_0x0019:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
            r0 = 0
            r10 = r0
            goto L_0x0022
        L_0x0020:
            r10 = r19
        L_0x0022:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>((androidx.compose.p002ui.text.AnnotatedString) r3, (androidx.compose.p002ui.text.TextStyle) r4, (float) r5, (androidx.compose.p002ui.unit.Density) r6, (androidx.compose.p002ui.text.font.FontFamily.Resolver) r7, (java.util.List<androidx.compose.p002ui.text.AnnotatedString.Range<androidx.compose.p002ui.text.Placeholder>>) r8, (int) r9, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, (Object) null), i, z, (DefaultConstructorMarker) null);
        C12775o.m28639i(annotatedString, "annotatedString");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        C12775o.m28639i(list, "placeholders");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MultiParagraph(androidx.compose.p002ui.text.AnnotatedString r14, androidx.compose.p002ui.text.TextStyle r15, long r16, androidx.compose.p002ui.unit.Density r18, androidx.compose.p002ui.text.font.FontFamily.Resolver r19, java.util.List r20, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = kotlin.collections.C12726w.m28524k()
            r9 = r1
            goto L_0x000e
        L_0x000c:
            r9 = r20
        L_0x000e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0017
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L_0x0019
        L_0x0017:
            r10 = r21
        L_0x0019:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0020
            r0 = 0
            r11 = r0
            goto L_0x0022
        L_0x0020:
            r11 = r22
        L_0x0022:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, long, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, java.util.List, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i, z, (DefaultConstructorMarker) null);
    }
}
