package androidx.compose.p002ui.text.font;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverKt */
/* compiled from: FontFamilyResolver.kt */
public final class FontFamilyResolverKt {
    private static final AsyncTypefaceCache GlobalAsyncTypefaceCache = new AsyncTypefaceCache();
    private static final TypefaceRequestCache GlobalTypefaceRequestCache = new TypefaceRequestCache();

    public static final AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }

    public static final TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }
}
