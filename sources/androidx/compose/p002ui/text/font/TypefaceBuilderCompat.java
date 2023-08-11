package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.p002ui.unit.AndroidDensity_androidKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(api = 26)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,235:1\n151#2,3:236\n33#2,4:239\n154#2,2:243\n38#2:245\n156#2:246\n37#3,2:247\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n230#1:236,3\n230#1:239,4\n230#1:243,2\n230#1:245\n230#1:246\n232#1:247,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.TypefaceBuilderCompat */
/* compiled from: AndroidPreloadedFont.kt */
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @RequiresApi(26)
    @ExperimentalTextApi
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density density;
        if (context != null) {
            density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity$ui_text_release()) {
            density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i = 0; i < size; i++) {
            FontVariation.Setting setting = settings2.get(i);
            arrayList.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        C12775o.m28639i(assetManager, "assetManager");
        C12775o.m28639i(str, "path");
        C12775o.m28639i(settings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        C12775o.m28639i(file, "file");
        C12775o.m28639i(settings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    public final Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        C12775o.m28639i(parcelFileDescriptor, "fileDescriptor");
        C12775o.m28639i(settings, "variationSettings");
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }
}
