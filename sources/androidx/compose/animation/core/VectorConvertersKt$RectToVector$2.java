package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$RectToVector$2 extends C12777p implements Function1<AnimationVector4D, Rect> {
    public static final VectorConvertersKt$RectToVector$2 INSTANCE = new VectorConvertersKt$RectToVector$2();

    VectorConvertersKt$RectToVector$2() {
        super(1);
    }

    public final Rect invoke(AnimationVector4D animationVector4D) {
        C12775o.m28639i(animationVector4D, "it");
        return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
    }
}
