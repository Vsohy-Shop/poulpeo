package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpKt;
import androidx.compose.p002ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$DpOffsetToVector$2 extends C12777p implements Function1<AnimationVector2D, DpOffset> {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return DpOffset.m38523boximpl(m32935invokegVRvYmI((AnimationVector2D) obj));
    }

    /* renamed from: invoke-gVRvYmI  reason: not valid java name */
    public final long m32935invokegVRvYmI(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return DpKt.m38489DpOffsetYgX7TsA(C1232Dp.m38468constructorimpl(animationVector2D.getV1()), C1232Dp.m38468constructorimpl(animationVector2D.getV2()));
    }
}
