package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.p002ui.unit.VelocityKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: WindowInsetsConnection.android.kt */
public final class SideCalculator$Companion$LeftSideCalculator$1 implements SideCalculator {
    SideCalculator$Companion$LeftSideCalculator$1() {
    }

    public Insets adjustInsets(Insets insets, int i) {
        C12775o.m28639i(insets, "oldInsets");
        Insets a = Insets.of(i, insets.top, insets.right, insets.bottom);
        C12775o.m28638h(a, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
        return a;
    }

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    public long m33316consumedOffsetsMKHz9U(long j) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j), 0.0f);
    }

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    public long m33317consumedVelocityQWom1Mo(long j, float f) {
        return VelocityKt.Velocity(Velocity.m38693getXimpl(j) - f, 0.0f);
    }

    public int valueOf(Insets insets) {
        C12775o.m28639i(insets, "insets");
        return insets.left;
    }

    public float motionOf(float f, float f2) {
        return f;
    }
}
