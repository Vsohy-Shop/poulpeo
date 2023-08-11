package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.ColorKt;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* compiled from: DynamicTonalPalette.kt */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    @DoNotInline
    /* renamed from: getColor-WaAFU9c  reason: not valid java name */
    public final long m34296getColorWaAFU9c(Context context, @ColorRes int i) {
        C12775o.m28639i(context, "context");
        return ColorKt.Color(context.getResources().getColor(i, context.getTheme()));
    }
}
