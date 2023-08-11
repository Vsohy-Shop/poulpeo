package androidx.compose.p002ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0127Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p002ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.p002ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;
import p336ef.C11906l;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1#2:1036\n*E\n"})
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.TextLayout */
/* compiled from: TextLayout.kt */
public final class TextLayout {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final Lazy layoutHelper$delegate;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final int topPadding;

    /* renamed from: androidx.compose.ui.text.android.TextLayout$Companion */
    /* compiled from: TextLayout.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public final StaticLayout constructStaticLayout(CharSequence charSequence, int i, TextPaint textPaint, int i2, int i3, int i4, int i5) {
            TextPaint textPaint2 = textPaint;
            int i6 = i3;
            int i7 = i4;
            int i8 = i5;
            C12775o.m28639i(charSequence, "charSequence");
            C12775o.m28639i(textPaint, "textPaint");
            return StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, charSequence, 0, 0, textPaint2, i, (TextDirectionHeuristic) null, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, false, false, i7, i6, i8, i2, (int[]) null, (int[]) null, 1605606, (Object) null);
        }
    }

    /* JADX INFO: finally extract failed */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, @C0127Px float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics2) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z3;
        boolean z4;
        Layout layout2;
        boolean z5;
        CharSequence charSequence2 = charSequence;
        float f4 = f;
        int i9 = i3;
        LayoutIntrinsics layoutIntrinsics3 = layoutIntrinsics2;
        C12775o.m28639i(charSequence2, "charSequence");
        C12775o.m28639i(textPaint, "textPaint");
        C12775o.m28639i(layoutIntrinsics3, "layoutIntrinsics");
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics3;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z6 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics2.getBoringMetrics();
            TextDirectionHeuristic textDirectionHeuristic3 = textDirectionHeuristic2;
            double d = (double) f4;
            Layout.Alignment alignment2 = alignment;
            int ceil = (int) ((float) Math.ceil(d));
            if (boringMetrics == null || layoutIntrinsics2.getMaxIntrinsicWidth() > f4 || z6) {
                int i10 = ceil;
                z4 = true;
                TextDirectionHeuristic textDirectionHeuristic4 = textDirectionHeuristic3;
                this.isBoringLayout = false;
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic4;
                layout2 = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, i10, textDirectionHeuristic4, alignment2, i3, truncateAt, (int) ((float) Math.ceil(d)), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z4 = true;
                layout2 = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment2, z, z2, truncateAt, ceil);
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic3;
            }
            this.layout = layout2;
            Trace.endSection();
            int i11 = i3;
            int min = Math.min(layout2.getLineCount(), i11);
            this.lineCount = min;
            if (min >= i11 && (layout2.getEllipsisCount(min - 1) > 0 || layout2.getLineEnd(min - 1) != charSequence.length())) {
                z5 = z4;
            } else {
                z5 = z3;
            }
            this.didExceedMaxLines = z5;
            C11906l access$getVerticalPaddings = TextLayoutKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] access$getLineHeightSpans = TextLayoutKt.getLineHeightSpans(this);
            this.lineHeightSpans = access$getLineHeightSpans;
            C11906l access$getLineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this, access$getLineHeightSpans);
            this.topPadding = Math.max(((Number) access$getVerticalPaddings.mo49111c()).intValue(), ((Number) access$getLineHeightPaddings.mo49111c()).intValue());
            this.bottomPadding = Math.max(((Number) access$getVerticalPaddings.mo49112d()).intValue(), ((Number) access$getLineHeightPaddings.mo49112d()).intValue());
            C11906l access$getLastLineMetrics = TextLayoutKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, access$getLineHeightSpans);
            this.lastLineFontMetrics = (Paint.FontMetricsInt) access$getLastLineMetrics.mo49111c();
            this.lastLineExtra = ((Number) access$getLastLineMetrics.mo49112d()).intValue();
            this.leftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding$default(layout2, min - 1, (Paint) null, 2, (Object) null);
            this.rightPadding = IndentationFixSpanKt.getEllipsizedRightPadding$default(layout2, min - 1, (Paint) null, 2, (Object) null);
            this.layoutHelper$delegate = C11901h.m25689a(C11904j.NONE, new TextLayout$layoutHelper$2(this));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float getHorizontalPadding(int i) {
        if (i == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper$delegate.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    public final void fillBoundingBoxes(int i, int i2, float[] fArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float f;
        float f2;
        int i5 = i;
        int i6 = i2;
        float[] fArr2 = fArr;
        C12775o.m28639i(fArr2, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        int length = getText().length();
        int i7 = 1;
        if (i5 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i5 < length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i6 > i5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (i6 <= length) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (fArr2.length - i3 >= (i6 - i5) * 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            int lineForOffset = getLineForOffset(i);
                            int lineForOffset2 = getLineForOffset(i6 - 1);
                            HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
                            if (lineForOffset <= lineForOffset2) {
                                int i8 = lineForOffset;
                                int i9 = i3;
                                while (true) {
                                    int lineStart = getLineStart(i8);
                                    int lineEnd = getLineEnd(i8);
                                    int min = Math.min(i6, lineEnd);
                                    float lineTop = getLineTop(i8);
                                    float lineBottom = getLineBottom(i8);
                                    if (getParagraphDirection(i8) == i7) {
                                        i4 = i7;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i10 = i4 ^ 1;
                                    for (int max = Math.max(i5, lineStart); max < min; max++) {
                                        boolean isRtlCharAt = isRtlCharAt(max);
                                        if (i4 != 0 && !isRtlCharAt) {
                                            f = horizontalPositionCache.getPrimaryDownstream(max);
                                            f2 = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        } else if (i4 != 0 && isRtlCharAt) {
                                            f2 = horizontalPositionCache.getSecondaryDownstream(max);
                                            f = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        } else if (i10 == 0 || !isRtlCharAt) {
                                            f = horizontalPositionCache.getSecondaryDownstream(max);
                                            f2 = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                        } else {
                                            f2 = horizontalPositionCache.getPrimaryDownstream(max);
                                            f = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                        }
                                        fArr2[i9] = f;
                                        fArr2[i9 + 1] = lineTop;
                                        fArr2[i9 + 2] = f2;
                                        fArr2[i9 + 3] = lineBottom;
                                        i9 += 4;
                                    }
                                    if (i8 != lineForOffset2) {
                                        i8++;
                                        i7 = 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int i) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        int lineForOffset = getLineForOffset(i);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        if (getParagraphDirection(lineForOffset) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = this.layout.isRtlCharAt(i);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                f4 = getSecondaryHorizontal(i, false);
                f3 = getSecondaryHorizontal(i + 1, true);
            } else if (isRtlCharAt) {
                f4 = getPrimaryHorizontal(i, false);
                f3 = getPrimaryHorizontal(i + 1, true);
            } else {
                f2 = getSecondaryHorizontal(i, false);
                f = getSecondaryHorizontal(i + 1, true);
            }
            float f5 = f4;
            f2 = f3;
            f = f5;
        } else {
            f2 = getPrimaryHorizontal(i, false);
            f = getPrimaryHorizontal(i + 1, true);
        }
        return new RectF(f2, lineTop, f, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        int i;
        if (this.didExceedMaxLines) {
            i = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            i = this.layout.getHeight();
        }
        return i + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.lineCount - 1 || (fontMetricsInt = this.lastLineFontMetrics) == null) {
            i2 = this.layout.getLineAscent(i);
        } else {
            i2 = fontMetricsInt.ascent;
        }
        return (float) i2;
    }

    public final float getLineBaseline(int i) {
        float f;
        float f2 = (float) this.topPadding;
        if (i != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            f = (float) this.layout.getLineBaseline(i);
        } else {
            f = getLineTop(i) - ((float) this.lastLineFontMetrics.ascent);
        }
        return f2 + f;
    }

    public final float getLineBottom(int i) {
        int i2;
        if (i == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            return ((float) this.layout.getLineBottom(i - 1)) + ((float) this.lastLineFontMetrics.bottom);
        }
        float lineBottom = ((float) this.topPadding) + ((float) this.layout.getLineBottom(i));
        if (i == this.lineCount - 1) {
            i2 = this.bottomPadding;
        } else {
            i2 = 0;
        }
        return lineBottom + ((float) i2);
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.lineCount - 1 || (fontMetricsInt = this.lastLineFontMetrics) == null) {
            i2 = this.layout.getLineDescent(i);
        } else {
            i2 = fontMetricsInt.descent;
        }
        return (float) i2;
    }

    public final int getLineEllipsisCount(int i) {
        return this.layout.getEllipsisCount(i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.layout.getEllipsisStart(i);
    }

    public final int getLineEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineEnd(i);
        }
        return this.layout.getText().length();
    }

    public final int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    public final int getLineForVertical(int i) {
        return this.layout.getLineForVertical(this.topPadding + i);
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineLeft(int i) {
        float f;
        float lineLeft = this.layout.getLineLeft(i);
        if (i == this.lineCount - 1) {
            f = this.leftPadding;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float getLineRight(int i) {
        float f;
        float lineRight = this.layout.getLineRight(i);
        if (i == this.lineCount - 1) {
            f = this.rightPadding;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public final float getLineTop(int i) {
        int i2;
        float lineTop = (float) this.layout.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.topPadding;
        }
        return lineTop + ((float) i2);
    }

    public final int getLineVisibleEnd(int i) {
        if (this.layout.getEllipsisStart(i) == 0) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getEllipsisStart(i) + this.layout.getLineStart(i);
    }

    public final float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.layout.getOffsetForHorizontal(i, f + (((float) -1) * getHorizontalPadding(i)));
    }

    public final int getParagraphDirection(int i) {
        return this.layout.getParagraphDirection(i);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, true, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, false, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final void getSelectionPath(int i, int i2, Path path) {
        C12775o.m28639i(path, "dest");
        this.layout.getSelectionPath(i, i2, path);
        if (this.topPadding != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.topPadding);
        }
    }

    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        C12775o.m28638h(text, "layout.text");
        return text;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout2 = this.layout;
            C12775o.m28637g(layout2, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout2);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout3 = this.layout;
        C12775o.m28637g(layout3, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout3, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i) {
        return TextLayoutKt.isLineEllipsized(this.layout, i);
    }

    public final boolean isRtlCharAt(int i) {
        return this.layout.isRtlCharAt(i);
    }

    public final void paint(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        if (canvas.getClipBounds(this.rect)) {
            int i = this.topPadding;
            if (i != 0) {
                canvas.translate(0.0f, (float) i);
            }
            TextAndroidCanvas access$getSharedTextAndroidCanvas$p = TextLayoutKt.SharedTextAndroidCanvas;
            access$getSharedTextAndroidCanvas$p.setCanvas(canvas);
            this.layout.draw(access$getSharedTextAndroidCanvas$p);
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i2));
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.p002ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r25
        L_0x000b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r7 = r3
            goto L_0x0014
        L_0x0012:
            r7 = r27
        L_0x0014:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r4
            goto L_0x001d
        L_0x001b:
            r8 = r28
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            r1 = 2
            r9 = r1
            goto L_0x0026
        L_0x0024:
            r9 = r29
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0030
        L_0x002e:
            r10 = r30
        L_0x0030:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0036
            r11 = r2
            goto L_0x0038
        L_0x0036:
            r11 = r31
        L_0x0038:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003e
            r12 = r3
            goto L_0x0040
        L_0x003e:
            r12 = r32
        L_0x0040:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            r13 = r1
            goto L_0x0049
        L_0x0047:
            r13 = r33
        L_0x0049:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0052
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x0054
        L_0x0052:
            r14 = r34
        L_0x0054:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005a
            r15 = r3
            goto L_0x005c
        L_0x005a:
            r15 = r35
        L_0x005c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0063
            r16 = r3
            goto L_0x0065
        L_0x0063:
            r16 = r36
        L_0x0065:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006c
            r17 = r3
            goto L_0x006e
        L_0x006c:
            r17 = r37
        L_0x006e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0075
            r18 = r3
            goto L_0x0077
        L_0x0075:
            r18 = r38
        L_0x0077:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0080
            r19 = r3
            goto L_0x0082
        L_0x0080:
            r19 = r39
        L_0x0082:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008a
            r20 = r4
            goto L_0x008c
        L_0x008a:
            r20 = r40
        L_0x008c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0094
            r21 = r4
            goto L_0x0096
        L_0x0094:
            r21 = r41
        L_0x0096:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a7
            androidx.compose.ui.text.android.LayoutIntrinsics r0 = new androidx.compose.ui.text.android.LayoutIntrinsics
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00ad
        L_0x00a7:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00ad:
            r3 = r23
            r4 = r24
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
