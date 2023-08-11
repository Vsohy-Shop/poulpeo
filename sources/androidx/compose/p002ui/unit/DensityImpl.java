package androidx.compose.p002ui.unit;

/* renamed from: androidx.compose.ui.unit.DensityImpl */
/* compiled from: Density.kt */
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f, float f2) {
        this.density = f;
        this.fontScale = f2;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = densityImpl.getDensity();
        }
        if ((i & 2) != 0) {
            f2 = densityImpl.getFontScale();
        }
        return densityImpl.copy(f, f2);
    }

    public final float component1() {
        return getDensity();
    }

    public final float component2() {
        return getFontScale();
    }

    public final DensityImpl copy(float f, float f2) {
        return new DensityImpl(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        if (Float.compare(getDensity(), densityImpl.getDensity()) == 0 && Float.compare(getFontScale(), densityImpl.getFontScale()) == 0) {
            return true;
        }
        return false;
    }

    public float getDensity() {
        return this.density;
    }

    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(getFontScale());
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + getFontScale() + ')';
    }
}
