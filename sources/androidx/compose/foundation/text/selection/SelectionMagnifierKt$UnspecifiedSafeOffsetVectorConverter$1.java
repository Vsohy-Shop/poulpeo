package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends C12777p implements Function1<Offset, AnimationVector2D> {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m33787invokek4lQ0M(((Offset) obj).m35432unboximpl());
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final AnimationVector2D m33787invokek4lQ0M(long j) {
        if (OffsetKt.m35441isSpecifiedk4lQ0M(j)) {
            return new AnimationVector2D(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        }
        return SelectionMagnifierKt.UnspecifiedAnimationVector2D;
    }
}
