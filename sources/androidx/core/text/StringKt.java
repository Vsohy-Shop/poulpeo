package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.C12775o;

/* compiled from: String.kt */
public final class StringKt {
    public static final String htmlEncode(String str) {
        C12775o.m28639i(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        C12775o.m28638h(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
