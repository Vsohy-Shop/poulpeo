package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.C12775o;

/* compiled from: SpannedString.kt */
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        C12775o.m28639i(spanned, "<this>");
        C12775o.m28644n(4, ExifInterface.GPS_DIRECTION_TRUE);
        T[] spans = spanned.getSpans(i, i2, Object.class);
        C12775o.m28638h(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        C12775o.m28639i(spanned, "<this>");
        C12775o.m28644n(4, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        C12775o.m28638h(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        C12775o.m28639i(charSequence, "<this>");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        C12775o.m28638h(valueOf, "valueOf(this)");
        return valueOf;
    }
}
