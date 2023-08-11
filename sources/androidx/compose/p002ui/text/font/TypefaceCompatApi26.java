package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.TempListUtilsKt;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.p002ui.unit.AndroidDensity_androidKt;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.text.font.TypefaceCompatApi26 */
/* compiled from: PlatformTypefaces.kt */
final class TypefaceCompatApi26 {
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        return TempListUtilsKt.fastJoinToString$default(settings.getSettings(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.Density(context)), 31, (Object) null);
    }

    @ExperimentalTextApi
    public final Typeface setFontVariationSettings(Typeface typeface, FontVariation.Settings settings, Context context) {
        C12775o.m28639i(settings, "variationSettings");
        C12775o.m28639i(context, "context");
        if (typeface == null) {
            return null;
        }
        if (settings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        boolean unused = paint.setFontVariationSettings(toAndroidString(settings, context));
        return paint.getTypeface();
    }
}
