package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentSizeModifier$1 extends C12777p implements C13088o<IntSize, LayoutDirection, IntOffset> {
    final /* synthetic */ Alignment $align;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentSizeModifier$1(Alignment alignment) {
        super(2);
        this.$align = alignment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return IntOffset.m38577boximpl(m33347invoke5SAbXVA(((IntSize) obj).m38632unboximpl(), (LayoutDirection) obj2));
    }

    /* renamed from: invoke-5SAbXVA  reason: not valid java name */
    public final long m33347invoke5SAbXVA(long j, LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return this.$align.m35310alignKFBX0sM(IntSize.Companion.m38633getZeroYbymL2g(), j, layoutDirection);
    }
}
