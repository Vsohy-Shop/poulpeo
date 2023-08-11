package androidx.compose.material;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: Typography.kt */
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    /* access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        return TextStyle.m37983copyCXVQc50$default(textStyle, 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194271, (Object) null);
    }
}
