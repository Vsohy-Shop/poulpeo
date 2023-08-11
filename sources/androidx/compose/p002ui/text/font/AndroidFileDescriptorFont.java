package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.DefaultConstructorMarker;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorFont */
/* compiled from: AndroidPreloadedFont.kt */
public final class AndroidFileDescriptorFont extends AndroidPreloadedFont {
    private final String cacheKey;
    private final ParcelFileDescriptor fileDescriptor;

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, fontWeight, i, settings);
    }

    public Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFileDescriptor(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    public String getCacheKey() {
        return this.cacheKey;
    }

    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + FontStyle.m38065toStringimpl(m38014getStyle_LCdwA()) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcelFileDescriptor, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m38068getNormal_LCdwA() : i, settings, (DefaultConstructorMarker) null);
    }

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(fontWeight, i, settings, (DefaultConstructorMarker) null);
        this.fileDescriptor = parcelFileDescriptor;
        setTypeface$ui_text_release(doLoad$ui_text_release((Context) null));
    }
}
