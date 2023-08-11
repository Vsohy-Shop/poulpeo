package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontWeight;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidTypefaceWrapper */
/* compiled from: AndroidTypefaceWrapper.android.kt */
public final class AndroidTypefaceWrapper implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final Typeface typeface;

    public AndroidTypefaceWrapper(Typeface typeface2) {
        C12775o.m28639i(typeface2, "typeface");
        this.typeface = typeface2;
    }

    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getNativeTypeface-PYhJU0U  reason: not valid java name */
    public Typeface m38217getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        return this.typeface;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }
}
