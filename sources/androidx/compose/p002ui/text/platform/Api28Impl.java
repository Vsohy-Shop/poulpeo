package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* renamed from: androidx.compose.ui.text.platform.Api28Impl */
/* compiled from: AndroidAccessibilitySpannableString.android.kt */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @DoNotInline
    public final TypefaceSpan createTypefaceSpan(Typeface typeface) {
        C12775o.m28639i(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
