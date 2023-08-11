package androidx.compose.material3;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import kotlin.jvm.internal.C12775o;

/* compiled from: IncludeFontPaddingHelper.android.kt */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle textStyle, boolean z) {
        C12775o.m28639i(textStyle, "style");
        PlatformTextStyle platformTextStyle = r1;
        PlatformTextStyle platformTextStyle2 = new PlatformTextStyle(z);
        return TextStyle.m37985copyNOaFTUo$default(textStyle, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, platformTextStyle, (LineHeightStyle) null, 786431, (Object) null);
    }
}
