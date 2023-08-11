package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontVariation;

/* renamed from: androidx.compose.ui.text.font.PlatformTypefaces */
/* compiled from: PlatformTypefaces.kt */
public interface PlatformTypefaces {
    /* renamed from: createDefault-FO1MlWM  reason: not valid java name */
    Typeface m38088createDefaultFO1MlWM(FontWeight fontWeight, int i);

    /* renamed from: createNamed-RetOiIg  reason: not valid java name */
    Typeface m38089createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i);

    /* renamed from: optionalOnDeviceFontFamilyByName-78DK7lM  reason: not valid java name */
    Typeface m38090optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, Context context);
}
