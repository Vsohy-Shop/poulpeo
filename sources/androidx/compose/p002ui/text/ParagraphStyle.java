package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.text.style.TextMotion;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.ParagraphStyle */
/* compiled from: ParagraphStyle.kt */
public final class ParagraphStyle {
    public static final int $stable = 0;
    private final Hyphens hyphens;
    private final int hyphensOrDefault;
    private final LineBreak lineBreak;
    private final int lineBreakOrDefault;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final TextAlign textAlign;
    private final int textAlignOrDefault;
    private final TextDirection textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    @ExperimentalTextApi
    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-Elsmlbk$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m37879copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        }
        return paragraphStyle.m37883copyElsmlbk(textAlign2, textDirection3, j2, textIndent2);
    }

    /* renamed from: copy-NH1kkwU$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m37880copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2, int i, Object obj) {
        TextAlign textAlign3;
        TextDirection textDirection3;
        long j2;
        TextIndent textIndent3;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle3;
        LineBreak lineBreak3;
        Hyphens hyphens3;
        TextMotion textMotion3;
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int i2 = i;
        if ((i2 & 1) != 0) {
            textAlign3 = paragraphStyle2.textAlign;
        } else {
            textAlign3 = textAlign2;
        }
        if ((i2 & 2) != 0) {
            textDirection3 = paragraphStyle2.textDirection;
        } else {
            textDirection3 = textDirection2;
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle2.lineHeight;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            textIndent3 = paragraphStyle2.textIndent;
        } else {
            textIndent3 = textIndent2;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle2.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle3 = paragraphStyle2.lineHeightStyle;
        } else {
            lineHeightStyle3 = lineHeightStyle2;
        }
        if ((i2 & 64) != 0) {
            lineBreak3 = paragraphStyle2.lineBreak;
        } else {
            lineBreak3 = lineBreak2;
        }
        if ((i2 & 128) != 0) {
            hyphens3 = paragraphStyle2.hyphens;
        } else {
            hyphens3 = hyphens2;
        }
        if ((i2 & 256) != 0) {
            textMotion3 = paragraphStyle2.textMotion;
        } else {
            textMotion3 = textMotion2;
        }
        return paragraphStyle.m37884copyNH1kkwU(textAlign3, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle3, lineBreak3, hyphens3, textMotion3);
    }

    /* renamed from: copy-ciSxzs0$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m37881copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, int i, Object obj) {
        TextAlign textAlign3;
        TextDirection textDirection3;
        long j2;
        TextIndent textIndent3;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle3;
        LineBreak lineBreak3;
        Hyphens hyphens3;
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int i2 = i;
        if ((i2 & 1) != 0) {
            textAlign3 = paragraphStyle2.textAlign;
        } else {
            textAlign3 = textAlign2;
        }
        if ((i2 & 2) != 0) {
            textDirection3 = paragraphStyle2.textDirection;
        } else {
            textDirection3 = textDirection2;
        }
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle2.lineHeight;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            textIndent3 = paragraphStyle2.textIndent;
        } else {
            textIndent3 = textIndent2;
        }
        if ((i2 & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle2.platformStyle;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i2 & 32) != 0) {
            lineHeightStyle3 = paragraphStyle2.lineHeightStyle;
        } else {
            lineHeightStyle3 = lineHeightStyle2;
        }
        if ((i2 & 64) != 0) {
            lineBreak3 = paragraphStyle2.lineBreak;
        } else {
            lineBreak3 = lineBreak2;
        }
        if ((i2 & 128) != 0) {
            hyphens3 = paragraphStyle2.hyphens;
        } else {
            hyphens3 = hyphens2;
        }
        return paragraphStyle.m37885copyciSxzs0(textAlign3, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle3, lineBreak3, hyphens3);
    }

    /* renamed from: copy-xPh5V4g$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m37882copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.textIndent;
        }
        TextIndent textIndent3 = textIndent2;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m37886copyxPh5V4g(textAlign2, textDirection3, j2, textIndent3, platformParagraphStyle2, lineHeightStyle2);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    private final PlatformParagraphStyle mergePlatformStyle(PlatformParagraphStyle platformParagraphStyle) {
        PlatformParagraphStyle platformParagraphStyle2 = this.platformStyle;
        if (platformParagraphStyle2 == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return platformParagraphStyle2;
        }
        return platformParagraphStyle2.merge(platformParagraphStyle);
    }

    /* renamed from: copy-Elsmlbk  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m37883copyElsmlbk(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @ExperimentalTextApi
    /* renamed from: copy-NH1kkwU  reason: not valid java name */
    public final ParagraphStyle m37884copyNH1kkwU(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, textMotion2, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-ciSxzs0  reason: not valid java name */
    public final ParagraphStyle m37885copyciSxzs0(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, this.textMotion, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-xPh5V4g  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m37886copyxPh5V4g(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2) {
        return new ParagraphStyle(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (C12775o.m28634d(this.textAlign, paragraphStyle.textAlign) && C12775o.m28634d(this.textDirection, paragraphStyle.textDirection) && TextUnit.m38646equalsimpl0(this.lineHeight, paragraphStyle.lineHeight) && C12775o.m28634d(this.textIndent, paragraphStyle.textIndent) && C12775o.m28634d(this.platformStyle, paragraphStyle.platformStyle) && C12775o.m28634d(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && C12775o.m28634d(this.lineBreak, paragraphStyle.lineBreak) && C12775o.m28634d(this.hyphens, paragraphStyle.hyphens) && C12775o.m28634d(this.textMotion, paragraphStyle.textMotion)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHyphens-EaSxIns  reason: not valid java name */
    public final Hyphens m37887getHyphensEaSxIns() {
        return this.hyphens;
    }

    /* renamed from: getHyphensOrDefault-vmbZdU8$ui_text_release  reason: not valid java name */
    public final int m37888getHyphensOrDefaultvmbZdU8$ui_text_release() {
        return this.hyphensOrDefault;
    }

    /* renamed from: getLineBreak-LgCVezo  reason: not valid java name */
    public final LineBreak m37889getLineBreakLgCVezo() {
        return this.lineBreak;
    }

    /* renamed from: getLineBreakOrDefault-rAG3T2k$ui_text_release  reason: not valid java name */
    public final int m37890getLineBreakOrDefaultrAG3T2k$ui_text_release() {
        return this.lineBreakOrDefault;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m37891getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m37892getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* renamed from: getTextAlignOrDefault-e0LSkKk$ui_text_release  reason: not valid java name */
    public final int m37893getTextAlignOrDefaulte0LSkKk$ui_text_release() {
        return this.textAlignOrDefault;
    }

    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m37894getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @ExperimentalTextApi
    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TextAlign textAlign2 = this.textAlign;
        int i8 = 0;
        if (textAlign2 != null) {
            i = TextAlign.m38345hashCodeimpl(textAlign2.m38347unboximpl());
        } else {
            i = 0;
        }
        int i9 = i * 31;
        TextDirection textDirection2 = this.textDirection;
        if (textDirection2 != null) {
            i2 = TextDirection.m38358hashCodeimpl(textDirection2.m38360unboximpl());
        } else {
            i2 = 0;
        }
        int r0 = (((i9 + i2) * 31) + TextUnit.m38650hashCodeimpl(this.lineHeight)) * 31;
        TextIndent textIndent2 = this.textIndent;
        if (textIndent2 != null) {
            i3 = textIndent2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (r0 + i3) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        if (platformParagraphStyle != null) {
            i4 = platformParagraphStyle.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        LineHeightStyle lineHeightStyle2 = this.lineHeightStyle;
        if (lineHeightStyle2 != null) {
            i5 = lineHeightStyle2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        LineBreak lineBreak2 = this.lineBreak;
        if (lineBreak2 != null) {
            i6 = LineBreak.m38275hashCodeimpl(lineBreak2.m38277unboximpl());
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        Hyphens hyphens2 = this.hyphens;
        if (hyphens2 != null) {
            i7 = Hyphens.m38260hashCodeimpl(hyphens2.m38262unboximpl());
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        TextMotion textMotion2 = this.textMotion;
        if (textMotion2 != null) {
            i8 = textMotion2.hashCode();
        }
        return i14 + i8;
    }

    @Stable
    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        long j;
        if (paragraphStyle == null) {
            return this;
        }
        if (TextUnitKt.m38667isUnspecifiedR2X_6o(paragraphStyle.lineHeight)) {
            j = this.lineHeight;
        } else {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        TextIndent textIndent2 = paragraphStyle.textIndent;
        if (textIndent2 == null) {
            textIndent2 = this.textIndent;
        }
        TextIndent textIndent3 = textIndent2;
        TextAlign textAlign2 = paragraphStyle.textAlign;
        if (textAlign2 == null) {
            textAlign2 = this.textAlign;
        }
        TextAlign textAlign3 = textAlign2;
        TextDirection textDirection2 = paragraphStyle.textDirection;
        if (textDirection2 == null) {
            textDirection2 = this.textDirection;
        }
        TextDirection textDirection3 = textDirection2;
        PlatformParagraphStyle mergePlatformStyle = mergePlatformStyle(paragraphStyle.platformStyle);
        LineHeightStyle lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        if (lineHeightStyle2 == null) {
            lineHeightStyle2 = this.lineHeightStyle;
        }
        LineHeightStyle lineHeightStyle3 = lineHeightStyle2;
        LineBreak lineBreak2 = paragraphStyle.lineBreak;
        if (lineBreak2 == null) {
            lineBreak2 = this.lineBreak;
        }
        LineBreak lineBreak3 = lineBreak2;
        Hyphens hyphens2 = paragraphStyle.hyphens;
        if (hyphens2 == null) {
            hyphens2 = this.hyphens;
        }
        Hyphens hyphens3 = hyphens2;
        TextMotion textMotion2 = paragraphStyle.textMotion;
        if (textMotion2 == null) {
            textMotion2 = this.textMotion;
        }
        return new ParagraphStyle(textAlign3, textDirection3, j2, textIndent3, mergePlatformStyle, lineHeightStyle3, lineBreak3, hyphens3, textMotion2, (DefaultConstructorMarker) null);
    }

    @Stable
    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        C12775o.m28639i(paragraphStyle, "other");
        return merge(paragraphStyle);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.textAlign + ", textDirection=" + this.textDirection + ", lineHeight=" + TextUnit.m38656toStringimpl(this.lineHeight) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + this.lineBreak + ", hyphens=" + this.hyphens + ", textMotion=" + this.textMotion + ')';
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign2, textDirection2, j, textIndent2);
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2, TextMotion textMotion2) {
        this.textAlign = textAlign2;
        this.textDirection = textDirection2;
        this.lineHeight = j;
        this.textIndent = textIndent2;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle2;
        this.lineBreak = lineBreak2;
        this.hyphens = hyphens2;
        this.textMotion = textMotion2;
        this.textAlignOrDefault = textAlign2 != null ? textAlign2.m38347unboximpl() : TextAlign.Companion.m38353getStarte0LSkKk();
        this.lineBreakOrDefault = lineBreak2 != null ? lineBreak2.m38277unboximpl() : LineBreak.Companion.m38280getSimplerAG3T2k();
        this.hyphensOrDefault = hyphens2 != null ? hyphens2.m38262unboximpl() : Hyphens.Companion.m38264getNonevmbZdU8();
        if (!TextUnit.m38646equalsimpl0(j, TextUnit.Companion.m38660getUnspecifiedXSAIIZE())) {
            if (!(TextUnit.m38649getValueimpl(j) >= 0.0f)) {
                throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m38649getValueimpl(j) + ')').toString());
            }
        }
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getTextMotion$annotations() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.p002ui.text.style.TextAlign r12, androidx.compose.p002ui.text.style.TextDirection r13, long r14, androidx.compose.p002ui.text.style.TextIndent r16, androidx.compose.p002ui.text.PlatformParagraphStyle r17, androidx.compose.p002ui.text.style.LineHeightStyle r18, androidx.compose.p002ui.text.style.LineBreak r19, androidx.compose.p002ui.text.style.Hyphens r20, androidx.compose.p002ui.text.style.TextMotion r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r4 = r4.m38660getUnspecifiedXSAIIZE()
            goto L_0x001d
        L_0x001c:
            r4 = r14
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0025
        L_0x0023:
            r6 = r16
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r2
            goto L_0x002d
        L_0x002b:
            r7 = r17
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r18
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = r2
            goto L_0x003d
        L_0x003b:
            r9 = r19
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r2
            goto L_0x0045
        L_0x0043:
            r10 = r20
        L_0x0045:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r21
        L_0x004c:
            r0 = 0
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r23 = r0
            r12.<init>((androidx.compose.p002ui.text.style.TextAlign) r13, (androidx.compose.p002ui.text.style.TextDirection) r14, (long) r15, (androidx.compose.p002ui.text.style.TextIndent) r17, (androidx.compose.p002ui.text.PlatformParagraphStyle) r18, (androidx.compose.p002ui.text.style.LineHeightStyle) r19, (androidx.compose.p002ui.text.style.LineBreak) r20, (androidx.compose.p002ui.text.style.Hyphens) r21, (androidx.compose.p002ui.text.style.TextMotion) r22, (kotlin.jvm.internal.DefaultConstructorMarker) r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign2, (i & 2) != 0 ? null : textDirection2, (i & 4) != 0 ? TextUnit.Companion.m38660getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent2, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2) {
        this(textAlign2, textDirection2, j, textIndent2, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.p002ui.text.style.TextAlign r9, androidx.compose.p002ui.text.style.TextDirection r10, long r11, androidx.compose.p002ui.text.style.TextIndent r13, androidx.compose.p002ui.text.PlatformParagraphStyle r14, androidx.compose.p002ui.text.style.LineHeightStyle r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r16 & 2
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r16 & 4
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001b
        L_0x001a:
            r3 = r11
        L_0x001b:
            r5 = r16 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r1
            goto L_0x0022
        L_0x0021:
            r5 = r13
        L_0x0022:
            r6 = r16 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r1
            goto L_0x0029
        L_0x0028:
            r6 = r14
        L_0x0029:
            r7 = r16 & 32
            if (r7 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r15
        L_0x002f:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r2
            r12 = r3
            r14 = r5
            r15 = r6
            r16 = r1
            r17 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ParagraphStyle(androidx.compose.p002ui.text.style.TextAlign r11, androidx.compose.p002ui.text.style.TextDirection r12, long r13, androidx.compose.p002ui.text.style.TextIndent r15, androidx.compose.p002ui.text.PlatformParagraphStyle r16, androidx.compose.p002ui.text.style.LineHeightStyle r17, androidx.compose.p002ui.text.style.LineBreak r18, androidx.compose.p002ui.text.style.Hyphens r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r4 = r4.m38660getUnspecifiedXSAIIZE()
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r15
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r16
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r17
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r18
        L_0x003c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r2 = r19
        L_0x0043:
            r0 = 0
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r21 = r0
            r11.<init>((androidx.compose.p002ui.text.style.TextAlign) r12, (androidx.compose.p002ui.text.style.TextDirection) r13, (long) r14, (androidx.compose.p002ui.text.style.TextIndent) r16, (androidx.compose.p002ui.text.PlatformParagraphStyle) r17, (androidx.compose.p002ui.text.style.LineHeightStyle) r18, (androidx.compose.p002ui.text.style.LineBreak) r19, (androidx.compose.p002ui.text.style.Hyphens) r20, (kotlin.jvm.internal.DefaultConstructorMarker) r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.ParagraphStyle.<init>(androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private ParagraphStyle(TextAlign textAlign2, TextDirection textDirection2, long j, TextIndent textIndent2, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle2, LineBreak lineBreak2, Hyphens hyphens2) {
        this(textAlign2, textDirection2, j, textIndent2, platformParagraphStyle, lineHeightStyle2, lineBreak2, hyphens2, (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
