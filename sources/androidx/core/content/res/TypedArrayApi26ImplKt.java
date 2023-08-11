package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* compiled from: TypedArray.kt */
final class TypedArrayApi26ImplKt {
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    @DoNotInline
    public static final Typeface getFont(TypedArray typedArray, @StyleableRes int i) {
        C12775o.m28639i(typedArray, "typedArray");
        Typeface a = typedArray.getFont(i);
        C12775o.m28636f(a);
        return a;
    }
}
