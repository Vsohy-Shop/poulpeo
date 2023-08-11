package androidx.compose.p002ui.text.intl;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.intl.AndroidLocaleDelegateAPI23 */
/* compiled from: AndroidLocaleDelegate.android.kt */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public LocaleList getCurrent() {
        Locale locale = Locale.getDefault();
        C12775o.m28638h(locale, "getDefault()");
        return new LocaleList((List<Locale>) C12723v.m28509d(new Locale((PlatformLocale) new AndroidLocale(locale))));
    }

    public PlatformLocale parseLanguageTag(String str) {
        C12775o.m28639i(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C12775o.m28638h(forLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(forLanguageTag);
    }
}
