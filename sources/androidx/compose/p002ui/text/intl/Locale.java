package androidx.compose.p002ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.intl.Locale */
/* compiled from: Locale.kt */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final PlatformLocale platformLocale;

    /* renamed from: androidx.compose.ui.text.intl.Locale$Companion */
    /* compiled from: Locale.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }
    }

    public Locale(PlatformLocale platformLocale2) {
        C12775o.m28639i(platformLocale2, "platformLocale");
        this.platformLocale = platformLocale2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C12775o.m28634d(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public String toString() {
        return toLanguageTag();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Locale(String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
        C12775o.m28639i(str, "languageTag");
    }
}
