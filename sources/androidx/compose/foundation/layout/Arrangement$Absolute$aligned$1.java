package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Arrangement.kt */
final class Arrangement$Absolute$aligned$1 extends C12777p implements C13088o<Integer, LayoutDirection, Integer> {
    final /* synthetic */ Alignment.Horizontal $alignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Arrangement$Absolute$aligned$1(Alignment.Horizontal horizontal) {
        super(2);
        this.$alignment = horizontal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i, LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return Integer.valueOf(this.$alignment.align(0, i, layoutDirection));
    }
}
