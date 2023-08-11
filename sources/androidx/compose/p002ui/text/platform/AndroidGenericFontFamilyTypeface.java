package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.GenericFontFamily;
import androidx.compose.p002ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface */
/* compiled from: AndroidGenericFontFamilyTypeface.android.kt */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final Typeface nativeTypeface;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily) {
        C12775o.m28639i(genericFontFamily, "fontFamily");
        this.fontFamily = genericFontFamily;
        Typeface create = Typeface.create(genericFontFamily.getName(), 0);
        C12775o.m28636f(create);
        this.nativeTypeface = create;
    }

    /* renamed from: buildStyledTypeface-FO1MlWM  reason: not valid java name */
    private final Typeface m38200buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.m38013getAndroidTypefaceStyleFO1MlWM(fontWeight, i));
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m38063equalsimpl0(i, FontStyle.Companion.m38067getItalic_LCdwA()));
    }

    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getNativeTypeface-PYhJU0U  reason: not valid java name */
    public Typeface m38201getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        Typeface r1 = m38200buildStyledTypefaceFO1MlWM(fontWeight, i);
        C12775o.m28638h(r1, "buildStyledTypeface(fontWeight, fontStyle)");
        return r1;
    }
}
