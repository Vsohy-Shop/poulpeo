package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.AndroidFont;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.text.font.AndroidPreloadedFontTypefaceLoader */
/* compiled from: AndroidPreloadedFont.kt */
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    public Object awaitLoad(Context context, AndroidFont androidFont, C12074d<?> dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    public Typeface loadBlocking(Context context, AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(androidFont, "font");
        if (androidFont instanceof AndroidPreloadedFont) {
            androidPreloadedFont = (AndroidPreloadedFont) androidFont;
        } else {
            androidPreloadedFont = null;
        }
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.loadCached$ui_text_release(context);
        }
        return null;
    }
}
