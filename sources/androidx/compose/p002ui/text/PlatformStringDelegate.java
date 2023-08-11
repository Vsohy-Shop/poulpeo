package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.PlatformLocale;

/* renamed from: androidx.compose.ui.text.PlatformStringDelegate */
/* compiled from: String.kt */
public interface PlatformStringDelegate {
    String capitalize(String str, PlatformLocale platformLocale);

    String decapitalize(String str, PlatformLocale platformLocale);

    String toLowerCase(String str, PlatformLocale platformLocale);

    String toUpperCase(String str, PlatformLocale platformLocale);
}
