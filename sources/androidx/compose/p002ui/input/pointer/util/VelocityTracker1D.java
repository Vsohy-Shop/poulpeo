package androidx.compose.p002ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D */
/* compiled from: VelocityTracker.kt */
public final class VelocityTracker1D {
    public static final int $stable = 8;
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy */
    /* compiled from: VelocityTracker.kt */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$WhenMappings */
    /* compiled from: VelocityTracker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy[] r0 = androidx.compose.p002ui.input.pointer.util.VelocityTracker1D.Strategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.p002ui.input.pointer.util.VelocityTracker1D.Strategy.Impulse     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy r1 = androidx.compose.p002ui.input.pointer.util.VelocityTracker1D.Strategy.Lsq2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.util.VelocityTracker1D.WhenMappings.<clinit>():void");
        }
    }

    public VelocityTracker1D() {
        this(false, (Strategy) null, 3, (DefaultConstructorMarker) null);
    }

    private final float calculateLeastSquaresVelocity(List<Float> list, List<Float> list2) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(list2, list, 2).get(1).floatValue();
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.index + 1) % 20;
        this.index = i;
        VelocityTrackerKt.set(this.samples, i, j, f);
    }

    public final float calculateVelocity() {
        float f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                arrayList.add(Float.valueOf(dataPointAtTime3.getDataPoint()));
                arrayList2.add(Float.valueOf(-time));
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i2 < this.minSampleSize) {
            return 0.0f;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i3 == 1) {
            f = VelocityTrackerKt.calculateImpulseVelocity(arrayList, arrayList2, this.isDataDifferential);
        } else if (i3 == 2) {
            f = calculateLeastSquaresVelocity(arrayList, arrayList2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f * ((float) 1000);
    }

    public final boolean isDataDifferential() {
        return this.isDataDifferential;
    }

    public final void resetTracking() {
        C12708o.m28355v(this.samples, (Object) null, 0, 0, 6, (Object) null);
        this.index = 0;
    }

    public VelocityTracker1D(boolean z, Strategy strategy2) {
        C12775o.m28639i(strategy2, "strategy");
        this.isDataDifferential = z;
        this.strategy = strategy2;
        if (!z || !strategy2.equals(Strategy.Lsq2)) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy2.ordinal()];
            int i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.minSampleSize = i2;
            DataPointAtTime[] dataPointAtTimeArr = new DataPointAtTime[20];
            for (int i3 = 0; i3 < 20; i3++) {
                dataPointAtTimeArr[i3] = null;
            }
            this.samples = dataPointAtTimeArr;
            return;
        }
        throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy2);
    }

    public VelocityTracker1D(boolean z) {
        this(z, Strategy.Impulse);
    }
}
