package androidx.compose.material3.tokens;

import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.GenericFontFamily;

/* compiled from: TypefaceTokens.kt */
public final class TypefaceTokens {
    private static final GenericFontFamily Brand;
    public static final TypefaceTokens INSTANCE = new TypefaceTokens();
    private static final GenericFontFamily Plain;
    private static final FontWeight WeightBold;
    private static final FontWeight WeightMedium;
    private static final FontWeight WeightRegular;

    static {
        FontFamily.Companion companion = FontFamily.Companion;
        Brand = companion.getSansSerif();
        Plain = companion.getSansSerif();
        FontWeight.Companion companion2 = FontWeight.Companion;
        WeightBold = companion2.getBold();
        WeightMedium = companion2.getMedium();
        WeightRegular = companion2.getNormal();
    }

    private TypefaceTokens() {
    }

    public final GenericFontFamily getBrand() {
        return Brand;
    }

    public final GenericFontFamily getPlain() {
        return Plain;
    }

    public final FontWeight getWeightBold() {
        return WeightBold;
    }

    public final FontWeight getWeightMedium() {
        return WeightMedium;
    }

    public final FontWeight getWeightRegular() {
        return WeightRegular;
    }
}
