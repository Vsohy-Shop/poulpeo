package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 extends C12777p implements Function1<AnimationVector2D, Offset> {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m35411boximpl(m33788invoketuRUvjQ((AnimationVector2D) obj));
    }

    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
    public final long m33788invoketuRUvjQ(AnimationVector2D animationVector2D) {
        C12775o.m28639i(animationVector2D, "it");
        return OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
    }
}
