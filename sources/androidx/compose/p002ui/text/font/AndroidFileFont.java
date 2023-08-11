package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.text.font.FontVariation;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.AndroidFileFont */
/* compiled from: AndroidPreloadedFont.kt */
public final class AndroidFileFont extends AndroidPreloadedFont {
    private final String cacheKey;
    private final File file;

    public /* synthetic */ AndroidFileFont(File file2, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(file2, fontWeight, i, settings);
    }

    public Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
        }
        return Typeface.createFromFile(this.file);
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public final File getFile() {
        return this.file;
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + FontStyle.m38065toStringimpl(m38014getStyle_LCdwA()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFileFont(File file2, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file2, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m38068getNormal_LCdwA() : i, settings, (DefaultConstructorMarker) null);
    }

    private AndroidFileFont(File file2, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, (DefaultConstructorMarker) null);
        this.file = file2;
        setTypeface$ui_text_release(doLoad$ui_text_release((Context) null));
    }
}
