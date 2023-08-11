package androidx.compose.p002ui.text.android;

import android.text.Spanned;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.SpannedExtensionsKt */
/* compiled from: SpannedExtensions.kt */
public final class SpannedExtensionsKt {
    public static final boolean hasSpan(Spanned spanned, Class<?> cls) {
        C12775o.m28639i(spanned, "<this>");
        C12775o.m28639i(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(Spanned spanned, Class<?> cls, int i, int i2) {
        C12775o.m28639i(spanned, "<this>");
        C12775o.m28639i(cls, "clazz");
        return spanned.nextSpanTransition(i - 1, i2, cls) != i2;
    }
}
