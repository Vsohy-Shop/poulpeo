package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.util.MathHelpersKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.style.TextGeometricTransformKt */
/* compiled from: TextGeometricTransform.kt */
public final class TextGeometricTransformKt {
    public static final TextGeometricTransform lerp(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f) {
        C12775o.m28639i(textGeometricTransform, "start");
        C12775o.m28639i(textGeometricTransform2, "stop");
        return new TextGeometricTransform(MathHelpersKt.lerp(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f), MathHelpersKt.lerp(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f));
    }
}
