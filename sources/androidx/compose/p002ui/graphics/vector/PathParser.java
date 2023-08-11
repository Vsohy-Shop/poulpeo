package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,645:1\n107#2:646\n79#2,22:647\n33#3,6:669\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n81#1:646\n81#1:647,22\n112#1:669,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathParser */
/* compiled from: PathParser.kt */
public final class PathParser {
    private final PathPoint ctrlPoint = new PathPoint(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    private final PathPoint currentPoint = new PathPoint(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    private final List<PathNode> nodes = new ArrayList();
    private final PathPoint reflectiveCtrlPoint = new PathPoint(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
    private final PathPoint segmentPoint = new PathPoint(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);

    /* renamed from: androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult */
    /* compiled from: PathParser.kt */
    private static final class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        public ExtractFloatResult() {
            this(0, false, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ExtractFloatResult copy$default(ExtractFloatResult extractFloatResult, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = extractFloatResult.endPosition;
            }
            if ((i2 & 2) != 0) {
                z = extractFloatResult.endWithNegativeOrDot;
            }
            return extractFloatResult.copy(i, z);
        }

        public final int component1() {
            return this.endPosition;
        }

        public final boolean component2() {
            return this.endWithNegativeOrDot;
        }

        public final ExtractFloatResult copy(int i, boolean z) {
            return new ExtractFloatResult(i, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtractFloatResult)) {
                return false;
            }
            ExtractFloatResult extractFloatResult = (ExtractFloatResult) obj;
            if (this.endPosition == extractFloatResult.endPosition && this.endWithNegativeOrDot == extractFloatResult.endWithNegativeOrDot) {
                return true;
            }
            return false;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.endPosition) * 31;
            boolean z = this.endWithNegativeOrDot;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }

        public ExtractFloatResult(int i, boolean z) {
            this.endPosition = i;
            this.endWithNegativeOrDot = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExtractFloatResult(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.PathParser$PathPoint */
    /* compiled from: PathParser.kt */
    private static final class PathPoint {

        /* renamed from: x */
        private float f324x;

        /* renamed from: y */
        private float f325y;

        public PathPoint() {
            this(0.0f, 0.0f, 3, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PathPoint copy$default(PathPoint pathPoint, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pathPoint.f324x;
            }
            if ((i & 2) != 0) {
                f2 = pathPoint.f325y;
            }
            return pathPoint.copy(f, f2);
        }

        public final float component1() {
            return this.f324x;
        }

        public final float component2() {
            return this.f325y;
        }

        public final PathPoint copy(float f, float f2) {
            return new PathPoint(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PathPoint)) {
                return false;
            }
            PathPoint pathPoint = (PathPoint) obj;
            if (Float.compare(this.f324x, pathPoint.f324x) == 0 && Float.compare(this.f325y, pathPoint.f325y) == 0) {
                return true;
            }
            return false;
        }

        public final float getX() {
            return this.f324x;
        }

        public final float getY() {
            return this.f325y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f324x) * 31) + Float.hashCode(this.f325y);
        }

        public final void reset() {
            this.f324x = 0.0f;
            this.f325y = 0.0f;
        }

        public final void setX(float f) {
            this.f324x = f;
        }

        public final void setY(float f) {
            this.f325y = f;
        }

        public String toString() {
            return "PathPoint(x=" + this.f324x + ", y=" + this.f325y + ')';
        }

        public PathPoint(float f, float f2) {
            this.f324x = f;
            this.f325y = f2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PathPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    private final void addNode(char c, float[] fArr) {
        this.nodes.addAll(PathNodeKt.toPathNodes(c, fArr));
    }

    private final void arcTo(PathNode.ArcTo arcTo, Path path) {
        drawArc(path, (double) this.currentPoint.getX(), (double) this.currentPoint.getY(), (double) arcTo.getArcStartX(), (double) arcTo.getArcStartY(), (double) arcTo.getHorizontalEllipseRadius(), (double) arcTo.getVerticalEllipseRadius(), (double) arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
        this.currentPoint.setX(arcTo.getArcStartX());
        this.currentPoint.setY(arcTo.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ((double) ceil);
        double d20 = d5;
        double d21 = d18;
        double d22 = d15;
        int i = 0;
        double d23 = d6;
        double d24 = d8;
        while (i < ceil) {
            double d25 = d24 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d24;
            double tan = Math.tan(d30 / ((double) 2));
            double d31 = d11;
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            path.cubicTo((float) (d20 + (d22 * sin4)), (float) (d23 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d24 = d25;
            d21 = d29;
            d11 = d31;
            d22 = d28;
            cos = cos;
            ceil = i2;
            d23 = d27;
            d10 = d3;
        }
    }

    private final void close(Path path) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        path.close();
        path.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            float[] unused = C12708o.m28339f(fArr, fArr2, 0, i, min + i);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    private final void curveTo(PathNode.CurveTo curveTo, Path path) {
        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
        this.ctrlPoint.setX(curveTo.getX2());
        this.ctrlPoint.setY(curveTo.getY2());
        this.currentPoint.setX(curveTo.getX3());
        this.currentPoint.setY(curveTo.getY3());
    }

    private final void drawArc(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        boolean z3;
        double d8;
        double d9;
        boolean z4;
        double d10 = d;
        double d11 = d3;
        boolean z5 = z2;
        double radians = toRadians(d7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = ((d10 * cos) + (d2 * sin)) / d5;
        double d13 = (((-d10) * sin) + (d2 * cos)) / d6;
        double d14 = ((d11 * cos) + (d4 * sin)) / d5;
        double d15 = (((-d11) * sin) + (d4 * cos)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (double) 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d16 * d16) + (d17 * d17);
        if (d21 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d21) / 1.99999d));
                boolean z6 = z5;
                drawArc(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d16 * sqrt2;
            double d24 = sqrt2 * d17;
            boolean z7 = z2;
            if (z == z7) {
                d9 = d19 - d24;
                d8 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d8 = d20 - d23;
            }
            double atan2 = Math.atan2(d13 - d8, d12 - d9);
            double atan22 = Math.atan2(d15 - d8, d14 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z7 != z4) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d9 * d5;
            double d26 = d8 * d6;
            arcToBezier(path, (d25 * cos) - (d26 * sin), (d25 * sin) + (d26 * cos), d5, d6, d, d2, radians, atan2, atan22);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[LOOP:0: B:1:0x0008->B:31:0x0051, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[EDGE_INSN: B:35:0x0054->B:32:0x0054 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void extract(java.lang.String r9, int r10, androidx.compose.p002ui.graphics.vector.PathParser.ExtractFloatResult r11) {
        /*
            r8 = this;
            r0 = 0
            r11.setEndWithNegativeOrDot(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L_0x0008:
            int r5 = r9.length()
            if (r1 >= r5) goto L_0x0054
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L_0x0019
        L_0x0017:
            r6 = r7
            goto L_0x001f
        L_0x0019:
            r6 = 44
            if (r5 != r6) goto L_0x001e
            goto L_0x0017
        L_0x001e:
            r6 = r0
        L_0x001f:
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r2 = r0
            r4 = r7
            goto L_0x004e
        L_0x0024:
            r6 = 45
            if (r5 != r6) goto L_0x0030
            if (r1 == r10) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            r11.setEndWithNegativeOrDot(r7)
            goto L_0x0021
        L_0x0030:
            r2 = 46
            if (r5 != r2) goto L_0x003d
            if (r3 != 0) goto L_0x0039
            r2 = r0
            r3 = r7
            goto L_0x004e
        L_0x0039:
            r11.setEndWithNegativeOrDot(r7)
            goto L_0x0021
        L_0x003d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L_0x0043
        L_0x0041:
            r2 = r7
            goto L_0x0049
        L_0x0043:
            r2 = 69
            if (r5 != r2) goto L_0x0048
            goto L_0x0041
        L_0x0048:
            r2 = r0
        L_0x0049:
            if (r2 == 0) goto L_0x004d
            r2 = r7
            goto L_0x004e
        L_0x004d:
            r2 = r0
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x0054:
            r11.setEndPosition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.vector.PathParser.extract(java.lang.String, int, androidx.compose.ui.graphics.vector.PathParser$ExtractFloatResult):void");
    }

    private final float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        ExtractFloatResult extractFloatResult = new ExtractFloatResult(0, false, 3, (DefaultConstructorMarker) null);
        int length = str.length();
        int i = 1;
        int i2 = 0;
        while (i < length) {
            extract(str, i, extractFloatResult);
            int endPosition = extractFloatResult.getEndPosition();
            if (i < endPosition) {
                String substring = str.substring(i, endPosition);
                C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i2] = Float.parseFloat(substring);
                i2++;
            }
            if (extractFloatResult.getEndWithNegativeOrDot()) {
                i = endPosition;
            } else {
                i = endPosition + 1;
            }
        }
        return copyOfRange(fArr, 0, i2);
    }

    private final void horizontalTo(PathNode.HorizontalTo horizontalTo, Path path) {
        path.lineTo(horizontalTo.getX(), this.currentPoint.getY());
        this.currentPoint.setX(horizontalTo.getX());
    }

    private final void lineTo(PathNode.LineTo lineTo, Path path) {
        path.lineTo(lineTo.getX(), lineTo.getY());
        this.currentPoint.setX(lineTo.getX());
        this.currentPoint.setY(lineTo.getY());
    }

    private final void moveTo(PathNode.MoveTo moveTo, Path path) {
        this.currentPoint.setX(moveTo.getX());
        this.currentPoint.setY(moveTo.getY());
        path.moveTo(moveTo.getX(), moveTo.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    private final void quadTo(PathNode.QuadTo quadTo, Path path) {
        path.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
        this.ctrlPoint.setX(quadTo.getX1());
        this.ctrlPoint.setY(quadTo.getY1());
        this.currentPoint.setX(quadTo.getX2());
        this.currentPoint.setY(quadTo.getY2());
    }

    private final void reflectiveCurveTo(PathNode.ReflectiveCurveTo reflectiveCurveTo, boolean z, Path path) {
        if (z) {
            float f = (float) 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
        this.ctrlPoint.setX(reflectiveCurveTo.getX1());
        this.ctrlPoint.setY(reflectiveCurveTo.getY1());
        this.currentPoint.setX(reflectiveCurveTo.getX2());
        this.currentPoint.setY(reflectiveCurveTo.getY2());
    }

    private final void reflectiveQuadTo(PathNode.ReflectiveQuadTo reflectiveQuadTo, boolean z, Path path) {
        if (z) {
            float f = (float) 2;
            this.reflectiveCtrlPoint.setX((this.currentPoint.getX() * f) - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY((f * this.currentPoint.getY()) - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(reflectiveQuadTo.getX());
        this.currentPoint.setY(reflectiveQuadTo.getY());
    }

    private final void relativeArcTo(PathNode.RelativeArcTo relativeArcTo, Path path) {
        float arcStartDx = relativeArcTo.getArcStartDx() + this.currentPoint.getX();
        float arcStartDy = relativeArcTo.getArcStartDy() + this.currentPoint.getY();
        drawArc(path, (double) this.currentPoint.getX(), (double) this.currentPoint.getY(), (double) arcStartDx, (double) arcStartDy, (double) relativeArcTo.getHorizontalEllipseRadius(), (double) relativeArcTo.getVerticalEllipseRadius(), (double) relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
        this.currentPoint.setX(arcStartDx);
        this.currentPoint.setY(arcStartDy);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(PathNode.RelativeCurveTo relativeCurveTo, Path path) {
        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeCurveTo.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeCurveTo.getDy2());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeCurveTo.getDx3());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeCurveTo.getDy3());
    }

    private final void relativeHorizontalTo(PathNode.RelativeHorizontalTo relativeHorizontalTo, Path path) {
        path.relativeLineTo(relativeHorizontalTo.getDx(), 0.0f);
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeHorizontalTo.getDx());
    }

    private final void relativeLineTo(PathNode.RelativeLineTo relativeLineTo, Path path) {
        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeLineTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeLineTo.getDy());
    }

    private final void relativeMoveTo(PathNode.RelativeMoveTo relativeMoveTo, Path path) {
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeMoveTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeMoveTo.getDy());
        path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(PathNode.RelativeQuadTo relativeQuadTo, Path path) {
        path.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeQuadTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeQuadTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeQuadTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeQuadTo.getDy2());
    }

    private final void relativeReflectiveCurveTo(PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + relativeReflectiveCurveTo.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + relativeReflectiveCurveTo.getDy1());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveCurveTo.getDx2());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveCurveTo.getDy2());
    }

    private final void relativeReflectiveQuadTo(PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo, boolean z, Path path) {
        if (z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        } else {
            this.reflectiveCtrlPoint.reset();
        }
        path.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setX(pathPoint.getX() + relativeReflectiveQuadTo.getDx());
        PathPoint pathPoint2 = this.currentPoint;
        pathPoint2.setY(pathPoint2.getY() + relativeReflectiveQuadTo.getDy());
    }

    private final void relativeVerticalTo(PathNode.RelativeVerticalTo relativeVerticalTo, Path path) {
        path.relativeLineTo(0.0f, relativeVerticalTo.getDy());
        PathPoint pathPoint = this.currentPoint;
        pathPoint.setY(pathPoint.getY() + relativeVerticalTo.getDy());
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    private final double toRadians(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }

    private final void verticalTo(PathNode.VerticalTo verticalTo, Path path) {
        path.lineTo(this.currentPoint.getX(), verticalTo.getY());
        this.currentPoint.setY(verticalTo.getY());
    }

    public final PathParser addPathNodes(List<? extends PathNode> list) {
        C12775o.m28639i(list, "nodes");
        this.nodes.addAll(list);
        return this;
    }

    public final void clear() {
        this.nodes.clear();
    }

    public final PathParser parsePathString(String str) {
        boolean z;
        int i;
        boolean z2;
        C12775o.m28639i(str, "pathData");
        this.nodes.clear();
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            int nextStart = nextStart(str, i3);
            String substring = str.substring(i2, nextStart);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length) {
                if (!z3) {
                    i = i4;
                } else {
                    i = length;
                }
                if (C12775o.m28641k(substring.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i4++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i4, length + 1).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                addNode(obj.charAt(0), getFloats(obj));
            }
            i2 = nextStart;
            i3 = nextStart + 1;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            addNode(str.charAt(i2), new float[0]);
        }
        return this;
    }

    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    public final Path toPath(Path path) {
        C12775o.m28639i(path, TypedValues.AttributesType.S_TARGET);
        path.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List<PathNode> list = this.nodes;
        int size = list.size();
        PathNode pathNode = null;
        int i = 0;
        while (i < size) {
            PathNode pathNode2 = list.get(i);
            if (pathNode == null) {
                pathNode = pathNode2;
            }
            if (pathNode2 instanceof PathNode.Close) {
                close(path);
            } else if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                relativeMoveTo((PathNode.RelativeMoveTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.MoveTo) {
                moveTo((PathNode.MoveTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeLineTo) {
                relativeLineTo((PathNode.RelativeLineTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.LineTo) {
                lineTo((PathNode.LineTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                relativeHorizontalTo((PathNode.RelativeHorizontalTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                horizontalTo((PathNode.HorizontalTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                relativeVerticalTo((PathNode.RelativeVerticalTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.VerticalTo) {
                verticalTo((PathNode.VerticalTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                relativeCurveTo((PathNode.RelativeCurveTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.CurveTo) {
                curveTo((PathNode.CurveTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                C12775o.m28636f(pathNode);
                relativeReflectiveCurveTo((PathNode.RelativeReflectiveCurveTo) pathNode2, pathNode.isCurve(), path);
            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                C12775o.m28636f(pathNode);
                reflectiveCurveTo((PathNode.ReflectiveCurveTo) pathNode2, pathNode.isCurve(), path);
            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                relativeQuadTo((PathNode.RelativeQuadTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.QuadTo) {
                quadTo((PathNode.QuadTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                C12775o.m28636f(pathNode);
                relativeReflectiveQuadTo((PathNode.RelativeReflectiveQuadTo) pathNode2, pathNode.isQuad(), path);
            } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                C12775o.m28636f(pathNode);
                reflectiveQuadTo((PathNode.ReflectiveQuadTo) pathNode2, pathNode.isQuad(), path);
            } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                relativeArcTo((PathNode.RelativeArcTo) pathNode2, path);
            } else if (pathNode2 instanceof PathNode.ArcTo) {
                arcTo((PathNode.ArcTo) pathNode2, path);
            }
            i++;
            pathNode = pathNode2;
        }
        return path;
    }

    private final float toRadians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}
