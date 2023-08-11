package androidx.compose.p002ui.text.intl;

/* renamed from: androidx.compose.ui.text.intl.PlatformLocale */
/* compiled from: PlatformLocale.kt */
public interface PlatformLocale {
    String getLanguage();

    String getRegion();

    String getScript();

    String toLanguageTag();
}
