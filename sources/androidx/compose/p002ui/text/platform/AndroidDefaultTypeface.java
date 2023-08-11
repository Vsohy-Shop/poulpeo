package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidDefaultTypeface */
/* compiled from: AndroidDefaultTypeface.android.kt */
public final class AndroidDefaultTypeface implements AndroidTypeface {
    private final FontFamily fontFamily = FontFamily.Companion.getDefault();

    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getNativeTypeface-PYhJU0U  reason: not valid java name */
    public Typeface m38198getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        if (Build.VERSION.SDK_INT < 28) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m38013getAndroidTypefaceStyleFO1MlWM(fontWeight, i));
            C12775o.m28638h(defaultFromStyle, "{\n            Typeface.d…)\n            )\n        }");
            return defaultFromStyle;
        }
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface typeface = Typeface.DEFAULT;
        C12775o.m28638h(typeface, "DEFAULT");
        return typefaceHelperMethodsApi28.create(typeface, fontWeight.getWeight(), FontStyle.m38063equalsimpl0(i, FontStyle.Companion.m38067getItalic_LCdwA()));
    }
}
