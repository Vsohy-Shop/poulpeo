package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.C12775o;
import p436tf.C13528f;

/* compiled from: SpannableString.kt */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        C12775o.m28639i(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        C12775o.m28638h(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        C12775o.m28638h(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final void set(Spannable spannable, C13528f fVar, Object obj) {
        C12775o.m28639i(spannable, "<this>");
        C12775o.m28639i(fVar, "range");
        C12775o.m28639i(obj, "span");
        spannable.setSpan(obj, fVar.getStart().intValue(), fVar.getEndInclusive().intValue(), 17);
    }
}
