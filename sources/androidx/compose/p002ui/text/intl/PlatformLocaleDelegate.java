package androidx.compose.p002ui.text.intl;

/* renamed from: androidx.compose.ui.text.intl.PlatformLocaleDelegate */
/* compiled from: PlatformLocale.kt */
public interface PlatformLocaleDelegate {
    LocaleList getCurrent();

    PlatformLocale parseLanguageTag(String str);
}
