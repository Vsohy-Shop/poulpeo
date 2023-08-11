package androidx.compose.p002ui.text.font;

import p355hf.C12074d;

/* renamed from: androidx.compose.ui.text.font.PlatformFontLoader */
/* compiled from: Font.kt */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, C12074d<Object> dVar);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
