package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntOffsetToVector$1 extends C12777p implements Function1<IntOffset, AnimationVector2D> {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32938invokegyyYBs(((IntOffset) obj).m38595unboximpl());
    }

    /* renamed from: invoke--gyyYBs  reason: not valid java name */
    public final AnimationVector2D m32938invokegyyYBs(long j) {
        return new AnimationVector2D((float) IntOffset.m38586getXimpl(j), (float) IntOffset.m38587getYimpl(j));
    }
}
