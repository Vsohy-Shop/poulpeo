package androidx.compose.material;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
/* compiled from: Typography.kt */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;

    /* renamed from: h1 */
    private final TextStyle f247h1;

    /* renamed from: h2 */
    private final TextStyle f248h2;

    /* renamed from: h3 */
    private final TextStyle f249h3;

    /* renamed from: h4 */
    private final TextStyle f250h4;

    /* renamed from: h5 */
    private final TextStyle f251h5;

    /* renamed from: h6 */
    private final TextStyle f252h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        C12775o.m28639i(textStyle, "h1");
        C12775o.m28639i(textStyle2, "h2");
        C12775o.m28639i(textStyle3, "h3");
        C12775o.m28639i(textStyle4, "h4");
        C12775o.m28639i(textStyle5, "h5");
        C12775o.m28639i(textStyle6, "h6");
        C12775o.m28639i(textStyle7, "subtitle1");
        C12775o.m28639i(textStyle8, "subtitle2");
        C12775o.m28639i(textStyle9, "body1");
        C12775o.m28639i(textStyle10, "body2");
        C12775o.m28639i(textStyle11, "button");
        C12775o.m28639i(textStyle12, "caption");
        C12775o.m28639i(textStyle13, "overline");
        this.f247h1 = textStyle;
        this.f248h2 = textStyle2;
        this.f249h3 = textStyle3;
        this.f250h4 = textStyle4;
        this.f251h5 = textStyle5;
        this.f252h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, Object obj) {
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        Typography typography2 = typography;
        int i2 = i;
        if ((i2 & 1) != 0) {
            textStyle14 = typography2.f247h1;
        } else {
            textStyle14 = textStyle;
        }
        if ((i2 & 2) != 0) {
            textStyle15 = typography2.f248h2;
        } else {
            textStyle15 = textStyle2;
        }
        if ((i2 & 4) != 0) {
            textStyle16 = typography2.f249h3;
        } else {
            textStyle16 = textStyle3;
        }
        if ((i2 & 8) != 0) {
            textStyle17 = typography2.f250h4;
        } else {
            textStyle17 = textStyle4;
        }
        if ((i2 & 16) != 0) {
            textStyle18 = typography2.f251h5;
        } else {
            textStyle18 = textStyle5;
        }
        if ((i2 & 32) != 0) {
            textStyle19 = typography2.f252h6;
        } else {
            textStyle19 = textStyle6;
        }
        if ((i2 & 64) != 0) {
            textStyle20 = typography2.subtitle1;
        } else {
            textStyle20 = textStyle7;
        }
        if ((i2 & 128) != 0) {
            textStyle21 = typography2.subtitle2;
        } else {
            textStyle21 = textStyle8;
        }
        if ((i2 & 256) != 0) {
            textStyle22 = typography2.body1;
        } else {
            textStyle22 = textStyle9;
        }
        if ((i2 & 512) != 0) {
            textStyle23 = typography2.body2;
        } else {
            textStyle23 = textStyle10;
        }
        if ((i2 & 1024) != 0) {
            textStyle24 = typography2.button;
        } else {
            textStyle24 = textStyle11;
        }
        if ((i2 & 2048) != 0) {
            textStyle25 = typography2.caption;
        } else {
            textStyle25 = textStyle12;
        }
        if ((i2 & 4096) != 0) {
            textStyle26 = typography2.overline;
        } else {
            textStyle26 = textStyle13;
        }
        return typography.copy(textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26);
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        TextStyle textStyle14 = textStyle;
        C12775o.m28639i(textStyle14, "h1");
        TextStyle textStyle15 = textStyle2;
        C12775o.m28639i(textStyle15, "h2");
        TextStyle textStyle16 = textStyle3;
        C12775o.m28639i(textStyle16, "h3");
        TextStyle textStyle17 = textStyle4;
        C12775o.m28639i(textStyle17, "h4");
        TextStyle textStyle18 = textStyle5;
        C12775o.m28639i(textStyle18, "h5");
        TextStyle textStyle19 = textStyle6;
        C12775o.m28639i(textStyle19, "h6");
        TextStyle textStyle20 = textStyle7;
        C12775o.m28639i(textStyle20, "subtitle1");
        TextStyle textStyle21 = textStyle8;
        C12775o.m28639i(textStyle21, "subtitle2");
        TextStyle textStyle22 = textStyle9;
        C12775o.m28639i(textStyle22, "body1");
        TextStyle textStyle23 = textStyle10;
        C12775o.m28639i(textStyle23, "body2");
        TextStyle textStyle24 = textStyle11;
        C12775o.m28639i(textStyle24, "button");
        TextStyle textStyle25 = textStyle12;
        C12775o.m28639i(textStyle25, "caption");
        TextStyle textStyle26 = textStyle13;
        C12775o.m28639i(textStyle26, "overline");
        return new Typography(textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (C12775o.m28634d(this.f247h1, typography.f247h1) && C12775o.m28634d(this.f248h2, typography.f248h2) && C12775o.m28634d(this.f249h3, typography.f249h3) && C12775o.m28634d(this.f250h4, typography.f250h4) && C12775o.m28634d(this.f251h5, typography.f251h5) && C12775o.m28634d(this.f252h6, typography.f252h6) && C12775o.m28634d(this.subtitle1, typography.subtitle1) && C12775o.m28634d(this.subtitle2, typography.subtitle2) && C12775o.m28634d(this.body1, typography.body1) && C12775o.m28634d(this.body2, typography.body2) && C12775o.m28634d(this.button, typography.button) && C12775o.m28634d(this.caption, typography.caption) && C12775o.m28634d(this.overline, typography.overline)) {
            return true;
        }
        return false;
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getH1() {
        return this.f247h1;
    }

    public final TextStyle getH2() {
        return this.f248h2;
    }

    public final TextStyle getH3() {
        return this.f249h3;
    }

    public final TextStyle getH4() {
        return this.f250h4;
    }

    public final TextStyle getH5() {
        return this.f251h5;
    }

    public final TextStyle getH6() {
        return this.f252h6;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f247h1.hashCode() * 31) + this.f248h2.hashCode()) * 31) + this.f249h3.hashCode()) * 31) + this.f250h4.hashCode()) * 31) + this.f251h5.hashCode()) * 31) + this.f252h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.f247h1 + ", h2=" + this.f248h2 + ", h3=" + this.f249h3 + ", h4=" + this.f250h4 + ", h5=" + this.f251h5 + ", h6=" + this.f252h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Typography(androidx.compose.p002ui.text.font.FontFamily r46, androidx.compose.p002ui.text.TextStyle r47, androidx.compose.p002ui.text.TextStyle r48, androidx.compose.p002ui.text.TextStyle r49, androidx.compose.p002ui.text.TextStyle r50, androidx.compose.p002ui.text.TextStyle r51, androidx.compose.p002ui.text.TextStyle r52, androidx.compose.p002ui.text.TextStyle r53, androidx.compose.p002ui.text.TextStyle r54, androidx.compose.p002ui.text.TextStyle r55, androidx.compose.p002ui.text.TextStyle r56, androidx.compose.p002ui.text.TextStyle r57, androidx.compose.p002ui.text.TextStyle r58, androidx.compose.p002ui.text.TextStyle r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r45 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.ui.text.font.FontFamily$Companion r1 = androidx.compose.p002ui.text.font.FontFamily.Companion
            androidx.compose.ui.text.font.SystemFontFamily r1 = r1.getDefault()
            goto L_0x000f
        L_0x000d:
            r1 = r46
        L_0x000f:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0052
            androidx.compose.ui.text.font.FontWeight$Companion r2 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r8 = r2.getLight()
            r2 = 96
            long r6 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r2)
            r2 = -4613937818241073152(0xbff8000000000000, double:-1.5)
            long r13 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r2)
            androidx.compose.ui.text.TextStyle r2 = new androidx.compose.ui.text.TextStyle
            r3 = r2
            r4 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 4194169(0x3fff79, float:5.877283E-39)
            r32 = 0
            r3.<init>((long) r4, (long) r6, (androidx.compose.p002ui.text.font.FontWeight) r8, (androidx.compose.p002ui.text.font.FontStyle) r9, (androidx.compose.p002ui.text.font.FontSynthesis) r10, (androidx.compose.p002ui.text.font.FontFamily) r11, (java.lang.String) r12, (long) r13, (androidx.compose.p002ui.text.style.BaselineShift) r15, (androidx.compose.p002ui.text.style.TextGeometricTransform) r16, (androidx.compose.p002ui.text.intl.LocaleList) r17, (long) r18, (androidx.compose.p002ui.text.style.TextDecoration) r20, (androidx.compose.p002ui.graphics.Shadow) r21, (androidx.compose.p002ui.text.style.TextAlign) r22, (androidx.compose.p002ui.text.style.TextDirection) r23, (long) r24, (androidx.compose.p002ui.text.style.TextIndent) r26, (androidx.compose.p002ui.text.PlatformTextStyle) r27, (androidx.compose.p002ui.text.style.LineHeightStyle) r28, (androidx.compose.p002ui.text.style.LineBreak) r29, (androidx.compose.p002ui.text.style.Hyphens) r30, (int) r31, (kotlin.jvm.internal.DefaultConstructorMarker) r32)
            goto L_0x0054
        L_0x0052:
            r2 = r47
        L_0x0054:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0098
            androidx.compose.ui.text.font.FontWeight$Companion r3 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r3.getLight()
            r3 = 60
            long r7 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r3)
            r3 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            long r14 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r3)
            androidx.compose.ui.text.TextStyle r3 = new androidx.compose.ui.text.TextStyle
            r4 = r3
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 4194169(0x3fff79, float:5.877283E-39)
            r33 = 0
            r4.<init>((long) r5, (long) r7, (androidx.compose.p002ui.text.font.FontWeight) r9, (androidx.compose.p002ui.text.font.FontStyle) r10, (androidx.compose.p002ui.text.font.FontSynthesis) r11, (androidx.compose.p002ui.text.font.FontFamily) r12, (java.lang.String) r13, (long) r14, (androidx.compose.p002ui.text.style.BaselineShift) r16, (androidx.compose.p002ui.text.style.TextGeometricTransform) r17, (androidx.compose.p002ui.text.intl.LocaleList) r18, (long) r19, (androidx.compose.p002ui.text.style.TextDecoration) r21, (androidx.compose.p002ui.graphics.Shadow) r22, (androidx.compose.p002ui.text.style.TextAlign) r23, (androidx.compose.p002ui.text.style.TextDirection) r24, (long) r25, (androidx.compose.p002ui.text.style.TextIndent) r27, (androidx.compose.p002ui.text.PlatformTextStyle) r28, (androidx.compose.p002ui.text.style.LineHeightStyle) r29, (androidx.compose.p002ui.text.style.LineBreak) r30, (androidx.compose.p002ui.text.style.Hyphens) r31, (int) r32, (kotlin.jvm.internal.DefaultConstructorMarker) r33)
            goto L_0x009a
        L_0x0098:
            r3 = r48
        L_0x009a:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x00dd
            androidx.compose.ui.text.font.FontWeight$Companion r4 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r11 = r4.getNormal()
            r4 = 48
            long r9 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r4)
            long r16 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r5)
            androidx.compose.ui.text.TextStyle r4 = new androidx.compose.ui.text.TextStyle
            r6 = r4
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 4194169(0x3fff79, float:5.877283E-39)
            r35 = 0
            r6.<init>((long) r7, (long) r9, (androidx.compose.p002ui.text.font.FontWeight) r11, (androidx.compose.p002ui.text.font.FontStyle) r12, (androidx.compose.p002ui.text.font.FontSynthesis) r13, (androidx.compose.p002ui.text.font.FontFamily) r14, (java.lang.String) r15, (long) r16, (androidx.compose.p002ui.text.style.BaselineShift) r18, (androidx.compose.p002ui.text.style.TextGeometricTransform) r19, (androidx.compose.p002ui.text.intl.LocaleList) r20, (long) r21, (androidx.compose.p002ui.text.style.TextDecoration) r23, (androidx.compose.p002ui.graphics.Shadow) r24, (androidx.compose.p002ui.text.style.TextAlign) r25, (androidx.compose.p002ui.text.style.TextDirection) r26, (long) r27, (androidx.compose.p002ui.text.style.TextIndent) r29, (androidx.compose.p002ui.text.PlatformTextStyle) r30, (androidx.compose.p002ui.text.style.LineHeightStyle) r31, (androidx.compose.p002ui.text.style.LineBreak) r32, (androidx.compose.p002ui.text.style.Hyphens) r33, (int) r34, (kotlin.jvm.internal.DefaultConstructorMarker) r35)
            goto L_0x00df
        L_0x00dd:
            r4 = r49
        L_0x00df:
            r6 = r0 & 16
            r7 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            if (r6 == 0) goto L_0x0126
            androidx.compose.ui.text.font.FontWeight$Companion r6 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r14 = r6.getNormal()
            r6 = 34
            long r12 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r6)
            long r19 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r7)
            androidx.compose.ui.text.TextStyle r6 = new androidx.compose.ui.text.TextStyle
            r9 = r6
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 4194169(0x3fff79, float:5.877283E-39)
            r38 = 0
            r9.<init>((long) r10, (long) r12, (androidx.compose.p002ui.text.font.FontWeight) r14, (androidx.compose.p002ui.text.font.FontStyle) r15, (androidx.compose.p002ui.text.font.FontSynthesis) r16, (androidx.compose.p002ui.text.font.FontFamily) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p002ui.text.style.BaselineShift) r21, (androidx.compose.p002ui.text.style.TextGeometricTransform) r22, (androidx.compose.p002ui.text.intl.LocaleList) r23, (long) r24, (androidx.compose.p002ui.text.style.TextDecoration) r26, (androidx.compose.p002ui.graphics.Shadow) r27, (androidx.compose.p002ui.text.style.TextAlign) r28, (androidx.compose.p002ui.text.style.TextDirection) r29, (long) r30, (androidx.compose.p002ui.text.style.TextIndent) r32, (androidx.compose.p002ui.text.PlatformTextStyle) r33, (androidx.compose.p002ui.text.style.LineHeightStyle) r34, (androidx.compose.p002ui.text.style.LineBreak) r35, (androidx.compose.p002ui.text.style.Hyphens) r36, (int) r37, (kotlin.jvm.internal.DefaultConstructorMarker) r38)
            goto L_0x0128
        L_0x0126:
            r6 = r50
        L_0x0128:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x016e
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r15 = r9.getNormal()
            r9 = 24
            long r13 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r9)
            long r20 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r5)
            androidx.compose.ui.text.TextStyle r5 = new androidx.compose.ui.text.TextStyle
            r10 = r5
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 4194169(0x3fff79, float:5.877283E-39)
            r39 = 0
            r10.<init>((long) r11, (long) r13, (androidx.compose.p002ui.text.font.FontWeight) r15, (androidx.compose.p002ui.text.font.FontStyle) r16, (androidx.compose.p002ui.text.font.FontSynthesis) r17, (androidx.compose.p002ui.text.font.FontFamily) r18, (java.lang.String) r19, (long) r20, (androidx.compose.p002ui.text.style.BaselineShift) r22, (androidx.compose.p002ui.text.style.TextGeometricTransform) r23, (androidx.compose.p002ui.text.intl.LocaleList) r24, (long) r25, (androidx.compose.p002ui.text.style.TextDecoration) r27, (androidx.compose.p002ui.graphics.Shadow) r28, (androidx.compose.p002ui.text.style.TextAlign) r29, (androidx.compose.p002ui.text.style.TextDirection) r30, (long) r31, (androidx.compose.p002ui.text.style.TextIndent) r33, (androidx.compose.p002ui.text.PlatformTextStyle) r34, (androidx.compose.p002ui.text.style.LineHeightStyle) r35, (androidx.compose.p002ui.text.style.LineBreak) r36, (androidx.compose.p002ui.text.style.Hyphens) r37, (int) r38, (kotlin.jvm.internal.DefaultConstructorMarker) r39)
            goto L_0x0170
        L_0x016e:
            r5 = r51
        L_0x0170:
            r9 = r0 & 64
            r10 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            if (r9 == 0) goto L_0x01bb
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r17 = r9.getMedium()
            r9 = 20
            long r15 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r9)
            long r22 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r10)
            androidx.compose.ui.text.TextStyle r9 = new androidx.compose.ui.text.TextStyle
            r12 = r9
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 4194169(0x3fff79, float:5.877283E-39)
            r41 = 0
            r12.<init>((long) r13, (long) r15, (androidx.compose.p002ui.text.font.FontWeight) r17, (androidx.compose.p002ui.text.font.FontStyle) r18, (androidx.compose.p002ui.text.font.FontSynthesis) r19, (androidx.compose.p002ui.text.font.FontFamily) r20, (java.lang.String) r21, (long) r22, (androidx.compose.p002ui.text.style.BaselineShift) r24, (androidx.compose.p002ui.text.style.TextGeometricTransform) r25, (androidx.compose.p002ui.text.intl.LocaleList) r26, (long) r27, (androidx.compose.p002ui.text.style.TextDecoration) r29, (androidx.compose.p002ui.graphics.Shadow) r30, (androidx.compose.p002ui.text.style.TextAlign) r31, (androidx.compose.p002ui.text.style.TextDirection) r32, (long) r33, (androidx.compose.p002ui.text.style.TextIndent) r35, (androidx.compose.p002ui.text.PlatformTextStyle) r36, (androidx.compose.p002ui.text.style.LineHeightStyle) r37, (androidx.compose.p002ui.text.style.LineBreak) r38, (androidx.compose.p002ui.text.style.Hyphens) r39, (int) r40, (kotlin.jvm.internal.DefaultConstructorMarker) r41)
            goto L_0x01bd
        L_0x01bb:
            r9 = r52
        L_0x01bd:
            r12 = r0 & 128(0x80, float:1.794E-43)
            r13 = 16
            if (r12 == 0) goto L_0x0203
            androidx.compose.ui.text.font.FontWeight$Companion r12 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r19 = r12.getNormal()
            long r17 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r13)
            long r24 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r10)
            androidx.compose.ui.text.TextStyle r10 = new androidx.compose.ui.text.TextStyle
            r14 = r10
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 4194169(0x3fff79, float:5.877283E-39)
            r43 = 0
            r14.<init>((long) r15, (long) r17, (androidx.compose.p002ui.text.font.FontWeight) r19, (androidx.compose.p002ui.text.font.FontStyle) r20, (androidx.compose.p002ui.text.font.FontSynthesis) r21, (androidx.compose.p002ui.text.font.FontFamily) r22, (java.lang.String) r23, (long) r24, (androidx.compose.p002ui.text.style.BaselineShift) r26, (androidx.compose.p002ui.text.style.TextGeometricTransform) r27, (androidx.compose.p002ui.text.intl.LocaleList) r28, (long) r29, (androidx.compose.p002ui.text.style.TextDecoration) r31, (androidx.compose.p002ui.graphics.Shadow) r32, (androidx.compose.p002ui.text.style.TextAlign) r33, (androidx.compose.p002ui.text.style.TextDirection) r34, (long) r35, (androidx.compose.p002ui.text.style.TextIndent) r37, (androidx.compose.p002ui.text.PlatformTextStyle) r38, (androidx.compose.p002ui.text.style.LineHeightStyle) r39, (androidx.compose.p002ui.text.style.LineBreak) r40, (androidx.compose.p002ui.text.style.Hyphens) r41, (int) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            goto L_0x0205
        L_0x0203:
            r10 = r53
        L_0x0205:
            r11 = r0 & 256(0x100, float:3.59E-43)
            r12 = 14
            if (r11 == 0) goto L_0x0250
            androidx.compose.ui.text.font.FontWeight$Companion r11 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r19 = r11.getMedium()
            long r17 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r12)
            r14 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            long r24 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r14)
            androidx.compose.ui.text.TextStyle r11 = new androidx.compose.ui.text.TextStyle
            r14 = r11
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 4194169(0x3fff79, float:5.877283E-39)
            r43 = 0
            r14.<init>((long) r15, (long) r17, (androidx.compose.p002ui.text.font.FontWeight) r19, (androidx.compose.p002ui.text.font.FontStyle) r20, (androidx.compose.p002ui.text.font.FontSynthesis) r21, (androidx.compose.p002ui.text.font.FontFamily) r22, (java.lang.String) r23, (long) r24, (androidx.compose.p002ui.text.style.BaselineShift) r26, (androidx.compose.p002ui.text.style.TextGeometricTransform) r27, (androidx.compose.p002ui.text.intl.LocaleList) r28, (long) r29, (androidx.compose.p002ui.text.style.TextDecoration) r31, (androidx.compose.p002ui.graphics.Shadow) r32, (androidx.compose.p002ui.text.style.TextAlign) r33, (androidx.compose.p002ui.text.style.TextDirection) r34, (long) r35, (androidx.compose.p002ui.text.style.TextIndent) r37, (androidx.compose.p002ui.text.PlatformTextStyle) r38, (androidx.compose.p002ui.text.style.LineHeightStyle) r39, (androidx.compose.p002ui.text.style.LineBreak) r40, (androidx.compose.p002ui.text.style.Hyphens) r41, (int) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            goto L_0x0252
        L_0x0250:
            r11 = r54
        L_0x0252:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0298
            androidx.compose.ui.text.font.FontWeight$Companion r14 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r20 = r14.getNormal()
            long r18 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r13)
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            long r25 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r13)
            androidx.compose.ui.text.TextStyle r13 = new androidx.compose.ui.text.TextStyle
            r15 = r13
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 4194169(0x3fff79, float:5.877283E-39)
            r44 = 0
            r15.<init>((long) r16, (long) r18, (androidx.compose.p002ui.text.font.FontWeight) r20, (androidx.compose.p002ui.text.font.FontStyle) r21, (androidx.compose.p002ui.text.font.FontSynthesis) r22, (androidx.compose.p002ui.text.font.FontFamily) r23, (java.lang.String) r24, (long) r25, (androidx.compose.p002ui.text.style.BaselineShift) r27, (androidx.compose.p002ui.text.style.TextGeometricTransform) r28, (androidx.compose.p002ui.text.intl.LocaleList) r29, (long) r30, (androidx.compose.p002ui.text.style.TextDecoration) r32, (androidx.compose.p002ui.graphics.Shadow) r33, (androidx.compose.p002ui.text.style.TextAlign) r34, (androidx.compose.p002ui.text.style.TextDirection) r35, (long) r36, (androidx.compose.p002ui.text.style.TextIndent) r38, (androidx.compose.p002ui.text.PlatformTextStyle) r39, (androidx.compose.p002ui.text.style.LineHeightStyle) r40, (androidx.compose.p002ui.text.style.LineBreak) r41, (androidx.compose.p002ui.text.style.Hyphens) r42, (int) r43, (kotlin.jvm.internal.DefaultConstructorMarker) r44)
            goto L_0x029a
        L_0x0298:
            r13 = r55
        L_0x029a:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x02de
            androidx.compose.ui.text.font.FontWeight$Companion r14 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r20 = r14.getNormal()
            long r18 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r12)
            long r25 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r7)
            androidx.compose.ui.text.TextStyle r7 = new androidx.compose.ui.text.TextStyle
            r15 = r7
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 4194169(0x3fff79, float:5.877283E-39)
            r44 = 0
            r15.<init>((long) r16, (long) r18, (androidx.compose.p002ui.text.font.FontWeight) r20, (androidx.compose.p002ui.text.font.FontStyle) r21, (androidx.compose.p002ui.text.font.FontSynthesis) r22, (androidx.compose.p002ui.text.font.FontFamily) r23, (java.lang.String) r24, (long) r25, (androidx.compose.p002ui.text.style.BaselineShift) r27, (androidx.compose.p002ui.text.style.TextGeometricTransform) r28, (androidx.compose.p002ui.text.intl.LocaleList) r29, (long) r30, (androidx.compose.p002ui.text.style.TextDecoration) r32, (androidx.compose.p002ui.graphics.Shadow) r33, (androidx.compose.p002ui.text.style.TextAlign) r34, (androidx.compose.p002ui.text.style.TextDirection) r35, (long) r36, (androidx.compose.p002ui.text.style.TextIndent) r38, (androidx.compose.p002ui.text.PlatformTextStyle) r39, (androidx.compose.p002ui.text.style.LineHeightStyle) r40, (androidx.compose.p002ui.text.style.LineBreak) r41, (androidx.compose.p002ui.text.style.Hyphens) r42, (int) r43, (kotlin.jvm.internal.DefaultConstructorMarker) r44)
            goto L_0x02e0
        L_0x02de:
            r7 = r56
        L_0x02e0:
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0326
            androidx.compose.ui.text.font.FontWeight$Companion r8 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r19 = r8.getMedium()
            long r17 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r12)
            r14 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            long r24 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r14)
            androidx.compose.ui.text.TextStyle r8 = new androidx.compose.ui.text.TextStyle
            r14 = r8
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 4194169(0x3fff79, float:5.877283E-39)
            r43 = 0
            r14.<init>((long) r15, (long) r17, (androidx.compose.p002ui.text.font.FontWeight) r19, (androidx.compose.p002ui.text.font.FontStyle) r20, (androidx.compose.p002ui.text.font.FontSynthesis) r21, (androidx.compose.p002ui.text.font.FontFamily) r22, (java.lang.String) r23, (long) r24, (androidx.compose.p002ui.text.style.BaselineShift) r26, (androidx.compose.p002ui.text.style.TextGeometricTransform) r27, (androidx.compose.p002ui.text.intl.LocaleList) r28, (long) r29, (androidx.compose.p002ui.text.style.TextDecoration) r31, (androidx.compose.p002ui.graphics.Shadow) r32, (androidx.compose.p002ui.text.style.TextAlign) r33, (androidx.compose.p002ui.text.style.TextDirection) r34, (long) r35, (androidx.compose.p002ui.text.style.TextIndent) r37, (androidx.compose.p002ui.text.PlatformTextStyle) r38, (androidx.compose.p002ui.text.style.LineHeightStyle) r39, (androidx.compose.p002ui.text.style.LineBreak) r40, (androidx.compose.p002ui.text.style.Hyphens) r41, (int) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            goto L_0x0328
        L_0x0326:
            r8 = r57
        L_0x0328:
            r12 = r0 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0373
            androidx.compose.ui.text.font.FontWeight$Companion r12 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r19 = r12.getNormal()
            r12 = 12
            long r17 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r12)
            r14 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            long r24 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r14)
            androidx.compose.ui.text.TextStyle r12 = new androidx.compose.ui.text.TextStyle
            r14 = r12
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 4194169(0x3fff79, float:5.877283E-39)
            r43 = 0
            r14.<init>((long) r15, (long) r17, (androidx.compose.p002ui.text.font.FontWeight) r19, (androidx.compose.p002ui.text.font.FontStyle) r20, (androidx.compose.p002ui.text.font.FontSynthesis) r21, (androidx.compose.p002ui.text.font.FontFamily) r22, (java.lang.String) r23, (long) r24, (androidx.compose.p002ui.text.style.BaselineShift) r26, (androidx.compose.p002ui.text.style.TextGeometricTransform) r27, (androidx.compose.p002ui.text.intl.LocaleList) r28, (long) r29, (androidx.compose.p002ui.text.style.TextDecoration) r31, (androidx.compose.p002ui.graphics.Shadow) r32, (androidx.compose.p002ui.text.style.TextAlign) r33, (androidx.compose.p002ui.text.style.TextDirection) r34, (long) r35, (androidx.compose.p002ui.text.style.TextIndent) r37, (androidx.compose.p002ui.text.PlatformTextStyle) r38, (androidx.compose.p002ui.text.style.LineHeightStyle) r39, (androidx.compose.p002ui.text.style.LineBreak) r40, (androidx.compose.p002ui.text.style.Hyphens) r41, (int) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            goto L_0x0375
        L_0x0373:
            r12 = r58
        L_0x0375:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x03bd
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r19 = r0.getNormal()
            r0 = 10
            long r17 = androidx.compose.p002ui.unit.TextUnitKt.getSp((int) r0)
            r14 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            long r24 = androidx.compose.p002ui.unit.TextUnitKt.getSp((double) r14)
            androidx.compose.ui.text.TextStyle r0 = new androidx.compose.ui.text.TextStyle
            r14 = r0
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 4194169(0x3fff79, float:5.877283E-39)
            r43 = 0
            r14.<init>((long) r15, (long) r17, (androidx.compose.p002ui.text.font.FontWeight) r19, (androidx.compose.p002ui.text.font.FontStyle) r20, (androidx.compose.p002ui.text.font.FontSynthesis) r21, (androidx.compose.p002ui.text.font.FontFamily) r22, (java.lang.String) r23, (long) r24, (androidx.compose.p002ui.text.style.BaselineShift) r26, (androidx.compose.p002ui.text.style.TextGeometricTransform) r27, (androidx.compose.p002ui.text.intl.LocaleList) r28, (long) r29, (androidx.compose.p002ui.text.style.TextDecoration) r31, (androidx.compose.p002ui.graphics.Shadow) r32, (androidx.compose.p002ui.text.style.TextAlign) r33, (androidx.compose.p002ui.text.style.TextDirection) r34, (long) r35, (androidx.compose.p002ui.text.style.TextIndent) r37, (androidx.compose.p002ui.text.PlatformTextStyle) r38, (androidx.compose.p002ui.text.style.LineHeightStyle) r39, (androidx.compose.p002ui.text.style.LineBreak) r40, (androidx.compose.p002ui.text.style.Hyphens) r41, (int) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            goto L_0x03bf
        L_0x03bd:
            r0 = r59
        L_0x03bf:
            r46 = r45
            r47 = r1
            r48 = r2
            r49 = r3
            r50 = r4
            r51 = r6
            r52 = r5
            r53 = r9
            r54 = r10
            r55 = r11
            r56 = r13
            r57 = r7
            r58 = r8
            r59 = r12
            r60 = r0
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Typography(androidx.compose.p002ui.text.font.FontFamily r2, androidx.compose.p002ui.text.TextStyle r3, androidx.compose.p002ui.text.TextStyle r4, androidx.compose.p002ui.text.TextStyle r5, androidx.compose.p002ui.text.TextStyle r6, androidx.compose.p002ui.text.TextStyle r7, androidx.compose.p002ui.text.TextStyle r8, androidx.compose.p002ui.text.TextStyle r9, androidx.compose.p002ui.text.TextStyle r10, androidx.compose.p002ui.text.TextStyle r11, androidx.compose.p002ui.text.TextStyle r12, androidx.compose.p002ui.text.TextStyle r13, androidx.compose.p002ui.text.TextStyle r14, androidx.compose.p002ui.text.TextStyle r15) {
        /*
            r1 = this;
            java.lang.String r0 = "defaultFontFamily"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "h1"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "h2"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "h3"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "h4"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.String r0 = "h5"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "h6"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "subtitle1"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "subtitle2"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "body1"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "body2"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "button"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "caption"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "overline"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r3, r2)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r4, r2)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r5, r2)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r6, r2)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r7, r2)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r8, r2)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r9, r2)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r10, r2)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r11, r2)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r12, r2)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r13, r2)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r14, r2)
            androidx.compose.ui.text.TextStyle r15 = androidx.compose.material.TypographyKt.withDefaultFontFamily(r15, r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
