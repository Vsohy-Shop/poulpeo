package androidx.compose.p002ui.input.pointer.util;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p002ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker */
/* compiled from: VelocityTracker.kt */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator = Offset.Companion.m35438getZeroF1C5BW0();
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(false, (VelocityTracker1D.Strategy) null, 3, (DefaultConstructorMarker) null);
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(false, (VelocityTracker1D.Strategy) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: addPosition-Uv8p0NA  reason: not valid java name */
    public final void m37289addPositionUv8p0NA(long j, long j2) {
        this.xVelocityTracker.addDataPoint(j, Offset.m35422getXimpl(j2));
        this.yVelocityTracker.addDataPoint(j, Offset.m35423getYimpl(j2));
    }

    /* renamed from: calculateVelocity-9UxMQ8M  reason: not valid java name */
    public final long m37290calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(), this.yVelocityTracker.calculateVelocity());
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release  reason: not valid java name */
    public final long m37291getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release  reason: not valid java name */
    public final void m37292setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j) {
        this.currentPointerPositionAccumulator = j;
    }
}
