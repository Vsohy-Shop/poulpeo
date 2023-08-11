package androidx.compose.p002ui;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
/* renamed from: androidx.compose.ui.BiasAbsoluteAlignment */
/* compiled from: Alignment.kt */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @Immutable
    /* renamed from: androidx.compose.ui.BiasAbsoluteAlignment$Horizontal */
    /* compiled from: Alignment.kt */
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontal.bias;
            }
            return horizontal.copy(f);
        }

        public int align(int i, int i2, LayoutDirection layoutDirection) {
            C12775o.m28639i(layoutDirection, "layoutDirection");
            return C13265c.m30134c((((float) (i2 - i)) / 2.0f) * (((float) 1) + this.bias));
        }

        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    public BiasAbsoluteAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    private final float component1() {
        return this.horizontalBias;
    }

    private final float component2() {
        return this.verticalBias;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f, f2);
    }

    /* renamed from: align-KFBX0sM  reason: not valid java name */
    public long m35311alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        long IntSize = IntSizeKt.IntSize(IntSize.m38628getWidthimpl(j2) - IntSize.m38628getWidthimpl(j), IntSize.m38627getHeightimpl(j2) - IntSize.m38627getHeightimpl(j));
        float f = (float) 1;
        return IntOffsetKt.IntOffset(C13265c.m30134c((((float) IntSize.m38628getWidthimpl(IntSize)) / 2.0f) * (this.horizontalBias + f)), C13265c.m30134c((((float) IntSize.m38627getHeightimpl(IntSize)) / 2.0f) * (f + this.verticalBias)));
    }

    public final BiasAbsoluteAlignment copy(float f, float f2) {
        return new BiasAbsoluteAlignment(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        if (Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
