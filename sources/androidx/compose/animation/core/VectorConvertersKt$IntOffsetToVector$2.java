package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntOffsetToVector$2 extends C12777p implements Function1<AnimationVector2D, IntOffset> {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m32939invokeBjo55l4((AnimationVector2D) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m32939invokeBjo55l4(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return IntOffsetKt.IntOffset(C13265c.m30134c(animationVector2D.getV1()), C13265c.m30134c(animationVector2D.getV2()));
    }
}
