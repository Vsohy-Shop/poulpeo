package androidx.compose.p002ui.text.font;

import android.content.Context;
import androidx.compose.p002ui.text.font.Font;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.text.font.DelegatingFontLoaderForBridgeUsage */
/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    private final Object cacheKey = new Object();
    private final Context context;
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(Font.ResourceLoader resourceLoader, Context context2) {
        C12775o.m28639i(resourceLoader, "loader");
        C12775o.m28639i(context2, "context");
        this.loader = resourceLoader;
        this.context = context2;
    }

    public Object awaitLoad(Font font, C12074d<Object> dVar) {
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, dVar);
    }

    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    public Object loadBlocking(Font font) {
        C12775o.m28639i(font, "font");
        if (!(font instanceof AndroidFont)) {
            return this.loader.load(font);
        }
        AndroidFont androidFont = (AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }
}
