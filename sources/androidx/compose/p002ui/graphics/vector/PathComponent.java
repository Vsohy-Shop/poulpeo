package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.PathMeasure;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;

@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathComponent */
/* compiled from: Vector.kt */
public final class PathComponent extends VNode {
    private Brush fill;
    private float fillAlpha = 1.0f;
    private boolean isPathDirty = true;
    private boolean isStrokeDirty = true;
    private boolean isTrimPathDirty = true;
    private String name = "";
    private final PathParser parser = new PathParser();
    private final Path path = AndroidPath_androidKt.Path();
    private List<? extends PathNode> pathData = VectorKt.getEmptyPath();
    private int pathFillType = VectorKt.getDefaultFillType();
    private final Lazy pathMeasure$delegate = C11901h.m25689a(C11904j.NONE, PathComponent$pathMeasure$2.INSTANCE);
    private final Path renderPath = AndroidPath_androidKt.Path();
    private Brush stroke;
    private float strokeAlpha = 1.0f;
    private int strokeLineCap = VectorKt.getDefaultStrokeLineCap();
    private int strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
    private float strokeLineMiter = 4.0f;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd = 1.0f;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super((DefaultConstructorMarker) null);
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        this.parser.clear();
        this.path.reset();
        this.parser.addPathNodes(this.pathData).toPath(this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        boolean z;
        boolean z2;
        this.renderPath.reset();
        if (this.trimPathStart == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.trimPathEnd == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Path.m35948addPathUv8p0NA$default(this.renderPath, this.path, 0, 2, (Object) null);
                return;
            }
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f = this.trimPathStart;
        float f2 = this.trimPathOffset;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.trimPathEnd + f2) % 1.0f) * length;
        if (f3 > f4) {
            getPathMeasure().getSegment(f3, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f4, this.renderPath, true);
            return;
        }
        getPathMeasure().getSegment(f3, f4, this.renderPath, true);
    }

    public void draw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m36245drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                stroke2 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, (PathEffect) null, 16, (DefaultConstructorMarker) null);
                this.strokeStyle = stroke2;
                this.isStrokeDirty = false;
            }
            Stroke stroke3 = stroke2;
            DrawScope.m36245drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke3, (ColorFilter) null, 0, 48, (Object) null);
        }
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m36379getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m36380getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m36381getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.fillAlpha = f;
        invalidate();
    }

    public final void setName(String str) {
        C12775o.m28639i(str, "value");
        this.name = str;
        invalidate();
    }

    public final void setPathData(List<? extends PathNode> list) {
        C12775o.m28639i(list, "value");
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U  reason: not valid java name */
    public final void m36382setPathFillTypeoQ8Xj4U(int i) {
        this.pathFillType = i;
        this.renderPath.m35952setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStroke(Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.strokeAlpha = f;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE  reason: not valid java name */
    public final void m36383setStrokeLineCapBeK7IIE(int i) {
        this.strokeLineCap = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ  reason: not valid java name */
    public final void m36384setStrokeLineJoinWw9F2mQ(int i) {
        this.strokeLineJoin = i;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.strokeLineMiter = f;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.strokeLineWidth = f;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        boolean z;
        if (this.trimPathEnd == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathEnd = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    public final void setTrimPathOffset(float f) {
        boolean z;
        if (this.trimPathOffset == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathOffset = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    public final void setTrimPathStart(float f) {
        boolean z;
        if (this.trimPathStart == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.trimPathStart = f;
            this.isTrimPathDirty = true;
            invalidate();
        }
    }

    public String toString() {
        return this.path.toString();
    }
}
