package androidx.compose.p002ui.text;

import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.android.LayoutIntrinsics;
import androidx.compose.p002ui.text.android.TextLayout;
import androidx.compose.p002ui.text.android.selection.WordBoundary;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.p002ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.p002ui.text.platform.AndroidTextPaint;
import androidx.compose.p002ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,621:1\n1#2:622\n13579#3,2:623\n11335#3:625\n11670#3,3:626\n26#4:629\n26#4:630\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:623,2\n244#1:625\n244#1:626,3\n439#1:629\n443#1:630\n*E\n"})
/* renamed from: androidx.compose.ui.text.AndroidParagraph */
/* compiled from: AndroidParagraph.android.kt */
public final class AndroidParagraph implements Paragraph {
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    /* access modifiers changed from: private */
    public final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;
    private final Lazy wordBoundary$delegate;

    /* renamed from: androidx.compose.ui.text.AndroidParagraph$WhenMappings */
    /* compiled from: AndroidParagraph.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.text.style.ResolvedTextDirection[] r0 = androidx.compose.p002ui.text.style.ResolvedTextDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.p002ui.text.style.ResolvedTextDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.p002ui.text.style.ResolvedTextDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.AndroidParagraph.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    private final TextLayout constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        int i12 = i7;
        CharSequence charSequence2 = this.charSequence;
        float width = getWidth();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        int textDirectionHeuristic$ui_text_release = this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release();
        LayoutIntrinsics layoutIntrinsics$ui_text_release = this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release();
        return new TextLayout(charSequence2, width, textPaint$ui_text_release, i, truncateAt2, textDirectionHeuristic$ui_text_release, 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i8, i10, i11, i12, i9, i2, (int[]) null, (int[]) null, layoutIntrinsics$ui_text_release, 196736, (DefaultConstructorMarker) null);
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        boolean z;
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        C12775o.m28637g(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        C12775o.m28638h(shaderBrushSpanArr, "brushSpans");
        if (shaderBrushSpanArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ShaderBrushSpan[0];
        }
        return shaderBrushSpanArr;
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q  reason: not valid java name */
    public final void m37830fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i) {
        C12775o.m28639i(fArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        this.layout.fillBoundingBoxes(TextRange.m37973getMinimpl(j), TextRange.m37972getMaximpl(j), fArr, i);
    }

    public ResolvedTextDirection getBidiRunDirection(int i) {
        if (this.layout.isRtlCharAt(i)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    public Rect getBoundingBox(int i) {
        RectF boundingBox = this.layout.getBoundingBox(i);
        return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m37831getConstraintsmsEJaDk() {
        return this.constraints;
    }

    public Rect getCursorRect(int i) {
        boolean z;
        if (i < 0 || i > this.charSequence.length()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, (Object) null);
            int lineForOffset = this.layout.getLineForOffset(i);
            return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
        }
        throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.charSequence.length());
    }

    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    public float getHeight() {
        return (float) this.layout.getHeight();
    }

    public float getHorizontalPosition(int i, boolean z) {
        if (z) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, i, false, 2, (Object) null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, i, false, 2, (Object) null);
    }

    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i) {
        return this.layout.getLineAscent(i);
    }

    public final float getLineBaseline$ui_text_release(int i) {
        return this.layout.getLineBaseline(i);
    }

    public float getLineBottom(int i) {
        return this.layout.getLineBottom(i);
    }

    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i) {
        return this.layout.getLineDescent(i);
    }

    public int getLineEnd(int i, boolean z) {
        if (z) {
            return this.layout.getLineVisibleEnd(i);
        }
        return this.layout.getLineEnd(i);
    }

    public int getLineForOffset(int i) {
        return this.layout.getLineForOffset(i);
    }

    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical((int) f);
    }

    public float getLineHeight(int i) {
        return this.layout.getLineHeight(i);
    }

    public float getLineLeft(int i) {
        return this.layout.getLineLeft(i);
    }

    public float getLineRight(int i) {
        return this.layout.getLineRight(i);
    }

    public int getLineStart(int i) {
        return this.layout.getLineStart(i);
    }

    public float getLineTop(int i) {
        return this.layout.getLineTop(i);
    }

    public float getLineWidth(int i) {
        return this.layout.getLineWidth(i);
    }

    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public int m37832getOffsetForPositionk4lQ0M(long j) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m35423getYimpl(j)), Offset.m35422getXimpl(j));
    }

    public ResolvedTextDirection getParagraphDirection(int i) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(i)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public Path getPathForRange(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z || i2 > this.charSequence.length()) {
            throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.charSequence.length() + "), or start > end!");
        }
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(i, i2, path);
        return AndroidPath_androidKt.asComposePath(path);
    }

    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
        C12775o.m28638h(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    public float getWidth() {
        return (float) Constraints.m38412getMaxWidthimpl(this.constraints);
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public long m37833getWordBoundaryjx7JFs(int i) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i), getWordBoundary().getWordEnd(i));
    }

    public boolean isLineEllipsized(int i) {
        return this.layout.isLineEllipsized(i);
    }

    /* renamed from: paint-LG529CI  reason: not valid java name */
    public void m37834paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        C12775o.m28639i(canvas, "canvas");
        int r0 = getTextPaint$ui_text_release().m38212getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m38215setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m38213setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m38213setBlendModes9anfk8(r0);
    }

    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public void m37835paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration) {
        C12775o.m28639i(canvas, "canvas");
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m38215setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    /* renamed from: paint-hn5TExg  reason: not valid java name */
    public void m37836painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(brush, "brush");
        int r0 = getTextPaint$ui_text_release().m38212getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m38214setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m38213setBlendModes9anfk8(i);
        paint(canvas);
        getTextPaint$ui_text_release().m38213setBlendModes9anfk8(r0);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i, boolean z, long j, FontFamily.Resolver resolver, Density density, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, list, list2, i, z, j, resolver, density);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022d, code lost:
        r10 = r10 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0258, code lost:
        r10 = r8 - ((float) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025b, code lost:
        r8 = new androidx.compose.p002ui.geometry.Rect(r6, r10, r7, ((float) r5.getHeightPx()) + r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AndroidParagraph(androidx.compose.p002ui.text.platform.AndroidParagraphIntrinsics r26, int r27, boolean r28, long r29) {
        /*
            r25 = this;
            r9 = r25
            r10 = r27
            r11 = r28
            r25.<init>()
            r0 = r26
            r9.paragraphIntrinsics = r0
            r9.maxLines = r10
            r9.ellipsis = r11
            r12 = r29
            r9.constraints = r12
            int r1 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r29)
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x0025
            int r1 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r29)
            if (r1 != 0) goto L_0x0025
            r1 = r15
            goto L_0x0026
        L_0x0025:
            r1 = r14
        L_0x0026:
            if (r1 == 0) goto L_0x028d
            if (r10 < r15) goto L_0x002c
            r1 = r15
            goto L_0x002d
        L_0x002c:
            r1 = r14
        L_0x002d:
            if (r1 == 0) goto L_0x0281
            androidx.compose.ui.text.TextStyle r8 = r26.getStyle()
            boolean r1 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(r8, r11)
            if (r1 == 0) goto L_0x0042
            java.lang.CharSequence r0 = r26.getCharSequence$ui_text_release()
            java.lang.CharSequence r0 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.attachIndentationFixSpan(r0)
            goto L_0x0046
        L_0x0042:
            java.lang.CharSequence r0 = r26.getCharSequence$ui_text_release()
        L_0x0046:
            r9.charSequence = r0
            androidx.compose.ui.text.style.TextAlign r0 = r8.m38003getTextAlignbuA522U()
            int r16 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.m37842toLayoutAlignAMY3VfE(r0)
            androidx.compose.ui.text.style.TextAlign r0 = r8.m38003getTextAlignbuA522U()
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.p002ui.text.style.TextAlign.Companion
            int r1 = r1.m38350getJustifye0LSkKk()
            if (r0 != 0) goto L_0x005f
            r17 = r14
            goto L_0x0069
        L_0x005f:
            int r0 = r0.m38347unboximpl()
            boolean r0 = androidx.compose.p002ui.text.style.TextAlign.m38344equalsimpl0(r0, r1)
            r17 = r0
        L_0x0069:
            androidx.compose.ui.text.ParagraphStyle r0 = r8.getParagraphStyle$ui_text_release()
            androidx.compose.ui.text.style.Hyphens r0 = r0.m37887getHyphensEaSxIns()
            int r18 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.m37844toLayoutHyphenationFrequency0_XeFpE(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r8.m38001getLineBreakLgCVezo()
            r19 = 0
            if (r0 == 0) goto L_0x008a
            int r0 = r0.m38277unboximpl()
            int r0 = androidx.compose.p002ui.text.style.LineBreak.m38272getStrategyfcGXIks(r0)
            androidx.compose.ui.text.style.LineBreak$Strategy r0 = androidx.compose.p002ui.text.style.LineBreak.Strategy.m38281boximpl(r0)
            goto L_0x008c
        L_0x008a:
            r0 = r19
        L_0x008c:
            int r20 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.m37843toLayoutBreakStrategyu6PBz3U(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r8.m38001getLineBreakLgCVezo()
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.m38277unboximpl()
            int r0 = androidx.compose.p002ui.text.style.LineBreak.m38273getStrictnessusljTpc(r0)
            androidx.compose.ui.text.style.LineBreak$Strictness r0 = androidx.compose.p002ui.text.style.LineBreak.Strictness.m38291boximpl(r0)
            goto L_0x00a5
        L_0x00a3:
            r0 = r19
        L_0x00a5:
            int r21 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.m37845toLayoutLineBreakStyle4a2g8L8(r0)
            androidx.compose.ui.text.style.LineBreak r0 = r8.m38001getLineBreakLgCVezo()
            if (r0 == 0) goto L_0x00bc
            int r0 = r0.m38277unboximpl()
            int r0 = androidx.compose.p002ui.text.style.LineBreak.m38274getWordBreakjp8hJ3c(r0)
            androidx.compose.ui.text.style.LineBreak$WordBreak r0 = androidx.compose.p002ui.text.style.LineBreak.WordBreak.m38302boximpl(r0)
            goto L_0x00be
        L_0x00bc:
            r0 = r19
        L_0x00be:
            int r22 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.m37846toLayoutLineBreakWordStylegvcdTPQ(r0)
            if (r11 == 0) goto L_0x00c9
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r23 = r0
            goto L_0x00cb
        L_0x00c9:
            r23 = r19
        L_0x00cb:
            r0 = r25
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r27
            r5 = r18
            r6 = r20
            r7 = r21
            r24 = r8
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.constructTextLayout(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L_0x0118
            int r1 = r0.getHeight()
            int r2 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r29)
            if (r1 <= r2) goto L_0x0118
            if (r10 <= r15) goto L_0x0118
            int r1 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r29)
            int r1 = androidx.compose.p002ui.text.AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(r0, r1)
            if (r1 < 0) goto L_0x0115
            if (r1 == r10) goto L_0x0115
            int r4 = p436tf.C13537l.m30877d(r1, r15)
            r0 = r25
            r1 = r16
            r2 = r17
            r3 = r23
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.constructTextLayout(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0115:
            r9.layout = r0
            goto L_0x011a
        L_0x0118:
            r9.layout = r0
        L_0x011a:
            androidx.compose.ui.text.platform.AndroidTextPaint r0 = r25.getTextPaint$ui_text_release()
            androidx.compose.ui.graphics.Brush r1 = r24.getBrush()
            float r2 = r25.getWidth()
            float r3 = r25.getHeight()
            long r2 = androidx.compose.p002ui.geometry.SizeKt.Size(r2, r3)
            float r4 = r24.getAlpha()
            r0.m38214setBrush12SF9DM(r1, r2, r4)
            androidx.compose.ui.text.android.TextLayout r0 = r9.layout
            androidx.compose.ui.text.platform.style.ShaderBrushSpan[] r0 = r9.getShaderBrushSpans(r0)
            int r1 = r0.length
            r2 = r14
        L_0x013d:
            if (r2 >= r1) goto L_0x0153
            r3 = r0[r2]
            float r4 = r25.getWidth()
            float r5 = r25.getHeight()
            long r4 = androidx.compose.p002ui.geometry.SizeKt.Size(r4, r5)
            r3.m38235setSizeuvyYCjk(r4)
            int r2 = r2 + 1
            goto L_0x013d
        L_0x0153:
            java.lang.CharSequence r0 = r9.charSequence
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x015f
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            goto L_0x0271
        L_0x015f:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r2 = r0.length()
            java.lang.Class<androidx.compose.ui.text.android.style.PlaceholderSpan> r3 = androidx.compose.p002ui.text.android.style.PlaceholderSpan.class
            java.lang.Object[] r1 = r1.getSpans(r14, r2, r3)
            java.lang.String r2 = "getSpans(0, length, PlaceholderSpan::class.java)"
            kotlin.jvm.internal.C12775o.m28638h(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = r14
        L_0x0179:
            if (r4 >= r3) goto L_0x0270
            r5 = r1[r4]
            androidx.compose.ui.text.android.style.PlaceholderSpan r5 = (androidx.compose.p002ui.text.android.style.PlaceholderSpan) r5
            r6 = r0
            android.text.Spanned r6 = (android.text.Spanned) r6
            int r7 = r6.getSpanStart(r5)
            int r6 = r6.getSpanEnd(r5)
            androidx.compose.ui.text.android.TextLayout r8 = r9.layout
            int r8 = r8.getLineForOffset(r7)
            int r10 = r9.maxLines
            if (r8 < r10) goto L_0x0196
            r10 = r15
            goto L_0x0197
        L_0x0196:
            r10 = r14
        L_0x0197:
            androidx.compose.ui.text.android.TextLayout r11 = r9.layout
            int r11 = r11.getLineEllipsisCount(r8)
            if (r11 <= 0) goto L_0x01a9
            androidx.compose.ui.text.android.TextLayout r11 = r9.layout
            int r11 = r11.getLineEllipsisOffset(r8)
            if (r6 <= r11) goto L_0x01a9
            r11 = r15
            goto L_0x01aa
        L_0x01a9:
            r11 = r14
        L_0x01aa:
            androidx.compose.ui.text.android.TextLayout r12 = r9.layout
            int r12 = r12.getLineEnd(r8)
            if (r6 <= r12) goto L_0x01b4
            r6 = r15
            goto L_0x01b5
        L_0x01b4:
            r6 = r14
        L_0x01b5:
            if (r11 != 0) goto L_0x0267
            if (r6 != 0) goto L_0x0267
            if (r10 == 0) goto L_0x01bd
            goto L_0x0267
        L_0x01bd:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r9.getBidiRunDirection(r7)
            int[] r10 = androidx.compose.p002ui.text.AndroidParagraph.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r10[r6]
            r10 = 2
            if (r6 == r15) goto L_0x01df
            if (r6 != r10) goto L_0x01d9
            float r6 = r9.getHorizontalPosition(r7, r15)
            int r7 = r5.getWidthPx()
            float r7 = (float) r7
            float r6 = r6 - r7
            goto L_0x01e3
        L_0x01d9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01df:
            float r6 = r9.getHorizontalPosition(r7, r15)
        L_0x01e3:
            int r7 = r5.getWidthPx()
            float r7 = (float) r7
            float r7 = r7 + r6
            androidx.compose.ui.text.android.TextLayout r11 = r9.layout
            int r12 = r5.getVerticalAlign()
            switch(r12) {
                case 0: goto L_0x0250;
                case 1: goto L_0x024b;
                case 2: goto L_0x0242;
                case 3: goto L_0x022f;
                case 4: goto L_0x0222;
                case 5: goto L_0x020f;
                case 6: goto L_0x01fa;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            android.graphics.Paint$FontMetricsInt r12 = r5.getFontMetrics()
            int r13 = r12.ascent
            int r12 = r12.descent
            int r13 = r13 + r12
            int r12 = r5.getHeightPx()
            int r13 = r13 - r12
            int r13 = r13 / r10
            float r10 = (float) r13
            float r8 = r11.getLineBaseline(r8)
            goto L_0x022d
        L_0x020f:
            android.graphics.Paint$FontMetricsInt r10 = r5.getFontMetrics()
            int r10 = r10.descent
            float r10 = (float) r10
            float r8 = r11.getLineBaseline(r8)
            float r10 = r10 + r8
            int r8 = r5.getHeightPx()
            float r8 = (float) r8
            float r10 = r10 - r8
            goto L_0x025b
        L_0x0222:
            android.graphics.Paint$FontMetricsInt r10 = r5.getFontMetrics()
            int r10 = r10.ascent
            float r10 = (float) r10
            float r8 = r11.getLineBaseline(r8)
        L_0x022d:
            float r10 = r10 + r8
            goto L_0x025b
        L_0x022f:
            float r12 = r11.getLineTop(r8)
            float r8 = r11.getLineBottom(r8)
            float r12 = r12 + r8
            int r8 = r5.getHeightPx()
            float r8 = (float) r8
            float r12 = r12 - r8
            float r8 = (float) r10
            float r10 = r12 / r8
            goto L_0x025b
        L_0x0242:
            float r8 = r11.getLineBottom(r8)
            int r10 = r5.getHeightPx()
            goto L_0x0258
        L_0x024b:
            float r10 = r11.getLineTop(r8)
            goto L_0x025b
        L_0x0250:
            float r8 = r11.getLineBaseline(r8)
            int r10 = r5.getHeightPx()
        L_0x0258:
            float r10 = (float) r10
            float r10 = r8 - r10
        L_0x025b:
            int r5 = r5.getHeightPx()
            float r5 = (float) r5
            float r5 = r5 + r10
            androidx.compose.ui.geometry.Rect r8 = new androidx.compose.ui.geometry.Rect
            r8.<init>(r6, r10, r7, r5)
            goto L_0x0269
        L_0x0267:
            r8 = r19
        L_0x0269:
            r2.add(r8)
            int r4 = r4 + 1
            goto L_0x0179
        L_0x0270:
            r0 = r2
        L_0x0271:
            r9.placeholderRects = r0
            ef.j r0 = p336ef.C11904j.NONE
            androidx.compose.ui.text.AndroidParagraph$wordBoundary$2 r1 = new androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            r1.<init>(r9)
            kotlin.Lazy r0 = p336ef.C11901h.m25689a(r0, r1)
            r9.wordBoundary$delegate = r0
            return
        L_0x0281:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, boolean, long):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, long j, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i, z, j, (DefaultConstructorMarker) null);
    }
}
