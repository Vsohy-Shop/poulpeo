package okhttp3;

import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C12775o;

/* compiled from: CipherSuite.kt */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    CipherSuite$Companion$ORDER_BY_NAME$1() {
    }

    public int compare(String str, String str2) {
        C12775o.m28639i(str, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(str2, "b");
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (i < min) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt == charAt2) {
                i++;
            } else if (C12775o.m28641k(charAt, charAt2) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }
}
