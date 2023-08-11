package androidx.compose.p002ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.AndroidFontKt */
/* compiled from: AndroidFont.kt */
public final class AndroidFontKt {
    @Stable
    /* renamed from: Font-Ej4NQ78  reason: not valid java name */
    public static final Font m38008FontEj4NQ78(File file, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        C12775o.m28639i(file, "file");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new AndroidFileFont(file, fontWeight, i, settings, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-Ej4NQ78$default  reason: not valid java name */
    public static /* synthetic */ Font m38010FontEj4NQ78$default(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m38083Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m38008FontEj4NQ78(file, fontWeight, i, settings);
    }

    @Stable
    /* renamed from: Font-MuC2MFs  reason: not valid java name */
    public static final Font m38011FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        C12775o.m28639i(str, "path");
        C12775o.m28639i(assetManager, "assetManager");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new AndroidAssetFont(assetManager, str, fontWeight, i, settings, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-MuC2MFs$default  reason: not valid java name */
    public static /* synthetic */ Font m38012FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            settings = FontVariation.INSTANCE.m38083Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m38011FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    @RequiresApi(26)
    @Stable
    /* renamed from: Font-Ej4NQ78  reason: not valid java name */
    public static final Font m38007FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        C12775o.m28639i(parcelFileDescriptor, "fileDescriptor");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-Ej4NQ78$default  reason: not valid java name */
    public static /* synthetic */ Font m38009FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m38083Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m38007FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }
}
