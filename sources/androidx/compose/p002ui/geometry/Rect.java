package androidx.compose.p002ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.geometry.Rect */
/* compiled from: Rect.kt */
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m35448containsk4lQ0M(long j) {
        if (Offset.m35422getXimpl(j) < this.left || Offset.m35422getXimpl(j) >= this.right || Offset.m35423getYimpl(j) < this.top || Offset.m35423getYimpl(j) >= this.bottom) {
            return false;
        }
        return true;
    }

    public final Rect copy(float f, float f2, float f3, float f4) {
        return new Rect(f, f2, f3, f4);
    }

    @Stable
    public final Rect deflate(float f) {
        return inflate(-f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        if (Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0  reason: not valid java name */
    public final long m35449getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.bottom);
    }

    /* renamed from: getBottomLeft-F1C5BW0  reason: not valid java name */
    public final long m35450getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    /* renamed from: getBottomRight-F1C5BW0  reason: not valid java name */
    public final long m35451getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public final long m35452getCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterLeft-F1C5BW0  reason: not valid java name */
    public final long m35453getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterRight-F1C5BW0  reason: not valid java name */
    public final long m35454getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m35455getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-F1C5BW0  reason: not valid java name */
    public final long m35456getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.left + (getWidth() / 2.0f), this.top);
    }

    /* renamed from: getTopLeft-F1C5BW0  reason: not valid java name */
    public final long m35457getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    /* renamed from: getTopRight-F1C5BW0  reason: not valid java name */
    public final long m35458getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    @Stable
    public final Rect inflate(float f) {
        return new Rect(this.left - f, this.top - f, this.right + f, this.bottom + f);
    }

    @Stable
    public final Rect intersect(Rect rect) {
        C12775o.m28639i(rect, "other");
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final boolean isEmpty() {
        if (this.left >= this.right || this.top >= this.bottom) {
            return true;
        }
        return false;
    }

    public final boolean isFinite() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f = this.left;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float f2 = this.top;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                float f3 = this.right;
                if (Float.isInfinite(f3) || Float.isNaN(f3)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    float f4 = this.bottom;
                    if (Float.isInfinite(f4) || Float.isNaN(f4)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        if (this.left >= Float.POSITIVE_INFINITY || this.top >= Float.POSITIVE_INFINITY || this.right >= Float.POSITIVE_INFINITY || this.bottom >= Float.POSITIVE_INFINITY) {
            return true;
        }
        return false;
    }

    public final boolean overlaps(Rect rect) {
        C12775o.m28639i(rect, "other");
        if (this.right <= rect.left || rect.right <= this.left || this.bottom <= rect.top || rect.bottom <= this.top) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    @Stable
    public final Rect translate(float f, float f2) {
        return new Rect(this.left + f, this.top + f2, this.right + f, this.bottom + f2);
    }

    @Stable
    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public final Rect m35459translatek4lQ0M(long j) {
        return new Rect(this.left + Offset.m35422getXimpl(j), this.top + Offset.m35423getYimpl(j), this.right + Offset.m35422getXimpl(j), this.bottom + Offset.m35423getYimpl(j));
    }

    /* renamed from: androidx.compose.ui.geometry.Rect$Companion */
    /* compiled from: Rect.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-NH-jbRc$annotations  reason: not valid java name */
    public static /* synthetic */ void m35447getSizeNHjbRc$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }
}
