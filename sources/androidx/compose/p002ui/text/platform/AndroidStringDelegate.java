package androidx.compose.p002ui.text.platform;

import androidx.compose.p002ui.text.PlatformStringDelegate;
import androidx.compose.p002ui.text.intl.AndroidLocale;
import androidx.compose.p002ui.text.intl.PlatformLocale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidStringDelegate */
/* compiled from: AndroidStringDelegate.android.kt */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public String capitalize(String str, PlatformLocale platformLocale) {
        boolean z;
        String str2;
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(platformLocale, "locale");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            str2 = C13724b.m31419e(charAt, ((AndroidLocale) platformLocale).getJavaLocale());
        } else {
            str2 = String.valueOf(charAt);
        }
        sb.append(str2);
        String substring = str.substring(1);
        C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public String decapitalize(String str, PlatformLocale platformLocale) {
        boolean z;
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(platformLocale, "locale");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C13724b.m31418d(str.charAt(0), ((AndroidLocale) platformLocale).getJavaLocale()));
        String substring = str.substring(1);
        C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public String toLowerCase(String str, PlatformLocale platformLocale) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(platformLocale, "locale");
        String lowerCase = str.toLowerCase(((AndroidLocale) platformLocale).getJavaLocale());
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public String toUpperCase(String str, PlatformLocale platformLocale) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        C12775o.m28639i(platformLocale, "locale");
        String upperCase = str.toUpperCase(((AndroidLocale) platformLocale).getJavaLocale());
        C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
