package androidx.compose.p002ui.graphics.colorspace;

/* renamed from: androidx.compose.ui.graphics.colorspace.WhitePoint */
/* compiled from: WhitePoint.kt */
public final class WhitePoint {

    /* renamed from: x */
    private final float f280x;

    /* renamed from: y */
    private final float f281y;

    public WhitePoint(float f, float f2) {
        this.f280x = f;
        this.f281y = f2;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = whitePoint.f280x;
        }
        if ((i & 2) != 0) {
            f2 = whitePoint.f281y;
        }
        return whitePoint.copy(f, f2);
    }

    public final float component1() {
        return this.f280x;
    }

    public final float component2() {
        return this.f281y;
    }

    public final WhitePoint copy(float f, float f2) {
        return new WhitePoint(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        if (Float.compare(this.f280x, whitePoint.f280x) == 0 && Float.compare(this.f281y, whitePoint.f281y) == 0) {
            return true;
        }
        return false;
    }

    public final float getX() {
        return this.f280x;
    }

    public final float getY() {
        return this.f281y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f280x) * 31) + Float.hashCode(this.f281y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f280x + ", y=" + this.f281y + ')';
    }

    public final float[] toXyz$ui_graphics_release() {
        float f = this.f280x;
        float f2 = this.f281y;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public WhitePoint(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    private WhitePoint(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
