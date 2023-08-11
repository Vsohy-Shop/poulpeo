package androidx.core.p004os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.os.ConfigurationCompat */
public final class ConfigurationCompat {

    @RequiresApi(24)
    /* renamed from: androidx.core.os.ConfigurationCompat$Api24Impl */
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList getLocales(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return LocaleListCompat.wrap(Api24Impl.getLocales(configuration));
    }
}
