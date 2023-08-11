package androidx.core.text;

import android.text.TextUtils;
import kotlin.jvm.internal.C12775o;

/* compiled from: CharSequence.kt */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
