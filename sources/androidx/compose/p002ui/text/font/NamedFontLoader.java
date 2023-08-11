package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.AndroidFont;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.text.font.NamedFontLoader */
/* compiled from: DeviceFontFamilyNameFont.kt */
final class NamedFontLoader implements AndroidFont.TypefaceLoader {
    public static final NamedFontLoader INSTANCE = new NamedFontLoader();

    private NamedFontLoader() {
    }

    public Object awaitLoad(Context context, AndroidFont androidFont, C12074d<? super Typeface> dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    public Typeface loadBlocking(Context context, AndroidFont androidFont) {
        DeviceFontFamilyNameFont deviceFontFamilyNameFont;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(androidFont, "font");
        if (androidFont instanceof DeviceFontFamilyNameFont) {
            deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) androidFont;
        } else {
            deviceFontFamilyNameFont = null;
        }
        if (deviceFontFamilyNameFont != null) {
            return deviceFontFamilyNameFont.loadCached(context);
        }
        return null;
    }
}
