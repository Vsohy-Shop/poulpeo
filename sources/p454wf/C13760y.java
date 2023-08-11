package p454wf;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* renamed from: wf.y */
/* compiled from: _Strings.kt */
class C13760y extends C13759x {
    /* renamed from: P0 */
    public static final String m31604P0(String str, int i) {
        boolean z;
        C12775o.m28639i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(C13537l.m30882i(i, str.length()));
            C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: Q0 */
    public static String m31605Q0(String str, int i) {
        boolean z;
        C12775o.m28639i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m31607S0(str, C13537l.m30877d(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: R0 */
    public static char m31606R0(CharSequence charSequence) {
        boolean z;
        C12775o.m28639i(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(C13755w.m31565Q(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: S0 */
    public static String m31607S0(String str, int i) {
        boolean z;
        C12775o.m28639i(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, C13537l.m30882i(i, str.length()));
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: T0 */
    public static <C extends Collection<? super Character>> C m31608T0(CharSequence charSequence, C c) {
        C12775o.m28639i(charSequence, "<this>");
        C12775o.m28639i(c, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }
}
