package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Size;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$SizeToVector$1 extends C12777p implements Function1<Size, AnimationVector2D> {
    public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1();

    VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32944invokeuvyYCjk(((Size) obj).m35496unboximpl());
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final AnimationVector2D m32944invokeuvyYCjk(long j) {
        return new AnimationVector2D(Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j));
    }
}
