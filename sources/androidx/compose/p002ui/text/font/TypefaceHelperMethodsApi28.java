package androidx.compose.p002ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* renamed from: androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 */
/* compiled from: AndroidFontUtils.android.kt */
public final class TypefaceHelperMethodsApi28 {
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @RequiresApi(28)
    @DoNotInline
    public final Typeface create(Typeface typeface, int i, boolean z) {
        C12775o.m28639i(typeface, "typeface");
        Typeface a = Typeface.create(typeface, i, z);
        C12775o.m28638h(a, "create(typeface, finalFontWeight, finalFontStyle)");
        return a;
    }
}
