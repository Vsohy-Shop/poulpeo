package p454wf;

import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;

/* renamed from: wf.b */
/* compiled from: CharJVM.kt */
class C13724b {
    /* renamed from: a */
    public static int m31415a(int i) {
        if (new C13528f(2, 36).mo53154t(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C13528f(2, 36));
    }

    /* renamed from: b */
    public static final int m31416b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m31417c(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m31418d(char c, Locale locale) {
        C12775o.m28639i(locale, "locale");
        String valueOf = String.valueOf(c);
        C12775o.m28637g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: e */
    public static String m31419e(char c, Locale locale) {
        C12775o.m28639i(locale, "locale");
        String f = m31420f(c, locale);
        if (f.length() <= 1) {
            String valueOf = String.valueOf(c);
            C12775o.m28637g(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!C12775o.m28634d(f, upperCase)) {
                return f;
            }
            return String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return f;
        } else {
            char charAt = f.charAt(0);
            C12775o.m28637g(f, "null cannot be cast to non-null type java.lang.String");
            String substring = f.substring(1);
            C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
            C12775o.m28637g(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    /* renamed from: f */
    public static final String m31420f(char c, Locale locale) {
        C12775o.m28639i(locale, "locale");
        String valueOf = String.valueOf(c);
        C12775o.m28637g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
