package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Path;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1 */
/* compiled from: CanvasDrawScope.kt */
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {
    final /* synthetic */ DrawContext $this_asDrawTransform;

    CanvasDrawScopeKt$asDrawTransform$1(DrawContext drawContext) {
        this.$this_asDrawTransform = drawContext;
    }

    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void m36180clipPathmtrdDE(Path path, int i) {
        C12775o.m28639i(path, "path");
        this.$this_asDrawTransform.getCanvas().m35636clipPathmtrdDE(path, i);
    }

    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void m36181clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.$this_asDrawTransform.getCanvas().m35637clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public long m36182getCenterF1C5BW0() {
        return SizeKt.m35501getCenteruvyYCjk(m36183getSizeNHjbRc());
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m36183getSizeNHjbRc() {
        return this.$this_asDrawTransform.m36217getSizeNHjbRc();
    }

    public void inset(float f, float f2, float f3, float f4) {
        boolean z;
        Canvas canvas = this.$this_asDrawTransform.getCanvas();
        DrawContext drawContext = this.$this_asDrawTransform;
        long Size = SizeKt.Size(Size.m35491getWidthimpl(m36183getSizeNHjbRc()) - (f3 + f), Size.m35488getHeightimpl(m36183getSizeNHjbRc()) - (f4 + f2));
        if (Size.m35491getWidthimpl(Size) < 0.0f || Size.m35488getHeightimpl(Size) < 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            drawContext.m36218setSizeuvyYCjk(Size);
            canvas.translate(f, f2);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
    public void m36184rotateUv8p0NA(float f, long j) {
        Canvas canvas = this.$this_asDrawTransform.getCanvas();
        canvas.translate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        canvas.rotate(f);
        canvas.translate(-Offset.m35422getXimpl(j), -Offset.m35423getYimpl(j));
    }

    /* renamed from: scale-0AR0LA0  reason: not valid java name */
    public void m36185scale0AR0LA0(float f, float f2, long j) {
        Canvas canvas = this.$this_asDrawTransform.getCanvas();
        canvas.translate(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
        canvas.scale(f, f2);
        canvas.translate(-Offset.m35422getXimpl(j), -Offset.m35423getYimpl(j));
    }

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    public void m36186transform58bKbWc(float[] fArr) {
        C12775o.m28639i(fArr, "matrix");
        this.$this_asDrawTransform.getCanvas().m35639concat58bKbWc(fArr);
    }

    public void translate(float f, float f2) {
        this.$this_asDrawTransform.getCanvas().translate(f, f2);
    }
}
