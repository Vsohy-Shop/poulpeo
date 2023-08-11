package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    private Font findBaseFont(@NonNull FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = TypedValues.TransitionType.TYPE_DURATION;
        } else {
            i2 = Constants.MINIMAL_ERROR_STATUS_CODE;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font a = fontFamily.getFont(0);
        int matchScore = getMatchScore(fontStyle, a.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font a2 = fontFamily.getFont(i4);
            int matchScore2 = getMatchScore(fontStyle, a2.getStyle());
            if (matchScore2 < matchScore) {
                a = a2;
                matchScore = matchScore2;
            }
        }
        return a;
    }

    private static int getMatchScore(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        int i2;
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                try {
                    Font.Builder a = new Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight());
                    if (fontFileResourceEntry.isItalic()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    Font a2 = a.setSlant(i2).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(a2);
                    } else {
                        FontFamily.Builder unused = builder.addFont(a2);
                    }
                } catch (IOException unused2) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            return new Typeface.CustomFallbackBuilder(a3).setStyle(findBaseFont(a3, i).getStyle()).build();
        } catch (Exception unused3) {
            return null;
        }
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font.Builder a = new Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight());
                        if (fontInfo.isItalic()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        Font a2 = a.setSlant(i2).setTtcIndex(fontInfo.getTtcIndex()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(a2);
                        } else {
                            FontFamily.Builder unused = builder.addFont(a2);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily a3 = builder.build();
            return new Typeface.CustomFallbackBuilder(a3).setStyle(findBaseFont(a3, i).getStyle()).build();
            throw th;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font a = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(a).build()).setStyle(a.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public Typeface createWeightStyle(@NonNull Context context, @NonNull Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    /* access modifiers changed from: protected */
    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
