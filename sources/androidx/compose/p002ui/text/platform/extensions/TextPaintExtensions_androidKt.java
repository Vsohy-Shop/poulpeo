package androidx.compose.p002ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.platform.AndroidTextPaint;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextMotion;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitType;
import kotlin.jvm.internal.C12775o;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt */
/* compiled from: TextPaintExtensions.android.kt */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, C13090q<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> qVar, Density density, boolean z) {
        boolean z2;
        int i;
        int i2;
        C12775o.m28639i(androidTextPaint, "<this>");
        C12775o.m28639i(spanStyle, "style");
        C12775o.m28639i(qVar, "resolveTypeface");
        C12775o.m28639i(density, "density");
        long r0 = TextUnit.m38648getTypeUIouoOA(spanStyle.m37936getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.m38448toPxR2X_6o(spanStyle.m37936getFontSizeXSAIIZE()));
        } else if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m38649getValueimpl(spanStyle.m37936getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle r3 = spanStyle.m37937getFontStyle4Lr2A7w();
            if (r3 != null) {
                i = r3.m38066unboximpl();
            } else {
                i = FontStyle.Companion.m38068getNormal_LCdwA();
            }
            FontStyle r32 = FontStyle.m38060boximpl(i);
            FontSynthesis r4 = spanStyle.m37938getFontSynthesisZQGJjVo();
            if (r4 != null) {
                i2 = r4.m38077unboximpl();
            } else {
                i2 = FontSynthesis.Companion.m38078getAllGVVA2EU();
            }
            androidTextPaint.setTypeface((Typeface) qVar.invoke(fontFamily, fontWeight, r32, FontSynthesis.m38069boximpl(i2)));
        }
        if (spanStyle.getLocaleList() != null && !C12775o.m28634d(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !C12775o.m28634d(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !C12775o.m28634d(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m38215setColor8_81llA(spanStyle.m37935getColor0d7_KjU());
        androidTextPaint.m38214setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m35499getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(spanStyle.m37939getLetterSpacingXSAIIZE()), companion.m38682getSpUIouoOA())) {
            boolean z3 = true;
            if (TextUnit.m38649getValueimpl(spanStyle.m37939getLetterSpacingXSAIIZE()) == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
                float r9 = density.m38448toPxR2X_6o(spanStyle.m37939getLetterSpacingXSAIIZE());
                if (textSize != 0.0f) {
                    z3 = false;
                }
                if (!z3) {
                    androidTextPaint.setLetterSpacing(r9 / textSize);
                }
                return m38231generateFallbackSpanStyle62GTOB8(spanStyle.m37939getLetterSpacingXSAIIZE(), z, spanStyle.m37933getBackground0d7_KjU(), spanStyle.m37934getBaselineShift5SSeXJ0());
            }
        }
        if (TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(spanStyle.m37939getLetterSpacingXSAIIZE()), companion.m38681getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m38649getValueimpl(spanStyle.m37939getLetterSpacingXSAIIZE()));
        }
        return m38231generateFallbackSpanStyle62GTOB8(spanStyle.m37939getLetterSpacingXSAIIZE(), z, spanStyle.m37933getBackground0d7_KjU(), spanStyle.m37934getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, C13090q qVar, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, qVar, density, z);
    }

    public static final float correctBlurRadius(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (androidx.compose.p002ui.text.style.BaselineShift.m38239equalsimpl0(r35.m38242unboximpl(), androidx.compose.p002ui.text.style.BaselineShift.Companion.m38246getNoney9eOQZs()) == false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* renamed from: generateFallbackSpanStyle-62GTOB8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.p002ui.text.SpanStyle m38231generateFallbackSpanStyle62GTOB8(long r30, boolean r32, long r33, androidx.compose.p002ui.text.style.BaselineShift r35) {
        /*
            r0 = r33
            r2 = 1
            r3 = 0
            if (r32 == 0) goto L_0x0026
            long r4 = androidx.compose.p002ui.unit.TextUnit.m38648getTypeUIouoOA(r30)
            androidx.compose.ui.unit.TextUnitType$Companion r6 = androidx.compose.p002ui.unit.TextUnitType.Companion
            long r6 = r6.m38682getSpUIouoOA()
            boolean r4 = androidx.compose.p002ui.unit.TextUnitType.m38677equalsimpl0(r4, r6)
            if (r4 == 0) goto L_0x0026
            float r4 = androidx.compose.p002ui.unit.TextUnit.m38649getValueimpl(r30)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0021
            r4 = r2
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r4 != 0) goto L_0x0026
            r4 = r2
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.p002ui.graphics.Color.Companion
            long r6 = r5.m35707getUnspecified0d7_KjU()
            boolean r6 = androidx.compose.p002ui.graphics.Color.m35672equalsimpl0(r0, r6)
            if (r6 != 0) goto L_0x003f
            long r6 = r5.m35706getTransparent0d7_KjU()
            boolean r6 = androidx.compose.p002ui.graphics.Color.m35672equalsimpl0(r0, r6)
            if (r6 != 0) goto L_0x003f
            r6 = r2
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            if (r35 == 0) goto L_0x0053
            androidx.compose.ui.text.style.BaselineShift$Companion r7 = androidx.compose.p002ui.text.style.BaselineShift.Companion
            float r7 = r7.m38246getNoney9eOQZs()
            float r8 = r35.m38242unboximpl()
            boolean r7 = androidx.compose.p002ui.text.style.BaselineShift.m38239equalsimpl0(r8, r7)
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            r3 = 0
            if (r4 != 0) goto L_0x005c
            if (r6 != 0) goto L_0x005c
            if (r2 != 0) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            r19 = r30
            goto L_0x0069
        L_0x0061:
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.p002ui.unit.TextUnit.Companion
            long r7 = r4.m38660getUnspecifiedXSAIIZE()
            r19 = r7
        L_0x0069:
            if (r6 == 0) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            long r0 = r5.m35707getUnspecified0d7_KjU()
        L_0x0070:
            r24 = r0
            if (r2 == 0) goto L_0x0077
            r21 = r35
            goto L_0x0079
        L_0x0077:
            r21 = r3
        L_0x0079:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 13951(0x367f, float:1.955E-41)
            r29 = 0
            r9.<init>((long) r10, (long) r12, (androidx.compose.p002ui.text.font.FontWeight) r14, (androidx.compose.p002ui.text.font.FontStyle) r15, (androidx.compose.p002ui.text.font.FontSynthesis) r16, (androidx.compose.p002ui.text.font.FontFamily) r17, (java.lang.String) r18, (long) r19, (androidx.compose.p002ui.text.style.BaselineShift) r21, (androidx.compose.p002ui.text.style.TextGeometricTransform) r22, (androidx.compose.p002ui.text.intl.LocaleList) r23, (long) r24, (androidx.compose.p002ui.text.style.TextDecoration) r26, (androidx.compose.p002ui.graphics.Shadow) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
        L_0x0097:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.platform.extensions.TextPaintExtensions_androidKt.m38231generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        C12775o.m28639i(spanStyle, "<this>");
        if (spanStyle.getFontFamily() == null && spanStyle.m37937getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int i;
        C12775o.m28639i(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            i = androidTextPaint.getFlags() | 128;
        } else {
            i = androidTextPaint.getFlags() & -129;
        }
        androidTextPaint.setFlags(i);
        int r4 = textMotion.m38376getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m38380equalsimpl0(r4, companion.m38385getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m38380equalsimpl0(r4, companion.m38384getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m38380equalsimpl0(r4, companion.m38386getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}
