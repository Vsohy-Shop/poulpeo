package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.AndroidAssetFont */
/* compiled from: AndroidPreloadedFont.kt */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    private final AssetManager assetManager;
    private final String cacheKey;
    private final String path;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager2, String str, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager2, str, fontWeight, i, settings);
    }

    public Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings());
        }
        return Typeface.createFromAsset(this.assetManager, this.path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        if (C12775o.m28634d(this.path, androidAssetFont.path) && C12775o.m28634d(getVariationSettings(), androidAssetFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + FontStyle.m38065toStringimpl(m38014getStyle_LCdwA()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidAssetFont(AssetManager assetManager2, String str, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager2, str, (i2 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 8) != 0 ? FontStyle.Companion.m38068getNormal_LCdwA() : i, settings, (DefaultConstructorMarker) null);
    }

    private AndroidAssetFont(AssetManager assetManager2, String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, (DefaultConstructorMarker) null);
        this.assetManager = assetManager2;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release((Context) null));
        this.cacheKey = "asset:" + str;
    }
}
