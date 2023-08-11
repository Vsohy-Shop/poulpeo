package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntSizeToVector$2 extends C12777p implements Function1<AnimationVector2D, IntSize> {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m38620boximpl(m32941invokeYEO4UFw((AnimationVector2D) obj));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m32941invokeYEO4UFw(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return IntSizeKt.IntSize(C13265c.m30134c(animationVector2D.getV1()), C13265c.m30134c(animationVector2D.getV2()));
    }
}
