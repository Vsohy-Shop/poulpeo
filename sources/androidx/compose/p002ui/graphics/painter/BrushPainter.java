package androidx.compose.p002ui.graphics.painter;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.painter.BrushPainter */
/* compiled from: BrushPainter.kt */
public final class BrushPainter extends Painter {
    private float alpha = 1.0f;
    private final Brush brush;
    private ColorFilter colorFilter;

    public BrushPainter(Brush brush2) {
        C12775o.m28639i(brush2, "brush");
        this.brush = brush2;
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter2) {
        this.colorFilter = colorFilter2;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BrushPainter) && C12775o.m28634d(this.brush, ((BrushPainter) obj).brush)) {
            return true;
        }
        return false;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m36364getIntrinsicSizeNHjbRc() {
        return this.brush.m35609getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "<this>");
        DrawScope.m36249drawRectAsUm42w$default(drawScope, this.brush, 0, 0, this.alpha, (DrawStyle) null, this.colorFilter, 0, 86, (Object) null);
    }

    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}
