package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355hf.C12074d;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.AndroidFont */
/* compiled from: AndroidFont.kt */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    /* renamed from: androidx.compose.ui.text.font.AndroidFont$TypefaceLoader */
    /* compiled from: AndroidFont.kt */
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, C12074d<? super Typeface> dVar);

        Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader2, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader2, settings);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ  reason: not valid java name */
    public final int m38006getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public /* synthetic */ AndroidFont(int i, TypefaceLoader typefaceLoader2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader2);
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader2, FontVariation.Settings settings) {
        this.loadingStrategy = i;
        this.typefaceLoader = typefaceLoader2;
        this.variationSettings = settings;
    }

    private AndroidFont(int i, TypefaceLoader typefaceLoader2) {
        this(i, typefaceLoader2, new FontVariation.Settings(new FontVariation.Setting[0]), (DefaultConstructorMarker) null);
    }
}
