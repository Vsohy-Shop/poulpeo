package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1 */
/* compiled from: RectangleShape.kt */
public final class RectangleShapeKt$RectangleShape$1 implements Shape {
    RectangleShapeKt$RectangleShape$1() {
    }

    public String toString() {
        return "RectangleShape";
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public Outline.Rectangle m35994createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        return new Outline.Rectangle(SizeKt.m35512toRectuvyYCjk(j));
    }
}
