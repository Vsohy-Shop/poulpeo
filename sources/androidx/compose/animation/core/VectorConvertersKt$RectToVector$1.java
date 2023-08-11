package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$RectToVector$1 extends C12777p implements Function1<Rect, AnimationVector4D> {
    public static final VectorConvertersKt$RectToVector$1 INSTANCE = new VectorConvertersKt$RectToVector$1();

    VectorConvertersKt$RectToVector$1() {
        super(1);
    }

    public final AnimationVector4D invoke(Rect rect) {
        C12775o.m28639i(rect, "it");
        return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }
}
