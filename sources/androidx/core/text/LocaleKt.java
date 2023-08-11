package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;

/* compiled from: Locale.kt */
public final class LocaleKt {
    @RequiresApi(17)
    public static final int getLayoutDirection(Locale locale) {
        C12775o.m28639i(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
