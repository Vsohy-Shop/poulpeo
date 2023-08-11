package androidx.compose.p002ui.text.platform.extensions;

import androidx.compose.p002ui.text.intl.AndroidLocale;
import androidx.compose.p002ui.text.intl.PlatformLocale;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.extensions.LocaleExtensions_androidKt */
/* compiled from: LocaleExtensions.android.kt */
public final class LocaleExtensions_androidKt {
    public static final Locale toJavaLocale(androidx.compose.p002ui.text.intl.Locale locale) {
        C12775o.m28639i(locale, "<this>");
        PlatformLocale platformLocale$ui_text_release = locale.getPlatformLocale$ui_text_release();
        C12775o.m28637g(platformLocale$ui_text_release, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((AndroidLocale) platformLocale$ui_text_release).getJavaLocale();
    }
}
