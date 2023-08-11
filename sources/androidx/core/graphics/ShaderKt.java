package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Shader.kt */
public final class ShaderKt {
    public static final void transform(Shader shader, Function1<? super Matrix, C11921v> function1) {
        C12775o.m28639i(shader, "<this>");
        C12775o.m28639i(function1, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        function1.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
