package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.graphics.Canvas;

/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1 */
/* compiled from: CanvasDrawScope.kt */
public final class CanvasDrawScope$drawContext$1 implements DrawContext {
    final /* synthetic */ CanvasDrawScope this$0;
    private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

    CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.this$0 = canvasDrawScope;
    }

    public Canvas getCanvas() {
        return this.this$0.getDrawParams().getCanvas();
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m36178getSizeNHjbRc() {
        return this.this$0.getDrawParams().m36176getSizeNHjbRc();
    }

    public DrawTransform getTransform() {
        return this.transform;
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public void m36179setSizeuvyYCjk(long j) {
        this.this$0.getDrawParams().m36177setSizeuvyYCjk(j);
    }
}
