package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;

@VisibleForTesting
/* renamed from: androidx.compose.ui.text.font.PlatformTypefacesApi */
/* compiled from: PlatformTypefaces.kt */
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg  reason: not valid java name */
    private final Typeface m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i) {
        boolean z;
        boolean z2 = false;
        if (FontStyle.m38063equalsimpl0(i, FontStyle.Companion.m38068getNormal_LCdwA()) && C12775o.m28634d(fontWeight, FontWeight.Companion.getNormal())) {
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Typeface typeface = Typeface.DEFAULT;
                C12775o.m28638h(typeface, "DEFAULT");
                return typeface;
            }
        }
        int r5 = AndroidFontUtils_androidKt.m38013getAndroidTypefaceStyleFO1MlWM(fontWeight, i);
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(r5);
            C12775o.m28638h(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, r5);
        C12775o.m28638h(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    /* renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default  reason: not valid java name */
    static /* synthetic */ Typeface m38092createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        return platformTypefacesApi.m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
    }

    /* renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg  reason: not valid java name */
    private final Typeface m38093loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i) {
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
        Typeface r6 = m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i);
        if (C12775o.m28634d(r6, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m38013getAndroidTypefaceStyleFO1MlWM(fontWeight, i))) || C12775o.m28634d(r6, m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg((String) null, fontWeight, i))) {
            z2 = false;
        }
        if (z2) {
            return r6;
        }
        return null;
    }

    /* renamed from: createDefault-FO1MlWM  reason: not valid java name */
    public Typeface m38094createDefaultFO1MlWM(FontWeight fontWeight, int i) {
        C12775o.m28639i(fontWeight, "fontWeight");
        return m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg((String) null, fontWeight, i);
    }

    /* renamed from: createNamed-RetOiIg  reason: not valid java name */
    public Typeface m38095createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        C12775o.m28639i(genericFontFamily, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fontWeight, "fontWeight");
        Typeface r0 = m38093loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefacesKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i);
        if (r0 == null) {
            return m38091createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i);
        }
        return r0;
    }

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM  reason: not valid java name */
    public Typeface m38096optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context) {
        Typeface typeface;
        C12775o.m28639i(str, "familyName");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        C12775o.m28639i(context, "context");
        FontFamily.Companion companion = FontFamily.Companion;
        if (C12775o.m28634d(str, companion.getSansSerif().getName())) {
            typeface = m38095createNamedRetOiIg(companion.getSansSerif(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getSerif().getName())) {
            typeface = m38095createNamedRetOiIg(companion.getSerif(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getMonospace().getName())) {
            typeface = m38095createNamedRetOiIg(companion.getMonospace(), fontWeight, i);
        } else if (C12775o.m28634d(str, companion.getCursive().getName())) {
            typeface = m38095createNamedRetOiIg(companion.getCursive(), fontWeight, i);
        } else {
            typeface = m38093loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i);
        }
        return PlatformTypefacesKt.setFontVariationSettings(typeface, settings, context);
    }
}
