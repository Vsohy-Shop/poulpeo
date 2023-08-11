package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.OutlineKt;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathOperation;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;

@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,547:1\n1#2:548\n426#3:549\n400#3:550\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n350#1:549\n350#1:550\n*E\n"})
/* compiled from: AppBar.kt */
final class BottomAppBarCutoutShape implements Shape {
    private final Shape cutoutShape;
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(Shape shape, FabPlacement fabPlacement2) {
        C12775o.m28639i(shape, "cutoutShape");
        C12775o.m28639i(fabPlacement2, "fabPlacement");
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement2;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float r0 = density.m38449toPx0680j_4(AppBarKt.BottomAppBarCutoutOffset);
        float f = ((float) 2) * r0;
        long Size = SizeKt.Size(((float) this.fabPlacement.getWidth()) + f, ((float) this.fabPlacement.getHeight()) + f);
        float left = ((float) this.fabPlacement.getLeft()) - r0;
        float r7 = left + Size.m35491getWidthimpl(Size);
        float r8 = Size.m35488getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.m36025createOutlinePq9zytI(Size, layoutDirection, density));
        path.m35953translatek4lQ0M(OffsetKt.Offset(left, -r8));
        if (C12775o.m28634d(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            addRoundedEdges(path, left, r7, r8, density.m38449toPx0680j_4(AppBarKt.BottomAppBarRoundedEdgeRadius), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) Math.sqrt((double) ((f3 * f3) - (f5 * f5))));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        C11906l<Float, Float> calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f6 - 1.0f, f5, f3);
        float floatValue = calculateRoundedEdgeIntercept.mo49109a().floatValue() + f3;
        float floatValue2 = calculateRoundedEdgeIntercept.mo49110b().floatValue() - f5;
        float f10 = f8 - f4;
        path.moveTo(f10, 0.0f);
        path.quadraticBezierTo(f8 - 1.0f, 0.0f, f + floatValue, floatValue2);
        path.lineTo(f2 - floatValue, floatValue2);
        path.quadraticBezierTo(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement2, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i & 2) != 0) {
            fabPlacement2 = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement2);
    }

    public final Shape component1() {
        return this.cutoutShape;
    }

    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    public final BottomAppBarCutoutShape copy(Shape shape, FabPlacement fabPlacement2) {
        C12775o.m28639i(shape, "cutoutShape");
        C12775o.m28639i(fabPlacement2, "fabPlacement");
        return new BottomAppBarCutoutShape(shape, fabPlacement2);
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public Outline m33893createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m35491getWidthimpl(j), Size.m35488getHeightimpl(j)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.m35951opN5in7k0(Path, Path2, PathOperation.Companion.m35975getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        if (C12775o.m28634d(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && C12775o.m28634d(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement)) {
            return true;
        }
        return false;
    }

    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
