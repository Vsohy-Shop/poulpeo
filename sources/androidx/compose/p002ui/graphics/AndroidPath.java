package androidx.compose.p002ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.graphics.PathOperation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,235:1\n35#2,5:236\n35#2,5:241\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:236,5\n211#1:241,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidPath */
/* compiled from: AndroidPath.android.kt */
public final class AndroidPath implements Path {
    private final Path internalPath;
    private final Matrix mMatrix;
    private final float[] radii;
    private final RectF rectF;

    public AndroidPath() {
        this((Path) null, 1, (DefaultConstructorMarker) null);
    }

    private final boolean _rectIsValid(Rect rect) {
        if (!(!Float.isNaN(rect.getLeft()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(rect.getTop()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(rect.getRight()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(rect.getBottom())) {
            return true;
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    public void addArc(Rect rect, float f, float f2) {
        C12775o.m28639i(rect, "oval");
        if (_rectIsValid(rect)) {
            this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            this.internalPath.addArc(this.rectF, f, f2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void addArcRad(Rect rect, float f, float f2) {
        C12775o.m28639i(rect, "oval");
        addArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    public void addOval(Rect rect) {
        C12775o.m28639i(rect, "oval");
        this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.internalPath.addOval(this.rectF, Path.Direction.CCW);
    }

    /* renamed from: addPath-Uv8p0NA  reason: not valid java name */
    public void m35553addPathUv8p0NA(Path path, long j) {
        C12775o.m28639i(path, "path");
        Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void addRect(Rect rect) {
        C12775o.m28639i(rect, "rect");
        if (_rectIsValid(rect)) {
            this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            this.internalPath.addRect(this.rectF, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void addRoundRect(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "roundRect");
        this.rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        this.radii[0] = CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs());
        this.radii[1] = CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs());
        this.radii[2] = CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs());
        this.radii[3] = CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs());
        this.radii[4] = CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs());
        this.radii[5] = CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs());
        this.radii[6] = CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs());
        this.radii[7] = CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs());
        this.internalPath.addRoundRect(this.rectF, this.radii, Path.Direction.CCW);
    }

    public void arcTo(Rect rect, float f, float f2, boolean z) {
        C12775o.m28639i(rect, "rect");
        this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.internalPath.arcTo(this.rectF, f, f2, z);
    }

    public void close() {
        this.internalPath.close();
    }

    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public Rect getBounds() {
        this.internalPath.computeBounds(this.rectF, true);
        RectF rectF2 = this.rectF;
        return new Rect(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
    }

    /* renamed from: getFillType-Rg-k1Os  reason: not valid java name */
    public int m35554getFillTypeRgk1Os() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m35964getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m35965getNonZeroRgk1Os();
    }

    public final Path getInternalPath() {
        return this.internalPath;
    }

    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    public void lineTo(float f, float f2) {
        this.internalPath.lineTo(f, f2);
    }

    public void moveTo(float f, float f2) {
        this.internalPath.moveTo(f, f2);
    }

    /* renamed from: op-N5in7k0  reason: not valid java name */
    public boolean m35555opN5in7k0(Path path, Path path2, int i) {
        Path.Op op;
        C12775o.m28639i(path, "path1");
        C12775o.m28639i(path2, "path2");
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m35971equalsimpl0(i, companion.m35975getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m35971equalsimpl0(i, companion.m35976getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m35971equalsimpl0(i, companion.m35977getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (PathOperation.m35971equalsimpl0(i, companion.m35978getUnionb3I0S0c())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path3 = this.internalPath;
        if (path instanceof AndroidPath) {
            Path internalPath2 = ((AndroidPath) path).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path3.op(internalPath2, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.quadTo(f, f2, f3, f4);
    }

    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public void relativeLineTo(float f, float f2) {
        this.internalPath.rLineTo(f, f2);
    }

    public void relativeMoveTo(float f, float f2) {
        this.internalPath.rMoveTo(f, f2);
    }

    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.rQuadTo(f, f2, f3, f4);
    }

    public void reset() {
        this.internalPath.reset();
    }

    /* renamed from: setFillType-oQ8Xj4U  reason: not valid java name */
    public void m35556setFillTypeoQ8Xj4U(int i) {
        Path.FillType fillType;
        Path path = this.internalPath;
        if (PathFillType.m35960equalsimpl0(i, PathFillType.Companion.m35964getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public void m35557translatek4lQ0M(long j) {
        this.mMatrix.reset();
        this.mMatrix.setTranslate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        this.internalPath.transform(this.mMatrix);
    }

    public AndroidPath(Path path) {
        C12775o.m28639i(path, "internalPath");
        this.internalPath = path;
        this.rectF = new RectF();
        this.radii = new float[8];
        this.mMatrix = new Matrix();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidPath(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }
}
