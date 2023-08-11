package androidx.compose.animation.core;

import androidx.compose.p002ui.unit.DpOffset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$DpOffsetToVector$1 extends C12777p implements Function1<DpOffset, AnimationVector2D> {
    public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1();

    VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32934invokejoFl9I(((DpOffset) obj).m38537unboximpl());
    }

    /* renamed from: invoke-jo-Fl9I  reason: not valid java name */
    public final AnimationVector2D m32934invokejoFl9I(long j) {
        return new AnimationVector2D(DpOffset.m38529getXD9Ej5fM(j), DpOffset.m38531getYD9Ej5fM(j));
    }
}
