package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$IntSizeToVector$1 extends C12777p implements Function1<IntSize, AnimationVector2D> {
    public static final VectorConvertersKt$IntSizeToVector$1 INSTANCE = new VectorConvertersKt$IntSizeToVector$1();

    VectorConvertersKt$IntSizeToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32940invokeozmzZPI(((IntSize) obj).m38632unboximpl());
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final AnimationVector2D m32940invokeozmzZPI(long j) {
        return new AnimationVector2D((float) IntSize.m38628getWidthimpl(j), (float) IntSize.m38627getHeightimpl(j));
    }
}
