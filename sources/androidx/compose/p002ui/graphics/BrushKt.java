package androidx.compose.p002ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.BrushKt */
/* compiled from: Brush.kt */
public final class BrushKt {
    public static final ShaderBrush ShaderBrush(Shader shader) {
        C12775o.m28639i(shader, "shader");
        return new BrushKt$ShaderBrush$1(shader);
    }
}
