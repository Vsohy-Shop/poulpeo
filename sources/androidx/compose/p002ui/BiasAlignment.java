package androidx.compose.p002ui;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
/* renamed from: androidx.compose.ui.BiasAlignment */
/* compiled from: Alignment.kt */
public final class BiasAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    @Immutable
    /* renamed from: androidx.compose.ui.BiasAlignment$Horizontal */
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
            float f;
            C12775o.m28639i(layoutDirection, "layoutDirection");
            float f2 = ((float) (i2 - i)) / 2.0f;
            if (layoutDirection == LayoutDirection.Ltr) {
                f = this.bias;
            } else {
                f = ((float) -1) * this.bias;
            }
            return C13265c.m30134c(f2 * (((float) 1) + f));
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

    @Immutable
    /* renamed from: androidx.compose.ui.BiasAlignment$Vertical */
    /* compiled from: Alignment.kt */
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f) {
            this.bias = f;
        }

        private final float component1() {
            return this.bias;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = vertical.bias;
            }
            return vertical.copy(f);
        }

        public int align(int i, int i2) {
            return C13265c.m30134c((((float) (i2 - i)) / 2.0f) * (((float) 1) + this.bias));
        }

        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f, float f2) {
        this.horizontalBias = f;
        this.verticalBias = f2;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = biasAlignment.horizontalBias;
        }
        if ((i & 2) != 0) {
            f2 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f, f2);
    }

    /* renamed from: align-KFBX0sM  reason: not valid java name */
    public long m35312alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection) {
        float f;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        float r0 = ((float) (IntSize.m38628getWidthimpl(j2) - IntSize.m38628getWidthimpl(j))) / 2.0f;
        float r3 = ((float) (IntSize.m38627getHeightimpl(j2) - IntSize.m38627getHeightimpl(j))) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f = this.horizontalBias;
        } else {
            f = ((float) -1) * this.horizontalBias;
        }
        float f2 = (float) 1;
        return IntOffsetKt.IntOffset(C13265c.m30134c(r0 * (f + f2)), C13265c.m30134c(r3 * (f2 + this.verticalBias)));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f, float f2) {
        return new BiasAlignment(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        if (Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0) {
            return true;
        }
        return false;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
