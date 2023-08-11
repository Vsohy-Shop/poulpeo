package androidx.compose.material3;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Typography.kt */
public final class Typography {
    private final TextStyle bodyLarge;
    private final TextStyle bodyMedium;
    private final TextStyle bodySmall;
    private final TextStyle displayLarge;
    private final TextStyle displayMedium;
    private final TextStyle displaySmall;
    private final TextStyle headlineLarge;
    private final TextStyle headlineMedium;
    private final TextStyle headlineSmall;
    private final TextStyle labelLarge;
    private final TextStyle labelMedium;
    private final TextStyle labelSmall;
    private final TextStyle titleLarge;
    private final TextStyle titleMedium;
    private final TextStyle titleSmall;

    public Typography() {
        this((TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i, Object obj) {
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
        TextStyle textStyle27;
        TextStyle textStyle28;
        TextStyle textStyle29;
        TextStyle textStyle30;
        Typography typography2 = typography;
        int i2 = i;
        if ((i2 & 1) != 0) {
            textStyle16 = typography2.displayLarge;
        } else {
            textStyle16 = textStyle;
        }
        if ((i2 & 2) != 0) {
            textStyle17 = typography2.displayMedium;
        } else {
            textStyle17 = textStyle2;
        }
        if ((i2 & 4) != 0) {
            textStyle18 = typography2.displaySmall;
        } else {
            textStyle18 = textStyle3;
        }
        if ((i2 & 8) != 0) {
            textStyle19 = typography2.headlineLarge;
        } else {
            textStyle19 = textStyle4;
        }
        if ((i2 & 16) != 0) {
            textStyle20 = typography2.headlineMedium;
        } else {
            textStyle20 = textStyle5;
        }
        if ((i2 & 32) != 0) {
            textStyle21 = typography2.headlineSmall;
        } else {
            textStyle21 = textStyle6;
        }
        if ((i2 & 64) != 0) {
            textStyle22 = typography2.titleLarge;
        } else {
            textStyle22 = textStyle7;
        }
        if ((i2 & 128) != 0) {
            textStyle23 = typography2.titleMedium;
        } else {
            textStyle23 = textStyle8;
        }
        if ((i2 & 256) != 0) {
            textStyle24 = typography2.titleSmall;
        } else {
            textStyle24 = textStyle9;
        }
        if ((i2 & 512) != 0) {
            textStyle25 = typography2.bodyLarge;
        } else {
            textStyle25 = textStyle10;
        }
        if ((i2 & 1024) != 0) {
            textStyle26 = typography2.bodyMedium;
        } else {
            textStyle26 = textStyle11;
        }
        if ((i2 & 2048) != 0) {
            textStyle27 = typography2.bodySmall;
        } else {
            textStyle27 = textStyle12;
        }
        if ((i2 & 4096) != 0) {
            textStyle28 = typography2.labelLarge;
        } else {
            textStyle28 = textStyle13;
        }
        if ((i2 & 8192) != 0) {
            textStyle29 = typography2.labelMedium;
        } else {
            textStyle29 = textStyle14;
        }
        if ((i2 & 16384) != 0) {
            textStyle30 = typography2.labelSmall;
        } else {
            textStyle30 = textStyle15;
        }
        return typography.copy(textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle30);
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        TextStyle textStyle16 = textStyle;
        C12775o.m28639i(textStyle16, "displayLarge");
        TextStyle textStyle17 = textStyle2;
        C12775o.m28639i(textStyle17, "displayMedium");
        TextStyle textStyle18 = textStyle3;
        C12775o.m28639i(textStyle18, "displaySmall");
        TextStyle textStyle19 = textStyle4;
        C12775o.m28639i(textStyle19, "headlineLarge");
        TextStyle textStyle20 = textStyle5;
        C12775o.m28639i(textStyle20, "headlineMedium");
        TextStyle textStyle21 = textStyle6;
        C12775o.m28639i(textStyle21, "headlineSmall");
        TextStyle textStyle22 = textStyle7;
        C12775o.m28639i(textStyle22, "titleLarge");
        TextStyle textStyle23 = textStyle8;
        C12775o.m28639i(textStyle23, "titleMedium");
        TextStyle textStyle24 = textStyle9;
        C12775o.m28639i(textStyle24, "titleSmall");
        TextStyle textStyle25 = textStyle10;
        C12775o.m28639i(textStyle25, "bodyLarge");
        TextStyle textStyle26 = textStyle11;
        C12775o.m28639i(textStyle26, "bodyMedium");
        TextStyle textStyle27 = textStyle12;
        C12775o.m28639i(textStyle27, "bodySmall");
        TextStyle textStyle28 = textStyle13;
        C12775o.m28639i(textStyle28, "labelLarge");
        TextStyle textStyle29 = textStyle14;
        C12775o.m28639i(textStyle29, "labelMedium");
        C12775o.m28639i(textStyle15, "labelSmall");
        return new Typography(textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (C12775o.m28634d(this.displayLarge, typography.displayLarge) && C12775o.m28634d(this.displayMedium, typography.displayMedium) && C12775o.m28634d(this.displaySmall, typography.displaySmall) && C12775o.m28634d(this.headlineLarge, typography.headlineLarge) && C12775o.m28634d(this.headlineMedium, typography.headlineMedium) && C12775o.m28634d(this.headlineSmall, typography.headlineSmall) && C12775o.m28634d(this.titleLarge, typography.titleLarge) && C12775o.m28634d(this.titleMedium, typography.titleMedium) && C12775o.m28634d(this.titleSmall, typography.titleSmall) && C12775o.m28634d(this.bodyLarge, typography.bodyLarge) && C12775o.m28634d(this.bodyMedium, typography.bodyMedium) && C12775o.m28634d(this.bodySmall, typography.bodySmall) && C12775o.m28634d(this.labelLarge, typography.labelLarge) && C12775o.m28634d(this.labelMedium, typography.labelMedium) && C12775o.m28634d(this.labelSmall, typography.labelSmall)) {
            return true;
        }
        return false;
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ')';
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        TextStyle textStyle16 = textStyle;
        TextStyle textStyle17 = textStyle2;
        TextStyle textStyle18 = textStyle3;
        TextStyle textStyle19 = textStyle4;
        TextStyle textStyle20 = textStyle5;
        TextStyle textStyle21 = textStyle6;
        TextStyle textStyle22 = textStyle7;
        TextStyle textStyle23 = textStyle8;
        TextStyle textStyle24 = textStyle9;
        TextStyle textStyle25 = textStyle10;
        TextStyle textStyle26 = textStyle11;
        TextStyle textStyle27 = textStyle12;
        TextStyle textStyle28 = textStyle13;
        TextStyle textStyle29 = textStyle14;
        TextStyle textStyle30 = textStyle15;
        C12775o.m28639i(textStyle16, "displayLarge");
        C12775o.m28639i(textStyle17, "displayMedium");
        C12775o.m28639i(textStyle18, "displaySmall");
        C12775o.m28639i(textStyle19, "headlineLarge");
        C12775o.m28639i(textStyle20, "headlineMedium");
        C12775o.m28639i(textStyle21, "headlineSmall");
        C12775o.m28639i(textStyle22, "titleLarge");
        C12775o.m28639i(textStyle23, "titleMedium");
        C12775o.m28639i(textStyle24, "titleSmall");
        C12775o.m28639i(textStyle25, "bodyLarge");
        C12775o.m28639i(textStyle26, "bodyMedium");
        C12775o.m28639i(textStyle27, "bodySmall");
        C12775o.m28639i(textStyle28, "labelLarge");
        C12775o.m28639i(textStyle29, "labelMedium");
        C12775o.m28639i(textStyle30, "labelSmall");
        this.displayLarge = textStyle16;
        this.displayMedium = textStyle17;
        this.displaySmall = textStyle18;
        this.headlineLarge = textStyle19;
        this.headlineMedium = textStyle20;
        this.headlineSmall = textStyle21;
        this.titleLarge = textStyle22;
        this.titleMedium = textStyle23;
        this.titleSmall = textStyle24;
        this.bodyLarge = textStyle25;
        this.bodyMedium = textStyle26;
        this.bodySmall = textStyle27;
        this.labelLarge = textStyle28;
        this.labelMedium = textStyle29;
        this.labelSmall = textStyle30;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Typography(androidx.compose.p002ui.text.TextStyle r16, androidx.compose.p002ui.text.TextStyle r17, androidx.compose.p002ui.text.TextStyle r18, androidx.compose.p002ui.text.TextStyle r19, androidx.compose.p002ui.text.TextStyle r20, androidx.compose.p002ui.text.TextStyle r21, androidx.compose.p002ui.text.TextStyle r22, androidx.compose.p002ui.text.TextStyle r23, androidx.compose.p002ui.text.TextStyle r24, androidx.compose.p002ui.text.TextStyle r25, androidx.compose.p002ui.text.TextStyle r26, androidx.compose.p002ui.text.TextStyle r27, androidx.compose.p002ui.text.TextStyle r28, androidx.compose.p002ui.text.TextStyle r29, androidx.compose.p002ui.text.TextStyle r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            androidx.compose.material3.tokens.TypographyTokens r1 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r1 = r1.getDisplayLarge()
            goto L_0x000f
        L_0x000d:
            r1 = r16
        L_0x000f:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001a
            androidx.compose.material3.tokens.TypographyTokens r2 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r2 = r2.getDisplayMedium()
            goto L_0x001c
        L_0x001a:
            r2 = r17
        L_0x001c:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0027
            androidx.compose.material3.tokens.TypographyTokens r3 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r3 = r3.getDisplaySmall()
            goto L_0x0029
        L_0x0027:
            r3 = r18
        L_0x0029:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0034
            androidx.compose.material3.tokens.TypographyTokens r4 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r4 = r4.getHeadlineLarge()
            goto L_0x0036
        L_0x0034:
            r4 = r19
        L_0x0036:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0041
            androidx.compose.material3.tokens.TypographyTokens r5 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r5 = r5.getHeadlineMedium()
            goto L_0x0043
        L_0x0041:
            r5 = r20
        L_0x0043:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x004e
            androidx.compose.material3.tokens.TypographyTokens r6 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r6 = r6.getHeadlineSmall()
            goto L_0x0050
        L_0x004e:
            r6 = r21
        L_0x0050:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x005b
            androidx.compose.material3.tokens.TypographyTokens r7 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r7 = r7.getTitleLarge()
            goto L_0x005d
        L_0x005b:
            r7 = r22
        L_0x005d:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0068
            androidx.compose.material3.tokens.TypographyTokens r8 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r8 = r8.getTitleMedium()
            goto L_0x006a
        L_0x0068:
            r8 = r23
        L_0x006a:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0075
            androidx.compose.material3.tokens.TypographyTokens r9 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r9 = r9.getTitleSmall()
            goto L_0x0077
        L_0x0075:
            r9 = r24
        L_0x0077:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0082
            androidx.compose.material3.tokens.TypographyTokens r10 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r10 = r10.getBodyLarge()
            goto L_0x0084
        L_0x0082:
            r10 = r25
        L_0x0084:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x008f
            androidx.compose.material3.tokens.TypographyTokens r11 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r11 = r11.getBodyMedium()
            goto L_0x0091
        L_0x008f:
            r11 = r26
        L_0x0091:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x009c
            androidx.compose.material3.tokens.TypographyTokens r12 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r12 = r12.getBodySmall()
            goto L_0x009e
        L_0x009c:
            r12 = r27
        L_0x009e:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x00a9
            androidx.compose.material3.tokens.TypographyTokens r13 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r13 = r13.getLabelLarge()
            goto L_0x00ab
        L_0x00a9:
            r13 = r28
        L_0x00ab:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x00b6
            androidx.compose.material3.tokens.TypographyTokens r14 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r14 = r14.getLabelMedium()
            goto L_0x00b8
        L_0x00b6:
            r14 = r29
        L_0x00b8:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00c3
            androidx.compose.material3.tokens.TypographyTokens r0 = androidx.compose.material3.tokens.TypographyTokens.INSTANCE
            androidx.compose.ui.text.TextStyle r0 = r0.getLabelSmall()
            goto L_0x00c5
        L_0x00c3:
            r0 = r30
        L_0x00c5:
            r16 = r15
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Typography.<init>(androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
