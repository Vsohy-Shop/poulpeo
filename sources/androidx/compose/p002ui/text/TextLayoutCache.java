package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.caches.LruCache;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.TextLayoutCache */
/* compiled from: TextMeasurer.kt */
public final class TextLayoutCache {
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache;

    public TextLayoutCache() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final TextLayoutResult get(TextLayoutInput textLayoutInput) {
        C12775o.m28639i(textLayoutInput, "key");
        TextLayoutResult textLayoutResult = this.lruCache.get(new CacheTextLayoutInput(textLayoutInput));
        if (textLayoutResult != null && !textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return textLayoutResult;
        }
        return null;
    }

    public final TextLayoutResult put(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        C12775o.m28639i(textLayoutInput, "key");
        C12775o.m28639i(textLayoutResult, "value");
        return this.lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
    }

    public final TextLayoutResult remove(TextLayoutInput textLayoutInput) {
        C12775o.m28639i(textLayoutInput, "key");
        return this.lruCache.remove(new CacheTextLayoutInput(textLayoutInput));
    }

    public TextLayoutCache(int i) {
        this.lruCache = new LruCache<>(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextLayoutCache(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TextMeasurerKt.access$getDefaultCacheSize$p() : i);
    }
}
