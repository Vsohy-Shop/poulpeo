package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.Font;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage */
/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    private final Object cacheKey = new Object();
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(resourceLoader, "loader");
        this.loader = resourceLoader;
    }

    public Object awaitLoad(Font font, C12074d<Object> dVar) {
        return this.loader.load(font);
    }

    public Object getCacheKey() {
        return this.cacheKey;
    }

    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    public Object loadBlocking(Font font) {
        C12775o.m28639i(font, "font");
        return this.loader.load(font);
    }
}
