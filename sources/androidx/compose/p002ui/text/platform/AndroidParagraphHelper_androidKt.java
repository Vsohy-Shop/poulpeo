package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.PlatformParagraphStyle;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.p002ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.emoji2.text.EmojiCompat;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt */
/* compiled from: AndroidParagraphHelper.android.kt */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new AndroidParagraphHelper_androidKt$NoopSpan$1();

    public static final CharSequence createCharSequence(String str, float f, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, C13090q<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> qVar, boolean z) {
        CharSequence charSequence;
        Spannable spannable;
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "contextTextStyle");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(qVar, "resolveTypeface");
        if (!z || !EmojiCompat.isConfigured()) {
            charSequence = str;
        } else {
            charSequence = EmojiCompat.get().process(str);
            C12775o.m28636f(charSequence);
        }
        C12775o.m28638h(charSequence, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (list.isEmpty() && list2.isEmpty() && C12775o.m28634d(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnitKt.m38667isUnspecifiedR2X_6o(textStyle.m38002getLineHeightXSAIIZE())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        if (C12775o.m28634d(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannable, NoopSpan, 0, str.length());
        }
        if (!isIncludeFontPaddingEnabled(textStyle) || textStyle.getLineHeightStyle() != null) {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            Spannable spannable2 = spannable;
            SpannableExtensions_androidKt.m38229setLineHeightKmRG4DE(spannable2, textStyle.m38002getLineHeightXSAIIZE(), f, density, lineHeightStyle);
        } else {
            SpannableExtensions_androidKt.m38230setLineHeightr9BaKPg(spannable, textStyle.m38002getLineHeightXSAIIZE(), f, density);
        }
        SpannableExtensions_androidKt.setTextIndent(spannable, textStyle.getTextIndent(), f, density);
        SpannableExtensions_androidKt.setSpanStyles(spannable, textStyle, list, density, qVar);
        PlaceholderExtensions_androidKt.setPlaceholders(spannable, list2, density);
        return spannable;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        C12775o.m28639i(textStyle, "<this>");
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return true;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
