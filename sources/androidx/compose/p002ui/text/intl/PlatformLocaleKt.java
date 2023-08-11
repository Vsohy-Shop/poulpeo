package androidx.compose.p002ui.text.intl;

/* renamed from: androidx.compose.ui.text.intl.PlatformLocaleKt */
/* compiled from: PlatformLocale.kt */
public final class PlatformLocaleKt {
    private static final PlatformLocaleDelegate platformLocaleDelegate = AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();

    public static final PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return platformLocaleDelegate;
    }
}
