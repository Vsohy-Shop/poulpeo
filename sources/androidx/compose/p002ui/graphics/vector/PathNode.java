package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.vector.PathNode */
/* compiled from: PathNode.kt */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ArcTo */
    /* compiled from: PathNode.kt */
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public ArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartX = f4;
            this.arcStartY = f5;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = arcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = arcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = arcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = arcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = arcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = arcTo.arcStartX;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = arcTo.arcStartY;
            }
            return arcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new ArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            if (Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0) {
                return true;
            }
            return false;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31;
            boolean z = this.isMoreThanHalf;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isPositiveArc;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$Close */
    /* compiled from: PathNode.kt */
    public static final class Close extends PathNode {
        public static final Close INSTANCE = new Close();

        private Close() {
            super(false, false, 3, (DefaultConstructorMarker) null);
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$CurveTo */
    /* compiled from: PathNode.kt */
    public static final class CurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f294x1;

        /* renamed from: x2 */
        private final float f295x2;

        /* renamed from: x3 */
        private final float f296x3;

        /* renamed from: y1 */
        private final float f297y1;

        /* renamed from: y2 */
        private final float f298y2;

        /* renamed from: y3 */
        private final float f299y3;

        public CurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f294x1 = f;
            this.f297y1 = f2;
            this.f295x2 = f3;
            this.f298y2 = f4;
            this.f296x3 = f5;
            this.f299y3 = f6;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = curveTo.f294x1;
            }
            if ((i & 2) != 0) {
                f2 = curveTo.f297y1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = curveTo.f295x2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = curveTo.f298y2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = curveTo.f296x3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = curveTo.f299y3;
            }
            return curveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.f294x1;
        }

        public final float component2() {
            return this.f297y1;
        }

        public final float component3() {
            return this.f295x2;
        }

        public final float component4() {
            return this.f298y2;
        }

        public final float component5() {
            return this.f296x3;
        }

        public final float component6() {
            return this.f299y3;
        }

        public final CurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new CurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            if (Float.compare(this.f294x1, curveTo.f294x1) == 0 && Float.compare(this.f297y1, curveTo.f297y1) == 0 && Float.compare(this.f295x2, curveTo.f295x2) == 0 && Float.compare(this.f298y2, curveTo.f298y2) == 0 && Float.compare(this.f296x3, curveTo.f296x3) == 0 && Float.compare(this.f299y3, curveTo.f299y3) == 0) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f294x1;
        }

        public final float getX2() {
            return this.f295x2;
        }

        public final float getX3() {
            return this.f296x3;
        }

        public final float getY1() {
            return this.f297y1;
        }

        public final float getY2() {
            return this.f298y2;
        }

        public final float getY3() {
            return this.f299y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f294x1) * 31) + Float.hashCode(this.f297y1)) * 31) + Float.hashCode(this.f295x2)) * 31) + Float.hashCode(this.f298y2)) * 31) + Float.hashCode(this.f296x3)) * 31) + Float.hashCode(this.f299y3);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f294x1 + ", y1=" + this.f297y1 + ", x2=" + this.f295x2 + ", y2=" + this.f298y2 + ", x3=" + this.f296x3 + ", y3=" + this.f299y3 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$HorizontalTo */
    /* compiled from: PathNode.kt */
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x */
        private final float f300x;

        public HorizontalTo(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f300x = f;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = horizontalTo.f300x;
            }
            return horizontalTo.copy(f);
        }

        public final float component1() {
            return this.f300x;
        }

        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof HorizontalTo) && Float.compare(this.f300x, ((HorizontalTo) obj).f300x) == 0) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f300x;
        }

        public int hashCode() {
            return Float.hashCode(this.f300x);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f300x + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$LineTo */
    /* compiled from: PathNode.kt */
    public static final class LineTo extends PathNode {

        /* renamed from: x */
        private final float f301x;

        /* renamed from: y */
        private final float f302y;

        public LineTo(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f301x = f;
            this.f302y = f2;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = lineTo.f301x;
            }
            if ((i & 2) != 0) {
                f2 = lineTo.f302y;
            }
            return lineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f301x;
        }

        public final float component2() {
            return this.f302y;
        }

        public final LineTo copy(float f, float f2) {
            return new LineTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            if (Float.compare(this.f301x, lineTo.f301x) == 0 && Float.compare(this.f302y, lineTo.f302y) == 0) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f301x;
        }

        public final float getY() {
            return this.f302y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f301x) * 31) + Float.hashCode(this.f302y);
        }

        public String toString() {
            return "LineTo(x=" + this.f301x + ", y=" + this.f302y + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$MoveTo */
    /* compiled from: PathNode.kt */
    public static final class MoveTo extends PathNode {

        /* renamed from: x */
        private final float f303x;

        /* renamed from: y */
        private final float f304y;

        public MoveTo(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f303x = f;
            this.f304y = f2;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = moveTo.f303x;
            }
            if ((i & 2) != 0) {
                f2 = moveTo.f304y;
            }
            return moveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f303x;
        }

        public final float component2() {
            return this.f304y;
        }

        public final MoveTo copy(float f, float f2) {
            return new MoveTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            if (Float.compare(this.f303x, moveTo.f303x) == 0 && Float.compare(this.f304y, moveTo.f304y) == 0) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f303x;
        }

        public final float getY() {
            return this.f304y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f303x) * 31) + Float.hashCode(this.f304y);
        }

        public String toString() {
            return "MoveTo(x=" + this.f303x + ", y=" + this.f304y + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$QuadTo */
    /* compiled from: PathNode.kt */
    public static final class QuadTo extends PathNode {

        /* renamed from: x1 */
        private final float f305x1;

        /* renamed from: x2 */
        private final float f306x2;

        /* renamed from: y1 */
        private final float f307y1;

        /* renamed from: y2 */
        private final float f308y2;

        public QuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f305x1 = f;
            this.f307y1 = f2;
            this.f306x2 = f3;
            this.f308y2 = f4;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = quadTo.f305x1;
            }
            if ((i & 2) != 0) {
                f2 = quadTo.f307y1;
            }
            if ((i & 4) != 0) {
                f3 = quadTo.f306x2;
            }
            if ((i & 8) != 0) {
                f4 = quadTo.f308y2;
            }
            return quadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f305x1;
        }

        public final float component2() {
            return this.f307y1;
        }

        public final float component3() {
            return this.f306x2;
        }

        public final float component4() {
            return this.f308y2;
        }

        public final QuadTo copy(float f, float f2, float f3, float f4) {
            return new QuadTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            if (Float.compare(this.f305x1, quadTo.f305x1) == 0 && Float.compare(this.f307y1, quadTo.f307y1) == 0 && Float.compare(this.f306x2, quadTo.f306x2) == 0 && Float.compare(this.f308y2, quadTo.f308y2) == 0) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f305x1;
        }

        public final float getX2() {
            return this.f306x2;
        }

        public final float getY1() {
            return this.f307y1;
        }

        public final float getY2() {
            return this.f308y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f305x1) * 31) + Float.hashCode(this.f307y1)) * 31) + Float.hashCode(this.f306x2)) * 31) + Float.hashCode(this.f308y2);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f305x1 + ", y1=" + this.f307y1 + ", x2=" + this.f306x2 + ", y2=" + this.f308y2 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveCurveTo */
    /* compiled from: PathNode.kt */
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f309x1;

        /* renamed from: x2 */
        private final float f310x2;

        /* renamed from: y1 */
        private final float f311y1;

        /* renamed from: y2 */
        private final float f312y2;

        public ReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.f309x1 = f;
            this.f311y1 = f2;
            this.f310x2 = f3;
            this.f312y2 = f4;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveCurveTo.f309x1;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveCurveTo.f311y1;
            }
            if ((i & 4) != 0) {
                f3 = reflectiveCurveTo.f310x2;
            }
            if ((i & 8) != 0) {
                f4 = reflectiveCurveTo.f312y2;
            }
            return reflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.f309x1;
        }

        public final float component2() {
            return this.f311y1;
        }

        public final float component3() {
            return this.f310x2;
        }

        public final float component4() {
            return this.f312y2;
        }

        public final ReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new ReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            if (Float.compare(this.f309x1, reflectiveCurveTo.f309x1) == 0 && Float.compare(this.f311y1, reflectiveCurveTo.f311y1) == 0 && Float.compare(this.f310x2, reflectiveCurveTo.f310x2) == 0 && Float.compare(this.f312y2, reflectiveCurveTo.f312y2) == 0) {
                return true;
            }
            return false;
        }

        public final float getX1() {
            return this.f309x1;
        }

        public final float getX2() {
            return this.f310x2;
        }

        public final float getY1() {
            return this.f311y1;
        }

        public final float getY2() {
            return this.f312y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f309x1) * 31) + Float.hashCode(this.f311y1)) * 31) + Float.hashCode(this.f310x2)) * 31) + Float.hashCode(this.f312y2);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f309x1 + ", y1=" + this.f311y1 + ", x2=" + this.f310x2 + ", y2=" + this.f312y2 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$ReflectiveQuadTo */
    /* compiled from: PathNode.kt */
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x */
        private final float f313x;

        /* renamed from: y */
        private final float f314y;

        public ReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f313x = f;
            this.f314y = f2;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = reflectiveQuadTo.f313x;
            }
            if ((i & 2) != 0) {
                f2 = reflectiveQuadTo.f314y;
            }
            return reflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f313x;
        }

        public final float component2() {
            return this.f314y;
        }

        public final ReflectiveQuadTo copy(float f, float f2) {
            return new ReflectiveQuadTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            if (Float.compare(this.f313x, reflectiveQuadTo.f313x) == 0 && Float.compare(this.f314y, reflectiveQuadTo.f314y) == 0) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f313x;
        }

        public final float getY() {
            return this.f314y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f313x) * 31) + Float.hashCode(this.f314y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f313x + ", y=" + this.f314y + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeArcTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public RelativeArcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f2;
            this.theta = f3;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z2;
            this.arcStartDx = f4;
            this.arcStartDy = f5;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i & 2) != 0) {
                f2 = relativeArcTo.verticalEllipseRadius;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = relativeArcTo.theta;
            }
            float f7 = f3;
            if ((i & 8) != 0) {
                z = relativeArcTo.isMoreThanHalf;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = relativeArcTo.isPositiveArc;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                f4 = relativeArcTo.arcStartDx;
            }
            float f8 = f4;
            if ((i & 64) != 0) {
                f5 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f, f6, f7, z3, z4, f8, f5);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            return new RelativeArcTo(f, f2, f3, z, z2, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            if (Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0) {
                return true;
            }
            return false;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            int hashCode = ((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31;
            boolean z = this.isMoreThanHalf;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isPositiveArc;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeCurveTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
            this.dx3 = f5;
            this.dy3 = f6;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeCurveTo.dy1;
            }
            float f7 = f2;
            if ((i & 4) != 0) {
                f3 = relativeCurveTo.dx2;
            }
            float f8 = f3;
            if ((i & 8) != 0) {
                f4 = relativeCurveTo.dy2;
            }
            float f9 = f4;
            if ((i & 16) != 0) {
                f5 = relativeCurveTo.dx3;
            }
            float f10 = f5;
            if ((i & 32) != 0) {
                f6 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f, f7, f8, f9, f10, f6);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f, float f2, float f3, float f4, float f5, float f6) {
            return new RelativeCurveTo(f, f2, f3, f4, f5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            if (Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeHorizontalTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: dx */
        private final float f315dx;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f315dx = f;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeHorizontalTo.f315dx;
            }
            return relativeHorizontalTo.copy(f);
        }

        public final float component1() {
            return this.f315dx;
        }

        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RelativeHorizontalTo) && Float.compare(this.f315dx, ((RelativeHorizontalTo) obj).f315dx) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f315dx;
        }

        public int hashCode() {
            return Float.hashCode(this.f315dx);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f315dx + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeLineTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: dx */
        private final float f316dx;

        /* renamed from: dy */
        private final float f317dy;

        public RelativeLineTo(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f316dx = f;
            this.f317dy = f2;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeLineTo.f316dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeLineTo.f317dy;
            }
            return relativeLineTo.copy(f, f2);
        }

        public final float component1() {
            return this.f316dx;
        }

        public final float component2() {
            return this.f317dy;
        }

        public final RelativeLineTo copy(float f, float f2) {
            return new RelativeLineTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            if (Float.compare(this.f316dx, relativeLineTo.f316dx) == 0 && Float.compare(this.f317dy, relativeLineTo.f317dy) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f316dx;
        }

        public final float getDy() {
            return this.f317dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f316dx) * 31) + Float.hashCode(this.f317dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f316dx + ", dy=" + this.f317dy + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeMoveTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: dx */
        private final float f318dx;

        /* renamed from: dy */
        private final float f319dy;

        public RelativeMoveTo(float f, float f2) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f318dx = f;
            this.f319dy = f2;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeMoveTo.f318dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeMoveTo.f319dy;
            }
            return relativeMoveTo.copy(f, f2);
        }

        public final float component1() {
            return this.f318dx;
        }

        public final float component2() {
            return this.f319dy;
        }

        public final RelativeMoveTo copy(float f, float f2) {
            return new RelativeMoveTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            if (Float.compare(this.f318dx, relativeMoveTo.f318dx) == 0 && Float.compare(this.f319dy, relativeMoveTo.f319dy) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f318dx;
        }

        public final float getDy() {
            return this.f319dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f318dx) * 31) + Float.hashCode(this.f319dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f318dx + ", dy=" + this.f319dy + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeQuadTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f, float f2, float f3, float f4) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeQuadTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeQuadTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeQuadTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f, float f2, float f3, float f4) {
            return new RelativeQuadTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            if (Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveCurveTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f, float f2, float f3, float f4) {
            super(true, false, 2, (DefaultConstructorMarker) null);
            this.dx1 = f;
            this.dy1 = f2;
            this.dx2 = f3;
            this.dy2 = f4;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveCurveTo.dx1;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveCurveTo.dy1;
            }
            if ((i & 4) != 0) {
                f3 = relativeReflectiveCurveTo.dx2;
            }
            if ((i & 8) != 0) {
                f4 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f, f2, f3, f4);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f, float f2, float f3, float f4) {
            return new RelativeReflectiveCurveTo(f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            if (Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeReflectiveQuadTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: dx */
        private final float f320dx;

        /* renamed from: dy */
        private final float f321dy;

        public RelativeReflectiveQuadTo(float f, float f2) {
            super(false, true, 1, (DefaultConstructorMarker) null);
            this.f320dx = f;
            this.f321dy = f2;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeReflectiveQuadTo.f320dx;
            }
            if ((i & 2) != 0) {
                f2 = relativeReflectiveQuadTo.f321dy;
            }
            return relativeReflectiveQuadTo.copy(f, f2);
        }

        public final float component1() {
            return this.f320dx;
        }

        public final float component2() {
            return this.f321dy;
        }

        public final RelativeReflectiveQuadTo copy(float f, float f2) {
            return new RelativeReflectiveQuadTo(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            if (Float.compare(this.f320dx, relativeReflectiveQuadTo.f320dx) == 0 && Float.compare(this.f321dy, relativeReflectiveQuadTo.f321dy) == 0) {
                return true;
            }
            return false;
        }

        public final float getDx() {
            return this.f320dx;
        }

        public final float getDy() {
            return this.f321dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f320dx) * 31) + Float.hashCode(this.f321dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f320dx + ", dy=" + this.f321dy + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$RelativeVerticalTo */
    /* compiled from: PathNode.kt */
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: dy */
        private final float f322dy;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f322dy = f;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = relativeVerticalTo.f322dy;
            }
            return relativeVerticalTo.copy(f);
        }

        public final float component1() {
            return this.f322dy;
        }

        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof RelativeVerticalTo) && Float.compare(this.f322dy, ((RelativeVerticalTo) obj).f322dy) == 0) {
                return true;
            }
            return false;
        }

        public final float getDy() {
            return this.f322dy;
        }

        public int hashCode() {
            return Float.hashCode(this.f322dy);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f322dy + ')';
        }
    }

    @Immutable
    /* renamed from: androidx.compose.ui.graphics.vector.PathNode$VerticalTo */
    /* compiled from: PathNode.kt */
    public static final class VerticalTo extends PathNode {

        /* renamed from: y */
        private final float f323y;

        public VerticalTo(float f) {
            super(false, false, 3, (DefaultConstructorMarker) null);
            this.f323y = f;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = verticalTo.f323y;
            }
            return verticalTo.copy(f);
        }

        public final float component1() {
            return this.f323y;
        }

        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof VerticalTo) && Float.compare(this.f323y, ((VerticalTo) obj).f323y) == 0) {
                return true;
            }
            return false;
        }

        public final float getY() {
            return this.f323y;
        }

        public int hashCode() {
            return Float.hashCode(this.f323y);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f323y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    private PathNode(boolean z, boolean z2) {
        this.isCurve = z;
        this.isQuad = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNode(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }
}
