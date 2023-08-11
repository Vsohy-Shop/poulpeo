package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
@VisibleForTesting
/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesApi28 */
/* compiled from: PlatformTypefaces.kt */
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceApi28-RetOiIg  reason: not valid java name */
    private final Typeface m38097createAndroidTypefaceApi28RetOiIg(String str, FontWeight fontWeight, int i) {
        Typeface typeface;
        boolean z;
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m38063equalsimpl0(i, companion.m38068getNormal_LCdwA()) && C12775o.m28634d(fontWeight, FontWeight.Companion.getNormal())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface2 = Typeface.DEFAULT;
                C12775o.m28638h(typeface2, "DEFAULT");
                return typeface2;
            }
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        Typeface a = Typeface.create(typeface, fontWeight.getWeight(), FontStyle.m38063equalsimpl0(i, companion.m38067getItalic_LCdwA()));
        C12775o.m28638h(a, "create(\n            fami…ontStyle.Italic\n        )");
        return a;
    }

    /* renamed from: createAndroidTypefaceApi28-RetOiIg$default  reason: not valid java name */
    static /* synthetic */ Typeface m38098createAndroidTypefaceApi28RetOiIg$default(PlatformTypefacesApi28 platformTypefacesApi28, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return platformTypefacesApi28.m38097createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final Typeface m38099loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Typeface r8 = m38097createAndroidTypefaceApi28RetOiIg(str, fontWeight, i);
        boolean r0 = FontStyle.m38063equalsimpl0(i, FontStyle.Companion.m38067getItalic_LCdwA());
        TypefaceHelperMethodsApi28 typefaceHelperMethodsApi28 = TypefaceHelperMethodsApi28.INSTANCE;
        Typeface typeface = Typeface.DEFAULT;
        C12775o.m28638h(typeface, "DEFAULT");
        if (C12775o.m28634d(r8, typefaceHelperMethodsApi28.create(typeface, fontWeight.getWeight(), r0)) || C12775o.m28634d(r8, m38097createAndroidTypefaceApi28RetOiIg((String) null, fontWeight, i))) {
            z2 = false;
        }
        if (z2) {
            return r8;
        }
        return null;
    }

    /* renamed from: createDefault-FO1MlWM  reason: not valid java name */
    public Typeface m38100createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        C12775o.m28639i(fontWeight, "fontWeight");
        return m38097createAndroidTypefaceApi28RetOiIg((String) null, fontWeight, i);
    }

    /* renamed from: createNamed-RetOiIg  reason: not valid java name */
    public Typeface m38101createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        C12775o.m28639i(genericFontFamily, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fontWeight, "fontWeight");
        return m38097createAndroidTypefaceApi28RetOiIg(genericFontFamily.getName(), fontWeight, i);
    }

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM  reason: not valid java name */
    public Typeface m38102optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context) {
        Typeface typeface;
        C12775o.m28639i(str, "familyName");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        C12775o.m28639i(context, "context");
        FontFamily.Companion companion = FontFamily.Companion;
        if (C12775o.m28634d(str, companion.getSansSerif().getName())) {
            typeface = m38101createNamedRetOiIg(companion.getSansSerif(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getSerif().getName())) {
            typeface = m38101createNamedRetOiIg(companion.getSerif(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getMonospace().getName())) {
            typeface = m38101createNamedRetOiIg(companion.getMonospace(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getCursive().getName())) {
            typeface = m38101createNamedRetOiIg(companion.getCursive(), fontWeight, i);
        } else {
            typeface = m38099loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(typeface, settings, context);
    }
}
