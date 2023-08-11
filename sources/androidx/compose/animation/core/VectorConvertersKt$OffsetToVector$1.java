package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$OffsetToVector$1 extends C12777p implements Function1<Offset, AnimationVector2D> {
    public static final VectorConvertersKt$OffsetToVector$1 INSTANCE = new VectorConvertersKt$OffsetToVector$1();

    VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m32942invokek4lQ0M(((Offset) obj).m35432unboximpl());
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final AnimationVector2D m32942invokek4lQ0M(long j) {
        return new AnimationVector2D(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
    }
}
