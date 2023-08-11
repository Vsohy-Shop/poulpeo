package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Arrangement.kt */
final class Arrangement$spacedBy$1 extends C12777p implements C13088o<Integer, LayoutDirection, Integer> {
    public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1();

    Arrangement$spacedBy$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (LayoutDirection) obj2);
    }

    public final Integer invoke(int i, LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        return Integer.valueOf(Alignment.Companion.getStart().align(0, i, layoutDirection));
    }
}
