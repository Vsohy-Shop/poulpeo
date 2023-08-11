package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.Locale;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.StringKt */
/* compiled from: String.kt */
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final String capitalize(String str, Locale locale) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(locale, "locale");
        return stringDelegate.capitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String decapitalize(String str, Locale locale) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(locale, "locale");
        return stringDelegate.decapitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toLowerCase(String str, Locale locale) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(locale, "locale");
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toUpperCase(String str, Locale locale) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(locale, "locale");
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String capitalize(String str, LocaleList localeList) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return capitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String decapitalize(String str, LocaleList localeList) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return decapitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toLowerCase(String str, LocaleList localeList) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return toLowerCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toUpperCase(String str, LocaleList localeList) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(localeList, "localeList");
        return toUpperCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }
}
