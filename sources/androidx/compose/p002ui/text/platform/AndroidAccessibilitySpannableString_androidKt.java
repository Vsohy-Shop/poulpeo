package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.InternalTextApi;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TtsAnnotation;
import androidx.compose.p002ui.text.UrlAnnotation;
import androidx.compose.p002ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p002ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.GenericFontFamily;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p002ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.p002ui.text.platform.extensions.UrlAnnotationExtensions_androidKt;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,198:1\n33#2,6:199\n33#2,6:205\n33#2,6:211\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n75#1:199,6\n82#1:205,6\n91#1:211,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt */
/* compiled from: AndroidAccessibilitySpannableString.android.kt */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i, int i2, Density density, FontFamily.Resolver resolver) {
        int i3;
        int i4;
        SpannableExtensions_androidKt.m38227setColorRPmYEkk(spannableString, spanStyle.m37935getColor0d7_KjU(), i, i2);
        SpannableExtensions_androidKt.m38228setFontSizeKmRG4DE(spannableString, spanStyle.m37936getFontSizeXSAIIZE(), density, i, i2);
        if (!(spanStyle.getFontWeight() == null && spanStyle.m37937getFontStyle4Lr2A7w() == null)) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle r1 = spanStyle.m37937getFontStyle4Lr2A7w();
            if (r1 != null) {
                i4 = r1.m38066unboximpl();
            } else {
                i4 = FontStyle.Companion.m38068getNormal_LCdwA();
            }
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m38013getAndroidTypefaceStyleFO1MlWM(fontWeight, i4)), i, i2, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis r13 = spanStyle.m37938getFontSynthesisZQGJjVo();
                if (r13 != null) {
                    i3 = r13.m38077unboximpl();
                } else {
                    i3 = FontSynthesis.Companion.m38078getAllGVVA2EU();
                }
                Object value = FontFamily.Resolver.m38036resolveDPcqOEQ$default(resolver, fontFamily, (FontWeight) null, 0, i3, 6, (Object) null).getValue();
                C12775o.m28637g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i, i2, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i, i2);
        SpannableExtensions_androidKt.m38225setBackgroundRPmYEkk(spannableString, spanStyle.m37933getBackground0d7_KjU(), i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(annotatedString, "<this>");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resourceLoader, "resourceLoader");
        return toAccessibilitySpannableString(annotatedString, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver) {
        AnnotatedString annotatedString2 = annotatedString;
        C12775o.m28639i(annotatedString2, "<this>");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = spanStylesOrNull$ui_text_release.get(i);
                setSpanStyle(spannableString, SpanStyle.m37927copyIuqyXdg$default((SpanStyle) range.component1(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16351, (Object) null), range.component2(), range.component3(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString2.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range range2 = ttsAnnotations.get(i2);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan((TtsAnnotation) range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString2.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AnnotatedString.Range range3 = urlAnnotations.get(i3);
            spannableString.setSpan(UrlAnnotationExtensions_androidKt.toSpan((UrlAnnotation) range3.component1()), range3.component2(), range3.component3(), 33);
        }
        return spannableString;
    }
}
