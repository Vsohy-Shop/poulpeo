package androidx.compose.p002ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.geometry.RoundRect */
/* compiled from: RoundRect.kt */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final RoundRect Zero = RoundRectKt.m35476RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m35407getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: copy-MDFrsts$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m35463copyMDFrsts$default(RoundRect roundRect, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, Object obj) {
        float f5;
        float f6;
        float f7;
        float f8;
        long j5;
        long j6;
        long j7;
        long j8;
        RoundRect roundRect2 = roundRect;
        int i2 = i;
        if ((i2 & 1) != 0) {
            f5 = roundRect2.left;
        } else {
            f5 = f;
        }
        if ((i2 & 2) != 0) {
            f6 = roundRect2.top;
        } else {
            f6 = f2;
        }
        if ((i2 & 4) != 0) {
            f7 = roundRect2.right;
        } else {
            f7 = f3;
        }
        if ((i2 & 8) != 0) {
            f8 = roundRect2.bottom;
        } else {
            f8 = f4;
        }
        if ((i2 & 16) != 0) {
            j5 = roundRect2.topLeftCornerRadius;
        } else {
            j5 = j;
        }
        if ((i2 & 32) != 0) {
            j6 = roundRect2.topRightCornerRadius;
        } else {
            j6 = j2;
        }
        if ((i2 & 64) != 0) {
            j7 = roundRect2.bottomRightCornerRadius;
        } else {
            j7 = j3;
        }
        if ((i2 & 128) != 0) {
            j8 = roundRect2.bottomLeftCornerRadius;
        } else {
            j8 = j4;
        }
        return roundRect.m35469copyMDFrsts(f5, f6, f7, f8, j5, j6, j7, j8);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        boolean z;
        float f5 = f2 + f3;
        if (f5 <= f4) {
            return f;
        }
        if (f5 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Math.min(f, f4 / f5);
        }
        return f;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m35398getYimpl(this.bottomLeftCornerRadius), CornerRadius.m35398getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m35397getXimpl(this.topLeftCornerRadius), CornerRadius.m35397getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m35398getYimpl(this.topRightCornerRadius), CornerRadius.m35398getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m35397getXimpl(this.bottomRightCornerRadius), CornerRadius.m35397getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = r2;
        RoundRect roundRect3 = new RoundRect(this.left * minRadius, this.top * minRadius, this.right * minRadius, this.bottom * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m35397getXimpl(this.topLeftCornerRadius) * minRadius, CornerRadius.m35398getYimpl(this.topLeftCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m35397getXimpl(this.topRightCornerRadius) * minRadius, CornerRadius.m35398getYimpl(this.topRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m35397getXimpl(this.bottomRightCornerRadius) * minRadius, CornerRadius.m35398getYimpl(this.bottomRightCornerRadius) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m35397getXimpl(this.bottomLeftCornerRadius) * minRadius, CornerRadius.m35398getYimpl(this.bottomLeftCornerRadius) * minRadius), (DefaultConstructorMarker) null);
        RoundRect roundRect4 = roundRect2;
        this._scaledRadiiRect = roundRect4;
        return roundRect4;
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

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m35464component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m35465component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m35466component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m35467component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m35468containsk4lQ0M(long j) {
        float f;
        float f2;
        float f3;
        float f4;
        if (Offset.m35422getXimpl(j) < this.left || Offset.m35422getXimpl(j) >= this.right || Offset.m35423getYimpl(j) < this.top || Offset.m35423getYimpl(j) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m35422getXimpl(j) < this.left + CornerRadius.m35397getXimpl(scaledRadiiRect.topLeftCornerRadius) && Offset.m35423getYimpl(j) < this.top + CornerRadius.m35398getYimpl(scaledRadiiRect.topLeftCornerRadius)) {
            f3 = (Offset.m35422getXimpl(j) - this.left) - CornerRadius.m35397getXimpl(scaledRadiiRect.topLeftCornerRadius);
            f2 = (Offset.m35423getYimpl(j) - this.top) - CornerRadius.m35398getYimpl(scaledRadiiRect.topLeftCornerRadius);
            f = CornerRadius.m35397getXimpl(scaledRadiiRect.topLeftCornerRadius);
            f4 = CornerRadius.m35398getYimpl(scaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m35422getXimpl(j) > this.right - CornerRadius.m35397getXimpl(scaledRadiiRect.topRightCornerRadius) && Offset.m35423getYimpl(j) < this.top + CornerRadius.m35398getYimpl(scaledRadiiRect.topRightCornerRadius)) {
            f3 = (Offset.m35422getXimpl(j) - this.right) + CornerRadius.m35397getXimpl(scaledRadiiRect.topRightCornerRadius);
            f2 = (Offset.m35423getYimpl(j) - this.top) - CornerRadius.m35398getYimpl(scaledRadiiRect.topRightCornerRadius);
            f = CornerRadius.m35397getXimpl(scaledRadiiRect.topRightCornerRadius);
            f4 = CornerRadius.m35398getYimpl(scaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m35422getXimpl(j) > this.right - CornerRadius.m35397getXimpl(scaledRadiiRect.bottomRightCornerRadius) && Offset.m35423getYimpl(j) > this.bottom - CornerRadius.m35398getYimpl(scaledRadiiRect.bottomRightCornerRadius)) {
            f3 = (Offset.m35422getXimpl(j) - this.right) + CornerRadius.m35397getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            f2 = (Offset.m35423getYimpl(j) - this.bottom) + CornerRadius.m35398getYimpl(scaledRadiiRect.bottomRightCornerRadius);
            f = CornerRadius.m35397getXimpl(scaledRadiiRect.bottomRightCornerRadius);
            f4 = CornerRadius.m35398getYimpl(scaledRadiiRect.bottomRightCornerRadius);
        } else if (Offset.m35422getXimpl(j) >= this.left + CornerRadius.m35397getXimpl(scaledRadiiRect.bottomLeftCornerRadius) || Offset.m35423getYimpl(j) <= this.bottom - CornerRadius.m35398getYimpl(scaledRadiiRect.bottomLeftCornerRadius)) {
            return true;
        } else {
            f3 = (Offset.m35422getXimpl(j) - this.left) - CornerRadius.m35397getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f2 = (Offset.m35423getYimpl(j) - this.bottom) + CornerRadius.m35398getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f = CornerRadius.m35397getXimpl(scaledRadiiRect.bottomLeftCornerRadius);
            f4 = CornerRadius.m35398getYimpl(scaledRadiiRect.bottomLeftCornerRadius);
        }
        float f5 = f3 / f;
        float f6 = f2 / f4;
        if ((f5 * f5) + (f6 * f6) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m35469copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        if (Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m35396equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m35396equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m35396equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m35396equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius)) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m35470getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m35471getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m35472getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m35473getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m35399hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m35399hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m35399hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m35399hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        boolean z;
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m35396equalsimpl0(j, j2) || !CornerRadius.m35396equalsimpl0(j2, j3) || !CornerRadius.m35396equalsimpl0(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + CornerRadius.m35403toStringimpl(j) + ", topRight=" + CornerRadius.m35403toStringimpl(j2) + ", bottomRight=" + CornerRadius.m35403toStringimpl(j3) + ", bottomLeft=" + CornerRadius.m35403toStringimpl(j4) + ')';
        }
        if (CornerRadius.m35397getXimpl(j) == CornerRadius.m35398getYimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m35397getXimpl(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m35397getXimpl(j), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m35398getYimpl(j), 1) + ')';
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RoundRect(float r18, float r19, float r20, float r21, long r22, long r24, long r26, long r28, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r17 = this;
            r0 = r30
            r1 = r0 & 16
            if (r1 == 0) goto L_0x000e
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.p002ui.geometry.CornerRadius.Companion
            long r1 = r1.m35407getZerokKHJgLs()
            r8 = r1
            goto L_0x0010
        L_0x000e:
            r8 = r22
        L_0x0010:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001c
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.p002ui.geometry.CornerRadius.Companion
            long r1 = r1.m35407getZerokKHJgLs()
            r10 = r1
            goto L_0x001e
        L_0x001c:
            r10 = r24
        L_0x001e:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.geometry.CornerRadius$Companion r1 = androidx.compose.p002ui.geometry.CornerRadius.Companion
            long r1 = r1.m35407getZerokKHJgLs()
            r12 = r1
            goto L_0x002c
        L_0x002a:
            r12 = r26
        L_0x002c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
            androidx.compose.ui.geometry.CornerRadius$Companion r0 = androidx.compose.p002ui.geometry.CornerRadius.Companion
            long r0 = r0.m35407getZerokKHJgLs()
            r14 = r0
            goto L_0x003a
        L_0x0038:
            r14 = r28
        L_0x003a:
            r16 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r10, r12, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.geometry.RoundRect.<init>(float, float, float, float, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: androidx.compose.ui.geometry.RoundRect$Companion */
    /* compiled from: RoundRect.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
