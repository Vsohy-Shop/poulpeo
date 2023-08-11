package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.MutableSpanStyle */
/* compiled from: AndroidClipboardManager.android.kt */
final class MutableSpanStyle {
    private long background;
    private BaselineShift baselineShift;
    private long color;
    private FontFamily fontFamily;
    private String fontFeatureSettings;
    private long fontSize;
    private FontStyle fontStyle;
    private FontSynthesis fontSynthesis;
    private FontWeight fontWeight;
    private long letterSpacing;
    private LocaleList localeList;
    private Shadow shadow;
    private TextDecoration textDecoration;
    private TextGeometricTransform textGeometricTransform;

    public /* synthetic */ MutableSpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str, j3, baselineShift2, textGeometricTransform2, localeList2, j4, textDecoration2, shadow2);
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m37743getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m37744getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m37745getColor0d7_KjU() {
        return this.color;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m37746getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m37747getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m37748getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m37749getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    /* renamed from: setBackground-8_81llA  reason: not valid java name */
    public final void m37750setBackground8_81llA(long j) {
        this.background = j;
    }

    /* renamed from: setBaselineShift-_isdbwI  reason: not valid java name */
    public final void m37751setBaselineShift_isdbwI(BaselineShift baselineShift2) {
        this.baselineShift = baselineShift2;
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m37752setColor8_81llA(long j) {
        this.color = j;
    }

    public final void setFontFamily(FontFamily fontFamily2) {
        this.fontFamily = fontFamily2;
    }

    public final void setFontFeatureSettings(String str) {
        this.fontFeatureSettings = str;
    }

    /* renamed from: setFontSize--R2X_6o  reason: not valid java name */
    public final void m37753setFontSizeR2X_6o(long j) {
        this.fontSize = j;
    }

    /* renamed from: setFontStyle-mLjRB2g  reason: not valid java name */
    public final void m37754setFontStylemLjRB2g(FontStyle fontStyle2) {
        this.fontStyle = fontStyle2;
    }

    /* renamed from: setFontSynthesis-tDdu0R4  reason: not valid java name */
    public final void m37755setFontSynthesistDdu0R4(FontSynthesis fontSynthesis2) {
        this.fontSynthesis = fontSynthesis2;
    }

    public final void setFontWeight(FontWeight fontWeight2) {
        this.fontWeight = fontWeight2;
    }

    /* renamed from: setLetterSpacing--R2X_6o  reason: not valid java name */
    public final void m37756setLetterSpacingR2X_6o(long j) {
        this.letterSpacing = j;
    }

    public final void setLocaleList(LocaleList localeList2) {
        this.localeList = localeList2;
    }

    public final void setShadow(Shadow shadow2) {
        this.shadow = shadow2;
    }

    public final void setTextDecoration(TextDecoration textDecoration2) {
        this.textDecoration = textDecoration2;
    }

    public final void setTextGeometricTransform(TextGeometricTransform textGeometricTransform2) {
        this.textGeometricTransform = textGeometricTransform2;
    }

    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (DefaultConstructorMarker) null);
    }

    private MutableSpanStyle(long j, long j2, FontWeight fontWeight2, FontStyle fontStyle2, FontSynthesis fontSynthesis2, FontFamily fontFamily2, String str, long j3, BaselineShift baselineShift2, TextGeometricTransform textGeometricTransform2, LocaleList localeList2, long j4, TextDecoration textDecoration2, Shadow shadow2) {
        this.color = j;
        this.fontSize = j2;
        this.fontWeight = fontWeight2;
        this.fontStyle = fontStyle2;
        this.fontSynthesis = fontSynthesis2;
        this.fontFamily = fontFamily2;
        this.fontFeatureSettings = str;
        this.letterSpacing = j3;
        this.baselineShift = baselineShift2;
        this.textGeometricTransform = textGeometricTransform2;
        this.localeList = localeList2;
        this.background = j4;
        this.textDecoration = textDecoration2;
        this.shadow = shadow2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MutableSpanStyle(long r20, long r22, androidx.compose.p002ui.text.font.FontWeight r24, androidx.compose.p002ui.text.font.FontStyle r25, androidx.compose.p002ui.text.font.FontSynthesis r26, androidx.compose.p002ui.text.font.FontFamily r27, java.lang.String r28, long r29, androidx.compose.p002ui.text.style.BaselineShift r31, androidx.compose.p002ui.text.style.TextGeometricTransform r32, androidx.compose.p002ui.text.intl.LocaleList r33, long r34, androidx.compose.p002ui.text.style.TextDecoration r36, androidx.compose.p002ui.graphics.Shadow r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r1 = r1.m35707getUnspecified0d7_KjU()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            androidx.compose.ui.unit.TextUnit$Companion r3 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r3 = r3.m38660getUnspecifiedXSAIIZE()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            androidx.compose.ui.unit.TextUnit$Companion r11 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r11 = r11.m38660getUnspecifiedXSAIIZE()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p002ui.graphics.Color.Companion
            long r16 = r6.m35707getUnspecified0d7_KjU()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.MutableSpanStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
