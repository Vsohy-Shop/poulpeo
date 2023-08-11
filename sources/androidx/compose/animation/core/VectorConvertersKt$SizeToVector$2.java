package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$SizeToVector$2 extends C12777p implements Function1<AnimationVector2D, Size> {
    public static final VectorConvertersKt$SizeToVector$2 INSTANCE = new VectorConvertersKt$SizeToVector$2();

    VectorConvertersKt$SizeToVector$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Size.m35479boximpl(m32945invoke7Ah8Wj8((AnimationVector2D) obj));
    }

    /* renamed from: invoke-7Ah8Wj8  reason: not valid java name */
    public final long m32945invoke7Ah8Wj8(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return SizeKt.Size(animationVector2D.getV1(), animationVector2D.getV2());
    }
}
