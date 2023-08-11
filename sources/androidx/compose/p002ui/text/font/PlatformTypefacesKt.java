package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesKt */
/* compiled from: PlatformTypefaces.kt */
public final class PlatformTypefacesKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    @VisibleForTesting
    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fontWeight, "fontWeight");
        int weight = fontWeight.getWeight() / 100;
        boolean z4 = true;
        if (weight < 0 || weight >= 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str + "-thin";
        }
        if (2 > weight || weight >= 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return str + "-light";
        } else if (weight == 4) {
            return str;
        } else {
            if (weight == 5) {
                return str + "-medium";
            }
            if (6 > weight || weight >= 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return str;
            }
            if (8 > weight || weight >= 11) {
                z4 = false;
            }
            if (!z4) {
                return str;
            }
            return str + "-black";
        }
    }

    @ExperimentalTextApi
    public static final Typeface setFontVariationSettings(Typeface typeface, FontVariation.Settings settings, Context context) {
        C12775o.m28639i(settings, "variationSettings");
        C12775o.m28639i(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
        }
        return typeface;
    }
}
