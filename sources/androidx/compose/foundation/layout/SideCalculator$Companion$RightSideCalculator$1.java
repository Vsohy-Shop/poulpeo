package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.p002ui.unit.VelocityKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: WindowInsetsConnection.android.kt */
public final class SideCalculator$Companion$RightSideCalculator$1 implements SideCalculator {
    SideCalculator$Companion$RightSideCalculator$1() {
    }

    public Insets adjustInsets(Insets insets, int i) {
        C12775o.m28639i(insets, "oldInsets");
        Insets a = Insets.of(insets.left, insets.top, i, insets.bottom);
        C12775o.m28638h(a, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
        return a;
    }

    /* renamed from: consumedOffsets-MK-Hz9U  reason: not valid java name */
    public long m33318consumedOffsetsMKHz9U(long j) {
        return OffsetKt.Offset(Offset.m35422getXimpl(j), 0.0f);
    }

    /* renamed from: consumedVelocity-QWom1Mo  reason: not valid java name */
    public long m33319consumedVelocityQWom1Mo(long j, float f) {
        return VelocityKt.Velocity(Velocity.m38693getXimpl(j) + f, 0.0f);
    }

    public float motionOf(float f, float f2) {
        return -f;
    }

    public int valueOf(Insets insets) {
        C12775o.m28639i(insets, "insets");
        return insets.right;
    }
}
