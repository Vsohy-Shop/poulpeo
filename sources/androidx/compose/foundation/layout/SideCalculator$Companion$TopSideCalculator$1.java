package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.p002ui.unit.VelocityKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: WindowInsetsConnection.android.kt */
public final class SideCalculator$Companion$TopSideCalculator$1 implements SideCalculator {
    SideCalculator$Companion$TopSideCalculator$1() {
    }

    public Insets adjustInsets(Insets insets, int i) {
        C12775o.m28639i(insets, "oldInsets");
        Insets a = Insets.of(insets.left, i, insets.right, insets.bottom);
        C12775o.m28638h(a, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
        return a;
    }

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    public long m33320consumedOffsetsMKHz9U(long j) {
        return OffsetKt.Offset(0.0f, Offset.m35423getYimpl(j));
    }

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    public long m33321consumedVelocityQWom1Mo(long j, float f) {
        return VelocityKt.Velocity(0.0f, Velocity.m38694getYimpl(j) - f);
    }

    public int valueOf(Insets insets) {
        C12775o.m28639i(insets, "insets");
        return insets.top;
    }

    public float motionOf(float f, float f2) {
        return f2;
    }
}
