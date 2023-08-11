package androidx.compose.p002ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.ShaderBrush;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.AnnotatedStringKt;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p002ui.text.android.style.FontFeatureSpan;
import androidx.compose.p002ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.p002ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.p002ui.text.android.style.LineHeightSpan;
import androidx.compose.p002ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p002ui.text.android.style.ShadowSpan;
import androidx.compose.p002ui.text.android.style.SkewXSpan;
import androidx.compose.p002ui.text.android.style.TextDecorationSpan;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.platform.style.DrawStyleSpan;
import androidx.compose.p002ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.p002ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,552:1\n1#2:553\n35#3,3:554\n38#3,2:561\n40#3:564\n33#4,4:557\n38#4:563\n69#4,6:565\n33#4,6:571\n646#5:577\n646#5:578\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n282#1:554,3\n282#1:561,2\n282#1:564\n282#1:557,4\n282#1:563\n350#1:565,6\n370#1:571,6\n434#1:577\n507#1:578\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt */
/* compiled from: SpannableExtensions.android.kt */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ  reason: not valid java name */
    private static final MetricAffectingSpan m38223createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long r0 = TextUnit.m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.m38448toPxR2X_6o(j));
        }
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m38649getValueimpl(j));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, C13089p<? super SpanStyle, ? super Integer, ? super Integer, C11921v> pVar) {
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(pVar, "block");
        if (list.size() > 1) {
            int size = list.size();
            int i = size * 2;
            Integer[] numArr = new Integer[i];
            for (int i2 = 0; i2 < i; i2++) {
                numArr[i2] = 0;
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range range = list.get(i3);
                numArr[i3] = Integer.valueOf(range.getStart());
                numArr[i3 + size] = Integer.valueOf(range.getEnd());
            }
            C12708o.m28359z((Comparable[]) numArr);
            int intValue = ((Number) C12710p.m28380H(numArr)).intValue();
            for (int i4 = 0; i4 < i; i4++) {
                int intValue2 = numArr[i4].intValue();
                if (intValue2 != intValue) {
                    int size3 = list.size();
                    SpanStyle spanStyle2 = spanStyle;
                    for (int i5 = 0; i5 < size3; i5++) {
                        AnnotatedString.Range range2 = list.get(i5);
                        if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                            spanStyle2 = merge(spanStyle2, (SpanStyle) range2.getItem());
                        }
                    }
                    if (spanStyle2 != null) {
                        pVar.invoke(spanStyle2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
            }
        } else if (!list.isEmpty()) {
            pVar.invoke(merge(spanStyle, (SpanStyle) list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long r0 = TextUnit.m38648getTypeUIouoOA(spanStyle.m37939getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA()) || TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(spanStyle.m37939getLetterSpacingXSAIIZE()), companion.m38681getEmUIouoOA())) {
            return true;
        }
        return false;
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        if (TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m37998getFontSynthesisZQGJjVo() != null) {
            return true;
        }
        return false;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        if (spanStyle == null) {
            return spanStyle2;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI  reason: not valid java name */
    private static final float m38224resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        long r0 = TextUnit.m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
            return density.m38448toPxR2X_6o(j);
        }
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
            return TextUnit.m38649getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: setBackground-RPmYEkk  reason: not valid java name */
    public static final void m38225setBackgroundRPmYEkk(Spannable spannable, long j, int i, int i2) {
        boolean z;
        C12775o.m28639i(spannable, "$this$setBackground");
        if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m35725toArgb8_81llA(j)), i, i2);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM  reason: not valid java name */
    private static final void m38226setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m38242unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush == null) {
            return;
        }
        if (brush instanceof SolidColor) {
            m38227setColorRPmYEkk(spannable, ((SolidColor) brush).m36036getValue0d7_KjU(), i, i2);
        } else if (brush instanceof ShaderBrush) {
            setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
        }
    }

    /* renamed from: setColor-RPmYEkk  reason: not valid java name */
    public static final void m38227setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        boolean z;
        C12775o.m28639i(spannable, "$this$setColor");
        if (j != Color.Companion.m35707getUnspecified0d7_KjU()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m35725toArgb8_81llA(j)), i, i2);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, C13090q<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> qVar) {
        SpanStyle spanStyle;
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i);
            AnnotatedString.Range range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range2.getItem()) || ((SpanStyle) range2.getItem()).m37938getFontSynthesisZQGJjVo() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(range);
            }
        }
        if (hasFontAttributes(textStyle)) {
            spanStyle = new SpanStyle(0, 0, textStyle.getFontWeight(), textStyle.m37997getFontStyle4Lr2A7w(), textStyle.m37998getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16323, (DefaultConstructorMarker) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, qVar));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* renamed from: setFontSize-KmRG4DE  reason: not valid java name */
    public static final void m38228setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        C12775o.m28639i(spannable, "$this$setFontSize");
        C12775o.m28639i(density, "density");
        long r0 = TextUnit.m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(C13265c.m30134c(density.m38448toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m38649getValueimpl(j)), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE  reason: not valid java name */
    public static final void m38229setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        boolean z;
        int i;
        C12775o.m28639i(spannable, "$this$setLineHeight");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(lineHeightStyle, "lineHeightStyle");
        float r2 = m38224resolveLineHeightInPxo2QH7mI(j, f, density);
        if (!Float.isNaN(r2)) {
            if (spannable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || C13760y.m31606R0(spannable) == 10) {
                i = spannable.length() + 1;
            } else {
                i = spannable.length();
            }
            setSpan(spannable, new LineHeightStyleSpan(r2, 0, i, LineHeightStyle.Trim.m38333isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m38312getTrimEVpEnUU()), LineHeightStyle.Trim.m38334isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m38312getTrimEVpEnUU()), lineHeightStyle.m38311getAlignmentPIaL0Z0()), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-r9BaKPg  reason: not valid java name */
    public static final void m38230setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        C12775o.m28639i(spannable, "$this$setLineHeight");
        C12775o.m28639i(density, "density");
        float r2 = m38224resolveLineHeightInPxo2QH7mI(j, f, density);
        if (!Float.isNaN(r2)) {
            setSpan(spannable, new LineHeightSpan(r2), 0, spannable.length());
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        C12775o.m28639i(spannable, "<this>");
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m35725toArgb8_81llA(shadow.m36023getColor0d7_KjU()), Offset.m35422getXimpl(shadow.m36024getOffsetF1C5BW0()), Offset.m35423getYimpl(shadow.m36024getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m38226setBaselineShift0ocSgnM(spannable, item.m37934getBaselineShift5SSeXJ0(), start, end);
        m38227setColorRPmYEkk(spannable, item.m37935getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m38228setFontSizeKmRG4DE(spannable, item.m37936getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m38225setBackgroundRPmYEkk(spannable, item.m37933getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, C13090q<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> qVar) {
        MetricAffectingSpan r0;
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(textStyle, "contextTextStyle");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(qVar, "resolveTypeface");
        setFontAttributes(spannable, textStyle, list, qVar);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = list.get(i);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range range2 = list.get(i2);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle spanStyle = (SpanStyle) range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (r0 = m38223createLetterSpacingSpaneAf_CNQ(spanStyle.m37939getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, r0, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        C12775o.m28639i(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        float f2;
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(density, "density");
        if (textIndent == null) {
            return;
        }
        if ((!TextUnit.m38646equalsimpl0(textIndent.m38372getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m38646equalsimpl0(textIndent.m38373getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m38667isUnspecifiedR2X_6o(textIndent.m38372getFirstLineXSAIIZE()) && !TextUnitKt.m38667isUnspecifiedR2X_6o(textIndent.m38373getRestLineXSAIIZE())) {
            long r0 = TextUnit.m38648getTypeUIouoOA(textIndent.m38372getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float f3 = 0.0f;
            if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
                f2 = density.m38448toPxR2X_6o(textIndent.m38372getFirstLineXSAIIZE());
            } else if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
                f2 = TextUnit.m38649getValueimpl(textIndent.m38372getFirstLineXSAIIZE()) * f;
            } else {
                f2 = 0.0f;
            }
            long r6 = TextUnit.m38648getTypeUIouoOA(textIndent.m38373getRestLineXSAIIZE());
            if (TextUnitType.m38677equalsimpl0(r6, companion.m38682getSpUIouoOA())) {
                f3 = density.m38448toPxR2X_6o(textIndent.m38373getRestLineXSAIIZE());
            } else if (TextUnitType.m38677equalsimpl0(r6, companion.m38681getEmUIouoOA())) {
                f3 = TextUnit.m38649getValueimpl(textIndent.m38373getRestLineXSAIIZE()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f2)), (int) ((float) Math.ceil((double) f3))), 0, spannable.length());
        }
    }
}
