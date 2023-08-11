package androidx.compose.p002ui.text.intl;

import java.util.Locale;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.intl.AndroidLocale */
/* compiled from: AndroidLocaleDelegate.android.kt */
public final class AndroidLocale implements PlatformLocale {
    private final Locale javaLocale;

    public AndroidLocale(Locale locale) {
        C12775o.m28639i(locale, "javaLocale");
        this.javaLocale = locale;
    }

    public final Locale getJavaLocale() {
        return this.javaLocale;
    }

    public String getLanguage() {
        String language = this.javaLocale.getLanguage();
        C12775o.m28638h(language, "javaLocale.language");
        return language;
    }

    public String getRegion() {
        String country = this.javaLocale.getCountry();
        C12775o.m28638h(country, "javaLocale.country");
        return country;
    }

    public String getScript() {
        String script = this.javaLocale.getScript();
        C12775o.m28638h(script, "javaLocale.script");
        return script;
    }

    public String toLanguageTag() {
        String languageTag = this.javaLocale.toLanguageTag();
        C12775o.m28638h(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
